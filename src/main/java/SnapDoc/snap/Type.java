package SnapDoc.snap;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class Type extends TestBase {
	String Type = "Sodiumso2";
	String TypeCode = "aaso2";
	String TypeDescription = "All permission";
	String ReviewPeriod = "2";
	String Makeeffectivelevelname = "frist";

	public void Classifications() throws InterruptedException {
		CM.clickonElementbyXpath(EL.elemenuicon_XP, "Menu icon");
		WebElement Documents = driver.findElement(By.xpath("//div[contains(text(),'Admin')]"));
		AS.moveToElement(Documents).perform();
		Documents.findElement(By.xpath("//span[normalize-space()='Classifications']")).click();
		Thread.sleep(15000);
	}

	public void Typecreation() throws InterruptedException {
		CM.CheckElementDisplayedbyXpath(EL.eleClassificationsm_XP, "Classifications");
		CM.CheckElementDisplayedbyXpath(EL.Hierarchy, "Hierarchy");
		CM.CheckElementDisplayedbyXpath(EL.elecatadd_XP, "Add");
		CM.CheckElementDisplayedbyXpath(EL.elebtnCollapse_XP, "btnCollapse");
		CM.CheckElementDisplayedbyXpath(EL.eleInformation_XP, "Information");
		CM.CheckElementDisplayedbyXpath(EL.eleCatinfo_XP, "Category Info");
		CM.CheckElementDisplayedbyXpath(EL.eleName1_XP, "Name");
		CM.CheckElementDisplayedbyXpath(EL.eleshortcode1_XP, "Short Code");
		CM.CheckElementDisplayedbyXpath(EL.elediscription1_XP, "Description");
		CM.CheckElementDisplayedbyXpath(EL.elenoofsub_XP, "No Of Subcategories");
		CM.CheckElementDisplayedbyXpath(EL.eleitems1_XP, "Items");
		CM.CheckElementDisplayedbyXpath(EL.eletype1_XP, "Types");
		CM.CheckElementDisplayedbyXpath(EL.eleHeadersub_XP, "Subcategories");
		CM.CheckElementDisplayedbyXpath(EL.eleSubadd_XP, "Add");
		CM.CheckElementDisplayedbyXpath(EL.eleName2_XP, "Name");
		CM.CheckElementDisplayedbyXpath(EL.eleshort2_XP, "Short Code");
		CM.CheckElementDisplayedbyXpath(EL.eleDis2_XP, "Description");
		CM.CheckElementDisplayedbyXpath(EL.eleitem2_XP, "Items");
		CM.CheckElementDisplayedbyXpath(EL.eletype2_XP, "Types");
		CM.CheckElementDisplayedbyXpath(EL.eleTypeheader_XP, "Types");
		CM.CheckElementDisplayedbyXpath(EL.eleName3_XP, "Name");
		CM.CheckElementDisplayedbyXpath(EL.eleshort3_XP, "Short Code");
		CM.CheckElementDisplayedbyXpath(EL.eleselection_XP, "Selections");
		CM.CheckElementDisplayedbyXpath(EL.eleitem3_XP, "Items");
		CM.CheckElementDisplayedbyXpath(EL.eleAdd3_XP, "Add");

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
		CM.CheckElementDisplayedbyXpath(EL.eleAddTypeh_XP, "Add Type");
		CM.CheckElementDisplayedbyXpath(EL.eleBasicinfo1_XP, "Basic Info");
		CM.CheckElementDisplayedbyXpath(EL.eleClassifications1_XP, "Classification");
		CM.CheckElementDisplayedbyXpath(EL.eleName1s_XP, "Name");
		CM.CheckElementDisplayedbyXpath(EL.eleShortcode1_XP, "Short Code");
		CM.CheckElementDisplayedbyXpath(EL.eleDescriptio_XP, "Description");
		CM.CheckElementDisplayedbyXpath(EL.eleCatego_XP, "Category");
		CM.CheckElementDisplayedbyXpath(EL.eleSubCat_XP, "Subcategory");
		CM.CheckElementDisplayedbyXpath(EL.eleTypes_XP, "Type");

		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id='TypeName']")).sendKeys(Type);
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id='TypeCode']")).sendKeys(TypeCode);
		driver.findElement(By.xpath("//input[@id='TypeDescription']")).sendKeys(TypeDescription);
		CM.CheckElementDisplayedbyXpath(EL.eleManu_XP, "Manual Number");
		CM.CheckElementDisplayedbyXpath(EL.eleOrg_XP, "Organization ID");
		CM.CheckElementDisplayedbyXpath(EL.eleAss_XP, "Associated Only");
		CM.CheckElementDisplayedbyXpath(EL.eleChan_XP, "Change Needed");
		CM.CheckElementDisplayedbyXpath(EL.eleEff_XP, "Effective Process");
		CM.CheckElementDisplayedbyXpath(EL.eleTra_XP, "Training");
		CM.CheckElementDisplayedbyXpath(EL.eleRev_XP, "Review Period (In Months)");

