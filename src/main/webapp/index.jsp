<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hospital Management System</title>
</head>
<body>
	<h1><b>EVRY Health care Solutions</b></h1>
	
	<form action="PatienServlet" method="post">
		<table style="with: 50%">
			<tr>
				<td>Patient Name</td>
				<td><input type="text" name="pname" /></td>
			</tr>
			<tr>
				<td>Age</td>
				<td><input type="text" name="age" /></td>
			</tr>
			<tr>
				<td>Blood Groop</td>
				<td><input type="text" name="Bgroup" /></td>
			</tr>
			<tr>
				<td>CheckUp</td>
				<td><select>
						<option value="IP">IP</option>
						<option value="Emergency">Emergency</option>

				</select></td>
			</tr>
			<tr>
				<td>Doctor Name</td>
				<td><select>

						<option value="chinna">Dr.Chinna</option>
						<option value="deepak">Dr.Deepak</option>
						<option value="neeraj">Dr.Neeraj</option>
						<option value="manoj">Dr.Manoj</option>

				</select></td>
			</tr>
			<tr>
				<td>Test Recomended</td>
				<td><select>

						<option value="eye">Eye Check up</option>
						<option value="fitness">Fitness</option>
						<option value="general">General</option>

				</select></td>
			</tr>
		</table>
		<input type="submit" value="Submit" />
	</form>
</body>
</html>