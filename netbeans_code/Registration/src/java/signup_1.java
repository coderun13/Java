import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class signup_1 extends HttpServlet
{
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException,ServletException
    {
        res.setContentType("text/html");
        PrintWriter pw1=res.getWriter();
        String email=req.getParameter("n1");
        String nm=req.getParameter("n3");
        String con1=req.getParameter("n6");
        String pass=req.getParameter("n2");
        String sq=req.getParameter("n4");
        String ans=req.getParameter("n5");
        String add=req.getParameter("n7");
        
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            
//            registering type4 driver
         Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","javasql");
         Statement stmt=con.createStatement();
         String ql = "INSERT INTO signup_details (email, password, name, security_question, answer, contact, address) " +
            "VALUES ('" + email + "','" + pass + "','" + nm + "','" + sq + "','" + ans + "','" + con1 + "','" + add + "')";
         
            int x=stmt.executeUpdate(ql);
            if(x>0)
         {
             pw1.println("<html><body>Registration Sucess <br>" + 
                     "<a href=login.html>Go to Login Page</a></body></html>");
         }else{
             pw1.println("Registration unsuccess");
         }
         con.close();
        }
        catch(Exception e)
        {
            pw1.println(e);
        }
    }
}