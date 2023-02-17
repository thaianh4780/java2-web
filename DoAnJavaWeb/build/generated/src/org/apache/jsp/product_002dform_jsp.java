package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class product_002dform_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\"/>\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\"/>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"/>\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\"\n");
      out.write("              integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\">\n");
      out.write("        <link href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.11.2/css/all.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("         <style>\n");
      out.write("              body{\n");
      out.write("                background-image: url('https://i.pinimg.com/originals/7b/bb/c6/7bbbc6d63d2917396d715855313fe94d.jpg');\n");
      out.write("            }\n");
      out.write("             .contact-info__wrapper {\n");
      out.write("                overflow: hidden;\n");
      out.write("                border-radius: .625rem ;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            @media (min-width: 1024px) {\n");
      out.write("                .contact-info__wrapper {\n");
      out.write("                    border-radius:  .625rem ;\n");
      out.write("                    padding: 3rem !important\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            .contact-info__list span.position-absolute {\n");
      out.write("                left: 0\n");
      out.write("            }\n");
      out.write("            .z-index-101 {\n");
      out.write("                z-index: 101;\n");
      out.write("            }\n");
      out.write("            .list-style--none {\n");
      out.write("                list-style: none;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            @media (min-width: 1024px) {\n");
      out.write("                .contact__wrapper {\n");
      out.write("                    border-radius: .625rem 0 .625rem .625rem\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            @media (min-width: 1024px) {\n");
      out.write("                .contact-form__wrapper {\n");
      out.write("                    padding: 3rem !important\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            .thongBao{\n");
      out.write("                color: red;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"contact__wrapper  mt-n9 py-3\">\n");
      out.write("                <div class=\"row shadow-lg no-gutters\">\n");
      out.write("                    <div class=\"col-lg-12  contact-info__wrapper gradient-brand-color order-lg-2\">\n");
      out.write("                        <h3 class=\"color--white\">Thêm sản phẩm</h3>\n");
      out.write("                        <div class=\"thongBao\">\n");
      out.write("                            ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${thongBaoThem}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-lg-7   order-lg-1\">\n");
      out.write("                            <form action=\"add\" method=\"post\" class=\"contact-form form-validate\">\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-sm-6 mb-3\">\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label class=\"required-field\" for=\"firstName\">Mã sản phẩm</label>\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" id=\"firstName\" name=\"madt\">\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"thongBao\">\n");
      out.write("                                            ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${thongBaoMadt}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <div class=\"col-sm-6 mb-3\">\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label for=\"lastName\">Tên sản phẩm</label>\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" id=\"lastName\" name=\"tendt\">\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <div class=\"col-sm-6 mb-3\">\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label class=\"required-field\" for=\"email\">Giá</label>\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" id=\"email\" name=\"giadt\" >\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <div class=\"col-sm-6 mb-3\">\n");
      out.write("                                        <label class=\"required-field\" for=\"email\">Danh mục</label>\n");
      out.write("                                        <div class=\"form-check\">\n");
      out.write("                                            <input class=\"form-check-input\" type=\"radio\" name=\"madanhmuc\" id=\"madanhmuc1\" value=\"a001\" checked >\n");
      out.write("                                            <label class=\"form-check-label\" for=\"madanhmuc1\">\n");
      out.write("                                                Apple\n");
      out.write("                                            </label>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-check\">\n");
      out.write("                                            <input class=\"form-check-input\" type=\"radio\" name=\"madanhmuc\" id=\"madanhmuc2\" value=\"ss01\">\n");
      out.write("                                            <label class=\"form-check-label\" for=\"madanhmuc2\">\n");
      out.write("                                                SamSung\n");
      out.write("                                            </label>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-check\">\n");
      out.write("                                            <input class=\"form-check-input\" type=\"radio\" name=\"madanhmuc\" id=\"madanhmuc3\" value=\"xi001\">\n");
      out.write("                                            <label class=\"form-check-label\" for=\"madanhmuc3\">\n");
      out.write("                                                Xiaomi\n");
      out.write("                                            </label>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-sm-12 mb-3\">\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label for=\"phone\">Hình ảnh</label>\n");
      out.write("                                            <input type=\"tel\" class=\"form-control\" id=\"phone\" name=\"hinhanh\" >\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <div class=\"col-sm-12 mb-3\">\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label class=\"required-field\" for=\"message\">Mô tả</label>\n");
      out.write("                                            <textarea class=\"form-control\" id=\"message\" name=\"mota\" rows=\"4\" ></textarea>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <div class=\"col-sm-12 mb-3\">\n");
      out.write("                                        <button type=\"submit\" name=\"submit\" class=\"btn btn-primary\">Submit</button>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
