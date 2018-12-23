package com.aventstack.extentreports.pangea.model;

public class TestCaseDetails {
	public String request;
	public String response;
	public String reasonCode;
	public String severity;
	public String actualResultReason;
	public String expectedResultReason;
	
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
	public String getReasonCode() {
		return reasonCode;
	}
	public void setReasonCode(String reasonCode) {
		this.reasonCode = reasonCode;
	}
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
	
}
