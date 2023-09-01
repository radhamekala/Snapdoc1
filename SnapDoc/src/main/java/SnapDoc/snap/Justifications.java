package SnapDoc.snap;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Justifications<Select> extends TestBase {
//	String number = "19";
//	String globalprecondition = "documentation perpose creating";
//	String Edit = "3";
//	String globalEdit = "ss";
//	String dashboardprecondition = "documentation perpose creating";
//	String editdashboardnumbr = "4";
//	String dashboardnumber = "4";
//Global
	String addGlobalNumber = "26"; // Admin input number
	String AddGlobalreason = " new document as per approved change control"; // admin reason
	String EditGlobalreasonnmber = "3";
	String editreasonadminGlobal = "new document as per approved change control S";

//admin dashboard
	String addDashboardNumber = "9"; // Admin input number
	String ADDDashboardreason = "admin dashboard changes predefind"; // admin reason
	String EditDashboardreasonnmber = "2";
	String editreasonadminDashboard = "admin dashboard changes predefind S";
//admin
	String addadminNumber = "6"; // Admin input number
	String ADDadminreason = "Admin creating doc"; // admin reason
	String Editadminreasonnmber = "1";
	String editreasonadmin = "Admin creating doc ss";
//Admin users
	String adminuserNumber = "2"; // Admin input number
	String ADDadminuserreason = "Admin user pre defined resons"; // admin reason
	String Editadminuserreasonnmber = "1";
	String editreasonadminuser = "Admin user pre defined resons A";
//Admin Audit trail
	String adminauditrNumber = "2"; // Admin input number
	String ADDadminauditreason = "Audit trail pre defined resons"; // admin reason
	String Editadminauditreasonnmber = "1";
	String editreasonaudit = "Audit trail pre defined resons A";
//justification
	String justificationNumber = "2"; // Admin input number
	String ADDJustificationreason = "justification pre defined resons"; // admin reason
	String EditJustificationreasonumber = "1";
	String editreasonJustification = "justification pre defined resons A";
//Organization
	String orgNumber = "2"; // Admin input number
	String ADDorgreason = "Organization pre defined resons"; // admin reason
	String Editorgreasonumber = "1";
	String editreasonorg = "Organization pre defined resons A";
//setting
		String settingNumber = "2"; // Admin input number
		String ADDsettingreason = "settings pre defined resons"; // admin reason
		String Editsettingreasonumber = "1";
		String editreasonsetting = "settings pre defined resons A";
//global sequenses
		String GlobalseqNumber = "2"; // Admin input number
		String ADDglobalseqreason = "global sequenses pre defined resons"; // admin reason
		String EditGlobalseqreasonumber = "1";
		String editreasonGlobalseq = "global sequenses pre defined resons A";
//		Classifications
		String ClassificationNumber = "2"; // Admin input number
		String ADDclassificationreason = "Classifications pre defined resons"; // admin reason
		String Editclassificatonreasonumber = "1";
		String editreasonclassi = "Classifications pre defined resons A";
//		Documents
		String DocumentsNumber = "2"; // Admin input number
		String ADDDocumentsreason = "Documents pre defined resons"; // admin reason
		String EditDocumentsreasonumber = "1";
		String editreasonDocuments = "Documents pre defined resons A";
//Documents-->>Analytical
		String DocumenANtsNumber = "2"; // Admin input number
		String ADDDocumentsANreason = "Documents-->>Analytical pre defined resons"; // admin reason
		String EditDocumentsANreasonumber = "1";
		String editreasonDocumentsAN = "Documents-->>Analytical pre defined resons A";
		
	public void justification() throws InterruptedException {
		Thread.sleep(4000);

		CM.clickonElementbyXpath(EL.elemenuicon_XP, "Menu icon");
		CM.CheckElementDisplayedbyXpath(EL.elemenu1_XP, "Dashboard");
		CM.CheckElementDisplayedbyXpath(EL.elemenu2_XP, "Documents");
		CM.CheckElementDisplayedbyXpath(EL.elemenu3_XP, "Masters");
		CM.CheckElementDisplayedbyXpath(EL.elemenu4_XP, "Admin");

		WebElement Admin = driver.findElement(By.xpath("//div[text()='Admin']"));
		AS.moveToElement(Admin).perform();
		Admin.findElement(By.xpath("//span[@class='sub-tlt'][normalize-space()='Users']"));

		try {
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("//span[@class='sub-tlt'][normalize-space()='Users']")));
			boolean element = driver.findElement(By.xpath("//span[@class='sub-tlt'][normalize-space()='Users']"))
					.isDisplayed();
			if (element) {
				System.out.println("user  is Displaying");
			} else {
				System.out.println(" user is Not Displaying");
			}

		} catch (Exception e) {
			System.out.println("not able  to validate Display element");
			System.out.println("Exception : " + e);

		}
		AS.moveToElement(Admin).perform();
		Admin.findElement(By.xpath("//span[normalize-space()='Organization']"));

		try {
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("//span[normalize-space()='Organization']")));
			boolean element = driver.findElement(By.xpath("//span[normalize-space()='Organization']")).isDisplayed();
			if (element) {
				System.out.println("Organization is Displaying");
			} else {
				System.out.println("Organizationis Not Displaying");
			}

		} catch (Exception e) {
			System.out.println("not able  to validate Display element");
			System.out.println("Exception : " + e);

		}
		AS.moveToElement(Admin).perform();
		Admin.findElement(By.xpath("//span[normalize-space()='Classifications']"));
		try {
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("//span[normalize-space()='Classifications']")));
			boolean element = driver.findElement(By.xpath("//span[normalize-space()='Classifications']")).isDisplayed();
			if (element) {
				System.out.println("Classifications is Displaying");
			} else {
				System.out.println("Classifications Not Displaying");
			}

		} catch (Exception e) {
			System.out.println("not able  to validate Display element");
			System.out.println("Exception : " + e);

		}
		AS.moveToElement(Admin).perform();
		Admin.findElement(By.xpath("//span[normalize-space()='Settings']"));
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space()='Settings']")));
			boolean element = driver.findElement(By.xpath("//span[normalize-space()='Settings']")).isDisplayed();
			if (element) {
				System.out.println("Settings is Displaying");
			} else {
				System.out.println("Settings Not Displaying");
			}

		} catch (Exception e) {
			System.out.println("not able  to validate Display element");
			System.out.println("Exception : " + e);

		}
		AS.moveToElement(Admin).perform();
		Admin.findElement(By.xpath("//span[normalize-space()='Global Sequences']"));
		try {
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("//span[normalize-space()='Global Sequences']")));
			boolean element = driver.findElement(By.xpath("//span[normalize-space()='Global Sequences']"))
					.isDisplayed();
			if (element) {
				System.out.println("Global Sequences is Displaying");
			} else {
				System.out.println("Global Sequences Not Displaying");
			}

		} catch (Exception e) {
			System.out.println("not able  to validate Display element");
			System.out.println("Exception : " + e);

		}
		AS.moveToElement(Admin).perform();
		Admin.findElement(By.xpath("//span[normalize-space()='Audit Trail']"));
		try {
			wait.until(
					ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space()='Audit Trail']")));
			boolean element = driver.findElement(By.xpath("//span[normalize-space()='Audit Trail']")).isDisplayed();
			if (element) {
				System.out.println("Audit Trail is Displaying");
			} else {
				System.out.println("Audit Trail Not Displaying");
			}

		} catch (Exception e) {
			System.out.println("not able  to validate Display element");
			System.out.println("Exception : " + e);

		}
		AS.moveToElement(Admin).perform();
		Admin.findElement(By.xpath("//span[@class='sub-tlt'][normalize-space()='Justifications']"));
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath("//span[@class='sub-tlt'][normalize-space()='Justifications']")));
			boolean element = driver
					.findElement(By.xpath("//span[@class='sub-tlt'][normalize-space()='Justifications']"))
					.isDisplayed();
			if (element) {
				System.out.println("Justifications is Displaying");
			} else {
				System.out.println("Justifications Not Displaying");
			}

		} catch (Exception e) {
			System.out.println("not able  to validate Display element");
			System.out.println("Exception : " + e);

		}

		AS.moveToElement(Admin).perform();
		Admin.findElement(By.xpath("//span[@class='sub-tlt'][normalize-space()='Justifications']")).click();
		CM.CheckElementDisplayedbyXpath(EL.eleactiveMenu_XP, " Admin|Users");
		CM.clickonElementbyXpath(EL.eletogglearrow_XP, "Toggle arrow");
		CM.CheckElementDisplayedbyXpath(EL.eleUs_XP, "Us");
		CM.CheckElementDisplayedbyXpath(EL.eleUsers_XP, "Users");
		CM.CheckElementDisplayedbyXpath(EL.eleOr_XP, "Or");
		CM.CheckElementDisplayedbyXpath(EL.eleOrganization_XP, "Organization");
		CM.CheckElementDisplayedbyXpath(EL.eleCi_XP, "Cl");
		CM.CheckElementDisplayedbyXpath(EL.eleClassifications_XP, "Classifications");
		CM.CheckElementDisplayedbyXpath(EL.eleSe_XP, "Se");
		CM.CheckElementDisplayedbyXpath(EL.eleSettings_XP, "Settings");
		CM.CheckElementDisplayedbyXpath(EL.eleGI_XP, "Gl");
		CM.CheckElementDisplayedbyXpath(EL.eleGlobal_XP, "Global Sequences");
		CM.CheckElementDisplayedbyXpath(EL.eleAu_XP, "Au");
		CM.CheckElementDisplayedbyXpath(EL.eleAudit_XP, "Audit Trail");
		CM.CheckElementDisplayedbyXpath(EL.eleJu_XP, "Ju");
		CM.CheckElementDisplayedbyXpath(EL.eleJustifications_XP, "Justifications");
		CM.CheckElementDisplayedbyXpath(EL.eleJustificationshea_XP, "Justifications");
		CM.CheckElementDisplayedbyXpath(EL.elejust_XP, "Justifications");
		CM.CheckElementDisplayedbyXpath(EL.elesyadd_XP, "System Address");
		CM.CheckElementDisplayedbyXpath(EL.elePredefined_XP, "No Predefined Reasons");
