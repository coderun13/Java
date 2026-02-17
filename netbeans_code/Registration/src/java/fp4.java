import java.io.*;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class fp4 extends HttpServlet{
     public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException,ServletException
    {
        res.setContentType("text/html");
        PrintWriter pw1=res.getWriter();
        String npass=req.getParameter("new-password");
        String email;
        
     
     try {
        HttpSession ses=req.getSession();
        email=(String)ses.getAttribute("email");
        Class.forName("oracle.jdbc.driver.OracleDriver");
        
        Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","javasql");
        Statement stmt = con.createStatement();
        String ql= "update signup_details set password ='"+npass+"' where email='"+email+"'";
        int x=stmt.executeUpdate(ql);
        if(x>0)
        {
            pw1.println("<html><body>Password Changed Successfully"+"<br><br><a href=login.html>Go to login page</a>");
        }else{
            pw1.println("Update unsuccess");
        }
    con.close();
     }
     catch(Exception e)
     {
       pw1.println(e);
         
     }
    }
}