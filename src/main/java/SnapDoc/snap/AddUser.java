package SnapDoc.snap;

import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

public class AddUser extends TestBase {
	String EmployeeName = "prathima";
	String Username = "prathim";
	String UserID = "1243";
	String Email = "Devi1323@gmail";
	String MobileNo="8392939492";
	String Designationjobtitle="Stores incharge2";
	String Location="MSN2 pharma";
	String Department="HRM management";
	String Adminmanager="Arun Kumar";
	String DesignationLevel="QA HOD";
	String DateOfJoining="10/06/2022";
	String DateOfBirth="07/04/2001";
	String adminpredefinereason="adding a new all doc approver ";

	public void Adduser() throws InterruptedException {
		Thread.sleep(4000);
		CM.clickonElementbyXpath(EL.elemenuicon_XP, "Menu icon");
		driver.findElement(By.xpath("//div[text()='Admin']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[text()='Us']")).click();
		Thread.sleep(5000);
		CM.clickonElementbyXpath(EL.eleUsera_XP, "User");
		CM.clickonElementbyName(EL.eleAdduser_XP, "Add user");
		CM.CheckElementDisplayedbyXpath(EL.eleUsera_XP, "Users");
//		CM.CheckElementDisplayedbyXpath(EL.eleAdduser_XP, "Add User");
		CM.CheckElementDisplayedbyXpath(EL.eleAddUs_XP, "Add User");
		CM.CheckElementDisplayedbyXpath(EL.eleClose1_XP, "Close");
		CM.CheckElementDisplayedbyXpath(EL.eleName1A_XP, "Name");
		CM.CheckElementDisplayedbyXpath(EL.eleUsername_XP, "Username");
		CM.CheckElementDisplayedbyXpath(EL.eleEmployee_XP, "Employee ID");
		CM.CheckElementDisplayedbyXpath(EL.eleEmail_XP, "Email ID");
		CM.CheckElementDisplayedbyXpath(EL.Mobile, "Mobile Number");
		CM.CheckElementDisplayedbyXpath(EL.eleJob_XP, "Job Title");
		CM.CheckElementDisplayedbyXpath(EL.eleJoining_XP, "Date of Joining");
		CM.CheckElementDisplayedbyXpath(EL.elebirth_XP, "Date of birth");
		CM.CheckElementDisplayedbyXpath(EL.eleLocation1A_XP, "Location");
		CM.CheckElementDisplayedbyXpath(EL.eleDepartmentsA_XP, "Department");
		CM.CheckElementDisplayedbyXpath(EL.eleAdminmanager_XP, "Admin Manager");
		CM.CheckElementDisplayedbyXpath(EL.eleDesignationlevel_XP, "Designation Level");
		CM.clickonElementbyXpath(EL.eleSAVE1_XP, "Save");
//name
		WebElement Name = driver.findElement(By.xpath(
				"//div[@class='EmployeeNameformError error-wrap']//div[@class='fa fa-exclamation-circle exc-icon cursor-pointer']"));
		try {

			Name.click();
			driver.findElement(
					By.xpath("//div[@class='EmployeeNameformError error-wrap']/div[text()='This field is required']"))
					.isDisplayed();
			System.out.println("This field is required");
			CM.enteringDataintoTextfiledByID(EL.eleEmployeeName_XP, EmployeeName, "EmployeeName");
		} catch (Exception e) {
			System.out.println("not showing This field is required");
			System.out.println("Exception : " + e);
		}
//username
		WebElement username = driver.findElement(By.xpath(
				"//div[@class='UserNameformError error-wrap']//div[@class='fa fa-exclamation-circle exc-icon cursor-pointer']"));
		try {
			username.click();
			driver.findElement(
					By.xpath("//div[@class='UserNameformError error-wrap']/div[text()='This field is required']"))
					.isDisplayed();

		} catch (Exception e) {
			System.out.println("not showing This field is required");
			System.out.println("Exception : " + e);
		}

		if (Username.length() > 3 && Username.length() < 60) {

			driver.findElement(By.xpath("//input[@id='UserName']")).sendKeys(Username);
			System.out.println("username name " + Username.length());
		} else {
			driver.findElement(By.xpath("//input[@id='UserName']")).sendKeys(Username);
			driver.findElement(By.xpath(
					"//div[@class='UserNameformError error-wrap']//div[@class='fa fa-exclamation-circle exc-icon cursor-pointer']"))
					.click();
			driver.findElement(By.xpath(
					"//div[@class='UserNameformError error-wrap']//div[text()='* Please enter the User name between 3-60 characters']"))
					.isDisplayed();

			System.out.println("* Please fill the Add1 with 3-60 characters is Displaying");

		}
/////}emplayeeid
		WebElement emplayeeid = driver.findElement(By.xpath(
				"//div[@class='EmployeeCodeformError error-wrap']//div[@class='fa fa-exclamation-circle exc-icon cursor-pointer']"));

		try {
			emplayeeid.click();
			driver.findElement(
					By.xpath("//div[@class='EmployeeCodeformError error-wrap']//div[text()='This field is required']"))
					.isDisplayed();

		} catch (Exception e) {
			System.out.println("not showing This field is required");
			System.out.println("Exception : " + e);
		}
//
		if (UserID.length() > 3 && UserID.length() < 60) {

			driver.findElement(By.xpath("//input[@id='EmployeeCode']")).sendKeys(UserID);
			Thread.sleep(100);
			System.out.println("username name " + UserID.length());
		} else {
			driver.findElement(By.xpath("//input[@id='EmployeeCode']")).sendKeys(UserID);
//			
			driver.findElement(By.xpath(
					"//div[@class='EmployeeCodeformError error-wrap']/div[text()='* Please enter the Employee ID between 3-30 characters']"))
					.click();
			driver.findElement(By.xpath(
					"//div[@class='EmployeeCodeformError error-wrap']//div[text()='* Please enter the Employee ID between 3-30 characters']"))
					.isDisplayed();

			System.out.println("* Please fill the Add1 with 3-60 characters is Displaying");

		}
// Email
		try {
			driver.findElement(By.xpath(
					"//div[@class='EMailformError error-wrap']//div[@class='fa fa-exclamation-circle exc-icon cursor-pointer']"))
					.click();
			driver.findElement(
					By.xpath("//div[@class='EMailformError error-wrap']//div[text()='This field is required']"))
					.isDisplayed();

		} catch (Exception e) {
			System.out.println("not showing This field is required");
			System.out.println("Exception : " + e);
		}
		driver.findElement(By.xpath("//input[@id='EMail']")).sendKeys(Email);
		if (isEmail(Email)) {
//			driver.findElement(By.xpath("//input[@id='EMail']")).sendKeys(Email);
			System.out.println("email enterde" + Email);
		} else {
			driver.findElement(By.xpath("//input[@id='EMail']")).sendKeys(Email);
			driver.findElement(By.xpath(
					"//div[@class='EMailformError error-wrap']//div[@class='fa fa-exclamation-circle exc-icon cursor-pointer']"))
					.click();

			boolean Elements = driver
					.findElement(
							By.xpath("//div[@class='EMailformError error-wrap']/div[text()='* Invalid Email Address']"))
					.isDisplayed();
			if (Elements) {
				System.out.println("*Email is Invalid ");
			} else {
				System.out.println("*Email is Invalid not showing ");
				Thread.sleep(500);

			}

			try {
				WebElement number = driver.findElement(By.xpath(
						"//div[@class='MobileNoformError error-wrap']//div[@class='fa fa-exclamation-circle exc-icon cursor-pointer']"));
				number.click();
				driver.findElement(
						By.xpath("//div[@class='MobileNoformError error-wrap']//div[text()='This field is required']"))
						.isDisplayed();

			} catch (Exception e) {
				System.out.println("not showing This field is required");
				System.out.println("Exception : " + e);
			}
//driver.findElement(By.xpath("//input[@id='MobileNo']")).sendKeys(MobileNo);
			
		}
		System.out.println("Mobile number started");
			driver.findElement(By.xpath("//input[@id='MobileNo']")).sendKeys(MobileNo);
			

	int l=MobileNo.length();
	char[] mb= new char[l];
	mb=MobileNo.toCharArray();
	boolean isnumber=true;
	for(int i=0; i<l;i++){
		if(mb[i]!='1'&& mb[i]!='2'&&mb[i]!='3'&&mb[i]!='4'&&mb[i]!='5'&&mb[i]!='6'&&mb[i]!='7'&&mb[i]!='8'&&mb[i]!='9'&&mb[i]!='0') {
			isnumber=false;
		}
	}
	if(isnumber) {
		if (MobileNo.length() ==10)
		{
			System.out.println("correct");
		}else {
			driver.findElement(By.xpath("//div[@class='MobileNoformError error-wrap']//div[@class='fa fa-exclamation-circle exc-icon cursor-pointer']")).click();
			driver.findElement(By.xpath("//div[@class='MobileNoformError error-wrap']/div[text()='* Minimum 10 characters allowed']")).isDisplayed();
			System.out.println("* Minimum 10 characters allowed");
		}
	}
	else {
		driver.findElement(By.xpath("//div[@class='MobileNoformError error-wrap']//div[@class='fa fa-exclamation-circle exc-icon cursor-pointer']")).click();
driver.findElement(By.xpath("//div[@class='MobileNoformError error-wrap']/div[text()='* Enter Positive integers only * Invalid phone number* Minimum 10 characters allowed']")).isDisplayed();
		System.out.println("Enter Positive integers only * Invalid phone number* Minimum 10 characters allowed");
	}
	
	
	try {
		driver.findElement(By.xpath("//div[@class='DesignationformError error-wrap']//div[@class='fa fa-exclamation-circle exc-icon cursor-pointer']")).click();
		driver.findElement(By.xpath("//div[@class='DesignationformError error-wrap']/div[text()='This field is required']")).isDisplayed();
	} catch (Exception e) {
		System.out.println("not showing This field is required");
		System.out.println("Exception : " + e);
	}
	CM.enteringDataintoTextfiledByID(EL.eleDesignation1A_XP, Designationjobtitle, "Designation");	
	
	CM.enteringDataintoTextfiledByID(EL.eleDateOfJoining_XP,DateOfJoining ,"DateOfJoining_JDate");
	//TEXTFIELD
//	CM.clickonElementbyXpath(EL.elecalendar1_XP, "calendar");
//	CM.clickonElementbyXpath(EL.eletoday1_XP, "today");
	
	CM.enteringDataintoTextfiledByXpath(EL.eleDateOfBirth_XP,DateOfBirth, "DateOfBirth");
//	CM.clickonElementbyXpath(EL.elecalendar_XP, "calendar");
//	CM.clickonElementbyXpath(EL.eletoday1_XP, "today");

	CM.selectValueinDropdownByVisualtextbyXpath(EL.eleLOCA_XP, Location, "Location");
	CM.selectValueinDropdownByVisualtextbyID(EL.eleDepartmentss_XP, Department," Department");
	CM.selectValueinDropdownByVisualtextbyID(EL.eleAdminmanagers_XP, Adminmanager, "Admin manager");
	CM.enteringDataintoTextfiledByXpath(EL.eleDesiglevel_XP, DesignationLevel, "Designation Level");
	Thread.sleep(500);
	driver.findElement(By.xpath("//input[@value='Save']")).click();
//	CM.clickonElementbyID(EL.eleSAVE1_XP, "Save");
	CM.CheckElementDisplayedbyXpath(EL.eleActionHEA_XP, "Justification for Action");
	CM.CheckElementDisplayedbyXpath(EL.elePrefilled_XP, "Prefilled Reason");
	CM.CheckElementDisplayedbyXpath(EL.eleCustom_XP, "Custom Reason");
	CM.CheckElementDisplayedbyXpath(EL.eleclose_XP, "CLOSE");
	CM.selectValueinDropdownselectbyvalueXpath(EL.eleREason_XP, "4", "Prefilled Reason");
	CM.clickonElementbyXpath(EL.eleSave_XP, "Save");
	Thread.sleep(2000);
	driver.switchTo().alert().accept();
	Thread.sleep(900);
	}

	
	private boolean isEmail(String s) {
		Pattern parten = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

		return parten.matcher(s).matches();

	}
	
