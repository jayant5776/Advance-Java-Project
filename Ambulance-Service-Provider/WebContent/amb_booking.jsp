<%@page import="com.cdac.dto.Admin"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ include file="cache_control.jsp"%>
    
<% 
	Admin ad = (Admin)session.getAttribute("admin");

	if(ad != null && ad.getAdminId()>0){
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ambulance Booking</title>
</head>
<body style="background-image: url('ambulance5.jpg'); background-size: cover; background-position: center;">
	<table align="center" style="background-color: gray; font-size: 35px; color: white; margin-top: 200px">
		<tr>
			<td>&nbsp;&nbsp;</td>
		</tr>
		<thead>
		<tr>
			<td style="font-family: cursive;">Welcome <%=(session.getAttribute("admin")!=null)?((Admin)session.getAttribute("admin")).getEmail(): "!!!!!!!!!!!" %></td>
		</tr>
		</thead>
		<tbody style="text-align: center; font-size: 30px;" >
		<tr>
			<td><a style="color: black;" href="prep_amb_add_form.htm">Add Ambulance</a></td>
		</tr>
		<tr>
			<td><a style="color: black;" href="amb_list.htm">Ambulance List</a></td>
		</tr>
		<tr>
			<td><a style="color: black;" href="logout.htm">Logout</a></td>
		</tr>
		</tbody>
	</table>
</body>
</html>
<%
	}else{
		response.sendRedirect("login_form_admin");
	}
%>