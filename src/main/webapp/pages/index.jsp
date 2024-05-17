<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style>
.error{
color:red
      }
</style>

</head>
<body>
<h3>User Registration Forms</h3>
<form:form action="register" modelAttribute="user" method = "post">
<table>

<tr>
<td>UserName:</td>
<td><form:input path="UserName"/>
<form:errors path="UserName" cssClass = "error" /></td>
</tr>

<tr>
<td>password</td>
<td><form:input path="password"/>
<form:errors path="password" cssClass = "error" /></td>
</tr>

<tr>
<td>email</td>
<td><form:input path="email"/>
<form:errors path="email" cssClass = "error" /></td>
</tr>

<tr>
<td>phoneNo</td>
<td><form:input path="phoneNo"/>
<form:errors path="phoneNo" cssClass = "error" /></td>
</tr>

<tr>
<td>age</td>
<td><form:input path="age"/>
<form:errors path="age" cssClass = "error" />
</td>
</tr>

<tr>
<td></td>
  <td><input type="submit"  value="Register"/></td>
  </tr>

</table>
</form:form>

</body>
</html>