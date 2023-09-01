package SnapDoc.snap;

import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class User extends TestBase {
	String Locationname = "MSN3 pharma";
	String Shortcode = "MSN3 unit 7";
	String Description = "MSN3 pharma private limited";
	String Addres1 = "Am Nagar";
	String Addres2 = "Sangareddy";
	String Country = "India";
	String State = "Telangana";
	String CityName = "Hyd";
	String Zipcode = "500050";
	//department
	String DepartmentName = "HRM1 management";
	String DepartmentCode = "product 1 ";
	String Descriptions1= "products department  ";
//	Roles
	String RoleName = "Manager A3";
	String discription = "permissions 4";
	String Accessgroupname = "permission only dashboard";
	String Designationname = "Stores C Block Manager";
	String Shortcode1 = "BManager";
	String DesignationDescription = "Stores D BLOCK management";
//user
	String EmployeeName = "Devi3";
	String Username = "Devi3";
	String UserID = "2143";
	String Email = "DeviS323@gmail.com";
	String MobileNo="8092939492";
	String Designationjobtitle="Stores incharge3";
//	String Location="MSN2 pharma";
//	String Department="HRM management";
	String Adminmanager="Arun Kumar";
//	String DesignationLevel="QA HOD";
	String DateOfJoining="10/06/2022";
	String DateOfBirth="07/04/2001";

	public void Users() throws InterruptedException {
		Thread.sleep(4000);
		CM.clickonElementbyXpath(EL.elemenuicon_XP, "Menu icon");
		CM.CheckElementDisplayedbyXpath(EL.elemenu4_XP, "Admin");
		WebElement Admin = driver.findElement(By.xpath("//div[text()='Admin']"));
		AS.moveToElement(Admin).perform();
		Admin.findElement(By.xpath("//span[normalize-space()='Organization']")).click();
		CM.clickonElementbyXpath(EL.eleLocation_XP, "Locations");
		CM.CheckElementDisplayedbyXpath(EL.eleLocations_XP, "Locations");
		CM.CheckElementDisplayedbyXpath(EL.eleShortcode_XP, "Short Code");
		CM.CheckElementDisplayedbyXpath(EL.eleLocationname_XP, "Location Name");
		CM.CheckElementDisplayedbyXpath(EL.eleDescription_XP, "Description");
		CM.CheckElementDisplayedbyXpath(EL.eleAddress_XP, "Address");
		CM.clickonElementbyXpath(EL.eleAddlocation_XP, "Add location symbal(+)");
		CM.CheckElementDisplayedbyXpath(EL.eleHeader_XP, "Add/Edit Location Header");
		CM.CheckElementDisplayedbyXpath(EL.eleLocationnam_XP, "Location Name");
		CM.CheckElementDisplayedbyXpath(EL.eleLocationnamman_XP, "Location Name(*)");
		CM.CheckElementDisplayedbyXpath(EL.eleShortcodes_XP, "Shortcode");
		CM.CheckElementDisplayedbyXpath(EL.eleDescriptions_XP, "Description");
		CM.CheckElementDisplayedbyXpath(EL.eleDescriptionman_XP, "Description*");
		CM.CheckElementDisplayedbyXpath(EL.eleaddre1_XP, "Address 1");
		CM.CheckElementDisplayedbyXpath(EL.eleaddresman_XP, "Address 1 man");
		CM.CheckElementDisplayedbyXpath(EL.eleaddress2_XP, "Address2");
		CM.CheckElementDisplayedbyXpath(EL.eleaddressman_XP, "Address2(*)");
		CM.CheckElementDisplayedbyXpath(EL.eleCountry_XP, "Country");
		CM.CheckElementDisplayedbyXpath(EL.eleState_XP, "State");
		CM.CheckElementDisplayedbyXpath(EL.eleCity_XP, "City");
		CM.CheckElementDisplayedbyXpath(EL.eleZipcode_XP, "Zip code");

		driver.findElement(By.xpath("//input[@id='SiteName']")).click();
		driver.findElement(By.xpath("//input[@id='SiteCode']")).click();
		WebElement Sitename = driver.findElement(By.xpath(
				"//div[@class='SiteNameformError error-wrap']//div[@class='fa fa-exclamation-circle exc-icon cursor-pointer']"));

		try {

			Sitename.click();
			driver.findElement(By.xpath(
					"//div[@class='SiteNameformError error-wrap']//div[@class='formErrorContent'][normalize-space()='This field is required']"))
					.isDisplayed();
		} catch (Exception e) {
			System.out.println(" element not displayed");
			System.out.println("Exception : " + e);
		}

		if (Locationname.length() > 6 && Locationname.length() < 150) {

			driver.findElement(By.xpath("//input[@id='SiteName']")).sendKeys(Locationname);
			System.out.println("Location name " + Locationname.length());
		} else {
			driver.findElement(By.xpath("//input[@id='SiteName']")).sendKeys(Locationname);
			driver.findElement(By.xpath("//input[@id='SiteCode']")).click();
			driver.findElement(By.xpath("//div[@class='fa fa-exclamation-circle exc-icon cursor-pointer']")).click();

			boolean element = driver
					.findElement(By.xpath("//div[text()='* Please fill the Location Name with 6-120 characters']"))
					.isDisplayed();
			if (element) {
				System.out.println("* Please fill the Location Name with 6-120 characters'] is Displaying");
			} else {
				System.out.println("* Please fill the Location Name with 6-120 characters'] is Not Displaying");
			}
		}

//	missing shortcode display field required

		driver.findElement(By.xpath("//input[@id='SiteCode']")).click();
		driver.findElement(By.xpath("//textarea[@id='Description']")).click();
		WebElement Sitecode = driver.findElement(By.xpath(
				"//div[@class='SiteCodeformError error-wrap']//div[@class='fa fa-exclamation-circle exc-icon cursor-pointer']"));

		try {
			Sitecode.click();
			driver.findElement(
					By.xpath("//div[@class='SiteCodeformError error-wrap']//div[text()='This field is required']"))
					.isDisplayed();
		} catch (Exception e) {
			System.out.println(" element not displayed");
			System.out.println("Exception : " + e);
		}

		if (Shortcode.length() > 3 && Shortcode.length() < 15) {

			driver.findElement(By.xpath("//input[@id='SiteCode']")).sendKeys(Shortcode);
			System.out.println("  short code" + Shortcode.length());
		} else {
			driver.findElement(By.xpath("//input[@id='SiteCode']")).sendKeys(Shortcode);
			driver.findElement(By.xpath("//textarea[@id='Description']")).click();
			driver.findElement(By.xpath("//div[@class='fa fa-exclamation-circle exc-icon cursor-pointer']")).click();
			boolean element = driver.findElement(By.xpath(
					"//div[@class='SiteCodeformError error-wrap']//div[text()='* Please fill the Block Code with 3-15 characters']"))
					.isDisplayed();
			if (element) {
				System.out.println("* Please fill the Block Code with 3-15 characters is Displaying");
			} else {
				System.out.println("* Please fill the Block Code with 3-15 characters is Not Displaying");
			}
		}

		driver.findElement(By.xpath("//textarea[@id='Description']")).click();
		driver.findElement(By.xpath("//textarea[@id='AddressLine1']")).click();
		WebElement Descriptions = driver.findElement(By.xpath(
				"//div[@class='DescriptionformError error-wrap']//div[@class='fa fa-exclamation-circle exc-icon cursor-pointer']"));

		try {
			Descriptions.click();
			driver.findElement(
					By.xpath("//div[@class='DescriptionformError error-wrap']//div[text()='This field is required']"))
					.isDisplayed();
		} catch (Exception e) {
			System.out.println(" element not displayed");
			System.out.println("Exception : " + e);
		}

		if (Description.length() > 6 && Description.length() < 600) {

			driver.findElement(By.xpath("//textarea[@id='Description']")).sendKeys(Description);
			System.out.println("Description name " + Description.length());
		} else {
			driver.findElement(By.xpath("//textarea[@id='Description']")).sendKeys(Description);
			driver.findElement(By.xpath("//textarea[@id='AddressLine1']")).click();
			driver.findElement(By.xpath(
					"//div[@class='DescriptionformError error-wrap']//div[@class='fa fa-exclamation-circle exc-icon cursor-pointer']"))
					.click();
			boolean element = driver.findElement(By.xpath(
					"//div[@class='DescriptionformError error-wrap']//div[text()='* Please fill the Description with 6-600 characters']"))
					.isDisplayed();
			if (element) {
				System.out.println("* Please fill the Block Code with 6-600 characters is Displaying");
			} else {
				System.out.println("* Please fill the Block Code with 6-600 characters is Not Displaying");
			}
		}

		driver.findElement(By.xpath("//textarea[@id='AddressLine1']")).click();
		driver.findElement(By.xpath("//textarea[@id='AddressLine2']")).click();
		WebElement Address1 = driver.findElement(By.xpath(
				"//div[@class='AddressLine1formError error-wrap']//div[@class='fa fa-exclamation-circle exc-icon cursor-pointer']"));

		try {
			Address1.click();
			driver.findElement(
					By.xpath("//div[@class='AddressLine1formError error-wrap']/div[text()='This field is required']"))
					.isDisplayed();
		} catch (Exception e) {
			System.out.println(" element not displayed");
			System.out.println("Exception : " + e);
		}

		if (Addres1.length() > 6 && Addres1.length() < 120) {

			driver.findElement(By.xpath("//textarea[@id='AddressLine1']")).sendKeys(Addres1);
			System.out.println("Address1 name " + Addres1.length());
		} else {
			driver.findElement(By.xpath("//textarea[@id='AddressLine1']")).sendKeys(Addres1);
			driver.findElement(By.xpath("//textarea[@id='AddressLine2']")).click();
			driver.findElement(By.xpath(
					"//div[@class='AddressLine1formError error-wrap']//div[@class='fa fa-exclamation-circle exc-icon cursor-pointer']"))
					.click();
			boolean element = driver.findElement(By.xpath(
					"//div[@class='AddressLine1formError error-wrap']//div[text()='* Please fill the Add1 with 6-120 characters']"))
					.isDisplayed();
			if (element) {
				System.out.println("* Please fill the Add1 with 6-120 characters is Displaying");
			} else {
				System.out.println("* Please fill the Add1 with 6-120 characters is Not Displaying");
			}
		}

		driver.findElement(By.xpath("//textarea[@id='AddressLine2']")).click();
		driver.findElement(By.xpath("//select[@id='CountryId']")).click();
		WebElement Address2 = driver.findElement(By.xpath(
				"//div[@class='AddressLine2formError error-wrap']//div[@class='fa fa-exclamation-circle exc-icon cursor-pointer']"));

		try {
			Address2.click();
			driver.findElement(
					By.xpath("//div[@class='AddressLine2formError error-wrap']//div[text()='This field is required']"))
					.isDisplayed();
		} catch (Exception e) {
			System.out.println(" element not displayed");
			System.out.println("Exception : " + e);
		}

		if (Addres2.length() > 6 && Addres2.length() < 120) {

			driver.findElement(By.xpath("//textarea[@id='AddressLine2']")).sendKeys(Addres2);
			System.out.println("Address2  " + Addres2.length());
		} else {
			driver.findElement(By.xpath("//textarea[@id='AddressLine2']")).sendKeys(Addres2);
			driver.findElement(By.xpath("//select[@id='CountryId']")).click();
			driver.findElement(By.xpath(
					"//div[@class='AddressLine2formError error-wrap']//div[@class='fa fa-exclamation-circle exc-icon cursor-pointer']"))
					.click();
			boolean element = driver.findElement(By.xpath(
					"//div[@class='AddressLine2formError error-wrap']//div[text()='* Please fill the Add2 with 6-120 characters']"))
					.isDisplayed();
			if (element) {
				System.out.println("* Please fill the Add2 with 6-120 characters' is Displaying");
			} else {
				System.out.println("* Please fill the Add2 with 6-120 characters' is Not Displaying");
			}
		}

		driver.findElement(By.xpath("//select[@id='CountryId']")).click();
		driver.findElement(By.xpath("//select[@id='StateId']")).click();
		WebElement country = driver.findElement(By.xpath(
				"//div[@class='CountryIdformError error-wrap']//div[@class='fa fa-exclamation-circle exc-icon cursor-pointer']"));

		try {
			country.click();
			driver.findElement(
					By.xpath("//div[@class='CountryIdformError error-wrap']//div[text()='This field is required']"))
					.isDisplayed();
		} catch (Exception e) {
			System.out.println(" element not displayed");
			System.out.println("Exception : " + e);
		}

		CM.selectValueinDropdownByVisualtextbyXpath(EL.elecountry_XP, Country, "Country");

		CM.selectValueinDropdownByVisualtextbyXpath(EL.eleStates_XP, State, "State");
		Thread.sleep(200);
		CM.enteringDataintoTextfiledByXpath(EL.elecityname_XP, CityName, "City Name");
		driver.findElement(By.xpath("//input[@id='ZipCode']")).sendKeys(Zipcode);
		CM.clickonElementbyXpath(EL.elebuttonSave_XP, "Save");
		CM.CheckElementDisplayedbyXpath(EL.eleActionHEA_XP, "Justification for Action");
		CM.CheckElementDisplayedbyXpath(EL.elePrefilled_XP, "Prefilled Reason");
		CM.CheckElementDisplayedbyXpath(EL.eleCustom_XP, "Custom Reason");
		CM.CheckElementDisplayedbyXpath(EL.eleclose_XP, "CLOSE");
		CM.selectValueinDropdownselectbyvalueXpath(EL.eleREason_XP, "9", "Prefilled Reason");
		CM.clickonElementbyXpath(EL.eleSave_XP, "Save");
		Thread.sleep(500);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
//department
		CM.clickonElementbyXpath(EL.eleDepartments_XP, "Departments");
		CM.CheckElementDisplayedbyXpath(EL.eleDepart_XP, "Departments");
		CM.CheckElementDisplayedbyXpath(EL.eledepartname_XP, "Department Name");
		CM.CheckElementDisplayedbyXpath(EL.eledepatshotcode_XP, "Short Code");
		CM.CheckElementDisplayedbyXpath(EL.eleDis_XP, "Description");
		CM.clickonElementbyXpath(EL.eleAdddepart_XP, "Add department (Add)");
		CM.CheckElementDisplayedbyXpath(EL.eleAdddepH_XP, "Add Department Header");
		CM.CheckElementDisplayedbyXpath(EL.eleDepName_XP, "Department Name");
		CM.CheckElementDisplayedbyXpath(EL.eleDepNameMAN_XP, "Department Name(*)");
		CM.CheckElementDisplayedbyXpath(EL.eleDepDis_XP, "Department Discription");
		CM.CheckElementDisplayedbyXpath(EL.eledepDisman_XP, "Department Discription(*)");
		CM.CheckElementDisplayedbyXpath(EL.elesCode_XP, "Short code");
		CM.CheckElementDisplayedbyXpath(EL.eleshorman_XP, "Short code (*)");
		CM.CheckElementDisplayedbyXpath(EL.eleCloses_XP, "Close");
		CM.enteringDataintoTextfiledByXpath(EL.eleDepartmentName_XP, DepartmentName, "DepartmentName");
		CM.enteringDataintoTextfiledByXpath(EL.eleDepartmentCode_XP, DepartmentCode, "DepartmentCode");

		if (Descriptions1.length() > 6 && Descriptions1.length() < 600) {
			//
			driver.findElement(By.xpath("//textarea[@id='Description']")).sendKeys(Descriptions1);
			System.out.println("Discription  " + Descriptions1.length());
		} else {
			driver.findElement(By.xpath("//textarea[@id='Description']")).sendKeys(Descriptions1);
			CM.clickonElementbyXpath(EL.eleSaves_XP, "Save");
			driver.findElement(By.xpath(
					"//div[@class='DescriptionformError error-wrap']//div[@class='fa fa-exclamation-circle exc-icon cursor-pointer']"))
					.click();
			System.out.println("* Please fill the Description with 6-600 characters");
		}
		CM.clickonElementbyXpath(EL.eleSaves_XP, "Save");
		CM.CheckElementDisplayedbyXpath(EL.eleActionHEA_XP, "Justification for Action");
		CM.CheckElementDisplayedbyXpath(EL.elePrefilled_XP, "Prefilled Reason");
		CM.CheckElementDisplayedbyXpath(EL.eleCustom_XP, "Custom Reason");
		CM.CheckElementDisplayedbyXpath(EL.eleclose_XP, "CLOSE");
		CM.selectValueinDropdownselectbyvalueXpath(EL.eleREason_XP, "4", "Prefilled Reason");
		CM.clickonElementbyXpath(EL.eleSave_XP, "Save");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(900);
//Roles
		driver.findElement(By.xpath("//div[text()='Us']")).click();
		Thread.sleep(5000);
		CM.clickonElementbyXpath(EL.eleRoles_XP, "Roles");
		CM.clickonElementbyXpath(EL.elebtnAddRole_XP, "btnAddRole");
		CM.CheckElementDisplayedbyXpath(EL.eleRolepermission_XP, "ROLE PERMISSIONS Header");
		CM.CheckElementDisplayedbyXpath(EL.eleBasicinfo_XP, "Basic Info");
		CM.CheckElementDisplayedbyXpath(EL.elepermissions_XP, "Permissions");
		CM.CheckElementDisplayedbyXpath(EL.eleName_XP, "Name");
		CM.CheckElementDisplayedbyXpath(EL.eleDescription1_XP, "Description");
		CM.clickonElementbyXpath(EL.eletxtRoleName_XP, "Role Name");
		CM.clickonElementbyXpath(EL.eleDescription2_XP, "Description");
		driver.findElement(By.xpath("//input[@id='txtRoleName']")).click();
		driver.findElement(By.xpath("//textarea[@id='Description']")).click();
		WebElement Addres1 = driver.findElement(By.xpath("//div[@class='txtRoleNameformError error-wrap']/div[2]"));
		try {
			Addres1.click();
			driver.findElement(By.xpath("//div[@class='txtRoleNameformError error-wrap']/div[1]")).isDisplayed();
		} catch (Exception e) {
			System.out.println(" element not displayed");
			System.out.println("Exception : " + e);
		}
		driver.findElement(By.xpath("//input[@id='txtRoleName']")).sendKeys(RoleName);

		WebElement Addres2 = driver.findElement(By.xpath("//div[@class='DescriptionformError error-wrap']/div[2]"));
		try {
			Addres2.click();
			driver.findElement(By.xpath("//div[@class='DescriptionformError error-wrap']/div[1]")).isDisplayed();
		} catch (Exception e) {
			System.out.println(" element not displayed");
			System.out.println("Exception : " + e);
		}

		if (discription.length() > 6 && discription.length() < 260) {

			driver.findElement(By.xpath("//textarea[@id='Description']")).sendKeys(discription);
			System.out.println("Address1 name " + discription.length());
		} else {
			driver.findElement(By.xpath("//textarea[@id='Description']")).sendKeys(discription);
			driver.findElement(By.xpath("//input[@id='txtRoleName']")).click();
			driver.findElement(By.xpath("//div[@class='DescriptionformError error-wrap']/div[2]")).click();
			driver.findElement(By.xpath(
					"//div[@class='DescriptionformError error-wrap']/div[text()='* Please Fill the Comments  between 6 and 260 characters to Proceed Further']"))
					.isDisplayed();

		}
		CM.clickonElementbyXpath(EL.elepermissions_XP, "Permissions");
// Dashboard
		CM.clickonElementbyXpath(EL.eleDashboards1_XP, "Dashboard");
		CM.CheckElementDisplayedbyXpath(EL.eleApprovals_XP, "Approvals");
		CM.CheckElementDisplayedbyXpath(EL.eleApprovals2_XP, "Approvals");
		CM.CheckElementDisplayedbyXpath(EL.eleinput2_XP, "Approvals");
		CM.CheckElementDisplayedbyXpath(EL.eleNotifications1, "Notifications");
		CM.CheckElementDisplayedbyXpath(EL.eleNotifications2_XP, "Notifications");
		CM.clickonElementbyXpath(EL.eleApprovalsbox_XP, "Give Approvals Access");
		CM.clickonElementbyXpath(EL.eleinput4_XP, "Notification ");
//	Admin
		CM.clickonElementbyXpath(EL.eleAdmin_XP, "Admin");
		CM.CheckElementDisplayedbyXpath(EL.eledocCla_XP, "Document Classification");
		CM.clickonElementbyXpath(EL.eleDoccheck_XP, "Document Classification Check box");
		CM.clickonElementbyXpath(EL.eleSAve_XP, "Save");
		CM.CheckElementDisplayedbyXpath(EL.eleActionHEA_XP, "Justification for Action");
		CM.CheckElementDisplayedbyXpath(EL.elePrefilled_XP, "Prefilled Reason");
		CM.CheckElementDisplayedbyXpath(EL.eleCustom_XP, "Custom Reason");
		CM.CheckElementDisplayedbyXpath(EL.eleclose_XP, "CLOSE");
		CM.selectValueinDropdownselectbyvalueXpath(EL.eleREason_XP, "4", "Prefilled Reason");
		CM.clickonElementbyXpath(EL.eleSave_XP, "Save");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(900);
//Asses group
		CM.clickonElementbyXpath(EL.eleAccessg_XP, "Access Groups");
		CM.clickonElementbyXpath(EL.eleAccess_XP, "btn Add Access Grop");
		CM.CheckElementDisplayedbyXpath(EL.eleAccessgroup_XP, "Accessgroup");
		CM.CheckElementDisplayedbyXpath(EL.eleBasicinfo_XP, "Basic Info");
		CM.CheckElementDisplayedbyXpath(EL.elepermissions_XP, "Permissions");
		CM.CheckElementDisplayedbyXpath(EL.eleName_XP, "Name");
		CM.CheckElementDisplayedbyXpath(EL.eleDescription1_XP, "Description");
		CM.clickonElementbyXpath(EL.eleAssSave_XP, "Save");
		WebElement ACCESS = driver
				.findElement(By.xpath("//div[@class='txtAccessGroupsNameformError error-wrap']/div[2]"));
		try {
			ACCESS.click();
			driver.findElement(By.xpath("//div[@class='txtAccessGroupsNameformError error-wrap']/div[2]"))
					.isDisplayed();
		} catch (Exception e) {
			System.out.println(" element not displayed");
			System.out.println("Exception : " + e);
		}
		driver.findElement(By.xpath("//input[@id='txtAccessGroupsName']")).sendKeys(Accessgroupname);

		WebElement ACCESS2 = driver.findElement(By.xpath("//div[@class='DescriptionformError error-wrap']/div[2]"));
		try {
			ACCESS2.click();
			driver.findElement(By.xpath("//div[@class='DescriptionformError error-wrap']/div[1]")).isDisplayed();
		} catch (Exception e) {
			System.out.println(" element not displayed");
			System.out.println("Exception : " + e);
		}

		if (discription.length() > 6 && discription.length() < 260) {

			driver.findElement(By.xpath("//textarea[@id='Description']")).sendKeys(discription);
			System.out.println("Address1 name " + discription.length());
		} else {
			driver.findElement(By.xpath("//textarea[@id='Description']")).sendKeys(discription);
			driver.findElement(By.xpath("//input[@id='txtAccessGroupsName']")).click();
			driver.findElement(By.xpath("//div[@class='DescriptionformError error-wrap']/div[2]")).click();
			driver.findElement(By.xpath(
					"//div[@class='DescriptionformError error-wrap']//div[text()='* Please Fill the Comments  between 6 and 260 characters to Proceed Further']"))
					.isDisplayed();
		}
		CM.clickonElementbyXpath(EL.elepermissions_XP, "Permissions");
		CM.clickonElementbyXpath(EL.eleDepLoc_XP, "Departments & Locations");
		driver.findElement(By.xpath("//label[text()='HR management']/parent::b")).isDisplayed();
		driver.findElement(By.xpath("//input[@id='chkDptDepartmentAll_32']")).click();
		CM.clickonElementbyXpath(EL.eleDocuments_XP, "Documents");
		driver.findElement(By.xpath("//label[text()='Analytical']/parent::b")).isDisplayed();
		driver.findElement(By.xpath("//label[text()='Analytical']/parent::b/parent::td/input[1]")).click();
		CM.clickonElementbyXpath(EL.eleAssSave_XP, "Save");
		CM.CheckElementDisplayedbyXpath(EL.eleActionHEA_XP, "Justification for Action");
		CM.CheckElementDisplayedbyXpath(EL.elePrefilled_XP, "Prefilled Reason");
		CM.CheckElementDisplayedbyXpath(EL.eleCustom_XP, "Custom Reason");
		CM.CheckElementDisplayedbyXpath(EL.eleclose_XP, "CLOSE");
		CM.selectValueinDropdownselectbyvalueXpath(EL.eleREason_XP, "9", "Prefilled Reason");
		CM.clickonElementbyXpath(EL.eleSave_XP, "Save");
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
//designation
		CM.clickonElementbyXpath(EL.eleDesignations_XP, "Designations");
		CM.clickonElementbyXpath(EL.elebtnAddDesignation_XP, "btnAddDesignation");
		CM.CheckElementDisplayedbyXpath(EL.eleDesignation_XP, "Add/Edit Designation");
		CM.CheckElementDisplayedbyXpath(EL.eledesName_XP, "Designation Name");
		CM.CheckElementDisplayedbyXpath(EL.elenameman_XP, "Designation Name (*)");
		CM.CheckElementDisplayedbyXpath(EL.eleShotco_XP, "Short Code");
		CM.CheckElementDisplayedbyXpath(EL.elecodman_XP, "Short Code(*)");
		CM.CheckElementDisplayedbyXpath(EL.eledesdis_XP, "Designation Description");
		CM.CheckElementDisplayedbyXpath(EL.eledesman_XP, "Designation Description(*)");
		CM.CheckElementDisplayedbyXpath(EL.eleesc_XP, "Escalation Designation");
		CM.CheckElementDisplayedbyXpath(EL.eleEscman_XP, "Escalation Designation(*)");
		CM.CheckElementDisplayedbyXpath(EL.elePermissions_XP, "Permissions");
		CM.CheckElementDisplayedbyXpath(EL.eleviewrole_XP, "View All Role Permissions ");
		CM.CheckElementDisplayedbyXpath(EL.eleViewAsses_XP, " View All Access Groups");
		CM.CheckElementDisplayedbyXpath(EL.eleRoles1_XP, "Roles Header");
		CM.CheckElementDisplayedbyXpath(EL.eleRnamre_XP, "Name");
		CM.CheckElementDisplayedbyXpath(EL.eleRdes_XP, "Description");
		CM.CheckElementDisplayedbyXpath(EL.eleRdesig_XP, "Other Designations");
		CM.CheckElementDisplayedbyXpath(EL.eleAccessgr_XP, "Access Group Header");
		CM.CheckElementDisplayedbyXpath(EL.eleAname_XP, "Name");
		CM.CheckElementDisplayedbyXpath(EL.eleOdes_XP, "Other Designations");
		CM.CheckElementDisplayedbyXpath(EL.eleOdeman_XP, "Other Designations(*)");
		CM.clickonElementbyXpath(EL.eleSavess_XP, "Save");
		WebElement Name = driver.findElement(By.xpath("//div[@class='DesignationNameformError error-wrap']/div[2]"));
		try {
			Name.click();
			driver.findElement(By
					.xpath("//div[@class='DesignationNameformError error-wrap']/div[text()='This field is required']"))
					.isDisplayed();
		} catch (Exception e) {
			System.out.println(" element not displayed");
			System.out.println("Exception : " + e);
		}

		WebElement code = driver.findElement(By.xpath("//div[@class='DesignationCodeformError error-wrap']/div[2]"));
		try {
			code.click();
			driver.findElement(By
					.xpath("//div[@class='DesignationCodeformError error-wrap']/div[text()='This field is required']"))
					.isDisplayed();
		} catch (Exception e) {
			System.out.println(" element not displayed");
			System.out.println("Exception : " + e);
		}
		WebElement Discription = driver
				.findElement(By.xpath("//div[@class='DesignationDescformError error-wrap']/div[2]"));
		try {
			Discription.click();
			driver.findElement(By.xpath(
					"//div[@class='EscalationDesignationformError error-wrap']/div[text()='This field is required']"))
					.isDisplayed();
		} catch (Exception e) {
			System.out.println(" element not displayed");
			System.out.println("Exception : " + e);
		}

		CM.enteringDataintoTextfiledByXpath(EL.eleDesignationName_XP, Designationname, "Designation name");
		CM.enteringDataintoTextfiledByXpath(EL.eleDesignationCode_XP, Shortcode1, "Short Code");
		CM.enteringDataintoTextfiledByXpath(EL.eleDesignationDesc_XP, DesignationDescription,
				"Designation Description");

		CM.selectValueinDropdownselectbyvalueXpath(EL.eleEscalationDesignation_XP, "1", "EscalationDesignation");

		CM.clickonElementbyXpath(EL.eleBurole_XP, "btnAddRole");
		CM.CheckElementDisplayedbyXpath(EL.eleAdd_XP, "Add");
		CM.CheckElementDisplayedbyXpath(EL.elerefreshi_XP, "Refresh img");
		CM.CheckElementDisplayedbyXpath(EL.elefilter_XP, "Filteer img");
		CM.CheckElementDisplayedbyXpath(EL.eleNamE_XP, "Name");
		CM.CheckElementDisplayedbyXpath(EL.eleDesC_XP, "Description");
		CM.CheckElementDisplayedbyXpath(EL.eleOrDis_XP, "Other Designations");
		CM.enteringDataintoTextfiledByXpath(EL.eleSearh_XP, RoleName, "Search");
		driver.findElement(By.xpath("//input[@id='txtsearchTextAssociateRole']")).sendKeys(Keys.ENTER);
		Thread.sleep(500);
		CM.clickonElementbyXpath(EL.eleChekbox_XP, "Chekbox");
		CM.clickonElementbyXpath(EL.eleAssSave_XP, "Save");
		CM.clickonElementbyXpath(EL.elebtnAddAccessGrop_XP, "Add Access Group");
		CM.CheckElementDisplayedbyXpath(EL.eleAdd_XP, "Add");
		CM.CheckElementDisplayedbyXpath(EL.elerefreshi_XP, "Refresh img");
		CM.CheckElementDisplayedbyXpath(EL.elefilter_XP, "Filteer img");
		CM.CheckElementDisplayedbyXpath(EL.eleNamE_XP, "Name");
		CM.CheckElementDisplayedbyXpath(EL.eleDesC_XP, "Description");
		CM.CheckElementDisplayedbyXpath(EL.Dis, "Other Designations");
		CM.enteringDataintoTextfiledByXpath(EL.eleAccessS_XP, Accessgroupname, "Search");
		driver.findElement(By.xpath("//input[@id='txtsearchAssociateGroup']")).sendKeys(Keys.ENTER);
		Thread.sleep(500);
		CM.clickonElementbyXpath(EL.eleChekbox_XP, "Chekbox");
		CM.clickonElementbyXpath(EL.eleAssSave_XP, "Save");
		Thread.sleep(1000);
		CM.clickonElementbyXpath(EL.eleSavess_XP, "Save");
		CM.CheckElementDisplayedbyXpath(EL.eleActionHEA_XP, "Justification for Action");
		CM.CheckElementDisplayedbyXpath(EL.elePrefilled_XP, "Prefilled Reason");
		CM.CheckElementDisplayedbyXpath(EL.eleCustom_XP, "Custom Reason");
		CM.CheckElementDisplayedbyXpath(EL.eleclose_XP, "CLOSE");
		CM.selectValueinDropdownselectbyvalueXpath(EL.eleREason_XP, "11", "Prefilled Reason");
		CM.clickonElementbyXpath(EL.eleSave_XP, "Save");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
//user
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
		WebElement Name1 = driver.findElement(By.xpath(
				"//div[@class='EmployeeNameformError error-wrap']//div[@class='fa fa-exclamation-circle exc-icon cursor-pointer']"));
		try {

			Name1.click();
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

	CM.selectValueinDropdownByVisualtextbyXpath(EL.eleLOCA_XP, Locationname, "Location");
	CM.selectValueinDropdownByVisualtextbyID(EL.eleDepartmentss_XP, DepartmentName," Department");
	CM.selectValueinDropdownByVisualtextbyID(EL.eleAdminmanagers_XP, Adminmanager, "Admin manager");
	CM.enteringDataintoTextfiledByXpath(EL.eleDesiglevel_XP, Designationname, "Designation Level");
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
	}

	


