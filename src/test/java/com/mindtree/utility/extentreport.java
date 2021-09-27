package com.mindtree.utility;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class extentreport {
	ExtentReports extent;
		public String extentreport() {
			String path = "Reports\\report.html";
			ExtentHtmlReporter reporter = new ExtentHtmlReporter(path);
			extent = new ExtentReports();
			extent.attachReporter(reporter);
			return path;
		}
	}