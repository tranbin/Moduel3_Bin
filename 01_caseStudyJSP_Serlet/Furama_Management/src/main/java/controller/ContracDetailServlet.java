package controller;

import model.Contract;
import model.ContractDetail;
import service.IContractDetailService;
import service.impl.ContractDetailService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ContracDetailServlet", urlPatterns = "/contractDetail")
public class ContracDetailServlet extends HttpServlet {
    private IContractDetailService iContractDetailService = new ContractDetailService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create": {
                String contractDetailId = request.getParameter("contractDetailId");
                String contractId = request.getParameter("contractId");
                String attachServiceId = request.getParameter("attachServiceId");
                String quantity = request.getParameter("quantity");
                ContractDetail contractDetail = new ContractDetail(Integer.parseInt(contractDetailId),
                        Integer.parseInt(contractId), Integer.parseInt(attachServiceId), Integer.parseInt(quantity));
                iContractDetailService.create(contractDetail);
                List<ContractDetail> contractDetails = iContractDetailService.findAll();
                request.setAttribute("contractDetails", contractDetails);
                request.getRequestDispatcher("/contract_detail/contract_detail_display.jsp").forward(request, response);
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
                request.getRequestDispatcher("/contract_detail/contract_detail_create.jsp").forward(request, response);
                break;
            }
            case "update": {
                String id = request.getParameter("id");
                ContractDetail contractDetail = iContractDetailService.findById(id);
                request.setAttribute("contractDetail", contractDetail);
                request.getRequestDispatcher("/contract_detail/update_contract.jsp").forward(request, response);
                break;
            }
            default:
                List<ContractDetail> contractDetails = iContractDetailService.findAll();
                request.setAttribute("contractDetails", contractDetails);
                request.getRequestDispatcher("/contract_detail/contract_detail_display.jsp").forward(request, response);
        }
    }
}

