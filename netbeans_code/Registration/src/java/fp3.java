import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class fp3 extends HttpServlet
{
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException,ServletException
    {
        res.setContentType("text/html");
        PrintWriter pw1=res.getWriter();
        String email;
        String answer=req.getParameter("answer");
        
        try
        {
            HttpSession ses=req.getSession();
            email=(String)ses.getAttribute("email");
            Class.forName("oracle.jdbc.driver.OracleDriver");
            
         Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","javasql");
         Statement stmt=con.createStatement();
         String ql = "select * from signup_details where email = '" + email + "' and answer = '" + answer + "'";
         
            ResultSet rs=stmt.executeQuery(ql);
            if(rs.next())
         {
             pw1.println("<form method = Post action= fp4>\n" +
"    <label for=\"new-password\">New Password:</label>\n" +
"    <input type=\"password\" id=\"new-password\" name=\"new-password\">\n" +
"    <br><br>\n" +
"    <input type=\"submit\" value=\"Submit\">\n" +
"</form>");
         }else{
             pw1.println("Failed");
         }
         con.close();
        }
        catch(Exception e)
        {
            pw1.println(e);
        }
    }
} 