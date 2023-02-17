package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class product_002dlist_002dadmin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_url_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_url_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_out_value_nobody.release();
    _jspx_tagPool_c_url_value_nobody.release();
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\"/>\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\"/>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"/>\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\"\n");
      out.write("              integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\">\n");
      out.write("        <link href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/bootstrap/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Montserrat:400,400i,700,700i,600,600i\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/fonts/simple-line-icons.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/baguettebox.js/1.10.0/baguetteBox.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/smoothproducts.css\">\n");
      out.write("\n");
      out.write("\n");
      out.write("        <title> Shop Dien Thoai</title>\n");
      out.write("\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js\" ></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js\" ></script>\n");
      out.write("\n");
      out.write("        <style> *{\n");
      out.write("            }\n");
      out.write("            .img-fluid{\n");
      out.write("                width: 100px;\n");
      out.write("                height:100px;\n");
      out.write("            }\n");
      out.write("            body{\n");
      out.write("                margin-top:20px;\n");
      out.write("                background:#f8f8f8\n");
      out.write("            }\n");
      out.write("            .image-product{\n");
      out.write("                width: 100px;\n");
      out.write("                height:100px;\n");
      out.write("            }\n");
      out.write("            .header{\n");
      out.write("                text-decoration: none;\n");
      out.write("                color: #000;\n");
      out.write("            }\n");
      out.write("            .header:hover{\n");
      out.write("                color: #000;\n");
      out.write("            }\n");
      out.write("            .btnAdd{\n");
      out.write("                text-decoration: none;\n");
      out.write("                color: #fff;\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 0;\n");
      out.write("            }\n");
      out.write("            .btnAdd:hover{\n");
      out.write("                color: #fff;\n");
      out.write("            }\n");
      out.write("            .d-flex{\n");
      out.write("                justify-content: center;\n");
      out.write("                align-items: center;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .btnSeacrh{\n");
      out.write("                margin-top: 0px;\n");
      out.write("                margin-right: 20px;\n");
      out.write("                text-decoration: none;\n");
      out.write("                color: #fff;\n");
      out.write("                background: #ea4335;\n");
      out.write("                border: 1px solid #ea4335 ;\n");
      out.write("                border-radius: 5px;\n");
      out.write("                width: 130px;\n");
      out.write("                height: 35px;\n");
      out.write("            }\n");
      out.write("            .nav-link button{\n");
      out.write("                margin-top: 10px;\n");
      out.write("                background: #308ea1;\n");
      out.write("                color: white;\n");
      out.write("                border: 1px solid white;\n");
      out.write("                height: 40px;\n");
      out.write("                width: 90px;\n");
      out.write("                border-radius: 5px;   \n");
      out.write("            }\n");
      out.write("            .nav-link button:hover{\n");
      out.write("                background: white;\n");
      out.write("                border: 1px solid #308ea1;\n");
      out.write("                color: #308ea1;\n");
      out.write("                transition: 1s;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header>\n");
      out.write("            <nav class=\"navbar navbar-expand-lg navbar-light bg-light\" >\n");
      out.write("                <div class=\"pl-3 \">\n");
      out.write("                    <h1 class=\"m-3 \" ><a class=\"header\" style=\"text-decoration:none\" href=\"home\">Brand</a></h1>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("                    <ul class=\"navbar-nav mr-auto\">\n");
      out.write("                        <li class=\"nav-item\" style=\"padding-left:1000px\" >\n");
      out.write("                            <a class=\"nav-link\" href=\"login.jsp\">\n");
      out.write("                                <button class=\"test\" > Log Out </button>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\"  >\n");
      out.write("                            <a class=\"nav-link\" href=\"home\">\n");
      out.write("                                <button class=\"test\"> Home </button>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul> \n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("        </header>\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <div class=\"row flex-lg-nowrap\">\n");
      out.write("                <div class=\"col-2\">\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"col-9\">\n");
      out.write("                    <div class=\"e-tabs mb-3 px-3\">\n");
      out.write("                        <ul class=\"nav nav-tabs\" style=\"justify-content: space-between\" >\n");
      out.write("\n");
      out.write("                            <li class=\"nav-item\"><a class=\"nav-link active\" href=\"#\">Điện thoại</a></li>\n");
      out.write("                            <li class=\"nav-item\">   <button class=\"btn btn-info btn-block\" type=\"button\">\n");
      out.write("                                    <a class=\"btnAdd\" href=\"addform.jsp\" style=\"text-decoration: none\" >\n");
      out.write("                                        Add product\n");
      out.write("                                    </a>\n");
      out.write("                                </button></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"row flex-lg-nowrap\">\n");
      out.write("                        <div class=\"col mb-3\">\n");
      out.write("                            <div class=\"e-panel card\">\n");
      out.write("                                <div class=\"card-body\">\n");
      out.write("                                    <div class=\"e-table\">\n");
      out.write("                                        <div class=\"table-responsive table-lg mt-3\">\n");
      out.write("                                            <table class=\"table table-bordered\">\n");
      out.write("                                                <thead>\n");
      out.write("                                                    <tr>\n");
      out.write("                                                        <th scope=\"col\">#</th>\n");
      out.write("                                                        <th scope=\"col\" colspan=\"2\">Mã sản phẩm</th>\n");
      out.write("                                                        <th scope=\"col\" colspan=\"3\">Tên sản phẩm</th>\n");
      out.write("                                                        <th scope=\"col\" colspan=\"4\">Giá</th>\n");
      out.write("                                                        <th scope=\"col\" colspan=\"6\">Mã danh mục</th>\n");
      out.write("                                                        <th scope=\"col\" colspan=\"7\">Hình ảnh</th>\n");
      out.write("                                                        <th scope=\"col\" colspan=\"8\">Tiện ích</th>\n");
      out.write("\n");
      out.write("                                                    </tr>\n");
      out.write("                                                </thead>\n");
      out.write("                                                <tbody>\n");
      out.write("                                                    ");
 int stt = 1;
      out.write("\n");
      out.write("\n");
      out.write("                                                    ");
      //  c:forEach
      org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
      _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
      _jspx_th_c_forEach_0.setParent(null);
      _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dsDienThoai}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
      _jspx_th_c_forEach_0.setVar("i");
      int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
      try {
        int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
        if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\n");
            out.write("                                                        <tr>\n");
            out.write("\n");
            out.write("                                                            <th scope=\"row\">");
            out.print( stt++);
            out.write("</th>\n");
            out.write("                                                            <td colspan=\"2\">");
            if (_jspx_meth_c_out_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
              return;
            out.write("</td>\n");
            out.write("                                                            <td colspan=\"3\" class=\"fw-bold text-nowrap \"><a href=\"");
            if (_jspx_meth_c_url_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
              return;
            out.write('"');
            out.write('>');
            if (_jspx_meth_c_out_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
              return;
            out.write("</a></td>\n");
            out.write("                                                            <td colspan=\"4\" text-nowrap align-middle>");
            if (_jspx_meth_c_out_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
              return;
            out.write("</td>\n");
            out.write("\n");
            out.write("                                                            <td colspan=\"6\">");
            if (_jspx_meth_c_out_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
              return;
            out.write("</td>\n");
            out.write("                                                            <td class=\"align-middle text-center image-product\" colspan=\"7\">\n");
            out.write("\n");
            out.write("                                                                <div class=\"bg-light d-inline-flex justify-content-center align-items-center align-top\" style=\"width: 100px; height: 100px; border-radius: 3px;\"><img src=\"");
            if (_jspx_meth_c_out_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
              return;
            out.write("\" class=\"img-fluid\" alt=\"");
            if (_jspx_meth_c_out_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
              return;
            out.write("\"></div>\n");
            out.write("                                                            </td>\n");
            out.write("                                                            <td colspan=\"8\" >\n");
            out.write("                                                                <button style=\"height:3rem;width: 5rem; margin-top: 4px; margin-left: 2rem; \"  type=\"button\" class=\"btn btn-success mb-1\" ><a  style=\"text-decoration:none\" class=\"btnAdd\" href=\"update?madt=");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.getMadt()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("\">Sửa</a></button>\n");
            out.write("                                                                <button style=\"height:3rem;width: 5rem; margin-left: 1rem; \" type=\"button\" onclick=\"showMess('");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.getMadt()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("')\" class=\"btn btn-danger\">Xóa</button>\n");
            out.write("\n");
            out.write("                                                            </td>\n");
            out.write("                                                        </tr>\n");
            out.write("                                                    ");
            int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_forEach_0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_forEach_0.doFinally();
        _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
      }
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                </tbody>\n");
      out.write("                                            </table>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>                          \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("    <script>\n");
      out.write("\n");
      out.write("        function showMess(madt) {\n");
      out.write("            var option = confirm('Bạn muốn xóa chứ');\n");
      out.write("            if (option === true) {\n");
      out.write("                window.location.href = 'delete?madt=' + madt;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        }\n");
      out.write("    </script>\n");
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

  private boolean _jspx_meth_c_out_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_0.setPageContext(_jspx_page_context);
    _jspx_th_c_out_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.getMadt()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_0 = _jspx_th_c_out_0.doStartTag();
    if (_jspx_th_c_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
    return false;
  }

  private boolean _jspx_meth_c_url_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_0.setPageContext(_jspx_page_context);
    _jspx_th_c_url_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_url_0.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("/HienThiDTServlet?id=${i.madanhmuc}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_url_0 = _jspx_th_c_url_0.doStartTag();
    if (_jspx_th_c_url_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_0);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_0);
    return false;
  }

  private boolean _jspx_meth_c_out_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_1.setPageContext(_jspx_page_context);
    _jspx_th_c_out_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.getTendt()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_1 = _jspx_th_c_out_1.doStartTag();
    if (_jspx_th_c_out_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
    return false;
  }

  private boolean _jspx_meth_c_out_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_2 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_2.setPageContext(_jspx_page_context);
    _jspx_th_c_out_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.getGiadt()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_2 = _jspx_th_c_out_2.doStartTag();
    if (_jspx_th_c_out_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
    return false;
  }

  private boolean _jspx_meth_c_out_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_3 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_3.setPageContext(_jspx_page_context);
    _jspx_th_c_out_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_3.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.getMadanhmuc()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_3 = _jspx_th_c_out_3.doStartTag();
    if (_jspx_th_c_out_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_3);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_3);
    return false;
  }

  private boolean _jspx_meth_c_out_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_4 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_4.setPageContext(_jspx_page_context);
    _jspx_th_c_out_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_4.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.getHinhanh()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_4 = _jspx_th_c_out_4.doStartTag();
    if (_jspx_th_c_out_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_4);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_4);
    return false;
  }

  private boolean _jspx_meth_c_out_5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_5 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_5.setPageContext(_jspx_page_context);
    _jspx_th_c_out_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_5.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.getTendt()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_5 = _jspx_th_c_out_5.doStartTag();
    if (_jspx_th_c_out_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_5);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_5);
    return false;
  }
}
