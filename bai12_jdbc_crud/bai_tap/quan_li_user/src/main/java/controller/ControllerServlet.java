package controller;

import model.User;
import service.IUserService;
import service.impl.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ControllerServlet", urlPatterns = "/users")
public class ControllerServlet extends HttpServlet {
    private IUserService iUserService = new UserService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        switch (action) {
            case "create": {
                String id = request.getParameter("id");
                String name = request.getParameter("name");
                String email = request.getParameter("email");
                String country = request.getParameter("country");
                User user = new User(Integer.parseInt(id), name, email, country);
                iUserService.createUser(user);
                List<User> listUser = iUserService.findAll();
                request.setAttribute("listUser", listUser);
                request.getRequestDispatcher("display.jsp").forward(request, response);
            }
            break;
            case "update": {
                String id = request.getParameter("id");
                String name = request.getParameter("name");
                String email = request.getParameter("email");
                String country = request.getParameter("country");
                iUserService.save(id, name, email, country);
                response.sendRedirect("/users");
            }
            break;
            case "delete": {
                String id = request.getParameter("id");
                iUserService.deleteById(id);
                List<User> userList = iUserService.findAll();
                request.setAttribute("userList", userList);
                request.getRequestDispatcher("display.jsp").forward(request, response);
            }
            break;
            case "search": {
                String country = request.getParameter("country");
                List<User> userList = iUserService.findByCountry(country);
                request.setAttribute("userList", userList);
                request.getRequestDispatcher("view.jsp").forward(request, response);
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
                request.getRequestDispatcher("create.jsp").forward(request, response);
            }
            case "update": {
                String id = request.getParameter("id");
                User user = iUserService.findById(id);
                request.setAttribute("user", user);
                request.getRequestDispatcher("update.jsp").forward(request, response);
            }
            case "delete": {
                String id = request.getParameter("id");
                User user = iUserService.findById(id);
                request.setAttribute("user", user);
                request.getRequestDispatcher("delete.jsp").forward(request, response);
            }
            case "search": {
                String country = request.getParameter("country");
                List<User> userList = iUserService.findByCountry(country);
                request.setAttribute("userList", userList);
                request.getRequestDispatcher("search.jsp").forward(request, response);
            }
            default: {
                List<User> userList = iUserService.findAll();
                request.setAttribute("userList", userList);
                request.getRequestDispatcher("/display.jsp").forward(request, response);
            }
        }
    }
}