<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>

    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no">
        <title>Register</title>
        <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Montserrat:400,400i,700,700i,600,600i">
        <link rel="stylesheet" href="assets/fonts/simple-line-icons.min.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/baguettebox.js/1.10.0/baguetteBox.min.css">
        <link rel="stylesheet" href="assets/css/smoothproducts.css">
                <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    </head>

    <body>
        <%@ include file="header.jsp" %>
        <main class="page registration-page">
            <section class="clean-block clean-form dark">
                <div class="container">
                    <div class="block-heading">
                        <h2 class="text-info">Registration</h2>
                    </div>
                    <div>${thongBaoDangKy}</div>
                    <form action="AccountController?action=REGISTER" method="post" >
                        <div class="form-group">
                            <label for="name">Name</label>
                            <input class="form-control item" type="text" id="name" name="username"  >
                        </div>
                        <div class="thongBao">${thongBao}</div>
                        <div class="form-group">
                            <label for="password">Password</label>
                            <input class="form-control item" type="password" id="password" name="password"  >
                        </div>

                        <%
                            String notice = "";
                            if (request.getAttribute("check") != null) {
                                boolean check = Boolean.parseBoolean(request.getParameter("check"));
                                notice = "<p style='color: tomato;'>username or password is incorrect</p>";
                            }
                        %>
                        <%=notice%>

                        <div class="form-group">
                            <label for="password"> Confirm Password</label>
                            <input class="form-control item" type="password" id="password" name="repassword" >
                        </div>
                         <div class="thongBao">${thongBaoPass}</div>
                       
                        <div class="form-group">
                            <label for="email">Email</label>
                            <input class="form-control item" type="email" id="email" name="email"  >
                        </div>
                        <button class="btn btn-primary btn-block" type="submit">Sign Up</button>
                    </form>
                </div>
            </section>
        </main>
        <%@ include file="footer.jsp" %>
        <script src="assets/js/jquery.min.js"></script>
        <script src="assets/bootstrap/js/bootstrap.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/baguettebox.js/1.10.0/baguetteBox.min.js"></script>
        <script src="assets/js/smoothproducts.min.js"></script>
        <script src="assets/js/theme.js"></script>
    </body>

</html>