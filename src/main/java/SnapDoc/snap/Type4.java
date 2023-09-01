package SnapDoc.snap;

import java.util.List;
import java.io.File;
import java.util.ArrayList;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Type4 extends TestBase {
	String Type = "amisulpride"; // pantoprazole //sodium//atorvastatin //aripiprazole //amisulpride //
	String TypeCode = "C1030";
	String TypeDescription = "sodium 5m";
	String ReviewPeriod = "2";
	String Makeeffectivelevelname = "frist";
	String category="Analytical";
	String SubCategory="Specification";

	String TypeName = "amisulpride";
	String TypeNames2 = " amisulpride ";
	String Title = "amisulpride-A ";
	String OrgID = "org1130";
	String Number = "C1030 ";
	String displayNumber = " C1030 (org1130) "; // C3030 (org3130)
	String SubDOcNumber = "C1030 (org1130)";
	String Description = "sodium 10m";
	String vertion = "0";
	String DocumentCategoryname = "Analytical";
	String Subcategoryname = "Specification";
	String primaryexpected = "amisulpride-A\nC1030 (org1130) Ver 0.00";// title orgid number version
	String Settingpresys = "A4 Potrait\nPre Apprved";
//	

	String TypeName2 = " Sample 1 ";
	String changecontrolnumbar = "8977";
	String changecontrolDescription = "change control description";

	String Associateddoc1Type = "Topiramite";
	String Associateddoc1Title = "sodium-B";
	String number2 = "C4031";
	String Org2 = "org4131";
	String Description2 = "sodium 20m";
	String Associateddoc2Type = "Topiramite 1";
	String Associateddoc2Title = "sodium-C";
	String number3 = "C4032";
	String Org3 = "org4132";
	String Description3 = "sodium 30m";

	String NonSignatory = "Mr C S Reddy (10447)";
	String NonSignatoryNAME = "cs.reddy";
	String Reviewer1 = "Ankita Ghosh (12079)";
	String Reviewer1username = "ankita.ghosh";
	String Password = "demo";
	String Reviewer2 = "G Appala Naidu (12128)";
	String Reviewer2username = "appala.naidu";
	String Reviewer3 = "Arun Kumar Singh (12390)";
	String Reviewer3username = "arun.singh";

	String Approve = "Approve";
	String Reject = "Reject";
	String Resubmit = "Resubmit";

	String username = "admin";
	String password = "infi";
	String Reviewer1remarks = "NO";
	public void type4() throws InterruptedException { // change needed only for all workflows designased based
														// only
		driver.findElement(By.xpath("(//span[text()='Analytical'])[2]")).click();
		driver.findElement(By.xpath("//td[text()='Specification']")).click();
		Thread.sleep(4000);
		WebElement Add = driver.findElement(By.xpath("(//input[@value='Add'])[3]"));
		try {
			Add.click();
		} catch (StaleElementReferenceException e) {
			Add = driver.findElement(By.xpath("(//input[@value='Add'])[3]"));
			Add.click();
		}
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id='TypeName']")).sendKeys(Type);
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id='TypeCode']")).sendKeys(TypeCode);
		driver.findElement(By.xpath("//input[@id='TypeDescription']")).sendKeys(TypeDescription);
		// PrimaryDocuments
		CM.CheckElementDisplayedbyXpath(EL.elePrimaryDocuments_XP, " PrimaryDocuments");

		CM.clickonElementbyXpath(EL.eleManualnumber_XP, "Manual number check box"); // if click manual number
		WebElement Manualnumber = driver.findElement(By.name("IsNumberingAutoOrManual"));
		System.out.println("Manualnumber is selected ?" + Manualnumber.isSelected());
		if (Manualnumber.equals(true)) {
			System.out.println("enter manal number");
			CM.CheckElementDisplayedbyXpath(EL.eleActive_XP, "Active");
			CM.CheckElementDisplayedbyXpath(EL.eleNumberingApproach_XP, "Numbering Approach");
			CM.CheckElementDisplayedbyXpath(EL.eleNumberingAssociations_XP, "Numbering Associations");
			CM.CheckElementDisplayedbyXpath(EL.eleNomenclature_XP, "Nomenclature");
			CM.CheckElementDisplayedbyXpath(EL.eleDescriptionsA_XP, "Description");
			CM.CheckElementDisplayedbyXpath(EL.eleSelection_XP, "Selection");
			CM.CheckElementDisplayedbyXpath(EL.eleFormat_XP, "Format");
			CM.CheckElementDisplayedbyXpath(EL.eleAddlInfo_XP, "Addl Info");
			CM.CheckElementDisplayedbyXpath(EL.eleSeparator_XP, "Separator");
			WebElement primarydocactive1 = driver.findElement(By.name("primarydocactive"));
			System.out.println("primary doc active is selected ?" + primarydocactive1.isSelected());
			primarydocactive1.equals(false);
			System.out.println("Manual number selected");
		} else {
			CM.CheckElementDisplayedbyXpath(EL.eleNumberingApproach_XP, "Numbering Approach");
			CM.CheckElementDisplayedbyXpath(EL.eleNumberingAssociations_XP, "Numbering Associations");
			CM.CheckElementDisplayedbyXpath(EL.eleNomenclature_XP, "Nomenclature");
			CM.CheckElementDisplayedbyXpath(EL.eleDescriptionsA_XP, "Description");
			CM.CheckElementDisplayedbyXpath(EL.eleSelection_XP, "Selection");
			CM.CheckElementDisplayedbyXpath(EL.eleFormat_XP, "Format");
			CM.CheckElementDisplayedbyXpath(EL.eleAddlInfo_XP, "Addl Info");
			CM.CheckElementDisplayedbyXpath(EL.eleSeparator_XP, "Separator");
			CM.CheckElementDisplayedbyXpath(EL.elerdbtnNumberingType_XP, "rdbtnNumberingType");
			WebElement primarydocactive1 = driver.findElement(By.name("primarydocactive"));
			System.out.println("primary doc active is selected ?" + primarydocactive1.isSelected());
			primarydocactive1.equals(true);
			CM.selectValueinDropdownByVisualtextbyXpath(EL.elerdbtnNumberingType_XP, "Independent",
					"Numbering Approach");
			CM.enteringDataintoTextfiledByXpath(EL.eleDescriptionAutoNum_XP, "discription 1", "Discription");
			CM.selectValueinDropdownByVisualtextbyXpath(EL.elePartsAutoNum_XP, "Fixed", "Selection");
			CM.CheckElementDisplayedbyXpath(EL.elebtnAddNewRow_XP, "btnAddNewRow");
		}

		CM.clickonElementbyXpath(EL.eleEffectiveproccess_XP, "Effective proccess");
		CM.enteringDataintoTextfiledByXpath(EL.eleReviewPeriod_XP, ReviewPeriod, "ReviewPeriod");
		CM.selectValueinDropdownByVisualtextbyXpath(EL.eleTrareq_XP, "Mandatory", "Training");
		WebElement Orgid = driver.findElement(By.name("IsManualNumberReq"));
