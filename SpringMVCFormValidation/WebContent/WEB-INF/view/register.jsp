<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Page</title>
<style type="text/css">
.error {
	color: red;
}
</style>
</head>
<body>
	<h3 align="center">${headerMessage}</h3>
	<form:form action="/SpringMVCFormValidation/registerSuccess"
		method="post" modelAttribute="student">
		<table align="center">
		<caption align="top">Student registration form</caption>
	
			<tr>
				<td>Enter Book:</td>
				<td><form:input path="BookName"/></td>
				<td><form:errors path="BookName" cssClass="error"/></td>
			</tr>
			<tr>
				<td>Enter Book ID:</td>
				<td><form:input path="BookId"/></td>
				<td><form:errors path="BookId" cssClass="error"/></td>
			</tr>
			<tr>
				<td>Enter Author:</td>
				<td><form:input path="Author"/></td>
				<td><form:errors path="Author" cssClass="error"/></td>
			</tr>

			<tr>
				<td><input type="submit" value="Register"></td>
			</tr>
		</table>

	</form:form>

</body>
</html>