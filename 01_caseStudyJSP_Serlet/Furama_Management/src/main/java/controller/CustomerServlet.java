package controller;

import model.Customer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "CustomerServlet", urlPatterns = {"/customer"})
public class CustomerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create": {
                request.getRequestDispatcher("create_customer.jsp").forward(request, response);
            }
            default:
              //  List<Customer> customerList = iCustomerService.findAll();
             //   request.setAttribute("customerList", customerList);
                request.getRequestDispatcher("/display_customer.jsp").forward(request, response);
        }
    }
}