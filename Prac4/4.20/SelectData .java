import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
  
 public class SelectData extends HttpServlet {
  
     public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
         PrintWriter out = res.getWriter();
         res.setContentType("text/html");
         out.println("<html><body>");
		 out.println("<h2>En NO:130050131042</h2>");
         try {
             Class.forName("org.postgresql.Driver");
             Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/s2d130050131042", "postgres", "12345");
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery("select * from student");
             out.println("<table border=1>");
             out.println("<tr><th>name</th><th>roll_no</th><th>branch</th><tr>");
             while (rs.next()) {
                
                 String nm = rs.getString("name");
		  int n = rs.getInt("roll_no");
                 String s = rs.getString("branch"); 
                 out.println("<tr><td>" + nm + "</td><td>" + n + "</td><td>" + s + "</td></tr>"); 
             }
             out.println("</table>");
             out.println("</html></body>");
             con.close();
            }
             catch (Exception e) {
             out.println("error");
         }
     }
 }