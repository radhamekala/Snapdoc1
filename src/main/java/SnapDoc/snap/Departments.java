package SnapDoc.snap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class Departments extends TestBase {
	String DepartmentName = "HRMS management";
	String DepartmentCode = "product 1 ";
	String Descriptions = "product department  ";

//	 quality control in this Department
	public void Deparment1() throws InterruptedException {

		CM.clickonElementbyXpath(EL.elemenuicon_XP, "Menu icon");
		WebElement Admin = driver.findElement(By.xpath("//div[text()='Admin']"));
		AS.moveToElement(Admin).perform();
		Admin.findElement(By.xpath("//span[normalize-space()='Organization']")).click();
		Thread.sleep(500);
		CM.clickonElementbyXpath(EL.eleDepartments_XP, "Departments");
		CM.clickonElementbyXpath(EL.eleAdddepart_XP, "Add department (Add)");
		CM.clickonElementbyXpath(EL.eleSaves_XP, "Save");
		CM.clickonElementbyXpath(EL.eleDepREQ_XP, "This field is required");
		CM.CheckElementDisplayedbyXpath(EL.eleReq1_XP, "This field is required");
		CM.clickonElementbyXpath(EL.eleCodREQ_XP, "Short code req");
		CM.CheckElementDisplayedbyXpath(EL.eleReq2_XP, "This field is required");
		CM.clickonElementbyXpath(EL.eleDisREQ_XP, "Discription req");
		CM.CheckElementDisplayedbyXpath(EL.eleReq3_XP, "This field is required");

		WebElement Discription = driver.findElement(By.xpath(
				"//div[@class='DescriptionformError error-wrap']//div[@class='fa fa-exclamation-circle exc-icon cursor-pointer']"));
		try {
//			Discription.click();
			driver.findElement(By.xpath(
					"//div[@class='DescriptionformError error-wrap']//div[@class='fa fa-exclamation-circle exc-icon cursor-pointer']"))
					.isDisplayed();
			if (Descriptions.length() > 6 && Descriptions.length() < 600) {

				driver.findElement(By.xpath("//textarea[@id='Description']")).sendKeys(Descriptions);
				System.out.println("Discription  " + Descriptions.length());
			} else {
				driver.findElement(By.xpath("//textarea[@id='Description']")).sendKeys(Descriptions);
				CM.clickonElementbyXpath(EL.eleSaves_XP, "Save");
				driver.findElement(By.xpath(
						"//div[@class='DescriptionformError error-wrap']//div[@class='fa fa-exclamation-circle exc-icon cursor-pointer']"))
						.click();
				System.out.println("* Please fill the Description with 6-600 characters");

			}
		} catch (Exception e) {
			System.out.println(" element not displayed");
			System.out.println("Exception : " + e);
		}
		CM.clickonElementbyXpath(EL.eleCloses_XP, "Close");
	}

	public void department() throws InterruptedException {
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

		if (Descriptions.length() > 6 && Descriptions.length() < 600) {
			//
			driver.findElement(By.xpath("//textarea[@id='Description']")).sendKeys(Descriptions);
			System.out.println("Discription  " + Descriptions.length());
		} else {
			driver.findElement(By.xpath("//textarea[@id='Description']")).sendKeys(Descriptions);
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
	}

	public void Edit() throws InterruptedException {
		WebElement Department = driver
				.findElement(By.xpath("//td[text()='Stores ']/parent::tr/td[6]/div[@class='inficon dotIcon']"));
		Department.click();
		Thread.sleep(300);
		driver.findElement(By.xpath("(//a[text()='Edit'])[12]")).click();
		driver.findElement(By.xpath("//span[text()='Edit Department']")).isDisplayed();
		CM.CheckElementDisplayedbyXpath(EL.eleDepName_XP, "Department Name");
		CM.CheckElementDisplayedbyXpath(EL.eleDepNameMAN_XP, "Department Name(*)");
		CM.CheckElementDisplayedbyXpath(EL.eleDepDis_XP, "Department Discription");
		CM.CheckElementDisplayedbyXpath(EL.eledepDisman_XP, "Department Discription(*)");
		CM.CheckElementDisplayedbyXpath(EL.elesCode_XP, "Short code");
		CM.CheckElementDisplayedbyXpath(EL.eleshorman_XP, "Short code (*)");
		CM.CheckElementDisplayedbyXpath(EL.eleCloses_XP, "Close");
		driver.findElement(By.xpath("//input[@id='DepartmentName']")).clear();
		CM.enteringDataintoTextfiledByXpath(EL.eleDepartmentName_XP, "Stores", "DepartmentName");
		driver.findElement(By.xpath("//input[@id='DepartmentCode']")).clear();
		CM.enteringDataintoTextfiledByXpath(EL.eleDepartmentCode_XP, "ST", "DepartmentCode");
		driver.findElement(By.xpath("//textarea[@id='Description']")).clear();
		CM.enteringDataintoTextfiledByXpath(EL.eleDescriptionS_XP, "product Stores  ", "Discription");
		CM.clickonElementbyXpath(EL.eleSaves_XP, "Save");
		CM.CheckElementDisplayedbyXpath(EL.eleActionHEA_XP, "Justification for Action");
		CM.CheckElementDisplayedbyXpath(EL.elePrefilled_XP, "Prefilled Reason");
		CM.CheckElementDisplayedbyXpath(EL.eleCustom_XP, "Custom Reason");
		CM.CheckElementDisplayedbyXpath(EL.eleclose_XP, "CLOSE");
		CM.selectValueinDropdownselectbyvalueXpath(EL.eleREason_XP, "4", "Prefilled Reason");
		CM.clickonElementbyXpath(EL.eleSave_XP, "Save");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(300);
	}

	public void ViewChange() throws InterruptedException {
//		WebElement Department2 =driver.findElement(By.xpath("//td[text()='Stores ']/parent::tr/td[6]"));
//		Department2.click();
		Thread.sleep(3000);
		CM.clickonElementbyXpath(EL.eleStores_XP, "Stores");
		Thread.sleep(5000);
		CM.clickonElementbyXpath(EL.eleview_XP, "View history");
		Thread.sleep(5000);
		CM.CheckElementDisplayedbyXpath(EL.eleviewheader_XP, "");
		CM.CheckElementDisplayedbyXpath(EL.elesearch_XP, "Search bar");
		CM.CheckElementDisplayedbyXpath(EL.eleTraid_XP, "Transaction ID");
		CM.CheckElementDisplayedbyXpath(EL.eleItemid_XP, "Item ID");
		CM.CheckElementDisplayedbyXpath(EL.eleAction_XP, "Action");
		CM.CheckElementDisplayedbyXpath(EL.eleSubAction_XP, "Sub Action");
		CM.CheckElementDisplayedbyXpath(EL.eleEntity_XP, "Entity");
		CM.CheckElementDisplayedbyXpath(EL.eleField_XP, "Field");
		CM.CheckElementDisplayedbyXpath(EL.eledatetime_XP, "Date & Time");
		CM.CheckElementDisplayedbyXpath(EL.eleuser_XP, "User");
		CM.CheckElementDisplayedbyXpath(EL.elejustif_XP, "Justification");

		CM.CheckElementDisplayedbyXpath(EL.elebutton_XP, "btn Collapse Expand Audit History");
		CM.clickonElementbyXpath(EL.eleExpand_XP, "Expand add action view");
		CM.clickonElementbyXpath(EL.elecloses_XP, "close");

	}

	public void Deactivate() throws InterruptedException {
		Thread.sleep(3000);
		CM.clickonElementbyXpath(EL.eleStores_XP, "Stores");
		Thread.sleep(5000);
		CM.clickonElementbyXpath(EL.eleDeactivate_XP, "Deactivate");
		driver.switchTo().alert().accept();
		Thread.sleep(300);
		CM.CheckElementDisplayedbyXpath(EL.eleActionHEA_XP, "Justification for Action");
		CM.CheckElementDisplayedbyXpath(EL.elePrefilled_XP, "Prefilled Reason");
		CM.CheckElementDisplayedbyXpath(EL.eleCustom_XP, "Custom Reason");
		CM.CheckElementDisplayedbyXpath(EL.eleclose_XP, "CLOSE");
		CM.selectValueinDropdownselectbyvalueXpath(EL.eleREason_XP, "4", "Prefilled Reason");
		CM.clickonElementbyXpath(EL.eleSave_XP, "Save");
		Thread.sleep(2000);
	}

	public void Reactivate() throws InterruptedException {
		WebElement active = driver.findElement(By.xpath("(//input[@id='DepartmentStatus'])[1]"));
		WebElement Inactive = driver.findElement(By.xpath("(//input[@id='DepartmentStatus'])[2]"));
		WebElement All = driver.findElement(By.xpath("(//input[@id='DepartmentStatus'])[3]"));
		active.click();
		Thread.sleep(2000);
		All.click();
		Thread.sleep(2000);
		Inactive.click();
		Thread.sleep(2000);
		CM.CheckElementDisplayedbyXpath(EL.eleDepname_XP, "Department Name");
		CM.CheckElementDisplayedbyXpath(EL.eleShotc_XP, "Short Code");
		CM.CheckElementDisplayedbyXpath(EL.eleDescrip_XP, "Description");
		CM.clickonElementbyXpath(EL.eleStorestoggle_XP, "Stores toggle");
		CM.CheckElementDisplayedbyXpath(EL.eleView_XP, "View change");
        CM.clickonElementbyXpath(EL.eleReactive_XP, "Reactive");
        driver.switchTo().alert().accept();
		Thread.sleep(300);
		CM.CheckElementDisplayedbyXpath(EL.eleActionHEA_XP, "Justification for Action");
		CM.CheckElementDisplayedbyXpath(EL.elePrefilled_XP, "Prefilled Reason");
		CM.CheckElementDisplayedbyXpath(EL.eleCustom_XP, "Custom Reason");
		CM.CheckElementDisplayedbyXpath(EL.eleclose_XP, "CLOSE");
		CM.selectValueinDropdownselectbyvalueXpath(EL.eleREason_XP, "4", "Prefilled Reason");
		CM.clickonElementbyXpath(EL.eleSave_XP, "Save");
		Thread.sleep(2000);
		CM.CheckElementDisplayedbyXpath(EL.elerefresh_XP, "refresh");
		CM.clickonElementbyXpath(EL.eleArrowdown_XP, "Arrowdown");
		CM.CheckElementDisplayedbyXpath(EL.ele5_XP, "5");
		CM.CheckElementDisplayedbyXpath(EL.ele10_XP, "10");
		CM.CheckElementDisplayedbyXpath(EL.ele20_XP, "20");
		CM.CheckElementDisplayedbyXpath(EL.ele50_XP, "50");
		CM.clickonElementbyXpath(EL.ele5_XP, "5");

	}

}// td[text()='Stores
	// ']/parent::tr/td[6]/div[2]/div/div[3]/div[2]/a[text()='Deactivate']
