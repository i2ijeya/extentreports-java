package com.aventstack.extentreports.pangea.model;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;

import com.google.gson.annotations.SerializedName;

public class PaymentMethodReport {
	ConcurrentMap<String, Map<String, List<ApiTestCaseReport>>> pmidAPI;
	
	@SerializedName("apis")
	List<ApiTestCaseReport> apiTestCaseReportList = new ArrayList<ApiTestCaseReport>();
	String pmidName;
	int passCount;
	int failCount;
	int total;
	String overallStatus;
	
	public boolean equals(Object e) {
		if(e instanceof PaymentMethodReport) {
			return ((PaymentMethodReport)e).getPmidName().equals(getPmidName());
		}
		return false;
	}

	public List<ApiTestCaseReport> getApiTestCaseReportList() {
		return apiTestCaseReportList;
	}
	public void setApiTestCaseReportList(List<ApiTestCaseReport> apiTestCaseReportList) {
		this.apiTestCaseReportList = apiTestCaseReportList;
	}
	public ConcurrentMap<String, Map<String, List<ApiTestCaseReport>>> getPmidAPI() {
		return pmidAPI;
	}
	public void setPmidAPI(ConcurrentMap<String, Map<String, List<ApiTestCaseReport>>> pmidAPI) {
		this.pmidAPI = pmidAPI;
	}
	public int getPassCount() {
		return passCount;
	}
	public void setPassCount(int passCount) {
		this.passCount = passCount;
	}
	public int getFailCount() {
		return failCount;
	}
	public void setFailCount(int failCount) {
		this.failCount = failCount;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public String getPmidName() {
		return pmidName;
	}
	public void setPmidName(String pmidName) {
		this.pmidName = pmidName;
	}

	public String getOverallStatus() {
		return overallStatus;
	}

	public void setOverallStatus(String overallStatus) {
		this.overallStatus = overallStatus;
	}
	
}
