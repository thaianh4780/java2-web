package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/footer.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, shrink-to-fit=no\">\n");
      out.write("        <title>Home</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/bootstrap/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Montserrat:400,400i,700,700i,600,600i\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/fonts/simple-line-icons.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/baguettebox.js/1.10.0/baguetteBox.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/smoothproducts.css\">\n");
      out.write("                <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        ");
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
      out.write("                                <input class=\"form-control me-2\" type=\"text\" placeholder=\"Search\" aria-label=\"Search\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${txtS}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"txt\">\n");
      out.write("                                <button class=\"btn btn-outline-success\" type=\"submit\">Search</button>\n");
      out.write("                            </form>\n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("                        <!-- tim kiem -->\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link\" href=\"HomeController\">Home</a></li>\n");
      out.write("                            ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link\" href=\"ProductController?action=LIST\">Book</a></li>  \n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link text-nowrap\" href=\"AccountController?action=SHOW\">List Account</a></li>  \n");
      out.write("\n");
      out.write("                        ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                            ");
      if (_jspx_meth_c_if_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <a  class=\"btn btn-success btn-sm ml-2\" href=\"CartController?action=LIST\">\n");
      out.write("                    <i class=\"fa fa-shopping-cart\"></i> Cart\n");
      out.write("                    <span class=\"badge\">\n");
      out.write("                        ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.qty}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("                    </span>\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </nav>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("        <main class=\"page landing-page\">\n");
      out.write("            <section class=\"clean-block slider dark\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"block-heading\">\n");
      out.write("                        <h2 class=\"text-info\">Các Mẫu Sản Phẩm Hot</h2>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"carousel slide\" data-ride=\"carousel\" id=\"carousel-1\">\n");
      out.write("                        <div class=\"carousel-inner\">\n");
      out.write("                            <div class=\"carousel-item active\">\n");
      out.write("                                <img style=\"height: 600px; width: 140px;\" class=\"w-100 d-block\" src=\"uploads/Ngu-van-10-nang-cao-tap-1-1.jpg\" alt=\"Slide Image\">\n");
      out.write("                            </div>\n");
      out.write("                            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <div><a class=\"carousel-control-prev\" href=\"#carousel-1\" role=\"button\" data-slide=\"prev\"><span class=\"carousel-control-prev-icon\"></span><span class=\"sr-only\">Previous</span></a><a class=\"carousel-control-next\" href=\"#carousel-1\" role=\"button\"\n");
      out.write("                                                                                                                                                                                                        data-slide=\"next\"><span class=\"carousel-control-next-icon\"></span><span class=\"sr-only\">Next</span></a></div>\n");
      out.write("                        <ol class=\"carousel-indicators\">\n");
      out.write("                            <li data-target=\"#carousel-1\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("                            <li data-target=\"#carousel-1\" data-slide-to=\"1\"></li>\n");
      out.write("                            <li data-target=\"#carousel-1\" data-slide-to=\"2\"></li>\n");
      out.write("                        </ol>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </section>\n");
      out.write("            <section class=\"clean-block clean-catalog dark\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"block-heading\">\n");
      out.write("                        <h2 class=\"text-info\">Sản Phẩm </h2>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"content\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-md-12\">\n");
      out.write("                                <div class=\"products\" style=\"margin-left:20px;\">\n");
      out.write("                                    <div class=\"row no-gutters\">\n");
      out.write("                                        ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("            </section>\n");
      out.write("        </main>\n");
      out.write("        ");
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
      out.write("        <script src=\"assets/js/jquery.min.js\"></script>\n");
      out.write("        <script src=\"assets/bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/baguettebox.js/1.10.0/baguetteBox.min.js\"></script>\n");
      out.write("        <script src=\"assets/js/smoothproducts.min.js\"></script>\n");
      out.write("        <script src=\"assets/js/theme.js\"></script>\n");
      out.write("    </body>\n");
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
        out.write("                            <li class=\"nav-item\"><a class=\"nav-link\" style=\"font-weight: bold\" href=\"ProductAdminController\">Manager</a></li>\n");
        out.write("                            ");
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
        out.write("                            <li class=\"nav-item\"><a class=\"nav-link text-nowrap\" style=\"font-weight: bold\" href=\"AccountController?action=DETAIL&ma=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.ma}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">Welcome     ");
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
        out.write("                            ");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listP}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("p");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                <div class=\"carousel-item\">\n");
          out.write("                                    <img style=\"height: 600px; width: 140px;\" class=\"w-100 d-block\" src=\"uploads/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.hinh}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"Slide Image\">\n");
          out.write("                                </div>\n");
          out.write("                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listP}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVar("p");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                            <div class=\"col-12 col-md-6 col-lg-3\">\n");
          out.write("                                                <div class=\"clean-product-item\">\n");
          out.write("                                                    <div class=\"image\">\n");
          out.write("                                                        <a  href=\"ProductController?action=DETAIL&pid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.ma}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                                                            <img src=\"uploads/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.hinh}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"img-fluid\" alt=\"Cart Img cart\" style=\"height: 200px; width: 180px;\" >\n");
          out.write("                                                        </a>\n");
          out.write("                                                    </div>  \n");
          out.write("                                                    <div class=\"product-name text-capitalize text-truncate pt-2\">\n");
          out.write("                                                        <a href=\"ProductController?action=DETAIL&pid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.ma}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                                                            ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.ten}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                                                        </a>\n");
          out.write("                                                    </div>\n");
          out.write("                                                    <div class=\"about\">\n");
          out.write("                                                        <div class=\"price mb-3 font-weight-light \">\n");
          out.write("                                                            <h3>\n");
          out.write("                                                                ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.gia}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" $\n");
          out.write("                                                            </h3>\n");
          out.write("                                                        </div>\n");
          out.write("                                                    </div>\n");
          out.write("                                                    <button class=\"btn btn-primary\" type=\"button\">\n");
          out.write("                                                        <i class=\"icon-basket\"> </i>\n");
          out.write("                                                        <a href=\"CartController?action=ADDHOME&ma=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.ma}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" style=\"text-decoration: none; color: #fff\">Add to Cart</a>\n");
          out.write("                                                    </button>\n");
          out.write("                                                </div>\n");
          out.write("                                            </div>\n");
          out.write("                                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }
}
