import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class dice extends HttpServlet {
	int dice1,dice2;

    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException
    {
		Enumeration headerNames = request.getHeaderNames();
		response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Server</title>");
        out.println("</head>");
        out.println("<body>");
		dice1=(int)(Math.random()*6)+1;
		dice2=(int)(Math.random()*6)+1;
		out.println("<h3>Dice1:"+dice1+"</h3>");
		out.println("<h3>Dice2:"+dice2+"</h3>");
		out.println("</body>");
        out.println("</html>");
    }
}