//// Global pre defined reason add//
////		CM.CheckElementDisplayedbyXpath(EL.eleGlobals_XP, "Global");
////		WebElement GlobalToggle = driver.findElement(By.xpath("//td[text()='Global']/parent::tr/td[5]"));
////		try {
////			GlobalToggle.click();
////		} catch (StaleElementReferenceException e) {
////			GlobalToggle = driver.findElement(By.xpath("//td[text()='Global']/parent::tr/td[5]"));
////			GlobalToggle.click();
////		}
////		CM.clickonElementbyXpath(EL.eleglobaledit_XP, "Edit");
////		CM.CheckElementDisplayedbyXpath(EL.elePre_XP, "Pre Defined Reasons");
////		CM.CheckElementDisplayedbyXpath(EL.eleSystem_XP, "System Address");
////		CM.CheckElementDisplayedbyXpath(EL.eleGlobalA_XP, "Global");
////		CM.CheckElementDisplayedbyXpath(EL.eleReasons_XP, "Reasons");
////		CM.CheckElementDisplayedbyXpath(EL.eleReason_XP, "Reasons");
////		CM.clickonElementbyXpath(EL.elebtnAdd_XP, "Add pre condition");
////		driver.findElement(By.xpath("//input[@id='_Reason_" + addGlobalNumber + "']")).sendKeys(AddGlobalreason);
////		CM.CheckElementDisplayedbyXpath(EL.eleClose_XP, "CLOSE POPUP");
////		CM.clickonElementbyXpath(EL.elebtnSave_XP, "Save");
////		CM.CheckElementDisplayedbyXpath(EL.eleActionHEA_XP, "Justification for Action");
////		CM.CheckElementDisplayedbyXpath(EL.elePrefilled_XP, "Prefilled Reason");
////		CM.CheckElementDisplayedbyXpath(EL.eleCustom_XP, "Custom Reason");
////		CM.CheckElementDisplayedbyXpath(EL.eleclose_XP, "CLOSE");
////		
////		
////		CM.selectValueinDropdownselectbyvalueXpath(EL.eleREason_XP, "1", "Prefilled Reason");
////		CM.clickonElementbyXpath(EL.eleSave_XP, "Save");
////		Thread.sleep(300);
////		driver.switchTo().alert().accept();
///// Global pre defind reson Edit//
//		try {
//			GlobalToggle.click();
//		} catch (StaleElementReferenceException e) {
//			GlobalToggle = driver.findElement(By.xpath("//td[text()='Global']/parent::tr/td[5]"));
//			GlobalToggle.click();
//		}
//		CM.clickonElementbyXpath(EL.eleglobaledit_XP, "Edit");
//		Thread.sleep(500);
//		driver.findElement(By.xpath("//input[@id='Reason_" + EditGlobalreasonnmber + "']"))
//				.sendKeys(editreasonadminGlobal);
//		CM.clickonElementbyXpath(EL.elebtnSave_XP, "Save");
//		
//		CM.selectValueinDropdownselectbyvalueXpath(EL.eleREason_XP, "20", "Prefilled Reason");
//		CM.clickonElementbyXpath(EL.eleSave_XP, "Save");
//		Thread.sleep(300);
//		driver.switchTo().alert().accept();
////Dashboard pre defined reasion add//
//		CM.CheckElementDisplayedbyXpath(EL.eleDashboard_XP, "Dashboard");
//		WebElement dashboardToggle = driver.findElement(By.xpath("//td[text()='Dashboard']/parent::tr/td[5]"));
//		try {
//			dashboardToggle.click();
//		} catch (StaleElementReferenceException e) {
//			dashboardToggle = driver.findElement(By.xpath("//td[text()='Dashboard']/parent::tr/td[5]"));
//			dashboardToggle.click();
//		}
//		CM.clickonElementbyXpath(EL.eleDashboardedit_XP, "Edit");
//		CM.CheckElementDisplayedbyXpath(EL.elePre_XP, "Pre Defined Reasons");
//		CM.CheckElementDisplayedbyXpath(EL.eleSystem_XP, "System Address");
//		CM.CheckElementDisplayedbyXpath(EL.eleDashboards_XP, "Dashboard");
//		CM.CheckElementDisplayedbyXpath(EL.eleReasons_XP, "Reasons");
//		CM.CheckElementDisplayedbyXpath(EL.eleReason_XP, "Reasons");
//		CM.clickonElementbyXpath(EL.elebtnAdd_XP, "Add pre condition");
//
//		// admin dashboard
//		driver.findElement(By.xpath("//input[@id='_Reason_" + addDashboardNumber + "']")).sendKeys(ADDDashboardreason);
//		CM.CheckElementDisplayedbyXpath(EL.eleClose_XP, "CLOSE POPUP");
//		CM.clickonElementbyXpath(EL.elebtnSave_XP, "Save");
//		CM.CheckElementDisplayedbyXpath(EL.eleActionHEA_XP, "Justification for Action");
//		CM.CheckElementDisplayedbyXpath(EL.elePrefilled_XP, "Prefilled Reason");
//		CM.CheckElementDisplayedbyXpath(EL.eleCustom_XP, "Custom Reason");
//		CM.CheckElementDisplayedbyXpath(EL.eleclose_XP, "CLOSE");
//		CM.selectValueinDropdownselectbyvalueXpath(EL.eleREason_XP, "7", "Prefilled Reason");
//		CM.clickonElementbyXpath(EL.eleSave_XP, "Save");
//		Thread.sleep(300);
//		driver.switchTo().alert().accept();
//////	Edit for Dashboard pre defind reasion//
//		try {
//			dashboardToggle.click();
//		} catch (StaleElementReferenceException e) {
//			dashboardToggle = driver.findElement(By.xpath("//td[text()='Dashboard']/parent::tr/td[5]"));
//			dashboardToggle.click();
//		}
//		CM.clickonElementbyXpath(EL.eleDashboardedit_XP, "Edit");
//		driver.findElement(By.xpath("//input[@id='Reason_" + EditDashboardreasonnmber + "']"))
//				.sendKeys(editreasonadminDashboard);
//		CM.clickonElementbyXpath(EL.elebtnSave_XP, "Save");
//		CM.selectValueinDropdownselectbyvalueXpath(EL.eleREason_XP, "8", "Prefilled Reason");
//		CM.clickonElementbyXpath(EL.eleSave_XP, "Save");
//		Thread.sleep(300);
//		driver.switchTo().alert().accept();
////// Admin reason add//
//		WebElement AdminToggle = driver.findElement(By.xpath("//td[text()='Admin']/parent::tr/td[5]"));
//		try {
//			AdminToggle.click();
//		} catch (StaleElementReferenceException e) {
//			AdminToggle = driver.findElement(By.xpath("//td[text()='Admin']/parent::tr/td[5]"));
//			AdminToggle.click();
//		}
//		CM.clickonElementbyXpath(EL.eleadminedit_XP, "Edit");
//		CM.CheckElementDisplayedbyXpath(EL.elePre_XP, "Pre Defined Reasons");
//		CM.CheckElementDisplayedbyXpath(EL.eleSystem_XP, "System Address");
//		CM.CheckElementDisplayedbyXpath(EL.eleadmins_XP, "admin");
//		CM.CheckElementDisplayedbyXpath(EL.eleReasons_XP, "Reasons");
//		CM.CheckElementDisplayedbyXpath(EL.eleReason_XP, "Reasons");
//		CM.clickonElementbyXpath(EL.elebtnAdd_XP, "Add pre condition");
//		driver.findElement(By.xpath("//input[@id='_Reason_" + addadminNumber + "']")).sendKeys(ADDadminreason);
//		CM.CheckElementDisplayedbyXpath(EL.eleClose_XP, "CLOSE POPUP");
//		CM.clickonElementbyXpath(EL.elebtnSave_XP, "Save");
//		CM.CheckElementDisplayedbyXpath(EL.eleActionHEA_XP, "Justification for Action");
//		CM.CheckElementDisplayedbyXpath(EL.elePrefilled_XP, "Prefilled Reason");
//		CM.CheckElementDisplayedbyXpath(EL.eleCustom_XP, "Custom Reason");
//		CM.CheckElementDisplayedbyXpath(EL.eleclose_XP, "CLOSE");
//		CM.selectValueinDropdownselectbyvalueXpath(EL.eleREason_XP, "3", "Prefilled Reason");
//		CM.clickonElementbyXpath(EL.eleSave_XP, "Save");
//		Thread.sleep(300);
//		driver.switchTo().alert().accept();
//////Edit for admin pre defind reasion//
//		try {
//			AdminToggle.click();
//		} catch (StaleElementReferenceException e) {
//			AdminToggle = driver.findElement(By.xpath("//td[text()='Admin']/parent::tr/td[5]"));
//			AdminToggle.click();
//		}
//		CM.clickonElementbyXpath(EL.eleadminedit_XP, "Edit");
//		driver.findElement(By.xpath("//input[@id='Reason_" + Editadminreasonnmber + "']")).sendKeys(editreasonadmin);
//		CM.clickonElementbyXpath(EL.elebtnSave_XP, "Save");
//		CM.selectValueinDropdownselectbyvalueXpath(EL.eleREason_XP, "4", "Prefilled Reason");
//		CM.clickonElementbyXpath(EL.eleSave_XP, "Save");
//		Thread.sleep(300);
//		driver.switchTo().alert().accept();

