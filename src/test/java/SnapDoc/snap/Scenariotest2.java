package SnapDoc.snap;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

public class Scenariotest2 extends TestBase {
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
	public void Changeneeded() throws InterruptedException {    //designacedbased only
	S2.Changenedded();	
	ExtentTest Test = extent.createTest("Type -change needed only selected  all workflows Designation  Based  ");

	}

}
