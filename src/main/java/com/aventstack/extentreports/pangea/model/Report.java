package com.aventstack.extentreports.pangea.model;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

public class Report {
	
	private Report() {
		
	}
	
	private static Report report = null; 

	public static Report getInstance() {
		if(report == null) {
			return new Report();
		}
		return report;
	}
	
	@SerializedName("tenants")
	private List<TenantReport> tenantReportList = new ArrayList<TenantReport>();
	private int totalTestCase;
	private int totalPassed;
	private int totalFailed;
	public List<TenantReport> getTenantReportList() {
		return tenantReportList;
	}
	public void setTenantReportList(List<TenantReport> tenantReportList) {
		this.tenantReportList = tenantReportList;
	}
	public int getTotalTestCase() {
		return totalTestCase;
	}
	public void setTotalTestCase(int totalTestCase) {
		this.totalTestCase = totalTestCase;
	}
	public int getTotalPassed() {
		return totalPassed;
	}
	public void setTotalPassed(int totalPassed) {
		this.totalPassed = totalPassed;
	}
	public int getTotalFailed() {
		return totalFailed;
	}
	public void setTotalFailed(int totalFailed) {
		this.totalFailed = totalFailed;
	}
	
}
