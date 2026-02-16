import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
//import java.sql.*;

/**
 *
 * @author Snehal Singh
 */
public class c222 extends HttpServlet
{
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException,ServletException
    {
        res.setContentType("text/html");
        PrintWriter pw=res.getWriter();
        String s1=req.getParameter("c1");
        Cookie ob = new Cookie("nm",s1);//creating a cookie
        res.addCookie(ob);//Adding cookie to client side
        pw.println("<form method=post action=c333>" + "<input type=submit value=Submit></form>");
   
        
        }
    }