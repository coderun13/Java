import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import newpackage.*;

public class reg2 extends HttpServlet {

public void doPost(HttpServletRequest req,
        HttpServletResponse res)throws IOException,
        ServletException
{
    res.setContentType("text/html");
    PrintWriter pw = res.getWriter();
    String roll=req.getParameter("roll");
    String name=req.getParameter("name");
    
    javabean2 ob=new javabean2();
    ob.setName(name);
    ob.setRoll(roll);
    boolean result=ob.InsertMethod();
    if(result==true)
    {
        pw.println("success");
    }
    else{
        pw.println("unsuccess");
    }
    
    }
}