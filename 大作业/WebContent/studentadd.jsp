<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>学生注册</title>
</head>
<body>
<div>
<label style="color: red;">${msg}</label>
<form action="studentadd" method="post">
	<br/>
	<label>姓名：</label><input name="sname"><br/><br/>
	<label>学号：</label><input name="number"><br/><br/>
	<label>性别：</label><input name="ssex"><br/><br/>
	<label>专业：</label><input name="slearn"><br/><br/>
	<label>班级：</label><input name="sclass"><br/><br/>
	<input type="submit" value="注册">
</form>
</div>
</body>
</html>