package controller;

import model.customer.Customer;
import model.customer.CustomerType;
import repository.imp.CustomerTypeRepository;
import service.ICustomerService;
import service.imp.CustomerService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CustomerServlet", urlPatterns = "/customer")
public class CustomerServlet extends HttpServlet {
    private ICustomerService iCustomerService = new CustomerService();
    private CustomerTypeRepository customerTypeRepository = new CustomerTypeRepository();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create": {
                String id = request.getParameter("id");
                String name = request.getParameter("name");
                String dateOfBirth = request.getParameter("dateOfBirth");
                String gender = request.getParameter("gender");
                String idCard = request.getParameter("idCard");
                String phone = request.getParameter("phone");
                String email = request.getParameter("email");
                String address = request.getParameter("address");
                String idType = request.getParameter("idType");
                iCustomerService.create(id, name, dateOfBirth, gender, idCard, phone, email, address, idType);
                List<Customer> customerList = iCustomerService.findAll();
                request.setAttribute("listCustomer", customerList);
                request.getRequestDispatcher("/customer/display_customer.jsp").forward(request, response);
                break;
            }
            case "search": {
                String name = request.getParameter("name");
                List<Customer> customerList = iCustomerService.findByName(name);
                request.setAttribute("customerList", customerList);
                request.getRequestDispatcher("/customer/view_customer.jsp").forward(request, response);
                break;
            }
            case "searchBy3": {
                String name = request.getParameter("name");
                String email = request.getParameter("email");
                String idType = request.getParameter("idType");
                List<Customer> customerList = new ArrayList<>();
                List<CustomerType> customerTypes = customerTypeRepository.selectAllCustomerType();
                request.setAttribute("customerTypes", customerTypes);
                customerList = iCustomerService.search(name,email,idType);
                request.setAttribute("customerList", customerList);
                request.getRequestDispatcher("/customer/display_customer.jsp").forward(request, response);
                break;
            }
            case "delete": {
                String id = request.getParameter("id");
                iCustomerService.deleteById(id);
                List<Customer> customerList = iCustomerService.findAll();
                request.setAttribute("customerList", customerList);
                request.getRequestDispatcher("/customer/display_customer.jsp").forward(request, response);
                break;
            }
            case "update": {
                String id = request.getParameter("id");
                String name = request.getParameter("name");
                String dateOfBirth = request.getParameter("dateOfBirth");
                String gender = request.getParameter("gender");
                String idCard = request.getParameter("idCard");
                String phone = request.getParameter("phone");
                String email = request.getParameter("email");
                String address = request.getParameter("address");
                String idType = request.getParameter("idType");
                iCustomerService.save(id, name, dateOfBirth, gender, idCard, phone, email, address, idType);
                response.sendRedirect("/customer");
                break;
            }
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws
            ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create": {
                List<CustomerType> customerTypes = customerTypeRepository.selectAllCustomerType();
                request.setAttribute("customerTypes", customerTypes);
                request.getRequestDispatcher("/customer/create_customer.jsp").forward(request, response);
                break;
            }
            case "search": {
                String name = request.getParameter("name");
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
                String id = request.getParameter("id");
                Customer customer = iCustomerService.findById(id);
                List<CustomerType> customerTypes = customerTypeRepository.selectAllCustomerType();
                request.setAttribute("customerTypes", customerTypes);
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