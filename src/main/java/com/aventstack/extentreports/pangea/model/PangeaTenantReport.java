package com.aventstack.extentreports.pangea.model;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;

public class PangeaTenantReport {
	
	@SerializedName("providers")
	private List<PangeaProviderReport> providerReportList = new ArrayList<PangeaProviderReport>();
	private String tenantName;
	private int passCount;
	private int failCount;
	private int skippedCount;
	private int totalCount;
	private String overallStatus;
	
	
	public boolean equals(Object e) {
		if(e instanceof PangeaTenantReport) {
			return ((PangeaTenantReport)e).getTenantName().equals(getTenantName());
		}
		return false;
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
	public List<PangeaProviderReport> getProviderReportList() {
		return providerReportList;
	}
	public void setProviderReportList(List<PangeaProviderReport> providerReportList) {
		this.providerReportList = providerReportList;
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

}