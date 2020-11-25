package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class EditProfile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/UserPages/header.jsp");
    _jspx_dependants.add("/UserPages/footer.jsp");
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link href=\"../css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <link href=\"../Stylesheets/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\" >\n");
      out.write("\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("                    <h1 style=\"color:black;\"> ERAVATION </h1>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-3\">\n");
      out.write("                    <input type=\"text\" class=\"form-control pull-right\" id=\"seTxt\"/>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-3\">\n");
      out.write("                    <input type=\"Button\" value=\"Search\" class=\" btn btn-primary pull-right\" id=\"seBtn\"  />\n");
      out.write("                </div>   \n");
      out.write("\n");
      out.write("                <div class=\"row\" >\n");
      out.write("                    <div class=\"col-md-12\" style=\"background: skyblue;height: 60px\">\n");
      out.write("                        <ul class=\" pull-left  nav nav-pills\"  >\n");
      out.write("                            <li><a href=\"#\"class=\"menu\"><b> Home </b></a></li>\n");
      out.write("                            <li><a href=\"#\" class=\"menu\"><b> About Us </b></a></li>\n");
      out.write("                            <li><a href=\"#\"  class=\"menu\"><b> FAQS </b></a></li>\n");
      out.write("                        </ul>\n");
      out.write("                        <ul class=\" pull-right nav nav-pills\" >\n");
      out.write("                            <li><a href=\"../Registration.jsp\" class=\"menu\"><b> Sign Up </b></a></li>\n");
      out.write("                            <li><a href=\"../Login.jsp\" class=\"menu\"><b> Login </b></a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"container\" id=\"ContentsDiv\"><!--header-->\n");
      out.write("\n");
      out.write("<link href=\"StyleSheets/EditProfile.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("    <form method=\"post\" action =\"User\">\n");
      out.write("        <div class=\"panel panel-default\" id=\"panel\">\n");
      out.write("            <div class=\"panel-heading\">\n");
      out.write("                <center><h1> Edit Profile</h1> </center>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"panel-body\" >\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-6\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </div>   \n");
      out.write("                </div> \n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </form>\n");
      out.write("</div>\n");
      out.write(" </div><!--footer start-->\n");
      out.write("        <div class=\"container\">\n");
      out.write("           \n");
      out.write("\n");
      out.write("            <div class=\"container\" style=\"height:120px\">\n");
      out.write("                <div class=\"row\" >\n");
      out.write("                    <div class=\"col-md-12\" id=\"footer\">\n");
      out.write("                        <h4 class=\"text-center\" style=\"color:blue\"> <b>SPIC-CENTER OF EXCELLENCE</b></h3>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>");
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
