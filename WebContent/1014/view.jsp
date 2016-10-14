<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:forEach var="dto" items="${list }">
	${dto.id} / ${dto.pw} / ${dto.age} / ${dto.reg}<br/>
</c:forEach>
<br/>
Rst:<br/>
	${rst.id} / ${rst.pw} / ${rst.age} / ${rst.reg}<br/>
<br/>
<c:forEach var="age" items="${agelist }">
	${age}<br/>
</c:forEach>