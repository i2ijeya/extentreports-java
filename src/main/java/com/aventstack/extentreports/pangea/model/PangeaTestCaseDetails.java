package com.aventstack.extentreports.pangea.model;

import java.util.ArrayList;
import java.util.List;

public class PangeaTestCaseDetails {
	
	private List<ApiDetails> apiDetails = new ArrayList<ApiDetails>();
	private String severity;
	private String actualResultReason;
	private String expectedResultReason;
	private String overallStatus;
	private String failedApi;
	
	public String getSeverity() {
		return severity;
	}
	public void setSeverity(String severity) {
		this.severity = severity;
	}
	public String getActualResultReason() {
		return actualResultReason;
	}
	public void setActualResultReason(String actualResultReason) {
		this.actualResultReason = actualResultReason;
	}
	public String getExpectedResultReason() {
		return expectedResultReason;
	}
	public void setExpectedResultReason(String expectedResultReason) {
		this.expectedResultReason = expectedResultReason;
	}
	public List<ApiDetails> getApiDetails() {
		return apiDetails;
	}
	public void setApiDetails(List<ApiDetails> apiDetails) {
		this.apiDetails = apiDetails;
	}
	public String getOverallStatus() {
		return overallStatus;
	}
	public void setOverallStatus(String overallStatus) {
		this.overallStatus = overallStatus;
	}
	public String getFailedApi() {
		return failedApi;
	}
	public void setFailedApi(String failedApi) {
		this.failedApi = failedApi;
	}
	
}
