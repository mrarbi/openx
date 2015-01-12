<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec"%>

<sec:authorize access="isAnonymous()">
<c:redirect url="${pageContext.request.contextPath}/login" />
</sec:authorize>

<table width="100%">
	<tr>
		<td width="70%">Bienvenue : <sec:authentication property="principal.username" /></td>
		<td style="text-align: right;"> <a href="${pageContext.request.contextPath}/logout">Déconnexion</a></td>
	</tr>
</table>

<s:url id="localeFR" action="locale" >
   <s:param name="request_locale" >fr</s:param>
</s:url>
<s:url id="localeEN" action="locale" >
   <s:param name="request_locale" >en</s:param>
</s:url>
<s:url id="localeDE" action="locale" >
   <s:param name="request_locale" >de</s:param>
</s:url>
 
<%-- <s:a href="%{localeFR}" >France</s:a> --%>
<%-- <s:a href="%{localeEN}" >English</s:a> --%>
<%-- <s:a href="%{localeDE}" >German</s:a> --%>