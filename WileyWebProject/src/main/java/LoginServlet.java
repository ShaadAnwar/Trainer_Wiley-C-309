

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public LoginServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String user=request.getParameter("username");
		String pass=request.getParameter("password");
		System.out.println(response.getStatus());
		if(user.equals("mandar") && pass.equals("mandar123")) {
			//response.getWriter().append("Welcome ,<b>"+user+"</b></hr>");
			RequestDispatcher dispatcher=request.getRequestDispatcher("welcome.jsp");
			dispatcher.forward(request, response);
			
		}
		else
		{
			RequestDispatcher dispatcher=request.getRequestDispatcher("error.jsp");
			dispatcher.forward(request, response);
		}
	}
}
