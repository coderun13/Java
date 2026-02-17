import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
//import java.sql.*;

public class s3 extends HttpServlet
{
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException,ServletException
    {
        res.setContentType("text/html");
        PrintWriter pw=res.getWriter();
        try{
            HttpSession ses=req.getSession();
            String s1 = (String)ses.getAttribute("nm1");
            
            pw.println("Your Name is:"+s1);
        }
           catch(Exception e){}
        }
    }