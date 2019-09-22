package br.servlets;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class OlaMundo extends HttpServlet {
    protected void service (HttpServletRequest request,
    HttpServletResponse response)
        throws ServletException, IOException {
    	PrintWriter out = response.getWriter();
    	out.println("<html>");
    	out.println("<body>");
    	out.println("Hello World ");
    	out.println("Para esse servlet funcionar é necessario mapear um servlet");
    	out.println("em WEB-INF/web.xml ");
    	out.println("utlizando as tags servlet e servlet-mapping");
    	out.println("</body>");
    	out.println("</html>");
        // tratamentos
    }
 }
