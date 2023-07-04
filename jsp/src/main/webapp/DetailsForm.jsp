<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Details Form</title>
</head>
<body>
	<div align="center">
		<fieldset>
			<form action="./JdbcOperation.jsp" method="get">
				<table>
					<tr>
						<td>ID</td>
						<td><input type="text" name="id"></td>
					</tr>
					<tr>
						<td>Name</td>
						<td><input type="text" name="name"></td>
					</tr>
					<tr>
						<td>Email</td>
						<td><input type="text" name="email"></td>
					</tr>
					<tr>
						<td>Mock 1</td>
						<td><input type="text" name="mock1"></td>
					</tr>
				</table>
				<input type="submit" value="Done">
			</form>
		</fieldset>
	</div>
</body>
</html>