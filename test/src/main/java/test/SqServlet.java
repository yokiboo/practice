package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SqServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res ) throws IOException{
		int k = 0;
		PrintWriter out = res.getWriter();
		Cookie cookie[] = req.getCookies();
		
		for(Cookie c : cookie) {
			if(c.getName().equals("k")) {
				k = Integer.parseInt(c.getValue());
			}
		}
				
		k= k*k;
		
		out.println("The sqrt is : "+k);
	}

}
