<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>417ProjectRough</title>
		<link rel="stylesheet" href="css/common.css"/>
	</head>
	<body>
		<div id="containerDiv">\
			<%@include file="include/header.jsp" %>
			
			<div id = "contentDiv">
			
			${requestScope.errorMsg }
				<form action = "Login" method = "post">
					<label> Username:</label>
					<input type ='text' name = 'username' value =''/>
					<br/>
					<label> Password:</label>
					<input type ='password' name = 'pwd' value =''/>
					<br/>
					<input type ='submit' value= 'Login'/>
					<input type = 'hidden' name='fpass' value='ok'/>
				</form>
				
				
			
			
			
			
			</div>
			<%@include file="include/footer.jsp" %>
		
		</div>
	</body>
</html>