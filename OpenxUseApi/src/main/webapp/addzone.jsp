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
		location.href='${pageContext.request.contextPath}/site/siteZones?idSite=${idSite}';
	}
	
</script>

<h3>Ajouter une nouvelle zone dans le site : [${site.name}]</h3>

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
<form method="post" action="addZone" id="formID">
	<s:hidden name="idSite"/>
	<table style="width: 80%; border: 2px; border-style: solid;border-color: #CFD2D5;" class="table table-striped">
		<tr>
			<td colspan="2"><s:textfield type="text" class="form-control"
					name="zone.zonename" size="30"
					maxlength="30" label="Nom" /></td>
		</tr>
		<tr>
			<td colspan="2"></td>
		</tr>
		<tr>
			<td style="text-align: right;">Categorie</td><td>
			<div class="col-xs-4" style="padding : 0px 0px 0px 0px">
			<select name="zone.category" id="zone.category" class="form-control input-sm" >
					<option value="">-- choisir une categorie --</option>
					<option value="1">Accessories</option>
					<option value="101">&nbsp;&nbsp;&nbsp;Handbags</option>
					<option value="102">&nbsp;&nbsp;&nbsp;Jewelry</option>
					<option value="103">&nbsp;&nbsp;&nbsp;Shoes</option>
					<option value="2">Art/Photo/Music</option>
					<option value="201">&nbsp;&nbsp;&nbsp;Art</option>
					<option value="202">&nbsp;&nbsp;&nbsp;Music</option>
					<option value="203">&nbsp;&nbsp;&nbsp;Photo</option>
					<option value="3">Automotive</option>
					<option value="301">&nbsp;&nbsp;&nbsp;Cars : Trucks</option>
					<option value="302">&nbsp;&nbsp;&nbsp;Motorcycles</option>
					<option value="303">&nbsp;&nbsp;&nbsp;Parts : Accessories</option>
					<option value="304">&nbsp;&nbsp;&nbsp;Rentals</option>
					<option value="305">&nbsp;&nbsp;&nbsp;Tools and Supplies</option>
					<option value="4">Beauty</option>
					<option value="401">&nbsp;&nbsp;&nbsp;Bath : Body</option>
					<option value="402">&nbsp;&nbsp;&nbsp;Cosmetics</option>
					<option value="403">&nbsp;&nbsp;&nbsp;Fragrance</option>
					<option value="5">Books/Media</option>
					<option value="501">&nbsp;&nbsp;&nbsp;Audio Books</option>
					<option value="502">&nbsp;&nbsp;&nbsp;Books</option>
					<option value="503">&nbsp;&nbsp;&nbsp;Magazines</option>
					<option value="504">&nbsp;&nbsp;&nbsp;News</option>
					<option value="505">&nbsp;&nbsp;&nbsp;Television</option>
					<option value="506">&nbsp;&nbsp;&nbsp;Videos/Movies</option>
					<option value="6">Business</option>
					<option value="601">&nbsp;&nbsp;&nbsp;Business-to-Business</option>
					<option value="602">&nbsp;&nbsp;&nbsp;Marketing</option>
					<option value="603">&nbsp;&nbsp;&nbsp;Office</option>
					<option value="604">&nbsp;&nbsp;&nbsp;Productivity Tools</option>
					<option value="605">&nbsp;&nbsp;&nbsp;Travel</option>
					<option value="7">Buying and Selling</option>
					<option value="701">&nbsp;&nbsp;&nbsp;Auction</option>
					<option value="702">&nbsp;&nbsp;&nbsp;Classifieds</option>
					<option value="703">&nbsp;&nbsp;&nbsp;E-commerce
						Solutions/Providers</option>
					<option value="704">&nbsp;&nbsp;&nbsp;New/Used Goods</option>
					<option value="8">Careers</option>
					<option value="801">&nbsp;&nbsp;&nbsp;Employment</option>
					<option value="802">&nbsp;&nbsp;&nbsp;Military</option>
					<option value="9">Clothing/Apparel</option>
					<option value="901">&nbsp;&nbsp;&nbsp;Children's</option>
					<option value="902">&nbsp;&nbsp;&nbsp;Malls</option>
					<option value="903">&nbsp;&nbsp;&nbsp;Men's</option>
					<option value="904">&nbsp;&nbsp;&nbsp;Women's</option>
					<option value="10">Computer : Electronics</option>
					<option value="1001">&nbsp;&nbsp;&nbsp;Computer HW</option>
					<option value="1003">&nbsp;&nbsp;&nbsp;Computer SW</option>
					<option value="1002">&nbsp;&nbsp;&nbsp;Computer Support</option>
					<option value="1004">&nbsp;&nbsp;&nbsp;Consumer
						Electronics</option>
					<option value="1005">&nbsp;&nbsp;&nbsp;Peripherals</option>
					<option value="11">Education</option>
					<option value="1101">&nbsp;&nbsp;&nbsp;Children</option>
					<option value="1102">&nbsp;&nbsp;&nbsp;College</option>
					<option value="1103">&nbsp;&nbsp;&nbsp;Languages</option>
					<option value="1104">&nbsp;&nbsp;&nbsp;Professional</option>
					<option value="12">Entertainment</option>
					<option value="1201">&nbsp;&nbsp;&nbsp;Discounts</option>
					<option value="1202">&nbsp;&nbsp;&nbsp;Events</option>
					<option value="1203">&nbsp;&nbsp;&nbsp;Guides</option>
					<option value="1204">&nbsp;&nbsp;&nbsp;Memorabilia</option>
					<option value="1205">&nbsp;&nbsp;&nbsp;Mobile
						Entertainment</option>
					<option value="1206">&nbsp;&nbsp;&nbsp;Party Goods</option>
					<option value="13">Family</option>
					<option value="1301">&nbsp;&nbsp;&nbsp;Babies</option>
					<option value="1302">&nbsp;&nbsp;&nbsp;Children</option>
					<option value="1303">&nbsp;&nbsp;&nbsp;Entertainment</option>
					<option value="1304">&nbsp;&nbsp;&nbsp;Teens</option>
					<option value="1305">&nbsp;&nbsp;&nbsp;Weddings</option>
					<option value="14">Financial Services</option>
					<option value="1401">&nbsp;&nbsp;&nbsp;Banking/Trading</option>
					<option value="1402">&nbsp;&nbsp;&nbsp;Credit Cards</option>
					<option value="1403">&nbsp;&nbsp;&nbsp;Credit Reporting
						and Repair</option>
					<option value="1404">&nbsp;&nbsp;&nbsp;Investment</option>
					<option value="1405">&nbsp;&nbsp;&nbsp;Mortgage Loans</option>
					<option value="1406">&nbsp;&nbsp;&nbsp;Personal Loans</option>
					<option value="1407">&nbsp;&nbsp;&nbsp;Real Estate
						Services</option>
					<option value="1408">&nbsp;&nbsp;&nbsp;Tax Services</option>
					<option value="15">Food : Drinks</option>
					<option value="1501">&nbsp;&nbsp;&nbsp;Gourmet</option>
					<option value="1502">&nbsp;&nbsp;&nbsp;Groceries</option>
					<option value="1503">&nbsp;&nbsp;&nbsp;Restaurants</option>
					<option value="1504">&nbsp;&nbsp;&nbsp;Wine : Spirits</option>
					<option value="16">Games : Toys</option>
					<option value="1601">&nbsp;&nbsp;&nbsp;Electronic Games</option>
					<option value="1602">&nbsp;&nbsp;&nbsp;Electronic Toys</option>
					<option value="1603">&nbsp;&nbsp;&nbsp;Games</option>
					<option value="1604">&nbsp;&nbsp;&nbsp;Toys</option>
					<option value="17">Gifts : Flowers</option>
					<option value="1701">&nbsp;&nbsp;&nbsp;Collectibles</option>
					<option value="1702">&nbsp;&nbsp;&nbsp;Flowers</option>
					<option value="1703">&nbsp;&nbsp;&nbsp;Gifts</option>
					<option value="1704">&nbsp;&nbsp;&nbsp;Greeting Cards</option>
					<option value="18">Health and Wellness</option>
					<option value="1801">&nbsp;&nbsp;&nbsp;Equipment</option>
					<option value="1802">&nbsp;&nbsp;&nbsp;Health Food</option>
					<option value="1803">&nbsp;&nbsp;&nbsp;Nutritional
						Supplements</option>
					<option value="1804">&nbsp;&nbsp;&nbsp;Pharmaceuticals</option>
					<option value="1805">&nbsp;&nbsp;&nbsp;Self Help</option>
					<option value="1806">&nbsp;&nbsp;&nbsp;Vision Care</option>
					<option value="1807">&nbsp;&nbsp;&nbsp;Weight Loss</option>
					<option value="1808">&nbsp;&nbsp;&nbsp;Wellness</option>
					<option value="19">Home : Garden</option>
					<option value="1901">&nbsp;&nbsp;&nbsp;Bed : Bath</option>
					<option value="1902">&nbsp;&nbsp;&nbsp;Construction</option>
					<option value="1903">&nbsp;&nbsp;&nbsp;Furniture</option>
					<option value="1904">&nbsp;&nbsp;&nbsp;Garden</option>
					<option value="1905">&nbsp;&nbsp;&nbsp;Home Appliances</option>
					<option value="1906">&nbsp;&nbsp;&nbsp;Kitchen</option>
					<option value="1907">&nbsp;&nbsp;&nbsp;Pets</option>
					<option value="1908">&nbsp;&nbsp;&nbsp;Real Estate</option>
					<option value="1909">&nbsp;&nbsp;&nbsp;Utilities</option>
					<option value="20">Insurance I</option>
					<option value="2001">&nbsp;&nbsp;&nbsp;Commercial</option>
					<option value="2002">&nbsp;&nbsp;&nbsp;Personal Insurance</option>
					<option value="21">Legal</option>
					<option value="2101">&nbsp;&nbsp;&nbsp;Services</option>
					<option value="22">Marketing</option>
					<option value="2201">&nbsp;&nbsp;&nbsp;Business-to-Business</option>
					<option value="2202">&nbsp;&nbsp;&nbsp;Network Marketing</option>
					<option value="23">Non-Profit</option>
					<option value="2301">&nbsp;&nbsp;&nbsp;Charitable
						Organizations</option>
					<option value="2302">&nbsp;&nbsp;&nbsp;Fundraising</option>
					<option value="24">Online Services</option>
					<option value="2401">&nbsp;&nbsp;&nbsp;Blogs</option>
					<option value="2402">&nbsp;&nbsp;&nbsp;Broadband</option>
					<option value="2403">&nbsp;&nbsp;&nbsp;Domain
						Registrations</option>
					<option value="2404">&nbsp;&nbsp;&nbsp;Email Marketing</option>
					<option value="2405">&nbsp;&nbsp;&nbsp;Internet Service
						Providers</option>
					<option value="2406">&nbsp;&nbsp;&nbsp;Search Engine</option>
					<option value="2407">&nbsp;&nbsp;&nbsp;Web Design</option>
					<option value="2408">&nbsp;&nbsp;&nbsp;Web Hosting/Servers</option>
					<option value="2409">&nbsp;&nbsp;&nbsp;Web Tools</option>
					<option value="25">Recreation : Leisure</option>
					<option value="2501">&nbsp;&nbsp;&nbsp;Astrology</option>
					<option value="2502">&nbsp;&nbsp;&nbsp;Betting/Gaming</option>
					<option value="2503">&nbsp;&nbsp;&nbsp;Camping and Hiking</option>
					<option value="2504">&nbsp;&nbsp;&nbsp;Communities</option>
					<option value="2505">&nbsp;&nbsp;&nbsp;Matchmaking</option>
					<option value="2506">&nbsp;&nbsp;&nbsp;Outdoors</option>
					<option value="2507">&nbsp;&nbsp;&nbsp;Tobacco</option>
					<option value="26">Seasonal</option>
					<option value="2601">&nbsp;&nbsp;&nbsp;Autumn</option>
					<option value="2602">&nbsp;&nbsp;&nbsp;Back to School</option>
					<option value="2603">&nbsp;&nbsp;&nbsp;Christmas</option>
					<option value="2604">&nbsp;&nbsp;&nbsp;Easter</option>
					<option value="2605">&nbsp;&nbsp;&nbsp;Father's Day</option>
					<option value="2606">&nbsp;&nbsp;&nbsp;Halloween</option>
					<option value="2607">&nbsp;&nbsp;&nbsp;Mother's Day</option>
					<option value="2608">&nbsp;&nbsp;&nbsp;Spring</option>
					<option value="2609">&nbsp;&nbsp;&nbsp;Summer</option>
					<option value="2610">&nbsp;&nbsp;&nbsp;Tax Season</option>
					<option value="2611">&nbsp;&nbsp;&nbsp;Valentine's Day</option>
					<option value="2612">&nbsp;&nbsp;&nbsp;Winter</option>
					<option value="27">Shops/Malls</option>
					<option value="2701">&nbsp;&nbsp;&nbsp;Virtual Malls</option>
					<option value="28">Sports : Fitness</option>
					<option value="2801">&nbsp;&nbsp;&nbsp;Apparel</option>
					<option value="2802">&nbsp;&nbsp;&nbsp;Collectibles and
						Memorabilia</option>
					<option value="2803">&nbsp;&nbsp;&nbsp;Equipment</option>
					<option value="2804">&nbsp;&nbsp;&nbsp;Exercise : Health</option>
					<option value="2805">&nbsp;&nbsp;&nbsp;Golf</option>
					<option value="2806">&nbsp;&nbsp;&nbsp;Professional Sports
						Organizations</option>
					<option value="2807">&nbsp;&nbsp;&nbsp;Sports</option>
					<option value="2808">&nbsp;&nbsp;&nbsp;Summer Sports</option>
					<option value="2809">&nbsp;&nbsp;&nbsp;Water Sports</option>
					<option value="2810">&nbsp;&nbsp;&nbsp;Winter Sports</option>
					<option value="29">Telecommunications</option>
					<option value="2901">&nbsp;&nbsp;&nbsp;Online/Wireless</option>
					<option value="2902">&nbsp;&nbsp;&nbsp;Phone Card Services</option>
					<option value="2903">&nbsp;&nbsp;&nbsp;Telephone Services</option>
					<option value="30">Travel</option>
					<option value="3001">&nbsp;&nbsp;&nbsp;Accessories</option>
					<option value="3002">&nbsp;&nbsp;&nbsp;Air</option>
					<option value="3003">&nbsp;&nbsp;&nbsp;Car</option>
					<option value="3004">&nbsp;&nbsp;&nbsp;Hotel</option>
					<option value="3005">&nbsp;&nbsp;&nbsp;Luggage</option>
					<option value="3006">&nbsp;&nbsp;&nbsp;Vacation</option>

			</select>
			</div>
			</td>
		</tr>
		<tr>
			<td colspan="2"><s:textfield type="text"
					cssClass="validate[required,custom[number]]" name="zone.width"
					size="10" maxlength="10" label="Largeur" class="form-control"/></td>
		</tr>
		<tr>
			<td colspan="2"><s:textfield type="text"
					cssClass="validate[required,custom[number]]" name="zone.height"
					size="10" maxlength="10" label="Hauteur" /></td>
		</tr>
		<tr>
			<td colspan="2" align="right"><input type="submit" value="Valider" class="btn btn-default"/> <input type="reset"
					value="Retablir" class="btn btn-default"/></td>
		</tr>
	</table>
</form>


