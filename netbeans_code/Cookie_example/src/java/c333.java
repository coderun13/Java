import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
//import java.sql.*;

public class c333 extends HttpServlet
{
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException,ServletException
    {
        res.setContentType("text/html");
        PrintWriter pw=res.getWriter();
//        String s1=req.getParameter("c1");
        Cookie a[]=req.getCookies();
        if(a!=null)
        {
            for(int i=0;i<a.length;i++)
            {
                if(a[i].getName().equals("nm"))
                {
                   pw.println("Your Name is:"+a[i].getValue());
                }
                else{
                    res.sendRedirect("c1.html");
                }
            }
        }
   
        
        }
    
}