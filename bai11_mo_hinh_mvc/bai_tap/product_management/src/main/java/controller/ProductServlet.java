package controller;


import model.Product;
import service.IProductService;
import service.impl.ProductService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ProductServlet", urlPatterns = {"/product"})

public class ProductServlet extends HttpServlet {
    private IProductService iProductService = new ProductService();

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
                String description = request.getParameter("description");
                String grand = request.getParameter("grand");
                Product product = new Product(Integer.parseInt(id), name, Double.parseDouble(price), description, grand);
                if (iProductService.createProduct(product)) {
                    request.setAttribute("msg", "Success!");
                    List<Product> productList = iProductService.findAll();
                    request.setAttribute("productList", productList);
                    request.getRequestDispatcher("display.jsp").forward(request, response);
                } else {
                    request.setAttribute("msg", "Not Success");
                    request.getRequestDispatcher("create_product.jsp").forward(request, response);
                }
                break;
            }

            case "update": {
                String id = request.getParameter("id");
                String name = request.getParameter("name");
                String price = request.getParameter("price");
                iProductService.save(id, name, price);
                response.sendRedirect("/product");
            }
            break;
            case "delete": {
                String id = request.getParameter("id");
                iProductService.deleteById(id);
                List<Product> productList = iProductService.findAll();
                request.setAttribute("productList", productList);
                request.getRequestDispatcher("display.jsp").forward(request, response);
            }

            break;
            case "view":
                break;
            case "search": {
                String name = request.getParameter("name");
                Product product = iProductService.findByName(name);
                request.setAttribute("product", product);
                request.getRequestDispatcher("view.jsp").forward(request, response);
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
                request.getRequestDispatcher("create_product.jsp").forward(request, response);
            }
            break;
            case "update": {
                String id = request.getParameter("id");
                Product product = iProductService.findById(id);
                request.setAttribute("product", product);
                request.getRequestDispatcher("update.jsp").forward(request, response);
            }
            break;
            case "delete": {
                String id = request.getParameter("id");
                Product product = iProductService.findById(id);
                request.setAttribute("product", product);
                request.getRequestDispatcher("delete.jsp").forward(request, response);
            }
            break;
            case "view":
                break;
            case "search": {
                String name = request.getParameter("name");
                Product product = iProductService.findByName(name);
                request.setAttribute("product", product);
                request.getRequestDispatcher("search_product.jsp").forward(request, response);
            }
            break;
            default:
                List<Product> productList = iProductService.findAll();
                request.setAttribute("productList", productList);
                request.getRequestDispatcher("/display.jsp").forward(request, response);
                break;
        }
    }
}
