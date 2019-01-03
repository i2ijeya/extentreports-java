package com.aventstack.extentreports.pangea.model;

public class BaseReport {
	private String projectName;
	private String jobId;
	private String environment;
	private int successCount;
	private int failCount;
	private int skippedCount;
	private String testStartTime;
	private String testEndTime;
	private String overallStatus;
	private int totalTestCases;
	private PangeaReport report;
	
	private static BaseReport baseReport = null; 
	
	public static BaseReport getInstance() {
		if(baseReport == null) {
			return new BaseReport();
		}
		return baseReport;
	}

	public String getEnvironment() {
		return environment;
	}

	public void setEnvironment(String environment) {
		this.environment = environment;
	}

	public int getSuccessCount() {
		return successCount;
	}

	public void setSuccessCount(int successCount) {
		this.successCount = successCount;
	}

	public int getFailCount() {
		return failCount;
	}

	public void setFailCount(int failCount) {
		this.failCount = failCount;
	}

	public int getSkippedCount() {
		return skippedCount;
	}

	public void setSkippedCount(int skippedCount) {
		this.skippedCount = skippedCount;
	}

	public String getOverallStatus() {
		return overallStatus;
	}

	public void setOverallStatus(String overallStatus) {
		this.overallStatus = overallStatus;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getJobId() {
		return jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	public PangeaReport getReport() {
		return report;
	}

	public void setReport(PangeaReport report) {
		this.report = report;
	}

	public String getTestStartTime() {
		return testStartTime;
	}

	public void setTestStartTime(String testStartTime) {
		this.testStartTime = testStartTime;
	}

	public String getTestEndTime() {
		return testEndTime;
	}

	public void setTestEndTime(String testEndTime) {
		this.testEndTime = testEndTime;
	}

	public int getTotalTestCases() {
		return totalTestCases;
	}

	public void setTotalTestCases(int totalTestCases) {
		this.totalTestCases = totalTestCases;
	}

}