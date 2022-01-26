package controller;

import model.RentalType;
import model.Service;
import model.TypeService;
import service.IServiceService;
import service.Imp.ServiceServiceImp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ServiceServlet", urlPatterns = {"/ServiceServlet"})
public class ServiceServlet extends HttpServlet {
    private IServiceService iServiceService = new ServiceServiceImp();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        switch (action){
            case "create":{
                String id = request.getParameter("id");
                String name = request.getParameter("name");
                String area = request.getParameter("area");
                String cost = request.getParameter("cost");
                String numPeople = request.getParameter("numPeople");
                String standard = request.getParameter("standard");
                String convinient = request.getParameter("convinient");
                String idTypeRent = request.getParameter("idTypeRent");
                String areaPool = request.getParameter("pool");
                String numFloor = request.getParameter("numFloor");
                String idServiceType = request.getParameter("idServiceType");
                iServiceService.create(id, name, area, cost, numPeople, standard, convinient, idTypeRent, areaPool, numFloor, idServiceType);
                List<Service> services = new ArrayList<>();
                services = iServiceService.display();
                request.setAttribute("list", services);
                request.getRequestDispatcher("/display_service.jsp").forward(request, response);
                break;
            }
            case "delete":{
                String id = request.getParameter("id");
                iServiceService.delete(id);
                List<Service> services = new ArrayList<>();
                services = iServiceService.display();
                request.setAttribute("list", services);
                request.getRequestDispatcher("/display_service.jsp").forward(request, response);
                break;
            }
            case "search":{
               String name = request.getParameter("name");
               List<Service> list = new ArrayList<>();
               list = iServiceService.search(name);
                request.setAttribute("list", list);
                request.getRequestDispatcher("/display_service.jsp").forward(request, response);
                break;
            }
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        switch (action){
            case "display":{
                List<Service> services = new ArrayList<>();
                services = iServiceService.display();
                request.setAttribute("list", services);
                request.getRequestDispatcher("/display_service.jsp").forward(request, response);
                break;
            }
            case "create":{
                List<RentalType> list = new ArrayList<>();
                List<TypeService> list1 = new ArrayList<>();
                list = iServiceService.listRentalType();
                list1 = iServiceService.listTypeService();
                request.setAttribute("list", list);
                request.setAttribute("list1", list1);
                request.getRequestDispatcher("/create_service.jsp").forward(request, response);
                response.sendRedirect("/create_service.jsp");
                break;
            }
            case "delete":{
                List<Service> services = new ArrayList<>();
                services = iServiceService.display();
                request.setAttribute("list", services);
                request.getRequestDispatcher("/delete_service.jsp").forward(request, response);
                response.sendRedirect("/delete_service.jsp");
                break;
            }

        }
    }
}
