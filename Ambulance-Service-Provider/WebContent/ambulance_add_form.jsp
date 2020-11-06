<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="spr" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Ambulance Form</title>
</head>
<body style="background-image: url('ambulance4.jpg'); background-size: cover; background-position: center;">
	<spr:form action="ambulance_add.htm" method="post" commandName="ambulance">
		<table align="center">
			<tr>
				<td>
					Ambulance No:
				</td>
				<td>
					<spr:input path="ambulanceNo"/>
				</td>
			</tr>
			<tr>
				<td>
					Ambulance Type:
				</td>
				<td>
					<spr:input path="ambulanceType"/>
				</td>
			</tr>
			<tr>
				<td>
					Location:
				</td>
				<td>
					<spr:input path="location"/>
				</td>
			</tr>
			<tr>
				<td>
					Equipment:
				</td>
				<td>
					<spr:input path="equipement"/>
				</td>
			</tr>
			<tr>
				<td>
					<a href="ambulance_booking.jsp">Back</a>
				</td>
				<td>
					<input type="submit" value="Add">
				</td>
			</tr>
		</table>
	</spr:form>
</body>
</html>