import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class holisticcounter extends HttpServlet {

  static int classCount = 0;  
  int count = 0;              
  static Hashtable instances = new Hashtable();  

  public void doGet(HttpServletRequest req, HttpServletResponse res)
                               throws ServletException, IOException {
    res.setContentType("text/html");
    PrintWriter out = res.getWriter();
	count++;
    out.println("<h1>Since loading, this servlet instance has been accessed " +count + " times.</h1>");
    instances.put(this, this);
    out.println("<h2>There are currently " +instances.size() + " instances.</h2>");

    classCount++;
    out.println("<h3>Across all instances, this servlet class has been accessed " + classCount + " times.</h3>");
  }
}
