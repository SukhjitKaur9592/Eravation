package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Registration_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/footer.jsp");
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <link href=\"Stylesheets/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        \n");
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
      out.write("                            <li><a href=\"Registration.jsp\" class=\"menu\"><b> Sign Up </b></a></li>\n");
      out.write("                            <li><a href=\"Login.jsp\" class=\"menu\"><b> Login </b></a></li>\n");
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
      out.write("        <div class=\"container\" ><!--header-->\n");
      out.write("\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\" src=\"JScripts/Registration.js\"></script>\n");
      out.write("\n");
      out.write("<div class=\"container\" style=\"padding-left: 150px; padding-right: 150px; padding-top: 20px\" > \n");
      out.write("    <div class=\"panel panel-default\">\n");
      out.write("        <div class=\"panel-heading\">\n");
      out.write("            <h1 style=\"color: #od3b4c;     text-align: center\">\n");
      out.write("                Create new Account\n");
      out.write("            </h1>\n");
      out.write("        </div><!--div close-->\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <div class=\" panel-body\" >\n");
      out.write("            <form method=\"post\" action=\"User\">\n");
      out.write("\n");
      out.write("                <label for =\"txtName\" class=\"control-label\">Name:</label>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-6\">\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"txtName\" name=\"txtName\" placeholder=\"Name\"/>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-6\">\n");
      out.write("                        <span id=\"sp1\"></span>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <label for=\"rbtGender\" class=\"control-label\">Gender:</label>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-3\">\n");
      out.write("                        <input type=\"radio\"  value=\"Male\" id=\"rbtMale\" name=\"rbtGender\" />Male\n");
      out.write("                    </div> \n");
      out.write("                    \n");
      out.write("                    <div class=\"col-md-3\">\n");
      out.write("                        <input type=\"radio\"  value=\"Female\" id=\"rbtFemale\" name=\"rbtGender\"/> Female\n");
      out.write("                    </div> \n");
      out.write("                    \n");
      out.write("                    <div class=\"col-md-3\">\n");
      out.write("                        <span id=\"sp2\"></span>\n");
      out.write("                    </div> \n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <label for=\"txtMail\" class=\"control-label\" style=\"margin-top: 10px\">e-mail:</label>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-6\">\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"txtMail\" name=\"txtMail\"  placeholder=\"e-mail\"/>\n");
      out.write("                    </div> \n");
      out.write("                    \n");
      out.write("                    <div class=\"col-md-6\">\n");
      out.write("                        <div class=\"col-md-6\">\n");
      out.write("                            <span id=\"sp3\"></span>\n");
      out.write("                    </div> \n");
      out.write("                    </div> \n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <label for=\"txtContact\" class=\"control-label\">Contact No:</label>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-6\">\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"txtContact\" name=\"txtContact\" placeholder=\"Contact No\"/>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    <div class=\"col-md-6\">\n");
      out.write("                        <span id=\"sp4\"></span>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <label for=\"txtAddress\" class=\"control-label\">Address:</label>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-6\">\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"txtAddress\" name=\"txtAddress\" placeholder=\"Address\"/>\n");
      out.write("                    </div> \n");
      out.write("                    \n");
      out.write("                     <div class=\"col-md-6\">\n");
      out.write("                         <span id=\"sp5\"></span>\n");
      out.write("                    </div> \n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <label for=\"ddlCity\" class=\"control-label\">City:</label>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-6\">\n");
      out.write("                        <select class=\"form-control\" id=\"ddlCity\" name=\"ddlCity\">\n");
      out.write("                            <option> Select City </option>\n");
      out.write("                            <option> Amritsar </option>\n");
      out.write("                            <option> Chandigarh </option> \n");
      out.write("                            <option> Jalandhar </option>\n");
      out.write("                            <option> Patiala </option> \n");
      out.write("                            <option> Ludhiana </option>\n");
      out.write("                        </select>\n");
      out.write("                    </div>\n");
      out.write("                     <div class=\"col-md-6\">\n");
      out.write("                         <span id=\"sp6\"></span>\n");
      out.write("                    </div> \n");
      out.write("                </div> \n");
      out.write("\n");
      out.write("                <label for=\"txtUserId\" class=\"control-label\">User Id:</label>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-6\">\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"txtUserId\" name=\"txtUserId\" placeholder=\"User Id\"/>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                     <div class=\"col-md-6\">\n");
      out.write("                         <span id=\"sp7\"></span>\n");
      out.write("                    </div> \n");
      out.write("                </div>  \n");
      out.write("\n");
      out.write("                <label for=\"txtPasword\" class=\"control-label\">Password:</label>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-6\">\n");
      out.write("                        <input type=\"password\" class=\"form-control\" id=\"txtPassword\" name=\"txtPassword\" placeholder=\"password\"/>\n");
      out.write("                    </div> \n");
      out.write("                     <div class=\"col-md-6\">\n");
      out.write("                         <span id=\"sp8\"></span>\n");
      out.write("                    </div> \n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("               \n");
      out.write("                \n");
      out.write("                <label for=\"txtConfirmPassword\" class=\"control-label\"> Confirm Password:</label>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-6\">\n");
      out.write("                        <input type=\"password\" class=\"form-control\" id=\"txtConfirmPassword\" name=\"txtConfirmPassword\" placeholder=\"Confirm password\"/>\n");
      out.write("                    </div>    \n");
      out.write("                     <div class=\"col-md-6\">\n");
      out.write("                         <span id=\"sp9\"></span>\n");
      out.write("                    </div> \n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <label for=\"ddlSecurityQuestion\" class=\"control-label\">Security Question:</label>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-6\">\n");
      out.write("                        <select class=\"form-control\" id=\"ddlSecurityQuestion\" name=\"ddlSecurityQuestion\">\n");
      out.write("                            <option> Select Question </option>\n");
      out.write("                            <option> Name of favorite book </option>\n");
      out.write("                            <option> Name of Birth place </option> \n");
      out.write("                            <option> Favorite Song </option>\n");
      out.write("                            <option> First School Name </option> \n");
      out.write("                            <option> Name of favorite Author </option>\n");
      out.write("                        </select>\n");
      out.write("                    </div>\n");
      out.write("                     <div class=\"col-md-6\">\n");
      out.write("                         <span id=\"sp10\"></span>\n");
      out.write("                    </div> \n");
      out.write("                </div> \n");
      out.write("                \n");
      out.write("                 <label for=\"txtAnswer\" class=\"control-label\">Answer:</label>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-6\">\n");
      out.write("                        <input type=\"password\" class=\"form-control\" id=\"txtAnswer\" name=\"txtAnswer\" placeholder=\"answer\"/>\n");
      out.write("                    </div>\n");
      out.write("                     <div class=\"col-md-6\">\n");
      out.write("                         <span id=\"sp11\"></span>\n");
      out.write("                    </div> \n");
      out.write("                </div>  \n");
      out.write("\n");
      out.write("                <div class=\"row\" style=\"padding-top: 20px\">\n");
      out.write("                    \n");
      out.write("                    <div class=\"col-md-2\">\n");
      out.write("                       \n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-4\">\n");
      out.write("                        <input type=\"submit\" class=\"form-control btn-success btn-sm\" name=\"Registerbtn\" value=\"Submit\" onclick=\"return validateData()\">\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col-md-4\">\n");
      out.write("                        <input type=\"reset\" class=\"form-control btn-info btn-sm\" name=\"Resetbtn\" value=\"Reset\"/>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-2\">\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                  ");

                      if(request.getParameter("flag")!=null)
                      {
                  
      out.write("\n");
      out.write("                  <div class=\"row\">\n");
      out.write("                      <div class=\"col-md-12\">\n");
      out.write("                      \"Some Server Error\"\n");
      out.write("                      </div>\n");
      out.write("                  </div>\n");
      out.write("                  ");
}
      out.write("\n");
      out.write("                </div>           \n");
      out.write("\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("   \n");
      out.write("</div>    \n");
      out.write(" </div><!--footer start-->\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-8\" >\n");
      out.write("                    <img src=\"images/help.jpg\" id=\"helpImg\">\n");
      out.write("                    <p id=\"btmPara\">\n");
      out.write("                        sample text\n");
      out.write("                        \"Always keep three words in the pocket \n");
      out.write("                        try\n");
      out.write("                        true\n");
      out.write("                        trust\"\n");
      out.write("\n");
      out.write("                    </p>\n");
      out.write("                    <input type=\"button\" value=\"More...\" class=\"btn\" id=\"btn2\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-4\" id=\"FrtText\">\n");
      out.write("                    sample text\n");
      out.write("                    \"Always keep three words in the pocket\n");
      out.write("                    try\n");
      out.write("                    true\n");
      out.write("                    trust\"\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
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
