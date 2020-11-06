<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="spr" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Patient Login Form</title>
</head>
<body style="background-image: url('patient1.jpg'); background-size: cover; background-position: center;">
	<spr:form action="login.htm" method="post" commandName="patient">
		<table align="center" style="background-color: gray; font-size: 40px; color: white; margin-top: 200px;">
			<thead>
				<tr>
					<th colspan="2" >Patient Login</th>
				</tr>
			</thead>
			<tbody style="text-align: center; color: black; font-size: 30px;" >
			<tr>
				<td>
					Patient Login Name:
				</td>
				<td>
					<spr:input path="logName"/>
				</td>
			</tr>
			<tr>
				<td>
					Patient Login Password:
				</td>
				<td>
					<spr:password path="logPass"/>
				</td>
			</tr>
			<tr>
				<td>
					<a href="Patient_login_registration.jsp">Back</a>
				</td>
				<td>
					<input type="submit" value="Login">
				</td>
			</tr>
			</tbody>
		</table>
	</spr:form>
</body>
</html>