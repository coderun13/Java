import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class submit extends HttpServlet {

public void doPost(HttpServletRequest req,
        HttpServletResponse res)throws IOException,
        ServletException
{
    res.setContentType("text/html");
    PrintWriter pw1 = res.getWriter();
    String nm=req.getParameter("n1");
    
    PrintWriter pw2 = res.getWriter();
    String id=req.getParameter("id");
    pw1.println("<html><body bgcolor=skyblue>welcome "+id+", "+nm+"</body></html>");
    }
}