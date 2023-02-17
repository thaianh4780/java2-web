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
@WebServlet(name = "DanhMucController", urlPatterns = {"/DanhMucController"})
public class CategoryController extends HttpServlet {

    private static final long serialVersionUID = 1L;
    RequestDispatcher dispatcher = null;
    ProductDAO productDAO = null;
    CategoryDAO categoryDAO = null;

    public CategoryController() {
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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet DanhMucController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet DanhMucController at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
         response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        //processRequest(request, response);
        String action = request.getParameter("action");
        if (action == null) {
            action = "LIST";
        }
        switch (action) {
            case "LIST":
                listCategory(request, response);
                break;
            case "UPDATE":
                getSingleCategory(request, response);
                break;
            case "DELETE":
                deleteCategory(request, response);
                break;
            default:
                listCategory(request, response);
                break;

        }
    }

    private void deleteCategory(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String id = request.getParameter("ma");
        if (categoryDAO.delete(Integer.parseInt(id))) {
            request.setAttribute("NOTIFICATION", "Danh Muc Deleted Successfully!");
        }
        listCategory(request, response);
    }

    private void getSingleCategory(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String id = request.getParameter("ma");

        Category danhMuc = categoryDAO.get(Integer.parseInt(id));

        request.setAttribute("c", danhMuc);

        dispatcher = request.getRequestDispatcher("category-form.jsp");
        dispatcher.forward(request, response);
    }

    private void listCategory(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        List<Category> listdm = categoryDAO.getAll();
        int a = 10;

        request.setAttribute("listdm", listdm);
       

        dispatcher = request.getRequestDispatcher("category-list-admin.jsp");

        dispatcher.forward(request, response);
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
        //processRequest(request, response);
         response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        String id = request.getParameter("ma");

        
        Category dm = new Category();
        dm.setTen(request.getParameter("ten"));
        dm.setGhiChu(request.getParameter("ghichu"));

        if (id.isEmpty() || id == null) {

            if (categoryDAO.save(dm)) {
                request.setAttribute("NOTIFICATION", "them danh muc thanh cong!");
            }

        } else {

            dm.setMa(Integer.parseInt(id));
            if (categoryDAO.update(dm)) {
                request.setAttribute("NOTIFICATION", "cap nhap danh muc thanh cong!");
            }

        }

        listCategory(request, response);
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
