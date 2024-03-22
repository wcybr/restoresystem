    <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>学生列表</title>
</head>
<body>
<div>
<h1>学生列表</h1>

<table border="1">
<tr>
<td><a href="studentadd.jsp">添加</a></td>
<td><a href="studentall">刷新</a></td>
<td><a href="studentupdate.jsp">修改</a></td>
<td><a href="markstudentmap.jsp">查看分数</a></td>
<td><a href="studentselect.jsp">学生选课</a></td>
<td><a href="index.jsp">返回登录</a></td>
<td><form action="studentfindOne" method="post"> <input type="text" name="number"><input type="submit" value="查找"></form></td>
</tr></table>
<table border="1">
<tr>
	<th>序号</th>
	<th>姓名</th>
	<th>性别</th>
	<th>班级</th>
	<th>专业</th>
	<th>学号</th>
	
</tr>
<c:forEach items="${student}" var="s">
	<tr>
		<td align="center">${s.sid }</td>
		<td align="center">${s.sname }</td>
		<td align="center">${s.ssex }</td>
		<td align="center">${s.sclass}</td>
		<td align="center">${s.slearn }</td>
		<td align="center">${s.number}</td>
		<td><a href="studentdelete?number=${s.number}">删除</a></td>
	</tr>
</c:forEach>

</table>
</div>
</body>
</html>