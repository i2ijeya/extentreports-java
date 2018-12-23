<script src="./parsejson.js" type='text/javascript'>
alert('Pangea test');
load();
</script>

<div id='showTenant' class='view'>
		<table>
			<thead>
				<tr>
					<th>Tenant Name</th>
					<th>Total Passed </th>
					<th>Total Failed </th>
					<th>Overall Status</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					 <#list report.getReport().getTenantReportList() as temp>
					 	<td><a href=${temp.getTenantName()}</td>
					 	<td>${temp.getPassCount()}</td>
					 	<td>${temp.getFailCount()}</td>
					 </#list>
				 </tr>
			</tbody>	
			</table>
		
		
		
</div>
<!-- test view -->
