  <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
    <h1 align="center">修改</h1>
    <form action="studentupda" method="post">
      姓名：<input type="text" name="sname" value="${one.sname}"><br>
        学号：<input type="text" name="number" value="${one.number}"><br>
         性别：<input type="text" name="ssex" value="${one.ssex}"><br>
          班级：<input type="text" name="sclass" value="${one.sclass}"><br>
           专业：<input type="text" name="slearn" value="${one.slearn}"><br>
         <button>提交</button>  </form>
    </body>
</html>