package SnapDoc.snap;

import static org.testng.Assert.assertEquals;

import org.apache.commons.collections4.comparators.BooleanComparator;
import org.apache.poi.ss.formula.functions.LookupUtils.CompareResult;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import io.github.bonigarcia.wdm.versions.VersionComparator;

public class iniciate extends TestBase {

	String TypeName = "aripipra";
	String TypeName2 = " aripipra ";
	String Title = "initiated";
	String OrgID = "Org152";
	String Number = "152";
	String displayNumber = " 152 (Org152) ";
	String SubDOcNumber = "152 (Org152)";
	String vertion = "0";
	String expected = "Atovas\n152 (Org152) Ver 0.00";// title orgid number version
	String Settingpresys = "A4 Potrait\nPre Approved";
	String Description = "Atovastatin 500mg";
	String Material = "150 CC LW HDPE Container ( MT0189 ) ";
	String Asset = "Air Compressor ( 2EN/E-005 ) ";
	String USER = "Amit Kumar Jena (12335)";
	String Products = "Abacavir Tablets IP 300 mg ( 13001374 ) ";

	String Reviewer1 = "Ankita Ghosh (12079)";
	String Reviewer1username = "ankita.ghosh";
	String Password = "demo";
	String Reviewer2 = "G Appala Naidu (12128)";
	String Reviewer2username = "appala.naidu";
	String Reviewer3 = "Arun Kumar Singh (12390)";
	String Reviewer3username = "arun.singh";
	//
	String Approver1 = "Mr C S Reddy (10447)";
	String Approver1username = "cs.reddy";
	String Approver2 = "Samir Paul (12098)";
	String Approver2username = "samir.paul";
	String Approver3 = "MSR Reddy (20309)";
	String Approver3username = "sr.reddy";
	String Approve = "Approve";
	String Reject = "Reject";
	String Resubmit = "Resubmit";

	String username = "admin";
	String password = "infi";
	String DocumentCategoryname = "Analytical";
	String Subcategoryname = "Specification";
	String Reviewer1remarks = "NO";

	public void Analytical() throws InterruptedException {
		CM.clickonElementbyXpath(EL.elemenuicon_XP, "Menu icon");
		WebElement Documents = driver.findElement(By.xpath("//div[text()='Documents']"));
		AS.moveToElement(Documents).perform();
		Documents.findElement(By.xpath("//span[@class='sub-tlt'][normalize-space()='" + DocumentCategoryname + "']"))
				.click();
		Thread.sleep(4000);
	}

	public void iniciation() throws InterruptedException {
		Thread.sleep(3000);
		CM.clickonElementbyXpath(EL.eleInitiate_XP, "Initiate");
		Thread.sleep(2000);
		CM.selectValueinDropdownByVisualtextbyXpath(EL.eleAddtype_XP, TypeName, "Addtype");
		CM.enteringDataintoTextfiledByXpath(EL.eleDocNumber_XP, Number, "Document number");
		CM.enteringDataintoTextfiledByXpath(EL.eletxtTitle_XP, Title, "txtTitle_1");
		Thread.sleep(2000);
		CM.enteringDataintoTextfiledByXpath(EL.eletxtNumber_XP, OrgID, "org id");
		Thread.sleep(2000);
		CM.enteringDataintoTextfiledByXpath(EL.eleVersionNo_XP, vertion, "txtVersionNo_1");
		CM.selectValueinDropdownselectbyvalueXpath(EL.eledoclayoutp_XP, "1", "Select docu Lyout");
		CM.enteringDataintoTextfiledByXpath(EL.eleDescriptions1_XP, Description, "Description");
		Thread.sleep(1000);
//		CM.CheckElementDisplayedbyXpath(EL.elecheckedprimary_XP, "Primary checked");

//		CM.clickonElementbyXpath(EL.eleLocation1_XP, "Location");
//		Thread.sleep(1500);
//		WebElement ele = driver.findElement(By.xpath("//div[text()='Unit-II']"));
//		AS.doubleClick(ele).perform();
//		WebElement deparment = driver.findElement(By.xpath("//div[text()='Quality Assurance']"));
//		AS.doubleClick(deparment).perform();
//		CM.selectValueinDropdownByVisualtextbyXpath(EL.eleselectmaterial_XP, Material, "Material");
//		CM.selectValueinDropdownByVisualtextbyXpath(EL.eleAsset_XP, Asset, "Asset");
//		CM.selectValueinDropdownByVisualtextbyXpath(EL.eleusers_XP, USER, "User");
//		CM.selectValueinDropdownByVisualtextbyXpath(EL.eleproduct_XP, Products, "Product");
//		CM.clickonElementbyXpath(EL.eleSaVe_XP, "Save");
//		Thread.sleep(500);
		driver.findElement(By.xpath("//i[@class='fa fa-upload']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\SSD\\Downloads\\pdf [3].pdf");
		Thread.sleep(500);
		CM.clickonElementbyXpath(EL.eleSaVe_XP, "Save");
		CM.clickonElementbyXpath(EL.eleSubmit_XP, "Submit");
		Thread.sleep(500);
		CM.selectValueinDropdownByVisualtextbyXpath(EL.eleApproverUserId2_XP, Reviewer1, "Reviewer1");
		CM.selectValueinDropdownByVisualtextbyXpath(EL.eleApproverUserId3_XP, Reviewer2, "Reviewer2");
		CM.selectValueinDropdownByVisualtextbyXpath(EL.eleApproverUserId4_XP, Reviewer3, "Reviewer3");

		CM.selectValueinDropdownByVisualtextbyXpath(EL.eleApproverUserId5_XP, Approver1, "Approver1");
		CM.selectValueinDropdownByVisualtextbyXpath(EL.eleApproverUserId6_XP, Approver2, "Approver2");
		CM.selectValueinDropdownByVisualtextbyXpath(EL.eleApproverUserId7_XP, Approver3, "Approver3");
		CM.clickonElementbyXpath(EL.elesubmitapprover_XP, "Submit iniciate");
		Thread.sleep(300);
		CM.CheckElementDisplayedbyXpath(EL.eleActionHEA_XP, "Justification for Action");

		CM.CheckElementDisplayedbyXpath(EL.elePrefilled_XP, "Prefilled Reason");
		CM.CheckElementDisplayedbyXpath(EL.eleCustom_XP, "Custom Reason");
		CM.CheckElementDisplayedbyXpath(EL.eleclose_XP, "CLOSE");
		Thread.sleep(500);
		// Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@value='2']")).click();
//		driver.findElement(By.xpath("//textarea[@id='txtAuditComments']")).sendKeys("document iniciation for product packing ");
		CM.selectValueinDropdownselectbyvalueXpath(EL.eleREason_XP, "2", "Prefilled Reason");
		CM.clickonElementbyXpath(EL.eleSave_XP, "Save");
		Thread.sleep(500);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);

	}

