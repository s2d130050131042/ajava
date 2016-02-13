//STEP 1. Import required packages
import java.sql.*;

public class JDBCCreate{
   // JDBC driver name and database URL
   static final String JDBC_DRIVER = "org.postgresql.Driver";  
   static final String DB_URL = "jdbc:postgresql://127.0.0.1:5432/s2d130050131042";

   //  Database credentials
   static final String USER = "postgres";
   static final String PASS = "12345";
   
   public static void main(String[] args) {
   Connection conn = null;
   Statement stmt = null;
   try{
      //STEP 2: Register JDBC driver
      Class.forName(JDBC_DRIVER);

      //STEP 3: Open a connection
      System.out.println("Connecting to a selected database...");
      conn = DriverManager.getConnection(DB_URL, USER, PASS);
      System.out.println("Connected database successfully...");
      
      //STEP 4: Execute a query
      System.out.println("Creating table in given database...");
      stmt = conn.createStatement();
      
      String sql = "CREATE TABLE BANK" + "( Acc_no DOUBLE PRECISION, " + "Name VARCHAR(20),"+"Balance DOUBLE PRECISION,"+"Ph_no DOUBLE PRECISION, "+"Address VARCHAR(20))"; 
	  stmt.executeUpdate(sql);
      System.out.println("Created table in given database...");
   }catch(SQLException se){
      se.printStackTrace();
   }catch(Exception e){
      e.printStackTrace();
   }finally{
      try{
         if(stmt!=null)
            conn.close();
      }catch(SQLException se){
      }
      try{
         if(conn!=null)
            conn.close();
      }catch(SQLException se){
         se.printStackTrace();
      }
   }
   System.out.println("End of file.");
   
   }
   }