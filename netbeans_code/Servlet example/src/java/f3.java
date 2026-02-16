import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class f3 extends HttpServlet {

public void doPost(HttpServletRequest req,
        HttpServletResponse res)throws IOException,
        ServletException
{
    res.setContentType("text/html");
    PrintWriter pw1 = res.getWriter();
    String nm=req.getParameter("n1");
    pw1.println("<html><body bgcolor=skyblue>welcome "+nm+"</body></html>");
    }
}