// Admin users pre defind reasons////

//		WebElement AdminuserToggle = driver.findElement(By.xpath("//td[text()='Admin-->>Users']/parent::tr/td[5]"));
//		try {
//			AdminuserToggle.click();
//		} catch (StaleElementReferenceException e) {
//			AdminuserToggle = driver.findElement(By.xpath("//td[text()='Admin-->>Users']/parent::tr/td[5]"));
//			AdminuserToggle.click();
//		}
//		CM.clickonElementbyXpath(EL.eleadminuseredit_XP, "Edit");
//		CM.CheckElementDisplayedbyXpath(EL.elePre_XP, "Pre Defined Reasons");
//		CM.CheckElementDisplayedbyXpath(EL.eleSystem_XP, "System Address");
//		CM.CheckElementDisplayedbyXpath(EL.eleadminsuser_XP, "admin user");
//		CM.CheckElementDisplayedbyXpath(EL.eleReasons_XP, "Reasons");
//		CM.CheckElementDisplayedbyXpath(EL.eleReason_XP, "Reasons");
//		CM.clickonElementbyXpath(EL.elebtnAdd_XP, "Add pre condition");
//		driver.findElement(By.xpath("//input[@id='_Reason_" + adminuserNumber + "']")).sendKeys(ADDadminuserreason);
////input[@id='_Reason_7']
//		CM.CheckElementDisplayedbyXpath(EL.eleClose_XP, "CLOSE POPUP");
//		CM.clickonElementbyXpath(EL.elebtnSave_XP, "Save");
//		Thread.sleep(300);
//		CM.CheckElementDisplayedbyXpath(EL.eleActionHEA_XP, "Justification for Action");
//		CM.CheckElementDisplayedbyXpath(EL.elePrefilled_XP, "Prefilled Reason");
//		CM.CheckElementDisplayedbyXpath(EL.eleCustom_XP, "Custom Reason");
//		CM.CheckElementDisplayedbyXpath(EL.eleclose_XP, "CLOSE");
//		CM.selectValueinDropdownselectbyvalueXpath(EL.eleREason_XP, "23", "Prefilled Reason");
//		CM.clickonElementbyXpath(EL.eleSave_XP, "Save");
//		Thread.sleep(300);
//		driver.switchTo().alert().accept();
////Edit pre reasons//
//
//		try {
//			AdminuserToggle.click();
//		} catch (StaleElementReferenceException e) {
//			AdminuserToggle = driver.findElement(By.xpath("//td[text()='Admin-->>Users']/parent::tr/td[5]"));
//			AdminuserToggle.click();
//		}
//		CM.clickonElementbyXpath(EL.eleadminuseredit_XP, "Edit");
//		driver.findElement(By.xpath("//input[@id='Reason_" + Editadminuserreasonnmber + "']"))
//				.sendKeys(editreasonadminuser);
//		CM.clickonElementbyXpath(EL.elebtnSave_XP, "Save");
//		CM.selectValueinDropdownselectbyvalueXpath(EL.eleREason_XP, "6", "Prefilled Reason");
//		CM.clickonElementbyXpath(EL.eleSave_XP, "Save");
//		Thread.sleep(300);
//		driver.switchTo().alert().accept();
////admin audit trail  pre defind reasons//
//
//		WebElement auditrailToggle = driver
//				.findElement(By.xpath("//td[text()='Admin-->>Audit Trail']/parent::tr/td[5]"));
//		try {
//			auditrailToggle.click();
//		} catch (StaleElementReferenceException e) {
//			auditrailToggle = driver.findElement(By.xpath("//td[text()='Admin-->>Audit Trail']/parent::tr/td[5]"));
//			auditrailToggle.click();
//		}
//
//		CM.clickonElementbyXpath(EL.eleadminaditedit_XP, "Edit");
//		CM.CheckElementDisplayedbyXpath(EL.elePre_XP, "Pre Defined Reasons");
//		CM.CheckElementDisplayedbyXpath(EL.eleSystem_XP, "System Address");
//		CM.CheckElementDisplayedbyXpath(EL.eleadminaudit_XP, "Admin-->>Audit Trail");
//		CM.CheckElementDisplayedbyXpath(EL.eleReasons_XP, "Reasons");
//		CM.CheckElementDisplayedbyXpath(EL.eleReason_XP, "Reasons");
//		CM.clickonElementbyXpath(EL.elebtnAdd_XP, "Add pre condition");
//		driver.findElement(By.xpath("//input[@id='_Reason_" + adminauditrNumber + "']")).sendKeys(ADDadminauditreason);
//		CM.CheckElementDisplayedbyXpath(EL.eleClose_XP, "CLOSE POPUP");
//		CM.clickonElementbyXpath(EL.elebtnSave_XP, "Save");
//		Thread.sleep(300);
//		CM.CheckElementDisplayedbyXpath(EL.eleActionHEA_XP, "Justification for Action");
//		CM.CheckElementDisplayedbyXpath(EL.elePrefilled_XP, "Prefilled Reason");
//		CM.CheckElementDisplayedbyXpath(EL.eleCustom_XP, "Custom Reason");
//		CM.CheckElementDisplayedbyXpath(EL.eleclose_XP, "CLOSE");
//		CM.selectValueinDropdownselectbyvalueXpath(EL.eleREason_XP, "7", "Prefilled Reason");
//		CM.clickonElementbyXpath(EL.eleSave_XP, "Save");
//		Thread.sleep(300);
//		driver.switchTo().alert().accept();
//		// Edit pre reasons//
//
//		try {
//			auditrailToggle.click();
//		} catch (StaleElementReferenceException e) {
//			auditrailToggle = driver.findElement(By.xpath("//td[text()='Admin-->>Audit Trail']/parent::tr/td[5]"));
//			auditrailToggle.click();
//		}
//		CM.clickonElementbyXpath(EL.eleadminaditedit_XP, "Edit");
//		driver.findElement(By.xpath("//input[@id='Reason_" + Editadminauditreasonnmber + "']"))
//				.sendKeys(editreasonaudit);
//		CM.clickonElementbyXpath(EL.elebtnSave_XP, "Save");
//		CM.selectValueinDropdownselectbyvalueXpath(EL.eleREason_XP, "8", "Prefilled Reason");
//		CM.clickonElementbyXpath(EL.eleSave_XP, "Save");
//		Thread.sleep(300);
//		driver.switchTo().alert().accept();
////admin justification  pre defind reasons//
//		WebElement justificationToggle = driver
//				.findElement(By.xpath("//td[text()='Admin-->>Justifications']/parent::tr/td[5]"));
//		try {
//			justificationToggle.click();
//		} catch (StaleElementReferenceException e) {
//			justificationToggle = driver
//					.findElement(By.xpath("//td[text()='Admin-->>Justifications']/parent::tr/td[5]"));
//			justificationToggle.click();
//		}
//		CM.clickonElementbyXpath(EL.elejustificedit_XP, "Edit");
//		CM.CheckElementDisplayedbyXpath(EL.elePre_XP, "Pre Defined Reasons");
//		CM.CheckElementDisplayedbyXpath(EL.eleSystem_XP, "System Address");
//		CM.CheckElementDisplayedbyXpath(EL.elejusti_XP, "Admin-->>Justifications");
//		CM.CheckElementDisplayedbyXpath(EL.eleReasons_XP, "Reasons");
//		CM.CheckElementDisplayedbyXpath(EL.eleReason_XP, "Reasons");
//		CM.clickonElementbyXpath(EL.elebtnAdd_XP, "Add pre condition");
//		driver.findElement(By.xpath("//input[@id='_Reason_" + justificationNumber + "']"))
//				.sendKeys(ADDJustificationreason);
//		CM.CheckElementDisplayedbyXpath(EL.eleClose_XP, "CLOSE POPUP");
//		CM.clickonElementbyXpath(EL.elebtnSave_XP, "Save");
//		Thread.sleep(300);
//		CM.CheckElementDisplayedbyXpath(EL.eleActionHEA_XP, "Justification for Action");
//		CM.CheckElementDisplayedbyXpath(EL.elePrefilled_XP, "Prefilled Reason");
//		CM.CheckElementDisplayedbyXpath(EL.eleCustom_XP, "Custom Reason");
//		CM.CheckElementDisplayedbyXpath(EL.eleclose_XP, "CLOSE");
//		CM.selectValueinDropdownselectbyvalueXpath(EL.eleREason_XP, "9", "Prefilled Reason");
//		CM.clickonElementbyXpath(EL.eleSave_XP, "Save");
//		Thread.sleep(300);
//		driver.switchTo().alert().accept();
////Edit pre reasons//
//		try {
//			justificationToggle.click();
//		} catch (StaleElementReferenceException e) {
//			justificationToggle = driver
//					.findElement(By.xpath("//td[text()='Admin-->>Justifications']/parent::tr/td[5]"));
//			justificationToggle.click();
//		}
//		CM.clickonElementbyXpath(EL.elejustificedit_XP, "Edit");
//		driver.findElement(By.xpath("//input[@id='Reason_" + EditJustificationreasonumber + "']"))
//				.sendKeys(editreasonJustification);
//		CM.clickonElementbyXpath(EL.elebtnSave_XP, "Save");
//		CM.selectValueinDropdownselectbyvalueXpath(EL.eleREason_XP, "10", "Prefilled Reason");
//		CM.clickonElementbyXpath(EL.eleSave_XP, "Save");
//		Thread.sleep(300);
//		driver.switchTo().alert().accept();
////Admin Organization  pre defind reasons//
//
//		WebElement organizationToggle = driver
//				.findElement(By.xpath("//td[text()='Admin-->>Organization ']/parent::tr/td[5]"));
//		try {
//			organizationToggle.click();
//		} catch (StaleElementReferenceException e) {
//			organizationToggle = driver.findElement(By.xpath("//td[text()='Admin-->>Organization ']/parent::tr/td[5]"));
//			organizationToggle.click();
//		}
//		CM.clickonElementbyXpath(EL.eleorgedit_XP, "Edit");
//		CM.CheckElementDisplayedbyXpath(EL.elePre_XP, "Pre Defined Reasons");
//		CM.CheckElementDisplayedbyXpath(EL.eleSystem_XP, "System Address");
//		CM.CheckElementDisplayedbyXpath(EL.eleorg_XP, "Admin-->>Organization");
//		CM.CheckElementDisplayedbyXpath(EL.eleReasons_XP, "Reasons");
//		CM.CheckElementDisplayedbyXpath(EL.eleReason_XP, "Reasons");
//		CM.clickonElementbyXpath(EL.elebtnAdd_XP, "Add pre condition");
//
//		driver.findElement(By.xpath("//input[@id='_Reason_" + orgNumber + "']")).sendKeys(ADDorgreason);
//		CM.CheckElementDisplayedbyXpath(EL.eleClose_XP, "CLOSE POPUP");
//		CM.clickonElementbyXpath(EL.elebtnSave_XP, "Save");
//		Thread.sleep(300);
//		CM.CheckElementDisplayedbyXpath(EL.eleActionHEA_XP, "Justification for Action");
//		CM.CheckElementDisplayedbyXpath(EL.elePrefilled_XP, "Prefilled Reason");
//		CM.CheckElementDisplayedbyXpath(EL.eleCustom_XP, "Custom Reason");
//		CM.CheckElementDisplayedbyXpath(EL.eleclose_XP, "CLOSE");
//		CM.selectValueinDropdownselectbyvalueXpath(EL.eleREason_XP, "11", "Prefilled Reason");
//		CM.clickonElementbyXpath(EL.eleSave_XP, "Save");
//		Thread.sleep(300);
//		driver.switchTo().alert().accept();
////Edit pre reasons//
//		try {
//			organizationToggle.click();
//		} catch (StaleElementReferenceException e) {
//			organizationToggle = driver.findElement(By.xpath("//td[text()='Admin-->>Organization ']/parent::tr/td[5]"));
//			organizationToggle.click();
//		}
//		CM.clickonElementbyXpath(EL.eleorgedit_XP, "Edit");
//		driver.findElement(By.xpath("//input[@id='Reason_" + Editorgreasonumber + "']")).sendKeys(editreasonorg);
//		CM.clickonElementbyXpath(EL.elebtnSave_XP, "Save");
//		CM.selectValueinDropdownselectbyvalueXpath(EL.eleREason_XP, "12", "Prefilled Reason");
//		CM.clickonElementbyXpath(EL.eleSave_XP, "Save");
//		Thread.sleep(300);
//		driver.switchTo().alert().accept();
//settings//
//		WebElement settingsToggle = driver
//				.findElement(By.xpath("//td[text()='Admin-->>Settings ']/parent::tr/td[5]"));
//		try {
//			settingsToggle.click();
//		} catch (StaleElementReferenceException e) {
//			settingsToggle = driver.findElement(By.xpath("//td[text()='Admin-->>Settings ']/parent::tr/td[5]"));
//			settingsToggle.click();
//		}
//		CM.clickonElementbyXpath(EL.elesettingedit_XP, "Edit");
//		CM.CheckElementDisplayedbyXpath(EL.elePre_XP, "Pre Defined Reasons");
//		CM.CheckElementDisplayedbyXpath(EL.eleSystem_XP, "System Address");
//		CM.CheckElementDisplayedbyXpath(EL.elesetting_XP, "Admin-->>Settings ");
//		CM.CheckElementDisplayedbyXpath(EL.eleReasons_XP, "Reasons");
//		CM.CheckElementDisplayedbyXpath(EL.eleReason_XP, "Reasons");
//		CM.clickonElementbyXpath(EL.elebtnAdd_XP, "Add pre condition");
//		driver.findElement(By.xpath("//input[@id='_Reason_" + settingNumber + "']")).sendKeys(ADDsettingreason);
//		CM.CheckElementDisplayedbyXpath(EL.eleClose_XP, "CLOSE POPUP");
//		CM.clickonElementbyXpath(EL.elebtnSave_XP, "Save");
//		Thread.sleep(300);
//		CM.CheckElementDisplayedbyXpath(EL.eleActionHEA_XP, "Justification for Action");
//		CM.CheckElementDisplayedbyXpath(EL.elePrefilled_XP, "Prefilled Reason");
//		CM.CheckElementDisplayedbyXpath(EL.eleCustom_XP, "Custom Reason");
//		CM.CheckElementDisplayedbyXpath(EL.eleclose_XP, "CLOSE");
//		CM.selectValueinDropdownselectbyvalueXpath(EL.eleREason_XP, "11", "Prefilled Reason");
//		CM.clickonElementbyXpath(EL.eleSave_XP, "Save");
//		Thread.sleep(300);
//		driver.switchTo().alert().accept();
////Edit pre reasons//
//		try {
//			settingsToggle.click();
//		} catch (StaleElementReferenceException e) {
//			settingsToggle = driver.findElement(By.xpath("//td[text()='Admin-->>Settings ']/parent::tr/td[5]"));
//			settingsToggle.click();
//		}
//		CM.clickonElementbyXpath(EL.elesettingedit_XP, "Edit");
//		driver.findElement(By.xpath("//input[@id='Reason_" + Editsettingreasonumber + "']")).sendKeys(editreasonsetting);
//		CM.clickonElementbyXpath(EL.elebtnSave_XP, "Save");
//		CM.selectValueinDropdownselectbyvalueXpath(EL.eleREason_XP, "12", "Prefilled Reason");
//		CM.clickonElementbyXpath(EL.eleSave_XP, "Save");
//		Thread.sleep(300);
//		driver.switchTo().alert().accept();
//Admin global sequenses
		
