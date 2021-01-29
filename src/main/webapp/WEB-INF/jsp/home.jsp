<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User List</title>
</head>
<body>
<script type="text/javascript" src="${pageContext.request.contextPath}/JS/JQuery/jquery-1.5.2.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/JS/user.js?v=1"></script>

<script type="text/javascript">

$(document).ready(function(){
	getListOfUsers();
});

</script>

<div id ="userTableDiv">



<p>To add a new user please click on Edit</p>
<table id="tblDynamic" border="1" width="300">
<tr>
<td width="50">Id</td>
<td width="500">Name</td>
<td width="500">Date Of Birth</td>
<td width="500">User Name</td>
<td width="500">Email</td>
<td width="500">Edit</td>
<td width="500">Delete</td>
</tr>
</table>
</div>

<div id='updateAddDiv' style="display:none">

<form id ="updateFormDetails">

<P>To add new user please click on Clear all button</P>
<table>
<tr style="dispay:none" id="idRow">
<td style="dispay:none">Id</td>
<td style="dispay:none"><input type="text" id="id" name="id"></td>
</tr >
<tr>
<td>First Name</td>
<td><input type="text" id="name" name="name"></td>
</tr>
<tr>
<td>Last Name</td>
<td><input type="text" id="lastName" name="lastName"></td>
</tr>
<tr>
<td>Date of Birth</td>
<td><input type="text" id="birth" name="dateOfBirth"></td>
</tr>
<tr>
<td>User Name</td>
<td><input type="text" id="userName" name="userName"></td>
</tr>
<tr>
<td>password</td>
<td><input type="password" id="password" name="password" ></td>
</tr>
<tr>
<td>Email</td>
<td><input type="text" id="email" name="email"></td>
</tr>

<tr>
<td><input type="button" onclick="updateInfo()" value="Update"></td>
<td><input type="button" onclick="addNewrecord()" value="Add New"></td>
<td><input type="button" id="resetSbmtForm" value="Clear"></td>
<td><input type="button" onclick="userList()" value="UserList"></td>
</tr>
</table>

</form>
</div>
</body>
</html>