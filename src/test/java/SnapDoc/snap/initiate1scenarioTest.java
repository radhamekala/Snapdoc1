package SnapDoc.snap;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

public class initiate1scenarioTest extends TestBase {
	@Test(priority = 1)

	public void loginsnapdoc2() throws InterruptedException {
		LG.loginsnapdoc2();
		ExtentTest Test = extent.createTest("SnapDoc login page pasitive flow");
	}

	@Test(priority = 2)

	public void Analytical() throws InterruptedException {
		IC.Analytical();
		ExtentTest Test = extent.createTest("open Analytical ");
	}

	@Test(priority = 3)

	public void initiate1() throws InterruptedException {
		IS.iniciation1();
		
		ExtentTest Test = extent.createTest("open Analytical ");
	}
	@Test(priority = 4)

	public void initiate2() throws InterruptedException {
		IS.initiatestatus();
//		IS.NonSignatoryReviewers1login();
		ExtentTest Test = extent.createTest("open Analytical ");
	}

}
