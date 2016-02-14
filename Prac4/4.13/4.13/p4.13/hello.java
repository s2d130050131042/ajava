import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class hello extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Hello!!!!</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Hello!!!</h1>");
        out.println("</body>");
        out.println("</html>");
    }
}