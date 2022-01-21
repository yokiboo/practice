package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/add")
public class AddServlet extends HttpServlet {
	
	
public void doGet(HttpServletRequest req, HttpServletResponse res ) throws IOException, ServletException {
		
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int k = i+j;
		
		PrintWriter out = res.getWriter();
		// to make a simple background color we need lot of code work to do
		// so we are using jsp
		out.print("Output : "+ k);
		
		// cookies method
//		Cookie cookie = new Cookie("k",k+"");
//		res.addCookie(cookie);
		
//		res.sendRedirect("sq");  // URL rewriting
		
		// dispatcher method
//		RequestDispatcher rd = req.getRequestDispatcher("sq");
//		rd.forward(req, res);
	}

}
