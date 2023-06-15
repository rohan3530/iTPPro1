
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ViewServlet")
public class ViewServlet extends HttpServlet 
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<a href='Add_new_employee.jsp'>Add new employee</a>");
		out.println("<h3>Employees List<h3>");
		
		List<Emp> list = EmpDao.getAllEmployees();
		
		out.print(" <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ\" crossorigin=\"anonymous\">");
	    
	    out.print("<table  border='1' width='100%' class='table table-striped'>");
		out.println("<tr><th>Id</th><th>Name</th><th>Password</th><th>Email</th><th>Country</th><th>Edit</th><th>delete</th>");
		for(Emp e: list)
		{
			out.println("<tr><td>"+e.getId()+"</td><td>"+e.getnName()+"</td><td>"+e.getpassword()+"</td><td>"+e.getemail()+"</td><td>"+e.getcountry()+"</td>"+"<td><a href='EditServlet?id="+e.getId()+"'>Edit</a></td>"+"<td><a href='DeleteServlet?id="+e.getId()+"'>delete</a>"+"</td></tr>");
		}
		out.print("<table>");
		out.close();
	}

}