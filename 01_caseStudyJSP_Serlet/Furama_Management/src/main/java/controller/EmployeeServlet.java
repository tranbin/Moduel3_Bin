package controller;


import model.Employee;
import service.IEmployeeService;
import service.impl.EmployeeService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "EmployeeServlet",urlPatterns = "/employee")
public class EmployeeServlet extends HttpServlet {
    private IEmployeeService iEmployeeService = new EmployeeService();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create": {
                String id =request.getParameter("id");
                String name =request.getParameter("name");
                String dateOfBirth =request.getParameter("dateOfBirth");
                String idCard =request.getParameter("idCard");
                String salary =request.getParameter("salary");
                String phone =request.getParameter("phone");
                String email =request.getParameter("email");
                String address =request.getParameter("address");
                String typeId =request.getParameter("typeId");
                String position =request.getParameter("position");
                String education =request.getParameter("education");
                String division =request.getParameter("division");
                String username =request.getParameter("username");
                Employee employee = new Employee(Integer.parseInt(id),name,dateOfBirth,idCard,Double.parseDouble(salary),phone,email,address,Integer.parseInt(typeId),Integer.parseInt(position),
                        Integer.parseInt(education),Integer.parseInt(division),username);
                iEmployeeService.create(employee);
                List<Employee> employeeList = iEmployeeService.findAll();
                request.setAttribute("employeeList",employeeList);
                request.getRequestDispatcher("/employee/create_employee.jsp").forward(request,response);
                break;
            }
            case "update": {
                String id =request.getParameter("id");
                String name =request.getParameter("name");
                String dateOfBirth =request.getParameter("dateOfBirth");
                String idCard =request.getParameter("idCard");
                String salary =request.getParameter("salary");
                String phone =request.getParameter("phone");
                String email =request.getParameter("email");
                String address =request.getParameter("address");
                String typeId =request.getParameter("typeId");
                String position =request.getParameter("position");
                String education =request.getParameter("education");
                String division =request.getParameter("division");
                String username =request.getParameter("username");
                iEmployeeService.save(id,name,dateOfBirth,idCard,salary,phone,email,address,typeId,position,education,division,username);
                response.sendRedirect("/employee");
                break;
            }
            case "delete": {
                String employeeId = request.getParameter("employeeId");
                iEmployeeService.deleteById(employeeId);
                List<Employee> employeeList = iEmployeeService.findAll();
                request.setAttribute("employeeList", employeeList);
                request.getRequestDispatcher("/employee/display_employee.jsp").forward(request, response);
                break;
            }
            case "search" :{
                String name = request.getParameter("employeeName");
                List<Employee> employeeList = iEmployeeService.findByName(name);
                request.setAttribute("employeeList", employeeList);
                request.getRequestDispatcher("/employee/view_employee.jsp").forward(request, response);
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
                request.getRequestDispatcher("/employee/create_employee.jsp").forward(request, response);
                break;
            }
            case "search": {
                String name = request.getParameter("employeeName");
                List<Employee> employeeList = iEmployeeService.findByName(name);
                request.setAttribute("employeeList", employeeList);
                request.getRequestDispatcher("/employee/search_employee.jsp").forward(request, response);
                break;
            }
            case "delete": {
                String id = request.getParameter("id");
                Employee employee = iEmployeeService.findById(id);
                request.setAttribute("employee", employee);
                request.getRequestDispatcher("/employee/delete_employee.jsp").forward(request, response);
                break;
            }
            case "update": {
                String id = request.getParameter("id");
                Employee employee = iEmployeeService.findById(id);
                request.setAttribute("employee", employee);
                request.getRequestDispatcher("/employee/update_employee.jsp").forward(request, response);
                break;
            }
            default:
                List<Employee> employeeList = iEmployeeService.findAll();
                request.setAttribute("employeeList", employeeList);
                request.getRequestDispatcher("/employee/display_employee.jsp").forward(request, response);
        }
    }
}
