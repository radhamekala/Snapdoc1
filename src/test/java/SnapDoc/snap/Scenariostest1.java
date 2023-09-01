package SnapDoc.snap;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

public class Scenariostest1 extends TestBase {

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
	public void changecontrol1() throws InterruptedException {
		S1.ChangeControl();

	}
//	@Test(priority = 4)
//
//	public void Analytical() throws InterruptedException {
//		IC.Analytical();
//		ExtentTest Test = extent.createTest("open Analytical ");
//	}
//	@Test(priority = 5)
//
//	public void Initi() throws InterruptedException {
//		S1.initiatE();
//		ExtentTest Test = extent.createTest("Initiate Document with change document ");
//	}
//	
//	@Test(priority = 6)
//
//	public void statuS() throws InterruptedException {
//		S1.changeStatus();
//		ExtentTest Test = extent.createTest("ST ");
//	}
//	
	
	
	
	
}
