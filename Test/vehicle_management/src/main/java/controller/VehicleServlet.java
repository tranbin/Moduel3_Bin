package controller;

import model.Vehicle;
import service.IVehicleService;
import service.impl.VehicleService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "VehicleServlet", urlPatterns = {"/vehicle"})
public class VehicleServlet extends HttpServlet {
    private IVehicleService iVehicleService = new VehicleService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create": {
                String id = request.getParameter("id");
                String name = request.getParameter("name");
                String price = request.getParameter("price");
                String dateOfProduce = request.getParameter("dateOfProduce");
                String description = request.getParameter("description");
                Vehicle vehicle = new Vehicle(Integer.parseInt(id), name, Double.parseDouble(price), dateOfProduce, description);
                iVehicleService.createProduct(vehicle);
                List<Vehicle> vehicleList = iVehicleService.findAll();
                request.setAttribute("vehicleList", vehicleList);
                request.getRequestDispatcher("index.jsp").forward(request, response);
            }
            break;
            case "update": {
                String id = request.getParameter("id");
                String name = request.getParameter("name");
                String price = request.getParameter("price");
                String dateOfProduce = request.getParameter("dateOfProduce");
                String description = request.getParameter("description");
                iVehicleService.save(id, name, price, dateOfProduce, description);
                response.sendRedirect("vehicle");
            }
            break;
            case "delete": {
                String id = request.getParameter("id");
                iVehicleService.deleteById(id);
                List<Vehicle> vehicleList = iVehicleService.findAll();
                request.setAttribute("vehicleList", vehicleList);
                request.getRequestDispatcher("index.jsp").forward(request, response);
            }
            break;
            case "search": {
                String name = request.getParameter("name");
                Vehicle vehicle = iVehicleService.findByName(name);
                request.setAttribute("vehicle", vehicle);
                request.getRequestDispatcher("view_vehicle.jsp").forward(request, response);
            }
            break;
            default:
                break;
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create": {
                request.getRequestDispatcher("create_vehicle.jsp").forward(request, response);
            }
            break;
            case "search": {
                String name = request.getParameter("name");
                Vehicle vehicle = iVehicleService.findByName(name);
                request.setAttribute("vehicle", vehicle);
                request.getRequestDispatcher("search.jsp").forward(request, response);
            }
            break;
            case "update": {
                String id = request.getParameter("id");
                Vehicle vehicle = iVehicleService.findById(id);
                request.setAttribute("vehicle", vehicle);
                request.getRequestDispatcher("update_vehicle.jsp").forward(request, response);
            }
            break;
            case "delete": {
                String id = request.getParameter("id");
                Vehicle vehicle = iVehicleService.findById(id);
                request.setAttribute("vehicle", vehicle);
                request.getRequestDispatcher("delete.jsp").forward(request, response);
            }
            break;
            default: {
                List<Vehicle> vehicleList = iVehicleService.findAll();
                request.setAttribute("vehicleList", vehicleList);
                request.getRequestDispatcher("index.jsp").forward(request, response);
            }
        }
    }
}
