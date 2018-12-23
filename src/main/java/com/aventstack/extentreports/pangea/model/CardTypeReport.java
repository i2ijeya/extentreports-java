package com.aventstack.extentreports.pangea.model;

import java.util.Map;

public class CardTypeReport {
	Map<String, ProviderReport> providerReport;
	int passCount;
	int failCount;
	int total;
	String details;
	
	
	public Map<String, ProviderReport> getProviderReport() {
		return providerReport;
	}
	public void setProviderReport(Map<String, ProviderReport> providerReport) {
		this.providerReport = providerReport;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
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
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	
}