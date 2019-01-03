package com.aventstack.extentreports.pangea.model;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.google.gson.annotations.SerializedName;

public class PangeaTestCaseReport {
	private String testCaseName;
	private String status;
	private String failedApi = "NA";
	private String testStartDateTime;
	private String testEndDateTime;
	@SerializedName("apiDetails")
	private List<ApiDetails> apiDetailsList = new ArrayList<ApiDetails>();	
	public boolean equals(Object e) {
		if(e instanceof PangeaTestCaseReport) {
			return ((PangeaTestCaseReport)e).getTestCaseName().equals(getTestCaseName());
		}
		return false;
	}

	
	public static Comparator<PangeaTestCaseReport> testCaseReportComparator = new Comparator<PangeaTestCaseReport>() {

		@Override
		public int compare(PangeaTestCaseReport o1, PangeaTestCaseReport o2) {
			// TODO Auto-generated method stub
			String status1 = o1.getStatus();
			String status2 = o2.getStatus();
			return status1.compareTo(status2);
		}};
		
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