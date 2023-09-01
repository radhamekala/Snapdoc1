package SnapDoc.snap;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class UserRoles extends TestBase {
	String RoleName = "Manager A3";
	String discription = "permissions 3";
	String Accessgroupname = "permission only dashboards";
	String Designationname = "Stores B Block Manager";
	String Shortcode = "BManager";
	String DesignationDescription = "Stores C BLOCK management";

	public void Roles() throws InterruptedException {
		Thread.sleep(4000);
		CM.clickonElementbyXpath(EL.elemenuicon_XP, "Menu icon");
		driver.findElement(By.xpath("//div[text()='Admin']")).click();
		Thread.sleep(5000);
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
		WebElement Address1 = driver.findElement(By.xpath("//div[@class='txtRoleNameformError error-wrap']/div[2]"));
		try {
			Address1.click();
			driver.findElement(By.xpath("//div[@class='txtRoleNameformError error-wrap']/div[1]")).isDisplayed();
		} catch (Exception e) {
			System.out.println(" element not displayed");
			System.out.println("Exception : " + e);
		}
		driver.findElement(By.xpath("//input[@id='txtRoleName']")).sendKeys(RoleName);

		WebElement Address2 = driver.findElement(By.xpath("//div[@class='DescriptionformError error-wrap']/div[2]"));
		try {
			Address2.click();
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
	}

	// ACCESS GROUP
	public void Accessgroup() {
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
	}

	public void Accesspermission() throws InterruptedException {
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
	}

	public void Designations() throws InterruptedException {
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
		CM.enteringDataintoTextfiledByXpath(EL.eleDesignationCode_XP, Shortcode, "Short Code");
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
	}
}
