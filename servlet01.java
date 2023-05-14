import java.io.*;
import javax.servlet.*;
import java.servlet.http.*;

public class CalculatorServlet extends HttpServlet {
public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException { int result = 0;
try {
  String number1 = req.getParameter("num1");
  String number2 = req.getParameter("num2");
  String operator = req.getParameter("op");
  int x = Integer.parseInt(number1);
  int y = Integer.parseInt(number2);
  if(operator == "+") {
    result = x + y;
  } 
  else if(operator == "-") { 
    result = x - y;
  }
  else if(operator == "*") {
    result = x * y;
  }
  else if(operator == "/") {
    result = x/y;
  }
  PrintWriter p = res.getWriter();
  p.println(result);
 }
catch(Exception e) {
 }
}
