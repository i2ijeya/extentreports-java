package com.aventstack.extentreports.pangea.model;

public class ApiDetails {
	private String apiName;
	private String request;
	private String response;
	private String expectedResultReason;
	private String actualResultReason;
	private String status;
	private String testStartDateTime;
	private String testEndDateTime;
	
	public String getApiName() {
		return apiName;
	}
	public void setApiName(String apiName) {
		this.apiName = apiName;
	}
	public String getRequest() {
		return request;
	}
	public void setRequest(String request) {
		this.request = request;
	}
	public String getResponse() {
		return response;
	}
	public void setResponse(String response) {
		this.response = response;
	}
	public String getExpectedResultReason() {
		return expectedResultReason;
	}
	public void setExpectedResultReason(String expectedResultReason) {
		this.expectedResultReason = expectedResultReason;
	}
	public String getActualResultReason() {
		return actualResultReason;
	}
	public void setActualResultReason(String actualResultReason) {
		this.actualResultReason = actualResultReason;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getTestStartDateTime() {
		return testStartDateTime;
	}
	public void setTestStartDateTime(String testStartDateTime) {
		this.testStartDateTime = testStartDateTime;
	}
	public String getTestEndDateTime() {
		return testEndDateTime;
	}
	public void setTestEndDateTime(String testEndDateTime) {
		this.testEndDateTime = testEndDateTime;
	}
	
}
