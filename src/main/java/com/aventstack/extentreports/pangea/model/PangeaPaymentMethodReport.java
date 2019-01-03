package com.aventstack.extentreports.pangea.model;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;

import com.google.gson.annotations.SerializedName;

public class PangeaPaymentMethodReport {
	
	@SerializedName("testCases")
	private List<PangeaTestCaseReport> testCaseReport = new ArrayList<PangeaTestCaseReport>();
	private String pmidName;
	private int passCount;
	private int failCount;
	private int totalCount;
	private String overallStatus;
	
	public static Comparator<PangeaPaymentMethodReport> paymentMethodReportComparator = new Comparator<PangeaPaymentMethodReport>() {

		@Override
		public int compare(PangeaPaymentMethodReport o1, PangeaPaymentMethodReport o2) {
			// TODO Auto-generated method stub
			String status1 = o1.getOverallStatus();
			String status2 = o2.getOverallStatus();
			return status1.compareTo(status2);
		}};
	
	
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
