<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>

    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no">
        <title>Shopping Cart</title>
        <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Montserrat:400,400i,700,700i,600,600i">
        <link rel="stylesheet" href="assets/fonts/simple-line-icons.min.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/baguettebox.js/1.10.0/baguetteBox.min.css">
        <link rel="stylesheet" href="assets/css/smoothproducts.css">
                <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    </head>

    <body>
        <%@ include file="header.jsp" %>
        <main class="page shopping-cart-page">
            <section class="clean-block clean-cart dark">
                <div style="margin-left: 80px; margin-right: 80px">
                    <div class="block-heading">
                        <h2 class="text-info">Shopping Cart</h2>
                    </div>
                    <button style="height:3rem;width: 10rem; margin-left: 1rem; margin-bottom: 1rem " type="button" onclick="showMessDeleteCart()" class="btn btn-danger">Detele Cart</button>
                    <div class="content">
                        <div class="row no-gutters">
                            <div class="col-md-12 col-lg-9">
                                <div class="items">
                                    <c:if test="${sessionScope.cart2 != null}" >
                                        <c:forEach items="${sessionScope.cart2}" var="p">	
                                            <div class="product">
                                                <div class="row justify-content-center align-items-center">
                                                    <div class="col-md-2">
                                                        <div>
                                                            <img class="img-fluid d-block mx-auto image" src="uploads/${p.getKey().getHinh()}"/>
                                                        </div>
                                                    </div>
                                                    <div class="col-md-2 product-info">
                                                        <a class="product-name text-decoration-none text-dark text-capitalize text-nowrap text-center me-3 " href="#">${p.getKey().getTen()}</a>
                                                    </div>
                                                    <div class="col-6 col-md-2 ">
                                                        <a class=" text-decoration-none text-dark" href="CartController?action=DECREASE&ma=${p.getKey().getMa()}">
                                                            <button class="btn btn-outline-dark rounded-circle">-</button>
                                                        </a>
                                                        <a class="col-2 text-decoration-none text-dark" >${p.getValue()}</a>
                                                        <a class=" text-decoration-none text-dark" href="CartController?action=INCREASE&ma=${p.getKey().getMa()}">
                                                            <button class="btn btn-outline-dark rounded-circle">+</button>
                                                        </a>
                                                    </div>
                                                    <div class="col-6 col-md-2 "><span>${p.getKey().getGia()} $</span></div>
                                                    <div class="col-6 col-md-2 "><span>${p.getKey().getGia() * p.getValue()} $</span></div>
                                                    <div class="col-6 col-md-2 "><button style="height:3rem;width: 5rem; margin-left: 1rem; " type="button" onclick="showMess('${p.getKey().getMa()}')" class="btn btn-danger">Xóa</button></div>

                                                </div>
                                            </div>
                                                    <hr>
                                        </c:forEach>	
                                    </c:if>
                                </div>
                            </div>
                            <div class="col-md-12 col-lg-3">
                                <div class="summary">
                                    <h3>Summary</h3>
                                    <h4><span class="text">Subtotal</span><span class="price">${total} $</span></h4>
                                    <h4><span class="text">Discount</span><span class="price">$0</span></h4>
                                    <h4><span class="text">Shipping</span><span class="price">$0</span></h4>
                                    <a href="CartController?action=DELETE" style="text-decoration: none;" >

                                        <h4><span class="text">Total</span><span class="price">${total} $</span></h4><button class="btn btn-primary btn-block btn-lg" type="button">Payment</button>
                                    </a>
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
        <script>

        function showMessDeleteCart() {
            var option = confirm('Bạn muốn xoá giỏ hàng chứ');
            if (option === true) {
                window.location.href = 'CartController?action=DELETE';
            }

        }
        function showMess(ma) {
            var option = confirm('Bạn muốn xoá 1 đơn hàng chứ');
            if (option === true) {
                window.location.href = 'CartController?action=DELETEONE&ma='+ ma;
            }

        }
    </script>
    </body>

</html>