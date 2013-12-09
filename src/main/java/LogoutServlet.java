import java.io.IOException; 
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse; 
import javax.servlet.http.HttpSession;


/** * Servlet implementation class Logout */ 
public class LogoutServlet extends HttpServlet
		{
				private static final long serialVersionUID = 1L; /** * @see HttpServlet#HttpServlet() */ 
				public LogoutServlet()
					{
						super(); // TODO Auto-generated constructor stub }
					}
		

/** * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response) */
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		HttpSession session = request.getSession(); 
		PrintWriter pw = response.getWriter(); 
		pw.println("YOU HAVE SUCCESSFULLY BEEN LOGGED OUT!!!!!"); 
		session.invalidate();
		//pw.println(" <a href="index.jsp">HOME</a> ");
		}

}