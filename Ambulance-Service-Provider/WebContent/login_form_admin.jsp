<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="spr" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Login Form</title>
</head>
<body style="background-image: url('ambulance2.jpg'); background-size: cover; background-position: center;">
	<spr:form action="loginAdmin.htm" method="post" commandName="admin">
		<table align="center" style="background-color: gray; font-size: 40px; color: white; margin-top: 200px;">
			<thead>
				<tr>
					<th colspan="2" >Admin Login</th>
				</tr>
			</thead>
			<tbody style="text-align: center; color: black; font-size: 30px;" >
			<tr>
				<td>
					Admin Email:
				</td>
				<td>
					<spr:input path="email"/>
					<font color="red"><spr:errors path="email"></spr:errors></font>
				</td>
			</tr>
			<tr>
				<td>
					Admin Password:
				</td>
				<td>
					<spr:password path="adPass"/>
					<font color="red"><spr:errors path="adPass"></spr:errors></font>
				</td>
			</tr>
			<tr>
				<td>
					<a href="admin_login_registration.jsp">Back</a>
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
