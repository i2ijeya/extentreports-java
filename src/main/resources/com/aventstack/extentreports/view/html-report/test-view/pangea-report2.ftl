  <!-- Modal content -->

<div id="myModal" class="modal">

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
					<th>Overall Status</th>
				</tr>
			</thead>
			<tbody>
				<#assign json = report.getReportJson()>
				 <#list report.getReport().getTenantReportList() as tenant>
				 	<tr>
					 	<td> <a id=${tenant.getTenantName()} href=# onclick="showProviders();"> ${tenant.getTenantName()} </a></td>
					 	<td>${tenant.getPassCount()}</td>
					 	<td>${tenant.getFailCount()}</td>
				 	</tr>
				 </#list>
			</tbody>	
			</table>
</div>

<script>
	var idSplit = [];
	var modal = document.getElementById('myModal');
	var modalContent = document.getElementById('modalContent');
	
	// Get the button that opens the modal
	var btn = document.getElementById("myBtn");
	
	// Get the <span> element that closes the modal
	var span = document.getElementsByClassName("close")[0];
	
	
	
	// When the user clicks on the button, open the modal 
	function showProviders() {
		var report = ${json};
		var id = event.currentTarget.id;
		
		var headerRow =[];
  		var table = document.createElement('table');
  		//var thead = table.createTHead();
  		var tr = table.insertRow(-1);
  		
  		headerRow.push('Provider');
      	headerRow.push('Passed');
      	headerRow.push('Failed');
     	headerRow.push('Total');
     	
     	idSplit = id.split(":");
     	var rowValue = ['providerName', 'passCount', 'failCount', 'total'];
     	
     	for(var i=0;i<headerRow.length;i++) {
		    var th = document.createElement('th');
		    th.innerHTML=headerRow[i];
		    tr.appendChild(th);
		}
		
		for(var key in report.tenants) {
		    if(report.tenants[key]['tenantName'] == id) {
		      	for(var providerIndex in report.tenants[key]['providers']) {
			        var tableCell = tr.insertCell(-1);
			        tr = table.insertRow(-1);
			        for(var j=0;j<headerRow.length;j++) {
			          var tableCell = tr.insertCell(-1);
			          var anchor = document.createElement('a');
			          var href = document.createTextNode(report.tenants[key].providers[providerIndex][rowValue[j]]);
			          anchor.setAttribute('id', id+ ":" +report.tenants[key].providers[providerIndex][rowValue[0]]);
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
		var report = ${json};
		var id = event.currentTarget.id;
		
		var headerRow =[];
  		var table = document.createElement('table');
  		//var thead = table.createTHead();
  		var tr = table.insertRow(-1);
  		
  		headerRow.push('Pmid');
      	headerRow.push('Passed');
      	headerRow.push('Failed');
     	headerRow.push('Total');
     	
     	var rowValue = ['pmidName', 'passCount', 'failCount', 'total'];
     	idSplit = id.split(":");
     	
     	var selectedTenant = idSplit[0];
  		var selectedProvider = idSplit[1];
     	
     	for(var i=0;i<headerRow.length;i++) {
		    var th = document.createElement('th');
		    th.innerHTML=headerRow[i];
		    tr.appendChild(th);
		}
		
		for(var tenantIndex in report.tenants) {
		    if(report.tenants[tenantIndex].tenantName == selectedTenant) {
		      for(var providerIndex in report.tenants[tenantIndex].providers) {
		        if(report.tenants[tenantIndex].providers[providerIndex].providerName == selectedProvider) {
		          for(var pmidIndex in report.tenants[tenantIndex].providers[providerIndex].paymentMethods) {
		            var tableCell = tr.insertCell(-1);
		            tr = table.insertRow(-1);
		            for(var j=0;j<headerRow.length;j++) {
		              console.log('provider - ' + report.tenants[tenantIndex].providers[providerIndex].paymentMethods[pmidIndex][rowValue[j]]);
		              var tableCell = tr.insertCell(-1);
		              var anchor = document.createElement('a');
		              var href = document.createTextNode(report.tenants[tenantIndex].providers[providerIndex].paymentMethods[pmidIndex][rowValue[j]]);
		              anchor.setAttribute('id', selectedTenant + ":"+ selectedProvider + ":" + report.tenants[tenantIndex].providers[providerIndex].paymentMethods[pmidIndex][rowValue[0]]);
		              console.log('ID : '+id);
		              //anchor.onclick = showApis;
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
		for(i=0;i<idSplit.length;i++) {
			var li=document.createElement('li');
			li.innerHTML="<a href='#'>"+idSplit[i]+"</a>";
			ul.appendChild(li);
		}
		modalContent.appendChild(ul);
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
  content: "/\00a0";
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
