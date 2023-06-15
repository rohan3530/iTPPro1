
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EditServlet extends HttpServlet 
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h2>Update employee</h2>");
		String uid = request.getParameter("id");
		int id = Integer.parseInt(uid);
		Emp e =EmpDao.getEmployeeById(id);
		out.println("<form action='EditServlet2' method='post'>");
		out.println("<table>");
		out.println("<tr><td>Id</td><td><input type='hidden' name='id' value='"+e.getId()+"'/></td></tr>");
		out.println("<tr><td>Name</td><td><input type='text' name='name' value='"+e.getnName()+"'/></td></tr>");
		out.println("<tr><td>Password</td><td><input type='password' name='password' value='"+e.getpassword()+"'/></td></tr>");
		out.println("<tr><td>Email</td><td><input type='email' name='email' value='"+e.getemail()+"'/></td></tr>");
		out.println("<tr><td>Country</td><td>");
		out.println("<select name=\"country\" style=\"width:100px\">");
		out.println("<option>India</option>");
		out.println("<option>USA</option>");
		out.println("<option>UK</option>");
		out.println("<option>other</option>");
		out.println("<select>");
		out.println("</td></tr>");
		out.println("<tr><td><input type= 'submit' value='save employee'/></td></tr>");
		out.println("</table>");
		out.println("</form>");
		out.close();
	}
}
