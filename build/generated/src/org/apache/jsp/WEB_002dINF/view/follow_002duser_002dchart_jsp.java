package org.apache.jsp.WEB_002dINF.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class follow_002duser_002dchart_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(5);
    _jspx_dependants.add("/WEB-INF/view/common/sub-content.jspf");
    _jspx_dependants.add("/WEB-INF/view/common/header.jspf");
    _jspx_dependants.add("/WEB-INF/view/common/left-sidebar.jspf");
    _jspx_dependants.add("/WEB-INF/view/common/navigation.jspf");
    _jspx_dependants.add("/WEB-INF/view/common/footer.jspf");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_varStatus_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_choose;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_otherwise;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_when_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_varStatus_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_otherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_when_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_forEach_varStatus_var_items.release();
    _jspx_tagPool_c_if_test.release();
    _jspx_tagPool_c_choose.release();
    _jspx_tagPool_c_otherwise.release();
    _jspx_tagPool_c_when_test.release();
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

      out.write("\r\n");
      out.write("\r\n");
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
      out.write("        <style>\n");
      out.write("            table{\n");
      out.write("                width: 100%;\n");
      out.write("            }\n");
      out.write("            th, td {\n");
      out.write("                padding: 8px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            tr:nth-child(even){\n");
      out.write("                background-color: #FFEDCA\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            tr:nth-child(odd){\n");
      out.write("                background-color: #FFFFFF\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            th {\n");
      out.write("                background-color: #CC0033;\n");
      out.write("                color: #FFFFFF;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            tbody>tr:hover>th{\n");
      out.write("                background-color:#CC0033;\n");
      out.write("                color: #000000;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            tbody>tr:hover{\n");
      out.write("                background-color:#CC0033;\n");
      out.write("                color: #FFFFFF;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body class=\"skin-black\">\n");
      out.write("        <header class=\"header\">\n");
      out.write("            <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/index.htm\" class=\"logo\">\n");
      out.write("                Hotel Admin\n");
      out.write("            </a>\n");
      out.write("            <!-- Header Navbar: style can be found in header.less -->\n");
      out.write("            <nav class=\"navbar navbar-static-top\" role=\"navigation\">\n");
      out.write("                <!-- Sidebar toggle button-->\n");
      out.write("                <a href=\"#\" class=\"navbar-btn sidebar-toggle\" data-toggle=\"offcanvas\" role=\"button\">\n");
      out.write("                    <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                </a>\n");
      out.write("                <div class=\"navbar-right\">\n");
      out.write("                    <ul class=\"nav navbar-nav\">\n");
      out.write("                        <!-- Messages: style can be found in dropdown.less-->\n");
      out.write("                        <li class=\"dropdown messages-menu\">\n");
      out.write("                            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\n");
      out.write("                                <i class=\"fa fa-bell\"></i>\n");
      out.write("                                ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                            </a>\n");
      out.write("                            <ul class=\"dropdown-menu\">\n");
      out.write("                                <li class=\"header\">You have ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${newNotifications.size()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" notifications</li>\n");
      out.write("                                <li>\n");
      out.write("                                    <!-- inner menu: contains the actual data -->\n");
      out.write("                                    <ul class=\"menu\">\n");
      out.write("                                        ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                        <!-- end message -->\n");
      out.write("                                    </ul>\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"footer\"><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/message.htm#all-notifications\">See All Notifications</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"dropdown messages-menu\">\n");
      out.write("                            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\n");
      out.write("                                <i class=\"fa fa-envelope\"></i>\n");
      out.write("                                <span class=\"label label-success\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listactivily.size()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>\n");
      out.write("                            </a>\n");
      out.write("                            <ul class=\"dropdown-menu\">\n");
      out.write("                                <li class=\"header\">You have ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listactivily.size()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" message</li>\n");
      out.write("                                <li>\n");
      out.write("                                    <!-- inner menu: contains the actual data -->\n");
      out.write("                                    <ul class=\"menu\">\n");
      out.write("                                        ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                        <!-- end message item -->\n");
      out.write("                                    </ul>\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"footer\">\n");
      out.write("                                    <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/message.htm#all-message\">View All Messages</a></li>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <!-- User Account: style can be found in dropdown.less -->\n");
      out.write("                    <li class=\"dropdown user user-menu\">\n");
      out.write("                        <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\n");
      out.write("                            <i class=\"fa fa-user\"></i>\n");
      out.write("                            <span>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ad.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" <i class=\"caret\"></i></span>\n");
      out.write("                        </a>\n");
      out.write("                        <ul class=\"dropdown-menu dropdown-custom dropdown-menu-right\">\n");
      out.write("                            <li class=\"dropdown-header text-center\">Account</li>\n");
      out.write("\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/message.htm#all-notifications\">\n");
      out.write("                                    <i class=\"fa fa-bell fa-fw pull-right\"></i>\n");
      out.write("                                    <span class=\"badge badge-success pull-right\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${newNotifications.size()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span> Notifications</a>\n");
      out.write("                                <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/message.htm#all-message\">\n");
      out.write("                                    <i class=\"fa fa-envelope-o fa-fw pull-right\"></i>\n");
      out.write("                                    <span class=\"badge badge-danger pull-right\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listactivily.size()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span> Messages</a>\n");
      out.write("                                <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/fqa.htm\"\"><i class=\"fa fa-question fa-fw pull-right\"></i> \n");
      out.write("                                    <span class=\"badge pull-right\">8</span> FAQ</a>\n");
      out.write("                            </li>\n");
      out.write("\n");
      out.write("                            <li class=\"divider\"></li>\n");
      out.write("\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\">\n");
      out.write("                                    <i class=\"fa fa-user fa-fw pull-right\"></i> Profile\n");
      out.write("                                </a>\n");
      out.write("                                <a data-toggle=\"modal\" href=\"#modal-user-settings\">\n");
      out.write("                                    <i class=\"fa fa-cog fa-fw pull-right\"></i> Settings\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("\n");
      out.write("                            <li class=\"divider\"></li>\n");
      out.write("\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\"><i class=\"fa fa-ban fa-fw pull-right\"></i> Logout</a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("        </header>");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"wrapper row-offcanvas row-offcanvas-left\">\n");
      out.write("    ");
      out.write("<aside class=\"left-side sidebar-offcanvas\">\n");
      out.write("    <!-- sidebar: style can be found in sidebar.less -->\n");
      out.write("    <section class=\"sidebar\">\n");
      out.write("        <!-- Sidebar user panel -->\n");
      out.write("        <div class=\"user-panel\">\n");
      out.write("            <div class=\"pull-left image\">\n");
      out.write("                <img style=\"cursor: pointer\" onclick=\"location.href = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/profile.htm'\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/resources/img/users/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ad.img}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"img-circle\" alt=\"User Image\" />\n");
      out.write("            </div>\n");
      out.write("            <div class=\"pull-left info\">\n");
      out.write("                <p style=\"cursor: pointer\" onclick=\"location.href = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/profile.htm'\">Hello, ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ad.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("\n");
      out.write("                <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/profile.htm\"><i class=\"fa fa-circle text-success\"></i> Online</a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- search form -->\n");
      out.write("        <form action=\"#\" method=\"get\" class=\"sidebar-form\">\n");
      out.write("            <div class=\"input-group\">\n");
      out.write("                <input type=\"text\" name=\"q\" class=\"form-control\" placeholder=\"Search...\" />\n");
      out.write("                <span class=\"input-group-btn\">\n");
      out.write("                    <button type='submit' name='seach' id='search-btn' class=\"btn btn-flat\"><i class=\"fa fa-search\"></i></button>\n");
      out.write("                </span>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("        <!-- /.search form -->\n");
      out.write("        <!-- sidebar menu: : style can be found in sidebar.less -->\n");
      out.write("        <ul class=\"sidebar-menu\">\n");
      out.write("            <li class=\"active\">\n");
      out.write("                <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/index.htm\">\n");
      out.write("                    <i class=\"fa fa-dashboard\"></i> <span>Dashboard</span>\n");
      out.write("                </a>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("                <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/profile.htm\">\n");
      out.write("                    <i class=\"fa fa-cog\"></i> <span>Profile</span>\n");
      out.write("                </a>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("                <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/message.htm\">\n");
      out.write("                    <i class=\"fa fa-envelope-o\"></i> <span>Message</span>\n");
      out.write("                </a>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("                <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/manage-users.htm\">\n");
      out.write("                    <i class=\"fa fa-user\"></i> <span>Manage Users</span>\n");
      out.write("                </a>\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("            <li>\n");
      out.write("                <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/manage-rooms.htm\">\n");
      out.write("                    <i class=\"fa fa-tasks\"></i> <span>Rooms & Bookings</span>\n");
      out.write("                </a>\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("            <li>\n");
      out.write("                <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/manage-restaurant.htm\">\n");
      out.write("                    <i class=\"fa fa-glass\"></i> <span>Restaurant & Services</span>\n");
      out.write("                </a>\n");
      out.write("            </li>\n");
      out.write("            \n");
      out.write("            <li>\n");
      out.write("                <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/follow-users.htm\">\n");
      out.write("                    <i class=\"fa fa-globe\"></i> <span>Follow Users</span>\n");
      out.write("                </a>\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("        </ul>\n");
      out.write("    </section>\n");
      out.write("    <!-- /.sidebar -->\n");
      out.write("</aside>");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <aside class=\"right-side\">\n");
      out.write("\n");
      out.write("        <!-- Main content -->\n");
      out.write("        <section class=\"content\">\n");
      out.write("\n");
      out.write("            ");
      out.write("<div class=\"row\" style=\"margin-bottom:5px;\">\n");
      out.write("\n");
      out.write("\n");
      out.write("    <div class=\"col-md-3\" style=\"cursor: pointer\" onclick=\"location.href = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/manage-users.htm'\">\n");
      out.write("        <div class=\"sm-st clearfix\">\n");
      out.write("            <span class=\"sm-st-icon st-red\"><i class=\"fa fa-user\"></i></span>\n");
      out.write("            <div class=\"sm-st-info\">\n");
      out.write("                <span>3200</span> Total User\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-md-3\">\n");
      out.write("        <div class=\"sm-st clearfix\" style=\"cursor: pointer\" onclick=\"location.href = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/message.htm'\">\n");
      out.write("            <span class=\"sm-st-icon st-violet\"><i class=\"fa fa-envelope-o\"></i></span>\n");
      out.write("            <div class=\"sm-st-info\">\n");
      out.write("                <span>2200</span> Total Messages\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-md-3\" style=\"cursor: pointer\" onclick=\"location.href = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/manage-rooms.htm'\">\n");
      out.write("        <div class=\"sm-st clearfix\">\n");
      out.write("            <span class=\"sm-st-icon st-blue\"><i class=\"fa fa-building-o\"></i></span>\n");
      out.write("            <div class=\"sm-st-info\">\n");
      out.write("                <span>100,320</span> Total Rooms\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-md-3\">\n");
      out.write("        <div class=\"sm-st clearfix\" style=\"cursor: pointer\" onclick=\"location.href = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/manage-restaurant.htm'\">\n");
      out.write("            <span class=\"sm-st-icon st-green\"><i class=\"fa fa-glass\"></i></span>\n");
      out.write("            <div class=\"sm-st-info\">\n");
      out.write("                <span>4567</span> Total Services\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("#chartdiv {\r\n");
      out.write("  width: 100%;\r\n");
      out.write("  height: 500px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".amcharts-export-menu-top-right {\r\n");
      out.write("  top: 10px;\r\n");
      out.write("  right: 0;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<!-- Resources -->\r\n");
      out.write("<script src=\"https://www.amcharts.com/lib/3/amcharts.js\"></script>\r\n");
      out.write("<script src=\"https://www.amcharts.com/lib/3/serial.js\"></script>\r\n");
      out.write("<script src=\"https://www.amcharts.com/lib/3/plugins/export/export.min.js\"></script>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://www.amcharts.com/lib/3/plugins/export/export.css\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("<script src=\"https://www.amcharts.com/lib/3/themes/light.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("var data = []\r\n");
      out.write("\r\n");
      out.write("var app = angular.module('myApp', []);\r\n");
      out.write("app.controller('customersCtrl', function($scope, $http) {\r\n");
      out.write("  $http.get(\"https://www.w3schools.com/angular/customers.php\").then(function (response) {\r\n");
      out.write("      $scope.myData = response.data.records;\r\n");
      out.write("      for(var i = 0; i < $scope.myData.length; i++) {\r\n");
      out.write("            var element = $scope.myData[i];\r\n");
      out.write("            element.visits = 15000 - i*1000;\r\n");
      out.write("            if(element.visits >14000)\r\n");
      out.write("                element.color = \"#FF0F00\";\r\n");
      out.write("            else if(element.visits >13000)    \r\n");
      out.write("                element.color = \"#FF6600\";\r\n");
      out.write("            else if(element.visits >12000)    \r\n");
      out.write("                element.color = \"#FF9E01\";\r\n");
      out.write("            else if(element.visits >11000)    \r\n");
      out.write("                element.color = \"#FCD202\";\r\n");
      out.write("            else if(element.visits >10000)    \r\n");
      out.write("                element.color = \"#F8FF01\";\r\n");
      out.write("            else if(element.visits >9000)    \r\n");
      out.write("                element.color = \"#B0DE09\";\r\n");
      out.write("            else if(element.visits >8000)    \r\n");
      out.write("                element.color = \"#04D215\";\r\n");
      out.write("            else if(element.visits >7000)    \r\n");
      out.write("                element.color = \"#0D8ECF\";\r\n");
      out.write("            else if(element.visits >6000)    \r\n");
      out.write("                element.color = \"#0D52D1\";\r\n");
      out.write("            else if(element.visits >5000)    \r\n");
      out.write("                element.color = \"#2A0CD0\";\r\n");
      out.write("            else if(element.visits >4000)    \r\n");
      out.write("                element.color = \"#8A0CCF\";\r\n");
      out.write("            else if(element.visits >3000)    \r\n");
      out.write("                element.color = \"#CD0D74\";\r\n");
      out.write("       }\r\n");
      out.write("      \r\n");
      out.write("      var chart = AmCharts.makeChart(\"chartdiv\", {\r\n");
      out.write("          \"type\": \"serial\",\r\n");
      out.write("          \"theme\": \"light\",\r\n");
      out.write("          \"marginRight\": 70,\r\n");
      out.write("          \"dataProvider\": $scope.myData,\r\n");
      out.write("          \"valueAxes\": [{\r\n");
      out.write("            \"axisAlpha\": 0,\r\n");
      out.write("            \"position\": \"left\",\r\n");
      out.write("            \"title\": \"Visitors from country\"\r\n");
      out.write("          }],\r\n");
      out.write("          \"startDuration\": 1,\r\n");
      out.write("          \"graphs\": [{\r\n");
      out.write("            \"balloonText\": \"<b>[[category]]: [[value]]</b>\",\r\n");
      out.write("            \"fillColorsField\": \"color\",\r\n");
      out.write("            \"fillAlphas\": 0.9,\r\n");
      out.write("            \"lineAlpha\": 0.2,\r\n");
      out.write("            \"type\": \"column\",\r\n");
      out.write("            \"valueField\": \"visits\"\r\n");
      out.write("          }],\r\n");
      out.write("          \"chartCursor\": {\r\n");
      out.write("            \"categoryBalloonEnabled\": false,\r\n");
      out.write("            \"cursorAlpha\": 0,\r\n");
      out.write("            \"zoomable\": false\r\n");
      out.write("          },\r\n");
      out.write("          \"categoryField\": \"Country\",\r\n");
      out.write("          \"categoryAxis\": {\r\n");
      out.write("            \"gridPosition\": \"start\",\r\n");
      out.write("            \"labelRotation\": 45\r\n");
      out.write("          },\r\n");
      out.write("          \"export\": {\r\n");
      out.write("            \"enabled\": true\r\n");
      out.write("          }\r\n");
      out.write("\r\n");
      out.write("        });\r\n");
      out.write("  });\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"row\">\r\n");
      out.write("    <div class=\"col-xs-12\">\r\n");
      out.write("        <div class=\"panel\">\r\n");
      out.write("            <div id=\"chartdiv\"></div>\r\n");
      out.write("            <header class=\"panel-heading\">\r\n");
      out.write("                IP Address Statistics\r\n");
      out.write("\r\n");
      out.write("            </header>\r\n");
      out.write("            <!-- <div class=\"box-header\"> -->\r\n");
      out.write("            <!-- <h3 class=\"box-title\">Responsive Hover Table</h3> -->\r\n");
      out.write("\r\n");
      out.write("            <!-- </div> -->\r\n");
      out.write("            <div class=\"panel-body table-responsive\">\r\n");
      out.write("                <div class=\"box-tools m-b-15\">\r\n");
      out.write("                    <div class=\"input-group\">\r\n");
      out.write("                        <input type=\"text\" name=\"table_search\" class=\"form-control input-sm pull-right\" \r\n");
      out.write("                               style=\"width: 150px;\" id=\"myInput1\" onkeyup=\"searchInputTable('myInput1', 'myTable1')\" \r\n");
      out.write("                               placeholder=\"Search for ip address..\" title=\"Type in a ip address\"/>\r\n");
      out.write("                        <div class=\"input-group-btn\">\r\n");
      out.write("                            <button class=\"btn btn-sm btn-default\"><i class=\"fa fa-search\"></i></button>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <table id=\"myTable1\">\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <th style=\"cursor: pointer\" onclick=\"sortNum(0, 'myTable1')\">No.</th>\r\n");
      out.write("                        <th style=\"cursor: pointer\" onclick=\"sortAlpha(1, 'myTable1')\">IP Address</th>\r\n");
      out.write("                        <th style=\"cursor: pointer\" onclick=\"sortNum(2, 'myTable1')\">Visit Times</th>\r\n");
      out.write("                    </tr>\r\n");
      out.write("\r\n");
      out.write("                    ");
      if (_jspx_meth_c_forEach_2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                </table>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- /.box-body -->\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- /.box -->\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"row\">\r\n");
      out.write("    <div class=\"col-xs-12\">\r\n");
      out.write("        <div class=\"panel\">\r\n");
      out.write("            <header class=\"panel-heading\">\r\n");
      out.write("                Page Access Statistics\r\n");
      out.write("\r\n");
      out.write("            </header>\r\n");
      out.write("            <!-- <div class=\"box-header\"> -->\r\n");
      out.write("            <!-- <h3 class=\"box-title\">Responsive Hover Table</h3> -->\r\n");
      out.write("\r\n");
      out.write("            <!-- </div> -->\r\n");
      out.write("            <div class=\"panel-body table-responsive\">\r\n");
      out.write("                <div class=\"box-tools m-b-15\">\r\n");
      out.write("                    <div class=\"input-group\">\r\n");
      out.write("                        <input type=\"text\" name=\"table_search\" class=\"form-control input-sm pull-right\" \r\n");
      out.write("                               style=\"width: 150px;\" id=\"myInput2\" onkeyup=\"searchInputTable('myInput2', 'myTable2')\" \r\n");
      out.write("                               placeholder=\"Search for page access..\" title=\"Type in a page access\"/>\r\n");
      out.write("                        <div class=\"input-group-btn\">\r\n");
      out.write("                            <button class=\"btn btn-sm btn-default\"><i class=\"fa fa-search\"></i></button>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <table id=\"myTable2\">\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <th style=\"cursor: pointer\" onclick=\"sortNum(0, 'myTable2')\">No.</th>\r\n");
      out.write("                        <th style=\"cursor: pointer\" onclick=\"sortAlpha(1, 'myTable2')\">Page Access</th>\r\n");
      out.write("                        <th style=\"cursor: pointer\" onclick=\"sortNum(2, 'myTable2')\">Visit Times</th>\r\n");
      out.write("                    </tr>\r\n");
      out.write("\r\n");
      out.write("                    ");
      if (_jspx_meth_c_forEach_3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                </table>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- /.box-body -->\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- /.box -->\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"row\">\r\n");
      out.write("    <div class=\"col-xs-12\">\r\n");
      out.write("        <div class=\"panel\">\r\n");
      out.write("            <header class=\"panel-heading\">\r\n");
      out.write("                Follow Users\r\n");
      out.write("\r\n");
      out.write("            </header>\r\n");
      out.write("            <!-- <div class=\"box-header\"> -->\r\n");
      out.write("            <!-- <h3 class=\"box-title\">Responsive Hover Table</h3> -->\r\n");
      out.write("\r\n");
      out.write("            <!-- </div> -->\r\n");
      out.write("            <div class=\"panel-body table-responsive\">\r\n");
      out.write("                <div class=\"box-tools m-b-15\">\r\n");
      out.write("                    <div class=\"input-group\">\r\n");
      out.write("                        <input type=\"text\" name=\"table_search\" class=\"form-control input-sm pull-right\" \r\n");
      out.write("                               style=\"width: 150px;\" id=\"myInput3\" onkeyup=\"searchInputTable('myInput3', 'myTable3')\" \r\n");
      out.write("                               placeholder=\"Search for ip address..\" title=\"Type in a ip address\"/>\r\n");
      out.write("                        <div class=\"input-group-btn\">\r\n");
      out.write("                            <button class=\"btn btn-sm btn-default\"><i class=\"fa fa-search\"></i></button>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <table id=\"myTable3\">\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <th style=\"cursor: pointer\" onclick=\"sortNum(0, 'myTable3')\">No.</th>\r\n");
      out.write("                        <th style=\"cursor: pointer\" onclick=\"sortAlpha(1, 'myTable3')\">User IP Address</th>\r\n");
      out.write("                        <th style=\"cursor: pointer\" onclick=\"sortAlpha(2, 'myTable3')\">External IP Address</th>\r\n");
      out.write("                        <th style=\"cursor: pointer\" onclick=\"sortAlpha(3, 'myTable3')\">User</th>\r\n");
      out.write("                        <th style=\"cursor: pointer\" onclick=\"sortDate(4, 'myTable3')\">Date Access</th>\r\n");
      out.write("                        <th style=\"cursor: pointer\" onclick=\"sortAlpha(5, 'myTable3')\">Page Access</th>\r\n");
      out.write("                        <th style=\"cursor: pointer\" onclick=\"sortAlpha(6, 'myTable3')\">Duration</th>\r\n");
      out.write("                    </tr>\r\n");
      out.write("\r\n");
      out.write("                    ");
      if (_jspx_meth_c_forEach_4(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                </table>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- /.box-body -->\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- /.box -->\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
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
      out.write("<!-- Director for demo purposes -->\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("    $('input').on('ifChecked', function (event) {\n");
      out.write("        // var element = $(this).parent().find('input:checkbox:first');\n");
      out.write("        // element.parent().parent().parent().addClass('highlight');\n");
      out.write("        $(this).parents('li').addClass(\"task-done\");\n");
      out.write("        console.log('ok');\n");
      out.write("    });\n");
      out.write("    $('input').on('ifUnchecked', function (event) {\n");
      out.write("        // var element = $(this).parent().find('input:checkbox:first');\n");
      out.write("        // element.parent().parent().parent().removeClass('highlight');\n");
      out.write("        $(this).parents('li').removeClass(\"task-done\");\n");
      out.write("        console.log('not');\n");
      out.write("    });\n");
      out.write("    $('#noti-box').slimScroll({\n");
      out.write("        height: '400px',\n");
      out.write("        size: '5px',\n");
      out.write("        BorderRadius: '5px'\n");
      out.write("    });\n");
      out.write("    $('#activity-box').slimScroll({\n");
      out.write("        height: '655px',\n");
      out.write("        size: '5px',\n");
      out.write("        BorderRadius: '5px'\n");
      out.write("    });\n");
      out.write("    $('input[type=\"checkbox\"].flat-grey, input[type=\"radio\"].flat-grey').iCheck({\n");
      out.write("        checkboxClass: 'icheckbox_flat-grey',\n");
      out.write("        radioClass: 'iradio_flat-grey'\n");
      out.write("    });\n");
      out.write("    $('#manage-services-box').slimScroll({\n");
      out.write("        height: '400px',\n");
      out.write("        size: '5px',\n");
      out.write("        BorderRadius: '5px'\n");
      out.write("    });\n");
      out.write("    $('#manage-rooms-box').slimScroll({\n");
      out.write("        height: '400px',\n");
      out.write("        size: '5px',\n");
      out.write("        BorderRadius: '5px'\n");
      out.write("    });\n");
      out.write("    $('#all-message-box').slimScroll({\n");
      out.write("        height: '400px',\n");
      out.write("        size: '5px',\n");
      out.write("        BorderRadius: '5px'\n");
      out.write("    });\n");
      out.write("\n");
      out.write("    var windowsize = $(window).width();\n");
      out.write("\n");
      out.write("    $(window).resize(function () {\n");
      out.write("        windowsize = $(window).width();\n");
      out.write("        if (windowsize < 1000) {\n");
      out.write("            //if the window is greater than 440px wide then turn on jScrollPane..\n");
      out.write("\n");
      out.write("        }\n");
      out.write("    });\n");
      out.write("\n");
      out.write("    function search() {\n");
      out.write("        searchInputTable(\"myInput\",\"myTable\")\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    function searchInputTable(myInput,myTable) {\n");
      out.write("        var input, filter, table, tr, td, i;\n");
      out.write("        input = document.getElementById(myInput);\n");
      out.write("        filter = input.value.toUpperCase();\n");
      out.write("        table = document.getElementById(myTable);\n");
      out.write("        tr = table.getElementsByTagName(\"tr\");\n");
      out.write("        for (i = 0; i < tr.length; i++) {\n");
      out.write("            td = tr[i].getElementsByTagName(\"td\")[1];\n");
      out.write("            if (td) {\n");
      out.write("                if (td.innerHTML.toUpperCase().indexOf(filter) > -1) {\n");
      out.write("                    tr[i].style.display = \"\";\n");
      out.write("                } else {\n");
      out.write("                    tr[i].style.display = \"none\";\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    function readURL(input, imgTag, width, height) {\n");
      out.write("        if (input.files && input.files[0]) {\n");
      out.write("            var reader = new FileReader();\n");
      out.write("\n");
      out.write("            reader.onload = function (e) {\n");
      out.write("                $(imgTag)\n");
      out.write("                        .attr('src', e.target.result)\n");
      out.write("                        .width(width)\n");
      out.write("                        .height(height);\n");
      out.write("            };\n");
      out.write("            reader.readAsDataURL(input.files[0]);\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    function sortAlpha(n, myTable) {\n");
      out.write("        var table, rows, switching, i, x, y, shouldSwitch, dir, switchcount = 0;\n");
      out.write("        table = document.getElementById(myTable);\n");
      out.write("        switching = true;\n");
      out.write("        //Set the sorting direction to ascending:\n");
      out.write("        dir = \"asc\";\n");
      out.write("        /*Make a loop that will continue until\n");
      out.write("         no switching has been done:*/\n");
      out.write("        while (switching) {\n");
      out.write("            //start by saying: no switching is done:\n");
      out.write("            switching = false;\n");
      out.write("            rows = table.getElementsByTagName(\"TR\");\n");
      out.write("            /*Loop through all table rows (except the\n");
      out.write("             first, which contains table headers):*/\n");
      out.write("            for (i = 1; i < (rows.length - 1); i++) {\n");
      out.write("                //start by saying there should be no switching:\n");
      out.write("                shouldSwitch = false;\n");
      out.write("                /*Get the two elements you want to compare,\n");
      out.write("                 one from current row and one from the next:*/\n");
      out.write("                x = rows[i].getElementsByTagName(\"TD\")[n];\n");
      out.write("                y = rows[i + 1].getElementsByTagName(\"TD\")[n];\n");
      out.write("                /*check if the two rows should switch place,\n");
      out.write("                 based on the direction, asc or desc:*/\n");
      out.write("                if (dir == \"asc\") {\n");
      out.write("                    if (x.innerHTML.toLowerCase() > y.innerHTML.toLowerCase()) {\n");
      out.write("                        //if so, mark as a switch and break the loop:\n");
      out.write("                        shouldSwitch = true;\n");
      out.write("                        break;\n");
      out.write("                    }\n");
      out.write("                } else if (dir == \"desc\") {\n");
      out.write("                    if (x.innerHTML.toLowerCase() < y.innerHTML.toLowerCase()) {\n");
      out.write("                        //if so, mark as a switch and break the loop:\n");
      out.write("                        shouldSwitch = true;\n");
      out.write("                        break;\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            if (shouldSwitch) {\n");
      out.write("                /*If a switch has been marked, make the switch\n");
      out.write("                 and mark that a switch has been done:*/\n");
      out.write("                rows[i].parentNode.insertBefore(rows[i + 1], rows[i]);\n");
      out.write("                switching = true;\n");
      out.write("                //Each time a switch is done, increase this count by 1:\n");
      out.write("                switchcount++;\n");
      out.write("            } else {\n");
      out.write("                /*If no switching has been done AND the direction is \"asc\",\n");
      out.write("                 set the direction to \"desc\" and run the while loop again.*/\n");
      out.write("                if (switchcount == 0 && dir == \"asc\") {\n");
      out.write("                    dir = \"desc\";\n");
      out.write("                    switching = true;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    function sortNum(n, myTable) {\n");
      out.write("        var table, rows, switching, i, x, y, shouldSwitch, dir, switchcount = 0;\n");
      out.write("        table = document.getElementById(myTable);\n");
      out.write("        switching = true;\n");
      out.write("        //Set the sorting direction to ascending:\n");
      out.write("        dir = \"asc\";\n");
      out.write("        /*Make a loop that will continue until\n");
      out.write("         no switching has been done:*/\n");
      out.write("        while (switching) {\n");
      out.write("            //start by saying: no switching is done:\n");
      out.write("            switching = false;\n");
      out.write("            rows = table.getElementsByTagName(\"TR\");\n");
      out.write("            /*Loop through all table rows (except the\n");
      out.write("             first, which contains table headers):*/\n");
      out.write("            for (i = 1; i < (rows.length - 1); i++) {\n");
      out.write("                //start by saying there should be no switching:\n");
      out.write("                shouldSwitch = false;\n");
      out.write("                /*Get the two elements you want to compare,\n");
      out.write("                 one from current row and one from the next:*/\n");
      out.write("                x = rows[i].getElementsByTagName(\"TD\")[n];\n");
      out.write("                y = rows[i + 1].getElementsByTagName(\"TD\")[n];\n");
      out.write("                /*check if the two rows should switch place,\n");
      out.write("                 based on the direction, asc or desc:*/\n");
      out.write("                if (dir == \"asc\") {\n");
      out.write("                    if (parseInt(x.innerHTML) > parseInt(y.innerHTML)) {\n");
      out.write("                        //if so, mark as a switch and break the loop:\n");
      out.write("                        shouldSwitch = true;\n");
      out.write("                        break;\n");
      out.write("                    }\n");
      out.write("                } else if (dir == \"desc\") {\n");
      out.write("                    if (parseInt(x.innerHTML) < parseInt(y.innerHTML)) {\n");
      out.write("                        //if so, mark as a switch and break the loop:\n");
      out.write("                        shouldSwitch = true;\n");
      out.write("                        break;\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            if (shouldSwitch) {\n");
      out.write("                /*If a switch has been marked, make the switch\n");
      out.write("                 and mark that a switch has been done:*/\n");
      out.write("                rows[i].parentNode.insertBefore(rows[i + 1], rows[i]);\n");
      out.write("                switching = true;\n");
      out.write("                //Each time a switch is done, increase this count by 1:\n");
      out.write("                switchcount++;\n");
      out.write("            } else {\n");
      out.write("                /*If no switching has been done AND the direction is \"asc\",\n");
      out.write("                 set the direction to \"desc\" and run the while loop again.*/\n");
      out.write("                if (switchcount == 0 && dir == \"asc\") {\n");
      out.write("                    dir = \"desc\";\n");
      out.write("                    switching = true;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    function convertDate(originaldate) {\n");
      out.write("        var temp1 = originaldate.substring(originaldate.length - 5);\n");
      out.write("        var temp2 = originaldate.substring(0, 10);\n");
      out.write("        var temp3 = originaldate.substring(10, 19);\n");
      out.write("        return new Date(temp2 + temp1 + temp3);\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    function sortDate(n, myTable) {\n");
      out.write("        var table, rows, switching, i, x, y, shouldSwitch, dir, switchcount = 0;\n");
      out.write("        table = document.getElementById(myTable);\n");
      out.write("        switching = true;\n");
      out.write("        //Set the sorting direction to ascending:\n");
      out.write("        dir = \"asc\";\n");
      out.write("        /*Make a loop that will continue until\n");
      out.write("         no switching has been done:*/\n");
      out.write("        while (switching) {\n");
      out.write("            //start by saying: no switching is done:\n");
      out.write("            switching = false;\n");
      out.write("            rows = table.getElementsByTagName(\"TR\");\n");
      out.write("            /*Loop through all table rows (except the\n");
      out.write("             first, which contains table headers):*/\n");
      out.write("            for (i = 1; i < (rows.length - 1); i++) {\n");
      out.write("                //start by saying there should be no switching:\n");
      out.write("                shouldSwitch = false;\n");
      out.write("                /*Get the two elements you want to compare,\n");
      out.write("                 one from current row and one from the next:*/\n");
      out.write("                x = rows[i].getElementsByTagName(\"TD\")[n];\n");
      out.write("                y = rows[i + 1].getElementsByTagName(\"TD\")[n];\n");
      out.write("                /*check if the two rows should switch place,\n");
      out.write("                 based on the direction, asc or desc:*/\n");
      out.write("                if (dir == \"asc\") {\n");
      out.write("                    if (convertDate(x.innerHTML) > convertDate(y.innerHTML)) {\n");
      out.write("                        //if so, mark as a switch and break the loop:\n");
      out.write("                        shouldSwitch = true;\n");
      out.write("                        break;\n");
      out.write("                    }\n");
      out.write("                } else if (dir == \"desc\") {\n");
      out.write("                    if (convertDate(x.innerHTML) < convertDate(y.innerHTML)) {\n");
      out.write("                        //if so, mark as a switch and break the loop:\n");
      out.write("                        shouldSwitch = true;\n");
      out.write("                        break;\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            if (shouldSwitch) {\n");
      out.write("                /*If a switch has been marked, make the switch\n");
      out.write("                 and mark that a switch has been done:*/\n");
      out.write("                rows[i].parentNode.insertBefore(rows[i + 1], rows[i]);\n");
      out.write("                switching = true;\n");
      out.write("                //Each time a switch is done, increase this count by 1:\n");
      out.write("                switchcount++;\n");
      out.write("            } else {\n");
      out.write("                /*If no switching has been done AND the direction is \"asc\",\n");
      out.write("                 set the direction to \"desc\" and run the while loop again.*/\n");
      out.write("                if (switchcount == 0 && dir == \"asc\") {\n");
      out.write("                    dir = \"desc\";\n");
      out.write("                    switching = true;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    function deleteService(servicename) {\n");
      out.write("        swal({\n");
      out.write("            title: \"Are you sure?\",\n");
      out.write("            text: \"Delete this service now!\",\n");
      out.write("            type: \"warning\",\n");
      out.write("            showCancelButton: true,\n");
      out.write("            confirmButtonColor: \"#DD6B55\",\n");
      out.write("            confirmButtonText: \"Yes, delete it!\",\n");
      out.write("            closeOnConfirm: false\n");
      out.write("        }, function () {\n");
      out.write("            window.location.href = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/remove-service/' + servicename + '.htm';\n");
      out.write("        });\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    function deleteRoom(roomname) {\n");
      out.write("        swal({\n");
      out.write("            title: \"Are you sure?\",\n");
      out.write("            text: \"Delete this room now!\",\n");
      out.write("            type: \"warning\",\n");
      out.write("            showCancelButton: true,\n");
      out.write("            confirmButtonColor: \"#DD6B55\",\n");
      out.write("            confirmButtonText: \"Yes, delete it!\",\n");
      out.write("            closeOnConfirm: false\n");
      out.write("        }, function () {\n");
      out.write("            window.location.href = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/remove-room/' + roomname + '.htm';\n");
      out.write("        });\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    function checkeditresult(r) {\n");
      out.write("        if (r === undefined) {\n");
      out.write("        } else if (r === \"success\")\n");
      out.write("            swal('Congrats!', 'Edited successfully!', 'success');\n");
      out.write("        else if (r !== '')\n");
      out.write("            swal('Oops...!', r, 'error');\n");
      out.write("    }\n");
      out.write("</script>\n");
      out.write("\n");
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
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${newNotifications.size() > 0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" \n");
        out.write("                                    <span class=\"label label-danger\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${newNotifications.size()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</span>\n");
        out.write("                                ");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("newNoti");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${newNotifications}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                            <li>\n");
          out.write("                                                <!-- start message -->\n");
          out.write("                                                ");
          if (_jspx_meth_c_choose_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("                                            </li>\n");
          out.write("                                        ");
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

  private boolean _jspx_meth_c_choose_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_0.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    int _jspx_eval_c_choose_0 = _jspx_th_c_choose_0.doStartTag();
    if (_jspx_eval_c_choose_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                    ");
        if (_jspx_meth_c_when_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("\n");
        out.write("                                                    ");
        if (_jspx_meth_c_otherwise_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("\n");
        out.write("                                                ");
        int evalDoAfterBody = _jspx_th_c_choose_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
    return false;
  }

  private boolean _jspx_meth_c_when_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_0.setPageContext(_jspx_page_context);
    _jspx_th_c_when_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${newNoti.click.equals('contact') || newNoti.click.equals('reservation')}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
    if (_jspx_eval_c_when_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" \n");
        out.write("                                                        <a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("/notification/");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${newNoti.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write(".htm\">\n");
        out.write("                                                            <div class=\"pull-left\">\n");
        out.write("                                                                <img src=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("/resources/img/users/guest.jpg\" class=\"img-circle\" alt=\"User Image\" />\n");
        out.write("                                                            </div>\n");
        out.write("                                                            <h4 style=\"font-size: 11px\">\n");
        out.write("                                                                ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${newNoti.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\n");
        out.write("                                                            </h4>\n");
        out.write("                                                            <p>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${newNoti.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</p>\n");
        out.write("                                                            <small class=\"pull-right\"><i class=\"fa fa-clock-o\"></i> ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${newNoti.time}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</small>\n");
        out.write("                                                        </a>\n");
        out.write("                                                    ");
        int evalDoAfterBody = _jspx_th_c_when_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_0.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    int _jspx_eval_c_otherwise_0 = _jspx_th_c_otherwise_0.doStartTag();
    if (_jspx_eval_c_otherwise_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                        <a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("/notification/");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${newNoti.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write(".htm\">\n");
        out.write("                                                            <div class=\"pull-left\">\n");
        out.write("                                                                <img src=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("/resources/img/users/membership.png\" class=\"img-circle\" alt=\"User Image\" />\n");
        out.write("                                                            </div>\n");
        out.write("                                                            <h4 style=\"font-size: 11px\">\n");
        out.write("                                                                User ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${newNoti.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\n");
        out.write("                                                            </h4>\n");
        out.write("                                                            <p>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${newNoti.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</p>\n");
        out.write("                                                            <small class=\"pull-right\"><i class=\"fa fa-clock-o\"></i> ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${newNoti.time}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</small>\n");
        out.write("                                                        </a>\n");
        out.write("                                                    ");
        int evalDoAfterBody = _jspx_th_c_otherwise_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
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
    _jspx_th_c_forEach_1.setVar("message");
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listactivily}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                            <li>\n");
          out.write("                                                <!-- start message -->\n");
          out.write("                                                ");
          if (_jspx_meth_c_choose_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
            return true;
          out.write("\n");
          out.write("                                            </li>\n");
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

  private boolean _jspx_meth_c_choose_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_1 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_1.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
    int _jspx_eval_c_choose_1 = _jspx_th_c_choose_1.doStartTag();
    if (_jspx_eval_c_choose_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                    ");
        if (_jspx_meth_c_when_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
          return true;
        out.write("\n");
        out.write("                                                    ");
        if (_jspx_meth_c_otherwise_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
          return true;
        out.write("\n");
        out.write("                                                ");
        int evalDoAfterBody = _jspx_th_c_choose_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_1);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_1);
    return false;
  }

  private boolean _jspx_meth_c_when_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_1 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_1.setPageContext(_jspx_page_context);
    _jspx_th_c_when_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_1);
    _jspx_th_c_when_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${message.click.equals('contact') || message.click.equals('reservation')}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_1 = _jspx_th_c_when_1.doStartTag();
    if (_jspx_eval_c_when_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" \n");
        out.write("                                                        <a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("/notification/");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${message.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write(".htm\">\n");
        out.write("                                                            <div class=\"pull-left\">\n");
        out.write("                                                                <img src=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("/resources/img/users/guest.jpg\" class=\"img-circle\" alt=\"User Image\" />\n");
        out.write("                                                            </div>\n");
        out.write("                                                            <h4 style=\"font-size: 11px\">\n");
        out.write("                                                                ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${message.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\n");
        out.write("                                                            </h4>\n");
        out.write("                                                            <p>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${message.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</p>\n");
        out.write("                                                            <small class=\"pull-right\"><i class=\"fa fa-clock-o\"></i> ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${message.time}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</small>\n");
        out.write("                                                        </a>\n");
        out.write("                                                    ");
        int evalDoAfterBody = _jspx_th_c_when_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_1);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_1);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_1 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_1.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_1);
    int _jspx_eval_c_otherwise_1 = _jspx_th_c_otherwise_1.doStartTag();
    if (_jspx_eval_c_otherwise_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                        <a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("/notification/");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${message.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write(".htm\">\n");
        out.write("                                                            <div class=\"pull-left\">\n");
        out.write("                                                                <img src=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("/resources/img/users/membership.png\" class=\"img-circle\" alt=\"User Image\" />\n");
        out.write("                                                            </div>\n");
        out.write("                                                            <h4 style=\"font-size: 11px\">\n");
        out.write("                                                                User ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${message.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\n");
        out.write("                                                            </h4>\n");
        out.write("                                                            <p>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${message.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</p>\n");
        out.write("                                                            <small class=\"pull-right\"><i class=\"fa fa-clock-o\"></i> ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${message.time}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</small>\n");
        out.write("                                                        </a>\n");
        out.write("                                                    ");
        int evalDoAfterBody = _jspx_th_c_otherwise_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_1);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_1);
    return false;
  }

  private boolean _jspx_meth_c_forEach_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_varStatus_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_2.setParent(null);
    _jspx_th_c_forEach_2.setVar("map");
    _jspx_th_c_forEach_2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mapFollowUsersIP}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_2.setVarStatus("loop");
    int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
      if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                        <tr style=\"cursor: pointer\" onclick=\"location.href = '");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("/follow-user-ip/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${map.key}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(".htm'\">\r\n");
          out.write("                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${loop.index + 1}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${map.key}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${map.value}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                        </tr>\r\n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_2.doFinally();
      _jspx_tagPool_c_forEach_varStatus_var_items.reuse(_jspx_th_c_forEach_2);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_3 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_varStatus_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_3.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_3.setParent(null);
    _jspx_th_c_forEach_3.setVar("map");
    _jspx_th_c_forEach_3.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mapFollowUsers}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_3.setVarStatus("loop");
    int[] _jspx_push_body_count_c_forEach_3 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_3 = _jspx_th_c_forEach_3.doStartTag();
      if (_jspx_eval_c_forEach_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                        <tr>\r\n");
          out.write("                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${loop.index + 1}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${map.key}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${map.value}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                        </tr>\r\n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_3.doFinally();
      _jspx_tagPool_c_forEach_varStatus_var_items.reuse(_jspx_th_c_forEach_3);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_4 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_varStatus_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_4.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_4.setParent(null);
    _jspx_th_c_forEach_4.setVar("user");
    _jspx_th_c_forEach_4.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listFollowUsers}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_4.setVarStatus("loop");
    int[] _jspx_push_body_count_c_forEach_4 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_4 = _jspx_th_c_forEach_4.doStartTag();
      if (_jspx_eval_c_forEach_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                        <tr>\r\n");
          out.write("                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${loop.index + 1}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                            <td style=\"cursor: pointer\" onclick=\"location.href = '");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("/follow-user-ip/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.user_ip_address}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(".htm'\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.user_ip_address}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                            <td style=\"cursor: pointer\" onclick=\"location.href = 'http://whatismyipaddress.com/ip/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.external_ip_address}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("'\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.external_ip_address}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                            ");
          if (_jspx_meth_c_if_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_4, _jspx_page_context, _jspx_push_body_count_c_forEach_4))
            return true;
          out.write("\r\n");
          out.write("                            ");
          if (_jspx_meth_c_if_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_4, _jspx_page_context, _jspx_push_body_count_c_forEach_4))
            return true;
          out.write("\r\n");
          out.write("                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.date_access}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.page_access}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.durationTime}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                        </tr>\r\n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_4.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_4[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_4.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_4.doFinally();
      _jspx_tagPool_c_forEach_varStatus_var_items.reuse(_jspx_th_c_forEach_4);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_4, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_4)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_4);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.username == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" \r\n");
        out.write("                                <td>guest</td>\r\n");
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

  private boolean _jspx_meth_c_if_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_4, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_4)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_4);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.username != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" \r\n");
        out.write("                                <td style=\"cursor: pointer\" onclick=\"location.href = '");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("/user/");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write(".htm'\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</td>\r\n");
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
}
