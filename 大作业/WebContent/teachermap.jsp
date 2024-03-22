    <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>教室教师列表</title>
</head>
<body>
<div>
<h1>教师列表</h1>

<table border="1">
<tr>
<td><a href="teacheradd.jsp">添加</a></td>
<td><a href="teacherall">刷新</a></td>
<td><a href="teacherupdate.jsp">修改</a></td>
<td><a href="studentmap.jsp">学生界面</a></td>
<td><a href="markteachermap.jsp">教师分数界面</a></td>
<td><form action="teacherfindOne" method="post"> <input type="text" name="tsid"><input type="submit" value="查找"></form></td>
</tr></table>
<table border="1">
<tr>
	<th>序号</th>
	<th>姓名</th>
	<th>课程</th>
	<th>学分</th>
	<th>简介</th>
	<th>编号</th>
	
</tr>
<c:forEach items="${teacher}" var="s">
	<tr>
		<td align="center">${s.tid }</td>
			<td align="center">${s.tname }</td>
		<td align="center">${s.tsubject}</td>
		<td align="center">${s.tscore }</td>
		<td align="center">${s.tmes}</td>
	
		<td align="center">${s.tsid}</td>
		<td><a href="teacherdelete?tsid=${s.tsid}">删除</a></td>
	</tr>
</c:forEach>

</table>
</div>
</body>
</html>