	public void Status() throws InterruptedException {
		try {
			WebElement Displaynumber = driver.findElement(By.xpath("//a[text()='" + displayNumber + "']"));
			if (Displaynumber.isDisplayed()) {
				System.out.println("Displaynumber displayed");
			} else {
				System.out.println("Displaynumber not displayed");
			}

		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
//title name
		try {
			WebElement Titlename = driver.findElement(By.xpath("//a[text()='" + displayNumber
					+ "']/parent::td /following-sibling::td[text()='" + Title + "'][1]"));
			if (Titlename.isDisplayed()) {
				System.out.println("Titlename displayed");
			} else {
				System.out.println("Titlename not displayed");
			}

		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
// typename
		try {
			WebElement Typename = driver.findElement(By.xpath("//a[text()='" + displayNumber
					+ "']/parent::td /following-sibling::td[2]/ul/li[text()='" + TypeName2 + "']"));
			if (Typename.isDisplayed()) {
				System.out.println("Typename displayed");
			} else {
				System.out.println("Typename not displayed");
			}

		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
// typethree dot

		try {
			WebElement typethreedot = driver.findElement(By.xpath("//a[text()='" + displayNumber
					+ "']/parent::td/following-sibling::td[2]//i[@class='bi bi-three-dots']"));
			typethreedot.click();
			System.out.println("type s checking three dot symble");
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
//Threedot inside typename 
		try {
			WebElement insidetypename = driver.findElement(By.xpath("//a[text()='" + displayNumber
					+ "']/parent::td/following-sibling::td[2]//ul[@class='first_assoc_block']/li[1]/p[text()='Type']"));
			if (insidetypename.isDisplayed()) {
				System.out.println("insidetypename displayed");
			} else {
				System.out.println("insidetypename not displayed");
			}

		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}

//type value
		try {
			WebElement typevalue = driver.findElement(By.xpath("//a[text()='" + displayNumber
					+ "']/parent::td/following-sibling::td[2]//ul[@class='first_assoc_block']/li[1]/p[text()='"
					+ TypeName + "']"));
			if (typevalue.isDisplayed()) {
				System.out.println("type value displayed");
			} else {
				System.out.println("type value not displayed");
			}

		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
//Category
		try {
			WebElement Category = driver.findElement(By.xpath("//a[text()='" + displayNumber
					+ "']/parent::td/following-sibling::td[2]//ul[@class='first_assoc_block']/li[2]/p[text()='Category']"));
			if (Category.isDisplayed()) {
				System.out.println("Category displayed");
			} else {
				System.out.println("Category not displayed");
			}

		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
//categoryvalue
		try {
			WebElement categoryvalue = driver.findElement(By.xpath("//a[text()='" + displayNumber
					+ "']/parent::td/following-sibling::td[2]//ul[@class='first_assoc_block']/li[2]/p[text()='"
					+ DocumentCategoryname + "']"));
			if (categoryvalue.isDisplayed()) {
				System.out.println("categoryvalue displayed");
			} else {
				System.out.println("categoryvalue not displayed");
			}

		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
//sub category name

		try {
			WebElement Subcategoryname = driver.findElement(By.xpath("//a[text()='" + displayNumber
					+ "']/parent::td/following-sibling::td[2]//ul[@class='first_assoc_block']/li[3]/p[text()='Sub Category']"));
			if (Subcategoryname.isDisplayed()) {
				System.out.println("Subcategoryname displayed");
			} else {
				System.out.println("Subcategoryname not displayed");
			}

		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
//sub category name value
		try {
			WebElement Subcategorynamevalue = driver.findElement(By.xpath("//a[text()='" + displayNumber
					+ "']/parent::td/following-sibling::td[2]//ul[@class='first_assoc_block']/li[3]/p[text()='"
					+ Subcategoryname + "']"));
			if (Subcategorynamevalue.isDisplayed()) {
				System.out.println("Subcategorynamevalue displayed");
			} else {
				System.out.println("Subcategorynamevalue not displayed");
			}

		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
//three dot toggle
		try {
			WebElement toggle = driver.findElement(By.xpath("//a[text()='" + displayNumber
					+ "']/parent::td/following-sibling::td/div[@class='inficon dotIcon']"));
			toggle.click();
			System.out.println("toggle clicked");

		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
//view document
		try {
			WebElement Viewdoc = driver.findElement(By.xpath("//a[text()='" + displayNumber
					+ "']/parent::td/following-sibling::td/div[2]//a[text()='View Document']"));
			if (Viewdoc.isDisplayed()) {
				System.out.println("Viewdoc displayed");
			} else {
				System.out.println("Viewdoc not displayed");
			}

		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
//Uncontrolled Print
		try {
			WebElement uncontroledprint = driver.findElement(By.xpath("//a[text()='" + displayNumber
					+ "']/parent::td/following-sibling::td/div[2]//a[text()='Uncontrolled Print']"));
			if (uncontroledprint.isDisplayed()) {
				System.out.println("uncontroledprint displayed");
			} else {
				System.out.println("uncontroledprint not displayed");
			}

		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
//Print History'
		try {
			WebElement printhistory = driver.findElement(By.xpath("//a[text()='" + displayNumber
					+ "']/parent::td/following-sibling::td/div[2]//a[text()='Print History']"));
			if (printhistory.isDisplayed()) {
				System.out.println("printhistory displayed");
			} else {
				System.out.println("printhistory not displayed");
			}

		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
//Change History

		try {
			WebElement Changehistory = driver.findElement(By.xpath("//a[text()='" + displayNumber
					+ "']/parent::td/following-sibling::td/div[2]//a[text()='Change History']"));
			if (Changehistory.isDisplayed()) {
				System.out.println("Changehistory displayed");
			} else {
				System.out.println("Changehistory not displayed");
			}

		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
//Past Versions
		try {
			WebElement pastversions = driver.findElement(By.xpath("//a[text()='" + displayNumber
					+ "']/parent::td/following-sibling::td/div[2]//a[text()='Past Versions']"));
			if (pastversions.isDisplayed()) {
				System.out.println("pastversions displayed");
			} else {
				System.out.println("pastversions not displayed");
			}

		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}

		WebElement Status = driver.findElement(By.xpath("//a[text()='" + displayNumber
				+ "']/parent::td/following-sibling::td[text()='Creation']/sup[text()='*']"));
		if (Status.isDisplayed()) {
			System.out.println("sended the file for Reviewer");
			Thread.sleep(500);
		} else {
			System.out.println("still file not send to reviewer and approval");
			Thread.sleep(500);
		}

		CM.clickonElementbyXpath(EL.eleUsersetting_XP, "USER SETTINGS");
		CM.clickonElementbyXpath(EL.eleLogout_XP, "Log out");
		Thread.sleep(300);
	}

//Reviewer1			
	public void Reviewers1login() throws InterruptedException {

		CM.enteringDataintoTextfiledByXpath(EL.eleUserName_XP, Reviewer1username, " UserName");
		CM.enteringDataintoTextfiledByXpath(EL.elePassword_XP, Password, "Password");
		CM.clickonElementbyXpath(EL.eleLogin_XP, "LOGIN");
		Thread.sleep(5000);
	}

	public void Reviewer1() throws InterruptedException {

		try {
			WebElement titlenemes = driver.findElement(By.xpath("//b[text()='My Approvals']"));
			if (titlenemes.isDisplayed()) {
				System.out.println("My Approvals name displayed");
			} else {
				System.out.println("My Approvals name not displayed");
			}
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);

		}

//		try {
//			WebElement titlenemes = driver.findElement(By.xpath("(//span[text()='" + displayNumber
//					+ "']/parent::td/following-sibling::td//div[text()='" + Title + "'])[2]"));
//			if (titlenemes.isDisplayed()) {
//				System.out.println("title name displayed");
//			} else {
//				System.out.println("title name not displayed");
//			}
//		} catch (Exception e) {
//			System.out.println("not able to validate");
//			System.out.println("Exception : " + e);

//		}
		// displaynumber
		try {
			WebElement number2 = driver.findElement(By.xpath(" //span[text()='" + displayNumber + "']"));
			number2.click();
			System.out.println("numbar is displayed");
		} catch (Exception e) {
			System.out.println("numbar is not displayed");
			System.out.println("Exception:" + e);
		}
		Thread.sleep(2000);
		CM.CheckElementDisplayedbyXpath(EL.eleApprovaldetails_XP, "Approval Details header");
		CM.CheckElementDisplayedbyXpath(EL.eleApprovaltype_XP, " Approval Type");
		CM.CheckElementDisplayedbyXpath(EL.eleSubmission2_XP, "Submission");
		CM.CheckElementDisplayedbyXpath(EL.eleDocnum_XP, "Doc No");
		CM.CheckElementDisplayedbyXpath(EL.eleSubmitedby_XP, "Submitted by");

		try {
			WebElement DocNO = driver.findElement(By.xpath("//td[contains(text(),'" + SubDOcNumber + "')]"));
			if (DocNO.isDisplayed()) {
				System.out.println("Doc No is displayed");
			} else {
				System.out.println("Doc no number is not displayed");
			}
		} catch (Exception e) {
			System.out.println("numbar is not displayed");
			System.out.println("Exception:" + e);
		}

		CM.CheckElementDisplayedbyXpath(EL.eleRemarks_XP, "Remarks");
		CM.CheckElementDisplayedbyXpath(EL.eleclose1_XP, "close");
		CM.CheckElementDisplayedbyXpath(EL.eleDecision1_XP, "Decision");
		CM.CheckElementDisplayedbyXpath(EL.eleUploadfile1_XP, "Upload file");
//upload file add
		CM.clickonElementbyXpath(EL.eleUploadfiles_XP, "File upload");
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\SSD\\Downloads\\pdf [3].pdf");
		CM.clickonElementbyXpath(EL.elebutsaves_XP, "Save");
		CM.CheckElementDisplayedbyXpath(EL.eledocinfo_XP, "Document Info");
		CM.CheckElementDisplayedbyXpath(EL.eledocinfoheader_XP, "Document Info Header");
		String Documentinfoheader = driver.findElement(By.xpath("(//thead[@class='t-grid-header'])[1]/tr")).getText();
		System.out.println(Documentinfoheader);

//Title&Number
		WebElement TitleNumber = driver.findElement(By.xpath("//td[@id='tdPrimaryDocTitle']"));
		String actual = TitleNumber.getText();
//        actual.replaceAll("\\r\\n|\\r|\\n", " ");
		System.out.println(actual);
		System.out.println(expected);

		if (expected.equals(actual)) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
//Description

		WebElement DiscriptioN = driver.findElement(By.xpath("//td[@id='tdPrimaryDocDescription']"));
		String actualDes = DiscriptioN.getText();
		if (Description.equals(actualDes)) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");

		}
//location &Department
		String Location = driver.findElement(By.xpath("(//td[@id='tdPrimaryDocLocationAndDepartment']//p)[1]"))
				.getText();
		System.out.println(Location);

		String Department = driver.findElement(By.xpath("(//td[@id='tdPrimaryDocLocationAndDepartment']//p)[2]"))
				.getText();
		System.out.println(Department);

//classifications
//		category
		String category = driver.findElement(By.xpath("//td[@id='tdPrimaryDocClassification']//tr[1]")).getText();
		String ActualresultCategory = "Category     : Analytical";
		System.out.println(category);
		if (ActualresultCategory.equals(category)) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");

		}
//		Subcategory		

		String subcategory = driver.findElement(By.xpath("//td[@id='tdPrimaryDocClassification']//tr[2]")).getText();
		String Subcategoryactualresult = "Subcategory : Specification";
		System.out.println(subcategory);
		if (Subcategoryactualresult.equals(subcategory)) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");

		}

//type
		String Type = driver.findElement(By.xpath("//td[@id='tdPrimaryDocClassification']//tr[3]")).getText();
		String Typeactualresult = "Types   : Analytical 11";
		System.out.println(Type);
		if (Typeactualresult.equals(Type)) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");

		}
//Associations
		String Product = driver.findElement(By.xpath("//td[@id='tdPrimaryDocAssociation']//tr[1]")).getText();
		System.out.println(Product);
		String Material = driver.findElement(By.xpath("//td[@id='tdPrimaryDocAssociation']//tr[2]")).getText();
		System.out.println(Material);
		String Asset = driver.findElement(By.xpath("//td[@id='tdPrimaryDocAssociation']//tr[3]")).getText();
		System.out.println(Asset);
		String User = driver.findElement(By.xpath("//td[@id='tdPrimaryDocAssociation']//tr[4]")).getText();
		System.out.println(User);

//Settings
		String Setting = driver.findElement(By.xpath("//td[@id='tdLayout']")).getText();
		System.out.println(Setting);
		System.out.println(Settingpresys);
		if (Settingpresys.equals(Setting)) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");

		}
//file view
//		driver.findElement(By.xpath("//img[@title='View Document']")).click();
//		Thread.sleep(2000);
//		driver.close();
//		driver.findElement(By.xpath("//img[@title='Uncontrolled Print']")).click();
//		Thread.sleep(2000);
//		driver.close();

//
		driver.findElement(By.xpath("//input[@value='Change History']")).isDisplayed();
//associated doc
		String AssociatedDocuments = driver.findElement(By.xpath("//div[@id='divAssociatedDocuments']")).getText();
		System.out.println(AssociatedDocuments);
//Approval history
		CM.CheckElementDisplayedbyXpath(EL.eleApprovalhistory_XP, "Approval history");
		CM.CheckElementDisplayedbyXpath(EL.eleTypeName_XP, "Type name");
		CM.CheckElementDisplayedbyXpath(EL.eleIniciationon_XP, "Initiated On");
		CM.CheckElementDisplayedbyXpath(EL.eleInitiBy_XP, "Initiated By");
		CM.CheckElementDisplayedbyXpath(EL.elestatuu_XP, "Status");

		String Typename = driver.findElement(By.xpath("(//div[@id='positionInfo']//td)[5]")).getText();
		System.out.println(Typename);
		String ActualresultTypename = "Submission";
		if (ActualresultTypename.equals(Typename)) {
			System.out.println("Pass");
			System.out.println("Typename=Submission");
		} else {
			System.out.println("Fail");

		}
//
		String initiationontime = driver.findElement(By.xpath("(//div[@id='positionInfo']//td)[6]")).getText();
		System.out.println(initiationontime);
//
		String initiatedby = driver.findElement(By.xpath("(//div[@id='positionInfo']//td)[7]")).getText();
		System.out.println(initiatedby);
//
		String Statuss = driver.findElement(By.xpath("(//div[@id='positionInfo']//td)[8]")).getText();
		System.out.println(Statuss);

		CM.CheckElementDisplayedbyXpath(EL.eleStepName_XP, "Step Name");
		CM.CheckElementDisplayedbyXpath(EL.eleActioN_XP, "Action");
		CM.CheckElementDisplayedbyXpath(EL.eleActedBy_XP, "Acted By");
		CM.CheckElementDisplayedbyXpath(EL.eleAcceptedON_XP, "Accepted On");
		CM.CheckElementDisplayedbyXpath(EL.eleReMarks_XP, "Remarks");
		CM.CheckElementDisplayedbyXpath(EL.elefile2_XP, "File");
//Reviewer1
		String reviewer = driver.findElement(By.xpath("(//div[@class='frmApprovalDetails']//tr)[7]")).getText();
		System.out.println(reviewer);
		String ActualReviewer = "Default Tasks for Reviewers Approved ankita.ghosh";// APPROVAL HISTORY

		if (ActualReviewer.equals(reviewer)) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");

		}
//Reviewer2
		String reviewer2 = driver.findElement(By.xpath("(//div[@class='frmApprovalDetails']//tr)[8]")).getText();
		String ActualReviewer2 = "Default Tasks for Reviewers Approved appala.naidu";
		System.out.println(reviewer2);
		if (ActualReviewer2.equals(reviewer2)) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");

		}
//Reviewer3
		String reviewer3 = driver.findElement(By.xpath("(//div[@class='frmApprovalDetails']//tr)[9]")).getText();
		String ActualReviewer3 = "Default Tasks for Reviewers Approved arun.singh";
		System.out.println(reviewer3);
		if (ActualReviewer3.equals(reviewer3)) {
			System.out.println("Pass");
		} else {

			System.out.println("Fail");

		}
//Approver1
		String Approver1 = driver.findElement(By.xpath("(//div[@class='frmApprovalDetails']//tr)[10]")).getText();
		String ActualApprover1 = "Approval 1 Pending cs.reddy";
		System.out.println(Approver1);
		if (ActualApprover1.equals(Approver1)) {
			System.out.println("Pass");
		} else {

			System.out.println("Fail");
		}
//Approver2
		String Approver2 = driver.findElement(By.xpath("(//div[@class='frmApprovalDetails']//tr)[11]")).getText();
		String ActualApprover2 = "Approval 2 Pending samir.paul";
		System.out.println(Approver2);
		if (ActualApprover2.equals(Approver2)) {
			System.out.println("Pass");
		} else {

			System.out.println("Fail");
		}
//Approver3
		String Approver3 = driver.findElement(By.xpath("(//div[@class='frmApprovalDetails']//tr)[12]")).getText();
		String ActualApprover3 = "Approval 3 Pending sr.reddy";
		System.out.println(Approver3);
		if (ActualApprover3.equals(Approver3)) {
			System.out.println("Pass");
		} else {

			System.out.println("Fail");
		}

//		String file1="C:\\Users\\SSD\\Downloads\\pdf [3].pdf";
//		String file2="http://13.127.63.63:9984/Common/ShowPDFDocument?eqs=lqsiNjsmg7DqzBwd3Jf!Md2O7~.52e.c!.6af~Hb9f!h9JTnsx1tlxglMmlnyh9JRnywBvcnyh9Jfaamk5bj-dcic-!9e4-gaf8-f!!mdh5ghbm6.yjng66ntBpxy2ExlMdi9Luyluf!binCoBFMnBziugeRjh!HnDrtg66jyAvgijzmkInCo1FteRjh!HnDrtg66jyAvgijzmkMnBziugeRjh!HnDrtg66BziAysRjh!HnDrtg66CExlSfYxwjisBf~Kjauymg66zCAg7Dfbe9b4";

//		new PdfComparator( file1, file2 ).compare();

//		WebElement file = driver.findElement(By.xpath("//img[@src='../../Images/SVGIcons/preview.svg']"));
//		file.getText();
//		System.out.println(file);
//		//////
//		PDFTextStripper pdfstriper=new PDFTextStripper();
//		String pdfText=

//		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\SSD\\Downloads\\pdf [3].pdf");

//String url ="http://www.pdf995.com/samples/pdf.pdf";
//driver.get(url);
//try {
//	String pdfContent = readPdfContent(url);
//	Assert.assertTrue(pdfContent.contains("The Pdf995 Suite offers the following features"));
//} catch (MalformedURLException e) {
//	e.printStackTrace();
//} catch (IOException e) {
//	e.printStackTrace();
//}

		CM.enteringDataintoTextfiledByXpath(EL.eleRemarksinput_XP, Reviewer1remarks, " Reviewer1remarks");

		try {
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//select[@id='Decision']")));
			Select select = new Select(driver.findElement(By.xpath("//select[@id='Decision']")));
			select.selectByVisibleText(Resubmit);

			WebElement a = select.getFirstSelectedOption();
			String selectedoption = a.getText();
			System.out.println("Selected element: " + selectedoption);
			if (selectedoption.equals("Approve")) {
				System.out.println("Approved");
				CM.clickonElementbyXpath(EL.elebtnComplete_XP, "Complete");
				driver.switchTo().alert().accept();
				Thread.sleep(2000);
				driver.switchTo().alert().accept();
				Thread.sleep(2000);
			} else if (selectedoption.equals("Resubmit")) {
				System.out.println("Resubmited");
				CM.clickonElementbyXpath(EL.elebtnComplete_XP, "Complete");
				driver.switchTo().alert().accept();
				Thread.sleep(2000);
				driver.switchTo().alert().accept();
				Thread.sleep(2000);
			} else if (selectedoption.equals("Reject")) {
				System.out.println("Reject");
				CM.clickonElementbyXpath(EL.elebtnComplete_XP, "Complete");
				driver.switchTo().alert().accept();
				Thread.sleep(2000);
				driver.switchTo().alert().accept();
				Thread.sleep(2000);
			}

		} catch (Exception e) {
			System.out.println("not able select " + Approve);
			System.out.println("Exception : " + e);
		}

		CM.clickonElementbyXpath(EL.eleUsersetting_XP, "USER SETTINGS");
		CM.clickonElementbyXpath(EL.eleLogout_XP, "Log out");
		Thread.sleep(1000);
	}

	// submit
	public void adminresubmit() throws InterruptedException {

		// admin login
		CM.enteringDataintoTextfiledByXpath(EL.eleUserName_XP, username, " UserName");
		CM.enteringDataintoTextfiledByXpath(EL.elePassword_XP, Password, "Password");
		CM.clickonElementbyXpath(EL.eleLogin_XP, "LOGIN");
		Thread.sleep(5000);

		CM.clickonElementbyXpath(EL.elemenuicon_XP, "Menu icon");
		WebElement Documents = driver.findElement(By.xpath("//div[text()='Documents']"));
		AS.moveToElement(Documents).perform();
		Documents.findElement(By.xpath("//span[@class='sub-tlt'][normalize-space()='" + DocumentCategoryname + "']"))
				.click();
		Thread.sleep(4000);

		WebElement AStatus = driver.findElement(
				By.xpath("//a[text()='" + displayNumber + "']/parent::td/following-sibling::td[text()='Creation'][1]"));
		if (AStatus.isDisplayed()) {
			System.out.println("Resubmited file status in creation ==pass");
			Thread.sleep(500);
		} else {
			System.out.println("Resubmited file status not changed ==fail");
			Thread.sleep(500);
		}

//			------
		// three dot toggle
		try {
			WebElement toggle = driver.findElement(By.xpath("//a[text()='" + displayNumber
					+ "']/parent::td/following-sibling::td/div[@class='inficon dotIcon']"));
			toggle.click();
			System.out.println("toggle clicked");

		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
		// Submit
		try {
			WebElement Viewdoc1 = driver.findElement(By.xpath(
					"//a[text()='" + displayNumber + "']/parent::td/following-sibling::td/div[2]//a[text()='Submit']"));
			if (Viewdoc1.isDisplayed()) {
				System.out.println("Viewdoc displayed");
			} else {
				System.out.println("Viewdoc not displayed");
			}

		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
		// Uncontrolled Print
		try {
			WebElement uncontroledprint = driver.findElement(By.xpath("//a[text()='" + displayNumber
					+ "']/parent::td/following-sibling::td/div[2]//a[text()='Uncontrolled Print']"));
			if (uncontroledprint.isDisplayed()) {
				System.out.println("uncontroledprint displayed");
			} else {
				System.out.println("uncontroledprint not displayed");
			}

		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
		// Print History'
		try {
			WebElement printhistory = driver.findElement(By.xpath("//a[text()='" + displayNumber
					+ "']/parent::td/following-sibling::td/div[2]//a[text()='Print History']"));
			if (printhistory.isDisplayed()) {
				System.out.println("printhistory displayed");
			} else {
				System.out.println("printhistory not displayed");
			}

		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
		// Change History

		try {
			WebElement Changehistory = driver.findElement(By.xpath("//a[text()='" + displayNumber
					+ "']/parent::td/following-sibling::td/div[2]//a[text()='Change History']"));
			if (Changehistory.isDisplayed()) {
				System.out.println("Changehistory displayed");
			} else {
				System.out.println("Changehistory not displayed");
			}

		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
		// Past Versions
		try {
			WebElement pastversions = driver.findElement(By.xpath("//a[text()='" + displayNumber
					+ "']/parent::td/following-sibling::td/div[2]//a[text()='Past Versions']"));
			if (pastversions.isDisplayed()) {
				System.out.println("pastversions displayed");
			} else {
				System.out.println("pastversions not displayed");
			}

		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}

		// submit
		try {
			WebElement Viewdoc2 = driver.findElement(By.xpath(
					"//a[text()='" + displayNumber + "']/parent::td/following-sibling::td/div[2]//a[text()='Submit']"));
			Viewdoc2.click();

		} catch (Exception e) {
			System.out.println("not able to click ");
			System.out.println("Exception : " + e);
		}

		CM.clickonElementbyXpath(EL.eleSubmit_XP, "Submit");
		Thread.sleep(500);
		CM.selectValueinDropdownByVisualtextbyXpath(EL.eleApproverUserId2_XP, Reviewer1, "Reviewer1");
		CM.selectValueinDropdownByVisualtextbyXpath(EL.eleApproverUserId3_XP, Reviewer2, "Reviewer2");
		CM.selectValueinDropdownByVisualtextbyXpath(EL.eleApproverUserId4_XP, Reviewer3, "Reviewer3");

		CM.selectValueinDropdownByVisualtextbyXpath(EL.eleApproverUserId5_XP, Approver1, "Approver1");
		CM.selectValueinDropdownByVisualtextbyXpath(EL.eleApproverUserId6_XP, Approver2, "Approver2");
		CM.selectValueinDropdownByVisualtextbyXpath(EL.eleApproverUserId7_XP, Approver3, "Approver3");
		CM.clickonElementbyXpath(EL.elesubmitapprover_XP, "Submit iniciate");
		Thread.sleep(300);
		CM.CheckElementDisplayedbyXpath(EL.eleActionHEA_XP, "Justification for Action");

		CM.CheckElementDisplayedbyXpath(EL.elePrefilled_XP, "Prefilled Reason");
		CM.CheckElementDisplayedbyXpath(EL.eleCustom_XP, "Custom Reason");
		CM.CheckElementDisplayedbyXpath(EL.eleclose_XP, "CLOSE");
		Thread.sleep(500);
		// Thread.sleep(2000);
//				driver.findElement(By.xpath("//input[@value='2']")).click();
//				driver.findElement(By.xpath("//textarea[@id='txtAuditComments']")).sendKeys("document iniciation for product packing ");
		CM.selectValueinDropdownselectbyvalueXpath(EL.eleREason_XP, "2", "Prefilled Reason");
		CM.clickonElementbyXpath(EL.eleSave_XP, "Save");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Close']")).click();
		CM.clickonElementbyXpath(EL.eleUsersetting_XP, "USER SETTINGS");
		CM.clickonElementbyXpath(EL.eleLogout_XP, "Log out");
		Thread.sleep(300);

	}

////////Approved

	public void Approved() throws InterruptedException {
		try {
			WebElement titlenemes = driver.findElement(By.xpath("//b[text()='My Approvals']"));
			if (titlenemes.isDisplayed()) {
				System.out.println("My Approvals name displayed");
			} else {
				System.out.println("My Approvals name not displayed");
			}
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);

		}

//			try {
//				WebElement titlenemes = driver.findElement(By.xpath("(//span[text()='" + displayNumber
//						+ "']/parent::td/following-sibling::td//div[text()='" + Title + "'])[2]"));
//				if (titlenemes.isDisplayed()) {
//					System.out.println("title name displayed");
//				} else {
//					System.out.println("title name not displayed");
//				}
//			} catch (Exception e) {
//				System.out.println("not able to validate");
//				System.out.println("Exception : " + e);

//			}
		// displaynumber
		try {
			WebElement number2 = driver.findElement(By.xpath(" //span[text()='" + displayNumber + "']"));
			number2.click();
			System.out.println("numbar is displayed");
		} catch (Exception e) {
			System.out.println("numbar is not displayed");
			System.out.println("Exception:" + e);
		}
		Thread.sleep(2000);
		CM.CheckElementDisplayedbyXpath(EL.eleApprovaldetails_XP, "Approval Details header");
		CM.CheckElementDisplayedbyXpath(EL.eleApprovaltype_XP, " Approval Type");
		CM.CheckElementDisplayedbyXpath(EL.eleSubmission2_XP, "Submission");
		CM.CheckElementDisplayedbyXpath(EL.eleDocnum_XP, "Doc No");
		CM.CheckElementDisplayedbyXpath(EL.eleSubmitedby_XP, "Submitted by");

		try {
			WebElement DocNO = driver.findElement(By.xpath("//td[contains(text(),'" + SubDOcNumber + "')]"));
			if (DocNO.isDisplayed()) {
				System.out.println("Doc No is displayed");
			} else {
				System.out.println("Doc no number is not displayed");
			}
		} catch (Exception e) {
			System.out.println("numbar is not displayed");
			System.out.println("Exception:" + e);
		}

		CM.CheckElementDisplayedbyXpath(EL.eleRemarks_XP, "Remarks");
		CM.CheckElementDisplayedbyXpath(EL.eleclose1_XP, "close");
		CM.CheckElementDisplayedbyXpath(EL.eleDecision1_XP, "Decision");
		CM.CheckElementDisplayedbyXpath(EL.eleUploadfile1_XP, "Upload file");
		// upload file add
		CM.clickonElementbyXpath(EL.eleUploadfiles_XP, "File upload");
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\SSD\\Downloads\\pdf [3].pdf");
		CM.clickonElementbyXpath(EL.elebutsaves_XP, "Save");
		CM.CheckElementDisplayedbyXpath(EL.eledocinfo_XP, "Document Info");
		CM.CheckElementDisplayedbyXpath(EL.eledocinfoheader_XP, "Document Info Header");
		String Documentinfoheader = driver.findElement(By.xpath("(//thead[@class='t-grid-header'])[1]/tr")).getText();
		System.out.println(Documentinfoheader);

		// Title&Number
		WebElement TitleNumber = driver.findElement(By.xpath("//td[@id='tdPrimaryDocTitle']"));
		String actual = TitleNumber.getText();
//	        actual.replaceAll("\\r\\n|\\r|\\n", " ");
		System.out.println(actual);
		System.out.println(expected);

		if (expected.equals(actual)) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
		// Description

		WebElement DiscriptioN = driver.findElement(By.xpath("//td[@id='tdPrimaryDocDescription']"));
		String actualDes = DiscriptioN.getText();
		if (Description.equals(actualDes)) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");

		}
		// location &Department
		String Location = driver.findElement(By.xpath("(//td[@id='tdPrimaryDocLocationAndDepartment']//p)[1]"))
				.getText();
		System.out.println(Location);

		String Department = driver.findElement(By.xpath("(//td[@id='tdPrimaryDocLocationAndDepartment']//p)[2]"))
				.getText();
		System.out.println(Department);

		// classifications
//			category
		String category = driver.findElement(By.xpath("//td[@id='tdPrimaryDocClassification']//tr[1]")).getText();
		String ActualresultCategory = "Category     : Analytical";
		System.out.println(category);
		if (ActualresultCategory.equals(category)) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");

		}
//			Subcategory		

		String subcategory = driver.findElement(By.xpath("//td[@id='tdPrimaryDocClassification']//tr[2]")).getText();
		String Subcategoryactualresult = "Subcategory : Specification";
		System.out.println(subcategory);
		if (Subcategoryactualresult.equals(subcategory)) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");

		}

		// type
		String Type = driver.findElement(By.xpath("//td[@id='tdPrimaryDocClassification']//tr[3]")).getText();
		String Typeactualresult = "Types   : Analytical 11";
		System.out.println(Type);
		if (Typeactualresult.equals(Type)) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");

		}
		// Associations
		String Product = driver.findElement(By.xpath("//td[@id='tdPrimaryDocAssociation']//tr[1]")).getText();
		System.out.println(Product);
		String Material = driver.findElement(By.xpath("//td[@id='tdPrimaryDocAssociation']//tr[2]")).getText();
		System.out.println(Material);
		String Asset = driver.findElement(By.xpath("//td[@id='tdPrimaryDocAssociation']//tr[3]")).getText();
		System.out.println(Asset);
		String User = driver.findElement(By.xpath("//td[@id='tdPrimaryDocAssociation']//tr[4]")).getText();
		System.out.println(User);

		// Settings
		String Setting = driver.findElement(By.xpath("//td[@id='tdLayout']")).getText();
		System.out.println(Setting);
		System.out.println(Settingpresys);
		if (Settingpresys.equals(Setting)) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");

		}
		// file view
//			driver.findElement(By.xpath("//img[@title='View Document']")).click();
//			Thread.sleep(2000);
//			driver.close();
//			driver.findElement(By.xpath("//img[@title='Uncontrolled Print']")).click();
//			Thread.sleep(2000);
//			driver.close();

		//
		driver.findElement(By.xpath("//input[@value='Change History']")).isDisplayed();
		// associated doc
		String AssociatedDocuments = driver.findElement(By.xpath("//div[@id='divAssociatedDocuments']")).getText();
		System.out.println(AssociatedDocuments);
		// Approval history
		CM.CheckElementDisplayedbyXpath(EL.eleApprovalhistory_XP, "Approval history");
		CM.CheckElementDisplayedbyXpath(EL.eleTypeName_XP, "Type name");
		CM.CheckElementDisplayedbyXpath(EL.eleIniciationon_XP, "Initiated On");
		CM.CheckElementDisplayedbyXpath(EL.eleInitiBy_XP, "Initiated By");
		CM.CheckElementDisplayedbyXpath(EL.elestatuu_XP, "Status");

		String Typename = driver.findElement(By.xpath("(//div[@id='positionInfo']//td)[5]")).getText();
		System.out.println(Typename);
		String ActualresultTypename = "Submission";
		if (ActualresultTypename.equals(Typename)) {
			System.out.println("Pass");
			System.out.println("Typename=Submission");
		} else {
			System.out.println("Fail");

		}
		//
		String initiationontime = driver.findElement(By.xpath("(//div[@id='positionInfo']//td)[6]")).getText();
		System.out.println(initiationontime);
		//
		String initiatedby = driver.findElement(By.xpath("(//div[@id='positionInfo']//td)[7]")).getText();
		System.out.println(initiatedby);
		//
		String Statuss = driver.findElement(By.xpath("(//div[@id='positionInfo']//td)[8]")).getText();
		System.out.println(Statuss);

		CM.CheckElementDisplayedbyXpath(EL.eleStepName_XP, "Step Name");
		CM.CheckElementDisplayedbyXpath(EL.eleActioN_XP, "Action");
		CM.CheckElementDisplayedbyXpath(EL.eleActedBy_XP, "Acted By");
		CM.CheckElementDisplayedbyXpath(EL.eleAcceptedON_XP, "Accepted On");
		CM.CheckElementDisplayedbyXpath(EL.eleReMarks_XP, "Remarks");
		CM.CheckElementDisplayedbyXpath(EL.elefile2_XP, "File");
		// Reviewer1
		String reviewer = driver.findElement(By.xpath("(//div[@class='frmApprovalDetails']//tr)[7]")).getText();
		System.out.println(reviewer);
		String ActualReviewer = "Default Tasks for Reviewers Approved ankita.ghosh";// APPROVAL HISTORY

		if (ActualReviewer.equals(reviewer)) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");

		}
		// Reviewer2
		String reviewer2 = driver.findElement(By.xpath("(//div[@class='frmApprovalDetails']//tr)[8]")).getText();
		String ActualReviewer2 = "Default Tasks for Reviewers Approved appala.naidu";
		System.out.println(reviewer2);
		if (ActualReviewer2.equals(reviewer2)) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");

		}
		// Reviewer3
		String reviewer3 = driver.findElement(By.xpath("(//div[@class='frmApprovalDetails']//tr)[9]")).getText();
		String ActualReviewer3 = "Default Tasks for Reviewers Approved arun.singh";
		System.out.println(reviewer3);
		if (ActualReviewer3.equals(reviewer3)) {
			System.out.println("Pass");
		} else {

			System.out.println("Fail");

		}
		// Approver1
		String Approver1 = driver.findElement(By.xpath("(//div[@class='frmApprovalDetails']//tr)[10]")).getText();
		String ActualApprover1 = "Approval 1 Pending cs.reddy";
		System.out.println(Approver1);
		if (ActualApprover1.equals(Approver1)) {
			System.out.println("Pass");
		} else {

			System.out.println("Fail");
		}
		// Approver2
		String Approver2 = driver.findElement(By.xpath("(//div[@class='frmApprovalDetails']//tr)[11]")).getText();
		String ActualApprover2 = "Approval 2 Pending samir.paul";
		System.out.println(Approver2);
		if (ActualApprover2.equals(Approver2)) {
			System.out.println("Pass");
		} else {

			System.out.println("Fail");
		}
		// Approver3
		String Approver3 = driver.findElement(By.xpath("(//div[@class='frmApprovalDetails']//tr)[12]")).getText();
		String ActualApprover3 = "Approval 3 Pending sr.reddy";
		System.out.println(Approver3);
		if (ActualApprover3.equals(Approver3)) {
			System.out.println("Pass");
		} else {

			System.out.println("Fail");
		}
////frist Reviewer resubmit after

//			String file1="C:\\Users\\SSD\\Downloads\\pdf [3].pdf";
//			String file2="http://13.127.63.63:9984/Common/ShowPDFDocument?eqs=lqsiNjsmg7DqzBwd3Jf!Md2O7~.52e.c!.6af~Hb9f!h9JTnsx1tlxglMmlnyh9JRnywBvcnyh9Jfaamk5bj-dcic-!9e4-gaf8-f!!mdh5ghbm6.yjng66ntBpxy2ExlMdi9Luyluf!binCoBFMnBziugeRjh!HnDrtg66jyAvgijzmkInCo1FteRjh!HnDrtg66jyAvgijzmkMnBziugeRjh!HnDrtg66BziAysRjh!HnDrtg66CExlSfYxwjisBf~Kjauymg66zCAg7Dfbe9b4";

//			new PdfComparator( file1, file2 ).compare();

//			WebElement file = driver.findElement(By.xpath("//img[@src='../../Images/SVGIcons/preview.svg']"));
//			file.getText();
//			System.out.println(file);
//			//////
//			PDFTextStripper pdfstriper=new PDFTextStripper();
//			String pdfText=

//			driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\SSD\\Downloads\\pdf [3].pdf");

		// String url ="http://www.pdf995.com/samples/pdf.pdf";
		// driver.get(url);
		// try {
//		String pdfContent = readPdfContent(url);
//		Assert.assertTrue(pdfContent.contains("The Pdf995 Suite offers the following features"));
		// } catch (MalformedURLException e) {
//		e.printStackTrace();
		// } catch (IOException e) {
//		e.printStackTrace();
		// }

		CM.enteringDataintoTextfiledByXpath(EL.eleRemarksinput_XP, Reviewer1remarks, " Reviewer1remarks");

		try {
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//select[@id='Decision']")));
			Select select = new Select(driver.findElement(By.xpath("//select[@id='Decision']")));
			select.selectByVisibleText("Approve");

			WebElement a = select.getFirstSelectedOption();
			String selectedoption = a.getText();
			System.out.println("Selected element: " + selectedoption);
			if (selectedoption.equals("Approve")) {
				System.out.println("Approved");
				CM.clickonElementbyXpath(EL.elebtnComplete_XP, "Complete");
				driver.switchTo().alert().accept();
				Thread.sleep(2000);
				driver.switchTo().alert().accept();
				Thread.sleep(2000);
			} else if (selectedoption.equals("Resubmit")) {
				System.out.println("Resubmited");
				CM.clickonElementbyXpath(EL.elebtnComplete_XP, "Complete");
				driver.switchTo().alert().accept();
				Thread.sleep(2000);
				driver.switchTo().alert().accept();
				Thread.sleep(2000);
			} else if (selectedoption.equals("Reject")) {
				System.out.println("Reject");
				CM.clickonElementbyXpath(EL.elebtnComplete_XP, "Complete");
				driver.switchTo().alert().accept();
				Thread.sleep(2000);
				driver.switchTo().alert().accept();
				Thread.sleep(2000);
			}

		} catch (Exception e) {
			System.out.println("not able select " + Approve);
			System.out.println("Exception : " + e);
		}

		CM.clickonElementbyXpath(EL.eleUsersetting_XP, "USER SETTINGS");
		CM.clickonElementbyXpath(EL.eleLogout_XP, "Log out");
		Thread.sleep(500);
	}

	public void Reviewer2Login() throws InterruptedException {

//Reviewer2

		CM.enteringDataintoTextfiledByXpath(EL.eleUserName_XP, Reviewer2username, " UserName");
		CM.enteringDataintoTextfiledByXpath(EL.elePassword_XP, Password, "Password");
		CM.clickonElementbyXpath(EL.eleLogin_XP, "LOGIN");
		Thread.sleep(5000);
	}

	public void Reviewer3Login() throws InterruptedException {

		// Reviewer2

		CM.enteringDataintoTextfiledByXpath(EL.eleUserName_XP, Reviewer3username, " UserName");
		CM.enteringDataintoTextfiledByXpath(EL.elePassword_XP, Password, "Password");
		CM.clickonElementbyXpath(EL.eleLogin_XP, "LOGIN");
		Thread.sleep(5000);
	}

	public void Approval1() throws InterruptedException {

		CM.enteringDataintoTextfiledByXpath(EL.eleUserName_XP, Approver1username, " UserName");
		CM.enteringDataintoTextfiledByXpath(EL.elePassword_XP, Password, "Password");
		CM.clickonElementbyXpath(EL.eleLogin_XP, "LOGIN");
		Thread.sleep(5000);
	}

	public void Approval2() throws InterruptedException {

		Thread.sleep(3000);
		CM.enteringDataintoTextfiledByXpath(EL.eleUserName_XP, Approver2username, " UserName");
		CM.enteringDataintoTextfiledByXpath(EL.elePassword_XP, Password, "Password");
		CM.clickonElementbyXpath(EL.eleLogin_XP, "LOGIN");
		Thread.sleep(5000);
	}

	public void Approval3() throws InterruptedException {

		Thread.sleep(3000);
		CM.enteringDataintoTextfiledByXpath(EL.eleUserName_XP, Approver3username, " UserName");
		CM.enteringDataintoTextfiledByXpath(EL.elePassword_XP, Password, "Password");
		CM.clickonElementbyXpath(EL.eleLogin_XP, "LOGIN");
		Thread.sleep(5000);
	}

}

//	ankita.ghosh(12079) Ankita Ghosh	
//	appala.naidu(12128) G Appala Naidu
//	arun.singh(12390) Arun Kumar
//	cs.reddy(10447)  Mr.C .S Reddy
//	samir.paul 12098	Samir Paul
//	sr.reddy	20309	Mr.S.R. Reddy