//		
//		CM.clickonElementbyXpath(EL.eleOrgid_XP, "Org Id ");//click unselect
		CM.clickonElementbyXpath(EL.eleChangeNeeded_XP, "Change needed"); // click unselect
//		CM.clickonElementbyXpath(EL.eleAssociatedonly_XP, "Associated only");//click select 

		// PrimaryDocuments
		CM.CheckElementDisplayedbyXpath(EL.elePrimaryDocuments_XP, " PrimaryDocuments");

		CM.clickonElementbyXpath(EL.eleManualnumber_XP, "Manual number check box");
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
			CM.enteringDataintoTextfiledByXpath(EL.eleDescriptionAutoNum_XP, "deiscription 1", "Discription");
			CM.selectValueinDropdownByVisualtextbyXpath(EL.elePartsAutoNum_XP, "Fixed", "Selection");
			CM.CheckElementDisplayedbyXpath(EL.elebtnAddNewRow_XP, "btnAddNewRow");

		}

		CM.clickonElementbyXpath(EL.eleEffectiveproccess_XP, "Effective proccess");
		CM.enteringDataintoTextfiledByXpath(EL.eleReviewPeriod_XP, ReviewPeriod, "ReviewPeriod");
		CM.selectValueinDropdownByVisualtextbyXpath(EL.eleTrareq_XP, "Mandatory", "Training");

//		WebElement Manualnumber = driver.findElement(By.name("IsNumberingAutoOrManual"));
//		System.out.println("Manualnumber is selected ?" + Manualnumber.isSelected());

		WebElement Orgid = driver.findElement(By.name("IsManualNumberReq"));
		System.out.println("Orgid is selected ?" + Orgid.isSelected());

		WebElement Asso = driver.findElement(By.name("IsCreateIndividual"));
		System.out.println("Associated is selected ?" + Asso.isSelected());

		WebElement ChangeNeeded = driver.findElement(By.name("IsChangeNeeded"));
		System.out.println("ChangeNeeded is selected ?" + ChangeNeeded.isSelected());

		WebElement Effective = driver.findElement(By.name("IsDocEffManually"));
		System.out.println("Effective is selected ?" + Effective.isSelected());

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
//        CM.selectValueinDropdownByVisualtextbyXpath(EL.eleselectprint_XP, "ddlPrintObjects", "ddlPrintObjects");
		CM.CheckElementDisplayedbyXpath(EL.elefieldADD_XP, "Select the Overlays Field to Add");
		CM.CheckElementDisplayedbyXpath(EL.elePreview_XP, "PreView");
		CM.CheckElementDisplayedbyXpath(EL.eleUploadfile_XP, "UploadFile");
		CM.CheckElementDisplayedbyXpath(EL.eleCancle_XP, "Cancle");
		CM.clickonElementbyXpath(EL.eleSAVE_XP, "Save");

