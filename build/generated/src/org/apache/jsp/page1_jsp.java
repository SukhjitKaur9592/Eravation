package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class page1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      out.write("\n");
      out.write("    <head>\n");
      out.write("\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("\n");
      out.write("            .resize\n");
      out.write("            {\n");
      out.write("                font-size:15pt;\n");
      out.write("            }\n");
      out.write("            .custom { color:#ca8;\n");
      out.write("                      background:white;\n");
      out.write("                      height:0px;\n");
      out.write("                      width:0px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .custom:hover, \n");
      out.write("            .custom:active,\n");
      out.write("            .custom:focus \n");
      out.write("            {background-color:blue;}\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container-fluid\" style=\"height:1200px\">\n");
      out.write("            <div class=\"row\" style=\"height:100px\">;\n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("                    <h1 style=\"color:black; padding-left:170px\"> ERAVATION </h1>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-6 pull-right\">\n");
      out.write("                    <span href=\"#\"class=\"pull-right glyphicon glyphicon-search custom\" style=\"padding-top:50px;padding-right:170px; padding-bottom:5px;\">\n");
      out.write("\n");
      out.write("                    </span>\n");
      out.write("\n");
      out.write("                    <input type=\"text\" class=\"pull-right\" style=\"margin-top:50px;margin-right:2px;margin-bottom:5px;width:100px;border:2px solid Skyblue \">\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"panel\">\n");
      out.write("                <div class=\"panel-heading\" style=\"background:skyblue; height:50px;margin-left:150px;margin-right:150px\">\n");
      out.write("                    <ul class=\" pull-left nav nav-pills\" >\n");
      out.write("                        <li><a href=\"#\" style=\"padding-bottom:4px\"><b> Home </b></a></li>\n");
      out.write("                        <li><a href=\"#\" style=\"padding-bottom:4px\"><b>About Us</b></a></li>\n");
      out.write("                        <li><a href=\"#\"style=\"padding-bottom:4px\"><b>FAQS</b></a></li>\n");
      out.write("                    </ul>\n");
      out.write("                    <ul class=\" pull-right nav nav-pills\" >\n");
      out.write("                        <li><a href=\"#\"style=\"padding-bottom:4px\"><b>Sign Up</b></a></li>\n");
      out.write("                        <li><a href=\"#\"style=\"padding-bottom:3px\"><b>Login</b></a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"panel-body\" style=\"margin-top:25px;background:black ;height:350px;margin-left:220px;margin-right:220px\">\n");
      out.write("\n");
      out.write("                    <img src=\"poor.jpg\" height=300 width=400 style=\"padding-left:80px;padding-top:50px;position:absolute;padding-top:50px\">\n");
      out.write("                    <h2 class=\"align-right\"style=\"padding-left:450px ;padding-top:20px; color:white\">Let's work together to eradicate stravation.</h2>\n");
      out.write("                    <p class=\"align-right resize\"style=\"padding-left:450px ;padding-top:20px; color:white;\">\n");
      out.write("                        It is a platform to fight food wastage as well as starvation.The solution of one problem will result in relinquishing the other.\n");
      out.write("                    </p>\n");
      out.write("                    <input type=\"button\" class=\"btn\" style=\"color:white;background:black;margin-left:750px ;margin-top:20px\" value=\"More...\">\n");
      out.write("                </div>\t\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"container\" style=\"margin-left:200px;margin-right:150px;height:500px;margin-top:25px; width:1000px\">\n");
      out.write("                <table class=\"table \">\n");
      out.write("                    <tr>\n");
      out.write("                        <td> <b> USERS</b></td>\n");
      out.write("                        <td>  <b> FOOD ITEMS SAVED</b> </td>\n");
      out.write("                        <td> <b> VOLUNTEERS</b> </td>\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td><img src=\"user.jpg\" height=80 width=80>45678 </td>\n");
      out.write("                        <td><img src=\"food.jpg\" height=80 width=80>123456</td>\n");
      out.write("                        <td><img src=\"volunteer.jpg\" height=80 width=80>2345</td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("                <hr><br>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-sm-8\" style=\"height:300px\">\n");
      out.write("                        <img src=\"help.jpg\" width='220' height='220' style=\"position:absolute ;padding-top:30px;padding-left:20px\" >\n");
      out.write("                        <p style=\"padding-left:250px;padding-top:30px;margin-right:100px;\">\n");
      out.write("                            sample text\n");
      out.write("                            \"Always keep three words in the pocket \n");
      out.write("                            try\n");
      out.write("                            true\n");
      out.write("                            trust\"\n");
      out.write("\n");
      out.write("                        </p>\n");
      out.write("                        <input type=\"button\" value=\"More...\" class=\"btn\" style=\"margin-left:500px;margin-top:150px\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-4\" style=\"height:300px;padding-top:30px\">\n");
      out.write("                        sample text\n");
      out.write("                        \"Always keep three words in the pocket\n");
      out.write("                        try\n");
      out.write("                        true\n");
      out.write("                        trust\"\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\t\n");
      out.write("            <div class=\"panel\">\n");
      out.write("                <div class=\"panel-heading\" style=\"background:skyblue; height:50px;margin-left:150px;margin-right:150px\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <h4 class=\"text-center\" style=\"color:blue\"> <b>SPIC-CENTER OF EXCELLENCE</b></h3>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
}
