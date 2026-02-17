import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import Mypackage.*;

public class Sign_in extends HttpServlet
{
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException,ServletException
    {
        res.setContentType("text/html");
        PrintWriter pw1=res.getWriter();
        String email=req.getParameter("L1");
        String pass=req.getParameter("L2");
        
    SignInbean ob=new SignInbean();
    ob.setEmail(email);
    ob.setPass(pass);
    boolean result=ob.InsertMethod();
    if(result==true)
    {
        pw1.println("success");
    }
    else{
        pw1.println("unsuccess");
    }
    
    }
}