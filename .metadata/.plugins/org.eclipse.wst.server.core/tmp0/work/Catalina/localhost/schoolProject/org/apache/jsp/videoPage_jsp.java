/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.26
 * Generated at: 2024-09-09 07:35:29 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class videoPage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/Layout/sideBar.jsp", Long.valueOf(1725866619876L));
    _jspx_dependants.put("/Layout/footer.jsp", Long.valueOf(1725866975140L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(4);
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

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\" data-bs-theme=\"dark\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>Video Page</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha2/dist/css/bootstrap.min.css\">\r\n");
      out.write("    <script src=\"https://kit.fontawesome.com/ae360af17e.js\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"./CSS/style.css\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("    <div class=\"wrapper\">\r\n");
      out.write("\r\n");
      out.write("        <aside id=\"sidebar\" class=\"js-sidebar\">\r\n");
      out.write("            <!-- Content For Sidebar -->\r\n");
      out.write("            <div class=\"h-100\">\r\n");
      out.write("\r\n");
      out.write("                <div class=\"sidebar-logo\">\r\n");
      out.write("                    <a href=\"#\">FUTURE STAR <br> CRAFTING</a>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <ul class=\"sidebar-nav\">\r\n");
      out.write("\r\n");
      out.write("                    <li class=\"sidebar-header\">\r\n");
      out.write("                        PAGES\r\n");
      out.write("                    </li>\r\n");
      out.write("\r\n");
      out.write("                    <li class=\"sidebar-item\">\r\n");
      out.write("                        <a href=\"homePage.jsp\" class=\"sidebar-link links\">\r\n");
      out.write("                            <i class=\"fa-solid fa-house pe-2\"></i>\r\n");
      out.write("                            Home Page\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    \r\n");
      out.write("                    <li class=\"sidebar-item\">\r\n");
      out.write("                        <a href=\"videoPage.jsp\" class=\"sidebar-link collapsed\" data-bs-target=\"#posts\" data-bs-toggle=\"collapse\"\r\n");
      out.write("                            aria-expanded=\"false\"><i class=\"fa-regular fa-circle-play pe-2\"></i>\r\n");
      out.write("                            Video Page\r\n");
      out.write("                        </a>\r\n");
      out.write("                        <ul id=\"posts\" class=\"sidebar-dropdown list-unstyled collapse ms-4\" data-bs-parent=\"#sidebar\">\r\n");
      out.write("                            <li class=\"sidebar-item\">\r\n");
      out.write("                                <a href=\"videoPage.jsp\" type=\"button\" class=\"sidebar-link links\">All</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li class=\"sidebar-item\">\r\n");
      out.write("                                <a href=\"#\" class=\"sidebar-link links\">Education</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li class=\"sidebar-item\">\r\n");
      out.write("                                <a href=\"#\" class=\"sidebar-link links\">Music and Dance</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li class=\"sidebar-item\">\r\n");
      out.write("                                <a href=\"#\" class=\"sidebar-link links\">Sports</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li class=\"sidebar-item\">\r\n");
      out.write("                                <a href=\"#\" class=\"sidebar-link links\">Animated Stories</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li class=\"sidebar-item\">\r\n");
      out.write("                                <a href=\"#\" class=\"sidebar-link links\">Arts and Crafts</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("\r\n");
      out.write("                    <li class=\"sidebar-item\">\r\n");
      out.write("                        <a href=\"articlePage.jsp\" class=\"sidebar-link links\">\r\n");
      out.write("                            <i class=\"fa-solid fa-book-open-reader pe-2\"></i>\r\n");
      out.write("                            Article Page\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </li>\r\n");
      out.write("\r\n");
      out.write("                    <hr>\r\n");
      out.write("\r\n");
      out.write("                    <li class=\"sidebar-header\">\r\n");
      out.write("                        YOUR PROFILE\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"sidebar-item\">\r\n");
      out.write("                        <a href=\"#\" class=\"sidebar-link collapsed\" data-bs-target=\"#auth\" data-bs-toggle=\"collapse\"\r\n");
      out.write("                            aria-expanded=\"false\"><i class=\"fa-regular fa-user pe-2\"></i>\r\n");
      out.write("                            User Name\r\n");
      out.write("                        </a>\r\n");
      out.write("                        <ul id=\"auth\" class=\"sidebar-dropdown list-unstyled collapse ms-4\" data-bs-parent=\"#sidebar\">\r\n");
      out.write("                            <li class=\"sidebar-item\">\r\n");
      out.write("                                <a href=\"#\" class=\"sidebar-link links\">Login</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li class=\"sidebar-item\">\r\n");
      out.write("                                <a href=\"#\" class=\"sidebar-link links\">Register</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li class=\"sidebar-item\">\r\n");
      out.write("                                <a href=\"#\" class=\"sidebar-link links\">Logout</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("        </aside>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <div class=\"main\">\r\n");
      out.write("\r\n");
      out.write("            <nav class=\"navBAR navbar px-3 border-bottom \">\r\n");
      out.write("                \r\n");
      out.write("                <div class=\"title-con\">\r\n");
      out.write("                    <button class=\"btn\" id=\"sidebar-toggle\" type=\"button\">\r\n");
      out.write("                        <i class=\"fa-solid fa-bars\"></i>\r\n");
      out.write("                    </button>\r\n");
      out.write("    \r\n");
      out.write("                    <h2>Video</h2>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <form action=\"\" class=\"search-bar-con ms-3\" method=\"post\">\r\n");
      out.write("                    <input placeholder=\"Search\" type=\"text\">\r\n");
      out.write("                    <button><i class=\"fa-solid fa-magnifying-glass\"></i></i></button>\r\n");
      out.write("                </form>\r\n");
      out.write("\r\n");
      out.write("                <div class=\" navbar\">\r\n");
      out.write("                    <ul class=\"navbar-nav\">\r\n");
      out.write("                        <li class=\"nav-item dropdown \">\r\n");
      out.write("                            <a href=\"#\" data-bs-toggle=\"dropdown\" class=\"nav-icon pe-md-0 proImg\">\r\n");
      out.write("                                <img src=\"./IMAGE/profileImage.jpg\" class=\" avatar img-fluid rounded\" alt=\"\">\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <!-- <div class=\"dropdown-menu dropdown-menu-end\">\r\n");
      out.write("                                <a href=\"#\" class=\"dropdown-item\">Profile</a>\r\n");
      out.write("                                <a href=\"#\" class=\"dropdown-item\">Setting</a>\r\n");
      out.write("                                <a href=\"#\" class=\"dropdown-item\">Logout</a>\r\n");
      out.write("                            </div> -->\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("            </nav>\r\n");
      out.write("\r\n");
      out.write("            <main class=\"content px-3 py-2\">\r\n");
      out.write("                <div class=\"container-fluid box-container\">\r\n");
      out.write("                    \r\n");
      out.write("                    <div class=\"box\">\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"vid-con\">\r\n");
      out.write("                            <a href=\"#\"><i class=\"fa-solid fa-play\" style=\"color: #ff7300;\"></i></a>\r\n");
      out.write("                            <video src=\"/Kids vocabulary - World food - Learn English for kids - English educational video.mp4\"></video>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"vid-det\">\r\n");
      out.write("                            <h4>SOLAR SYSTEM - The Dr. Binocs Show - Best Learning Videos For Kids - Peekaboo Kidz</h4>\r\n");
      out.write("                            <div class=\"vid-btns\">\r\n");
      out.write("                                <button>\r\n");
      out.write("                                    <a href=\"#\"><i class=\"fa-solid fa-thumbs-up\"></i></a> <span>300</span>\r\n");
      out.write("                                </button>\r\n");
      out.write("                                <span>600 view</span>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"box\">\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"vid-con\">\r\n");
      out.write("                            <a href=\"#\"><i class=\"fa-solid fa-play\" style=\"color: #ff7300;\"></i></a>\r\n");
      out.write("                            <video src=\"/Kids vocabulary - World food - Learn English for kids - English educational video.mp4\"></video>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"vid-det\">\r\n");
      out.write("                            <h4>SOLAR SYSTEM - The Dr. Binocs Show - Best Learning Videos For Kids - Peekaboo Kidz</h4>\r\n");
      out.write("                            <div class=\"vid-btns\">\r\n");
      out.write("                                <button>\r\n");
      out.write("                                    <a href=\"#\"><i class=\"fa-solid fa-thumbs-up\"></i></a> <span>300</span>\r\n");
      out.write("                                </button>\r\n");
      out.write("                                <span>600 view</span>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"box\">\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"vid-con\">\r\n");
      out.write("                            <a href=\"#\"><i class=\"fa-solid fa-play\" style=\"color: #ff7300;\"></i></a>\r\n");
      out.write("                            <video src=\"/Kids vocabulary - World food - Learn English for kids - English educational video.mp4\"></video>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"vid-det\">\r\n");
      out.write("                            <h4>SOLAR SYSTEM - The Dr. Binocs Show - Best Learning Videos For Kids - Peekaboo Kidz</h4>\r\n");
      out.write("                            <div class=\"vid-btns\">\r\n");
      out.write("                                <button>\r\n");
      out.write("                                    <a href=\"#\"><i class=\"fa-solid fa-thumbs-up\"></i></a> <span>300</span>\r\n");
      out.write("                                </button>\r\n");
      out.write("                                <span>600 view</span>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"box\">\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"vid-con\">\r\n");
      out.write("                            <a href=\"#\"><i class=\"fa-solid fa-play\" style=\"color: #ff7300;\"></i></a>\r\n");
      out.write("                            <video src=\"/Kids vocabulary - World food - Learn English for kids - English educational video.mp4\"></video>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"vid-det\">\r\n");
      out.write("                            <h4>SOLAR SYSTEM - The Dr. Binocs Show - Best Learning Videos For Kids - Peekaboo Kidz</h4>\r\n");
      out.write("                            <div class=\"vid-btns\">\r\n");
      out.write("                                <button>\r\n");
      out.write("                                    <a href=\"#\"><i class=\"fa-solid fa-thumbs-up\"></i></a> <span>300</span>\r\n");
      out.write("                                </button>\r\n");
      out.write("                                <span>600 view</span>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"box\">\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"vid-con\">\r\n");
      out.write("                            <a href=\"#\"><i class=\"fa-solid fa-play\" style=\"color: #ff7300;\"></i></a>\r\n");
      out.write("                            <video src=\"/Kids vocabulary - World food - Learn English for kids - English educational video.mp4\"></video>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"vid-det\">\r\n");
      out.write("                            <h4>SOLAR SYSTEM - The Dr. Binocs Show - Best Learning Videos For Kids - Peekaboo Kidz</h4>\r\n");
      out.write("                            <div class=\"vid-btns\">\r\n");
      out.write("                                <button>\r\n");
      out.write("                                    <a href=\"#\"><i class=\"fa-solid fa-thumbs-up\"></i></a> <span>300</span>\r\n");
      out.write("                                </button>\r\n");
      out.write("                                <span>600 view</span>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"box\">\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"vid-con\">\r\n");
      out.write("                            <a href=\"#\"><i class=\"fa-solid fa-play\" style=\"color: #ff7300;\"></i></a>\r\n");
      out.write("                            <video src=\"/Kids vocabulary - World food - Learn English for kids - English educational video.mp4\"></video>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"vid-det\">\r\n");
      out.write("                            <h4>SOLAR SYSTEM - The Dr. Binocs Show - Best Learning Videos For Kids - Peekaboo Kidz</h4>\r\n");
      out.write("                            <div class=\"vid-btns\">\r\n");
      out.write("                                <button>\r\n");
      out.write("                                    <a href=\"#\"><i class=\"fa-solid fa-thumbs-up\"></i></a> <span>300</span>\r\n");
      out.write("                                </button>\r\n");
      out.write("                                <span>600 view</span>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"box\">\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"vid-con\">\r\n");
      out.write("                            <a href=\"#\"><i class=\"fa-solid fa-play\" style=\"color: #ff7300;\"></i></a>\r\n");
      out.write("                            <video src=\"/Kids vocabulary - World food - Learn English for kids - English educational video.mp4\"></video>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"vid-det\">\r\n");
      out.write("                            <h4>SOLAR SYSTEM - The Dr. Binocs Show - Best Learning Videos For Kids - Peekaboo Kidz</h4>\r\n");
      out.write("                            <div class=\"vid-btns\">\r\n");
      out.write("                                <button>\r\n");
      out.write("                                    <a href=\"#\"><i class=\"fa-solid fa-thumbs-up\"></i></a> <span>300</span>\r\n");
      out.write("                                </button>\r\n");
      out.write("                                <span>600 view</span>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"box\">\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"vid-con\">\r\n");
      out.write("                            <a href=\"#\"><i class=\"fa-solid fa-play\" style=\"color: #ff7300;\"></i></a>\r\n");
      out.write("                            <video src=\"/Kids vocabulary - World food - Learn English for kids - English educational video.mp4\"></video>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"vid-det\">\r\n");
      out.write("                            <h4>SOLAR SYSTEM - The Dr. Binocs Show - Best Learning Videos For Kids - Peekaboo Kidz</h4>\r\n");
      out.write("                            <div class=\"vid-btns\">\r\n");
      out.write("                                <button>\r\n");
      out.write("                                    <a href=\"#\"><i class=\"fa-solid fa-thumbs-up\"></i></a> <span>300</span>\r\n");
      out.write("                                </button>\r\n");
      out.write("                                <span>600 view</span>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"box\">\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"vid-con\">\r\n");
      out.write("                            <a href=\"#\"><i class=\"fa-solid fa-play\" style=\"color: #ff7300;\"></i></a>\r\n");
      out.write("                            <video src=\"/Kids vocabulary - World food - Learn English for kids - English educational video.mp4\"></video>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"vid-det\">\r\n");
      out.write("                            <h4>SOLAR SYSTEM - The Dr. Binocs Show - Best Learning Videos For Kids - Peekaboo Kidz</h4>\r\n");
      out.write("                            <div class=\"vid-btns\">\r\n");
      out.write("                                <button>\r\n");
      out.write("                                    <a href=\"#\"><i class=\"fa-solid fa-thumbs-up\"></i></a> <span>300</span>\r\n");
      out.write("                                </button>\r\n");
      out.write("                                <span>600 view</span>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                   \r\n");
      out.write("                </div>\r\n");
      out.write("            </main>\r\n");
      out.write("\r\n");
      out.write("            <!-- <a href=\"#\" class=\"theme-toggle\">\r\n");
      out.write("                <i class=\"fa-regular fa-moon\"></i>\r\n");
      out.write("                <i class=\"fa-regular fa-sun\"></i>\r\n");
      out.write("            </a> -->\r\n");
      out.write("\r\n");
      out.write("            \r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write(" </div>\r\n");
      out.write("	<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha2/dist/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("    <script type=\"module\" src=\"./JS/script.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
      out.write('\r');
      out.write('\n');
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
