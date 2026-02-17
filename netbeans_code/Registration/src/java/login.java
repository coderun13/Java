import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class login extends HttpServlet
{
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException,ServletException
    {
        res.setContentType("text/html");
        PrintWriter pw1=res.getWriter();
        String email=req.getParameter("L1");
        String pass=req.getParameter("L2");
        
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            
//            registering type4 driver
         Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","javasql");
         Statement stmt=con.createStatement();
         String ql = "select * from signup_details where email ='" + email + "' and password='" + pass +"'";
         
            ResultSet rs=stmt.executeQuery(ql);
            if(rs.next())
         {
             pw1.println("Welcome"+ rs.getString(3));
         }else{
             pw1.println("Login Failed");
         }
         con.close();
        }
        catch(Exception e)
        {
            pw1.println(e);
        }
    }
} 