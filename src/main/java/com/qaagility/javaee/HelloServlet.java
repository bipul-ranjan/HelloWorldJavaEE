package main.java.com.qaagility.javaee;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/helloServlet")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		String yourName = request.getParameter("yourName");
		PrintWriter out = response.getWriter();
		 out.println("<html>");
	     out.println("<head>");
	     out.println("<title>Hello World</title>");
	     out.println("</head>");
	     out.println("<body bgcolor='blue'>");
		 out.println("<h1>Hello " + yourName + "</h1>");
		 out.println("</body>");
	     out.println("</html>");
		out.close();
	}

}
