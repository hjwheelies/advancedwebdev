<%@page import="edu.edgewood.RCS417Project.svc.UIUtility" %>
<%@page import="edu.edgewood.RCS417Project.servlet.BlogServlet" %>	

<%
	boolean isLogin = session.getAttribute(BlogServlet.USER_KEY) != null;
%>

<div id="headerWrapperDiv">
				<div id="headerDiv">
					<a href="/417ProjectRough"><span style= "color:black;">RCS 417 Message Board</span></a>
				</div>
				<br clear = "both"/>
				<div style= "width: 100%">
					<%
						if (!isLogin){
					%>
					<a href="Login">Login</a>
					<%} else{ %>
					<a href="add.jsp"> New Post </a>
					<a href="logout.jsp"> Logout </a>
					<%} %>
					</div>
			</div>
			
			
			<br clear = "both"/>