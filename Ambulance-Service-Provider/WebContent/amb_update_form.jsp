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
	<spr:form action="amb_update.htm" method="post" commandName="amb">
		<table align="center" style="background-color: gray; font-size: 35px; color: white; margin-top: 200px">
			<thead>
				<tr>
					<td style="font-family: cursive;">Update Ambulance Details</td>
				</tr>
			</thead>
			<tbody style="text-align: center; font-size: 30px; color: black;" >
			<tr>
				<td>
					
				</td>
				<td>
					<spr:hidden path="ambId"/>
				</td>
			</tr>
			<tr>
				<td>
					Ambulance No:
				</td>
				<td>
					<spr:input path="ambNo"/>
				</td>
			</tr>
			<tr>
				<td>
					Ambulance Type:
				</td>
				<td>
					<spr:input path="ambType"/>
				</td>
			</tr>
			<tr>
				<td>
					Hospital:
				</td>
				<td>
					<spr:input path="hospital"/>
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
					<a href="amb_list.htm">Back</a>
				</td>
				<td>
					<input type="submit" value="Update">
				</td>
			</tr>
			</tbody>
		</table>
	</spr:form>
</body>
</html>