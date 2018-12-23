package com.aventstack.extentreports.pangea.model;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;

import com.google.gson.annotations.SerializedName;

public class ApiTestCaseReport {
	ConcurrentMap<String, Map<String, List<TestCaseReport>>>  testCaseAPIReport; // Test Case name, Details
	
	@SerializedName("testCases")
	List<TestCaseReport> testCaseReportList;
	String apiName;
	int passCount;
	int failCount;
	String overallStatus;
	
	public boolean equals(Object e) {
		if(e instanceof ApiTestCaseReport) {
			return ((ApiTestCaseReport)e).getApiName().equals(getApiName());
		}
		return false;
	}
	
	public List<TestCaseReport> getTestCaseReportList() {
		return testCaseReportList;
	}
	public void setTestCaseReportList(List<TestCaseReport> testCaseReportList) {
		this.testCaseReportList = testCaseReportList;
	}
	public String getApiName() {
		return apiName;
	}
	public void setApiName(String apiName) {
		this.apiName = apiName;
	}
	public ConcurrentMap<String, Map<String, List<TestCaseReport>>> getTestCaseAPIReport() {
		return testCaseAPIReport;
	}
	public void setTestCaseAPIReport(ConcurrentMap<String, Map<String, List<TestCaseReport>>> testCaseAPIReport) {
		this.testCaseAPIReport = testCaseAPIReport;
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


	public String getOverallStatus() {
		return overallStatus;
	}


	public void setOverallStatus(String overallStatus) {
		this.overallStatus = overallStatus;
	}

	
	
}