//		CM.clickonElementbyXpath(EL.eleOrgid_XP, "Org Id ");// click unselect
		System.out.println("Orgid is selected ?" + Orgid.isSelected());

		WebElement Asso = driver.findElement(By.name("IsCreateIndividual"));
//		CM.clickonElementbyXpath(EL.eleAssociatedonly_XP, "Associated only");
		System.out.println("Associated is selected ?" + Asso.isSelected());

		WebElement ChangeNeeded = driver.findElement(By.name("IsChangeNeeded"));
//		CM.clickonElementbyXpath(EL.eleChangeNeeded_XP, "Change needed"); // click unselect
		System.out.println("ChangeNeeded is selected ?" + ChangeNeeded.isSelected());

		WebElement Effective = driver.findElement(By.name("IsDocEffManually"));
		CM.clickonElementbyXpath(EL.eleEffectiveproccess_XP, "Effectiveproccess");
		System.out.println("Effective is selected ?" + Effective.isSelected());
		if (Effective.isSelected()) {
			CM.selectValueinDropdownselectbyvalueXpath(EL.eleMAN_XP, "1", "Training");
		} else {
			System.out.println("Training mandatary not selected");

		}

//Document Layout Configuration
		CM.CheckElementDisplayedbyXpath(EL.eleLayout_XP, "Document Layout Configuration");
		CM.CheckElementDisplayedbyXpath(EL.ele4Potraitpre_XP, "A4-Potrait-Pre Approved");
		CM.CheckElementDisplayedbyXpath(EL.ele4Potraitsystem_XP, "A4-Potrait-System Approval");
		CM.CheckElementDisplayedbyXpath(EL.elepre4Landscape_XP, "A4-Landscape-Pre Approved");
		CM.CheckElementDisplayedbyXpath(EL.ele4Landscapesystem_XP, "A4-Landscape-System Approval");
		CM.CheckElementDisplayedbyXpath(EL.ele3Potraitpre_XP, "A3-Potrait-Pre Approved");
		CM.CheckElementDisplayedbyXpath(EL.ele3Potraitsystem_XP, "A3-Potrait-System Approval");
		CM.CheckElementDisplayedbyXpath(EL.ele3Landscapepre_XP, "A3-Landscape-Pre Approved");
		CM.CheckElementDisplayedbyXpath(EL.ele3Landscapesystem_XP, "A3-Landscape-System Approval");
		//
		CM.clickonElementbyXpath(EL.eleA4PP_XP, "A4PotraitPreApproved checkbox");
		CM.CheckElementDisplayedbyXpath(EL.eleLayout1a4_XP, "A4");
		CM.CheckElementDisplayedbyXpath(EL.elePotrait_XP, "Potrait");
		CM.CheckElementDisplayedbyXpath(EL.elepreAp_XP, "Pre Approved");
