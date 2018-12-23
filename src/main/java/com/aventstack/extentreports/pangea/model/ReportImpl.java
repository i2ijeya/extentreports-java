package com.aventstack.extentreports.pangea.model;

import java.util.List;

public class ReportImpl implements IReport{

	List<TenantReport> reports;
	
	@Override
	public List<TenantReport> getReport() {
		// TODO Auto-generated method stub
		return reports;
	}
	
	public void setReport(List<TenantReport> reports) {
		this.reports = reports;
	}

}