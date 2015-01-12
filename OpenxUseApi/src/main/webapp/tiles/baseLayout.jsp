<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sx" uri="/struts-dojo-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 5 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
	    <tiles:insertAttribute name="imports" />
        <title><tiles:insertAttribute name="title" ignore="true" /></title>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<s:head/>
    </head>
    <body>
        <table cellpadding="4" cellspacing="4" align="center" class="table">
            <tr>
                <td height="30" colspan="2">
                    <tiles:insertAttribute name="header" />
                </td>
            </tr>
            <tr>
                <td width="10%" height="650" valign="top" align="left">
                    <br><br>
                    <tiles:insertAttribute name="leftMenu" />
                </td>
                <td width="50%" valign="top" style="padding-left: 50px">
                    <tiles:insertAttribute name="body" />
                </td>
                <td width="40%" valign="top">
                	<br><br>
                    <tiles:insertAttribute name="rightMenu" />
                </td>
            </tr>
            <tr>
                <td height="30" colspan="3">
                    <tiles:insertAttribute name="footer" />
                </td>
            </tr>
        </table>
    </body>
    
</html>
