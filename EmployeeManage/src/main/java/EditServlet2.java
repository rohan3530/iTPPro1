
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EditServlet2 extends HttpServlet 
{
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String eid = request.getParameter("id");
		int id = Integer.parseInt(eid);
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		String email = request.getParameter("email");
		String country = request.getParameter("country");
		
		Emp e = new Emp();
		e.setId(id);
		e.setName(name);
		e.setpassword(password);
		e.setemail(email);
		e.setcountry(country);
		int status = EmpDao.update(e);
		if(status>0)
		{
			response.sendRedirect("ViewServlet");
		}
		else
		{
			out.println("Sorry! Unable to update record.");
		}
		out.close();
	}
}
