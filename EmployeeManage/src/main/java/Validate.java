
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.Set;

public class Validate extends HttpServlet 
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String Username = request.getParameter("inputname");
		String Password = request.getParameter("passwordname");
		
		if(Validate(Username,Password))
		{
			out.print("<p>Login successful!</p>");
			request.getRequestDispatcher("Add_new_employee.jsp").include(request, response);
		}
		else
		{
			out.print("Sorry! Unable to Login.");
		}
	}

	boolean Validate(String Username, String Password) 
	{
		try
		{
			Connection con = EmpDao.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from DB1.Userdetails");
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				if(Username.equals(rs.getString(1)) && Password.equals(rs.getString(2)))
				{
					return true;
				}
			}
			con.close();
		}
		catch(Exception exception)
		{
			exception.printStackTrace();
		}
		return false;
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request,response);
	}
}