//      CM.selectValueinDropdownByVisualtextbyXpath(EL.eleselectprint_XP, "ddlPrintObjects", "ddlPrintObjects");
		CM.CheckElementDisplayedbyXpath(EL.elefieldADD_XP, "Select the Overlays Field to Add");
		CM.CheckElementDisplayedbyXpath(EL.elePreview_XP, "PreView");
		CM.CheckElementDisplayedbyXpath(EL.eleUploadfile_XP, "UploadFile");
		CM.CheckElementDisplayedbyXpath(EL.eleCancle_XP, "Cancle");
		CM.clickonElementbyXpath(EL.eleSAVE_XP, "Save");
//iniciatioin

		try {
			CM.clickonElementbyXpath(EL.eleEnableWorkflow_XP, "EnableWorkflow on Iniciate");
			CM.enteringDataintoTextfiledByXpath(EL.eleLevelName1_XP, "Frist", "LevelName");
			WebElement Designased = driver.findElement(By.name("IsDesignationBased"));
//			Designased.click();
			System.out.println("Designased is selected ?" + Designased.isSelected());

			if (Designased.isSelected()) {
				CM.selectValueinDropdownByVisualtextbyXpath(EL.eleApproverRoleId_XP, "QA HOD (QAH1)",
						"	Designation Based");
				System.out.println("selected designation based");
			} else {
				CM.selectValueinDropdownByVisualtextbyXpath(EL.eleUserbased1_XP, "User Based", "Userbased");
				System.out.println("selected userbased");
			}
		} catch (Exception e) {
			System.out.println("not able select");
			System.out.println("Exception : " + e);

		}
//submition	
		CM.CheckElementDisplayedbyXpath(EL.eleSubmission_XP, "Workflow for Document - Submission");
		CM.CheckElementDisplayedbyXpath(EL.eleWORKFLOW_XP, "DEFAULT WORKFLOW ");
		CM.CheckElementDisplayedbyXpath(EL.eleWORKFLOW2_XP, "DEFAULT WORKFLOW ");
		CM.CheckElementDisplayedbyXpath(EL.eleReviewer_XP, "Reviewer");
		CM.CheckElementDisplayedbyXpath(EL.eleReviewer1_XP, "Reviewer 1");
		CM.CheckElementDisplayedbyXpath(EL.eleDesignationbased1_XP, "Designation Based?");
		CM.CheckElementDisplayedbyXpath(EL.eleUseased_XP, "User Based");
		CM.CheckElementDisplayedbyXpath(EL.eleuserman_XP, "Userman");
		CM.CheckElementDisplayedbyXpath(EL.eledesig_XP, "Designation (If Designation Based)");
		CM.CheckElementDisplayedbyXpath(EL.eledesigman_XP, "Designation (If Designation Based)man(*)");
		CM.CheckElementDisplayedbyXpath(EL.eleAdd2_XP, "Add");

		try {

			WebElement SubmissionApproval = driver.findElement(By.name("IsSubmissionApprovalReq"));
			System.out.println("SubmissionApproval is selected ?" + SubmissionApproval.isSelected());

		} catch (Exception e) {
			System.out.println("not able select");
			System.out.println("Exception : " + e);
		}

		WebElement Designased2 = driver.findElement(By.xpath("(//input[@name='IsDesignationBased'])[3]"));
//		Designased2.click();
		Thread.sleep(500);
		System.out.println("Designased is selected ?" + Designased2.isSelected());

		if (Designased2.isSelected()) {
			CM.selectValueinDropdownByVisualtextbyXpath(EL.eleReviewerRoleId1_XP, "QA HOD (QAH1)", "Designation Based");
			System.out.println("selected designation based");
		} else {
			CM.selectValueinDropdownByVisualtextbyXpath(EL.eleUserbased2_XP, "User Based", "Userbased");
			System.out.println("selected userbased");
		}

