package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class product_002dlist_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("        <title>Catalog - Brand</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/bootstrap/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Montserrat:400,400i,700,700i,600,600i\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/fonts/simple-line-icons.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/baguettebox.js/1.10.0/baguetteBox.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/smoothproducts.css\">\n");
      out.write("        <!-- CSS only -->\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <nav class=\"navbar navbar-light navbar-expand-lg fixed-top bg-white clean-navbar\">\n");
      out.write("            <div class=\"container\"><a class=\"navbar-brand logo\" href=\"home\">Brand</a><button data-toggle=\"collapse\" class=\"navbar-toggler\" data-target=\"#navcol-1\"><span class=\"sr-only\">Toggle navigation</span><span class=\"navbar-toggler-icon\"></span></button>\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navcol-1\">\n");
      out.write("                    <ul class=\"navbar-nav ml-auto\">\n");
      out.write("                        <!-- tim kiem -->\n");
      out.write("                        <li class=\"nav-item\" style=\"margin-right: 5rem; margin-left:10px;\">\n");
      out.write("                            <form class=\"d-flex\" action=\"search\" method=\"post\">\n");
      out.write("                                <input class=\"form-control me-2\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\" name=\"txt\">\n");
      out.write("                                <button class=\"btn btn-outline-success\" type=\"submit\">Search</button>\n");
      out.write("                            </form>\n");
      out.write("                        </li>\n");
      out.write("                        <!-- tim kiem -->\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link\" href=\"home\">Home</a></li>\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link active\" href=\"category\">Catalog</a></li>    \n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link\" href=\"shopping-cart.jsp\">Shopping Cart</a></li>\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link\" href=\"about\">About Us</a></li>\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link\" href=\"login.jsp\">Login</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        <main class=\"page catalog-page\">\n");
      out.write("            <section class=\"clean-block clean-catalog dark\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"block-heading\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"content\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-md-3\">\n");
      out.write("                                <div class=\"d-none d-md-block\">\n");
      out.write("                                    <div class=\"filters\">\n");
      out.write("                                        <div class=\"filter-item\">\n");
      out.write("                                            <h3>Categories</h3>\n");
      out.write("                                            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-9\">\n");
      out.write("                                <div class=\"products\">\n");
      out.write("                                    <div class=\"row no-gutters\">\n");
      out.write("\n");
      out.write("                                        ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                    <nav>\n");
      out.write("                                        <ul class=\"pagination\">\n");
      out.write("                                            <li class=\"page-item disabled\"><a class=\"page-link\" href=\"#\" aria-label=\"Previous\"><span aria-hidden=\"true\">«</span></a></li>\n");
      out.write("                                            <li class=\"page-item active\"><a class=\"page-link\" href=\"#\">1</a></li>\n");
      out.write("                                            <li class=\"page-item\"><a class=\"page-link\" href=\"#\">2</a></li>\n");
      out.write("                                            <li class=\"page-item\"><a class=\"page-link\" href=\"#\">3</a></li>\n");
      out.write("                                            <li class=\"page-item\"><a class=\"page-link\" href=\"#\" aria-label=\"Next\"><span aria-hidden=\"true\">»</span></a></li>\n");
      out.write("                                        </ul>\n");
      out.write("                                    </nav>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </section>\n");
      out.write("        </main>\n");
      out.write("        <footer class=\"page-footer dark\">\n");
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
      out.write("                        <h5>About us</h5>\n");
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
      out.write("                <p>© 2021 Copyright Text</p>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listC}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("o");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                                <div style=\"padding:5px 0;\" ><a class=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tag == o.id? \"link-dark\" : \"\" }", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" style=\"text-decoration:none;\" href=\"danhmuc?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></div>\n");
          out.write("                                                ");
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
    _jspx_th_c_forEach_1.setVar("o");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                            <div class=\"col-12 col-md-6 col-lg-3\">\n");
          out.write("                                                <div class=\"clean-product-item\">\n");
          out.write("                                                    <div class=\"image\">\n");
          out.write("                                                        <a  href=\"detail?pid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.madt}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                                                            <img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.hinhanh}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"img-fluid\" alt=\"Cart Img cart\" style=\"height: 150px; width: 180px;\" >\n");
          out.write("                                                        </a>\n");
          out.write("                                                    </div>\n");
          out.write("                                                    <div class=\"product-name\">\n");
          out.write("                                                        <a href=\"detail?pid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.madt}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" style=\"text-decoration:none;\"  >\n");
          out.write("                                                            ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.tendt}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                                                        </a>\n");
          out.write("                                                    </div>\n");
          out.write("                                                    <div class=\"about\">\n");
          out.write("                                                        <div class=\"price\">\n");
          out.write("                                                            <h3>\n");
          out.write("                                                                ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.giadt}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" \n");
          out.write("                                                            </h3>\n");
          out.write("                                                        </div>\n");
          out.write("                                                    </div>\n");
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
