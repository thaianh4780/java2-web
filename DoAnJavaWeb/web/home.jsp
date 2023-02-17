<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>

    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no">
        <title>Home</title>
        <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Montserrat:400,400i,700,700i,600,600i">
        <link rel="stylesheet" href="assets/fonts/simple-line-icons.min.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/baguettebox.js/1.10.0/baguetteBox.min.css">
        <link rel="stylesheet" href="assets/css/smoothproducts.css">
                <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    </head>

    <body>
        <%@ include file="header.jsp" %>
        <main class="page landing-page">
            <section class="clean-block slider dark">
                <div class="container">
                    <div class="block-heading">
                        <h2 class="text-info">Các Mẫu Sản Phẩm Hot</h2>

                    </div>
                    <div class="carousel slide" data-ride="carousel" id="carousel-1">
                        <div class="carousel-inner">
                            <div class="carousel-item active">
                                <img style="height: 700px; width: 100px;" class="w-100 d-block" src="uploads/Ngu-van-10-nang-cao-tap-1-1.jpg" alt="Slide Image">
                            </div>
                            <c:forEach items="${listP}" var = "p" >
                                <div class="carousel-item">
                                    <img style="height: 700px; width: 100px;" class="w-100 d-block" src="uploads/${p.hinh}" alt="Slide Image">
                                </div>
                            </c:forEach>
                        </div>
                        <div><a class="carousel-control-prev" href="#carousel-1" role="button" data-slide="prev"><span class="carousel-control-prev-icon"></span><span class="sr-only">Previous</span></a><a class="carousel-control-next" href="#carousel-1" role="button"
                                                                                                                                                                                                        data-slide="next"><span class="carousel-control-next-icon"></span><span class="sr-only">Next</span></a></div>
                        <ol class="carousel-indicators">
                            <li data-target="#carousel-1" data-slide-to="0" class="active"></li>
                            <li data-target="#carousel-1" data-slide-to="1"></li>
                            <li data-target="#carousel-1" data-slide-to="2"></li>
                        </ol>
                    </div>
                </div>
            </section>
            <section class="clean-block clean-catalog dark">
                <div class="container">
                    <div class="block-heading">
                        <h2 class="text-info">Sản Phẩm </h2>
                    </div>
                    <div class="content">
                        <div class="row">
                            <div class="col-md-12">
                                <div class="products" style="margin-left:20px;">
                                    <div class="row no-gutters">
                                        <c:forEach items="${listP}" var = "p" >
                                            <div class="col-12 col-md-6 col-lg-3">
                                                <div class="clean-product-item">
                                                    <div class="image">
                                                        <a  href="ProductController?action=DETAIL&pid=${p.ma}">
                                                            <img src="uploads/${p.hinh}" class="img-fluid" alt="Cart Img cart" style="height: 200px; width: 180px;" >
                                                        </a>
                                                    </div>  
                                                    <div class="product-name text-capitalize text-truncate pt-2">
                                                        <a style="text-decoration: none" href="ProductController?action=DETAIL&pid=${p.ma}">
                                                            ${p.ten}
                                                        </a>
                                                    </div>
                                                    <div class="about">
                                                        <div class="price mb-3 font-weight-light ">
                                                            <h3>
                                                                ${p.gia} $
                                                            </h3>
                                                        </div>
                                                    </div>
                                                    <button class="btn btn-primary" type="button">
                                                        <i class="icon-basket"> </i>
                                                        <a href="CartController?action=ADDHOME&ma=${p.ma}" style="text-decoration: none; color: #fff">Add to Cart</a>
                                                    </button>
                                                </div>
                                            </div>
                                        </c:forEach>
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