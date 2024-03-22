<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>分数添加</title>
</head>
<body>
<div>
<form action="markadd" method="post">
	<br/>
	<label>姓名：</label><input name="mname"><br/><br/>
	<label>分数：</label><input name="mark"><br/><br/>
	<label>学科：</label><input name="mtid" ><br/><br/>
	<label>编号：</label><input name="mmid"><br/><br/>
	<input type="submit" value="添加">
</form>
</div>
</body>
</html>