package SnapDoc.snap;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

public class Departmentstest extends TestBase {
	@Test(priority = 1)
	public void loginsnapdoc2() throws InterruptedException {
		LG.loginsnapdoc2();
		ExtentTest Test = extent.createTest("SnapDoc login page pasitive flow");
	}

	@Test(priority = 2)
	public void DeparmentsN() throws InterruptedException {
		DR.Deparment1();
		ExtentTest Test = extent.createTest("Department Nagative flow ");
	}

	@Test(priority = 3)
	public void Deparment() throws InterruptedException {
		DR.department();
		ExtentTest Test = extent.createTest("Department Positive flow ");
	}
	@Test(priority = 4)
	public void Deparmentedit() throws InterruptedException {
		DR.Edit();
		ExtentTest Test = extent.createTest("Department Edit");
	}
	@Test(priority = 5)
	public void DepartmentView() throws InterruptedException {
		DR.ViewChange();
		ExtentTest Test = extent.createTest("Department Change view");
	}
	@Test(priority = 6)
	public void Deactivates() throws InterruptedException {
		DR.Deactivate();
		ExtentTest Test = extent.createTest("Department Deactivate");
	}
	@Test(priority = 7)
	public void Reactivates() throws InterruptedException {
		DR.Reactivate();
		ExtentTest Test = extent.createTest("Department Reactivate ");
	}
	
	
	@AfterTest
	public void exreports() {
		extent.flush();
//		driver.quit();
	}

}
