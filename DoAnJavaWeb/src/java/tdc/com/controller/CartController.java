/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdc.com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import tdc.com.dao.ProductDAO;
import tdc.com.model.Product;

/**
 *
 * @author DELL
 */
@WebServlet(name = "CartController", urlPatterns = {"/CartController"})
public class CartController extends HttpServlet {

    ProductDAO productDAO = null;

    public CartController() {
        productDAO = new ProductDAO();
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
            out.println("<title>Servlet CartController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CartController at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    private void addProduct(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        if (session.getAttribute("account") == null) {
            request.setAttribute("mess", "Hãy Đăng Nhập Trước Khi Mua Giỏ Hàng!!");
            request.getRequestDispatcher("login.jsp").forward(request, response);
        } else {
            Map<Integer, Integer> cart = (Map<Integer, Integer>) session.getAttribute("cart");
            if (cart == null) {
                cart = new HashMap<Integer, Integer>();
            }
            int id = Integer.parseInt(request.getParameter("ma"));

            if (!cart.containsKey(id)) {
                cart.put(id, 1);
            } else {
                int a = cart.get(id);
                cart.put(id, a + 1);
            }

            session.setAttribute("cart", cart);
            session.setAttribute("qty", cart.size());

            request.getRequestDispatcher("/ProductController").forward(request, response);
        }

    }

    private void addProductHome(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();

        if (session.getAttribute("account") == null) {
            request.setAttribute("mess", "Hãy Đăng Nhập Trước Khi Mua Giỏ Hàng!!");
            request.getRequestDispatcher("login.jsp").forward(request, response);
        } else {
            Map<Integer, Integer> cart = (Map<Integer, Integer>) session.getAttribute("cart");
            if (cart == null) {
                cart = new HashMap<Integer, Integer>();
            }
            int id = Integer.parseInt(request.getParameter("ma"));

            if (!cart.containsKey(id)) {
                cart.put(id, 1);
            } else {
                int a = cart.get(id);
                cart.put(id, a + 1);
            }

            session.setAttribute("cart", cart);
            session.setAttribute("qty", cart.size());
//         System.out.println("cart: "+ cart);
//         System.out.println("soLuong: "+ cart.size());
            request.getRequestDispatcher("/HomeController").forward(request, response);
        }
    }

    private void showCart(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        SachDAO sdao = new SachDAO();
        HttpSession session = request.getSession();
        //(Map<Integer, Integer>)session.getAttribute('cart')
        Map<Integer, Integer> cart = (Map<Integer, Integer>) session.getAttribute("cart");

        Map<Product, Integer> cart2 = new HashMap<Product, Integer>();
        double total = 0;

        if (cart != null) {
            for (Map.Entry entry : cart.entrySet()) {
                int id = (int) entry.getKey();
                Product s = productDAO.get(id);

                int value = (int) entry.getValue();
                total += s.getGia() * value;
                cart2.put(s, value);
            }
        }

//        request.setAttribute("cart2", cart2);
        session.setAttribute("cart2", cart2);
        request.setAttribute("total", (int) total);
//        System.out.println("total: "+ (int)total);
        request.getRequestDispatcher("shopping-cart.jsp").forward(request, response);
    }

    private void deleteCart(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        session.removeAttribute("cart");
        session.removeAttribute("cart2");
        session.removeAttribute("qty");
        request.getRequestDispatcher("ProductController").forward(request, response);
    }

    private void deleteOneProduct(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        SachDAO sdao = new SachDAO();
        HttpSession session = request.getSession();
        String id = request.getParameter("ma");
        int qty = (int) session.getAttribute("qty");

        Map<Integer, Integer> cart = (Map<Integer, Integer>) session.getAttribute("cart");
        String key = "";


        for (Map.Entry entry : cart.entrySet()) {
            key = entry.getKey().toString();
            if (key.equals(id)) {
                cart.remove(entry.getKey(), entry.getValue());
            }
        }
//        if (cart.containsKey(id)) {
//     
//            cart.remove(id);
//        }
        session.setAttribute("cart", cart);
        session.setAttribute("qty", qty - 1);
        request.getRequestDispatcher("CartController?action=LIST").forward(request, response);
    }

    private void handleIncrease(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();

        Map<Integer, Integer> cart = (Map<Integer, Integer>) session.getAttribute("cart");

        int id = Integer.parseInt(request.getParameter("ma"));

        if (cart.containsKey(id)) {
            int a = cart.get(id);
            cart.put(id, a + 1);
        }

        session.setAttribute("cart", cart);
        System.out.println("cart: " + cart);
        request.getRequestDispatcher("/CartController?action=LIST").forward(request, response);
    }

    private void handleDecrease(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();

        Map<Integer, Integer> cart = (Map<Integer, Integer>) session.getAttribute("cart");

        int id = Integer.parseInt(request.getParameter("ma"));

        if (cart.containsKey(id)) {
            int a = cart.get(id);
            if (a == 1) {
                cart.put(id, 1);
            } else {
                cart.put(id, a - 1);
            }

        }

        session.setAttribute("cart", cart);
        System.out.println("cart: " + cart);
        request.getRequestDispatcher("/CartController?action=LIST").forward(request, response);
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
        String action = request.getParameter("action");

        if (action == null) {
            action = "LIST";
        }

        switch (action) {
            case "ADD":
                addProduct(request, response);
                break;
            case "ADDHOME":
                addProductHome(request, response);
                break;
            case "LIST":
                showCart(request, response);
                break;
            case "DELETEONE":
                deleteOneProduct(request, response);
                break;
            case "DELETE":
                deleteCart(request, response);
                break;
            case "INCREASE":
                handleIncrease(request, response);
                break;
            case "DECREASE":
                handleDecrease(request, response);
                break;
            default:
                addProduct(request, response);
                break;

        }
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
