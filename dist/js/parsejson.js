
var id = [];
var idSplit = [];
var tenantName = 'tenantName';
var report={
  "tenants": [
    {
      "providers": [
        {
          "paymentMethods": [
            {
              "apis": [
                {
                  "testCases": [
                    {
                      "testCaseName": "CC_PLC_Auth_Capture_Refund_UpTime_WALMART_US_GM_FirstData_VISA",
                      "passCount": 1,
                      "failCount": 0,
                      "testCaseDetails": {
                        "request": "{\n  \"instrument\" : {\n    \"credentials\" : {\n      \"credential1\" : \"111\",\n      \"iscredential1encrypted\" : false\n    },\n    \"pmid\" : \"VISA\",\n    \"expirydate\" : \"2025-12-21T00:00:00-08:00\",\n    \"pihash\" : \"PIH.ccdb.VISA.CREDITCARD.30160293.7777\"\n  },\n  \"amount\" : {\n    \"currencyAmount\" : 100,\n    \"currencyUnit\" : \"USD\"\n  },\n  \"language\" : \"eng_USA\",\n  \"testmode\" : \"N\",\n  \"clientreqid\" : \"Auth_VISA_WALMART_US_GM_6A5594A59DCB48A88D40BB03146BC93D\",\n  \"businesstype\" : \"ESTORE\",\n  \"partialok\" : \"N\"\n}",
                        "response": "{\n  \"entityErrors\" : [ ],\n  \"result\" : \"SUCCESS\",\n  \"version\" : \"v1\",\n  \"expires\" : \"5\",\n  \"resultreason\" : \"A101\",\n  \"clientreqid\" : \"Auth_VISA_WALMART_US_GM_6A5594A59DCB48A88D40BB03146BC93D\",\n  \"paymentpath\" : \"FirstData\",\n  \"paymentinfo\" : {\n    \"gtn\" : \"WBLP91P90006\",\n    \"paymenthandle\" : \"c8ad376f-fed9-423f-9631-38f8d8cabc2c\",\n    \"pihash\" : \"PIH.ccdb.VISA.CREDITCARD.30160293.7777\",\n    \"amountpromised\" : {\n      \"currencyAmount\" : 100,\n      \"currencyUnit\" : \"USD\"\n    },\n    \"amountsettled\" : {\n      \"currencyAmount\" : 0,\n      \"currencyUnit\" : \"USD\"\n    },\n    \"createddate\" : 1545342300297\n  },\n  \"referralinfo\" : {\n  },\n  \"approvalcode\" : \"329773\",\n  \"paymentmodel\" : \"ACM\",\n  \"credentialcheck1\" : {\n    \"code\" : \"CRY\",\n    \"providercode\" : \"M\"\n  },\n  \"credentialcheck2\" : {\n  },\n  \"credentialcheck3\" : {\n  },\n  \"credentialcheck4\" : {\n  },\n  \"credentialcheck5\" : {\n  },\n  \"idcredentialcheck\" : {\n    \"code\" : \"CRO\"\n  },\n  \"addresscheck\" : {\n    \"code\" : \"AVSEN\",\n    \"providercode\" : \"\"\n  }\n}",
                        "actualResultReason": "A101",
                        "expectedResultReason": "A101"
                      }
                    }
                  ],
                  "apiName": "auth_put",
                  "passCount": 0,
                  "failCount": 0
                },
                {
                  "testCases": [
                    {
                      "testCaseName": "CC_PLC_Auth_Capture_Refund_UpTime_WALMART_US_GM_FirstData_VISA",
                      "passCount": 1,
                      "failCount": 0,
                      "testCaseDetails": {
                        "request": "{\n  \"amount\" : {\n    \"currencyAmount\" : 100,\n    \"currencyUnit\" : \"USD\"\n  },\n  \"clientreqid\" : \"Collect_WALMART_US_GM_FE6154F42D9F43FCADC66B84111FED98\",\n  \"ordernumber\" : \"Collect_OrderNumber_FE6154F42D9F43FCADC66B84111FED98\",\n  \"endpointparams\" : \"someString\",\n  \"clientmatcherid\" : \"Collect_ClientMatcherId_FE6154F42D9F43FCADC66B84111FED98\"\n}",
                        "response": "{\n  \"entityErrors\" : [ ],\n  \"result\" : \"SUCCESS\",\n  \"version\" : \"v1\",\n  \"resultreason\" : \"S102\",\n  \"clientreqid\" : \"Collect_WALMART_US_GM_FE6154F42D9F43FCADC66B84111FED98\",\n  \"paymentpath\" : \"FirstData\",\n  \"paymentinfo\" : {\n    \"gtn\" : \"WBLP91P90006\",\n    \"paymenthandle\" : \"c8ad376f-fed9-423f-9631-38f8d8cabc2c\",\n    \"pihash\" : \"PIH.ccdb.VISA.CREDITCARD.30160293.7777\",\n    \"amountpromised\" : {\n      \"currencyAmount\" : 100,\n      \"currencyUnit\" : \"USD\"\n    },\n    \"amountsettled\" : {\n      \"currencyAmount\" : 100,\n      \"currencyUnit\" : \"USD\"\n    },\n    \"createddate\" : 1545342301518\n  },\n  \"isauthexpired\" : \"N\"\n}",
                        "actualResultReason": "S102",
                        "expectedResultReason": "S102"
                      }
                    }
                  ],
                  "apiName": "collect",
                  "passCount": 0,
                  "failCount": 0
                },
                {
                  "testCases": [
                    {
                      "testCaseName": "CC_PLC_Auth_Capture_Refund_UpTime_WALMART_US_GM_FirstData_VISA",
                      "passCount": 1,
                      "failCount": 0,
                      "testCaseDetails": {
                        "request": "{\n  \"amount\" : {\n    \"currencyAmount\" : 100,\n    \"currencyUnit\" : \"USD\"\n  },\n  \"clientreqid\" : \"Refund_WALMART_US_GM_CBF53921E1FD4072A1C973F77518D42B\",\n  \"ordernumber\" : \"Refund_OrderNumber_CBF53921E1FD4072A1C973F77518D42B\",\n  \"endpointparams\" : \"someString\",\n  \"clientmatcherid\" : \"Refund_ClientMatcherId_CBF53921E1FD4072A1C973F77518D42B\"\n}",
                        "response": "{\n  \"entityErrors\" : [ ],\n  \"result\" : \"SUCCESS\",\n  \"version\" : \"v1\",\n  \"resultreason\" : \"R100\",\n  \"clientreqid\" : \"Refund_WALMART_US_GM_CBF53921E1FD4072A1C973F77518D42B\",\n  \"paymentpath\" : \"FirstData\",\n  \"paymentinfo\" : {\n    \"gtn\" : \"WBLP91PC0007\",\n    \"paymenthandle\" : \"c8ad376f-fed9-423f-9631-38f8d8cabc2c\",\n    \"pihash\" : \"PIH.ccdb.VISA.CREDITCARD.30160293.7777\",\n    \"amountpromised\" : {\n      \"currencyAmount\" : 0,\n      \"currencyUnit\" : \"USD\"\n    },\n    \"amountsettled\" : {\n      \"currencyAmount\" : 0,\n      \"currencyUnit\" : \"USD\"\n    },\n    \"createddate\" : 1545342302547\n  },\n  \"requestedamount\" : {\n    \"currencyAmount\" : 100,\n    \"currencyUnit\" : \"USD\"\n  }\n}",
                        "actualResultReason": "R100",
                        "expectedResultReason": "R100"
                      }
                    }
                  ],
                  "apiName": "refund",
                  "passCount": 0,
                  "failCount": 0
                }
              ],
              "pmidName": "VISA",
              "passCount": 4,
              "failCount": 0,
              "total": 0
            }
          ],
          "providerName": "FirstData",
          "passCount": 3,
          "failCount": 0,
          "total": 0
        }
      ],
      "tenantName": "WALMART_US_GM",
      "passCount": 1,
      "failCount": 0,
      "totalCount": 0
    }
  ],
  "totalTestCase": 0,
  "totalPassed": 3,
  "totalFailed": 0
}
;
function load() {


// create table;

   var table = document.createElement('table');
   table.setAttribute("class", "border_class");
   var tr = table.insertRow(-1);


//Create Header row
var headerRow =[];

for(var key in report.tenants){
//console.log(schoolInfo.school[key]);
	if(report.tenants[key].hasOwnProperty('tenantName') && report.tenants[key].hasOwnProperty('passCount') && report.tenants[key].hasOwnProperty('failCount')
  && report.tenants[key].hasOwnProperty('totalCount') ){
  headerRow.push('tenantName');
  headerRow.push('passCount');
  headerRow.push('failCount');
  headerRow.push('totalCount');
  break;
  }
}
//Append Header row to to tr tage
for(var i=0;i<headerRow.length;i++) {
	var th = document.createElement('th');
	th.innerHTML=headerRow[i];
  tr.appendChild(th);
}

// Now Add header tr and  json data  to table


for(var key in report.tenants) {
    var tableCell = tr.insertCell(-1);
    tr.style= 'border: 1px solid #dddddd;text-align:left;padding: 15px;'
    tr = table.insertRow(-1);
    console.log('tenant Key - '+ key);
    for(var j=0;j<headerRow.length;j++) {
  	   var tableCell = tr.insertCell(-1);
       //tableCell.style=' border: solid 1px black;align:left'
       tableCell.style='  border: 1px solid #dddddd;text-align:left;padding: 15px;'
       var anchor = document.createElement('a');
       var href = document.createTextNode(report.tenants[key][headerRow[j]]);
      //  id[j] = report.tenants[key][headerRow[0]];
        anchor.setAttribute('id', report.tenants[key][headerRow[0]]);
       console.log('ID : '+id);
       anchor.onclick = showProvider;
       var x = anchor.appendChild(href);
       tableCell.innerHTML = "";
       tableCell.appendChild(anchor);
     }
}

var show =document.getElementById('show');

show.innerHTML="";
show.appendChild(table);
}

