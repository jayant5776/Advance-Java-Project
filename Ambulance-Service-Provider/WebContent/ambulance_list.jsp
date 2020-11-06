<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="com.cdac.dto.Ambulance"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="spr" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Ambulance Form</title>
</head>
<body style="background-image: url('ambulance3.jpg'); background-size: cover; background-position: center;">
		<table align="center" style="background-color: gray; font-size: 35px; color: white; margin-top: 200px;">
			<thead>
				<tr>
					<td style="font-family: cursive; text-align: center;">Ambulance Details</td>
				</tr>
			</thead>
		<%
			List<Ambulance> alist = (List<Ambulance>)request.getAttribute("ambList");
			for(Ambulance amb : alist){
		%>
		<tbody style="text-align: center; font-size: 30px; color: black;" >
			<tr>
				<td>
					<%=amb.getAmbulanceId()%>
				</td>
				<td>
					<%=amb.getAmbulanceNo()%>
				</td>
				<td>
					<%=amb.getAmbulanceType()%>
				</td>
				<td>
					<%=amb.getEquipement()%>
				</td>
				<td>
					<%=amb.getLocation()%>
				</td>
				<td>
					<a href="ambulance_update_form.htm?ambulanceId=<%=amb.getPatientId()%>">Book Amb</a>
				</td>
			</tr>
			<% } %>
			<tr>
				<td>
					<a href="ambulance_booking.jsp">Back</a>
				</td>
				<td>
					<a href="login_form_patient.jsp">Logout</a>
				</td>
			</tr>
			</tbody>
		</table>
</body>
</html>