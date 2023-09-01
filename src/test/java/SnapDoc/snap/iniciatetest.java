package SnapDoc.snap;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

public class iniciatetest extends TestBase {
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
	public void iniciation() throws InterruptedException {
		IC.iniciation();
		ExtentTest Test = extent.createTest("iniciation");
	}

	@Test(priority = 4)
	public void Statuss() throws InterruptedException {
		IC.Status();

		ExtentTest Test = extent.createTest("Status checking and Reviewer Approved");
	}

	@Test(priority = 5)
	public void Reviewer1Login() throws InterruptedException {
		IC.Reviewers1login();

		ExtentTest Test = extent.createTest("Reviewer 1 Log in ");
	}

	@Test(priority = 6)
	public void Revie() throws InterruptedException {
		IC.Reviewer1();

		ExtentTest Test = extent.createTest("Reviewer 1 Decision == Resubmit");
	}

	@Test(priority = 7)
	public void resubmit1() throws InterruptedException { // if resubmit
		IC.adminresubmit();

		ExtentTest Test = extent.createTest("Admin Resubmit ");
	}

	@Test(priority = 8)
	public void Reviewer1Login2() throws InterruptedException {
		IC.Reviewers1login();

		ExtentTest Test = extent.createTest("Reviewer 1 Log in");
	}

	@Test(priority = 9)
	public void Approveds() throws InterruptedException { // if Approved
		IC.Approved();

		ExtentTest Test = extent.createTest("Reviewer 1 Decision == Approve");
	}

	@Test(priority = 10)
	public void Reviewer2login() throws InterruptedException { // Reviewer 2 login
		IC.Reviewer2Login();

		ExtentTest Test = extent.createTest("Reviewer 2 Login");
	}

	@Test(priority = 11)
	public void Revie2() throws InterruptedException {
		IC.Reviewer1();

		ExtentTest Test = extent.createTest("Reviewer2 Resubmitted");
	}

	@Test(priority = 12)
	public void resubmit2() throws InterruptedException { // if resubmit
		IC.adminresubmit();

		ExtentTest Test = extent.createTest("Admin Resubmit ");
	}

	@Test(priority = 13)
	public void Reviewer1Login3() throws InterruptedException {
		IC.Reviewers1login();

		ExtentTest Test = extent.createTest("Reviewer 1 Log in");
	}

	@Test(priority = 14)
	public void Approveds3() throws InterruptedException { // if Approved
		IC.Approved();

		ExtentTest Test = extent.createTest("Reviewer 1 Decision == Approve");
	}

	@Test(priority = 15)
	public void Reviewer2login2() throws InterruptedException { // Reviewer 2 login
		IC.Reviewer2Login();

		ExtentTest Test = extent.createTest("Reviewer 2 Login");
	}

	@Test(priority = 16)
	public void Approveds2() throws InterruptedException { // if Approved
		IC.Approved();

		ExtentTest Test = extent.createTest("Reviewer 2 Decision == Approve");
	}

	@Test(priority = 17)
	public void Reviewer3login1() throws InterruptedException { // Reviewer 2 login
		IC.Reviewer3Login();

		ExtentTest Test = extent.createTest("Reviewer 3 Login");
	}

	@Test(priority = 18)
	public void Revie3() throws InterruptedException {
		IC.Reviewer1();

		ExtentTest Test = extent.createTest("Reviewer3 Resubmitted");
	}

	@Test(priority = 19)
	public void resubmit3() throws InterruptedException { // if resubmit
		IC.adminresubmit();

		ExtentTest Test = extent.createTest("Admin Resubmit ");
	}

	@Test(priority = 20)
	public void Reviewer3Login2() throws InterruptedException {
		IC.Reviewers1login();

		ExtentTest Test = extent.createTest("Reviewer 1 Log in");
	}

	@Test(priority = 21)
	public void Approved3s1() throws InterruptedException { // if Approved
		IC.Approved();

		ExtentTest Test = extent.createTest("Reviewer 1 Decision == Approve");
	}

	@Test(priority = 22)
	public void Reviewer3login2() throws InterruptedException { // Reviewer 2 login
		IC.Reviewer2Login();

		ExtentTest Test = extent.createTest("Reviewer 2 Login");
	}

