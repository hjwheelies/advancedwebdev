<%@page import="edu.edgewood.ProjectRough.servlet.UIUtility" %>
<%@page import = "javax.servlet.http.Cookie" %>

<%
	Cookie myCookie = UIUtility.findCookie(request);
%>

<div id="headerWrapperDiv">
				<div id="headerDiv">
					<a href="/417ProjectRough"><span style= "color:black;">RCS 417 Message Board</span></a>
				</div>
				<br clear = "both"/>
				<div style= "width: 100%">
					<a href="movieList"> Add New Entry </a>
					
					<%
						if(myCookie==null){
							
						
					%>
					<a href="Login"> Login</a>
					<%} else{ %>
					<a href="add.jsp"> New </a>
					<a href="logout.jsp"> Logout </a>
					<%} %>
					</div>
			</div>
			
			
			<br clear = "both"/>