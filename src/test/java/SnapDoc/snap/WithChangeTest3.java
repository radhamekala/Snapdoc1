package SnapDoc.snap;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

public class WithChangeTest3 extends TestBase{
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
		WC3.Withchangeautouserbased(); 
	}
	@Test(priority = 4)
	public void Analytical() throws InterruptedException {
		IC.Analytical();
		ExtentTest Test = extent.createTest("open Analytical ");
	}
	@Test(priority = 5)

	public void controls() throws InterruptedException {
		WC3.withchangeAuto();
		ExtentTest Test = extent.createTest("Document initiate");
	}
	@Test(priority = 6)

	public void Docinfos() throws InterruptedException {
		WC3.docinfo();
		WC3.status();
		ExtentTest Test = extent.createTest("Document info checking");
	}
	@Test(priority = 7)
	public void NONsignatory() throws InterruptedException {
		WC3.NonSigntoryLogin();
		ExtentTest Test = extent.createTest("NonSignatory Login");
	}
	@Test(priority = 8)
	public void Nonsignatoryapprove() throws InterruptedException {
		WC3.NonsignatoryApprove();
		ExtentTest Test = extent.createTest("Nonsignatoty approve");
	}
	@Test(priority = 9)
	public void Reviewerlogins() throws InterruptedException {
		WC3.Reviewer1Login();
		ExtentTest Test = extent.createTest("Reviewer login");
	}
	@Test(priority = 10)
	public void Reviewer1Approves() throws InterruptedException {
		WC3.Reviewer1Resubmit();
		ExtentTest Test = extent.createTest("Reviewer Approve");
	}	
}
