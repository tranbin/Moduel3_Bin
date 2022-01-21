package controller;

import model.Contract;
import model.Customer;
import model.ServiceFurama;
import service.IContractService;
import service.impl.ContractService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ContractServlet",urlPatterns = "/contractFurama")
public class ContractServlet extends HttpServlet {
    private IContractService iContractService = new ContractService();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action){
            case "create":{
                String id =request.getParameter("id");
                String startDay =request.getParameter("startDay");
                String endDay =request.getParameter("endDay");
                String deposit =request.getParameter("deposit");
                String totalMoney =request.getParameter("totalMoney");
                String employeeId =request.getParameter("employeeId");
                String customerId =request.getParameter("customerId");
                String serviceId =request.getParameter("serviceId");
                Contract contract = new Contract(Integer.parseInt(id),startDay,endDay,Double.parseDouble(deposit),Double.parseDouble(totalMoney),
                        Integer.parseInt(employeeId),Integer.parseInt(customerId),Integer.parseInt(serviceId));
                iContractService.create(contract);
                List<Contract> contractList = iContractService.findAll();
                request.setAttribute("contractFuramas",contractList);
                request.getRequestDispatcher("/contract/display_contract.jsp").forward(request,response);
                break;
            }
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action){
            case "create":{
                request.getRequestDispatcher("/contract/create_contract.jsp").forward(request, response);
                break;
            }
            case "update": {
                String id = request.getParameter("id");
                Contract contract = iContractService.findById(id);
                request.setAttribute("contractFurama", contract);
                request.getRequestDispatcher("/contract/update_contract.jsp").forward(request, response);
                break;
            }
            default:
                List<Contract> contractList = iContractService.findAll();
                request.setAttribute("contractFuramas", contractList);
                request.getRequestDispatcher("/contract/display_contract.jsp").forward(request, response);
        }
    }
}
