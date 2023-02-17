<%-- 
    Document   : hienthidienthoai
    Created on : Nov 9, 2021, 2:04:16 PM
    Author     : PC
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8"/>
        <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
        <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
              integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css" rel="stylesheet">
        <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Montserrat:400,400i,700,700i,600,600i">
        <link rel="stylesheet" href="assets/fonts/simple-line-icons.min.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/baguettebox.js/1.10.0/baguetteBox.min.css">
        <link rel="stylesheet" href="assets/css/smoothproducts.css">
                <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">


        <title> Manager Account</title>

        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js" ></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" ></script>

        <style> *{
            }
            .img-fluid{
                width: 100px;
                height:100px;
            }
            body{
                margin-top:20px;
                background:#f8f8f8
            }
            .image-product{
                width: 100px;
                height:100px;
            }
            .header{
                text-decoration: none;
                color: #000;
            }
            .header:hover{
                color: #000;
            }
            .btnAdd{
                text-decoration: none;
                color: #fff;
                margin: 0;
                padding: 0;
            }
            .btnAdd:hover{
                color: #fff;
            }
            .d-flex{
                justify-content: center;
                align-items: center;
            }

            .btnSeacrh{
                margin-top: 0px;
                margin-right: 20px;
                text-decoration: none;
                color: #fff;
                background: #ea4335;
                border: 1px solid #ea4335 ;
                border-radius: 5px;
                width: 130px;
                height: 35px;
            }
            .nav-link button{
                margin-top: 10px;
                background: #308ea1;
                color: white;
                border: 1px solid white;
                height: 40px;
                width: 90px;
                border-radius: 5px;   
            }
            .nav-link button:hover{
                background: white;
                border: 1px solid #308ea1;
                color: #308ea1;
                transition: 1s;
            }
        </style>
    </head>
    <body>
        <header>
            <nav class="navbar navbar-expand-lg navbar-light bg-light mx-5 d-flex justify-content-between w-100 mx-5" >
                <div class="pl-3 ms-5">
                    <h1 class="m-3 " >
                        <a class="header" style="text-decoration:none" href="HomeController">Shop</a>
                    </h1>
                </div>
                <div class="collapse navbar-collapse position-absolute end-0 me-5 pe-5" id="navbarSupportedContent">
                    <ul class="navbar-nav mr-auto  d-flex justify-content-between">
                        <c:if test="${sessionScope.account != null}" >
                            <li  class="nav-item">
                                <a class="nav-link font-weight-bold pt-3 "  href="AccountController?action=DETAIL&ma=${sessionScope.account.ma}">Hello ${sessionScope.account.ten}</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="AccountController?action=LOGOUT">
                                    <button class="test"> Logout </button>
                                </a>
                            </li>
                        </c:if>
                        <li class="nav-item"  >
                            <a class="nav-link" href="HomeController">
                                <button class="test"> Home </button>
                            </a>
                        </li>
                    </ul> 
                </div>
            </nav>
        </header>
        <div class="container-fluid">
            <div class="row flex-lg-nowrap">
                <div class="col-2">
                </div>
                <div class="col-9">
                    <div class="e-tabs mb-3 px-3">
                          <div class="col-10" >
                                <ul class="nav nav-tabs" style="justify-content: start" >
                                    <li class="nav-item me-2">
                                        <a class="nav-link active" href="ProductAdminController">Product</a>
                                    </li>
                                    <li class="nav-item me-2">
                                        <a class="nav-link active" href="DanhMucController">Category</a>
                                    </li>
                                    <li class="nav-item me-2">
                                        <a class="nav-link active" href="AccountController">Account</a>
                                    </li>
                                </ul>
                            </div> 
                    </div>
                    <nav aria-label="Page navigation example">
                        <%--<c:set value="2" var="currentPage"></c:set>
                        <c:set value="4" var="noOfPages"></c:set>--%>
                        <ul class="pagination">
                            <li class="page-item">
                                <a class="page-link" href="#" aria-label="Previous">
                                    <span aria-hidden="true">&laquo;</span>
                                </a>
                            </li>
                            <c:forEach begin="1" end="${noOfPages}" var="i">
                                <c:choose>
                                    <c:when test="${currentPage eq i}">
                                        <li class="page-item active"><a class="page-link" href="AccountController?page=${i}">${i}</a></li>
                                        </c:when>
                                        <c:otherwise>
                                        <li class="page-item"><a class="page-link" href="AccountController?page=${i}">${i}</a></li>
                                        </c:otherwise>
                                    </c:choose>
                            </c:forEach>
                            <li class="page-item">
                                <a class="page-link" href="#" aria-label="Next">
                                    <span aria-hidden="true">&raquo;</span>
                                </a>
                            </li>
                        </ul>
                    </nav>
                    <div><p>${NOTIFICATION}</p></div>
                    <div class="row flex-lg-nowrap">
                        <div class="col mb-3">
                            <div class="e-panel card">
                                <div class="card-body">
                                    <div class="e-table">
                                        <div class="table-responsive table-lg mt-3">
                                            <table class="table table-bordered">
                                                <thead>
                                                    <tr>
                                                        <th scope="col" class="text-center">#</th>
                                                        <th scope="col" class="text-center" colspan="1">Mã tài khoản</th>
                                                        <th scope="col" colspan="2">Tên tài khoản</th>                            
                                                        <th scope="col" colspan="3">Email</th>                            
                                                        <th scope="col" class="text-center" colspan="3">Tiện ích</th>
                                                    </tr>
                                                </thead>
                                                <tbody>
                                                    <% int stt = 1;%>
                                                    <c:forEach items="${listAc}" var = "acc" >
                                                        <tr>
                                                            <th scope="row" class="text-center" ><%= stt++%></th>
                                                            <td colspan="1" class="text-center" ><c:out value = "${acc.ma}"/></td>
                                                            <td colspan="2" class="fw-bold text-nowrap "><c:out value = "${acc.ten}"/></td>
                                                            <td colspan="3" class="fw-bold text-nowrap "><c:out value = "${acc.email}"/></td>
                                                            <td colspan="3" class="text-center" >
                                                                <button style="height:3rem;width: 5rem; " type="button" onclick="showMess('${acc.ma}')" class="btn btn-danger">Xóa</button>
                                                            </td>
                                                        </tr>
                                                    </c:forEach>
                                                </tbody>
                                            </table>
                                        </div>
                                    </div>
                                </div>
                            </div>                          
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
    <script>

        function showMess(madt) {
            var option = confirm('Bạn muốn xóa chứ');
            if (option === true) {
                window.location.href = 'AccountController?action=DELETE&ma=' + madt;
            }

        }
    </script>
</html>
