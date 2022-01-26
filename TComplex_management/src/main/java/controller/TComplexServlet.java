package controller;

import model.TComplex;
import service.ITComplexService;
import service.impl.TComplexService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "TComplexServlet",urlPatterns = "/tcomplex")
public class TComplexServlet extends HttpServlet {
    private ITComplexService itComplexService = new TComplexService();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create": {
                String id =request.getParameter("id");
                String area =request.getParameter("area");
                String status =request.getParameter("status");
                String floor =request.getParameter("floor");
                String typeOfName =request.getParameter("typeOfName");
                String description =request.getParameter("description");
                String price =request.getParameter("price");
                String dateStart =request.getParameter("dateStart");
                String dateEnd =request.getParameter("dateEnd");
                TComplex tComplex = new TComplex(Integer.parseInt(id),Integer.parseInt(area),
                        Integer.parseInt(status),Integer.parseInt(floor),Integer.parseInt(typeOfName),description,
                        Integer.parseInt(price),dateStart,dateEnd);
                itComplexService.create(tComplex);
                List<TComplex> tComplexList = itComplexService.findAll();
                request.setAttribute("tComplexList",tComplexList);
                request.getRequestDispatcher("/create.jsp").forward(request,response);
                break;
            }
            case "search": {
                String typeOfName = request.getParameter("typeOfName");
                String price = request.getParameter("price");
                String floor = request.getParameter("floor");
                List<TComplex> tComplexList = new ArrayList<>();
                tComplexList = itComplexService.search(typeOfName,price,floor);
                request.setAttribute("tComplexList", tComplexList);
                request.getRequestDispatcher("view.jsp").forward(request, response);
                break;
            }
            case "delete": {
                String id = request.getParameter("id");
                itComplexService.deleteById(id);
                List<TComplex> tComplexList = itComplexService.findAll();
                request.setAttribute("tComplexList", tComplexList);
                request.getRequestDispatcher("/display.jsp").forward(request, response);
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
                break;
            }
            case "search": {

                request.getRequestDispatcher("/search.jsp").forward(request, response);
                break;
            }
            case "delete": {
                String id = request.getParameter("id");
                TComplex tComplex = itComplexService.findById(id);
                request.setAttribute("tComplex", tComplex);
                request.getRequestDispatcher("/delete.jsp").forward(request, response);
                break;
            }
            case "update": {
                String id = request.getParameter("id");
                TComplex tComplex = itComplexService.findById(id);
                request.setAttribute("tComplex", tComplex);
                request.getRequestDispatcher("/update.jsp").forward(request, response);
                break;
            }
            default:
                List<TComplex> tComplexList = itComplexService.findAll();
                request.setAttribute("tComplexList", tComplexList);
                request.getRequestDispatcher("/display.jsp").forward(request, response);
        }
    }
}
