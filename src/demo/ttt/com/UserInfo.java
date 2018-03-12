package demo.ttt.com;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserInfo
 */
@WebServlet("/UserInfo")
public class UserInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserInfo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		Pattern pattern = Pattern.compile("[a-zA-Z0-9]*");
		Matcher matcher = pattern.matcher(username);
		if (matcher.matches()) 
		{
			out.println("div");
			out.println("<p>User Name: "+ username + "</p>");
		}
		else
		{
			out.println("<p>User Name: "+ "Please enter only alphabets and numbers"+ "</p>");
		}
				//String user1=username.replaceAll("(?i)<script.*?>.*?</script.*?>", "");  // case 1
			     //.replaceAll("(?i)<.*?javascript:.*?>.*?</.*?>", "") // case 2
			    // .replaceAll("(?i)<.*?\\s+on.*?>.*?</.*?>", "");     // case 3
		
		//out.println("div");
		//out.println("<p>User Name: "+ user1 + "</p>");
		
		out.println("<p>Password: "+ password + "</p>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
