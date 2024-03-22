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
    <form action="markupda" method="post">
      姓名：<input type="text" name="mname" value="${one.mname}"><br>
        学科：<input type="text" name="mark" value="${one.mark}"><br>
         学分：<input type="text" name="mtid" value="${one.mtid}"><br>
          编号：<input type="text" name="mmid" value="${one.mmid}"><br>
         <button>提交</button>  </form>
    </body>
</html>