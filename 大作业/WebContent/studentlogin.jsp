<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>新增学生</title>
</head>
<body>
<div>
<label style="color: red;">${msg}</label>
<form action="studentlogin" method="post">
<br/>
	<label>姓名：</label><input name="sname"><br/><br/>
	<label>学号：</label><input type="password" name="number"><br/><br/>
	<input type="submit" value="登录">
</form>
</div>
</body>
</html>