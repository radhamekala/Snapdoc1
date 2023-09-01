package SnapDoc.snap;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

public class Logintest extends TestBase {
	@Test(priority=2)
	public void loginsnapdoc2() throws InterruptedException {
		LG.loginsnapdoc2();
		ExtentTest Test = extent.createTest("SnapDoc login page pasitive flow");
	}
	@Test(priority=1)
	public void Logins() throws InterruptedException, IOException {
		LG.loginsnapdoc();
		ExtentTest Test = extent.createTest("loginsnapdoc  nagative flow");
	}
	@AfterTest
	public void exreports() {
		extent.flush();
		driver.quit();
	}
}
//Analytical
//Specification 
//Testing1
//Suri Madhu Chakri Ram siri sree
//sri madhu chakri
//ram suri siri