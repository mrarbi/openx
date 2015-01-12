<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:if test="${headTag ne null}">
<div class="row" style="padding: 0px 0px 0px 12px;">
Header script : <br>
<pre><xmp><script type='text/javascript' src='${headTag}'></script></xmp></pre>
</div>
</c:if>
<c:if test="${adTag ne null}">
<div class="row" style="padding: 0px 0px 0px 12px;">
Ad script - ${adTag.nomZone} : ${adTag.position}<br>
<pre><xmp>${adTag.tagValue}
</xmp></pre>
Aperçu :
<div style="width: ${adTag.width}px;height: ${adTag.height}px;position: relative;background: #00639B;border: 1px solid #999;">
	<span style="color: white;"> ${adTag.width} x ${adTag.height} </span>
</div>
</div>
</c:if>