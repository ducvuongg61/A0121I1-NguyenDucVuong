package model.service;

import model.bean.User;

import java.sql.SQLException;
import java.util.List;

public interface IUserDAO {
    public boolean deleteUser(int id) throws SQLException;

    public boolean updateUser(User user) throws SQLException;

    public List<User> selectAllUser() throws SQLException;

    public User selectUSer(int id) throws SQLException;

    public void insertUser(User user) throws SQLException;

    public User getUserById(int id) throws SQLException;

    public void insertUserStored(User user) throws SQLException;

    public void addUserTransaction(User user , int[] permission);

    public void insertUpdateWithoutTransactionEmployee() throws SQLException;

    public void insertUpdateTransactionEmployee() throws SQLException;
}
