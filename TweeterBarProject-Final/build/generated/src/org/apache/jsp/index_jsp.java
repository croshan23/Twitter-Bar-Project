package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Tweeter Bar Project</title>   \n");
      out.write("        <link href=\"css/mystyle.css\" type=\"text/css\" rel=\"stylesheet\" />  \n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js\" type=\"text/javascript\"></script>        \n");
      out.write("        <script type=\"text/javascript\" src=\"ajaxtweet.js\"></script>         \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <!-- HEADER CONTENT STARTS HERE-->    \n");
      out.write("        <header>\n");
      out.write("            <div id=\"bar\">\n");
      out.write("                <span>CS472</span> TwitterBar\n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"#\" id=\"tweets\">Tweets</a></li>\n");
      out.write("                    <li><a href=\"#\">Maps</a></li>\n");
      out.write("                    <li><a href=\"trends.jsp\" id=\"trends\">Trends</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"banner\">\n");
      out.write("                <img src=\"images/banner2.png\" alt=\"banner\" />\n");
      out.write("            </div>\n");
      out.write("        </header>\n");
      out.write("    <!-- BODY CONTENT STARTS HERE-->\n");
      out.write("        <section>\n");
      out.write("            <div id=\"container\"></div>\n");
      out.write("        </section>\n");
      out.write("    <!-- FOOTER SECTION -->\n");
      out.write("        <footer>\n");
      out.write("            <span> Copyright: R3 Group :D </span>\n");
      out.write("        </footer>       \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
