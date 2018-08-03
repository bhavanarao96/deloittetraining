package com.onlinetest.start;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Cookie;
/**
 * Servlet implementation class Welcome
 */
@WebServlet("/Welcome")
public class Welcome extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Welcome() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String quantity = request.getParameter("quantity");
		Cookie allCookie[] = request.getCookies();
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		boolean alreadyVisited=false;
		if(allCookie != null)
		{
			for(int i=0;i<allCookie.length;i++)
			{
	           //out.println("<h3>Cookie Name : "+allCookie[i].getName()+
			//" Cookie Value : "+allCookie[i].getValue());
	           if(allCookie[i].getName().equals(username))
	           {
	        	   alreadyVisited=true;
	        	   break;
	           }
			}
		}
		else {
			out.println("No cookie found");
		}
		
		out.println("<h1> Welcome "+username);
		out.println("<h1> new param "+quantity);
		Date startDateTime = new Date();
		HttpSession session=request.getSession();
		session.setAttribute("uname", username);
		session.setAttribute("startTime", startDateTime);
		
		if(alreadyVisited) {
			out.println("<h1>You have already visited "+username);
		}
		else {
			out.println("Welcome new visitor "+username);
			//Cookie cookie = new Cookie(username,username);
			//cookie.setMaxAge(30);
			//response.addCookie(cookie);
		}
		
		out.println("<h1><br/><br/><a href=start.html>Start Test</a>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
