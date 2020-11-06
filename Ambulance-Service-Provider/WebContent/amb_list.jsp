<%@page import="java.util.List"%>
<%@page import="com.cdac.dto.Amb"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ambulance List</title>
</head>
<body style="background-image: url('ambulance3.jpg'); background-size: cover; background-position: center;">
		<table align="center" style="background-color: gray; font-size: 35px; color: white; margin-top: 200px;">
			<thead>
				<tr>
					<td style="font-family: cursive; text-align: center;">Ambulance Details</td>
				</tr>
			</thead>
			<%
			  List<Amb> alist = (List<Amb>)request.getAttribute("ambList");
			  for(Amb amb : alist){
			%>
			<tbody style="text-align: center; font-size: 30px; color: black;" >
			<tr>
				<td>
					<%=amb.getAmbNo()%>
				</td>
				<td>
					<%=amb.getAmbType()%>
				</td>
				<td>
					<%=amb.getHospital()%>
				</td>
				<td>
					<%=amb.getLocation()%>
				</td>
				<td>
					<a href="amb_delete.htm?ambId=<%=amb.getAmbId()%>">Delete</a>
				</td>
				<td>
					<a href="amb_update_form.htm?ambId=<%=amb.getAmbId()%>">Update</a>
				</td>
			</tr>
			<% } %>
			<tr>
				<td>
					<a href="amb_booking.jsp">Back</a>
				</td>
				<td>
					<a href="logout.htm">Logout</a>
				</td>
			</tr>
			</tbody>
		</table>
</body>
</html>