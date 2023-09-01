package SnapDoc.snap;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

public class Type3 extends TestBase{
	String Type = "Topiramite 1";    //pantoprazole //sodium//atorvastatin //aripiprazole //amisulpride //
	String TypeCode = "c1121";
	String TypeDescription = "All permission";
	String ReviewPeriod = "2";
	String Makeeffectivelevelname = "frist";

	public void type3() throws InterruptedException { // change needed only for all workflows designased based
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

		CM.clickonElementbyXpath(EL.eleManualnumber_XP, "Manual number check box");   // if click manual number
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
		CM.clickonElementbyXpath(EL.eleAssociatedonly_XP, "Associated only");
		System.out.println("Associated is selected ?" + Asso.isSelected());

		WebElement ChangeNeeded = driver.findElement(By.name("IsChangeNeeded"));
		CM.clickonElementbyXpath(EL.eleChangeNeeded_XP, "Change needed"); // click unselect
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
				CM.selectValueinDropdownByVisualtextbyXpath(EL.eleApproverRol3_XP, "QA User (QAU1)",
						"Designation Based");
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
			String table = driver.findElement(By.xpath("//div[@class='cr-wrap workflow_305054']/table/thead/tr"))
					.getText();
			System.out.println(table);
			String conditionheader = driver.findElement(By.xpath("//div[@class='cr-wrap workflow_305054']/div[3]//h2"))
					.getText();
			System.out.println(conditionheader);
			String condition = driver.findElement(By.xpath("//div[@class='cr-wrap workflow_305054']/div[3]")).getText();
			System.out.println(condition);
			CM.clickonElementbyXpath(EL.eleControlprintON_XP, "IsCtrlPrintApprovalReq");
			CM.enteringDataintoTextfiledByXpath(EL.elePrintlevel1_XP, "Control print level 1",
					"Control print level name");
			WebElement Control1isdesibased = driver.findElement(By.xpath("//tr[@id='tr_305054_0']/td[4]/input"));
//			Control1isdesibased.click();
			if (Control1isdesibased.isSelected()) {
				CM.selectValueinDropdownByVisualtextbyXpath(EL.eleIFdesi1control_XP, "QA User (QAU1)",
						"Designation Based");
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
//error wrap 
			
			
		
			
		}

}
