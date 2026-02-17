import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class fp2 extends HttpServlet
{
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException,ServletException
    {
        res.setContentType("text/html");
        PrintWriter pw1=res.getWriter();
        String email=req.getParameter("L1");
        
        try
        {
            HttpSession ses=req.getSession();
            ses.setAttribute("email",email);
            Class.forName("oracle.jdbc.driver.OracleDriver");
            
         Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","javasql");
         Statement stmt=con.createStatement();
         String ql = "select * from signup_details where email ='" + email + "'";
         
            ResultSet rs=stmt.executeQuery(ql);
            if(rs.next())
         {
             pw1.println("<html>"+
"</head>\n" +
"<body>\n" +
"    <form method = post action=fp3>\n" +
"        <label for=\"security-question\">Security Question was: "+rs.getString(4)+"</label>\n" +
"        <br><br>\n" +
"        <label for=\"answer\">Answer:</label>\n" +
"        <input type=\"text\" id=\"answer\" name=\"answer\">\n" +
"        <br><br>\n" +
"        <input type=\"submit\" value=\"Submit\">\n" +
"    </form>\n" +
"</body>\n" +
"</html>");
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