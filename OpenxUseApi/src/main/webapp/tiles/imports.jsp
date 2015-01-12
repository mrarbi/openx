<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!-- bootstrap CSS -->
<link rel="stylesheet" href="<c:url value='/bootstrap/css/bootstrap.css'/>" />
<!-- jquery easy ui CSS -->
<%-- <link rel="stylesheet" href="<c:url value='/themes/easyui/gray/easyui.css'/>" /> --%>
<link rel="stylesheet" href="<c:url value='/themes/easyui/icon.css'/>" />

<%-- <link rel="stylesheet" href="<c:url value='/themes/datatable/css/shCore.css'/>" /> --%>
<%-- <link rel="stylesheet" href="<c:url value='/themes/datatable/css/shThemeDataTables.css'/>" /> --%>
<%-- <link rel="stylesheet" href="<c:url value='/themes/datatable/css/doc.css'/>" /> --%>
<link rel="stylesheet" href="<c:url value='/themes/datatable/css/jquery.dataTables_themeroller.css'/>" />
<link rel="stylesheet" href="<c:url value='/themes/datatable/css/jquery.dataTables.css'/>" />

<link rel="stylesheet" href="<c:url value='/themes/ui-overcast/jquery-ui-1.10.4.custom.css'/>" />

<!-- validation form CSS -->
<link rel="stylesheet" href="<c:url value='/themes/validform/validationEngine.jquery.css'/>" type="text/css"/>
<link rel="stylesheet" href="<c:url value='/themes/validform/template.css'/>" type="text/css"/>

<!-- jquery JavaScript -->
<script src="<c:url value='/js/jquery/jquery-2.0.2.js'/>" charset="utf-8"></script>
<script src="<c:url value='/js/jquery/jquery-ui-1.10.4.custom.js'/>" charset="utf-8"></script>
<!-- bootstrap JavaScript -->
<script src="<c:url value='/bootstrap/js/bootstrap.min.js'/>" charset="utf-8"></script>

<script src="<c:url value='/js/datatable/jquery.dataTables.js'/>" charset="utf-8"></script>
<script src="<c:url value='/js/datatable/shCore.js'/>" charset="utf-8"></script>
<script src="<c:url value='/js/datatable/shBrushJScript.js'/>" charset="utf-8"></script>

<!-- validation form JS -->
<script src="<c:url value='/js/validform/languages/jquery.validationEngine-fr.js'/>" type="text/javascript" charset="utf-8"></script>
<script src="<c:url value='/js/validform/jquery.validationEngine.js'/>" type="text/javascript" charset="utf-8"></script>

<!-- dwr engine -->
<script type="text/javascript" src="<c:url value='/dwr/engine.js'/>"></script>

<style type="text/css">
pre {
	display: block;
	border: 1px solid #ccc;
	padding: 4px;
	background: #D9EBF5;
	margin: 0 0 1em;
	white-space: pre-wrap;
	white-space: -moz-pre-wrap;
	white-space: -pre-wrap;
	white-space: -o-pre-wrap;
	word-wrap: break-word;
	overflow: auto;
	overflow-x: auto;
	overflow-y: hidden;
	cursor: text;
}

.errors {
	background-color:#FFCCCC;
	border:1px solid #CC0000;
	width:700px;
	margin-bottom:10px;
	padding:5px 0px 0px 5px;
}
.errors li{ 
	list-style: none; 
}

.infos {
	background-color:#DDFFDD;
	border:1px solid #009900;
	width:700px;
	margin-bottom:10px;
	padding:5px 0px 0px 5px;
}
.infos li{ 
	list-style: none; 
}

/* .ui-menu { */
/*  	width: 150px; */
/* } */
* 
{
margin: 0px;
padding: 0px;
}

body {
 /*background-color: #a3cabd;*/
}

.menu {
background-color: #FAFAFA;
border-color: #C7C7C7;
color: #000;
}

.menu-container {
display: block;
position: relative;
width: 200px;
background-color: #f3f0ef;
margin: 5% auto 0;
padding: 0;
border-radius:5px;
box-shadow:  inset 0 0 1px rgba(255,255,255,1);
box-shadow:  5px 5px 15px 1px rgba(0,0,0,0.1);
}

.nav{
background-color: #A0BFE0;
height: 30px;
border-radius: 4px 4px 0 0;
}

.settings {
height:20px;
float:right;
/*background-image:url(http://i.imgur.com/CLs7u.png);*/
width:20px;
margin:10px;
}

.menu ul {
list-style:none;
}

.menu ul li {
border-top:1px solid rgba(0,0,0,0.1);
padding:11px 10px;
box-shadow:inset 0 1px 1px #fff;
text-indent:10px;
height: 40px;
}

.menu ul li a {
font-size:14px;
color:#a4a3a3;
font-family: 'Strait', sans-serif;
font-size:14px;
text-decoration:none;
text-shadow:aqua;
text-shadow: 1px 1px 1px #fff;
}

.menu ul li img {
float:left;
margin:-2px 0 0 0;
}

.menu ul li:hover {
border-left:3px solid #A0BFE0;
background-color:rgba(0,0,0,0.02);
}

/* Erreur struts */
.errorsBg{
	/*background-color:#fdd;
	color:red;
	border: 1px solid;*/
	
}

.errorsBg > input {
	border: 1px solid red;
}
 
.errorMessage{
	padding:0px 8px;
	font-size: 12px;
	color:red;
}
 
table{
	border-spacing: 4px;
}
td{
	padding:4px;
}
</style>