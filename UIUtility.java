package edu.edgewood.ProjectRough.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

public class UIUtility {
	public final static String COOKIE_NAME= "my-cookie-1";
	
	public static void pageStart(PrintWriter writer, HttpServletRequest request) throws IOException {
		writer.println("<html>");
		writer.println("<head>");
		writer.println("<title>");
		writer.println("MessageBoard");
		writer.println("</title>");
		writer.println("<link rel = 'stylesheet' type ='text/css' href='css/common.css'>");
		writer.println("<script src ='js/common.js'></script>");
		writer.println("</head>");
		writer.println("<body>");
		writer.println("<div id = 'containerDiv'>");
		writer.println("<div id = 'headerWrapperDiv'>");
		writer.println("<div id = 'headerDiv'>");
		writer.println("<a href='/jspapp'><span style = 'color:black;'>RCS 417 Message Board</span></a>");
		writer.println("</div>");
		writer.println("<br clear ='both'/>");
		writer.println("<div style = 'width:100%;'>");
		writer.println("<a href= 'movieList'>Add New Entry</a>");
		
		Cookie cookie = findCookie(request);
		if (cookie != null){
			writer.println("<a href='add.jsp'> New</a>");
			writer.println("<a href='logout.jsp'> Logout </a>");
		}else{
			writer.println("<a href='WEB-INF/login.jsp'> Login </a>");
		}
		writer.println("</div>");
		writer.println("</div>");
		writer.println("<br clear='both' />");
		

		


		
	}
	
	public static void pageEnd(PrintWriter writer) throws IOException {
		writer.println("<div id ='footerDiv'>");
		writer.println("My Footer");
		writer.println("</div>");
		writer.println("</div>");
		writer.println("</body>");
		writer.println("</html>");
	}
	
	public static Cookie findCookie(HttpServletRequest request){
		Cookie[] cookies = request.getCookies();
		
		if(cookies == null){
			return null;
		}
		for(Cookie cookie : cookies){
			if(cookie == null)
				continue;
			String name = cookie.getName();
			if(COOKIE_NAME.equals(name)){
				return cookie;
			}
			
		}
		return null;
	}

}