function showProvider(event) {
  var headerRow =[];
  var table = document.createElement('table');
  table.setAttribute("class", "border_class");
  var tr = table.insertRow(-1);
  // alert(event.target.id);
  for(var key in report.tenants[0].providers){
      if(report.tenants[0].providers[key].hasOwnProperty('providerName') && report.tenants[0].providers[key].hasOwnProperty('passCount') && report.tenants[0].providers[key].hasOwnProperty('failCount')
      && report.tenants[0].providers[key].hasOwnProperty('total') ){
      headerRow.push('providerName');
      headerRow.push('passCount');
      headerRow.push('failCount');
      headerRow.push('total');
      break;
      }
    }
  
  for(var i=0;i<headerRow.length;i++) {
    var th = document.createElement('th');
    th.innerHTML=headerRow[i];
    tr.appendChild(th);
  }


  for(var key in report.tenants) {
    if(report.tenants[key]['tenantName'] == event.target.id) {
      console.log('key - ' + report.tenants[key][tenantName]);
      for(var providerIndex in report.tenants[key]['providers']) {
        var tableCell = tr.insertCell(-1);
        tr.style= 'border: 1px solid #dddddd;text-align:left;padding: 15px;'
        tr = table.insertRow(-1);
        for(var j=0;j<headerRow.length;j++) {
          console.log('provider - ' + report.tenants[key].providers[providerIndex][headerRow[j]]);
          var tableCell = tr.insertCell(-1);
          //tableCell.style=' border: solid 1px black;align:left'
          tableCell.style='  border: 1px solid #dddddd;text-align:left;padding: 15px;'
          var anchor = document.createElement('a');
          var href = document.createTextNode(report.tenants[key].providers[providerIndex][headerRow[j]]);
          //  id[j] = report.tenants[key][headerRow[0]];
          anchor.setAttribute('id', event.target.id+ ":" +report.tenants[key].providers[providerIndex][headerRow[0]]);
          console.log('ID : '+id);
          anchor.onclick = showPaymentMethod;
          var x = anchor.appendChild(href);
          tableCell.innerHTML = "";
          tableCell.appendChild(anchor);
        }
      }
      break;
    }
  }

var show =document.getElementById('show');

show.innerHTML="";
show.appendChild(table);
}




