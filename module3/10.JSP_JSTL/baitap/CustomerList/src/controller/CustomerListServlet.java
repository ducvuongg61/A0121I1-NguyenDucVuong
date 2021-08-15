package controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CustomerListServlet", urlPatterns = "")
public class CustomerListServlet extends HttpServlet {

    private static List<Customer> customerList;

    @Override
    public void init() throws ServletException {
        customerList = new ArrayList<>();
        customerList.add(new Customer("Jack Ben Tre" , "24/06/1997" , "Ben Tre" , "a1.jpg" ));
        customerList.add(new Customer("Ngo Diec Pham" , "12/06/1998" , "China" , "a2.jpg" ));
        customerList.add(new Customer("Huan Hoa Hong" , "30/6/1898" , "Vung Tau" , "a3.jpg" ));
        customerList.add(new Customer("Phuong Tuan" , "15/09/1994" , "Ha Noi" , "a4.jpg" ));
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("customerList" , customerList);
        request.getRequestDispatcher("/customer/list.jsp").forward(request, response);  //chuyen huong kem data
    }
}