	public void Justifi1() throws InterruptedException {
		Thread.sleep(4000);
		CM.clickonElementbyXpath(EL.elemenuicon_XP, "Menu icon");
		WebElement Admin = driver.findElement(By.xpath("//div[text()='Admin']"));
		AS.moveToElement(Admin).perform();
		Admin.findElement(By.xpath("//span[@class='sub-tlt'][normalize-space()='Justifications']")).click();
		String Adminuser=driver.findElement(By.xpath("(//tr[@class='t-alt'])[2]/td[4]")).getText();
		int a=Integer.parseInt(Adminuser);
		System.out.println(a+1);
		Adminuser=Integer.toString(a+1);
		System.out.println(Adminuser);
		WebElement AdminuserToggle = driver.findElement(By.xpath("//td[text()='Admin-->>Users']/parent::tr/td[5]"));
		try {
			AdminuserToggle.click();
		} catch (StaleElementReferenceException e) {
			AdminuserToggle = driver.findElement(By.xpath("//td[text()='Admin-->>Users']/parent::tr/td[5]"));
			AdminuserToggle.click();
		}
		CM.clickonElementbyXpath(EL.eleadminuseredit_XP, "Edit");
		CM.CheckElementDisplayedbyXpath(EL.elePre_XP, "Pre Defined Reasons");
		CM.CheckElementDisplayedbyXpath(EL.eleSystem_XP, "System Address");
		CM.CheckElementDisplayedbyXpath(EL.eleadminsuser_XP, "admin user");
		CM.CheckElementDisplayedbyXpath(EL.eleReasons_XP, "Reasons");
		CM.CheckElementDisplayedbyXpath(EL.eleReason_XP, "Reasons");
		CM.clickonElementbyXpath(EL.elebtnAdd_XP, "Add pre condition");
		driver.findElement(By.xpath("//input[@id='_Reason_" + Adminuser + "']")).sendKeys("ADD admin user reason");
////input[@id='_Reason_7']
		CM.CheckElementDisplayedbyXpath(EL.eleClose_XP, "CLOSE POPUP");
		CM.clickonElementbyXpath(EL.elebtnSave_XP, "Save");
		Thread.sleep(300);
		CM.CheckElementDisplayedbyXpath(EL.eleActionHEA_XP, "Justification for Action");
		CM.CheckElementDisplayedbyXpath(EL.elePrefilled_XP, "Prefilled Reason");
		CM.CheckElementDisplayedbyXpath(EL.eleCustom_XP, "Custom Reason");
		CM.CheckElementDisplayedbyXpath(EL.eleclose_XP, "CLOSE");
		CM.selectValueinDropdownselectbyvalueXpath(EL.eleREason_XP, "23", "Prefilled Reason");
		CM.clickonElementbyXpath(EL.eleSave_XP, "Save");
		Thread.sleep(300);
		driver.switchTo().alert().accept();
		
		
	}
	
}
