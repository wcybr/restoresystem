<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>教师注册</title>
</head>
<body>
<div>
<label style="color: red;">${msg}</label>
<form action="teacheradd" method="post">
	<br/>
	<label>姓名：</label><input name="tname"><br/><br/>
	<label>学科：</label><input name="tsubject"><br/><br/>
	<label>学分：</label><input name="tscore"><br/><br/>
	<label>简介：</label><input name="tmes"><br/><br/>
	<label>编号：</label><input name="tsid"><br/><br/>
	<input type="submit" value="注册">
</form>
</div>
</body>
</html>