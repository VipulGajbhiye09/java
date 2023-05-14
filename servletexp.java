import java.io.*;
import javax.servlet.* ;
import javax.servlet.http.*;

public class MyHttpServlet extends HttpServlet
{
public void doGet(HttpServletRequest req,HttpServletResponse res) throwsServletException, IOException
{
// Use “req” to read incoming request , “res” to specify the HTTP response status
//Use req.getParameter(String) or getParameterValues(String) to obtainparameters

PrintWriter out = res.getWriter();//stream for output
// Use "out" to send content to browser
}
}
