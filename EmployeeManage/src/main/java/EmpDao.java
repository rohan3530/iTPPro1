import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmpDao 
{
	public static Connection getConnection()
	{
		Connection con = null;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","root");
		}
		catch(Exception e1)
		{
			e1.printStackTrace();
		}
		return con;
	}
	public static int save(Emp e)
	{
		int status = 0;
		try
		{
			Connection con = EmpDao.getConnection();
			PreparedStatement ps = con.prepareStatement("insert into emp.employee(id,name,password,email,country)values(?,?,?,?,?)");
			ps.setInt(1, e.getId());
			ps.setString(2, e.getnName());
			ps.setString(3, e.getpassword());
			ps.setString(4, e.getemail());
			ps.setString(5, e.getcountry());
			status = ps.executeUpdate();
			
			con.close();
		}
		catch(Exception e1)
		{
			e1.printStackTrace();
		}
		return status;
	}
	public static int update(Emp e)
	{	
		int status = 0;
		try
		{
			Connection con = EmpDao.getConnection();
			PreparedStatement ps = con.prepareStatement("update emp.employee set name=?,password=?,email=?,country=? where id=?");
			ps.setString(1,e.getnName());
			ps.setString(2,e.getpassword());
			ps.setString(3,e.getemail());
			ps.setString(4,e.getcountry());
			ps.setInt(5,e.getId());
			
			status = ps.executeUpdate();
			con.close();
		} 
		catch (Exception e1) 
		{
			e1.printStackTrace();
		}
		return status;
	}
	public static int delete(int id)
	{
		int status = 0;
		try
		{
			Connection con = EmpDao.getConnection();
			PreparedStatement ps = con.prepareStatement("delete from emp.employee where id=?");
			ps.setInt(1,id);
			status = ps.executeUpdate();
			con.close();
		}
		catch(Exception e1)
		{
			e1.printStackTrace();
		}
		return status;
	}
	public static Emp getEmployeeById(int id)
	{
		Emp e = new Emp();
		try
		{
			Connection con = EmpDao.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from emp.employee where id=?");
			ps.setInt(1,id);
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{
				e.setId(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setpassword(rs.getString(3));
				e.setemail(rs.getString(4));
				e.setcountry(rs.getString(5));
			}
			con.close();
		}
		catch(Exception e1)
		{
			e1.printStackTrace();
		}
		return e;
	}
	public static List<Emp> getAllEmployees()
	{
		List<Emp> list = new ArrayList<Emp>();
		try
		{
			Connection con = EmpDao.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from emp.employee");
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				Emp e = new Emp();
				e.setId(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setpassword(rs.getString(3));
				e.setemail(rs.getString(4));
				e.setcountry(rs.getString(5));
				list.add(e);
			}
			con.close();
		}
		catch(Exception e1)
		{
			e1.printStackTrace();
		}
		return list;
	}
}
