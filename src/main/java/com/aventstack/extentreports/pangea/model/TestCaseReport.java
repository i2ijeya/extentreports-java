package com.aventstack.extentreports.pangea.model;


public class TestCaseReport {
	private String testCaseName;
	private String testData;
	private int passCount;
	private int failCount;
	private TestCaseDetails testCaseDetails;
	private String status;
	
	
	public boolean equals(Object e) {
		if(e instanceof TestCaseReport) {
			return ((TestCaseReport)e).getTestCaseName().equals(getTestCaseName());
		}
		return false;
	}

	public String getTestCaseName() {
		return testCaseName;
	}

	public void setTestCaseName(String testCaseName) {
		this.testCaseName = testCaseName;
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

	public String getTestData() {
		return testData;
	}

	public void setTestData(String testData) {
		this.testData = testData;
	}

	public TestCaseDetails getTestCaseDetails() {
		return testCaseDetails;
	}

	public void setTestCaseDetails(TestCaseDetails testCaseDetails) {
		this.testCaseDetails = testCaseDetails;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