//		CM.clickonElementbyXpath(EL.eleA4PS_XP, "A4PotraitSystemApproval checkbox");
//		CM.clickonElementbyXpath(EL.eleA4LP_XP, "A4LandscapePreApproved checkbox");
//		CM.clickonElementbyXpath(EL.eleA4LS_XP, "A4LandscapeSystemApproval checkbox");
//		CM.clickonElementbyXpath(EL.eleA3PP_XP, "A3PotraitPreApproved checkbox");
//		CM.clickonElementbyXpath(EL.eleA3PS_XP, "A3PotraitSystemApproval checkbox");
//		CM.clickonElementbyXpath(EL.eleA3LP_XP, "A3LandscapePreApproved");
//		CM.clickonElementbyXpath(EL.eleA3LS_XP, "A3LandscapeSystemApproval checkbox");

//Associations
		CM.CheckElementDisplayedbyXpath(EL.eleAssociations_XP, "Associations");
//		CM.clickonElementbyXpath(EL.eleLocatio1_XP, "Location");
//		CM.clickonElementbyXpath(EL.eleDepartment_XP, "Department");
//		CM.clickonElementbyXpath(EL.eleMaterial_XP, "Material");
//		CM.clickonElementbyXpath(EL.eleUser_XP, "User");
//		CM.clickonElementbyXpath(EL.eleAsset1_XP, "Asset");
//		CM.clickonElementbyXpath(EL.eleProduct_XP, "Product");
////Issue Configuration		
		CM.CheckElementDisplayedbyXpath(EL.eleConfiguration_XP, "Issue Configuration Header");
		CM.CheckElementDisplayedbyXpath(EL.eleIssuable_XP, "Issuable");
		CM.CheckElementDisplayedbyXpath(EL.eleReturnperiod_XP, "Default Return Period");
		CM.CheckElementDisplayedbyXpath(EL.eleIssueinmonths_XP, "Issue Doc Archival (In Months)");
		CM.enteringDataintoTextfiledByXpath(EL.elereturnperiod_XP, "2", "ReviewPeriod");
		CM.enteringDataintoTextfiledByXpath(EL.eleArvalperi_XP, "3", "ArchivalPeriod");

		CM.selectValueinDropdownByVisualtextbyXpath(EL.eleIssue_XP, "Yes", "ReviewPeriod");
		CM.CheckElementDisplayedbyXpath(EL.eleIssuASS_XP, "Issue Associations");
		WebElement batchnum = driver.findElement(By.xpath("//a[text()='Batch Number']"));
		WebElement ARnumber = driver.findElement(By.xpath("//a[text()='AR Number']"));
		WebElement Product = driver.findElement(By.xpath("//a[text()='Product']"));
		WebElement Asset = driver.findElement(By.xpath("//a[text()='Asset']"));
		WebElement Manufacturing = driver.findElement(By.xpath("//a[text()='Manufacturing Date']"));
		WebElement Expiry = driver.findElement(By.xpath("//a[text()='Expiry Date']"));
		WebElement ParentBatch = driver.findElement(By.xpath("//a[text()='Parent Batch']"));
		WebElement ReferenceNo = driver.findElement(By.xpath("//a[text()='Reference No']"));
		WebElement BatchSize = driver.findElement(By.xpath("//a[text()='Batch Size']"));
		WebElement Material = driver.findElement(By.xpath("//a[text()='Material']"));
		WebElement Optional1 = driver.findElement(By.xpath("//a[text()='Optional1']"));
		WebElement Optional2 = driver.findElement(By.xpath("//a[text()='Optional2']"));
		WebElement Optional3 = driver.findElement(By.xpath("//a[text()='Optional3']"));
		batchnum.click();
		ARnumber.click();
		Product.click();
		Asset.click();
		Manufacturing.click();