//Approver
		// Approver

		CM.CheckElementDisplayedbyXpath(EL.eleApprover_XP, "Approver");
		CM.CheckElementDisplayedbyXpath(EL.eledesi2_XP, "Designation Based?");
		CM.CheckElementDisplayedbyXpath(EL.eleuserba_XP, "User Based'");
		CM.CheckElementDisplayedbyXpath(EL.eleusermand_XP, "User Based");
		CM.CheckElementDisplayedbyXpath(EL.eleDesig_XP, "Designation (If Designation Based)");
		CM.CheckElementDisplayedbyXpath(EL.eleDesignased_XP, "Designation (If Designation Based)");
		CM.CheckElementDisplayedbyXpath(EL.eleApproval_XP, "Approval 1");
		// Approver 1
		WebElement Approver1 = driver
				.findElement(By.xpath("//tr[@id='tr_Approval_278030_0']//input[@name='IsDesignationBased'][1]"));
//		Approver1.click();

		System.out.println("Designased is selected ?" + Approver1.isSelected());
		Thread.sleep(500);
		if (Approver1.isSelected()) {
			CM.selectValueinDropdownByVisualtextbyXpath(EL.eleApprovelrole_XP, "QA HOD (QAH1)", "Designation Based");
			System.out.println("selected designation based");
		} else {
			CM.selectValueinDropdownByVisualtextbyXpath(EL.eleuseR_XP, "User Based", "Userbased");
			System.out.println("selected userbased");
		}
//Make effective
		CM.CheckElementDisplayedbyXpath(EL.eleMakeEffective_XP, "MakeEffective");
		CM.clickonElementbyXpath(EL.eleEEfect_XP, "EffectiveApproval");
		CM.CheckElementDisplayedbyXpath(EL.eleworkflow4_XP, "DEFAULT WORKFLOW");
		CM.CheckElementDisplayedbyXpath(EL.elelevel2_XP, "Level");
		CM.CheckElementDisplayedbyXpath(EL.eledesibased4_XP, "Designation Based?");
		CM.CheckElementDisplayedbyXpath(EL.eleubased4_XP, "User Based");
		CM.CheckElementDisplayedbyXpath(EL.eledesi4_XP, "Designation (If Designation Based)");
		CM.CheckElementDisplayedbyXpath(EL.eleadd4_XP, "Add");
		CM.CheckElementDisplayedbyXpath(EL.elecondi3_XP, "CONDITIONAL WORKFLOWS");
		CM.CheckElementDisplayedbyXpath(EL.elename5_XP, "Name");
		CM.CheckElementDisplayedbyXpath(EL.eleConditions3_XP, "Conditions");
		CM.CheckElementDisplayedbyXpath(EL.eleLevels3_XP, "Levels");
		CM.CheckElementDisplayedbyXpath(EL.eleActiveinactive_XP, "Active/Inactive");
		CM.enteringDataintoTextfiledByXpath(EL.eleLevelName_XP, Makeeffectivelevelname, "LevelName");

		WebElement Effectivedesig = driver
				.findElement(By.xpath("//tr[@id='tr_278031_0']//input[@id='IsDesignationBased']"));
//			Effectivedesig.click();
		Thread.sleep(500);
		System.out.println("Designased is selected ?" + Effectivedesig.isSelected());

		if (Effectivedesig.isSelected()) {
//							driver.findElement(By.xpath("//div[@class='cr-wrap workflow_278031']//select[@id='_ApproverRoleId_1']")).sendKeys("QA HOD (QAH1)");
			CM.selectValueinDropdownByVisualtextbyXpath(EL.eleApproverRol3_XP, "QA User (QAU1)", "Designation Based");
			System.out.println("selected designation based");
		} else {
			CM.selectValueinDropdownByVisualtextbyXpath(EL.eleUserbased4_XP, "User Based", "Userbased");
			System.out.println("selected userbased");
		}

//issue
		CM.clickonElementbyXpath(EL.eledocissueON_XP, "doc issue ON");// issuebutton
		WebElement Issuedesibased1 = driver.findElement(By.xpath("//tr[@id='tr_305053_0']/td[4]/input[1]"));
//			Issuedesibased1.click();// designased on
		System.out.println("Issuedesibased1 is selected ?" + Issuedesibased1.isSelected());
		if (Issuedesibased1.isSelected()) {
			CM.selectValueinDropdownByVisualtextbyXpath(EL.eleissueifdesibased_XP, "QA User (QAU1)",
					"Designation Based");
		} else {
			CM.selectValueinDropdownByVisualtextbyXpath(EL.eleissueuserbased_XP, "User Based", "Userbased");
			System.out.println("selected userbased");
		}
		CM.enteringDataintoTextfiledByXpath(EL.eleIssuelevelinput_XP, "Issue Frist", " issue level name");
