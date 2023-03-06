/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.5
 * Generated at: 2023-03-06 16:43:52 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;
import java.io.*;
import java.util.*;
import java.sql.*;
import java.text.*;

public final class motherboards_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("java.sql");
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("java.text");
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("java.io");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public boolean getErrorOnELNotFound() {
    return false;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
 
DecimalFormat priceFormatter = new DecimalFormat("$#0.00");
Connection conn = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/oldegg?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                           "root", "password");
Statement stmt = conn.createStatement();
Statement stmt2 = conn.createStatement();

String sqlStr = "select * from motherboards";

if (request.getParameter("sort") !=null) {
  if (request.getParameter("sort").equals("lp")) {
    sqlStr = "SELECT * FROM motherboards ORDER BY price ASC";
  }

  if (request.getParameter("sort").equals("hp")) {
    sqlStr = "SELECT * FROM motherboards ORDER BY price DESC";
  }

  if (request.getParameter("sort").equals("az")) {
    sqlStr = "SELECT * FROM motherboards ORDER BY name ASC";
  }

  if (request.getParameter("sort").equals("za")) {
    sqlStr = "SELECT * FROM motherboards ORDER BY name DESC";
  }
}

ResultSet rset = stmt.executeQuery(sqlStr);

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("  <head>\r\n");
      out.write("    <meta charset=\"utf-8\" />\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />\r\n");
      out.write("    <title>Old Egg | Home</title>\r\n");
      out.write("    <link rel=\"icon\" type=\"image/x-icon\" href=\"./images/oldegg-icon.png\">\r\n");
      out.write("    <link\r\n");
      out.write("      href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css\"\r\n");
      out.write("      rel=\"stylesheet\"\r\n");
      out.write("      integrity=\"sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD\"\r\n");
      out.write("      crossorigin=\"anonymous\"\r\n");
      out.write("    />\r\n");
      out.write("    <link href=\"./style/style.css\" rel=\"stylesheet\" />\r\n");
      out.write("  </head>\r\n");
      out.write("  <body class=\"bg_default\">\r\n");
      out.write("    <nav\r\n");
      out.write("      class=\"navbar sticky-top navbar-expand-lg navbar-light bg_default\"\r\n");
      out.write("      style=\"padding: 20px 50px 15px 50px\"\r\n");
      out.write("    >\r\n");
      out.write("      <a\r\n");
      out.write("        class=\"navbar-brand\"\r\n");
      out.write("        href=\"index.jsp?uid=");
      out.print( request.getParameter("uid") != null ? request.getParameter("uid") : "" );
      out.write("\"\r\n");
      out.write("        style=\"padding-bottom: 15px; padding-right: 50px\"\r\n");
      out.write("      >\r\n");
      out.write("        <img\r\n");
      out.write("          src=\"./images/oldegg-logo-transparent.png\"\r\n");
      out.write("          width=\"150dp\"\r\n");
      out.write("          height=\"50dp\"\r\n");
      out.write("          alt=\"OldEgg\"\r\n");
      out.write("        />\r\n");
      out.write("      </a>\r\n");
      out.write("      <form method=\"get\" action =\"search.jsp\" class=\"navbar-form\" role=\"search\">\r\n");
      out.write("        <div class=\"input-group\" style=\"width: 40em\">\r\n");
      out.write("          <input\r\n");
      out.write("            type=\"text\"\r\n");
      out.write("            class=\"form-control pl-5\"\r\n");
      out.write("            placeholder=\"Search parts\"\r\n");
      out.write("            name=\"srch-term\"\r\n");
      out.write("            id=\"srch-term-header\"\r\n");
      out.write("          />\r\n");
      out.write("          <input hidden name=\"uid\" ");
 if(request.getParameter("uid") != null) {
      out.write("value=\"");
      out.print(request.getParameter("uid") );
      out.write('"');
 } else {
      out.write("value=\"\" ");
}
      out.write(" />\r\n");
      out.write("          <div class=\"input-group-btn\">\r\n");
      out.write("            <button\r\n");
      out.write("              class=\"btn bg_orange\"\r\n");
      out.write("              width=\"150dp\"\r\n");
      out.write("              height=\"50dp\"\r\n");
      out.write("              type=\"submit\"\r\n");
      out.write("            >\r\n");
      out.write("              <img src=\"./images/btn-search.svg\" alt=\"Wishlist\" height=\"30dp\" />\r\n");
      out.write("            </button>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </form>\r\n");
      out.write("      <button\r\n");
      out.write("        class=\"navbar-toggler\"\r\n");
      out.write("        type=\"button\"\r\n");
      out.write("        data-bs-toggle=\"collapse\"\r\n");
      out.write("        data-bs-target=\"#navbarNavAltMarkup\"\r\n");
      out.write("        aria-controls=\"navbarNavAltMarkup\"\r\n");
      out.write("        aria-expanded=\"false\"\r\n");
      out.write("        aria-label=\"Toggle navigation\"\r\n");
      out.write("      >\r\n");
      out.write("        <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("      </button>\r\n");
      out.write("      <div\r\n");
      out.write("        class=\"collapse navbar-collapse fixed-right justify-content-end\"\r\n");
      out.write("        id=\"navbarNavAltMarkup\"\r\n");
      out.write("      >\r\n");
      out.write("        <div class=\"navbar-nav\">\r\n");
      out.write("          <a\r\n");
      out.write("            class=\"nav-item nav-link active btn rounded-pill px-4\"\r\n");
      out.write("            style=\"color: aliceblue; background-color: #7541b0\"\r\n");
      out.write("            href=\"#\"\r\n");
      out.write("            ><span class=\"sr-only\">Sell</span></a\r\n");
      out.write("          >\r\n");
      out.write("          <a class=\"nav-item nav-link\" href=\"#\"\r\n");
      out.write("            ><img src=\"./images/btn-wishlist.svg\" alt=\"Wishlist\" height=\"30dp\"\r\n");
      out.write("          /></a>\r\n");
      out.write("          <a class=\"nav-item nav-link\" href=\"#\"\r\n");
      out.write("            ><img src=\"./images/btn-cart.svg\" alt=\"Wishlist\" height=\"30dp\"\r\n");
      out.write("          /></a>\r\n");
      out.write("          <a class=\"nav-item nav-link\" href=\"login.jsp\"\r\n");
      out.write("            ><img src=\"./images/btn-account.svg\" alt=\"Wishlist\" height=\"30dp\"\r\n");
      out.write("          /></a>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </nav>\r\n");
      out.write("\r\n");
      out.write("    <div style=\"padding-left: 50px; padding-right: 50px\">\r\n");
      out.write("      <span class=\"inline\" style=\"color: #7541b0\">SHOP CATEGORIES:</span>\r\n");
      out.write("      <nav class=\"nav nav-pills flex-column flex-sm-row inline pb-5 pt-1\">\r\n");
      out.write("        <a class=\"flex-sm-fill text-sm-center nav-link bg_white border50 mx-3\"\r\n");
      out.write("           href=\"gpu.jsp?uid=");
      out.print( request.getParameter("uid") != null ? request.getParameter("uid") : "" );
      out.write("\"\r\n");
      out.write("         >GPUs</a>\r\n");
      out.write("\r\n");
      out.write("        <a class=\"flex-sm-fill text-sm-center nav-link bg_white border50 mx-3\"\r\n");
      out.write("           href=\"cpu.jsp?uid=");
      out.print( request.getParameter("uid") != null ? request.getParameter("uid") : "" );
      out.write("\"\r\n");
      out.write("         >CPUs</a>\r\n");
      out.write("        \r\n");
      out.write("        <a class=\"flex-sm-fill text-sm-center nav-link bg_white border50 mx-3\"\r\n");
      out.write("           href=\"motherboards.jsp?uid=");
      out.print( request.getParameter("uid") != null ? request.getParameter("uid") : "" );
      out.write("\"\r\n");
      out.write("         >Motherboards</a>\r\n");
      out.write("         \r\n");
      out.write("         <a class=\"flex-sm-fill text-sm-center nav-link bg_white border50 mx-3\"\r\n");
      out.write("           href=\"ram.jsp?uid=");
      out.print( request.getParameter("uid") != null ? request.getParameter("uid") : "" );
      out.write("\"\r\n");
      out.write("         >Rams</a>\r\n");
      out.write("\r\n");
      out.write("         <a class=\"flex-sm-fill text-sm-center nav-link bg_white border50 mx-3\"\r\n");
      out.write("           href=\"storage.jsp?uid=");
      out.print( request.getParameter("uid") != null ? request.getParameter("uid") : "" );
      out.write("\"\r\n");
      out.write("         >Storage</a>\r\n");
      out.write("\r\n");
      out.write("         <a class=\"flex-sm-fill text-sm-center nav-link bg_white border50 mx-3\"\r\n");
      out.write("           href=\"cases.jsp?uid=");
      out.print( request.getParameter("uid") != null ? request.getParameter("uid") : "" );
      out.write("\"\r\n");
      out.write("         >Cases</a>\r\n");
      out.write("\r\n");
      out.write("         <a class=\"flex-sm-fill text-sm-center nav-link bg_white border50 mx-3\"\r\n");
      out.write("           href=\"coolers.jsp?uid=");
      out.print( request.getParameter("uid") != null ? request.getParameter("uid") : "" );
      out.write("\"\r\n");
      out.write("         >Coolers</a>\r\n");
      out.write("      </nav>\r\n");
      out.write("      <div class=\"d-flex mb-3\">\r\n");
      out.write("        <h4 class=\"p-2\">Motherboards</h4>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("      <div class=\"dropdown\">\r\n");
      out.write("        <button class=\"btn bg_orange dropdown-toggle\" type=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\r\n");
      out.write("          Sort By:\r\n");
      out.write("        </button>\r\n");
      out.write("        <ul class=\"dropdown-menu\">\r\n");
      out.write("         \r\n");
      out.write("          <li><a class=\"dropdown-item\" href=\"?sort=lp&uid=");
      out.print( request.getParameter("uid") != null ? request.getParameter("uid") : "" );
      out.write("\">Lowest Price</a></li>\r\n");
      out.write("          <li><a class=\"dropdown-item\" href=\"?sort=hp&uid=");
      out.print( request.getParameter("uid") != null ? request.getParameter("uid") : "" );
      out.write("\">Highest Price</a></li>\r\n");
      out.write("          <li><a class=\"dropdown-item\" href=\"?sort=az&uid=");
      out.print( request.getParameter("uid") != null ? request.getParameter("uid") : "" );
      out.write("\">Name: A to Z</a></li>\r\n");
      out.write("          <li><a class=\"dropdown-item\" href=\"?sort=za&uid=");
      out.print( request.getParameter("uid") != null ? request.getParameter("uid") : "" );
      out.write("\">Name: Z to A</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("      <div class=\"row row-cols-1 row-cols-md-6 g-4\">\r\n");
      out.write("          ");
 while (rset.next()) {
      out.write("\r\n");
      out.write("            <div class=\"col\">\r\n");
      out.write("              <div class=\"card h-100\">\r\n");
      out.write("                <img src=\"");
      out.print(rset.getString("link"));
      out.write("\"class=\"card-img-top\" alt=\"...\">\r\n");
      out.write("                <div class=\"card-body\">\r\n");
      out.write("                  \r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"card-footer\">\r\n");
      out.write("                  <h5 class=\"card-text\">");
      out.print(rset.getString("name"));
      out.write("</h5>\r\n");
      out.write("                  <h5 class=\"card-text\">");
out.print(priceFormatter.format(rset.getFloat("price")));
      out.write("</h5>\r\n");
      out.write("                  ");

                    String listing = "SELECT * FROM listings WHERE type = 'motherboards' AND itemID = '" +rset.getString("id")+"'";
                    ResultSet listingSet = stmt2.executeQuery(listing);
                    listingSet.next();
                    String listingID = listingSet.getString("id");
                
      out.write("\r\n");
      out.write("                  <form method=\"get\" action=\"viewListing\">\r\n");
      out.write("                  <input hidden name=\"listingId\" value=\"");
      out.print(listingID);
      out.write("\"/>\r\n");
      out.write("                  <input hidden name=\"uid\" ");
 if(request.getParameter("uid") != null) {
      out.write("value=\"");
      out.print(request.getParameter("uid") );
      out.write('"');
 } else {
      out.write("value=\"\" ");
}
      out.write(" />\r\n");
      out.write("                  <button type=\"submit\" class=\"btn bg_orange\" >View Listing</button>\r\n");
      out.write("                </form>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          ");
}
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  \r\n");
      out.write("    <div class=\"footer\">\r\n");
      out.write("      <footer class=\"site-footer\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("          <div class=\"row\">\r\n");
      out.write("            <div class=\"col-sm-12 col-md-6\">\r\n");
      out.write("              <h6>About</h6>\r\n");
      out.write("              <p class=\"text-justify\">\r\n");
      out.write("                OldEgg <i>Your Trusted PC Store </i> is an initiative to help\r\n");
      out.write("                the community of gamers and developers with their pc needs.\r\n");
      out.write("                OldEgg focuses on providing the most trusted and hassle free\r\n");
      out.write("                platform to obtain your pc parts. We will ensure you have a\r\n");
      out.write("                reliably working workhorse to push through all your needs.\r\n");
      out.write("              </p>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"col-xs-6 col-md-3\">\r\n");
      out.write("              <h6>Categories</h6>\r\n");
      out.write("              <ul class=\"footer-links\">\r\n");
      out.write("                <li>\r\n");
      out.write("                  <a class=\"flex-sm-fill text-sm nav-link\" href=\"gpu.jsp?uid=");
      out.print( request.getParameter("uid") != null ? request.getParameter("uid") : "" );
      out.write("\"\r\n");
      out.write("                    >GPUs</a\r\n");
      out.write("                  >\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                  <a class=\"flex-sm-fill text-sm nav-link\" href=\"cpu.jsp?uid=");
      out.print( request.getParameter("uid") != null ? request.getParameter("uid") : "" );
      out.write("\"\r\n");
      out.write("                    >CPUs</a\r\n");
      out.write("                  >\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                  <a class=\"flex-sm-fill text-sm nav-link\" href=\"motherboards.jsp?uid=");
      out.print( request.getParameter("uid") != null ? request.getParameter("uid") : "" );
      out.write("\"\r\n");
      out.write("                    >Motherboards</a\r\n");
      out.write("                  >\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                  <a class=\"flex-sm-fill text-sm nav-link\" href=\"ram.jsp?uid=");
      out.print( request.getParameter("uid") != null ? request.getParameter("uid") : "" );
      out.write("\"\r\n");
      out.write("                    >Rams</a\r\n");
      out.write("                  >\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                  <a class=\"flex-sm-fill text-sm nav-link\" href=\"storage.jsp?uid=");
      out.print( request.getParameter("uid") != null ? request.getParameter("uid") : "" );
      out.write("\"\r\n");
      out.write("                    >Storage</a\r\n");
      out.write("                  >\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                  <a class=\"flex-sm-fill text-sm nav-link\" href=\"cases.jsp?uid=");
      out.print( request.getParameter("uid") != null ? request.getParameter("uid") : "" );
      out.write("\"\r\n");
      out.write("                    >Cases</a\r\n");
      out.write("                  >\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                  <a class=\"flex-sm-fill text-sm nav-link\" href=\"coolers.jsp?uid=");
      out.print( request.getParameter("uid") != null ? request.getParameter("uid") : "" );
      out.write("\"\r\n");
      out.write("                    >Coolers</a\r\n");
      out.write("                  >\r\n");
      out.write("                </li>\r\n");
      out.write("              </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          <hr />\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("          <div class=\"row\">\r\n");
      out.write("            <div class=\"col-md-8 col-sm-6 col-xs-12\">\r\n");
      out.write("              <p class=\"copyright-text\">\r\n");
      out.write("                Copyright &copy; 2023 All Rights Reserved by\r\n");
      out.write("                <a href=\"#\">Ng Hsin-Kai</a> and <a href=\"#\">Irfan Syakir</a>\r\n");
      out.write("              </p>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"col-md-4 col-sm-6 col-xs-12\">\r\n");
      out.write("              <ul class=\"social-icons\">\r\n");
      out.write("                <li>\r\n");
      out.write("                  <a class=\"facebook bg_slategrey\" href=\"#\"\r\n");
      out.write("                    ><i class=\"fa fa-facebook\"></i\r\n");
      out.write("                  ></a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                  <a class=\"twitter bg_slategrey\" href=\"#\"\r\n");
      out.write("                    ><i class=\"fa fa-twitter\"></i\r\n");
      out.write("                  ></a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                  <a class=\"dribbble bg_slategrey\" href=\"#\"\r\n");
      out.write("                    ><i class=\"fa fa-dribbble\"></i\r\n");
      out.write("                  ></a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                  <a class=\"linkedin bg_slategrey\" href=\"#\"\r\n");
      out.write("                    ><i class=\"fa fa-linkedin\"></i\r\n");
      out.write("                  ></a>\r\n");
      out.write("                </li>\r\n");
      out.write("              </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </footer>\r\n");
      out.write("    </div>\r\n");
      out.write("    <script\r\n");
      out.write("      src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js\"\r\n");
      out.write("      integrity=\"sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN\"\r\n");
      out.write("      crossorigin=\"anonymous\"\r\n");
      out.write("    ></script>\r\n");
      out.write("  </body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
