package com.aventstack.extentreports.pangea.model;

import java.util.ArrayList;
import java.util.List;

public class PangeaTestCaseReport {
	private String testCaseName;
	private List<ApiDetails> apiDetailsList = new ArrayList<ApiDetails>();
	private String status;
	private String failedApi;
	
	public boolean equals(Object e) {
		if(e instanceof PangeaTestCaseReport) {
			return ((PangeaTestCaseReport)e).getTestCaseName().equals(getTestCaseName());
		}
		return false;
	}

	public String getTestCaseName() {
		return testCaseName;
	}

	public void setTestCaseName(String testCaseName) {
		this.testCaseName = testCaseName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getFailedApi() {
		return failedApi;
	}

	public void setFailedApi(String failedApi) {
		this.failedApi = failedApi;
	}

	public List<ApiDetails> getApiDetailsList() {
		return apiDetailsList;
	}

	public void setApiDetailsList(List<ApiDetails> apiDetailsList) {
		this.apiDetailsList = apiDetailsList;
	}
}