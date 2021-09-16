package model.service;

import model.bean.User;

import java.math.BigDecimal;
import java.sql.*;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class UserDAO implements IUserDAO {

    public static final String INSERT_USER = "INSERT INTO users (name , email , country) VALUE (?,?,?);";
    public static final String SELECT_USER_BY_ID = "SELECT  * FROM  users where id = ?;";
    public static final String SELECT_ALL_USER = "SELECT * FROM users;";
    public static final String UPDATE_USER = "UPDATE users SET name = ? , email = ? , country = ? WHERE  id = ?;";
    public static final String DELETE_USER = "DELETE FROM users WHERE id = ?;";
    public static final String INSERT_EMPLOYEE = "INSERT INTO EMPLOYEE (NAME , SALARY , CREATED_DATE) VALUE  (?,?,?);";
    public static final String UPDATE_EMPLOYEE = "UPDATE EMPLOYEE SET SALARY=? WHERE NAME=?;";
    public static final String DROP_EMPLOYEE = "DROP TABLE IF EXISTS EMPLOYEE";
    private static final String CREATE_EMPLOYEE = "CREATE TABLE EMPLOYEE" + "(" + " ID serial," + " NAME varchar(100) NOT NULL,"
            + " SALARY numeric(15, 2) NOT NULL," + " CREATED_DATE timestamp," + " PRIMARY KEY (ID)" + ")";

    public UserDAO() {
    }

    private String jdbcURL = "jdbc:mysql://localhost:3306/demo";
    private String jdbcUsername = "root";
    private String jdbcPassword = "123456";

    public Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    @Override
    public boolean deleteUser(int id) throws SQLException {
        boolean rowDelete;
        try (Connection connection = getConnection(); PreparedStatement preparedStatement = connection.prepareStatement(DELETE_USER)) {
            preparedStatement.setInt(1, id);
            rowDelete = preparedStatement.executeUpdate() > 0;
        }

        return rowDelete;
    }

    @Override
    public boolean updateUser(User user) throws SQLException {
        boolean rowUpdate;
        try (Connection connection = getConnection(); PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_USER)) {
            preparedStatement.setInt(4, user.getId());
            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getEmail());
            preparedStatement.setString(3, user.getCountry());
            rowUpdate = preparedStatement.executeUpdate() > 0;
        }

        return rowUpdate;
    }


    @Override
    public List<User> selectAllUser() throws SQLException {
        List<User> listUSer = new ArrayList<>();
        try (Connection connection = getConnection(); PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_USER)) {
            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                String country = rs.getString("country");
                listUSer.add(new User(id, name, email, country));
            }
        } catch (SQLException exception) {
            printSQLException(exception);
        }

        return listUSer;
    }

    @Override
    public User selectUSer(int id) throws SQLException {
        User user = null;
        try (Connection connection = getConnection(); PreparedStatement preparedStatement = connection.prepareStatement(SELECT_USER_BY_ID)) {
            preparedStatement.setInt(1, id);
            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                String name = rs.getString("name");
                String email = rs.getString("email");
                String country = rs.getString("country");
                user = new User(name, email, country);

            }
        } catch (SQLException exception) {
            printSQLException(exception);
        }
        return user;
    }

    @Override
    public void insertUser(User user) throws SQLException {
        System.out.println("INSERT INTO users" + "(name,email,country)VALUES" + "(?,?,?);");
        try (Connection connection = getConnection(); PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USER)) {
            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getEmail());
            preparedStatement.setString(3, user.getCountry());
            System.out.println(preparedStatement);
            preparedStatement.executeUpdate();
        } catch (SQLException exception) {
            printSQLException(exception);
        }
    }

    @Override
    public User getUserById(int id) throws SQLException {
        User user = null;
        String query = "call get_user_by_id(?);";
        try (Connection connection = getConnection(); CallableStatement callableStatement = connection.prepareCall(query)) {
            callableStatement.setInt(1, id);
            ResultSet rs = callableStatement.executeQuery();
            while (rs.next()) {
                String name = rs.getString("name");
                String email = rs.getString("email");
                String country = rs.getString("country");
                user = new User(name, email, country);
            }
        } catch (SQLException exception) {
            printSQLException(exception);
        }
        return user;
    }

    @Override
    public void insertUserStored(User user) throws SQLException {
        String query = "call insert_user(?,?,?);";
        try (Connection connection = getConnection(); CallableStatement callableStatement = connection.prepareCall(query)) {
            callableStatement.setString(1, user.getName());
            callableStatement.setString(2, user.getEmail());
            callableStatement.setString(3, user.getCountry());
            System.out.println(callableStatement);
            callableStatement.executeUpdate();
        } catch (SQLException exception) {
            printSQLException(exception);
        }
    }

    @Override
    public void addUserTransaction(User user, int[] permission) {
        Connection conn = null;
        PreparedStatement psst = null;
        PreparedStatement psstAssignment = null;
        ResultSet rs = null;
        try {
            conn = getConnection();
            conn.setAutoCommit(false);
            psst = conn.prepareStatement(INSERT_USER, Statement.RETURN_GENERATED_KEYS);
            psst.setString(1, user.getName());
            psst.setString(2, user.getEmail());
            psst.setString(3, user.getCountry());
            int rowAffected = psst.executeUpdate();
            rs = psst.getGeneratedKeys();
            int userId = 0;
            if (rs.next())
                userId = rs.getInt(1);
            if (rowAffected == 1) {
                String sqlPivot = "INSERT INTO user_permision(user_id,permision_id) " + "VALUES(?,?);";
                psstAssignment = conn.prepareStatement(sqlPivot);
                for (int permissionId : permission) {
                    psstAssignment.setInt(1, userId);
                    psstAssignment.setInt(2, permissionId);
                    psstAssignment.executeUpdate();
                }
                conn.commit();
            } else {
                conn.rollback();
            }
        } catch (SQLException ex) {
            // roll back the transaction
            try {
                if (conn != null)
                    conn.rollback();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
            System.out.println(ex.getMessage());
        } finally {
            try {
                if (rs != null) rs.close();
                if (psst != null) psst.close();
                if (psstAssignment != null) psstAssignment.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    @Override
    public void insertUpdateWithoutTransactionEmployee() throws SQLException {
        try (Connection connection = getConnection();
             Statement statement = connection.createStatement();
             PreparedStatement preparedStatementInsert = connection.prepareStatement(INSERT_EMPLOYEE);
             PreparedStatement preparedStatementUpdate = connection.prepareStatement(UPDATE_EMPLOYEE)) {
            statement.execute(DROP_EMPLOYEE);
            statement.execute(CREATE_EMPLOYEE);
            preparedStatementInsert.setString(1, "Quynh");
            preparedStatementInsert.setBigDecimal(2, new BigDecimal(10));
            preparedStatementInsert.setTimestamp(3, Timestamp.valueOf(LocalDateTime.now()));
            preparedStatementInsert.execute();

            preparedStatementInsert.setString(1, "Ngan");
            preparedStatementInsert.setBigDecimal(2, new BigDecimal(20));
            preparedStatementInsert.setTimestamp(3, Timestamp.valueOf(LocalDateTime.now()));
            preparedStatementInsert.execute();

            preparedStatementUpdate.setBigDecimal(2, new BigDecimal(999.99));
            preparedStatementUpdate.setString(2, "Quynh");
            preparedStatementUpdate.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void insertUpdateTransactionEmployee() {
        try (Connection conn = getConnection();
             Statement statement = conn.createStatement();
             PreparedStatement psInsert = conn.prepareStatement(INSERT_EMPLOYEE);
             PreparedStatement psUpdate = conn.prepareStatement(UPDATE_EMPLOYEE)) {
            statement.execute(DROP_EMPLOYEE);
            statement.execute(CREATE_EMPLOYEE);
            conn.setAutoCommit(false); // default true
            psInsert.setString(1, "Anh");
            psInsert.setBigDecimal(2, new BigDecimal(10));
            psInsert.setTimestamp(3, Timestamp.valueOf(LocalDateTime.now()));
            psInsert.execute();
            psInsert.setString(1, "Ha");
            psInsert.setBigDecimal(2, new BigDecimal(20));
            psInsert.setTimestamp(3, Timestamp.valueOf(LocalDateTime.now()));
            psInsert.execute();
//            psUpdate.setBigDecimal(2, new BigDecimal(999.99));
            psUpdate.setBigDecimal(1, new BigDecimal(999.99));
            psUpdate.setString(2, "Anh");
            psUpdate.execute();
            conn.commit();
            conn.setAutoCommit(true);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public List<User> selectByCountry(String ct) throws SQLException {
        User user = null;
        List<User> listUser = new ArrayList<>();
        try (Connection connection = getConnection(); PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM users WHERE country = ?;")) {
            preparedStatement.setString(1, ct);
            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                String country = rs.getString("country");
                user = new User(id, name, email, country);
                listUser.add(user);
            }
        }
        return listUser;
    }

    private void printSQLException(SQLException exception) {
        for (Throwable e : exception) {
            if (e instanceof SQLException) {
                System.out.println("SQLState : " + ((SQLException) exception).getSQLState());
                System.out.println("Error Code : " + ((SQLException) exception).getErrorCode());
                System.out.println("Message : " + ((SQLException) exception).getMessage());
                Throwable t = exception.getCause();
                while (t != null) {
                    t = t.getCause();
                }
            }
        }
    }
}
