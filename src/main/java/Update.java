

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Update
 */
@WebServlet("/Update")
public class Update extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Update() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	
	
	
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		SportBean bean=new SportBean();
		

		
		
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		String playername=request.getParameter("playername");
		String sportname=request.getParameter("sportname");
		String collegename=request.getParameter("collegename");
		String cityname=request.getParameter("city");
		String emailid=request.getParameter("Email");
		String mobile=request.getParameter("mobile");
		

		bean.setUsername(username);
		bean.setPassword(password);
		bean.setPlayername(playername);
		bean.setSportname(sportname);
		bean.setCollege(collegename);
		bean.setEmail(emailid);
		bean.setMobile(mobile);
		bean.setCity(cityname);
		
		
		
		String uname=bean.getUsername();
		String pass=bean.getPassword();
		
		String pname=bean.getPlayername();
		String sport=bean.getSportname();
		String mob=bean.getMobile();
		String college=bean.getCollege();
		String city=bean.getCity();
		String email=bean.getMobile();
		
		
		
	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/Sports","root","Rk@mysql09");
			PreparedStatement prestate=connect.prepareStatement("update sportsdetails set playername=?,sportname=?,collegename=?,city=?,email=?,mobile=? where username=? and password=?");
			
			prestate.setString(1, pname);
			prestate.setString(2, sport);
			prestate.setString(3, college);
			prestate.setString(4, city);
			prestate.setString(5, email);
			prestate.setString(6, mob);
			
			prestate.setString(7, uname);
			prestate.setString(8, pass);
			
			
			int result =prestate.executeUpdate();
			
			if(result>0)
			{
				response.sendRedirect("Updatesuccessfull.jsp");
			}
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}
