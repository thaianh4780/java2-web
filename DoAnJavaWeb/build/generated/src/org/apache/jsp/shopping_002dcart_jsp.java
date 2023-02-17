package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class shopping_002dcart_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/footer.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_if_test.release();
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, shrink-to-fit=no\">\n");
      out.write("    <title>Shopping Cart</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/bootstrap/css/bootstrap.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Montserrat:400,400i,700,700i,600,600i\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/fonts/simple-line-icons.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/baguettebox.js/1.10.0/baguetteBox.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/smoothproducts.css\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("     ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <nav class=\"navbar navbar-light navbar-expand-lg fixed-top bg-white clean-navbar\">\n");
      out.write("            <div class=\"container\"><a class=\"navbar-brand logo\" href=\"HomeController\">Shop</a><button data-toggle=\"collapse\" class=\"navbar-toggler\" data-target=\"#navcol-1\"><span class=\"sr-only\">Toggle navigation</span><span class=\"navbar-toggler-icon\"></span></button>\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navcol-1\">\n");
      out.write("                    <ul class=\"navbar-nav ml-auto\">\n");
      out.write("                        <!-- tim kiem -->\n");
      out.write("                        <li class=\"nav-item\" style=\"margin-right: 5rem; margin-left:10px;\">\n");
      out.write("                            <form class=\"d-flex\" action=\"ProductController?action=SEARCH\" method=\"post\">\n");
      out.write("                                <input class=\"form-control me-2\" type=\"text\" placeholder=\"Search\" aria-label=\"Search\" name=\"txt\">\n");
      out.write("                                <button class=\"btn btn-outline-success\" type=\"submit\">Search</button>\n");
      out.write("                            </form>\n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("                        <!-- tim kiem -->\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link\" href=\"HomeController\">Home</a></li>\n");
      out.write("                        ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link\" href=\"ProductController?action=LIST\">Book</a></li>    \n");
      out.write("                        ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        ");
      if (_jspx_meth_c_if_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <a class=\"btn btn-success btn-sm ml-2\" href=\"shopping-cart.jsp\">\n");
      out.write("                <i class=\"fa fa-shopping-cart\"></i> Cart\n");
      out.write("                <span class=\"badge\">\n");
      out.write("                    1\n");
      out.write("                </span>\n");
      out.write("            </a>\n");
      out.write("        </nav>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("    <main class=\"page shopping-cart-page\">\n");
      out.write("        <section class=\"clean-block clean-cart dark\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"block-heading\">\n");
      out.write("                    <h2 class=\"text-info\">Shopping Cart</h2>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"content\">\n");
      out.write("                    <div class=\"row no-gutters\">\n");
      out.write("                        <div class=\"col-md-12 col-lg-8\">\n");
      out.write("                            <div class=\"items\">\n");
      out.write("                                <div class=\"product\">\n");
      out.write("                                    <div class=\"row justify-content-center align-items-center\">\n");
      out.write("                                        <div class=\"col-md-3\">\n");
      out.write("                                            <div class=\"product-image\"><img class=\"img-fluid d-block mx-auto image\" src=\"assets/img/tech/image2.jpg\"></div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"col-md-5 product-info\"><a class=\"product-name\" href=\"#\">Lorem Ipsum dolor</a>\n");
      out.write("                                            <div class=\"product-specs\">\n");
      out.write("                                                <div><span>Display:&nbsp;</span><span class=\"value\">5 inch</span></div>\n");
      out.write("                                                <div><span>RAM:&nbsp;</span><span class=\"value\">4GB</span></div>\n");
      out.write("                                                <div><span>Memory:&nbsp;</span><span class=\"value\">32GB</span></div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"col-6 col-md-2 quantity\"><label class=\"d-none d-md-block\" for=\"quantity\">Quantity</label><input type=\"number\" id=\"number\" class=\"form-control quantity-input\" value=\"1\"></div>\n");
      out.write("                                        <div class=\"col-6 col-md-2 price\"><span>$120</span></div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"product\">\n");
      out.write("                                    <div class=\"row justify-content-center align-items-center\">\n");
      out.write("                                        <div class=\"col-md-3\">\n");
      out.write("                                            <div class=\"product-image\"><img class=\"img-fluid d-block mx-auto image\" src=\"assets/img/tech/image2.jpg\"></div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"col-md-5 product-info\"><a class=\"product-name\" href=\"#\">Lorem Ipsum dolor</a>\n");
      out.write("                                            <div class=\"product-specs\">\n");
      out.write("                                                <div><span>Display:&nbsp;</span><span class=\"value\">5 inch</span></div>\n");
      out.write("                                                <div><span>RAM:&nbsp;</span><span class=\"value\">4GB</span></div>\n");
      out.write("                                                <div><span>Memory:&nbsp;</span><span class=\"value\">32GB</span></div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"col-6 col-md-2 quantity\"><label class=\"d-none d-md-block\" for=\"quantity\">Quantity</label><input type=\"number\" id=\"number\" class=\"form-control quantity-input\" value=\"1\"></div>\n");
      out.write("                                        <div class=\"col-6 col-md-2 price\"><span>$120</span></div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"product\">\n");
      out.write("                                    <div class=\"row justify-content-center align-items-center\">\n");
      out.write("                                        <div class=\"col-md-3\">\n");
      out.write("                                            <div class=\"product-image\"><img class=\"img-fluid d-block mx-auto image\" src=\"assets/img/tech/image2.jpg\"></div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"col-md-5 product-info\"><a class=\"product-name\" href=\"#\">Lorem Ipsum dolor</a>\n");
      out.write("                                            <div class=\"product-specs\">\n");
      out.write("                                                <div><span>Display:&nbsp;</span><span class=\"value\">5 inch</span></div>\n");
      out.write("                                                <div><span>RAM:&nbsp;</span><span class=\"value\">4GB</span></div>\n");
      out.write("                                                <div><span>Memory:&nbsp;</span><span class=\"value\">32GB</span></div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"col-6 col-md-2 quantity\"><label class=\"d-none d-md-block\" for=\"quantity\">Quantity</label><input type=\"number\" id=\"number\" class=\"form-control quantity-input\" value=\"1\"></div>\n");
      out.write("                                        <div class=\"col-6 col-md-2 price\"><span>$120</span></div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-12 col-lg-4\">\n");
      out.write("                            <div class=\"summary\">\n");
      out.write("                                <h3>Summary</h3>\n");
      out.write("                                <h4><span class=\"text\">Subtotal</span><span class=\"price\">$360</span></h4>\n");
      out.write("                                <h4><span class=\"text\">Discount</span><span class=\"price\">$0</span></h4>\n");
      out.write("                                <h4><span class=\"text\">Shipping</span><span class=\"price\">$0</span></h4>\n");
      out.write("                                <a href=\"payment-page.jsp\" style=\"text-decoration: none;\" >\n");
      out.write("\n");
      out.write("                                    <h4><span class=\"text\">Total</span><span class=\"price\">$360</span></h4><button class=\"btn btn-primary btn-block btn-lg\" type=\"button\">Checkout</button>\n");
      out.write("                                </a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("    </main>\n");
      out.write("     ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("          <footer class=\"page-footer dark\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-sm-3\">\n");
      out.write("                        <h5>Get started</h5>\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"#\">Home</a></li>\n");
      out.write("                            <li><a href=\"#\">Sign up</a></li>\n");
      out.write("                            <li><a href=\"#\">Downloads</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-3\">\n");
      out.write("                        <a href=\"AccountController?action=SHOW\"><h5>About us</h5></a>\n");
      out.write("                        \n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"#\">Company Information</a></li>\n");
      out.write("                            <li><a href=\"#\">Contact us</a></li>\n");
      out.write("                            <li><a href=\"#\">Reviews</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-3\">\n");
      out.write("                        <h5>Support</h5>\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"#\">FAQ</a></li>\n");
      out.write("                            <li><a href=\"#\">Help desk</a></li>\n");
      out.write("                            <li><a href=\"#\">Forums</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-3\">\n");
      out.write("                        <h5>Legal</h5>\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"#\">Terms of Service</a></li>\n");
      out.write("                            <li><a href=\"#\">Terms of Use</a></li>\n");
      out.write("                            <li><a href=\"#\">Privacy Policy</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"footer-copyright\">\n");
      out.write("                <p class=\"mb-0\">\n");
      out.write("                    Đồ Án Shop Bán Sách<br> Tên: Hà Minh Thắng,\n");
      out.write("                                                 MSSV: 20211TT1477,\n");
      out.write("                                                 Lớp: CD20TT9.\n");
      out.write("                        </p>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("    <script src=\"assets/js/jquery.min.js\"></script>\n");
      out.write("    <script src=\"assets/bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/baguettebox.js/1.10.0/baguetteBox.min.js\"></script>\n");
      out.write("    <script src=\"assets/js/smoothproducts.min.js\"></script>\n");
      out.write("    <script src=\"assets/js/theme.js\"></script>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.quyen == 0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                         <li class=\"nav-item\"><a class=\"nav-link\" style=\"font-weight: bold\" href=\"ProductAdminController\">Manager</a></li>\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\n");
        out.write("                        <li class=\"nav-item\"><a class=\"nav-link\" style=\"font-weight: bold\" href=\"AccountController?action=DETAIL&ma=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.ma}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">Hello ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.ten}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</a></li>\n");
        out.write("                            <li class=\"nav-item\"><a class=\"nav-link\" href=\"AccountController?action=LOGOUT\">LogOut</a></li>\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_if_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent(null);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\n");
        out.write("                            <li class=\"nav-item\"><a class=\"nav-link\" href=\"login.jsp\">Login</a></li>\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }
}
