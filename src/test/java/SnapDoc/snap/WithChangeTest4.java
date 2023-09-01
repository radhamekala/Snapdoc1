package SnapDoc.snap;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

public class WithChangeTest4 extends TestBase{
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
	public void withchange() throws InterruptedException {
		WC4.Withchangeautouserbased(); 
	}
	@Test(priority = 4)
	public void Analytical() throws InterruptedException {
		IC.Analytical();
		ExtentTest Test = extent.createTest("open Analytical ");
	}
	@Test(priority = 5)

	public void controls() throws InterruptedException {
		WC4.withchangeAuto();
		ExtentTest Test = extent.createTest("Document initiate");
	}
	@Test(priority = 6)

	public void Docinfos() throws InterruptedException {
		WC4.docinfo();
		WC4.status();
		ExtentTest Test = extent.createTest("Document info checking");
	}
	@Test(priority = 7)
	public void NONsignatory() throws InterruptedException {
		WC4.NonSigntoryLogin();
		ExtentTest Test = extent.createTest("NonSignatory Login");
	}
	@Test(priority = 8)
	public void Nonsignatoryapprove() throws InterruptedException {
		WC4.NonsignatoryApprove();
		ExtentTest Test = extent.createTest("Nonsignatoty approve");
	}
	@Test(priority = 9)
	public void Reviewerlogins() throws InterruptedException {
		WC4.Reviewer1Login();
		ExtentTest Test = extent.createTest("Reviewer login");
	}
	@Test(priority = 10)
	public void Reviewer1Approves() throws InterruptedException {
		WC4.Reviewer1Approve();
		ExtentTest Test = extent.createTest("Reviewer Approve");
	}	
	@Test(priority = 11)
	public void Approverlogins() throws InterruptedException {
		WC4.Approver1Login();
		ExtentTest Test = extent.createTest("Reviewer login");
	}
	@Test(priority = 12)
	public void Approver1Approves() throws InterruptedException {
		WC4.Approver1Resubmit();
		ExtentTest Test = extent.createTest("Reviewer Resubmit");
	}

}
