<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="spr" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Registration Form</title>
</head>
<body style="background-image: url('ambulance2.jpg'); background-size: cover; background-position: center;">
	<spr:form action="regAdmin.htm" method="post" commandName="admin">
		<table align="center" style="background-color: gray; font-size: 40px; color: white; margin-top: 100px;">
		<thead>
		<tr>
			<th colspan="2" >Admin Registration</th>
		</tr>
		</thead>
		<tbody style="text-align: center; color: black;">
			<tr>
				<td>
					Admin First Name:
				</td>
				<td>
					<spr:input path="firstName"/>
				</td>
			</tr>
			<tr>
				<td>
					Admin Last Name:
				</td>
				<td>
					<spr:input path="lastName"/>
				</td>
			</tr>
			<tr>
				<td>
					Admin Mobile no:
				</td>
				<td>
					<spr:input path="mobNo"/>
				</td>
			</tr>
			<tr>
				<td>
					Admin Email:
				</td>
				<td>
					<spr:input path="email"/>
				</td>
			</tr>
			<tr>
				<td>
					Admin Password:
				</td>
				<td>
					<spr:password path="adPass"/>
				</td>
			</tr>
			<tr>
				<td>
					Admin Address:
				</td>
				<td>
					<spr:input path="address"/>
				</td>
			</tr>
			<tr>
				<td>
					Admin Joining Date:
				</td>
				<td>
					<spr:input path="joinDate"/>
				</td>
			</tr>
			<tr>
				<td>
					<a href="admin_login_registration.jsp">Back</a>
				</td>
				<td>
					<input type="submit" value="Register">
				</td>
			</tr>
			</tbody>
		</table>
	</spr:form>
</body>
</html>