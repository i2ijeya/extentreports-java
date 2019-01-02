package com.aventstack.extentreports.pangea.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;

public class PangeaReport {
	
	private PangeaReport() {
		
	}
	
	private static PangeaReport report = null; 

	public static PangeaReport getInstance() {
		if(report == null) {
			return new PangeaReport();
		}
		return report;
	}
	
	@SerializedName("tenants")
	private List<PangeaTenantReport> tenantReportList = new ArrayList<PangeaTenantReport>();

	public List<PangeaTenantReport> getTenantReportList() {
		return tenantReportList;
	}
	public void setTenantReportList(List<PangeaTenantReport> tenantReportList) {
		this.tenantReportList = tenantReportList;
	}
}