//		Expiry.click();
//		ParentBatch.click();
//		ReferenceNo.click();
//		BatchSize.click();
//		Material.click();
//		Optional1.click();
//		Optional2.click();
//		Optional3.click();
//PrintConfiguration		
		CM.CheckElementDisplayedbyXpath(EL.elePrintConfiguration_XP, "PrintConfiguration");
		CM.CheckElementDisplayedbyXpath(EL.eleAllowControlled_XP, "AllowControlled");
		CM.CheckElementDisplayedbyXpath(EL.eleReturnPeriod_XP, "ReturnPeriod");
		CM.clickonElementbyXpath(EL.eleControlled_XP, "Controlled print");
		WebElement controlledprint = driver.findElement(By.name("IsCanControlCopy"));
		System.out.println("controlledprint is selected ?" + controlledprint.isSelected());

//iniciatioin
		CM.CheckElementDisplayedbyXpath(EL.eleWorkflo_XP, "Workflows");
		CM.CheckElementDisplayedbyXpath(EL.eleInici_XP, "Initiation");
		CM.CheckElementDisplayedbyXpath(EL.eleDefult1_XP, "DEFAULT WORKFLOW");
		CM.CheckElementDisplayedbyXpath(EL.eleLevel1_XP, "Level");
		CM.CheckElementDisplayedbyXpath(EL.eleDesibased_XP, "Designation Based?");
		CM.CheckElementDisplayedbyXpath(EL.eleuserbased1_XP, "User Based");
		CM.CheckElementDisplayedbyXpath(EL.eleUserBased1man_XP, "User Based(*)");
		CM.CheckElementDisplayedbyXpath(EL.eleDesignation1_XP, "Designation Based");
		CM.CheckElementDisplayedbyXpath(EL.eleDesignationBasedman_XP, "Designation Based(*)");
		CM.CheckElementDisplayedbyXpath(EL.eleAddcondiworkflow_XP, "Add Cond Workflow");
		CM.CheckElementDisplayedbyXpath(EL.eleheaderconditionworkflow_XP, "CONDITIONAL WORKFLOWS");
		CM.CheckElementDisplayedbyXpath(EL.eleNamea1_XP, "Name");
		CM.CheckElementDisplayedbyXpath(EL.eleCondition1_XP, "Conditions");
		CM.CheckElementDisplayedbyXpath(EL.eleLevels1_XP, "Levels");
		CM.CheckElementDisplayedbyXpath(EL.eleActiveinac_XP, "Active/Inactive");
		CM.CheckElementDisplayedbyXpath(EL.eleAddlevelsiniciate_XP, "Add row");
		try {
			CM.clickonElementbyXpath(EL.eleEnableWorkflow_XP, "EnableWorkflow on Iniciate");
			CM.enteringDataintoTextfiledByXpath(EL.eleLevelName1_XP, "Frist", "LevelName");
			WebElement Designased = driver.findElement(By.name("IsDesignationBased"));
//Designased.click();
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
//Designased2.click();
		Thread.sleep(500);
		System.out.println("Designased is selected ?" + Designased2.isSelected());

		if (Designased2.isSelected()) {
			CM.selectValueinDropdownByVisualtextbyXpath(EL.eleReviewerRoleId1_XP, "QA HOD (QAH1)", "Designation Based");
			System.out.println("selected designation based");
		} else {
			CM.selectValueinDropdownByVisualtextbyXpath(EL.eleUserbased2_XP, "User Based", "Userbased");
			System.out.println("selected userbased");
		}

//	
//reviewer 2
		driver.findElement(By.xpath("//tr[@id='tr_Reviewer_278030_0']/td[11]/div/span[1]")).click();

		WebElement Designased3 = driver.findElement(By.xpath("(//input[@name='IsDesignationBased'])[5]"));
// Designased3.click();

		System.out.println("Designased is selected ?" + Designased3.isSelected());
		Thread.sleep(500);
		if (Designased3.isSelected()) {
			CM.selectValueinDropdownByVisualtextbyXpath(EL.eleReviewerRoleId2_XP, "QA HOD (QAH1)", "Designation Based");
			System.out.println("selected designation based");
		} else {
			CM.selectValueinDropdownByVisualtextbyXpath(EL.eleUserbased2s_XP, "User Based", "Userbased");
			System.out.println("selected userbased");
		}
//reviewer 3
		// reviewer 2
		driver.findElement(By.xpath("//tr[@id='tr_Reviewer_278030_1']/td[11]/div/span[1]")).click();

		WebElement Designased4 = driver.findElement(By.xpath("(//input[@name='IsDesignationBased'])[7]"));
//Designased4.click();
		System.out.println("Designased is selected ?" + Designased4.isSelected());

		if (Designased4.isSelected()) {
			CM.selectValueinDropdownByVisualtextbyXpath(EL.eleReviewr3_XP, "QA HOD (QAH1)", "Designation Based");
			System.out.println("selected designation based");
		} else {
			CM.selectValueinDropdownByVisualtextbyXpath(EL.eleuserbased3_XP, "User Based", "Userbased");
			System.out.println("selected userbased");
		}

//Approver

		CM.CheckElementDisplayedbyXpath(EL.eleApprover_XP, "Approver");
		CM.CheckElementDisplayedbyXpath(EL.eledesi2_XP, "Designation Based?");
		CM.CheckElementDisplayedbyXpath(EL.eleuserba_XP, "User Based'");
		CM.CheckElementDisplayedbyXpath(EL.eleusermand_XP, "User Based");
		CM.CheckElementDisplayedbyXpath(EL.eleDesig_XP, "Designation (If Designation Based)");
		CM.CheckElementDisplayedbyXpath(EL.eleDesignased_XP, "Designation (If Designation Based)");
		CM.CheckElementDisplayedbyXpath(EL.eleApproval_XP, "Approval 1");
//		CM.clickonElementbyXpath(EL.eleAdd1_XP, "Add Approver 2");
//		CM.clickonElementbyXpath(EL.eleAdd1_XP, "Add Approver 2");
//Approver 1
		WebElement Approver1 = driver
				.findElement(By.xpath("//tr[@id='tr_Approval_278030_0']//input[@name='IsDesignationBased'][1]"));
//Approver1.click();

		System.out.println("Designased is selected ?" + Approver1.isSelected());
		Thread.sleep(500);
		if (Approver1.isSelected()) {
			CM.selectValueinDropdownByVisualtextbyXpath(EL.eleApprovelrole_XP, "QA HOD (QAH1)", "Designation Based");
			System.out.println("selected designation based");
		} else {
			CM.selectValueinDropdownByVisualtextbyXpath(EL.eleuserbased1a_XP, "User Based", "Userbased");
			System.out.println("selected userbased");
		}

//Approver2
		driver.findElement(By.xpath("//tr[@id='tr_Approval_278030_0']/td[11]/div/span[1]")).click();
		WebElement Approver2 = driver
				.findElement(By.xpath("//tr[@id='tr_Approval_278030_1']//input[@name='IsDesignationBased'][1]"));
//Approver2.click();

		System.out.println("Designased is selected ?" + Approver2.isSelected());
		Thread.sleep(500);
		if (Approver2.isSelected()) {
			CM.selectValueinDropdownByVisualtextbyXpath(EL.eleApprover2_XP, "QA HOD (QAH1)", "Designation Based");
			System.out.println("selected designation based");
		} else {
			CM.selectValueinDropdownByVisualtextbyXpath(EL.eleUsers2_XP, "User Based", "Userbased");
			System.out.println("selected userbased");

		}
//Approver3
		driver.findElement(By.xpath("//tr[@id='tr_Approval_278030_1']/td[11]/div/span[1]")).click();

		WebElement Approver3 = driver
				.findElement(By.xpath("//tr[@id='tr_Approval_278030_2']//input[@name='IsDesignationBased'][1]"));
//Approver3.click();
		System.out.println("Designased is selected ?" + Approver3.isSelected());

		if (Approver3.isSelected()) {
			CM.selectValueinDropdownByVisualtextbyXpath(EL.eleApprover3_XP, "QA HOD (QAH1)", "Designation Based");
			System.out.println("selected designation based");
		} else {
			CM.selectValueinDropdownByVisualtextbyXpath(EL.eleUser3_XP, "User Based", "Userbased");
			System.out.println("selected userbased");

		}

//Make effective
		CM.CheckElementDisplayedbyXpath(EL.eleMakeEffective_XP, "MakeEffective");
		CM.clickonElementbyID(EL.eleEffectiveApproval_XP, "EffectiveApproval");
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
//		Effectivedesig.click();
		Thread.sleep(500);
		System.out.println("Designased is selected ?" + Effectivedesig.isSelected());

		if (Effectivedesig.isSelected()) {
//					driver.findElement(By.xpath("//div[@class='cr-wrap workflow_278031']//select[@id='_ApproverRoleId_1']")).sendKeys("QA HOD (QAH1)");
			CM.selectValueinDropdownByVisualtextbyXpath(EL.eleApproverRol3_XP, "QA User (QAU1)", "Designation Based");
			System.out.println("selected designation based");
		} else {
			CM.selectValueinDropdownByVisualtextbyXpath(EL.eleUserbased4_XP, "User Based", "Userbased");
			System.out.println("selected userbased");
		}
//2
		CM.clickonElementbyXpath(EL.eleadd4_XP, "Add");
		CM.enteringDataintoTextfiledByXpath(EL.eleLevelNam2input_XP, "SECOUND", "level name");

		WebElement Effectivedesig2 = driver
				.findElement(By.xpath("(//tr[@id='tr_278031_1']/td[4]/input[@id='_IsDesignationBased_2'])[1]"));
//		Effectivedesig2.click();
		System.out.println("Designased is selected ?" + Effectivedesig2.isSelected());
		if (Effectivedesig2.isSelected()) {
			CM.selectValueinDropdownByVisualtextbyXpath(EL.eleApproverR2_XP, "QA User (QAU1)", "Designation Based");
			System.out.println("selected designation based");
		} else {
			CM.selectValueinDropdownByVisualtextbyXpath(EL.eleUSer2Effeect_XP, "User Based", "Userbased");
			System.out.println("selected userbased");
		}
//3
		CM.clickonElementbyXpath(EL.eleEffectiveadd2_XP, "Add");
		CM.enteringDataintoTextfiledByXpath(EL.eleeffectivelabel3_XP, "Third", "label name 3");
		WebElement Effectivedesig3 = driver.findElement(By.xpath("(//tr[@id='tr_278031_2']/td[4]/input)[1]"));
//		Effectivedesig3.click();
		System.out.println("Designased is selected ?" + Effectivedesig3.isSelected());
		if (Effectivedesig3.isSelected()) {
			CM.selectValueinDropdownByVisualtextbyXpath(EL.eleEffectivapprovar3_XP, "QA User (QAU1)",
					"Designation Based");
		} else {
			CM.selectValueinDropdownByVisualtextbyXpath(EL.eleeffectiveuser3_XP, "User Based", "Userbased");
			System.out.println("selected userbased");
		}
/////issue
		CM.CheckElementDisplayedbyXpath(EL.eleEssuWorkflow_XP, "Workflow for Document - Issue ");
		CM.CheckElementDisplayedbyXpath(EL.eleissuedefult_XP, "DEFAULT WORKFLOW");
		CM.CheckElementDisplayedbyXpath(EL.eleissuelavalname_XP, "Lavel name");
		CM.CheckElementDisplayedbyXpath(EL.eleissuedesi_XP, "designesed based?");
		CM.CheckElementDisplayedbyXpath(EL.eleissueuser_XP, "user based");
		CM.CheckElementDisplayedbyXpath(EL.eleissuedesig_XP, "designesed");
		CM.CheckElementDisplayedbyXpath(EL.eleAddissuerow_XP, "add row");
//1		
		CM.clickonElementbyXpath(EL.eledocissueON_XP, "doc issue ON");// issuebutton
		WebElement Issuedesibased1 = driver.findElement(By.xpath("//tr[@id='tr_305053_0']/td[4]/input[1]"));
//		Issuedesibased1.click();//designased on
		System.out.println("Issuedesibased1 is selected ?" + Issuedesibased1.isSelected());
		if (Issuedesibased1.isSelected()) {
			CM.selectValueinDropdownByVisualtextbyXpath(EL.eleissueifdesibased_XP, "QA User (QAU1)",
					"Designation Based");
		} else {
			CM.selectValueinDropdownByVisualtextbyXpath(EL.eleissueuserbased_XP, "User Based", "Userbased");
			System.out.println("selected userbased");
		}
		CM.enteringDataintoTextfiledByXpath(EL.eleIssuelevelinput_XP, "Issue Frist", " issue level name");

//2
		CM.clickonElementbyXpath(EL.eleAddissueRow_XP, "Add issue Row");
		CM.enteringDataintoTextfiledByXpath(EL.eleissuelevel2_XP, "Issue level secound", "issue level 2");
		WebElement Issuedesibased2 = driver.findElement(By.xpath("//tr[@id='tr_305053_1']/td[4]/input[1]"));
//		Issuedesibased2.click();
		System.out.println("Issuedesibased2 is selected ?" + Issuedesibased2.isSelected());
		if (Issuedesibased2.isSelected()) {
			CM.selectValueinDropdownByVisualtextbyXpath(EL.eleDesibasedifissue2_XP, "QA User (QAU1)",
					"Designation Based");
		} else {
			CM.selectValueinDropdownByVisualtextbyXpath(EL.eleuserbased2issu_XP, "User Based", "Userbased");
			System.out.println("selected userbased");
		}
//3
		CM.clickonElementbyXpath(EL.eleAddissuerow3_XP, "Add issue row 3");
		CM.enteringDataintoTextfiledByXpath(EL.eleissueleve3_XP, "Issue level 3", "Issu level 3");
		WebElement Issue3desibased3 = driver.findElement(By.xpath("//tr[@id='tr_305053_2']/td[4]/input[1]"));
//		Issue3desibased3.click();
		if (Issue3desibased3.isSelected()) {
			CM.selectValueinDropdownByVisualtextbyXpath(EL.eleDesibasedifissue3_XP, "QA User (QAU1)",
					"Designation Based");
		} else {
			CM.selectValueinDropdownByVisualtextbyXpath(EL.eleuserbased3issu_XP, "User Based", "Userbased");
			System.out.println("selected userbased");
		}

//Control print		
//1		////
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
//		Control1isdesibased.click();
		if (Control1isdesibased.isSelected()) {
			CM.selectValueinDropdownByVisualtextbyXpath(EL.eleIFdesi1control_XP, "QA User (QAU1)", "Designation Based");
		} else {
			CM.selectValueinDropdownByVisualtextbyXpath(EL.eleprintuserbased1_XP, "User Based", "Userbased");
			System.out.println("selected userbased");
		}
//	2
		CM.clickonElementbyXpath(EL.eleAddcontrolRow2_XP, "AddcontrolRow2");
		CM.enteringDataintoTextfiledByXpath(EL.elePrintlevel2_XP, "Control print level 2", "Control print level 2");
		WebElement Control2isdesibased = driver.findElement(By.xpath("//tr[@id='tr_305054_1']/td[4]/input"));
//		Control2isdesibased.click();
		if (Control2isdesibased.isSelected()) {
			CM.selectValueinDropdownByVisualtextbyXpath(EL.eleIFdesi1contro2_XP, "QA User (QAU1)", "Designation Based");
		} else {
			CM.selectValueinDropdownByVisualtextbyXpath(EL.eleprintuserbased2_XP, "User Based", "Userbased");
			System.out.println("selected userbased");
		}
//3

		CM.clickonElementbyXpath(EL.eleAddcontrolRow3_XP, "Add control row 3");
		CM.enteringDataintoTextfiledByXpath(EL.elePrintlevel3_XP, "Control print level 3", "Control print name3");
		WebElement Control3isdesibased = driver.findElement(By.xpath("//tr[@id='tr_305054_2']/td[4]/input"));
//		Control3isdesibased.click();
		if (Control3isdesibased.isSelected()) {
			CM.selectValueinDropdownByVisualtextbyXpath(EL.eleIFdesi1contro3_XP, "QA User (QAU1)", "Designation Based");
		} else {
			CM.selectValueinDropdownByVisualtextbyXpath(EL.eleprintuserbased3_XP, "User Based", "Userbased");
			System.out.println("selected userbased");
		}
// Reconciliation
		CM.CheckElementDisplayedbyXpath(EL.eleReconciliation_XP, "Workflow for Document - Reconciliation");
		CM.CheckElementDisplayedbyXpath(EL.eleReconciationworkfliow_XP, "Reconciliation workflow");
		CM.clickonElementbyXpath(EL.eleIsReconcillationApprovalReq_XP, "IsReconcillationApprovalReq");
		String counciation = driver.findElement(By.xpath("//table[@id='tableDoc_Approval_383001_Types']//th"))
				.getText();
		CM.CheckElementDisplayedbyXpath(EL.eleRecounConditioFlow_XP, "Conditional work flow");
		CM.enteringDataintoTextfiledByXpath(EL.eleRecountLevelname1_XP, "RecountLevelname 1", "RecountLevelname");
		WebElement Reconciliation1isdesibased = driver.findElement(By.xpath("//tr[@id='tr_383001_0']/td[4]/input"));
//		Reconciliation1isdesibased.click();
		if (Reconciliation1isdesibased.isSelected()) {
			CM.selectValueinDropdownByVisualtextbyXpath(EL.eleRecounciIfDesibased_XP, "QA User (QAU1)",
					"Designation Based");
		} else {
			CM.selectValueinDropdownByVisualtextbyXpath(EL.eleRecounciUserbased1_XP, "User Based", "Userbased");
			System.out.println("selected userbased");
		}

//2
		CM.clickonElementbyXpath(EL.eleRecounci2rowAdd_XP, "Reconciliation Add row 2");
		CM.enteringDataintoTextfiledByXpath(EL.eleRecountLevelname2_XP, "Reconciliation Level name 2",
				"Reconciliation Level name 2");
		WebElement Reconciliation2isdesibased = driver.findElement(By.xpath("//tr[@id='tr_383001_1']/td[4]/input"));
//		Reconciliation2isdesibased.click();
		if (Reconciliation2isdesibased.isSelected()) {
			CM.selectValueinDropdownByVisualtextbyXpath(EL.eleRecounciIfDesibased2_XP, "QA User (QAU1)",
					"Designation Based");
		} else {
			CM.selectValueinDropdownByVisualtextbyXpath(EL.eleRecounciUserbased2_XP, "User Based", "Userbased");
			System.out.println("selected userbased");
		}
//3
		CM.clickonElementbyXpath(EL.eleRecounci3rowAdd_XP, "Reconciliation Add row 3");
		CM.enteringDataintoTextfiledByXpath(EL.eleRecountLevelname3_XP, "Reconciliation Level name 3",
				"Reconciliation Level name 3");
		WebElement Reconciliation3isdesibased = driver.findElement(By.xpath("//tr[@id='tr_383001_2']/td[4]/input"));
//		Reconciliation3isdesibased.click();
		if (Reconciliation3isdesibased.isSelected()) {
			CM.selectValueinDropdownByVisualtextbyXpath(EL.eleRecounciIfDesibased3_XP, "QA User (QAU1)",
					"Designation Based");
		} else {
			CM.selectValueinDropdownByVisualtextbyXpath(EL.eleRecounciUserbased3_XP, "User Based", "Userbased");
			System.out.println("selected userbased");
		}

//

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
}
