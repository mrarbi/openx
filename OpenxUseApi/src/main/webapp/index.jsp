<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec"%>
<head>

<script type="text/javascript" src="<c:url value='/dwr/interface/Demo.js'/>"> </script>
<script src="<c:url value='/js/chart/Chart.js'/>"></script>
<style>
	canvas{}
</style>
</head>

<body>
	<h3>Statistiques...</h3>
	<table style="border: 1px; border-style: solid; background-color: #fff">
		<tr>
			<td align="left" >
				<canvas id="myChart" height="600" width="800"></canvas>
			</td>
		</tr>
		<tr>
			<td id="chartKey">
			</td>
		</tr>
	</table>
<script type="text/javascript">
	
	$(document).ready(function() {
		
// 		Demo.getStr(function(json) { 
// 			var obj = JSON.parse(json);
// 			alert(obj.zonename);
// 		});
		
		$.getJSON("getData",function(result){
// 		Demo.getData(function(json) {
// 			var result = JSON.parse(json);
	   		var myLine = new Chart(document.getElementById("myChart").getContext("2d")).PolarArea(result);
   			var cont = "";
	   		for(var i=0; i < result.length ; i++){
	   			cont += "<div style='border: 1px; border-style: solid; width: 20px; height:20px; float:left;margin: 0 4px 4px 4px; background-color:";
	   			cont += result[i].color + "'></div><span style='float:left'>" + result[i].site;
	   			cont += "</span><div style='clear:both'></div>";
	   		}
	   		document.getElementById("chartKey").innerHTML = cont;
		});
	});
// 	var data = [{"color":"#9D9B7F","value":0},{"color":"#C7604C","value":17},{"color":"#584A5E","value":11},{"color":"#7D4F6D","value":13}]
	
// 	var myLine = new Chart(document.getElementById("myChart").getContext("2d")).PolarArea(data);

</script>
	
</body>