/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdc.com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import tdc.com.dao.CategoryDAO;
import tdc.com.dao.ProductDAO;
import tdc.com.model.Category;
import tdc.com.model.Product;

/**
 *
 * @author DELL
 */
@WebServlet(name = "ProductController", urlPatterns = {"/ProductController"})
public class ProductController extends HttpServlet {
    
    private static final long serialVersionUID = 1L;
    RequestDispatcher dispatcher = null;
    ProductDAO productDAO = null;
    CategoryDAO categoryDAO = null;
    
    public ProductController() {
        productDAO = new ProductDAO();
        categoryDAO = new CategoryDAO();
    }

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        String action = request.getParameter("action");
        
        if (action == null) {
            action = "LIST";
        }
        String id = request.getParameter("ma");
        switch (action) {
            case "LIST":
                
                if (id == null) {
                    listProduct(request, response);
                } else {
                    listProductByCategory(Integer.parseInt(id), request, response);
                }
                break;
            case "DETAIL":
                getSingleProduct(request, response);
                break;
            case "SEARCH":
                getSearch(request, response);
                break;
            default:
                listProduct(request, response);
                break;
            
        }
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
    }
    
    private void getSearch(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        String txtSearch = request.getParameter("txt");
        List<Product> listP = productDAO.getSearch(txtSearch);
        
        List<Category> listC = categoryDAO.getAll();
        request.setAttribute("list", listP);
        request.setAttribute("listC", listC);
        request.setAttribute("txtS", txtSearch);
        request.getRequestDispatcher("product-list.jsp").forward(request, response);
    }
    
    private void listProductByCategory(int ma, HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        int productPerPage = 8;
        int currentPage = 1;
        int totalProduct = 0;
        int noOfPages = 0;
        if (request.getParameter("page") != null) {
            currentPage = Integer.parseInt(request.getParameter("page"));
        }
        
        int start = (currentPage - 1) * productPerPage;
        
        List<Product> theList = productDAO.getProductByCategory(ma, start, productPerPage);
        List<Category> listC = categoryDAO.getAll();
        totalProduct = productDAO.getByCategory(ma).size();
        
        noOfPages = (totalProduct + productPerPage - 1) / productPerPage;
//        noOfPages = (int) Math.ceil(totalSach * 0.1 / sachPerPage);

        request.setAttribute("list", theList);
        request.setAttribute("listC", listC);
        request.setAttribute("currentPage", currentPage);
        request.setAttribute("totalSach", totalProduct);
        request.setAttribute("noOfPages", noOfPages);
        request.setAttribute("id", ma);
        
        request.getRequestDispatcher("product-list.jsp").forward(request, response);
    }
    
    private void listProduct(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        int productPerPage = 8;
        int currentPage = 1;
        int totalProduct = 0;
        int noOfPages = 0;
        if (request.getParameter("page") != null) {
            currentPage = Integer.parseInt(request.getParameter("page"));
        }
        
        int start = (currentPage - 1) * productPerPage;
        
        List<Product> theList = productDAO.get(start, productPerPage);
        List<Category> listC = categoryDAO.getAll();
        totalProduct = productDAO.getNoOfRecords();
        
        noOfPages = (totalProduct + productPerPage - 1) / productPerPage;
        //noOfPages = (int) Math.ceil(totalSach * 0.1 / sachPerPage);

        request.setAttribute("list", theList);
        request.setAttribute("listC", listC);
        request.setAttribute("currentPage", currentPage);
        request.setAttribute("totalSach", totalProduct);
        request.setAttribute("noOfPages", noOfPages);
        
        request.getRequestDispatcher("product-list.jsp").forward(request, response);
    }
    
   
    
    private void getSingleProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        String id = request.getParameter("pid");
        Product p = productDAO.get(Integer.parseInt(id));
        request.setAttribute("product", p);
        request.getRequestDispatcher("product-detail.jsp").forward(request, response);
    }
    
   
    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
