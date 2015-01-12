<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec"%>

<script type="text/javascript">

$(document).ready(function() {
    $('#dg').dataTable( {
        "bJQueryUI": true,
        "sPaginationType": "full_numbers"
    } );
} );

/*
    var toolbar = [{
        text:'Ajouter',
        iconCls:'icon-add',
        handler:function(){
        	location.href="${pageContext.request.contextPath}/site/formAddSite";
        }
    },'-',{
        text:'Supprimer',
        iconCls:'icon-remove',
        handler:function(){
           	var row = $('#dg').datagrid('getSelected');
        	if (row){
	        	$.messager.confirm('Confirmation', 'Voulez-vous vraiment supprimer le site web sélectionné ?', function(ok){
	                if (ok){
	                	location.href="${pageContext.request.contextPath}/site/delSite?idSite=" + row.affiliateid;
	                }
	            });
        	}
        }
    }];
 */
 	var count = 0;

	function changeValue(o, value, elt) {
		var form = document.forms[0];
		if (o.checked) {
			form.elements[elt].value = value;
			count++;
		} else {
			form.elements[elt].value = '';
			count--;
		}
	}

	function supprimer() {
		if(count > 0) {
			if(window.confirm('Etes-vous sûre de vouloir supprimer les sites sélectionnés?')){
				var form = document.forms[0];
				form.submit();
			}
		}
	}
</script>

<h3>Gestion des sites web</h3>

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
&nbsp;<a href="javascript:void(0);" onclick="javascript:location.href='${pageContext.request.contextPath}/site/formAddSite'" >[+] Ajouter un nouveau site web</a>
&nbsp;|&nbsp;<a href="javascript:void(0);" onclick="javascript:supprimer();">[-] Supprimer les sites sélectionnés</a>
</div>
<div>&nbsp;</div>
<div style="width: 80%; margin-left: 10px;" >
<form action="delSite" method="post" validate="false">
<table id="dg" title="Liste des sites">
	<thead>
		<tr>
			<th>Select</th>
			<th width="200">Nom</th>
			<th width="400">URL du site web</th>
			<th width="100"></th>
		</tr>
	</thead>
	<tbody>
		<s:iterator value="listAffiliates" var="affiliate" status="id">
			<s:url action="siteZones" id="lienZone" namespace="site">
				<s:param name="idSite">${affiliate.affiliateid}</s:param>
			</s:url> 
			<tr>
				<td align="center" id="affiliateid"><input type="checkbox" onclick="changeValue(this, '${affiliate.affiliateid}', 'selectSites[${id.index}]')" />
					<input type="hidden" name="selectSites[${id.index}]"/></td>
				<td id="name">${affiliate.name}</td>
				<td id="website">${affiliate.website}</td>
				<td align="center" id="zones"><a href='${lienZone}'>zones</a></td>
			</tr>
		</s:iterator>
	</tbody>
</table>
</form>

</div>

