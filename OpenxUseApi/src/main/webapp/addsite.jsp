<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec"%>
<%@ taglib prefix="sx" uri="/struts-dojo-tags"%>
<script>
	jQuery(document).ready(function() {
		// binds form submission and fields to the validation engine
		jQuery("#formID").validationEngine('attach');
		$("#datepicker").datepicker({
			showButtonPanel: true,
			changeMonth: true,
			dateFormat: 'dd/mm/yy',
			changeYear: true
	    });
	});
	
	function retour(){
		location.href='${pageContext.request.contextPath}/site';
	}
</script>

<h3>Ajouter un nouveau site</h3>


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
<div class="demo-tip icon-tip">&nbsp;&nbsp;&nbsp;&nbsp;Remplir le formulaire et cliquer sur valider.</div>
<form method="post" action="addSite" id="formID" >
	<table style="width: 80%; border: 2px; border-style: solid;border-color: #CFD2D5;" class="table table-striped">
			<tr>
				<td colspan="2"><s:textfield type="text" name="site.name" size="30"
						cssClass="validate[required]" maxlength="30" label="Nom" /></td>
			</tr>
			<tr>
				<td colspan="2"><s:textfield name="site.website" cssClass="validate[required,custom[url]]"
						size="40" maxlength="60" placeholder="http://"
						label="URL du site web" /></td>
			</tr>
			<tr>
				<td colspan="2"><s:textfield name="site.email" cssClass="validate[required,custom[email]]"
						size="30" maxlength="30" label="Email" /></td>
			</tr>
			<tr>
				<td colspan="2"><s:textfield name="site.contact" cssClass="validate[required]"
						label="Contact" /></td>
			</tr>
<!-- 			<tr> -->
<!-- 				<td colspan="2"> -->
<%-- 					<s:textfield name="date1" label="Format (dd/MM/yyyy)" id="datepicker"/> --%>
<!-- 				</td> -->
<!-- 			</tr> -->
			<tr>
				<td colspan="2" align="right"><input type="submit" value="Valider" class="btn btn-default"/> <input type="reset"
						value="Retablir" class="btn btn-default"/></td>
			</tr>
	</table>
</form>
