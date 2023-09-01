package SnapDoc.snap;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

public class AddUsertest extends TestBase{
	@Test(priority=1)
	public void loginsnapdoc2() throws InterruptedException {
		LG.loginsnapdoc2();
		ExtentTest Test = extent.createTest("SnapDoc login page pasitive flow");
	}
	@Test(priority=2)
	public void Adduser() throws InterruptedException {
		AU.Adduser();
		ExtentTest Test = extent.createTest("Add user");
	}
	
//	@Test(priority=2)
//	public void just() throws InterruptedException {
//		AU.Justifi1();
//		ExtentTest Test = extent.createTest("Justification");
//	}
//	
	
}
