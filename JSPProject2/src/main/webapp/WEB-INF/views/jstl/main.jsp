<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<%--
	
	<%@ %> : 지시자 태그
	
	taglib : 태그 라이브러리 추가
	
	prefix : 접두사, 태그명 앞에 작성되는 단어 <c:if>
	
	uri(Uniform Resource Identifier , 통합 자원 식별자) 
	-> 자원을 식별하는 고유 문자열(ID)
	
	(참고) url(Uniform Resource Locator)
	-> 자원의 위치를 나타내는 문자열(경로)

 --%>    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL(Jsp Standard Tag Library)</title>
</head>
<body>
		<!-- 상대 경로 : 현재 경로가 중요함  
		
		현재 경로 : localhost :8000/jstl/main
		목표 경로 : localhost :8000/jstl/condition
		
		-->
		<a href="condition">JSTL을 이용한 조건문(if, choose, when,otherwise)</a>


	<!-- 상대 경로 : 현재 경로가 중요함  
		
		현재 경로 : localhost :8000/jstl/main
		목표 경로 : localhost :8000/jstl/loop
		
		-->

	<a href="loop">JSTL을 이용한 반복문</a>
	<br>
	
	<a href="student/selectAll">workbook에서 학생 전체 조회하기</a>
	
	<%--
		건축공학과 학생만 찾아라
		student/selectArch
		selectArch.jsp	
	 --%>
	 
	 <form action="student/selectOne" method="post">
	 	<input type="text" name="deptName">
	 </form>
	 
	 <br>
	 <a href="student/selectArch">건축공학과 학생만 찾아라</a>
	 

	<h1>JSTL(Jsp Standard Tag Library, JSP 표준 태그 라이브러리)</h1>

	<pre>
		JSP에서 자주 사용되거나 공통적으로 사용되는 
		Java 코드(if, for, 변수 선언, 형변환)를
		
		스크립플릿대신 html 태그 형식을 태그화하여 
		표준으로 제공하는 라이브러리
		(if,for 간단히 쓰고 싶으면)
	</pre>
	
	<h3>JSTL 라이브러리 등록 방법</h3>
	
	<ol>
	<a href="https://tomcat.apache.org/download-taglibs.cgi"></a>
		<li>JSTL 다운로드</li>
		
		<li>/webapp/WEB-INF/lib 폴더에 라이브러리 파일(.jar) 추가 </li>
	
		<li>
			JSTL 라이브러리를 사용하고자 하는 JSP 파일 상단에 
			tabib
		
	</ol>
	
	
	<hr>
	<h1> 1. 변수 선언(c:set 태그)</h1>
	
	<pre>
		- 변수 선언 위한 태그
		
		- c:set에 작성 가능한 속성
		
		1) var : 변수명(속성 key)
		2) value : 대입한 값
		3) scope : page, request, session, application 중 하나 지정
		(기본 값 page)
		
		
	</pre>
	
	<%
		// 스크립틀릿으로 page scope에 속성 세팅하는 방법 
		pageContext.setAttribute("num1",10);
	%>
	
	<%-- JSTL로 page scope에 속성 세팅하는 방법 --%>
	<c:set var="num2" value="20" scope="page"/>
	
	num1 : ${num1}
	<br>
	num2 : ${num2}
	
	<hr>
	
	<h1> 2. 변수 제거(c:remove)</h1>
	<pre>
		- 변수 제거 : 내장 객체에 세팅된 속성을 제거
		(removeAttribute("num1"))
		
		- c:remove 속성
		1) var : 삭제할 변수명 
		2) scope : 내장 객체 범위 (기본 값 : 모든 scope)
	</pre>
	
	<%
		pageContext.removeAttribute("num1");
	
	%>
	num1 제거 확인 : ${num1}
	
	<c:remove var = "num2"/>
	
	<br>
	num2 제거 확인 : ${num2}
	
	<h1>3. 변수 출력(c:out 태그)</h1>
	
	<pre>
		\${key} EL 구문 비슷함 
		
		- 단, escapeXml="true"(기본값) 설정시 
		html 태그가 해석 x
		
		- escapeXml="false" html 태그 해석 o
	
	</pre>
	
	<c:set var="temp" value="<h1>곧 점심시간</h1>"/>
	
	html 태그 해석 x : <c:out value="${temp}"/>
	
	<br>
	
	html 태그 해석 o : <c:out value="${temp}" escapeXml="false"/>
	
	
	
</body>
</html>