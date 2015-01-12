<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="sec"%>
<head>
<script type="text/javascript">
	$(document).ready(function() {
	    $('#dg').dataTable( {
	        "bJQueryUI": true,
	        "sPaginationType": "full_numbers"
	    } );
	} );
	
	$(function() {
		var text = '${typeTag}';
		$("#listTagTypes option").filter(function() {
		    //may want to use $.trim in here
		    return $(this).text() == text; 
		}).prop('selected', true);
	});
	
	function changeValue(o, value, elt) {
		var form = document.forms['gettag'];
		if (o.checked) {
			form.elements[elt].value = value;
		} else {
			form.elements[elt].value = '';
		}
	}
	
	function addZone() {
		var form = document.forms['addform'];
		form.submit();
		return void(0);
	}
	
	var count = 0;
	
	function setZoneToDelete(o, value, elt) {
		var form = document.forms['delform'];
		if (o.checked) {
			form.elements[elt].value = value;
			form.elements[elt].value = value;
			count++;
		} else {
			form.elements[elt].value = '';
			count--;
		}
	}
	
	function supprimer() {
		if(count > 0) {
			if(window.confirm('Etes-vous sûre de vouloir supprimer les zones sélectionnées?')){
				var form = document.forms['delform'];
				form.submit();
			}
		}
	}
	
	function retour(){
		location.href='${pageContext.request.contextPath}/site';
	}
	
	function genererTag() {
		var form = document.forms['gettag'];
		var idZone = form.elements['idZone'].value;
		var idSite = form.elements['idSite'].value;
		var typeTag = form.elements['typeTag'].value;
// 		form.submit();
		$.ajax({
			url : "${pageContext.request.contextPath}/zone/getTag?idZone="+idZone+"&idSite="+idSite+"&typeTag="+typeTag,
			context : document.body
		}).done(function(data) {
			 $("#tags").html(data);
		});
	}
	
</script>
</head>

<h3>Liste des zones du site : [${site.name}]</h3>


<s:if test="hasActionErrors()">
	<div class="errors">
		<s:actionerror />
	</div>
</s:if>

<s:if test="hasActionMessages()">
	<div class="infos">
		<s:actionmessage />
	</div>
</s:if>

<div>&nbsp;</div>
<div style="text-align: right; width: 80%;"><a href="javascript:void(0);" onclick="javascript:retour();">
<img alt="" src="https://cdn1.iconfinder.com/data/icons/fugue/icon/arrow-circle-225-left.png"> retour </a>&nbsp;
</div>
<div>
&nbsp;<a href="javascript:void(0);" onclick="javascript:addZone();" > [+] Ajouter une nouvelle zone</a> 
&nbsp;|&nbsp;<a href="javascript:void(0);" onclick="javascript:supprimer();">[-] Supprimer les zones sélectionnées</a>
</div>
<div>&nbsp;</div>
<div style="width: 80%; margin-left: 10px;" >

<form action="formAddZone" method="post" name="addform">
	<input type="hidden" name="idSite" value="${site.affiliateid}"/>
	<input type="hidden" name="site.name" value="${site.name}"/>
</form>

<form action="delZone" method="post" name="delform">
	<s:iterator value="listZones" var="zone" status="id">
		<input type="hidden" name="deleteZones[${id.index}]"/>
	</s:iterator>
</form>

<form action="getTag" method="post" name="gettag">
<input type="hidden" name="idZone"/>
<input type="hidden" name="idSite" value="${site.affiliateid}"/>
<table id="dg" title="Liste des zones">
	<thead>
		<tr>
			<th>Select</th>
			<th width="0" style="display: none" hidden="true">id site</th>
			<th width="100">Site</th>
<!-- 			<th field="zoneid" width="20">id</th> -->
			<th width="300">Nom</th>
			<th width="200">Categorie</th>
			<th width="100">Position</th>
			<th>TAG</th>
		</tr>
	</thead>
	<tbody>
		<s:iterator value="listZones" var="zone" status="id">
			<tr>
				<td align="center"><input type="checkbox" onclick="setZoneToDelete(this, '${zone.zoneid}', 'deleteZones[${id.index}]')" /></td>
				<td id="id" style="display: none" width="0" hidden="true">${site.affiliateid}</td>
				<td id="name">${site.name}</td>
<%-- 				<td id="zoneid">${zone.zoneid}</td> --%>
				<td id="zonename">${zone.zonename}</td>
				<td id="category">${zone.category}</td>
				<td id="pos" align="center">${zone.width}x${zone.height}</td>
				<td align="center">
					<input type="radio" onclick="changeValue(this,'${zone.zoneid}','idZone')" ${zone.delivery ne '0' ? 'disabled=disabled' : ''} />
				</td>
			</tr>
		</s:iterator>
	</tbody>
</table>
<br>
<div> <font style="font-weight:bold; color: red;"> /!\ </font> Sélectionner une zone pour générer le Tag</div>

<table style="border: 0px; width: 760px" class="table">
	<tr>
		<td>
			Choisir le type du Tag : <select name="typeTag" id="listTagTypes">
				<c:forEach items="${listTagTypes}" var="typeTag" >
					<option value="${typeTag}">${typeTag}</option>
				</c:forEach>
			</select>
			&nbsp;<input type="button" onclick="javascript:genererTag()" class="btn btn-default btn-sm" value="generer"/>
		</td>
	</tr>
</table>
</form>
</div>

<div style="width: 80%; margin-left: 10px;" id="tags"/>