//				WebElement GlobalsequeToggle = driver
//						.findElement(By.xpath("//td[text()='Admin-->>Global Sequences']/parent::tr/td[5]"));
//				try {
//					GlobalsequeToggle.click();
//				} catch (StaleElementReferenceException e) {
//					GlobalsequeToggle = driver.findElement(By.xpath("//td[text()='Admin-->>Global Sequences']/parent::tr/td[5]"));
//					GlobalsequeToggle.click();
//				}
//				CM.clickonElementbyXpath(EL.eleglobalsedit_XP, "Edit");
//				CM.CheckElementDisplayedbyXpath(EL.elePre_XP, "Pre Defined Reasons");
//				CM.CheckElementDisplayedbyXpath(EL.eleSystem_XP, "System Address");
//				CM.CheckElementDisplayedbyXpath(EL.eleglobal_XP, "Admin-->>Global Sequences ");
//				CM.CheckElementDisplayedbyXpath(EL.eleReasons_XP, "Reasons");
//				CM.CheckElementDisplayedbyXpath(EL.eleReason_XP, "Reasons");
//				CM.clickonElementbyXpath(EL.elebtnAdd_XP, "Add pre condition");
//				driver.findElement(By.xpath("//input[@id='_Reason_" + GlobalseqNumber + "']")).sendKeys(ADDglobalseqreason);
//				CM.CheckElementDisplayedbyXpath(EL.eleClose_XP, "CLOSE POPUP");
//				CM.clickonElementbyXpath(EL.elebtnSave_XP, "Save");
//				Thread.sleep(300);
//				CM.CheckElementDisplayedbyXpath(EL.eleActionHEA_XP, "Justification for Action");
//				CM.CheckElementDisplayedbyXpath(EL.elePrefilled_XP, "Prefilled Reason");
//				CM.CheckElementDisplayedbyXpath(EL.eleCustom_XP, "Custom Reason");
//				CM.CheckElementDisplayedbyXpath(EL.eleclose_XP, "CLOSE");
//				CM.selectValueinDropdownselectbyvalueXpath(EL.eleREason_XP, "11", "Prefilled Reason");
//				CM.clickonElementbyXpath(EL.eleSave_XP, "Save");
//				Thread.sleep(300);
//				driver.switchTo().alert().accept();
//		//Edit pre reasons//
//				try {
//					GlobalsequeToggle.click();
//				} catch (StaleElementReferenceException e) {
//					GlobalsequeToggle = driver.findElement(By.xpath("//td[text()='Admin-->>Global Sequences']/parent::tr/td[5]"));
//					GlobalsequeToggle.click();
//				}
//				CM.clickonElementbyXpath(EL.eleglobalsedit_XP, "Edit");
//				driver.findElement(By.xpath("//input[@id='Reason_" + EditGlobalseqreasonumber + "']")).sendKeys(editreasonGlobalseq);
//				CM.clickonElementbyXpath(EL.elebtnSave_XP, "Save");
//				CM.selectValueinDropdownselectbyvalueXpath(EL.eleREason_XP, "12", "Prefilled Reason");
//				CM.clickonElementbyXpath(EL.eleSave_XP, "Save");
//				Thread.sleep(300);
//				driver.switchTo().alert().accept();

