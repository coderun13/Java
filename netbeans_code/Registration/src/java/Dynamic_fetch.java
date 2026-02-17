import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class Dynamic_fetch extends HttpServlet
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
         String ql = "select * from signup_details";
         
            ResultSet rs=stmt.executeQuery(ql);
             pw1.println("<html><body><table border=2 width=100%>");
             pw1.println("<tr><th>Email</th><th>Name</th><th>Contact</th>"+"<th>Password</th></tr>");
             while(rs.next())
             {
                 pw1.println("<tr><td>"+rs.getString(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td><td>"+rs.getString(4)+"</td></tr>");
             }
         con.close();
        }
        catch(Exception e)
        {
            pw1.println(e);
        }
        
    }
}