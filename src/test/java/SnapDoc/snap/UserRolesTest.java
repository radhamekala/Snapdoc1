package SnapDoc.snap;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

public class UserRolesTest extends TestBase {
	@Test(priority=1)
	public void loginsnapdoc2() throws InterruptedException {
		LG.loginsnapdoc2();
		ExtentTest Test = extent.createTest("SnapDoc login page pasitive flow");
	}

	@Test(priority=2)
	public void Userroles() throws InterruptedException {
		UR.Roles();
		ExtentTest Test = extent.createTest("User Roles");
	}
	@Test(priority=3)
	public void Accessgroups() throws InterruptedException {
		UR.Accessgroup();
		ExtentTest Test = extent.createTest("User Access group");
	}
	@Test(priority=4)
	public void AccesspermissionS() throws InterruptedException {
		UR.Accesspermission();
		ExtentTest Test = extent.createTest("User Access group Permissions");
	}
	@Test(priority=5)
	public void Designationss() throws InterruptedException {
		UR.Designations();
		ExtentTest Test = extent.createTest("User Designations");
	}
	
	@AfterTest
	public void exreports() {
		extent.flush();
//		driver.quit();
	}
}
