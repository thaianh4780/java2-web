<%-- 
    Document   : header
    Created on : Dec 24, 2022, 2:29:27 PM
    Author     : DELL
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <nav class="navbar navbar-light navbar-expand-lg fixed-top bg-white clean-navbar">
            <div class="container"><a class="navbar-brand logo" href="HomeController">Shop</a><button data-toggle="collapse" class="navbar-toggler" data-target="#navcol-1"><span class="sr-only">Toggle navigation</span><span class="navbar-toggler-icon"></span></button>
                <div class="collapse navbar-collapse" id="navcol-1">
                    <ul class="navbar-nav ml-auto">
                        <!-- tim kiem -->
                        <li class="nav-item" style="margin-right: 5rem; margin-left:10px;">
                            <form class="d-flex" action="ProductController?action=SEARCH" method="post">
                                <input class="form-control me-2" type="text" placeholder="Search" aria-label="Search" value="${txtS}" name="txt">
                                <button class="btn btn-outline-success" type="submit">Search</button>
                            </form>
                        </li>

                        <!-- tim kiem -->
                        <li class="nav-item"><a class="nav-link" href="HomeController">Home</a></li>
                            <c:if test="${sessionScope.account.quyen == 0}" >
                            <li class="nav-item"><a class="nav-link" style="font-weight: bold" href="ProductAdminController">Manager</a></li>
                            </c:if>
                        <li class="nav-item"><a class="nav-link" href="ProductController?action=LIST">Book</a></li>  
                        <li class="nav-item"><a class="nav-link text-nowrap" href="AccountController?action=SHOW">List Account</a></li>  

                        <c:if test="${sessionScope.account != null}" >

                            <li class="nav-item"><a class="nav-link text-nowrap" style="font-weight: bold" href="AccountController?action=DETAIL&ma=${sessionScope.account.ma}">Welcome     ${sessionScope.account.ten}</a></li>
                            <li class="nav-item"><a class="nav-link" href="AccountController?action=LOGOUT">LogOut</a></li>
                            </c:if>
                            <c:if test="${sessionScope.account == null}" >

                            <li class="nav-item"><a class="nav-link" href="login.jsp">Login</a></li>
                            </c:if>

                    </ul>

                </div>
                <a  class="btn btn-success btn-sm ml-2" href="CartController?action=LIST">
                    <i class="fa fa-shopping-cart"></i> Cart
                    <span class="badge">
                        ${sessionScope.qty}
                    </span>
                </a>
            </div>

        </nav>
    </body>
</html>