//Admin-->>Classifications pre defined resons
				WebElement ClassificateToggle = driver
						.findElement(By.xpath("//td[text()='Admin-->>Classifications']/parent::tr/td[5]"));
				try {
					ClassificateToggle.click();
				} catch (StaleElementReferenceException e) {
					ClassificateToggle = driver.findElement(By.xpath("//td[text()='Admin-->>Classifications']/parent::tr/td[5]"));
					ClassificateToggle.click();
				}
				CM.clickonElementbyXpath(EL.eleClassiedit_XP, "Edit");
				CM.CheckElementDisplayedbyXpath(EL.elePre_XP, "Pre Defined Reasons");
				CM.CheckElementDisplayedbyXpath(EL.eleSystem_XP, "System Address");
				CM.CheckElementDisplayedbyXpath(EL.eleClassi_XP, "Admin-->>Classifications");
				CM.CheckElementDisplayedbyXpath(EL.eleReasons_XP, "Reasons");
				CM.CheckElementDisplayedbyXpath(EL.eleReason_XP, "Reasons");
				CM.clickonElementbyXpath(EL.elebtnAdd_XP, "Add pre condition");
				driver.findElement(By.xpath("//input[@id='_Reason_" + ClassificationNumber + "']")).sendKeys(ADDclassificationreason);
				CM.CheckElementDisplayedbyXpath(EL.eleClose_XP, "CLOSE POPUP");
				CM.clickonElementbyXpath(EL.elebtnSave_XP, "Save");
				Thread.sleep(300);
				CM.CheckElementDisplayedbyXpath(EL.eleActionHEA_XP, "Justification for Action");
				CM.CheckElementDisplayedbyXpath(EL.elePrefilled_XP, "Prefilled Reason");
				CM.CheckElementDisplayedbyXpath(EL.eleCustom_XP, "Custom Reason");
				CM.CheckElementDisplayedbyXpath(EL.eleclose_XP, "CLOSE");
				CM.selectValueinDropdownselectbyvalueXpath(EL.eleREason_XP, "4", "Prefilled Reason");
				CM.clickonElementbyXpath(EL.eleSave_XP, "Save");
				Thread.sleep(300);
				driver.switchTo().alert().accept();
		//Edit pre reasons//
				try {
					ClassificateToggle.click();
				} catch (StaleElementReferenceException e) {
					ClassificateToggle = driver.findElement(By.xpath("//td[text()='Admin-->>Classifications']/parent::tr/td[5]"));
					ClassificateToggle.click();
				}
				CM.clickonElementbyXpath(EL.eleClassiedit_XP, "Edit");
				driver.findElement(By.xpath("//input[@id='Reason_" + Editclassificatonreasonumber + "']")).sendKeys(editreasonclassi);
				CM.clickonElementbyXpath(EL.elebtnSave_XP, "Save");
				CM.selectValueinDropdownselectbyvalueXpath(EL.eleREason_XP, "5", "Prefilled Reason");
				CM.clickonElementbyXpath(EL.eleSave_XP, "Save");
				Thread.sleep(300);
				driver.switchTo().alert().accept();
