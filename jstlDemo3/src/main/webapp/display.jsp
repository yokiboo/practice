<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<c:set var="str" value="hello yohe is a java newbie"></c:set>
	
	Length: ${fn:length(str)} <br><br>
	<c:forEach items="${fn:split(str,'o')}" var="s">
	${s}<br>
	</c:forEach>
	<br><br>
	Index: ${fn:indexOf(str,"is")}
	<br>
	<c:if test="${fn:endsWith(str,'java')}">
	you are right
	</c:if>
	<br>
	${fn:toUpperCase(str)}
	
</body>
</html>