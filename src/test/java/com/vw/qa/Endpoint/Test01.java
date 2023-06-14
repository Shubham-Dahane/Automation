package com.vw.qa.Endpoint;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Test01 {
	ExtentReports extent;

	@BeforeTest
	public void config() {
		String path = System.getProperty("user.dir") + "\\reports\\API Automation Results.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("API Automation Results");
		reporter.config().setDocumentTitle("API Automation Results");

		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Shubham Dahane");
	}

	@AfterTest
	public void Aftertest() {
		extent.flush();
	}

	@Test
	public void m1() {
		extent.createTest("m1");
		System.out.println("Test01 is pass");

	}
	@Test
	public void m2() {
		extent.createTest("m1");
		System.out.println("Test02 is pass");

	}

}
