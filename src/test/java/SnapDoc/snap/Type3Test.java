package SnapDoc.snap;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

public class Type3Test extends TestBase {
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
		T3.type3();
		ExtentTest Test = extent.createTest("Type creation");
	}
}
