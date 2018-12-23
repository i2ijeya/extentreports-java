package com.aventstack.extentreports.pangea.model;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;

public class TenantReport {
	
	ConcurrentMap<String, Map<String, List<ProviderReport>>> tenantProviderReport; // Tenant Name, Provider
	
	@SerializedName("providers")
	List<ProviderReport> providerReportList = new ArrayList<ProviderReport>();
	
	String tenantName;
	int passCount;
	int failCount;
	int totalCount;
	String overallStatus;
	
	
	public boolean equals(Object e) {
		if(e instanceof TenantReport) {
			return ((TenantReport)e).getTenantName().equals(getTenantName());
		}
		return false;
	}
	
	public ConcurrentMap<String, Map<String, List<ProviderReport>>> getTenantProviderReport() {
		return tenantProviderReport;
	}
	public void setTenantProviderReport(ConcurrentMap<String, Map<String, List<ProviderReport>>> tenantProviderReport) {
		this.tenantProviderReport = tenantProviderReport;
	}
	public String getTenantName() {
		return tenantName;
	}
	public void setTenantName(String tenantName) {
		this.tenantName = tenantName;
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
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	public List<ProviderReport> getProviderReportList() {
		return providerReportList;
	}
	public void setProviderReportList(List<ProviderReport> providerReportList) {
		this.providerReportList = providerReportList;
	}

	public String getOverallStatus() {
		return overallStatus;
	}

	public void setOverallStatus(String overallStatus) {
		this.overallStatus = overallStatus;
	}
	

}