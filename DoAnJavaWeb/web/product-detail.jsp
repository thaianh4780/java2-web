<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>

    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no">
        <title>Product Detail</title>
        <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Montserrat:400,400i,700,700i,600,600i">
        <link rel="stylesheet" href="assets/fonts/simple-line-icons.min.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/baguettebox.js/1.10.0/baguetteBox.min.css">
        <link rel="stylesheet" href="assets/css/smoothproducts.css">
    </head>

    <body>
        <%@ include file="header.jsp" %>
        <main class="page product-page">
            <section class="clean-block clean-product dark">
                <div class="container">
                    <div class="block-heading">
                        <h2 class="text-info">Product Page</h2>
                    </div>
                    <div class="block-content">
                        <div class="product-info">
                            <div class="row">
                                <div class="col-md-6">
                                    <img src="uploads/${product.hinh}" class="img-fluid h-50 w-100 border border-dark" alt="Cart Img cart">
                                </div>
                                <div class="col-md-6">
                                    <div class="info">
                                        <h3 class="text-capitalize font-weight-bold" >${product.ten}</h3>
                                        <div class="rating m-3">
                                            <img src="assets/img/star.svg">
                                            <img src="assets/img/star.svg">
                                            <img src="assets/img/star.svg">
                                            <img src="assets/img/star-half-empty.svg">
                                            <img src="assets/img/star-empty.svg">
                                        </div>
                                        <div class="price mx-3">
                                            <h3 class="font-weight-light ms-3" >${product.gia} $</h3>
                                            <a href="shopping-cart.jsp" style="text-decoration: none;">
                                        </div> 
                                        <button class="btn btn-primary" type="button">
                                            <i class="icon-basket text-white"></i>
                                             <a href="CartController?action=ADD&ma=${p.ma}" style="text-decoration: none; color: #fff">Add
                                                    to Cart</a>
                                        </button>
                                        </a>
                                        <div class="summary">
                                            <p>
                                                ${product.moTa}
                                            </p>
                                        </div>
                                    </div>
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