package SnapDoc.snap;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

public class Logintest extends TestBase {
	@Test
	public void loginsnapdoc2() {
		LG.loginsnapdoc2();
		ExtentTest Test = extent.createTest("SnapDoc login page pasitive flow");
	}
	@Test
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
