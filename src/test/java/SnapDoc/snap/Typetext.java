package SnapDoc.snap;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

public class Typetext extends TestBase {
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
	public void Typecreation() throws InterruptedException {
		TP.Typecreation();
		ExtentTest Test = extent.createTest("Type creation");
	}

//	@Test(priority = 4)
//
//	public void Analytical() throws InterruptedException {
//		IC.Analytical();
//		ExtentTest Test = extent.createTest("open Analytical ");
//	}
//
//	@Test(priority = 5)
//	public void iniciation() throws InterruptedException {
//		IC.iniciation();
//		ExtentTest Test = extent.createTest("iniciation");
//	}
//
//	@Test(priority = 6)
//	public void Statuss() throws InterruptedException {
//		IC.Status();
//
//		ExtentTest Test = extent.createTest("Status checking and Reviewer Approved");
//	}
//	
//	@Test(priority = 7)
//	public void Revie() throws InterruptedException {
//		IC.Reviewer1();
//
//		ExtentTest Test = extent.createTest("Reviewer");
//	}
//	
	
//	@Test(priority =8 )
//	public void resubmit1() throws InterruptedException {   //if resubmit 
//		IC.adminresubmit();
//
//		ExtentTest Test = extent.createTest("Reviewer");
//	}
//	@Test(priority =9 )
//	public void Approveds() throws InterruptedException {   //if Approved 
//		IC.Approved();
//
//		ExtentTest Test = extent.createTest("Approved");
//	}

//	@Test(priority = 7)
//	public void Statuss2() throws InterruptedException {
//		IC.Status2();
//
//		ExtentTest Test = extent.createTest("Status checking After Reviewer and Approver  Approved");
//	}

}
