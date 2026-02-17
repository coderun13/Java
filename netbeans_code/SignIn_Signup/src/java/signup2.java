import Mypackage.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class signup2 extends HttpServlet
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
        
    SignUpbean ob=new SignUpbean();
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