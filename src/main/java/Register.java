

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Statement;
import java.util.List;
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
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	
//		DbResponse dbresponse= new DbResponse();
//		List<LoginDetails> loginList= dbresponse.loginresponse(); 
		
		
			
			

	
	
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//		doGet(request, response);
		SportBean bean=new SportBean();
			String username=request.getParameter("username");
			String playername=request.getParameter("playername");
			String sportname=request.getParameter("sportname");
			String password=request.getParameter("password");
			//int password= Integer.parseInt("password");
			String mobnum=request.getParameter("mobile");
			//PrintWriter out=response.getWriter();
			
			bean.setUsername(username);
			bean.setPassword(password);
			bean.setPlayername(playername);
			bean.setSportname(sportname);
			bean.setMobile(mobnum);
			
					String uname=bean.getUsername();
					String pass=bean.getPassword();
					String pname=bean.getPlayername();
					String sport=bean.getSportname();
					String mob=bean.getMobile();
			
			
			
			try {
				Class.forName("com.mysql.jdbc.Driver");
				//out.print("hello");
				Connection connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/Sports","root","Rk@mysql09");
				
				PreparedStatement prestate= connect.prepareStatement("insert into sportsdetails(username,password,playername,sportname,mobile) values (?,?,?,?,?)");
				
				prestate.setString(1,uname);
				prestate.setString(2,pass);
				prestate.setString(3,pname);
				prestate.setString(4,sport);
				prestate.setString(5,mob);
		
				
					int result=prestate.executeUpdate();
					if(result>0)
					{
						response.sendRedirect("Successfull.jsp");
						
					}
					else {
						response.sendRedirect("sportreg.jsp");
					}
				
				
				
			}catch(SQLException e)
			{
				System.out.println(e);
			}catch(Exception e)
			{
				System.out.println(e);
			}
	
	}

}
