<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="sec"%>

<script>
	jQuery(document).ready(function() {
		// binds form submission and fields to the validation engine
		jQuery("#formID").validationEngine('attach');
	});
	
	function retour(){
		location.href='${pageContext.request.contextPath}/advert/annonceurs';
	}
</script>

<h3>Ajouter un nouveau annonceur </h3>

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
<form method="post" action="addAdvert" id="formID">
	<s:hidden name="agencyid"/>
	<table style="width: 80%; border: 2px; border-style: solid;border-color: #CFD2D5;" class="table table-striped">
		<tr>
			<td colspan="2"><s:textfield type="text" class="form-control"
					cssClass="validate[required]" name="advert.clientname" size="30"
					maxlength="30" label="Nom" /></td>
		</tr>
		<tr>
			<td colspan="2"><s:textfield type="text"
					cssClass="validate[required]" name="advert.contact" size="30" 
					maxlength="30" label="Contact" class="form-control"/></td>
		</tr>
		<tr>
			<td colspan="2"><s:textfield type="text"
					cssClass="validate[required,custom[email]]" name="advert.email"
					size="30" maxlength="30" label="E-mail" /></td>
		</tr>
		<tr>
			<td colspan="2" align="right"><input type="submit" value="Valider" class="btn btn-default"/> <input type="reset"
					value="Retablir" class="btn btn-default"/></td>
		</tr>
	</table>
</form>


