package SnapDoc.snap;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

public class EmailCheckingTest extends TestBase {
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
	public void iniciations() throws InterruptedException, AWTException, IOException {
		EC.Documentinitiate();
		ExtentTest Test = extent.createTest("iniciation");
	}	
}
