package SnapDoc.snap;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

public class TypeUserBasedTest extends TestBase{
	
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
//
//	@Test(priority = 3)
//	public void Typecreations() throws InterruptedException, AWTException, IOException {
//		TUB.Typecreation();
//		ExtentTest Test = extent.createTest("Type creation");
//	}
	@Test(priority = 4)
	public void Analytical() throws InterruptedException {
		IC.Analytical();
		ExtentTest Test = extent.createTest("open Analytical ");
	}
	
	@Test(priority = 5)
	public void initiate() throws InterruptedException, AWTException, IOException {
		TUB.Documentinitiate();
		ExtentTest Test = extent.createTest("Document initiation single document");
	}		
}
