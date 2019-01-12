  <!-- Modal content -->

<div id="myModal" class="modal" data-modal-overflow="true">

  <!-- Modal content -->
  <div id="modalContent" class="modal-content">
	<span class="close">&times;</span>
  </div>
</div>

<div id='showTenant' class='view'>
		<table>
			<thead>
				<tr>
					<th>Tenant Name</th>
					<th>Total Passed </th>
					<th>Total Failed </th>
					<th>Total Skipped </th>
					<th>Total Test Case</th>
					<th>Overall Status</th>
				</tr>
			</thead>
			<tbody>
				<#assign json = report.getReportJson()>
				 <#list report.getReport().getReport().getTenantReportList() as tenant>
				 	<tr>
				 		
					 	<td> <a id=${tenant.getTenantName()} href=# onclick="showProviders();"> ${tenant.getTenantName()} </a></td>
					 	<td>${tenant.getPassCount()}</td>
					 	<td>${tenant.getFailCount()}</td>
					 	<td>${tenant.getSkippedCount()}</td>
					 	<td>${tenant.getTotalCount()}</td>
					 	<#if  tenant.getOverallStatus() == "FAIL">
					 		 <td style='color:#FF0000'>${tenant.getOverallStatus()}</td>
					 	<#else>
					 		<td  style='color:#026928'>${tenant.getOverallStatus()}</td>
					 	</#if>
				 	</tr>
				 </#list>
			</tbody>	
			</table>
</div>

