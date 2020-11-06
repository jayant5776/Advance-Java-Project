<%@page import="com.cdac.dto.Patient"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ambulance Booking Page</title>
</head>
<body style="background-image: url('ambulance5.jpg'); background-size: cover; background-position: center; ">
	<table align="center" style="background-color: gray; font-size: 35px; color: white; margin-top: 200px; ">
		<tr><td>&nbsp;&nbsp;</td></tr>
		<thead>
		<tr>
			<td style="font-family: cursive;"> Welcome <%=(session.getAttribute("patient")!=null)?((Patient)session.getAttribute("patient")).getLogName():"!!!!!!!!!!!"%> </td>
		</tr>
		</thead>
		<tbody style="text-align: center; font-size: 30px;" >
		<tr>
			<td><a style="color: black;" href="ambulance_list.htm">Ambulance List</a></td>
		</tr>
		<tr>
			<td><a href="Patient_login_registration.jsp">Logout</a></td>
		</tr> 
		</tbody>
	</table>
</body>
</html>