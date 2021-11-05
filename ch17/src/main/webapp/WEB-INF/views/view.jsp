<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="sessionChk.jsp" %>
<!DOCTYPE html><html><head><meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">@import url("common.css");</style>
</head><body>
<table><caption>회원 정보</caption>
	<tr><th>아이디</th><td>${member.id }</td></tr>
	<tr><th>이름</th><td>${member.name }</td></tr>
	<tr><th>전화</th><td>${member.tel }</td></tr>
	<tr><th>주소</th><td>${member.address }</td></tr>
	<tr><th>등록일</th><td>${member.reg_date }</td></tr>
</table>
<a href="main.do">메인</a><p>
<a href="updateForm.do">회원정보 수정</a>
</body>
</html>