package SnapDoc.snap;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

public class WithChangeTest9 extends TestBase {
	@Test(priority = 1)
	public void loginsnapdoc2() throws InterruptedException {
		LG.loginsnapdoc2();
		ExtentTest Test = extent.createTest("SnapDoc login page pasitive flow");
	}
//	@Test(priority = 2)
//	public void Classificationss() throws InterruptedException {
//		TP.Classifications();
//		ExtentTest Test = extent.createTest("Classifications");
//	}
//	@Test(priority = 3)
//	public void withchange() throws InterruptedException {
//		WC9.Withchangeautouserbased(); 
//	}
	@Test(priority = 4)
	public void Analytical() throws InterruptedException {
		IC.Analytical();
		ExtentTest Test = extent.createTest("open Analytical ");
	}
	@Test(priority = 5)

	public void controls() throws InterruptedException {
		WC9.withchangeAuto();
		ExtentTest Test = extent.createTest("Document initiate");
	}
	@Test(priority = 6)

	public void Docinfos() throws InterruptedException {
		WC9.docinfo();
		WC9.status();
		ExtentTest Test = extent.createTest("Document info checking");
	}
	@Test(priority = 7)
	public void NONsignatory() throws InterruptedException {
		WC9.NonSigntoryLogin();
		ExtentTest Test = extent.createTest("NonSignatory Login");
	}
	@Test(priority = 8)
	public void Nonsignatoryapprove() throws InterruptedException {
		WC9.NonsignatoryResubmit();
		ExtentTest Test = extent.createTest("Nonsignatoty Reject");
	} 
}