	@Test(priority = 23)
	public void Approved3s3() throws InterruptedException { // if Approved
		IC.Approved();

		ExtentTest Test = extent.createTest("Reviewer 2 Decision == Approve");
	}

	@Test(priority = 24)
	public void Reviewer3login3() throws InterruptedException { // Reviewer 2 login
		IC.Reviewer3Login();

		ExtentTest Test = extent.createTest("Reviewer 3 Login");
	}

	@Test(priority = 25)
	public void Approved3s4() throws InterruptedException { // if Approved
		IC.Approved();

		ExtentTest Test = extent.createTest("Reviewer 3 Decision == Approve");
	}

	@Test(priority = 26)
	public void Approvar1() throws InterruptedException { // if Approved
		IC.Approval1();

		ExtentTest Test = extent.createTest("Approvar 1 login");
	}

	@Test(priority = 27)
	public void Approvalreview1() throws InterruptedException {
		IC.Reviewer1();

		ExtentTest Test = extent.createTest("Approvar 1 Resubmitted");
	}

	@Test(priority = 28)
	public void AdminResub() throws InterruptedException { // if resubmit
		IC.adminresubmit();

		ExtentTest Test = extent.createTest("Admin Resubmit ");
	}
	
//===============================
	@Test(priority = 29)
	public void REVIEW1() throws InterruptedException {
		IC.Reviewers1login();

		ExtentTest Test = extent.createTest("Reviewer 1 Log in");
	}

	@Test(priority = 30)
	public void REVIEW2() throws InterruptedException { // if Approved
		IC.Approved();

		ExtentTest Test = extent.createTest("Reviewer 1 Decision == Approve");
	}

	@Test(priority = 31)
	public void REVIEW4() throws InterruptedException { // Reviewer 2 login
		IC.Reviewer2Login();

		ExtentTest Test = extent.createTest("Reviewer 2 Login");
	}

	@Test(priority = 32)
	public void REVIEW15() throws InterruptedException { // if Approved
		IC.Approved();

		ExtentTest Test = extent.createTest("Reviewer 2 Decision == Approve");
	}

	@Test(priority = 33)
	public void REVIEW16() throws InterruptedException { // Reviewer 2 login
		IC.Reviewer3Login();

		ExtentTest Test = extent.createTest("Reviewer 3 Login");
	}

	@Test(priority = 34)
	public void REVIEW7() throws InterruptedException { // if Approved
		IC.Approved();

		ExtentTest Test = extent.createTest("Reviewer 3 Decision == Approve");
	}

	@Test(priority = 35)
	public void REVIEW8() throws InterruptedException { // if Approved
		IC.Approval1();

		ExtentTest Test = extent.createTest("Approvar 1 login");
	}
	@Test(priority = 36)
	public void REVIEW01() throws InterruptedException { // if Approved
		IC.Approved();

		ExtentTest Test = extent.createTest("Approvar 1 Decision == Approve");
	}
	

	@Test(priority = 37)
	public void Approvel2() throws InterruptedException {
		IC.Approval2();

		ExtentTest Test = extent.createTest("Approvar 2 login");
	}

	@Test(priority = 38)
	public void Approvalreview2() throws InterruptedException {
		IC.Reviewer1();

		ExtentTest Test = extent.createTest("Approvar 2 Resubmitted");
	}

	@Test(priority = 39)
	public void AdminResub2() throws InterruptedException { // if resubmit
		IC.adminresubmit();

		ExtentTest Test = extent.createTest("Admin Resubmit ");
	}
	
//	+++++++++++
	@Test(priority = 40)
	public void REVIEW12() throws InterruptedException {
		IC.Reviewers1login();

		ExtentTest Test = extent.createTest("Reviewer 1 Log in");
	}

	@Test(priority = 41)
	public void REVIEW22() throws InterruptedException { // if Approved
		IC.Approved();

		ExtentTest Test = extent.createTest("Reviewer 1 Decision == Approve");
	}

	@Test(priority = 42)
	public void REVIEW42() throws InterruptedException { // Reviewer 2 login
		IC.Reviewer2Login();

		ExtentTest Test = extent.createTest("Reviewer 2 Login");
	}

	@Test(priority = 43)
	public void REVIEW152() throws InterruptedException { // if Approved
		IC.Approved();

		ExtentTest Test = extent.createTest("Reviewer 2 Decision == Approve");
	}

