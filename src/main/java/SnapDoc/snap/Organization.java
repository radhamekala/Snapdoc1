package SnapDoc.snap;

import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class Organization extends TestBase {

	// Organization
	String orgNumber = "4"; // Admin input number
	String ADDorgreason = "Organization reason"; // admin reason

	String Locationname = "AUROO pharma";
	String Shortcode = "AUROO unit 6";
	String Description = "AUROO pharma private limited";
	String Addres1 = "AR Nagar";
	String Addres2 = "Sangareddy";
	String Country = "India";
	String State = "Telangana";
	String CityName = "Hyd";
	String Zipcode = "500050";



	public void Organizations() throws InterruptedException {
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
	}

	public void Locationname() {

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

	}

	public void Locationname1() throws InterruptedException {

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
	}

//	missing shortcode display field required
	public void Shortcode1() {
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

	}

	public void Shortcode2() {

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

	}

	public void Descriptions() {

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
	}

	public void Address1() {

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
	}

	public void Address2() {

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
	}

	public void Country() {

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

	}

	public void State() throws InterruptedException {
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
	}

//	public void filters() throws InterruptedException {
//		WebElement active = driver.findElement(By.xpath("(//label[text()='Active'])[1]"));
//		WebElement Inactive = driver.findElement(By.xpath("(//label[text()='Inactive'])[1]"));
//		WebElement All = driver.findElement(By.xpath("(//label[text()='All'])[1]"));
//
//		active.click();
//		Thread.sleep(200);
//		Inactive.click();
//		Thread.sleep(200);
//		All.click();
//		Thread.sleep(200);
//		CM.CheckElementDisplayedbyXpath(EL.elerefresh_XP, "refresh");
//		CM.clickonElementbyXpath(EL.eleArrowdown_XP, "Arrowdown");
//		CM.CheckElementDisplayedbyXpath(EL.ele5_XP, "5");
//		CM.CheckElementDisplayedbyXpath(EL.ele10_XP, "10");
//		CM.CheckElementDisplayedbyXpath(EL.ele20_XP, "20");
//		CM.CheckElementDisplayedbyXpath(EL.ele50_XP, "50");
//		CM.clickonElementbyXpath(EL.ele5_XP, "5");
//		String pages = driver.findElement(By.xpath("//div[@class='t-status-text']")).getText();
////CM.clickonElementbyXpath(Addres2, Addres1);
//
//		CM.clickonElementbyXpath(EL.eletoggle_XP, "Aurobindo toggle");
////	CM.CheckElementDisplayedbyXpath(EL.elepencilicon_XP, "Pencil icon");
////	CM.clickonElementbyXpath(EL.eleEdit_XP, "Edit");
////	CM.CheckElementDisplayedbyXpath(EL.eleviewicon_XP, "View icon");

//	}

}
//public void justify() throws InterruptedException {
//WebElement Admin = driver.findElement(By.xpath("//div[text()='Admin']"));
//
//AS.moveToElement(Admin).perform();
//Admin.findElement(By.xpath("//span[@class='sub-tlt'][normalize-space()='Justifications']"));
//try {
//	wait.until(ExpectedConditions.visibilityOfElementLocated(
//			By.xpath("//span[@class='sub-tlt'][normalize-space()='Justifications']")));
//	boolean element = driver
//			.findElement(By.xpath("//span[@class='sub-tlt'][normalize-space()='Justifications']"))
//			.isDisplayed();
//	if (element) {
//		System.out.println("Justifications is Displaying");
//	} else {
//		System.out.println("Justifications Not Displaying");
//	}
//
//} catch (Exception e) {
//	System.out.println("not able  to validate Display element");
//	System.out.println("Exception : " + e);
//
//}
//WebElement organizationToggle = driver
//		.findElement(By.xpath("//td[text()='Admin-->>Organization ']/parent::tr/td[5]"));
//try {
//	organizationToggle.click();
//} catch (StaleElementReferenceException e) {
//	organizationToggle = driver.findElement(By.xpath("//td[text()='Admin-->>Organization ']/parent::tr/td[5]"));
//	organizationToggle.click();
//}
//CM.clickonElementbyXpath(EL.eleorgedit_XP, "Edit");
//CM.CheckElementDisplayedbyXpath(EL.elePre_XP, "Pre Defined Reasons");
//CM.CheckElementDisplayedbyXpath(EL.eleSystem_XP, "System Address");
//CM.CheckElementDisplayedbyXpath(EL.eleorg_XP, "Admin-->>Organization");
//CM.CheckElementDisplayedbyXpath(EL.eleReasons_XP, "Reasons");
//CM.CheckElementDisplayedbyXpath(EL.eleReason_XP, "Reasons");
//CM.clickonElementbyXpath(EL.elebtnAdd_XP, "Add pre condition");
//driver.findElement(By.xpath("//input[@id='_Reason_" + orgNumber + "']")).sendKeys(ADDorgreason);
//CM.CheckElementDisplayedbyXpath(EL.eleClose_XP, "CLOSE POPUP");
//CM.clickonElementbyXpath(EL.elebtnSave_XP, "Save");
//Thread.sleep(300);
//CM.CheckElementDisplayedbyXpath(EL.eleActionHEA_XP, "Justification for Action");
//CM.CheckElementDisplayedbyXpath(EL.elePrefilled_XP, "Prefilled Reason");
//CM.CheckElementDisplayedbyXpath(EL.eleCustom_XP, "Custom Reason");
//CM.CheckElementDisplayedbyXpath(EL.eleclose_XP, "CLOSE");
//CM.selectValueinDropdownselectbyvalueXpath(EL.eleREason_XP, "11", "Prefilled Reason");
//CM.clickonElementbyXpath(EL.eleSave_XP, "Save");
//Thread.sleep(300);
//driver.switchTo().alert().accept();
//}
