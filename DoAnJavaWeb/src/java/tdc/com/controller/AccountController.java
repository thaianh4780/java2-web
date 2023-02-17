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
import javax.servlet.http.HttpSession;
import tdc.com.dao.AccountDAO;
import tdc.com.model.Account;
import tdc.com.model.Category;
import tdc.com.model.Product;

/**
 *
 * @author DELL
 */
@WebServlet(name = "AccountController", urlPatterns = {"/AccountController"})
public class AccountController extends HttpServlet {

    AccountDAO accountDAO = null;
    RequestDispatcher dispatcher = null;

    public AccountController() {
        accountDAO = new AccountDAO();
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
            case "LOGIN":
                handleSubmitLogin(request, response);
                break;
            case "REGISTER":
                handleSubmitRegister(request, response);
                break;
            case "LOGOUT":
                logOut(request, response);
                break;
            case "LIST":
                listAccount(request, response);
                break;
            case "SHOW":
                show(request, response);
                break;
            case "DELETE":
                delete(request, response);
                break;
            case "DETAIL":
                getSingleAccount(request, response);
                break;
            case "UPDATE":
                update(request, response);
                break;
            default:

                break;

        }
    }

    private void getSingleAccount(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String id = request.getParameter("ma");

        Account acc = accountDAO.get(Integer.parseInt(id));

        request.setAttribute("acc", acc);

        dispatcher = request.getRequestDispatcher("account-update-form.jsp");
        dispatcher.forward(request, response);
    }

    private void update(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        String id = request.getParameter("ma");

        String ten = request.getParameter("username");
        String matKhau = request.getParameter("password");
        String reMatKhau = request.getParameter("repassword");
        String email = request.getParameter("email");
        String quyen = request.getParameter("quyen");

        if (!matKhau.equals(reMatKhau)) {
            request.setAttribute("thongBaoPass", "<div class=\"alert alert-danger\" role=\"alert\">\n"
                    + "                            Password không trùng khớp!\n"
                    + "                        </div>");
            request.getRequestDispatcher("AccountController?action=UPDATE").forward(request, response);
        } else {
            Account account = new Account();
            account.setTen(ten);
            account.setQuyen(Integer.parseInt(quyen));
            account.setMatKhau(matKhau);
            account.setEmail(email);
            account.setMa(Integer.parseInt(id));
            accountDAO.update(account);
            HttpSession session = request.getSession();
            session.removeAttribute("account");
            session.setAttribute("account", account);
            request.getRequestDispatcher("HomeController").forward(request, response);
        }

    }

    private void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("ma");
        accountDAO.delete(Integer.parseInt(id));
        listAccount(request, response);
    }

    private void listAccount(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int accountPerPage = 5;
        int currentPage = 1;
        int totalAccount = 0;
        int noOfPages = 0;
        if (request.getParameter("page") != null) {
            currentPage = Integer.parseInt(request.getParameter("page"));
        }

        int start = (currentPage - 1) * accountPerPage;

        List<Account> list = accountDAO.getLimit(start, accountPerPage);

        totalAccount = accountDAO.getAll().size();
        noOfPages = (totalAccount + accountPerPage - 1) / accountPerPage;
        request.setAttribute("listAc", list);
        request.setAttribute("currentPage", currentPage);

        request.setAttribute("noOfPages", noOfPages);

        dispatcher = request.getRequestDispatcher("account-list.jsp");

        dispatcher.forward(request, response);
    }
    
    private void show(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int accountPerPage = 5;
        int currentPage = 1;
        int totalAccount = 0;
        int noOfPages = 0;
        if (request.getParameter("page") != null) {
            currentPage = Integer.parseInt(request.getParameter("page"));
        }

        int start = (currentPage - 1) * accountPerPage;

        List<Account> list = accountDAO.getLimit(start, accountPerPage);

        totalAccount = accountDAO.getAll().size();
        noOfPages = (totalAccount + accountPerPage - 1) / accountPerPage;
        request.setAttribute("listAc", list);
        request.setAttribute("currentPage", currentPage);

        request.setAttribute("noOfPages", noOfPages);

        dispatcher = request.getRequestDispatcher("about-us.jsp");

        dispatcher.forward(request, response);
    }

    private void logOut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        session.removeAttribute("account");
        session.removeAttribute("cart");
        session.removeAttribute("cart2");
        session.removeAttribute("qty");
        response.sendRedirect("login.jsp");
    }

    private void handleSubmitLogin(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String ten = request.getParameter("username");
        String matKhau = request.getParameter("password");
        Account account = accountDAO.login(ten, matKhau);
        if (account == null) {
            request.setAttribute("mess", "<div class=\"alert alert-danger\" role=\"alert\">\n"
                    + "                            username hoặc password bị sai!\n"
                    + "                        </div>");
            request.getRequestDispatcher("login.jsp").forward(request, response);
        } else {
            HttpSession session = request.getSession();

            session.setAttribute("account", account);

            request.getRequestDispatcher("HomeController").forward(request, response);
        }
    }

    private void handleSubmitRegister(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String ten = request.getParameter("username");
        String matKhau = request.getParameter("password");
        String reMatKhau = request.getParameter("repassword");
        String email = request.getParameter("email");
        //Account account = accountDAO.login(ten, matKhau);

        if (!matKhau.equals(reMatKhau)) {
            request.setAttribute("thongBaoPass", "<div class=\"alert alert-danger\" role=\"alert\">\n"
                    + "                            Password không trùng khớp!\n"
                    + "                        </div>");
            request.getRequestDispatcher("registration.jsp").forward(request, response);
        } else {
            Boolean check = accountDAO.checkUserNameAccount(ten);
            if (check) {
                request.setAttribute("thongBao", "<div class=\"alert alert-danger\" role=\"alert\">\n"
                        + "                           Username đã có!\n"
                        + "                        </div>");
                request.getRequestDispatcher("registration.jsp").forward(request, response);
            } else {
                request.setAttribute("mess", "<div class=\"alert alert-info\" role=\"alert\">\n"
                        + "                           Tạo tài khoản thành công!\n"
                        + "                        </div>");
                accountDAO.singUp(ten, matKhau, email);
                request.getRequestDispatcher("login.jsp").forward(request, response);
            }
        }
        //request.setAttribute("account", account);
        request.getRequestDispatcher("HomeController").forward(request, response);
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
        processRequest(request, response);
        //update(request, response);
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
