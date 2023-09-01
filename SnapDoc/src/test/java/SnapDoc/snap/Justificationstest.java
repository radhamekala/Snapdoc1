package SnapDoc.snap;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

public class Justificationstest extends TestBase {

	

	@Test
	public void justifi() throws InterruptedException {
		JS.justification();

		ExtentTest Test = extent.createTest("Add justifications in global");
	}

	@BeforeClass
	public void loginsnapdoc2() {
		LG.loginsnapdoc2();

		ExtentTest Test = extent.createTest("SnapDoc login page pasitive flow");

	}

	@AfterTest
	public void exreports() {
		extent.flush();
//		driver.quit();
	}
}
