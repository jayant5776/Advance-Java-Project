<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="spr" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Ambulance Form</title>
</head>
<body style="background-image: url('ambulance4.jpg'); background-size: cover; background-position: center;">
	<spr:form action="ambulance_update.htm" method="post" commandName="ambulance">
		<table align="center" style="background-color: gray; font-size: 35px; color: white; margin-top: 200px">
			<thead>
				<tr>
					<td style="font-family: cursive;">Book Ambulance</td>
				</tr>
			</thead>
			<tbody style="text-align: center; font-size: 30px; color: black;" >
			<tr>
				<td>
					
				</td>
				<td>
					<spr:hidden path="ambulanceId"/>
				</td>
			</tr>
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
					<a href="ambulance_list.htm">Back</a>
				</td>
				<td>
					<input type="submit" value="Book">
				</td>
			</tr>
			</tbody>
		</table>
	</spr:form>
</body>
</html>