package com.aventstack.extentreports.pangea.model;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;

import com.google.gson.annotations.SerializedName;

public class PangeaPaymentMethodReport {
	
	@SerializedName("apis")
	private List<PangeaTestCaseReport> testCaseReport = new ArrayList<PangeaTestCaseReport>();
	private String pmidName;
	private int passCount;
	private int failCount;
	private int totalCount;
	private String overallStatus;
	
	public boolean equals(Object e) {
		if(e instanceof PangeaPaymentMethodReport) {
			return ((PangeaPaymentMethodReport)e).getPmidName().equals(getPmidName());
		}
		return false;
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

	public List<PangeaTestCaseReport> getTestCaseReport() {
		return testCaseReport;
	}

	public void setTestCaseReport(List<PangeaTestCaseReport> testCaseReport) {
		this.testCaseReport = testCaseReport;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	
}
