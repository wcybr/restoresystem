    <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>学生成绩列表</title>
</head>
<body>
<div>
<h1>学生成绩列表</h1>

<table border="1">
<tr>
<td><a href="markall2">刷新</a></td>
<td><a href="studentmap.jsp">学生界面</a></td>
<td><form action="markfindOne2" method="post"> <input type="text" name="mmid"><input type="submit" value="查找"></form></td>
</tr></table>
<table border="1">
<tr>
	<th>序号</th>
	<th>姓名</th>
	<th>分数</th>
	<th>课程</th>
	<th>编号</th>
	
</tr>
<c:forEach items="${mark2}" var="s">
	<tr>
		<td align="center">${s.mid }</td>
			<td align="center">${s.mname }</td>
		<td align="center">${s.mark}</td>
		<td align="center">${s.mtid}</td>
		<td align="center">${s.mmid}</td>
	</tr>
</c:forEach>

</table>
</div>
</body>
</html>