

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SportLogin
 */
@WebServlet("/SportLogin")
public class SportLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SportLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	
	
	String username=request.getParameter("username");
	String password=request.getParameter("password");
	
	SportBean bean=new SportBean();
	
	bean.setUsername(username);
	bean.setPassword(password);
	
	String uname=bean.getUsername();
	String pass=bean.getPassword();
	
//	if(username.equals(uname) && password.equals(pass))
//	{
//		response.sendRedirect("WelcomepAge.jsp");
//	}
//	else
//	{
//		response.sendRedirect("nodatafound.jsp");
//	}
	
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/sports","root","Rk@mysql09");
		PreparedStatement prestate=connect.prepareStatement(" select * from sportsdetails where username=? and password=?");
		
		prestate.setString(1, uname);
		prestate.setString(2, pass);
		
		ResultSet result=prestate.executeQuery();
		if(result.next())
		{
			response.sendRedirect("WelcomepAge.jsp");
		}
		else
		{
			response.sendRedirect("nodatafound.jsp");
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

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