//Documents
				WebElement DocumentsToggle = driver
						.findElement(By.xpath("//td[text()='Documents']/parent::tr/td[5]"));
				try {
					DocumentsToggle.click();
				} catch (StaleElementReferenceException e) {
					DocumentsToggle = driver.findElement(By.xpath("//td[text()='Documents']/parent::tr/td[5]"));
					DocumentsToggle.click();
				}
				CM.clickonElementbyXpath(EL.eleDocedit_XP, "Edit");
				CM.CheckElementDisplayedbyXpath(EL.elePre_XP, "Pre Defined Reasons");
				CM.CheckElementDisplayedbyXpath(EL.eleSystem_XP, "System Address");
				CM.CheckElementDisplayedbyXpath(EL.eleDocument_XP, "Documents");
				CM.CheckElementDisplayedbyXpath(EL.eleReasons_XP, "Reasons");
				CM.CheckElementDisplayedbyXpath(EL.eleReason_XP, "Reasons");
				CM.clickonElementbyXpath(EL.elebtnAdd_XP, "Add pre condition");
				driver.findElement(By.xpath("//input[@id='_Reason_" + DocumentsNumber + "']")).sendKeys(ADDDocumentsreason);
				CM.CheckElementDisplayedbyXpath(EL.eleClose_XP, "CLOSE POPUP");
				CM.clickonElementbyXpath(EL.elebtnSave_XP, "Save");
				Thread.sleep(300);
				CM.CheckElementDisplayedbyXpath(EL.eleActionHEA_XP, "Justification for Action");
				CM.CheckElementDisplayedbyXpath(EL.elePrefilled_XP, "Prefilled Reason");
				CM.CheckElementDisplayedbyXpath(EL.eleCustom_XP, "Custom Reason");
				CM.CheckElementDisplayedbyXpath(EL.eleclose_XP, "CLOSE");
				CM.selectValueinDropdownselectbyvalueXpath(EL.eleREason_XP, "6", "Prefilled Reason");
				CM.clickonElementbyXpath(EL.eleSave_XP, "Save");
				Thread.sleep(300);
				driver.switchTo().alert().accept();
		//Edit pre reasons//
				try {
					DocumentsToggle.click();
				} catch (StaleElementReferenceException e) {
					DocumentsToggle = driver.findElement(By.xpath("//td[text()='Documents']/parent::tr/td[5]"));
					DocumentsToggle.click();
				}
				CM.clickonElementbyXpath(EL.eleDocedit_XP, "Edit");
				driver.findElement(By.xpath("//input[@id='Reason_" + EditDocumentsreasonumber + "']")).sendKeys(editreasonDocuments);
				CM.clickonElementbyXpath(EL.elebtnSave_XP, "Save");
				CM.selectValueinDropdownselectbyvalueXpath(EL.eleREason_XP, "7", "Prefilled Reason");
				CM.clickonElementbyXpath(EL.eleSave_XP, "Save");
				Thread.sleep(300);
				driver.switchTo().alert().accept();
