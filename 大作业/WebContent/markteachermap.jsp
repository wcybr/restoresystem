    <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>教师分数列表</title>
</head>
<body>
<div>
<h1>教师评分列表</h1>

<table border="1">
<tr>
<td><a href="markadd.jsp">添加</a></td>
<td><a href="markall">刷新</a></td>
<td><a href="markupdate.jsp">修改</a></td>
<td><a href="studentmap.jsp">学生界面</a></td>
<td><a href="teachermap.jsp">教师界面</a></td>
<td><form action="markfindOne" method="post"> <input type="text" name="mmid"><input type="submit" value="查找"></form></td>
</tr></table>
<table border="1">
<tr>
	<th>序号</th>
	<th>姓名</th>
	<th>分数</th>
	<th>学科</th>
	<th>编号</th>

	
</tr>
<c:forEach items="${mark}" var="s">
	<tr>
		<td align="center">${s.mid }</td>
			<td align="center">${s.mname }</td>
		<td align="center">${s.mark}</td>
		<td align="center">${s.mtid }</td>
		<td align="center">${s.mmid}</td>
		<td><a href="markdelete?mmid=${s.mmid}&mtid=${s.mtid}">删除</a></td>
	</tr>
</c:forEach>

</table>
</div>
</body>
</html>