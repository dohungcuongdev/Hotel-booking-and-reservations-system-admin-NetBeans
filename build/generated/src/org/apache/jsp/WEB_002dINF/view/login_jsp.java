package org.apache.jsp.WEB_002dINF.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/WEB-INF/view/common/head.jspf");
    _jspx_dependants.add("/WEB-INF/view/common/footer.jspf");
  }

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

      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <title>Hotel Admin</title>\n");
      out.write("        <meta content='width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no' name='viewport'>\n");
      out.write("        <meta name=\"description\" content=\"Developed By M Abdur Rokib Promy\">\n");
      out.write("        <meta name=\"keywords\" content=\"Admin, Bootstrap 3, Template, Theme, Responsive\">\n");
      out.write("        <!-- bootstrap 3.0.2 -->\n");
      out.write("        <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/resources/css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <!-- font Awesome -->\n");
      out.write("        <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/resources/css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <!-- Ionicons -->\n");
      out.write("        <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/resources/css/ionicons.min.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <!-- Morris chart -->\n");
      out.write("        <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/resources/css/morris/morris.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <!-- jvectormap -->\n");
      out.write("        <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/resources/css/jvectormap/jquery-jvectormap-1.2.2.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <!-- Date Picker -->\n");
      out.write("        <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/resources/css/datepicker/datepicker3.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <!-- fullCalendar -->\n");
      out.write("        <!-- <link href=\"css/fullcalendar/fullcalendar.css\" rel=\"stylesheet\" type=\"text/css\" /> -->\n");
      out.write("        <!-- Daterange picker -->\n");
      out.write("        <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/resources/css/daterangepicker/daterangepicker-bs3.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <!-- iCheck for checkboxes and radio inputs -->\n");
      out.write("        <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/resources/css/iCheck/all.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <!-- bootstrap wysihtml5 - text editor -->\n");
      out.write("        <!-- <link href=\"css/bootstrap-wysihtml5/bootstrap3-wysihtml5.min.css\" rel=\"stylesheet\" type=\"text/css\" /> -->\n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=Lato' rel='stylesheet' type='text/css'>\n");
      out.write("        <!-- Theme style -->\n");
      out.write("        <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/resources/css/style.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <link rel=\"shortcut icon\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/resources/img/favicon.png\" type=\"image/x-icon\">\n");
      out.write("        <link rel=\"icon\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/resources/img/favicon.png\" type=\"image/x-icon\">\n");
      out.write("        <!-- sweet alert -->\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/resources/alert/sweetalert-dev.js\"></script> \n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/resources/alert/sweetalert.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\n");
      out.write("\n");
      out.write("        <!-- Resources -->\n");
      out.write("        <script src=\"https://www.amcharts.com/lib/3/amcharts.js\"></script>\n");
      out.write("        <script src=\"https://www.amcharts.com/lib/3/serial.js\"></script>\n");
      out.write("        <script src=\"https://www.amcharts.com/lib/3/plugins/export/export.min.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://www.amcharts.com/lib/3/plugins/export/export.css\" type=\"text/css\" media=\"all\" />\n");
      out.write("        <script src=\"https://www.amcharts.com/lib/3/themes/light.js\"></script>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <!-- My Styles -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/resources/mystyles.css\">\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body class=\"skin-black\">");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Right side column. Contains the navbar and content of the page -->\n");
      out.write("<aside class=\"right-side\">\n");
      out.write("    <!-- Content Header (Page header) -->\n");
      out.write("\n");
      out.write("    <!-- Main content -->\n");
      out.write("    <section class=\"content midscreen\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-lg-8\">\n");
      out.write("                <section class=\"panel\">\n");
      out.write("                    <header class=\"panel-heading\">\n");
      out.write("                        <p id=\"login-title\">Holiday Crown Administrator<p>\n");
      out.write("                    </header>\n");
      out.write("                    <div class=\"panel-body\">\n");
      out.write("                        <form class=\"form-horizontal\" role=\"form\">\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"inputEmail1\" class=\"col-lg-2 col-sm-2 control-label\">Email</label>\n");
      out.write("                                <div class=\"col-lg-10\">\n");
      out.write("                                    <input type=\"email\" class=\"form-control\" id=\"inputEmail1\" placeholder=\"Email\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"inputPassword1\" class=\"col-lg-2 col-sm-2 control-label\">Password</label>\n");
      out.write("                                <div class=\"col-lg-10\">\n");
      out.write("                                    <input type=\"password\" class=\"form-control\" id=\"inputPassword1\" placeholder=\"Password\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <div class=\"col-lg-offset-2 col-lg-10\">\n");
      out.write("                                    <div class=\"checkbox\">\n");
      out.write("                                        <label>\n");
      out.write("                                            <input type=\"checkbox\"> Remember me\n");
      out.write("                                        </label>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <div class=\"col-lg-offset-2 col-lg-10\">\n");
      out.write("                                    <button type=\"submit\" class=\"btn btn-danger\">Sign in</button>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </section>\n");
      out.write("            </div>\n");
      out.write("        </div><!--row1-->\n");
      out.write("\n");
      out.write("    </section><!-- /.content -->\n");
      out.write("</aside><!-- /.right-side -->\n");
      out.write("\n");
      out.write("\n");
      out.write("</section>\n");
      out.write("<div class=\"footer-main\">\n");
      out.write("    Copyright &copy Director, 2014\n");
      out.write("</div>\n");
      out.write("</aside>\n");
      out.write("<!-- /.right-side -->\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("<!-- ./wrapper -->\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- jQuery 2.0.2 -->\n");
      out.write("<script src=\"http://ajax.googleapis.com/ajax/libs/jquery/2.0.2/jquery.min.js\"></script>\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/resources/js/jquery.min.js\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("<!-- jQuery UI 1.10.3 -->\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/resources/js/jquery-ui-1.10.3.min.js\" type=\"text/javascript\"></script>\n");
      out.write("<!-- Bootstrap -->\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/resources/js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("<!-- daterangepicker -->\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/resources/js/plugins/daterangepicker/daterangepicker.js\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- datepicker\n");
      out.write("<script src=\"js/plugins/datepicker/bootstrap-datepicker.js\" type=\"text/javascript\"></script>-->\n");
      out.write("<!-- Bootstrap WYSIHTML5\n");
      out.write("<script src=\"js/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.all.min.js\" type=\"text/javascript\"></script>-->\n");
      out.write("<!-- iCheck -->\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/resources/js/plugins/iCheck/icheck.min.js\" type=\"text/javascript\"></script>\n");
      out.write("<!-- calendar -->\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/resources/js/plugins/fullcalendar/fullcalendar.js\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("<!-- Director App -->\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/resources/js/Director/app.js\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("<!-- Director dashboard demo (This is only for demo purposes) -->\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/resources/js/Director/dashboard.js\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("<!-- My scripts -->\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/resources/myscripts.js\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>");
      out.write('\n');
      out.write('\n');
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
