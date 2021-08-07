import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DiscountServlet" , urlPatterns = "/discount")
public class DiscountServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float price = Float.parseFloat(request.getParameter("listPrice"));
        float discount = Float.parseFloat(request.getParameter("discountPercent"));

        float amount = (float) (price * discount * 0.01);
        float result = price - amount;

        String productName = request.getParameter("productName");
//        request.setAttribute("amount" , amount);
//        request.setAttribute("price", result);

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h1> Product Name : " + productName +  " <h1>");
        writer.println("<h1> Discount Amount : " + amount +  " <h1>");
        writer.println("<h1> Discount Price : " + result + "</h1>");
        writer.println("</html>");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
