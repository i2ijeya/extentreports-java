package com.aventstack.extentreports.pangea.model;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;

public class ReportUtil {
	
	public static void writeToreport() {
		
	}
	
	// 
	public synchronized void processProviderReport(ProviderReport providerReport, ConcurrentMap<String, List<ProviderReport>> providerPmidMap) {
		if(providerPmidMap.containsKey(providerReport.getProviderName())) {
//			ConcurrentMap<String, Map<String, List<PaymentMethodReport>>> temp = providerPmidMap.get(providerReport.getProviderPmidReport());
		}
		
	}

}