//Control print		//1		////
		CM.CheckElementDisplayedbyXpath(EL.eleControlprint_XP, "Control print");
		CM.CheckElementDisplayedbyXpath(EL.eleControlworkflow_XP, "work flow");
		String table = driver.findElement(By.xpath("//div[@class='cr-wrap workflow_305054']/table/thead/tr")).getText();
		System.out.println(table);
		String conditionheader = driver.findElement(By.xpath("//div[@class='cr-wrap workflow_305054']/div[3]//h2"))
				.getText();
		System.out.println(conditionheader);
		String condition = driver.findElement(By.xpath("//div[@class='cr-wrap workflow_305054']/div[3]")).getText();
		System.out.println(condition);
		CM.clickonElementbyXpath(EL.eleControlprintON_XP, "IsCtrlPrintApprovalReq");
		CM.enteringDataintoTextfiledByXpath(EL.elePrintlevel1_XP, "Control print level 1", "Control print level name");
		WebElement Control1isdesibased = driver.findElement(By.xpath("//tr[@id='tr_305054_0']/td[4]/input"));
//			Control1isdesibased.click();
		if (Control1isdesibased.isSelected()) {
			CM.selectValueinDropdownByVisualtextbyXpath(EL.eleIFdesi1control_XP, "QA User (QAU1)", "Designation Based");
		} else {
			CM.selectValueinDropdownByVisualtextbyXpath(EL.eleprintuserbased1_XP, "User Based", "Userbased");
			System.out.println("selected userbased");
		}

		CM.CheckElementDisplayedbyXpath(EL.eleEffectivedate_XP, "Effectivedate");
		CM.clickonElementbyXpath(EL.eledatepicker_XP, "datepicker");
		CM.clickonElementbyXpath(EL.eletoday_XP, "Today date");
		CM.clickonElementbyXpath(EL.eleSaveE_XP, "Save");
		CM.CheckElementDisplayedbyXpath(EL.eleActionHEA_XP, "Justification for Action");
		CM.CheckElementDisplayedbyXpath(EL.elePrefilled_XP, "Prefilled Reason");
		CM.CheckElementDisplayedbyXpath(EL.eleCustom_XP, "Custom Reason");
		CM.CheckElementDisplayedbyXpath(EL.eleclose_XP, "CLOSE");
		CM.selectValueinDropdownselectbyvalueXpath(EL.eleREason_XP, "9", "Prefilled Reason");
		CM.clickonElementbyXpath(EL.eleSave_XP, "Save");
		Thread.sleep(500);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
