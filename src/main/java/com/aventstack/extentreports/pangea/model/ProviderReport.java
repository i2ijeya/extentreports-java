package com.aventstack.extentreports.pangea.model;



import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;

import com.google.gson.annotations.SerializedName;

public class ProviderReport {
	ConcurrentMap<String, Map<String, List<PaymentMethodReport>>> providerPmidReport; 
	
	@SerializedName("paymentMethods")
	List<PaymentMethodReport> paymentMethodReportList = new ArrayList<PaymentMethodReport>();
	String providerName;
	int passCount;
	int failCount;
	int total;
	String overallStatus;
	
	
	public boolean equals(Object e) {
		if(e instanceof ProviderReport) {
			return ((ProviderReport)e).getProviderName().equals(getProviderName());
		}
		return false;
	}
	
	public List<PaymentMethodReport> getPaymentMethodReportList() {
		return paymentMethodReportList;
	}
	public void setPaymentMethodReportList(List<PaymentMethodReport> paymentMethodReportList) {
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
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}

	public String getOverallStatus() {
		return overallStatus;
	}

	public void setOverallStatus(String overallStatus) {
		this.overallStatus = overallStatus;
	}
	
}
