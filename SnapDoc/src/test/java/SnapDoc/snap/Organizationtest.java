package SnapDoc.snap;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

public class Organizationtest extends TestBase {
	@Test(priority=1)
	public void loginsnapdoc2() {
		LG.loginsnapdoc2();
		ExtentTest Login = extent.createTest("SnapDoc login page pasitive flow");
	}
	
	@Test(priority=1)
	public void organization() throws InterruptedException {
		OR.Organizations();
		ExtentTest org = extent.createTest("Admin to organization");
	
	}
	
	@Test(priority=3)
	public void location() {
		OR.Locationname();
		ExtentTest location = extent.createTest(" Location This field is required");

	}
	@Test(priority=4)
	public void Locationname1() throws InterruptedException {
		OR.Locationname1();
		ExtentTest location2 = extent.createTest(" location* Please fill the Block Code with 6-150 characters");

	}
	
	@Test(priority=5)
	public void Shortcode() throws InterruptedException {
		OR.Shortcode1();
		ExtentTest Shortcode = extent.createTest(" Short code This field is required");

	}
	@Test(priority=6)
	public void Shortcode2() throws InterruptedException {
		OR.Shortcode2();
		ExtentTest Shortcode2 = extent.createTest("Short code * Please fill the Block Code with 3-15 characters");

	}
	@Test(priority=7)
	public void Descriptions1() throws InterruptedException {
		OR.Descriptions();
		ExtentTest Descriptions = extent.createTest("Descriptions This field is required");

	}
	@Test(priority=8)
	public void Address() throws InterruptedException {
		OR.Address1();
		ExtentTest Address = extent.createTest("Address This field is required");

	}
	@Test(priority=9)
	public void Address2() throws InterruptedException {
		OR.Address2();
		ExtentTest Address2 = extent.createTest(" Address2 This field is required");

	}
	@Test(priority=9)
	public void Countrys() throws InterruptedException {
		OR.Country();
		ExtentTest Country = extent.createTest(" country This field is required");

	}
	
	
	
	@Test(priority=10)
	public void state() throws InterruptedException {
		OR.State();
		ExtentTest State = extent.createTest("state, city,zipcode");

	}
	
	@AfterTest
	public void exreports() {
		extent.flush();
//		driver.quit();
	}
		
}
