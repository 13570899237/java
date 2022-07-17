/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2022-07-17 00:51:45 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>管理员登录</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../../css/bootstrap.min.css\">\r\n");
      out.write("    <script src=\"../../js/jQuery-3.6.0.js\"></script>\r\n");
      out.write("    <script>\r\n");
      out.write("        function checkName() {\r\n");
      out.write("            var username = document.getElementById(\"username\").value;\r\n");
      out.write("            var user={\r\n");
      out.write("                username:username,\r\n");
      out.write("                password:\"\"\r\n");
      out.write("            }\r\n");
      out.write("            var strJson = JSON.stringify(user);\r\n");
      out.write("            $.ajax({\r\n");
      out.write("                type:\"post\",\r\n");
      out.write("                url:\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/user/checkName\",\r\n");
      out.write("                data:strJson,\r\n");
      out.write("                dataType:\"json\",\r\n");
      out.write("                contentType:\"application/json;charset=UTF-8\",\r\n");
      out.write("                success:function (data) {\r\n");
      out.write("                    var usernameTest = document.getElementById(\"usernameTest\");\r\n");
      out.write("                    if(data==\"√用户存在\"){\r\n");
      out.write("                        usernameTest.innerHTML=data;\r\n");
      out.write("                        usernameTest.style.color=\"green\";\r\n");
      out.write("                    }else {\r\n");
      out.write("                        usernameTest.innerHTML=data;\r\n");
      out.write("                        usernameTest.style.color=\"red\";\r\n");
      out.write("                    }\r\n");
      out.write("                }\r\n");
      out.write("            })\r\n");
      out.write("        }\r\n");
      out.write("    </script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("    <div class=\"row clearfix\">\r\n");
      out.write("        <div class=\"col-md-8 column\">\r\n");
      out.write("            <div class=\"page-header\">\r\n");
      out.write("                <h1>\r\n");
      out.write("                    <small>登录界面</small>\r\n");
      out.write("                </h1>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<form  action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/user/userLogin\" method=\"post\">\r\n");
      out.write("    <div class=\"form-group\">\r\n");
      out.write("        <label for=\"username\">账号:</label>\r\n");
      out.write("        <input type=\"text\" name=\"username\" class=\"form-control\" id=\"username\" aria-describedby=\"emailHelp\" onblur=\"checkName()\" placeholder=\"请输入账号\">\r\n");
      out.write("        <h4 id=\"usernameTest\" class=\"form-text text-muted\"></h4>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"form-group\">\r\n");
      out.write("        <label for=\"password\">密码:</label>\r\n");
      out.write("        <input type=\"password\" name=\"password\" class=\"form-control\" id=\"password\" placeholder=\"请输入密码\">\r\n");
      out.write("    </div>\r\n");
      out.write("    <button type=\"submit\" class=\"btn btn-primary\">登录</button>\r\n");
      out.write("</form>\r\n");
      out.write("<div class=\"alert alert-warning alert-dismissible\" role=\"alert\">\r\n");
      out.write("    <button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>\r\n");
      out.write("    <strong>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${message}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</strong>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
