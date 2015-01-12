<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 5 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>Login</title>

	<!-- CSS -->
	<link rel="stylesheet" href="<c:url value='/themes/login/reset.css'/>"/>
	<link rel="stylesheet" href="<c:url value='/themes/login/animate.css'/>"/>
	<link rel="stylesheet" href="<c:url value='/themes/login/styles.css'/>"/>
</head>
<body>

	<div id="container">
		
		<c:if test="${not empty param.error}">
			<br>
		<!-- 			<div class="errors"> -->
			<font color="red">&nbsp;&nbsp;login ou mot de passe incorrect </font>
		<!-- 			</div> -->
		</c:if>
		
		<form class="form-inline" role="form" action="j_spring_security_check" method="post">
		
		<label for="name">Utilisateur:</label>
		
		<input type="name" name="j_username" tabindex="1"/>
		
		<label for="password">Mot de passe:</label>
		
		<input type="password" name="j_password" tabindex="2"/>
		
		<br><br><p><a href="#" tabindex="3">Mot de passe oublié?</a>
		
		<div id="lower">
		
		<input id="rememberMe" type="checkbox" name="_spring_security_remember_me">
		<label class="check" for="rememberMe" style="cursor: pointer;">Se rappeler de moi</label>
		
		<input type="submit" value="Login">
		
		</div>
		
		</form>
		
	</div>

</body>
</html>