// accessgroup
		CM.clickonElementbyXpath(EL.elemenuicon_XP, "Menu icon");
		driver.findElement(By.xpath("//div[text()='Admin']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[text()='Us']")).click();
		Thread.sleep(5000);

		CM.clickonElementbyXpath(EL.eleAccessg_XP, "Access Groups");
		CM.clickonElementbyXpath(EL.eleAccessgrouptoggle_XP, "Default AccessGroup TOGGLE");
		CM.clickonElementbyXpath(EL.eleEditAccess_XP, "Edit");
		CM.clickonElementbyXpath(EL.elepermissions_XP, "Permissions");
		CM.clickonElementbyXpath(EL.eleDocuments_XP, "Documents");// input[@id='chkSiteMapAll_1']
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

	public void initiate4() throws InterruptedException {
		Thread.sleep(3000);
		CM.clickonElementbyXpath(EL.eleInitiate_XP, "Initiate");
		Thread.sleep(2000);
		CM.selectValueinDropdownByVisualtextbyXpath(EL.eleAddtype_XP, Type, "Addtype");
		Thread.sleep(1000);
		CM.clickonElementbyXpath(EL.eleSubmit_XP, "Submit");
//error wrap
		CM.clickonElementbyXpath(EL.eleTitlebutton_XP, "Title error yellow dot");
		CM.CheckElementDisplayedbyXpath(EL.eleErrorwraptitle_XP, " This field is required");

		CM.clickonElementbyXpath(EL.eleErrorwrapnumber_XP, "number error yellow dot");
		CM.CheckElementDisplayedbyXpath(EL.elenumbererrorwrap_XP, "This field is required");
		CM.clickonElementbyXpath(EL.eleorgiderrorwrap_XP, "org id  error yellow dot");
		CM.CheckElementDisplayedbyXpath(EL.eleerrorwroporgid_XP, "This field is required");

		CM.clickonElementbyXpath(EL.eleversionerror_XP, "version error yellow dot");
		CM.CheckElementDisplayedbyXpath(EL.eleversionerrorwrap_XP, "This field is required");
		CM.clickonElementbyXpath(EL.elelayouterror_XP, "layout error yellow dot");
		CM.CheckElementDisplayedbyXpath(EL.elelayourwrrorwrap_XP, "This field is required");
		WebElement DOCNUM = driver.findElement(By.xpath("//input[@id='txtIsNumberingAutoOrManual_1']"));
		if (DOCNUM.isEnabled()) {
			System.out.println("doc number Enabled");
			CM.enteringDataintoTextfiledByXpath(EL.eleDocNumber_XP, Number, "Document number");
		} else {
			System.out.println("Doc number disabled");
		}
		WebElement ORGID = driver.findElement(By.xpath("//input[@id='txtNumber_1']"));
		if (ORGID.isEnabled()) {
			System.out.println("doc number Enabled");

			CM.enteringDataintoTextfiledByXpath(EL.eletxtNumber_XP, OrgID, "org id");
		} else {
			System.out.println("Doc number disabled");
		}

		CM.enteringDataintoTextfiledByXpath(EL.eletxtTitle_XP, Title, "txtTitle_1");
		CM.enteringDataintoTextfiledByXpath(EL.eleVersionNo_XP, vertion, "txtVersionNo_1");
		CM.selectValueinDropdownselectbyvalueXpath(EL.eledoclayoutp_XP, "1", "Select docu Lyout");
		CM.enteringDataintoTextfiledByXpath(EL.eleDescriptions1_XP, Description, "Description");
		Thread.sleep(1000);
		WebElement primary = driver.findElement(By.xpath("//input[@id='rbPrimary_1']"));
		if (primary.isSelected()) {
			System.out.println("primary selected");
		} else {
			System.out.println("primary not selected");
		}
		driver.findElement(By.xpath("//i[@class='fa fa-upload']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\SSD\\Downloads\\pdf [3].pdf");
		Thread.sleep(500);
		CM.clickonElementbyXpath(EL.eleSaVe_XP, "Save");
//Type 2
		CM.clickonElementbyXpath(EL.eleAdddprimary_XP, "(+) Symbal for Add primary document");
		CM.selectValueinDropdownByVisualtextbyXpath(EL.eleAddtype2_XP, Associateddoc1Type, "Addtype2");
		CM.enteringDataintoTextfiledByXpath(EL.eleTitle2_XP, Associateddoc1Title, "txtTitle_1");
		CM.enteringDataintoTextfiledByXpath(EL.elenumber2_XP, number2, "Number 2");
		CM.enteringDataintoTextfiledByXpath(EL.eleorg2_XP, Org2, "ORG id 2");
//		CM.enteringDataintoTextfiledByXpath(EL.eleorg2_XP, Org2,  "ORG id 2");
		Thread.sleep(2000);
		CM.enteringDataintoTextfiledByXpath(EL.eleversion2_XP, vertion, "txtVersionNo_1");
		CM.selectValueinDropdownselectbyvalueXpath(EL.elelayout2_XP, "1", "Select docu Lyout");
		CM.enteringDataintoTextfiledByXpath(EL.eleDescrip2_XP, Description2, "Description");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@id='File_2']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\SSD\\Downloads\\sample3.pdf");
		Thread.sleep(500);
		CM.clickonElementbyXpath(EL.eleSaVe_XP, "Save");
		WebElement primary2 = driver.findElement(By.xpath("//input[@id='rbPrimary_2']"));
		try {
			primary.click();
			System.out.println("primary document" + Associateddoc1Type);
		} catch (Exception e) {
			System.out.println("primary document not selected");
		}
//type3
		CM.clickonElementbyXpath(EL.eleAdddprimary_XP, "(+) Symbal for Add primary document");
		CM.selectValueinDropdownByVisualtextbyXpath(EL.eleAddtype3_XP, Associateddoc2Type, "Addtype3");
		CM.enteringDataintoTextfiledByXpath(EL.eleTitle3_XP, Associateddoc2Title, "Title 3");
		CM.enteringDataintoTextfiledByXpath(EL.elenumber3_XP, number3, "Number 3");
		CM.enteringDataintoTextfiledByXpath(EL.eleorg3_XP, Org3, "ORG id 3");

		CM.enteringDataintoTextfiledByXpath(EL.eleversion3_XP, vertion, "txtVersionNo3 ");
		CM.selectValueinDropdownselectbyvalueXpath(EL.eleLayout3_XP, "1", "Select docu Lyout3");
		CM.enteringDataintoTextfiledByXpath(EL.eledes3_XP, Description3, "Description 3");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@id='File_3']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\SSD\\Downloads\\sample3.pdf");
		Thread.sleep(500);
		CM.clickonElementbyXpath(EL.eleSaVe_XP, "Save");
		WebElement primary3 = driver.findElement(By.xpath("//input[@id='rbPrimary_3']"));
		try {
			primary.click();
			System.out.println("primary document" + Associateddoc2Type);
		} catch (Exception e) {
			System.out.println("primary document not selected");
		}

		CM.clickonElementbyXpath(EL.eleSubmit_XP, "Submit");
		Thread.sleep(500);

		Alert alert = driver.switchTo().alert(); // switch to alert
		String alertMessage = driver.switchTo().alert().getText(); // capture alert message
		System.out.println(alertMessage); // Print Alert Message
		Thread.sleep(500);
		String ExpectedAlert = "At list one Change Control is needed";
		if (alertMessage.equals(ExpectedAlert)) {
			alert.accept();
		} else {
			System.out.println("this alert is not expected");
		}

		CM.CheckElementDisplayedbyXpath(EL.elechangeinfo_XP, "Change Control Info");
		CM.CheckElementDisplayedbyXpath(EL.elecontrolnum_XP, "Change Control Number");
		CM.CheckElementDisplayedbyXpath(EL.eleDescrisp_XP, "Description");
		CM.CheckElementDisplayedbyXpath(EL.elefilechange_XP, "File");
		CM.CheckElementDisplayedbyID(EL.eleAddchange_XP, "Add change info button");
		CM.clickonElementbyID(EL.eleAddchange_XP, "Add change info button");
		CM.enteringDataintoTextfiledByXpath(EL.eledoccahan_XP, changecontrolnumbar, "Change control number");
		CM.enteringDataintoTextfiledByXpath(EL.eleDescript_XP, changecontrolDescription, "Change control Description");
		CM.clickonElementbyXpath(EL.elechangefileadd_XP, "changefileadd");
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\SSD\\Downloads\\pdf [3].pdf");
		Thread.sleep(500);
		CM.clickonElementbyXpath(EL.eleSaVe_XP, "Save");
		CM.clickonElementbyXpath(EL.eleSubmit_XP, "Submit");
		Thread.sleep(1000);
		CM.selectValueinDropdownByVisualtextbyXpath(EL.eleNonsignatory1_XP, NonSignatory, "silent Reviewer");
		CM.selectValueinDropdownByVisualtextbyXpath(EL.eleApproverUserId2_XP, Reviewer1, "Reviewer1");
		CM.selectValueinDropdownByVisualtextbyXpath(EL.eleApproverUserId3_XP, Reviewer2, "Reviewer2");
		CM.clickonElementbyXpath(EL.elesubmitapprover_XP, "Submit iniciate");
		Thread.sleep(300);
		CM.CheckElementDisplayedbyXpath(EL.eleActionHEA_XP, "Justification for Action");
		CM.CheckElementDisplayedbyXpath(EL.elePrefilled_XP, "Prefilled Reason");
		CM.CheckElementDisplayedbyXpath(EL.eleCustom_XP, "Custom Reason");
		CM.CheckElementDisplayedbyXpath(EL.eleclose_XP, "CLOSE");
		Thread.sleep(500);
		CM.selectValueinDropdownselectbyvalueXpath(EL.eleREason_XP, "3", "Prefilled Reason");
		CM.clickonElementbyXpath(EL.eleSave_XP, "Save");
		Thread.sleep(500);
		String alertMessage2 = driver.switchTo().alert().getText(); // capture alert message
		System.out.println(alertMessage2); // Print Alert Message
		Thread.sleep(5000);
		String ExpectedAlert2 = "Successfully Saved.";
		if (alertMessage2.equals(ExpectedAlert2)) {
			alert.accept();
		} else {
			System.out.println("This Alert is not extepected");
		}

	}

	public void status4() throws InterruptedException {

		Thread.sleep(3000);
		// td[@class='CL documentNumber wid15pc']/a[text()=' C4030 (org4130) ']
//		WebElement number= driver.findElement(By.xpath("//td[@class='CL documentNumber wid15pc']/a[text()='"+displayNumber+"']"));
//	if(number.isDisplayed()) {
//		
//		
//	}
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
//typename
		try {
			WebElement Typename = driver.findElement(By.xpath("//a[text()='" + displayNumber
					+ "']/parent::td /following-sibling::td[2]/ul/li[text()='" + TypeNames2 + "']"));
			if (Typename.isDisplayed()) {
				System.out.println("Typename displayed");
			} else {
				System.out.println("Typename not displayed");
			}

		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
//typethree dot

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

//View 
	}

//	public void view() {
//		WebElement Displaynumber2 = driver.findElement(By.xpath("//a[text()='" + displayNumber + "']"));
//
//		Displaynumber2.click();
//		CM.CheckElementDisplayedbyXpath(EL.eleHeaderdoc_XP, "Document Info");
//		CM.CheckElementDisplayedbyXpath(EL.eleheadesoc_XP, "Document Info");
//		List<WebElement> allheaders = driver
//				.findElements(By.xpath("(//div[@class='t-grid t-widget'])[1]/table/thead/tr/th"));
//		System.out.println(allheaders.size());
//		Assert.assertEquals(allheaders.size(), 7, "Colume size is not same");
//		boolean status = true;
//		ArrayList<String> abc = new ArrayList<String>();
//		for (WebElement ele : allheaders) {
//			String value = ele.getText();
////			System.out.println(value);
//			abc.add(value);
//		}
//		if (!abc.contains("Title & Number")) {
//			status = false;
//			System.out.println("Title & Number");
//		} else if (!abc.contains("Description")) {
//			status = false;
//			System.out.println("Description");
//		} else if (!abc.contains("Loc, Dep")) {
//			status = false;
//			System.out.println("Loc, Dep");
//		} else if (!abc.contains("Classification")) {
//			status = false;
//			System.out.println("Classification");
//		} else if (!abc.contains("Associations")) {
//			status = false;
//			System.out.println("Associations");
//		} else if (!abc.contains("Settings")) {
//			status = false;
//			System.out.println("Settings");
//		} else if (!abc.contains("File")) {
//			status = false;
//			System.out.println("File");
//		}
//		System.out.println(status);
//		
//	// primary number
//		String primarydocdetails = driver
//				.findElement(By.xpath("(//div[@class='t-grid t-widget']/table/thead/following-sibling::tbody/tr)[1]/td[1]")).getText();
//		System.out.println(primarydocdetails);
//		if(primarydocdetails.equals(primaryexpected)) {
//			System.out.println("Title number &orgid &version same");
//		}else {
//			System.out.println("Title number &orgid &version not same");
//		}
////		
//
//		String description1 = driver
//				.findElement(By.xpath("(//div[@class='t-grid t-widget']/table/thead/following-sibling::tbody/tr)[1]/td[2]")).getText();
//		System.out.println(description1);
//		if(description1.equals(Description)) {
//			System.out.println("Description same");
//		}else {
//			System.out.println("Description not same");
//		}
//
//	//
//		String Catogory = driver
//				.findElement(By.xpath("//td[@id='tdPrimaryDocClassification']/table/tbody/tr[1]/td[3]")).getText();
//		System.out.println(Catogory);
//		if(Catogory.equals(category)) {
//			System.out.println("Description same");
//		}else {
//			System.out.println("Description not same");
//		}
//		
//		//
//		String SubCatogory = driver
//				.findElement(By.xpath("//td[@id='tdPrimaryDocClassification']/table/tbody/tr[2]/td[3]")).getText();
//		System.out.println(Catogory);
//		if(Catogory.equals(category)) {
//			System.out.println("Description same");
//		}else {
//			System.out.println("Description not same");
//		}	
////
//		String typE = driver
//				.findElement(By.xpath("//td[@id='tdPrimaryDocClassification']/table/tbody/tr[3]/td[3]")).getText();
//		System.out.println(typE);
//		if(typE.equals(Type)) {
//			System.out.println("Description same");
//		}else {
//			System.out.println("Description not same");
//		}	
//		
////
//		String Settings = driver
//				.findElement(By.xpath("(//td[@id='tdLayout'])[1]")).getText();
//		System.out.println(Settings);
//			
//	
////valu
//	
//String file=driver.findElement(By.xpath("(//img[@title='View Document'])[1]")).getText();
//System.out.println(file);
//
//	}
//	
//	
//
//	
	
	
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

////Title&Number
//		WebElement TitleNumber = driver.findElement(By.xpath("//td[@id='tdPrimaryDocTitle']"));
//		String actual = TitleNumber.getText();
////        actual.replaceAll("\\r\\n|\\r|\\n", " ");
//		System.out.println(actual);
//		System.out.println(expected);
//
//		if (expected.equals(actual)) {
//			System.out.println("Pass");
//		} else {
//			System.out.println("Fail");
//		}
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
////Approved

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

			try {
				WebElement titlenemes = driver.findElement(By.xpath("(//span[text()='" + displayNumber
						+ "']/parent::td/following-sibling::td//div[text()='" + Title + "'])[2]"));
				if (titlenemes.isDisplayed()) {
					System.out.println("title name displayed");
				} else {
					System.out.println("title name not displayed");
				}
			} catch (Exception e) {
				System.out.println("not able to validate");
				System.out.println("Exception : " + e);

			}
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
//		System.out.println(expected);

		if (actual.equals(primaryexpected)) {
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

	}

	
