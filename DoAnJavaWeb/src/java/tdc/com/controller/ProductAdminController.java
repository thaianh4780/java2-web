/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdc.com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;
import tdc.com.dao.CategoryDAO;
import tdc.com.dao.ProductDAO;
import tdc.com.model.Category;
import tdc.com.model.Product;

/**
 *
 * @author DELL
 */
@MultipartConfig
@WebServlet(name = "ProductAdminController", urlPatterns = {"/ProductAdminController"})
public class ProductAdminController extends HttpServlet {

    ProductDAO productDAO = null;
    CategoryDAO categoryDAO = null;

    public ProductAdminController() {
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

        String action = request.getParameter("action");

        if (action == null) {
            action = "LIST";
        }
        switch (action) {
            case "LIST":
                getAllProduct(request, response);
                break;
            case "UPDATE":
                getSingleProduct(request, response);
                break;
            case "DELETE":
                delete(request, response);
                break;
            case "ADD":
                add(request, response);
                break;
            default:

                break;

        }

    }

    private String uploadImage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String fileName = "";
        try {
            Part part = request.getPart("hinhanh");
            String realPart = request.getServletContext().getRealPath("/uploads");
             fileName = Paths.get(part.getSubmittedFileName()).getFileName().toString();
            if (!Files.exists(Paths.get(realPart))) {
                Files.createDirectory(Paths.get(realPart));
            }
            part.write(realPart+"/"+fileName);
//            PrintWriter out = response.getWriter();
//            try {
//                out.print("<img styte='width: 100px; height: 100px' src='uploads/"+fileName+"'>");
//            } catch (Exception e) {
//            }
        } catch (Exception e) {
        }
        return fileName;
    }

    private void add(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<Category> listC = categoryDAO.getAll();
        request.setAttribute("listC", listC);

        request.getRequestDispatcher("product-form.jsp").forward(request, response);

    }

    private void getSingleProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("ma");
        List<Category> listC = categoryDAO.getAll();
        request.setAttribute("listC", listC);
        Product p = productDAO.get(Integer.parseInt(id));
        request.setAttribute("p", p);
        request.getRequestDispatcher("product-form.jsp").forward(request, response);

    }

    private void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("ma");
        productDAO.delete(Integer.parseInt(id));
        getAllProduct(request, response);
    }

    private void getAllProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int productPerPage = 8;
        int currentPage = 1;
        int totalProduct = 0;
        int noOfPages = 0;
        if (request.getParameter("page") != null) {
            currentPage = Integer.parseInt(request.getParameter("page"));
        }

        int start = (currentPage - 1) * productPerPage;

        List<Product> theList = productDAO.get(start, productPerPage);

        totalProduct = productDAO.getNoOfRecords();

        noOfPages = (totalProduct + productPerPage - 1) / productPerPage;


        request.setAttribute("listP", theList);

        request.setAttribute("currentPage", currentPage);

        request.setAttribute("noOfPages", noOfPages);


        request.getRequestDispatcher("product-list-admin.jsp").forward(request, response);
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
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        String hinh=  uploadImage(request, response);
        //processRequest(request, response);
        String id = request.getParameter("ma");
        String ten = request.getParameter("ten");
        String gia = request.getParameter("gia");
        String maDanhMuc = request.getParameter("category");
//        String hinh = "";
        if (hinh.isEmpty()) {
             hinh = request.getParameter("hinh");
        }
        
//        if (uploadImage(request, response).isEmpty()) {
//            hinh = request.getParameter("hinh");
//        } else {
//            hinh = uploadImage(request, response);
//        }

        String moTa = request.getParameter("mota");

        Product p = new Product();
        p.setTen(ten);
        p.setGia(Integer.parseInt(gia));
        p.setHinh(hinh);
        p.setMoTa(moTa);
        p.setMaDanhMuc(Integer.parseInt(maDanhMuc));

        if (id == null) {

            if (productDAO.save(p)) {
                request.setAttribute("NOTIFICATION", "them sach thanh cong!");
                response.sendRedirect("ProductAdminController?action=LIST");
            }

        } else {

//            sach.setMaSach(Integer.parseInt(id));
            p.setMa(Integer.parseInt(id));
            if (productDAO.update(p)) {
                request.setAttribute("NOTIFICATION", "cap nhap sach thanh cong!");
                response.sendRedirect("ProductAdminController?action=LIST");
            }

        }

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
