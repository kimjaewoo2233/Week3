<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>설정 테스트 ${name}</h2> 
     <div>JSP 뿌리기</div> 
     <c:forEach var="item" items="${list}" varStatus="idx"> 
         ${idx.index} : ${item} <br /> 
     </c:forEach>
</body>
</html>