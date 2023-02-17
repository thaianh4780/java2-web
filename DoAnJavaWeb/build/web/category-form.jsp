<%-- 
    Document   : addform
    Created on : Nov 9, 2021, 3:29:32 PM
    Author     : PC
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8"/>
        <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
        <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
        <!--        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">-->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
              integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.11.2/css/all.min.css" rel="stylesheet">

        <title>Category Manager</title>
        <style>

            .contact-info__wrapper {
                overflow: hidden;
                border-radius: .625rem ;
            }

            @media (min-width: 1024px) {
                .contact-info__wrapper {
                    border-radius:  .625rem ;
                    padding: 3rem !important
                }
            }
            .contact-info__list span.position-absolute {
                left: 0
            }
            .z-index-101 {
                z-index: 101;
            }
            .list-style--none {
                list-style: none;
            }

            @media (min-width: 1024px) {
                .contact__wrapper {
                    border-radius: .625rem 0 .625rem .625rem
                }
            }
            @media (min-width: 1024px) {
                .contact-form__wrapper {
                    padding: 3rem !important
                }
            }
            .thongBao{
                color: red;
            }
        </style>
    </head>
    <body>
        <div class="container">
            <div class="contact__wrapper  mt-n9 py-3">
                <div class="row shadow-lg no-gutters">
                    <div class="col-lg-12  contact-info__wrapper gradient-brand-color order-lg-2">
                        <h3 class="color--white">Thêm Danh Mục</h3>
                        <div class="thongBao">
                            ${thongBaoThem}
                        </div>
                        <div class="col-lg-7   order-lg-1">
                            <form action="DanhMucController" method="post" class="contact-form form-validate" >
                                <div class="row">
                                    <div class="col-sm-12 mb-3">
                                                                              
                                        <div class="thongBao">
                                            ${thongBaoMadt}
                                        </div>
                                    </div>

                                    <div class="col-sm-6 mb-3">
                                        <input type = "hidden" name = "ma" value = "${c.ma}"/>
                                        <div class="form-group">
                                            <label for="lastName">Tên danh mục</label>
                                            <input type="text" class="form-control" id="lastName" name="ten" value="${c.ten}">
                                        </div>

                                    </div>

                                    <div class="col-sm-6 mb-3">
                                        <div class="form-group">
                                            <label class="required-field" for="email">Ghi chú</label>
                                            <input type="text" class="form-control" id="email" name="ghichu" value="${c.ghiChu}">
                                        </div>

                                    </div>

                                    
                                    <div class="col-sm-12 mb-3">
                                        <button type="submit" name="submit" class="btn btn-primary">Submit</button>
                                    </div>

                                </div>
                            </form>
                        </div>
                    </div>

                </div>
            </div>
        </div>


    </body>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"></script>
</html>
