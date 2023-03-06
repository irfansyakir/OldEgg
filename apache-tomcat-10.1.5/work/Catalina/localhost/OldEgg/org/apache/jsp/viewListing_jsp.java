/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.5
 * Generated at: 2023-03-05 16:01:03 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class viewListing_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_packages.add("jakarta.servlet");
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\" />\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />\n");
      out.write("    <title>OldEgg | ");
      out.print( response.getHeader("name") );
      out.write("</title>\n");
      out.write("    <link rel=\"icon\" type=\"image/x-icon\" href=\"./images/oldegg-icon.png\" />\n");
      out.write("    <link\n");
      out.write("      href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css\"\n");
      out.write("      rel=\"stylesheet\"\n");
      out.write("      integrity=\"sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD\"\n");
      out.write("      crossorigin=\"anonymous\"\n");
      out.write("    />\n");
      out.write("    <link href=\"./style/style.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("  </head>\n");
      out.write("  <body class=\"bg_default\">\n");
      out.write("    <nav\n");
      out.write("      class=\"navbar sticky-top navbar-expand-lg navbar-light bg_default\"\n");
      out.write("      style=\"padding: 20px 50px 15px 50px\"\n");
      out.write("    >\n");
      out.write("      <a\n");
      out.write("        class=\"navbar-brand\"\n");
      out.write("        href=\"index.jsp\"\n");
      out.write("        style=\"padding-bottom: 15px; padding-right: 50px\"\n");
      out.write("      >\n");
      out.write("        <img\n");
      out.write("          src=\"./images/oldegg-logo-transparent.png\"\n");
      out.write("          width=\"150dp\"\n");
      out.write("          height=\"50dp\"\n");
      out.write("          alt=\"OldEgg\"\n");
      out.write("        />\n");
      out.write("      </a>\n");
      out.write("      <form class=\"navbar-form\" role=\"search\">\n");
      out.write("        <div class=\"input-group\" style=\"width: 40em\">\n");
      out.write("          <input\n");
      out.write("            type=\"text\"\n");
      out.write("            class=\"form-control pl-5\"\n");
      out.write("            placeholder=\"Search parts and sellers\"\n");
      out.write("            name=\"srch-term\"\n");
      out.write("            id=\"srch-term-header\"\n");
      out.write("          />\n");
      out.write("          <div class=\"input-group-btn\">\n");
      out.write("            <button\n");
      out.write("              class=\"btn bg_orange\"\n");
      out.write("              width=\"150dp\"\n");
      out.write("              height=\"50dp\"\n");
      out.write("              type=\"submit\"\n");
      out.write("            >\n");
      out.write("              <img src=\"./images/btn-search.svg\" alt=\"Wishlist\" height=\"30dp\" />\n");
      out.write("            </button>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </form>\n");
      out.write("      <button\n");
      out.write("        class=\"navbar-toggler\"\n");
      out.write("        type=\"button\"\n");
      out.write("        data-bs-toggle=\"collapse\"\n");
      out.write("        data-bs-target=\"#navbarNavAltMarkup\"\n");
      out.write("        aria-controls=\"navbarNavAltMarkup\"\n");
      out.write("        aria-expanded=\"false\"\n");
      out.write("        aria-label=\"Toggle navigation\"\n");
      out.write("      >\n");
      out.write("        <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("      </button>\n");
      out.write("      <div\n");
      out.write("        class=\"collapse navbar-collapse fixed-right justify-content-end\"\n");
      out.write("        id=\"navbarNavAltMarkup\"\n");
      out.write("      >\n");
      out.write("        <div class=\"navbar-nav\">\n");
      out.write("          <a\n");
      out.write("            class=\"nav-item nav-link active btn rounded-pill px-4\"\n");
      out.write("            style=\"color: aliceblue; background-color: #7541b0\"\n");
      out.write("            href=\"#\"\n");
      out.write("            ><span class=\"sr-only\">Sell</span></a\n");
      out.write("          >\n");
      out.write("          <a class=\"nav-item nav-link\" href=\"#\"\n");
      out.write("            ><img src=\"./images/btn-wishlist.svg\" alt=\"Wishlist\" height=\"30dp\"\n");
      out.write("          /></a>\n");
      out.write("          <a class=\"nav-item nav-link\" href=\"#\"\n");
      out.write("            ><img src=\"./images/btn-cart.svg\" alt=\"Wishlist\" height=\"30dp\"\n");
      out.write("          /></a>\n");
      out.write("          <a class=\"nav-item nav-link\" href=\"login.jsp\"\n");
      out.write("            ><img src=\"./images/btn-account.svg\" alt=\"Wishlist\" height=\"30dp\"\n");
      out.write("          /></a>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </nav>\n");
      out.write("\n");
      out.write("    <div class=\"container pt-5\">\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"col-lg-6\">\n");
      out.write("          <div class=\"row\">\n");
      out.write("            <div class=\"col-lg-12\">\n");
      out.write("              <img class=\"zoom\" src=\"");
      out.print( response.getHeader("link") );
      out.write("\" />\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"row pt-3\">\n");
      out.write("            <div class=\"col-lg-12\">\n");
      out.write("              <p>\n");
      out.write("                Have a similar item?\n");
      out.write("                <a class=\"underline\" href=\"#\">Sell yours</a>\n");
      out.write("              </p>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-lg-6\">\n");
      out.write("          <div class=\"row\">\n");
      out.write("            <div class=\"col-lg-12 pb-3\">\n");
      out.write("              <h2>");
      out.print( response.getHeader("name") );
      out.write("</h2>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"row\">\n");
      out.write("            <div class=\"col-lg-12 pb-3\">\n");
      out.write("              <h3>$");
      out.print( response.getHeader("price") );
      out.write("</h3>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"row\">\n");
      out.write("            <div class=\"col-lg-12\">\n");
      out.write("              <form method=\"post\" action=\"viewListing\">\n");
      out.write("                <input type=\"hidden\" name=\"itemID\" value=");
      out.print( response.getHeader("itemID") );
      out.write(" ></input>\n");
      out.write("                <input type=\"hidden\" name=\"uid\" value=");
      out.print( response.getHeader("uid") );
      out.write("></input>\n");
      out.write("                <input type=\"hidden\" name=\"name\" value=\"");
      out.print( response.getHeader("name") );
      out.write("\" ></input>\n");
      out.write("                <input type=\"hidden\" name=\"price\" value=");
      out.print( response.getHeader("price") );
      out.write("></input>\n");
      out.write("                <input type=\"hidden\" name=\"qty\" value=");
      out.print( response.getHeader("qty") );
      out.write(" ></input>\n");
      out.write("                <input type=\"hidden\" name=\"link\" value=");
      out.print( response.getHeader("link") );
      out.write("></input>\n");
      out.write("                <input type=\"hidden\" name=\"itemInfo\" value=\"");
      out.print( response.getHeader("itemInfo") );
      out.write("\" ></input>\n");
      out.write("                <input type=\"hidden\" name=\"action\" value=\"purchase\" ></input>\n");
      out.write("                <input\n");
      out.write("                style=\"width: 300px;\"\n");
      out.write("                  type=\"submit\"\n");
      out.write("                  class=\"btn bg_orange\"\n");
      out.write("                  value=\"Purchase\"\n");
      out.write("                />\n");
      out.write("              </form>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"row\">\n");
      out.write("            <div class=\"col-lg-12 pb-3\">\n");
      out.write("              <form method=\"post\" action=\"viewListing\">\n");
      out.write("                <input type=\"hidden\" name=\"itemID\" value=");
      out.print( response.getHeader("itemID") );
      out.write("></input>\n");
      out.write("                <br />\n");
      out.write("                <input type=\"hidden\" name=\"uid\" value=");
      out.print( response.getHeader("uid") );
      out.write("></input>\n");
      out.write("                <input type=\"hidden\" name=\"action\" value=\"addtocart\" type=\"text\" ></input>\n");
      out.write("                <input\n");
      out.write("                style=\"width: 300px;\"\n");
      out.write("                  type=\"submit\"\n");
      out.write("                  class=\"btn bg_orange\"\n");
      out.write("                  value=\"Add to Cart\"\n");
      out.write("                />\n");
      out.write("              </form>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          \n");
      out.write("          <div class=\"row\">\n");
      out.write("            <div class=\"col-lg-12 pb-3\">\n");
      out.write("              <p>Sold by <a href=\"#\" class=\"underline\">Anonymous panda</a></p>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"row\">\n");
      out.write("            <div class=\"col-lg-12 pb-3\">\n");
      out.write("              <p class=\"text-justify\">");
      out.print( response.getHeader("itemInfo") );
      out.write("</p>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"pb-4 pt-4\"></div>\n");
      out.write("\n");
      out.write("      <div class=\"d-flex mb-3\">\n");
      out.write("        <h4>Similar Items</h4>\n");
      out.write("        <a class=\"ms-auto\">see all ></a>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div\n");
      out.write("        class=\"d-flex flex-row flex-nowrap overflow-auto pb-2\"\n");
      out.write("        style=\"height: 300px\"\n");
      out.write("      >\n");
      out.write("        <div class=\"card card-block mx-2\" style=\"min-width: 300px\">Card</div>\n");
      out.write("        <div class=\"card card-block mx-2\" style=\"min-width: 300px\">Card</div>\n");
      out.write("        <div class=\"card card-block mx-2\" style=\"min-width: 300px\">Card</div>\n");
      out.write("        <div class=\"card card-block mx-2\" style=\"min-width: 300px\">Card</div>\n");
      out.write("        <div class=\"card card-block mx-2\" style=\"min-width: 300px\">Card</div>\n");
      out.write("        <div class=\"card card-block mx-2\" style=\"min-width: 300px\">Card</div>\n");
      out.write("        <div class=\"card card-block mx-2\" style=\"min-width: 300px\">Card</div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"footer\">\n");
      out.write("      <footer class=\"site-footer\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("          <div class=\"row\">\n");
      out.write("            <div class=\"col-sm-12 col-md-6\">\n");
      out.write("              <h6>About</h6>\n");
      out.write("              <p class=\"text-justify\">\n");
      out.write("                OldEgg <i>Your Trusted PC Store </i> is an initiative to help\n");
      out.write("                the community of gamers and developers with their pc needs.\n");
      out.write("                OldEgg focuses on providing the most trusted and hassle free\n");
      out.write("                platform to obtain your pc parts. We will ensure you have a\n");
      out.write("                reliably working workhorse to push through all your needs.\n");
      out.write("              </p>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"col-xs-6 col-md-3\">\n");
      out.write("              <h6>Categories</h6>\n");
      out.write("              <ul class=\"footer-links\">\n");
      out.write("                <li>\n");
      out.write("                  <a class=\"flex-sm-fill text-sm nav-link\" href=\"#\">All</a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                  <a class=\"flex-sm-fill text-sm nav-link\" href=\"#\">GPUs</a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                  <a class=\"flex-sm-fill text-sm nav-link\" href=\"#\">CPUs</a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                  <a class=\"flex-sm-fill text-sm nav-link\" href=\"#\"\n");
      out.write("                    >Motherboards</a\n");
      out.write("                  >\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                  <a class=\"flex-sm-fill text-sm nav-link\" href=\"#\">Rams</a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                  <a class=\"flex-sm-fill text-sm nav-link\" href=\"#\">Storage</a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                  <a class=\"flex-sm-fill text-sm nav-link\" href=\"#\">Cases</a>\n");
      out.write("                </li>\n");
      out.write("              </ul>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <hr />\n");
      out.write("        </div>\n");
      out.write("        <div class=\"container\">\n");
      out.write("          <div class=\"row\">\n");
      out.write("            <div class=\"col-md-8 col-sm-6 col-xs-12\">\n");
      out.write("              <p class=\"copyright-text\">\n");
      out.write("                Copyright &copy; 2023 All Rights Reserved by\n");
      out.write("                <a href=\"#\">Ng Hsin-Kai</a> and <a href=\"#\">Irfan Syakir</a>\n");
      out.write("              </p>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"col-md-4 col-sm-6 col-xs-12\">\n");
      out.write("              <ul class=\"social-icons\">\n");
      out.write("                <li>\n");
      out.write("                  <a class=\"facebook bg_slategrey\" href=\"#\"\n");
      out.write("                    ><i class=\"fa fa-facebook\"></i\n");
      out.write("                  ></a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                  <a class=\"twitter bg_slategrey\" href=\"#\"\n");
      out.write("                    ><i class=\"fa fa-twitter\"></i\n");
      out.write("                  ></a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                  <a class=\"dribbble bg_slategrey\" href=\"#\"\n");
      out.write("                    ><i class=\"fa fa-dribbble\"></i\n");
      out.write("                  ></a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                  <a class=\"linkedin bg_slategrey\" href=\"#\"\n");
      out.write("                    ><i class=\"fa fa-linkedin\"></i\n");
      out.write("                  ></a>\n");
      out.write("                </li>\n");
      out.write("              </ul>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </footer>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <script\n");
      out.write("      src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js\"\n");
      out.write("      integrity=\"sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN\"\n");
      out.write("      crossorigin=\"anonymous\"\n");
      out.write("    ></script>\n");
      out.write("  </body>\n");
      out.write("</html>\n");
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
