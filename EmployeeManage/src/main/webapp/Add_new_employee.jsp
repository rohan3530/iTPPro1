<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
	<h1>Add new employee</h1>
	<form action="SaveServlet" method="post">
		<table>
		<tr><td>ID:</td><td><input type="text" name="id"></td></tr>
		<tr><td>NAME:</td><td><input type="text" name="name"></td></tr>
		<tr><td>PASSWORD:</td><td><input type="password" name="password"></td></tr>
		<tr><td>EMAIL:</td><td><input type="email" name="email"></td></tr>
		<tr><td>COUNTRY:</td><td>
			<select name="country" style="width:100px">
				<option>India</option>
				<option>USA</option>
				<option>UK</option>
				<option>other</option>
			</select>
		</td></tr>
		<tr><td><input type="submit" value="save employee"/></td></tr>
		</table>
	</form>
	<br/>
	<a href="ViewServlet">View employees</a>
</body>
</html>