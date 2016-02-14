
//Enroll No=130050131042
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class dateservlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Date</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Date:"+new Date().toString()+"</h1>");
        out.println("</body>");
        out.println("</html>");
    }
}