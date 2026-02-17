import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
//import java.sql.*;

public class s2 extends HttpServlet
{
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException,ServletException
    {
        res.setContentType("text/html");
        PrintWriter pw=res.getWriter();
        String s1=req.getParameter("C1");
        
        try{
            HttpSession ses=req.getSession();
            ses.setAttribute("nm1",s1);
            pw.println("<form method=post action=s3>" + "<input type=submit value=Submit></form>");
        }catch(Exception e){}
        }
    }