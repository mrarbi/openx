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
	
	
	function addAdvert() {
		var form = document.forms['addform'];
		form.submit();
		return void(0);
	}
	
	var count = 0;
	
	function setAdvertToDelete(o, value, elt) {
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
			if(window.confirm("Etes-vous sûre de vouloir supprimer les annonceurs sélectionnés?")){
				var form = document.forms['delform'];
				form.submit();
			}
		}
	}
	
</script>
</head>

<h3>Liste des annonceurs</h3>


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
<div>
&nbsp;<a href="javascript:void(0);" onclick="javascript:addAdvert();" >[+] Ajouter un nouveau annonceur</a> 
&nbsp;|&nbsp;<a href="javascript:void(0);" onclick="javascript:supprimer();">[-] Supprimer les annonceurs sélectionnés</a>
</div>
<div>&nbsp;</div>
<div style="width: 80%; margin-left: 10px;" >

<form action="formAddAdvert" method="post" name="addform">
</form>


<form action="delAdvert" method="post" name="delform">
<table id="dg" title="Liste des zones">
	<thead>
		<tr>
			<th>Select</th>
			<th>Annonceur</th>
			<th>Nom contact</th>
		</tr>
	</thead>
	<tbody>
		<s:iterator value="listAdverts" var="advertiser" status="id">
			<tr>
				<td align="center"><input type="checkbox" onclick="setAdvertToDelete(this, '${advertiser.clientid}', 'selectAdverts[${id.index}]')" />
					<input type="hidden" name="selectAdverts[${id.index}]"/>
				</td>
				<td id="name">${advertiser.clientname}</td>
				<td id="contact">${advertiser.contact}</td>
				
			</tr>
		</s:iterator>
	</tbody>
</table>
</form>
</div>
