package SnapDoc.snap;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

public class Type4Test extends TestBase {
	@Test(priority = 1)
	public void loginsnapdoc2() throws InterruptedException {
		LG.loginsnapdoc2();
		ExtentTest Test = extent.createTest("SnapDoc login page pasitive flow");
	}

	@Test(priority = 2)
	public void Classificationss() throws InterruptedException {
		TP.Classifications();
		ExtentTest Test = extent.createTest("Classifications");
	}

	@Test(priority = 3)
	public void Typecreations() throws InterruptedException {
		T4.type4();
		ExtentTest Test = extent.createTest("Type creation");
	}
	@Test(priority = 4)

	public void Analytical() throws InterruptedException {
		IC.Analytical();
		ExtentTest Test = extent.createTest("open Analytical ");
	}

	@Test(priority = 5)
	public void Typecreations1() throws InterruptedException {
		T4.initiate4();
		ExtentTest Test = extent.createTest("Type creation");
	}
	@Test(priority = 6)
	public void Statuus() throws InterruptedException {
		T4.status4();
		ExtentTest Test = extent.createTest("Status");
	}
//	@Test(priority = 6)
//	public void Status() throws InterruptedException {
//		T4.view();
//		ExtentTest Test = extent.createTest("Status");
//	}
	
//	@Test(priority = 8)
//	public void Reviewer1Login() throws InterruptedException {
//		IC.Reviewers1login();
//
//		ExtentTest Test = extent.createTest("Reviewer 1 Log in ");
//	}
//	@Test(priority = 9)
//	public void Approveds() throws InterruptedException { // if Approved
//		T4.Approved();
//
//		ExtentTest Test = extent.createTest("Reviewer 1 Decision == Approve");
//	}
//	@Test(priority = 10)
//	public void Reviewer2login() throws InterruptedException { // Reviewer 2 login
//		T4.Reviewer2Login();
//
//		ExtentTest Test = extent.createTest("Reviewer 2 Login");
//	}
//	@Test(priority = 11)
//	public void Approveds3() throws InterruptedException { // if Approved
//		T4.Approved();
//
//		ExtentTest Test = extent.createTest("Reviewer 1 Decision == Approve");
//	}
}
