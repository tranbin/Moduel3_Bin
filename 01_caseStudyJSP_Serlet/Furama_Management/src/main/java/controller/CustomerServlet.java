package controller;

import model.Customer;
import service.ICustomerService;
import service.impl.CustomerService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "CustomerServlet", urlPatterns = {"/customer"})
public class CustomerServlet extends HttpServlet {
    private ICustomerService iCustomerService = new CustomerService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create": {
                String customerId =request.getParameter("customerId");
                String customerTypeId =request.getParameter("customerTypeId");
                String customerName =request.getParameter("customerName");
                String customerBirthday =request.getParameter("customerBirthday");
                String customerGender =request.getParameter("customerGender");
                String customerIdCard =request.getParameter("customerIdCard");
                String customerPhone =request.getParameter("customerPhone");
                String customerEmail =request.getParameter("customerEmail");
                String customerAddress =request.getParameter("customerAddress");
                Customer customer = new Customer(Integer.parseInt(customerId),Integer.parseInt(customerTypeId),customerName,customerBirthday,Integer.parseInt(customerGender),customerIdCard,
                        customerPhone,customerEmail,customerAddress);
                iCustomerService.create(customer);
                List<Customer> customerList = iCustomerService.findAll();
                request.setAttribute("customerList",customerList);
                request.getRequestDispatcher("/customer/display_customer.jsp").forward(request,response);
                break;
            }
            case "update": {
                String customerId =request.getParameter("customerId");
                String customerTypeId =request.getParameter("customerTypeId");
                String customerName =request.getParameter("customerName");
                String customerBirthday =request.getParameter("customerBirthday");
                String customerGender =request.getParameter("customerGender");
                String customerIdCard =request.getParameter("customerIdCard");
                String customerPhone =request.getParameter("customerPhone");
                String customerEmail =request.getParameter("customerEmail");
                String customerAddress =request.getParameter("customerAddress");
                iCustomerService.save(customerId,customerTypeId,customerName,customerBirthday,customerGender,customerIdCard,customerPhone,customerEmail,customerAddress);
                response.sendRedirect("/customer");
                break;
            }
            case "delete": {
                String customerId = request.getParameter("customerId");
                iCustomerService.deleteById(customerId);
                List<Customer> customerList = iCustomerService.findAll();
                request.setAttribute("customerList", customerList);
                request.getRequestDispatcher("/customer/display_customer.jsp").forward(request, response);
                break;
            }
            case "search" :{
                String name = request.getParameter("customerName");
                List<Customer> customerList = iCustomerService.findByName(name);
                request.setAttribute("customerList", customerList);
                request.getRequestDispatcher("/customer/view_customer.jsp").forward(request, response);
                break;
            }
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create": {
                request.getRequestDispatcher("/customer/create_customer.jsp").forward(request, response);
                break;
            }
            case "search": {
                String name = request.getParameter("customerName");
                List<Customer> customerList = iCustomerService.findByName(name);
                request.setAttribute("customerList", customerList);
                request.getRequestDispatcher("/customer/search_customer.jsp").forward(request, response);
                break;
            }
            case "delete": {
                String id = request.getParameter("id");
                Customer customer = iCustomerService.findById(id);
                request.setAttribute("customer", customer);
                request.getRequestDispatcher("/customer/delete_customer.jsp").forward(request, response);
                break;
            }
            case "update": {
                String id = request.getParameter("customerId");
                Customer customer = iCustomerService.findById(id);
                request.setAttribute("customer", customer);
                request.getRequestDispatcher("/customer/update_customer.jsp").forward(request, response);
                break;
            }
            default:
                List<Customer> customerList = iCustomerService.findAll();
                request.setAttribute("customerList", customerList);
                request.getRequestDispatcher("/customer/display_customer.jsp").forward(request, response);
        }
    }
}