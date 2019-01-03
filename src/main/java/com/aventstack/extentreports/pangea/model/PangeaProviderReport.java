package com.aventstack.extentreports.pangea.model;



import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;

import com.google.gson.annotations.SerializedName;

public class PangeaProviderReport {
	ConcurrentMap<String, Map<String, List<PaymentMethodReport>>> providerPmidReport; 
	
	@SerializedName("paymentMethods")
	private List<PangeaPaymentMethodReport> paymentMethodReportList = new ArrayList<PangeaPaymentMethodReport>();
	private String providerName;
	private int passCount;
	private int failCount;
	private int skippedCount;
	private int totalCount;
	private String overallStatus;
	private String testStartDateTime;
	private String testEndDateTime;
	
	
	public static Comparator<PangeaProviderReport> providerReportComparator = new Comparator<PangeaProviderReport>() {

		@Override
		public int compare(PangeaProviderReport o1, PangeaProviderReport o2) {
			// TODO Auto-generated method stub
			String status1 = o1.getOverallStatus();
			String status2 = o2.getOverallStatus();
			return status1.compareTo(status2);
		}};
	
	public boolean equals(Object e) {
		if(e instanceof PangeaProviderReport) {
			return ((PangeaProviderReport)e).getProviderName().equals(getProviderName());
		}
		return false;
	}
	
	public List<PangeaPaymentMethodReport> getPaymentMethodReportList() {
		return paymentMethodReportList;
	}
	public void setPaymentMethodReportList(List<PangeaPaymentMethodReport> paymentMethodReportList) {
		this.paymentMethodReportList = paymentMethodReportList;
	}
	public String getProviderName() {
		return providerName;
	}
	public void setProviderName(String providerName) {
		this.providerName = providerName;
	}
	public ConcurrentMap<String, Map<String, List<PaymentMethodReport>>> getProviderPmidReport() {
		return providerPmidReport;
	}
	public void setProviderPmidReport(ConcurrentMap<String, Map<String, List<PaymentMethodReport>>> providerPmidReport) {
		this.providerPmidReport = providerPmidReport;
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
	public String getOverallStatus() {
		return overallStatus;
	}
	public void setOverallStatus(String overallStatus) {
		this.overallStatus = overallStatus;
	}

	public int getSkippedCount() {
		return skippedCount;
	}

	public void setSkippedCount(int skippedCount) {
		this.skippedCount = skippedCount;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
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