<script>
	var report = ${json};
	var idSplit = [];
	var modal = document.getElementById('myModal');
	var modalContent = document.getElementById('modalContent');
	
	// Get the button that opens the modal
	var btn = document.getElementById("myBtn");
	
	// Get the <span> element that closes the modal
	var span = document.getElementsByClassName("close")[0];
	
	
	
	// When the user clicks on the button, open the modal 
	function showProviders() {
		// var report = ${json};
		var id = event.currentTarget.id;
		var headerRow =[];
  		var table = document.createElement('table');
  		//var thead = table.createTHead();
  		var tr = table.insertRow(-1);
  		
  		headerRow.push('Provider');
      	headerRow.push('Passed');
      	headerRow.push('Failed');
     	headerRow.push('Skipped');
     	headerRow.push('Total Test Cases');
     	headerRow.push('Overall Status');
     	
     	idSplit = id.split(":");
     	var rowValue = ['providerName', 'passCount', 'failCount', 'skippedCount', 'totalCount', 'overallStatus'];
     	
     	for(var i=0;i<headerRow.length;i++) {
		    var th = document.createElement('th');
		    th.innerHTML=headerRow[i];
		    tr.appendChild(th);
		}
		
		for(var key in report.report.tenants) {
		    if(report.report.tenants[key]['tenantName'] == id) {
		      	for(var providerIndex in report.report.tenants[key]['providers']) {
			        var tableCell = tr.insertCell(-1);
			        tr = table.insertRow(-1);
			        for(var j=0;j<headerRow.length;j++) {
			          var tableCell = tr.insertCell(-1);
			          var anchor = document.createElement('a');
			          var href = document.createTextNode(report.report.tenants[key].providers[providerIndex][rowValue[j]]);
			          anchor.setAttribute('id', id+ ":" +report.report.tenants[key].providers[providerIndex][rowValue[0]]);
			          console.log('Tenant Provider Id : '+id);
			          anchor.onclick = showPmids;
			          var x = anchor.appendChild(href);
			          tableCell.innerHTML = "";
			          tableCell.appendChild(anchor);
			        }
      		 	}
      			break;
    		}
  		}
		modalContent.innerHTML="";
		appendBreadcrumb(id);
		modalContent.appendChild(table);
		modal.style.display = "inline-block";
	}
	
	
	// When the user clicks on the button, open the modal 
	function showPmids() {
		// var report = ${json};
		var id = event.currentTarget.id;
		
		var headerRow =[];
  		var table = document.createElement('table');
  		//var thead = table.createTHead();
  		var tr = table.insertRow(-1);
  		
  		headerRow.push('Pmid');
      	headerRow.push('Passed');
      	headerRow.push('Failed');
     	headerRow.push('Total Test Cases');
     	headerRow.push('Overall Status');
     	
     	var rowValue = ['pmidName', 'passCount', 'failCount', 'totalCount', 'overallStatus'];
     	idSplit = id.split(":");
     	
     	var selectedTenant = idSplit[0];
  		var selectedProvider = idSplit[1];
     	
     	for(var i=0;i<headerRow.length;i++) {
		    var th = document.createElement('th');
		    th.innerHTML=headerRow[i];
		    tr.appendChild(th);
		}
		
		for(var tenantIndex in report.report.tenants) {
		    if(report.report.tenants[tenantIndex].tenantName == selectedTenant) {
		      for(var providerIndex in report.report.tenants[tenantIndex].providers) {
		        if(report.report.tenants[tenantIndex].providers[providerIndex].providerName == selectedProvider) {
		          for(var pmidIndex in report.report.tenants[tenantIndex].providers[providerIndex].paymentMethods) {
		            var tableCell = tr.insertCell(-1);
		            tr = table.insertRow(-1);
		            for(var j=0;j<headerRow.length;j++) {
		              console.log('provider - ' + report.report.tenants[tenantIndex].providers[providerIndex].paymentMethods[pmidIndex][rowValue[j]]);
		              var tableCell = tr.insertCell(-1);
		              var anchor = document.createElement('a');
		              var href = document.createTextNode(report.report.tenants[tenantIndex].providers[providerIndex].paymentMethods[pmidIndex][rowValue[j]]);
		              anchor.setAttribute('id', selectedTenant + ":"+ selectedProvider + ":" + report.report.tenants[tenantIndex].providers[providerIndex].paymentMethods[pmidIndex][rowValue[0]]);
		              console.log('ID : '+id);
		              anchor.onclick = showTestCases;
		              var x = anchor.appendChild(href);
		              tableCell.innerHTML = "";
		              tableCell.appendChild(anchor);
		            }
		          }
		          break;
		        }
		      }
		      break;
		    }
  		}
  		
		modalContent.innerHTML="";
		appendBreadcrumb(id);
		modalContent.appendChild(table);
		//modal.style.display = "inline-block";
	}
	
	function showTestCases() {
		//var report = ${json};
		var id = event.currentTarget.id;
		
		var headerRow =[];
  		var table = document.createElement('table');
  		//var thead = table.createTHead();
  		var tr = table.insertRow(-1);
		  
	  	headerRow.push('Test Case Name');
  		headerRow.push('Status');
  		headerRow.push('Failed Api');
		  
		for(var i=0;i<headerRow.length;i++) {
			var th = document.createElement('th');
		    th.innerHTML=headerRow[i];
		    tr.appendChild(th);
		}
		
		var rowValue = ['testCaseName', 'status', 'failedApi'];
     	idSplit = id.split(":");
		var selectedTenant = idSplit[0];
		var selectedProvider = idSplit[1];
		var selectedPmid =  idSplit[2];
		
		for(var tenantIndex in report.report.tenants) {
			if(report.report.tenants[tenantIndex].tenantName == selectedTenant) {
				for(var providerIndex in report.report.tenants[tenantIndex].providers) {
					if(report.report.tenants[tenantIndex].providers[providerIndex].providerName == selectedProvider) {
						for(var pmidIndex in report.report.tenants[tenantIndex].providers[providerIndex].paymentMethods) {
							if(report.report.tenants[tenantIndex].providers[providerIndex].paymentMethods[pmidIndex].pmidName == selectedPmid) {
								for(var testCaseIndex in report.report.tenants[tenantIndex].providers[providerIndex].paymentMethods[pmidIndex].testCases) {
									var tableCell = tr.insertCell(-1);
		                			tr = table.insertRow(-1);
		                			for(var j=0;j<headerRow.length;j++) {
			                			var tableCell = tr.insertCell(-1);
			                			var anchor = document.createElement('a');
			                			var href = document.createTextNode(report.report.tenants[tenantIndex].providers[providerIndex].paymentMethods[pmidIndex].testCases[testCaseIndex][rowValue[j]]);
			                			anchor.setAttribute('id', selectedTenant + ":"+ selectedProvider + ":" + selectedPmid + ":" +report.report.tenants[tenantIndex].providers[providerIndex].paymentMethods[pmidIndex].testCases[testCaseIndex][rowValue[0]]);
			                			console.log('ID : '+id);
			                  			anchor.onclick = showApiDetails;
			                  			var x = anchor.appendChild(href);
			                  			tableCell.innerHTML = "";
			                  			tableCell.appendChild(anchor);
									}
								}
								break;
							}
						}
						break;
					}
				}
				break;
			}
		}
		modalContent.innerHTML="";
		appendBreadcrumb(id);
		modalContent.appendChild(table);
		//modal.style.display = "inline-block";
	}
	
	
	
	function showApiDetails() {
		//var report = ${json};
		var id = event.currentTarget.id;
		
		var headerRow =[];
  		var table = document.createElement('table');
  		//var thead = table.createTHead();
  		var tr = table.insertRow(-1);
		  
	  	headerRow.push('Api');
  		headerRow.push('Expected Result Reason');
  		headerRow.push('Actual Result Reason');
  		headerRow.push('Status');
  		headerRow.push('Started At');
  		headerRow.push('Ends At');
		  
		for(var i=0;i<headerRow.length;i++) {
			var th = document.createElement('th');
		    th.innerHTML=headerRow[i];
		    tr.appendChild(th);
		}
		
		var rowValue = ['apiName', 'expectedResultReason', 'actualResultReason', 'status', 'testStartDateTime', 'testEndDateTime'];
     	idSplit = id.split(":");
		var selectedTenant = idSplit[0];
		var selectedProvider = idSplit[1];
		var selectedPmid =  idSplit[2];
		var selectedTestCase =  idSplit[3];
		
		for(var tenantIndex in report.report.tenants) {
			if(report.report.tenants[tenantIndex].tenantName == selectedTenant) {
				for(var providerIndex in report.report.tenants[tenantIndex].providers) {
					if(report.report.tenants[tenantIndex].providers[providerIndex].providerName == selectedProvider) {
						for(var pmidIndex in report.report.tenants[tenantIndex].providers[providerIndex].paymentMethods) {
							if(report.report.tenants[tenantIndex].providers[providerIndex].paymentMethods[pmidIndex].pmidName == selectedPmid) {
								for(var testCaseIndex in report.report.tenants[tenantIndex].providers[providerIndex].paymentMethods[pmidIndex].testCases) {
									if(report.report.tenants[tenantIndex].providers[providerIndex].paymentMethods[pmidIndex].testCases[testCaseIndex].testCaseName == selectedTestCase) {
										for(var apiDetailsIndex in report.report.tenants[tenantIndex].providers[providerIndex].paymentMethods[pmidIndex].testCases[testCaseIndex].apiDetails) {
											var tableCell = tr.insertCell(-1);
				                			tr = table.insertRow(-1);
				                			for(var j=0;j<headerRow.length;j++) {
					                			var tableCell = tr.insertCell(-1);
					                			//tableCell.setAttribute('style', 'color:#FF0000');
					                			var anchor = document.createElement('a');
					                			var href = document.createTextNode(report.report.tenants[tenantIndex].providers[providerIndex].paymentMethods[pmidIndex].testCases[testCaseIndex].apiDetails[apiDetailsIndex][rowValue[j]]);
					                			anchor.setAttribute('id', selectedTenant + ":"+ selectedProvider + ":" + selectedPmid + ":" + selectedTestCase+ ":"+ report.report.tenants[tenantIndex].providers[providerIndex].paymentMethods[pmidIndex].testCases[testCaseIndex].apiDetails[apiDetailsIndex][rowValue[0]]);
					                			console.log('ID : '+id);
					                  			anchor.onclick = showDetails;
					                  			var x = anchor.appendChild(href);
					                  			tableCell.innerHTML = "";
					                  			tableCell.appendChild(anchor);
											}
										}
										break;
									}
								}
								break;
							}
						}
						break;
					}
				}
				break;
			}
		}
		modalContent.innerHTML="";
		appendBreadcrumb(id);
		modalContent.appendChild(table);
		//modal.style.display = "inline-block";
	}
	
	function showDetails() {
		//var report = ${json};
		var id = event.currentTarget.id;
		
		var headerRow =[];
  		var table = document.createElement('table');
  		//var thead = table.createTHead();
  		var tr = table.insertRow(-1);
		  
	  	headerRow.push('Request');
		headerRow.push('Response');
		
		for(var i=0;i<headerRow.length;i++) {
			var th = document.createElement('th');
		    th.innerHTML=headerRow[i];
		    tr.appendChild(th);
		}
		
		var rowValue = ['request', 'response'];
     	idSplit = id.split(":");
		var selectedTenant = idSplit[0];
		var selectedProvider = idSplit[1];
		var selectedPmid =  idSplit[2];
		var selectedTestCase =  idSplit[3];
		var selectedApi = idSplit[4]
		
		for(var tenantIndex in report.report.tenants) {
			if(report.report.tenants[tenantIndex].tenantName == selectedTenant) {
				for(var providerIndex in report.report.tenants[tenantIndex].providers) {
					if(report.report.tenants[tenantIndex].providers[providerIndex].providerName == selectedProvider) {
						for(var pmidIndex in report.report.tenants[tenantIndex].providers[providerIndex].paymentMethods) {
							if(report.report.tenants[tenantIndex].providers[providerIndex].paymentMethods[pmidIndex].pmidName == selectedPmid) {
								for(var testCaseIndex in report.report.tenants[tenantIndex].providers[providerIndex].paymentMethods[pmidIndex].testCases) {
									if(report.report.tenants[tenantIndex].providers[providerIndex].paymentMethods[pmidIndex].testCases[testCaseIndex].testCaseName == selectedTestCase) {
										for(var apiDetailsIndex in report.report.tenants[tenantIndex].providers[providerIndex].paymentMethods[pmidIndex].testCases[testCaseIndex].apiDetails) {
											if(report.report.tenants[tenantIndex].providers[providerIndex].paymentMethods[pmidIndex].testCases[testCaseIndex].apiDetails[apiDetailsIndex].apiName == selectedApi) {
													var tableCell = tr.insertCell(-1);
						                			tr = table.insertRow(-1);
						                			for(var j=0;j<headerRow.length;j++) {
							                			var tableCell = tr.insertCell(-1);
							                			//tableCell.setAttribute('style', 'color:#FF0000');
							                			var anchor = document.createElement('a');
							                			var href = document.createTextNode(report.report.tenants[tenantIndex].providers[providerIndex].paymentMethods[pmidIndex].testCases[testCaseIndex].apiDetails[apiDetailsIndex][rowValue[j]]);
							                			anchor.setAttribute('id', selectedTenant + ":"+ selectedProvider + ":" + selectedPmid + ":" +report.report.tenants[tenantIndex].providers[providerIndex].paymentMethods[pmidIndex].testCases[testCaseIndex].apiDetails[apiDetailsIndex][rowValue[0]]);
							                			console.log('ID : '+id);
							                  			//anchor.onclick = showTestCases;
							                  			var x = anchor.appendChild(href);
							                  			tableCell.innerHTML = "";
							                  			tableCell.appendChild(anchor);
													}	
												break;
											}
										}
										break;
									}
								}
								break;
							}
						}
						break;
					}
				}
				break;
			}
		}
		modalContent.innerHTML="";
		appendBreadcrumb(id);
		modalContent.appendChild(table);
		//modal.style.display = "inline-block";
	}
	
	
	// When the user clicks on <span> (x), close the modal
	span.onclick = function() {
	  modal.style.display = "none";
	}
	
	// When the user clicks anywhere outside of the modal, close it
	window.onclick = function(event) {
	  if (event.target == modal) {
	    modal.style.display = "none";
	  }
	}
	
	function appendHeader(id) {
		var h = document.createElement("H1");
		var t = document.createTextNode(id);
		h.appendChild(t); 
		modalContent.appendChild(h);
	}
	
	function appendBreadcrumb(id) {
		var ul = document.createElement("ul");
		ul.setAttribute('class', 'breadcrumb');
		var breadcrumbID;
		for(i=0;i<idSplit.length;i++) {
			if(i==0) {
				breadcrumb = idSplit[i];
			} else {
				breadcrumb = breadcrumb + ":"+idSplit[i];
			}
			var li=document.createElement('li');
			li.innerHTML="<a id="+breadcrumb+" href='#' onclick='navigateBreadcrumb();'>"+idSplit[i]+"</a>";
			ul.appendChild(li);
		}
		console.log('id - '+ breadcrumbID);
		modalContent.appendChild(ul);
	}
	
	function navigateBreadcrumb() {
		id = event.currentTarget.id;
		idSplit = id.split(":");
		switch(idSplit.length) {
			case 1:
				showProviders();
				break;
			case 2:
				showPmids();
				break;
			case 3:
				showTestCases();
				break;
			case 4:
				showApiDetails();
				break;
			case 5:
				showDetails();
				break;
		}
		
	}
