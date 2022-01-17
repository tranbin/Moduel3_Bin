package controller;

import model.Customer;
import model.ServiceFurama;
import service.IServiceFurama;
import service.impl.FuramaService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ServiceFuramaServlet",urlPatterns = "/serviceFurama")
public class ServiceFuramaServlet extends HttpServlet {
    private IServiceFurama iServiceFurama = new FuramaService();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create": {
                String id =request.getParameter("id");
                String name =request.getParameter("name");
                String area =request.getParameter("area");
                String cost =request.getParameter("cost");
                String maxPeople =request.getParameter("maxPeople");
                String standardRoom =request.getParameter("standardRoom");
                String description =request.getParameter("description");
                String poolArea =request.getParameter("poolArea");
                String numberFloor =request.getParameter("numberFloor");
                String rentTypeId =request.getParameter("rentTypeId");
                String serviceTypeId =request.getParameter("serviceTypeId");
                ServiceFurama serviceFurama = new ServiceFurama(Integer.parseInt(id),name,Integer.parseInt(area),Double.parseDouble(cost),Integer.parseInt(maxPeople),
                        standardRoom,description,Double.parseDouble(poolArea),Integer.parseInt(numberFloor),Integer.parseInt(rentTypeId),Integer.parseInt(serviceTypeId));
                iServiceFurama.create(serviceFurama);
                List<ServiceFurama> serviceFuramas = iServiceFurama.findAll();
                request.setAttribute("serviceFuramas",serviceFuramas);
                request.getRequestDispatcher("/service/display_service.jsp").forward(request,response);
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
                request.getRequestDispatcher("/service/create_service.jsp").forward(request, response);
                break;
            }

            case "update": {
                String id = request.getParameter("serviceFuramaId");
                ServiceFurama serviceFurama = iServiceFurama.findById(id);
                request.setAttribute("serviceFurama", serviceFurama);
                request.getRequestDispatcher("/service/update_service.jsp").forward(request, response);
                break;
            }
            default:
                List<ServiceFurama> serviceFuramas = iServiceFurama.findAll();
                request.setAttribute("serviceFuramas", serviceFuramas);
                request.getRequestDispatcher("/service/display_service.jsp").forward(request, response);
        }
    }

    }