//Documents-->>Analytical
				WebElement DocumentsAnalyticalToggle = driver
						.findElement(By.xpath("//td[text()='Documents-->>Analytical']/parent::tr/td[5]"));
				try {
					DocumentsAnalyticalToggle.click();
				} catch (StaleElementReferenceException e) {
					DocumentsAnalyticalToggle = driver.findElement(By.xpath("//td[text()='Documents-->>Analytical']/parent::tr/td[5]"));
					DocumentsAnalyticalToggle.click();
				}
				CM.clickonElementbyXpath(EL.eleDocanedit_XP, "Edit");
				CM.CheckElementDisplayedbyXpath(EL.elePre_XP, "Pre Defined Reasons");
				CM.CheckElementDisplayedbyXpath(EL.eleSystem_XP, "System Address");
				CM.CheckElementDisplayedbyXpath(EL.eleDocumentan_XP, "Documents-->>Analytical");
				CM.CheckElementDisplayedbyXpath(EL.eleReasons_XP, "Reasons");
				CM.CheckElementDisplayedbyXpath(EL.eleReason_XP, "Reasons");
				CM.clickonElementbyXpath(EL.elebtnAdd_XP, "Add pre condition");
				driver.findElement(By.xpath("//input[@id='_Reason_" + DocumenANtsNumber + "']")).sendKeys(ADDDocumentsANreason);
				CM.CheckElementDisplayedbyXpath(EL.eleClose_XP, "CLOSE POPUP");
				CM.clickonElementbyXpath(EL.elebtnSave_XP, "Save");
				Thread.sleep(300);
				CM.CheckElementDisplayedbyXpath(EL.eleActionHEA_XP, "Justification for Action");
				CM.CheckElementDisplayedbyXpath(EL.elePrefilled_XP, "Prefilled Reason");
				CM.CheckElementDisplayedbyXpath(EL.eleCustom_XP, "Custom Reason");
				CM.CheckElementDisplayedbyXpath(EL.eleclose_XP, "CLOSE");
				CM.selectValueinDropdownselectbyvalueXpath(EL.eleREason_XP, "8", "Prefilled Reason");
				CM.clickonElementbyXpath(EL.eleSave_XP, "Save");
				Thread.sleep(300);
				driver.switchTo().alert().accept();
		//Edit pre reasons//
				try {
					DocumentsAnalyticalToggle.click();
				} catch (StaleElementReferenceException e) {
					DocumentsAnalyticalToggle = driver.findElement(By.xpath("//td[text()='Documents-->>Analytical']/parent::tr/td[5]"));
					DocumentsAnalyticalToggle.click();
				}
				CM.clickonElementbyXpath(EL.eleDocanedit_XP, "Edit");
				driver.findElement(By.xpath("//input[@id='Reason_" + EditDocumentsANreasonumber + "']")).sendKeys(editreasonDocumentsAN);
				CM.clickonElementbyXpath(EL.elebtnSave_XP, "Save");
				CM.selectValueinDropdownselectbyvalueXpath(EL.eleREason_XP, "9", "Prefilled Reason");
				CM.clickonElementbyXpath(EL.eleSave_XP, "Save");
				Thread.sleep(300);
				driver.switchTo().alert().accept();
				
	}

}
