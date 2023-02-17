<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>

    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no">
        <title>Product</title>
        <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Montserrat:400,400i,700,700i,600,600i">
        <link rel="stylesheet" href="assets/fonts/simple-line-icons.min.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/baguettebox.js/1.10.0/baguetteBox.min.css">
        <link rel="stylesheet" href="assets/css/smoothproducts.css">
        <!-- CSS only -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

    </head>

    <body>
        <%@ include file="header.jsp" %>
        <main class="page catalog-page">
            <section class="clean-block clean-catalog dark">
                <div class="container">
                    <div class="block-heading">
                    </div>
                    <div class="content">
                        <div class="row">
                            <div class="col-md-3">
                                <div class="d-none d-md-block">
                                    <div class="filters">
                                        <div class="filter-item">
                                            <h3>Categories</h3>
                                            <div style="padding:5px 0;" ><a style="text-decoration:none;  font-weight: bold" href="ProductController">Tất cả Danh Mục</a></div>
                                            <c:forEach items="${listC}" var = "c" >
                                                <div style="padding:5px 0;" ><a class="${id == c.ma? "link-dark" : "" }" style="text-decoration:none;" href="ProductController?ma=${c.ma}">${c.ten}</a></div>
                                                </c:forEach>
                                        </div>

                                    </div>
                                </div>

                            </div>
                            <div class="col-md-9">
                                <div class="products">
                                    <div class="row no-gutters">

                                        <c:forEach items="${list}" var = "p" >
                                            <div class="col-12 col-md-6 col-lg-3">
                                                <div class="clean-product-item">
                                                    <div class="image">
                                                        <a  href="ProductController?action=DETAIL&pid=${p.ma}">
                                                            <img src="uploads/${p.hinh}" class="img-fluid" alt="Cart Img cart" style="height: 200px; width: 180px;" >
                                                        </a>
                                                    </div>
                                                    <div class="product-name">
                                                        <a href="ProductController?action=DETAIL&pid=${p.ma}" style="text-decoration:none;">
                                                            ${p.ten}
                                                        </a>
                                                    </div>
                                                    <div class="product-name">
                                                        <a href="ProductController?action=DETAIL&pid=${p.ma}" style="text-decoration:none;"  >
                                                            ${p.gia} $
                                                        </a>
                                                    </div>

                                                     <button class="btn btn-primary" type="button"><i class="icon-basket"><a href="CartController?action=ADD&ma=${p.ma}" style="text-decoration: none; color: #fff">Add
                                                    to Cart</a></i></button>
                                                </div>
                                            </div>
                                        </c:forEach>


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
                                                        <li class="page-item active"><a class="page-link" href="ProductController?page=${i}">${i}</a></li>
                                                        </c:when>
                                                        <c:otherwise>
                                                        <li class="page-item"><a class="page-link" href="ProductController?page=${i}">${i}</a></li>
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
                                </div>
                            </div>
                        </div>
                    </div>
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