	@Test(priority = 44)
	public void REVIEW162() throws InterruptedException { // Reviewer 2 login
		IC.Reviewer3Login();

		ExtentTest Test = extent.createTest("Reviewer 3 Login");
	}

	@Test(priority = 45)
	public void REVIEW72() throws InterruptedException { // if Approved
		IC.Approved();

		ExtentTest Test = extent.createTest("Reviewer 3 Decision == Approve");
	}

	@Test(priority = 46)
	public void REVIEW82() throws InterruptedException { // if Approved
		IC.Approval1();

		ExtentTest Test = extent.createTest("Approvar 1 login");
	}
	@Test(priority = 47)
	public void REVIEW02() throws InterruptedException { // if Approved
		IC.Approved();

		ExtentTest Test = extent.createTest("Approvar 1 Decision == Approve");
	}
	

	@Test(priority = 48)
	public void Approvel5() throws InterruptedException {
		IC.Approval2();

		ExtentTest Test = extent.createTest("Approvar 2 login");
	}

	@Test(priority = 49)
	public void Approved5() throws InterruptedException { // if Approved
		IC.Approved();
		ExtentTest Test = extent.createTest("Approvar 2 Decision == Approve");
	}

	@Test(priority = 50)
	public void Approvel7() throws InterruptedException {
		IC.Approval3();

		ExtentTest Test = extent.createTest("Approvar 3 login");
	}

	@Test(priority = 51)
	public void Approvalreview3() throws InterruptedException {
		IC.Reviewer1();

		ExtentTest Test = extent.createTest("Approvar 3 Resubmitted");
	}

	@Test(priority = 52)
	public void AdminResub3() throws InterruptedException { // if resubmit
		IC.adminresubmit();

		ExtentTest Test = extent.createTest("Admin Resubmit ");
	}
//=========
	@Test(priority = 53)
	public void REVIEW13() throws InterruptedException {
		IC.Reviewers1login();

		ExtentTest Test = extent.createTest("Reviewer 1 Log in");
	}

	@Test(priority = 54)
	public void REVIEW23() throws InterruptedException { // if Approved
		IC.Approved();

		ExtentTest Test = extent.createTest("Reviewer 1 Decision == Approve");
	}

	@Test(priority = 55)
	public void REVIEW43() throws InterruptedException { // Reviewer 2 login
		IC.Reviewer2Login();

		ExtentTest Test = extent.createTest("Reviewer 2 Login");
	}

	@Test(priority = 56)
	public void REVIEW153() throws InterruptedException { // if Approved
		IC.Approved();

		ExtentTest Test = extent.createTest("Reviewer 2 Decision == Approve");
	}

	@Test(priority = 57)
	public void REVIEW163() throws InterruptedException { // Reviewer 2 login
		IC.Reviewer3Login();

		ExtentTest Test = extent.createTest("Reviewer 3 Login");
	}

	@Test(priority = 58)
	public void REVIEW73() throws InterruptedException { // if Approved
		IC.Approved();

		ExtentTest Test = extent.createTest("Reviewer 3 Decision == Approve");
	}

	@Test(priority = 59)
	public void REVIEW83() throws InterruptedException { // if Approved
		IC.Approval1();

		ExtentTest Test = extent.createTest("Approvar 1 login");
	}
	@Test(priority = 60)
	public void REVIEW03() throws InterruptedException { // if Approved
		IC.Approved();

		ExtentTest Test = extent.createTest("Approvar 1 Decision == Approve");
	}
	

	@Test(priority = 61)
	public void Approvel3() throws InterruptedException {
		IC.Approval2();

		ExtentTest Test = extent.createTest("Approvar 2 login");
	}

	@Test(priority = 62)
	public void Approved53() throws InterruptedException { // if Approved
		IC.Approved();
		ExtentTest Test = extent.createTest("Approvar 2 Decision == Approve");
	}

	@Test(priority = 63)
	public void Approvel73() throws InterruptedException {
		IC.Approval3();

		ExtentTest Test = extent.createTest("Approvar 3 login");
	}
	@Test(priority = 64)
	public void Approved54() throws InterruptedException { // if Approved
		IC.Approved();
		ExtentTest Test = extent.createTest("Approvar 3 Decision == Approve");
	}

	@AfterTest
	public void exreports() {
		extent.flush();
//		driver.quit();
	}

}