</script>

<style type="text/css">

/* The Modal (background) */
.modal {
  display: none; /* Hidden by default */
  position: fixed; /* Stay in place */
  z-index: 1; /* Sit on top */
  left: 0;
  top: 0;
  width: auto; /* Full width */
  height: 100%; /* Full height */
  overflow: auto; /* Enable scroll if needed */
  background-color: rgb(0,0,0); /* Fallback color */
  background-color: rgba(0,0,0,0.4); /* Black w/ opacity */
}

/* Modal Content/Box */
.modal-content {
  background-color: #fefefe;
  margin: 15% auto; /* 15% from the top and centered */
  padding: 20px;
  border: 1px solid #888;
  width: 80%; /* Could be more or less, depending on screen size */
}

/* The Close Button */
.close {
  color: #aaa;
  float: right;
  font-size: 28px;
  font-weight: bold;
}

.close:hover,
.close:focus {
  color: black;
  text-decoration: none;
  cursor: pointer;
}

/* Add Animation */
@-webkit-keyframes animatetop {
  from {top:-300px; opacity:0} 
  to {top:0; opacity:1}
}

@keyframes animatetop {
  from {top:-300px; opacity:0}
  to {top:0; opacity:1}
}

/* Style the list */
ul.breadcrumb {
  padding: 10px 16px;
  list-style: none;
  #background-color: #eee;
}

/* Display list items side by side */
ul.breadcrumb li {
  display: inline;
  font-size: 18px;
}

/* Add a slash symbol (/) before/behind each list item */
ul.breadcrumb li+li:before {
  padding: 8px;
  color: black;
  content: ">\00a0";
}

/* Add a color to all links inside the list */
ul.breadcrumb li a {
  color: #0275d8;
  text-decoration: none;
}

/* Add a color on mouse-over */
ul.breadcrumb li a:hover {
  color: #01447e;
  text-decoration: underline;
}

</style>
<!-- test view -->
