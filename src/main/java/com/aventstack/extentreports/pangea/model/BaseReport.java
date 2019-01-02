package com.aventstack.extentreports.pangea.model;

import java.util.Date;

public class BaseReport {
	private String projectName;
	private String jobId;
	private String environment;
	private String successCount;
	private String failCount;
	private String skippedCount;
	private Date testStartTime;
	private Date testEndTime;
	private String overallStatus;
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

	public String getSuccessCount() {
		return successCount;
	}

	public void setSuccessCount(String successCount) {
		this.successCount = successCount;
	}

	public String getFailCount() {
		return failCount;
	}

	public void setFailCount(String failCount) {
		this.failCount = failCount;
	}

	public String getSkippedCount() {
		return skippedCount;
	}

	public void setSkippedCount(String skippedCount) {
		this.skippedCount = skippedCount;
	}

	public Date getTestStartTime() {
		return testStartTime;
	}

	public void setTestStartTime(Date testStartTime) {
		this.testStartTime = testStartTime;
	}

	public Date getTestEndTime() {
		return testEndTime;
	}

	public void setTestEndTime(Date testEndTime) {
		this.testEndTime = testEndTime;
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

}