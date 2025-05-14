package lk.jiat.ee.web.servlet;

import jakarta.ejb.EJB;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lk.jiat.ee.ejb.remote.ProductService;

import java.io.IOException;

@WebServlet("/home")
public class Home extends HttpServlet {

    @EJB
    private ProductService productService;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.getWriter().println("<h1>Home</h1>");
        productService.getAllProducts().forEach(product -> {
            try {
                response.getWriter().write(product.getName()+"<br>");
            }catch (IOException e){
                throw new RuntimeException(e);
            }
        });
    }
}
