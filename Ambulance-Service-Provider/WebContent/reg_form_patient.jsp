<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="spr" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Patient Registration Form</title>
</head>
<body style="background-image: url('patient2.jpg'); background-size: cover; background-position: center;">
	<spr:form action="reg.htm" method="post" commandName="patient">
		<table align="center" style="background-color: gray; font-size: 40px; color: white; margin-top: 100px;">
		<thead>
		<tr>
			<th colspan="2" >Patient Registration</th>
		</tr>
		</thead>
		<tbody style="text-align: center; color: black;">
			<tr>
				<td>
					Patient First Name:
				</td>
				<td>
					<spr:input path="firstName"/>
				</td>
			</tr>
			<tr>
				<td>
					Patient Last Name:
				</td>
				<td>
					<spr:input path="lastName"/>
				</td>
			</tr>
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
					Patient Birth Date:
				</td>
				<td>
					<spr:input path="birthDate"/>
				</td>
			</tr>
			<tr>
				<td>
					Patient City:
				</td>
				<td>
					<spr:input path="city"/>
				</td>
			</tr>
			<tr>
				<td>
					Patient Admit Date:
				</td>
				<td>
					<spr:input path="AmDate"/>
				</td>
			</tr>
			<tr>
				<td>
					<a href="Patient_login_registration.jsp">Back</a>
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