function showPaymentMethod(event) {
  var headerRow =[];


  var table = document.createElement('table');
  table.setAttribute("class", "border_class");
  var tr = table.insertRow(-1);
  for(var key in report.tenants[0].providers[0].paymentMethods){
      if(report.tenants[0].providers[0].paymentMethods[key].hasOwnProperty('pmidName') && 
      report.tenants[0].providers[0].paymentMethods[key].hasOwnProperty('passCount') && 
      report.tenants[0].providers[0].paymentMethods[key].hasOwnProperty('failCount')
      && report.tenants[0].providers[0].paymentMethods[key].hasOwnProperty('total') ){
        headerRow.push('pmidName');
        headerRow.push('passCount');
        headerRow.push('failCount');
        headerRow.push('total');
        break;
      }
    }
  
  for(var i=0;i<headerRow.length;i++) {
    var th = document.createElement('th');
    th.innerHTML=headerRow[i];
    tr.appendChild(th);
  }

  idSplit = (event.target.id).split(":");

  var selectedTenant = idSplit[0];
  var selectedProvider = idSplit[1];

  for(var tenantIndex in report.tenants) {
    console.log(report.tenants[tenantIndex].tenantName == selectedTenant);
    if(report.tenants[tenantIndex].tenantName == selectedTenant) {
      for(var providerIndex in report.tenants[tenantIndex].providers) {
        if(report.tenants[tenantIndex].providers[providerIndex].providerName == selectedProvider) {
          for(var pmidIndex in report.tenants[tenantIndex].providers[providerIndex].paymentMethods) {
            var tableCell = tr.insertCell(-1);
            tr.style= 'border: 1px solid #dddddd;text-align:left;padding: 15px;'
            tr = table.insertRow(-1);
            for(var j=0;j<headerRow.length;j++) {
              console.log('provider - ' + report.tenants[tenantIndex].providers[providerIndex].paymentMethods[pmidIndex][headerRow[j]]);
              var tableCell = tr.insertCell(-1);
              //tableCell.style=' border: solid 1px black;align:left'
              tableCell.style='  border: 1px solid #dddddd;text-align:left;padding: 15px;'
              var anchor = document.createElement('a');
              var href = document.createTextNode(report.tenants[tenantIndex].providers[providerIndex].paymentMethods[pmidIndex][headerRow[j]]);
              //  id[j] = report.tenants[key][headerRow[0]];
              anchor.setAttribute('id', selectedTenant + ":"+ selectedProvider + ":" + report.tenants[tenantIndex].providers[providerIndex].paymentMethods[pmidIndex][headerRow[0]]);
              console.log('ID : '+id);
              anchor.onclick = showApis;
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

var show =document.getElementById('show');

show.innerHTML="";
show.appendChild(table);
}










function showApis(event) {
  var headerRow =[];


  var table = document.createElement('table');
  table.setAttribute("class", "border_class");
  var tr = table.insertRow(-1);
  for(var key in report.tenants[0].providers[0].paymentMethods[0].apis){
      if(report.tenants[0].providers[0].paymentMethods[0].apis[key].hasOwnProperty('apiName') && 
      report.tenants[0].providers[0].paymentMethods[0].apis[key].hasOwnProperty('passCount') && 
      report.tenants[0].providers[0].paymentMethods[0].apis[key].hasOwnProperty('failCount')) {
        headerRow.push('apiName');
        headerRow.push('passCount');
        headerRow.push('failCount');
        break;
      }
    }
  
  for(var i=0;i<headerRow.length;i++) {
    var th = document.createElement('th');
    th.innerHTML=headerRow[i];
    tr.appendChild(th);
  }

  idSplit = (event.target.id).split(":");

  var selectedTenant = idSplit[0];
  var selectedProvider = idSplit[1];
  var selectedPmid =  idSplit[2];

  for(var tenantIndex in report.tenants) {
    if(report.tenants[tenantIndex].tenantName == selectedTenant) {
      for(var providerIndex in report.tenants[tenantIndex].providers) {
        if(report.tenants[tenantIndex].providers[providerIndex].providerName == selectedProvider) {
          for(var pmidIndex in report.tenants[tenantIndex].providers[providerIndex].paymentMethods) {
            if(report.tenants[tenantIndex].providers[providerIndex].paymentMethods[pmidIndex].pmidName == selectedPmid) {
              for(var apiIndex in report.tenants[tenantIndex].providers[providerIndex].paymentMethods[pmidIndex].apis) {
                var tableCell = tr.insertCell(-1);
                tr.style= 'border: 1px solid #dddddd;text-align:left;padding: 15px;'
                tr = table.insertRow(-1);
                for(var j=0;j<headerRow.length;j++) {
                  var tableCell = tr.insertCell(-1);
                  //tableCell.style=' border: solid 1px black;align:left'
                  tableCell.style='  border: 1px solid #dddddd;text-align:left;padding: 15px;'
                  var anchor = document.createElement('a');
                  var href = document.createTextNode(report.tenants[tenantIndex].providers[providerIndex].paymentMethods[pmidIndex].apis[apiIndex][headerRow[j]]);
                  //  id[j] = report.tenants[key][headerRow[0]];
                  anchor.setAttribute('id', selectedTenant + ":"+ selectedProvider + ":" + selectedPmid + ":" +report.tenants[tenantIndex].providers[providerIndex].paymentMethods[pmidIndex].apis[apiIndex][headerRow[0]]);
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
      break;
    }
  }

var show =document.getElementById('show');

show.innerHTML="";
show.appendChild(table);
}


function showTestCases(event) {
  var headerRow =[];


  var table = document.createElement('table');
  table.setAttribute("class", "border_class");
  var tr = table.insertRow(-1);
  var testCasePrams = ['testCaseName', 'expectedResultReason', 'actualResultReason', 'status']
  headerRow.push('Test Case');
  headerRow.push('Expected Result');
  headerRow.push('Actual Result');
  headerRow.push('Status');
  
  for(var i=0;i<headerRow.length;i++) {
    var th = document.createElement('th');
    th.innerHTML=headerRow[i];
    tr.appendChild(th);
  }

  idSplit = (event.target.id).split(":");

  var selectedTenant = idSplit[0];
  var selectedProvider = idSplit[1];
  var selectedPmid =  idSplit[2];
  var selectedApi = idSplit[3];

  for(var tenantIndex in report.tenants) {
    if(report.tenants[tenantIndex].tenantName == selectedTenant) {
      for(var providerIndex in report.tenants[tenantIndex].providers) {
        if(report.tenants[tenantIndex].providers[providerIndex].providerName == selectedProvider) {
          for(var pmidIndex in report.tenants[tenantIndex].providers[providerIndex].paymentMethods) {
            if(report.tenants[tenantIndex].providers[providerIndex].paymentMethods[pmidIndex].pmidName == selectedPmid) {
              for(var apiIndex in report.tenants[tenantIndex].providers[providerIndex].paymentMethods[pmidIndex].apis) {
                if(report.tenants[tenantIndex].providers[providerIndex].paymentMethods[pmidIndex].apis[apiIndex].apiName == selectedApi) {
                  for(var testCaseIndex in report.tenants[tenantIndex].providers[providerIndex].paymentMethods[pmidIndex].apis[apiIndex].testCases) {
                    var tableCell = tr.insertCell(-1);
                      tr.style= 'border: 1px solid #dddddd;text-align:left;padding: 15px;'
                      tr = table.insertRow(-1);
                      for(var j=0;j<headerRow.length;j++) {
                        var tableCell = tr.insertCell(-1);
                        //tableCell.style=' border: solid 1px black;align:left'
                        tableCell.style='  border: 1px solid #dddddd;text-align:left;padding: 15px;'
                        var anchor = document.createElement('a');
                        var href = document.createTextNode(report.tenants[tenantIndex].providers[providerIndex].paymentMethods[pmidIndex].apis[apiIndex].testCases[testCaseIndex][headerRow[j]]);
                        //  id[j] = report.tenants[key][headerRow[0]];
                        anchor.setAttribute('id', selectedTenant + ":"+ selectedProvider + ":" + selectedPmid + ":" + selectedApi + ":" +report.tenants[tenantIndex].providers[providerIndex].paymentMethods[pmidIndex].apis[apiIndex].testCases[testCaseIndex].testCaseName);
                        console.log('ID : '+id);
                        anchor.onclick = showApis;
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
var show =document.getElementById('show');

show.innerHTML="";
show.appendChild(table);
}