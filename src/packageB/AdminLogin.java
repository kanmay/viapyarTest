package packageB;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class AdminLogin
 */
@WebServlet("/AdminLogin")
public class AdminLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminLogin() {
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
	
		String adminUserName = request.getParameter("username");
		String password = request.getParameter("pass");
		
		if(adminUserName.equalsIgnoreCase("ViapyarAdmin")&&password.equals("mayankTushar")){
			HttpSession session = request.getSession(true);
			session.setAttribute("user","rashatu");
			response.sendRedirect("AdminPanelHome.jsp");
			
		}else{
			 
		    RequestDispatcher rd = request.getRequestDispatcher("/AdminLogin.jsp");
			request.setAttribute("msg","You are not an Authorised User");
			rd.forward(request, response);
		 
	    }
	}

}
