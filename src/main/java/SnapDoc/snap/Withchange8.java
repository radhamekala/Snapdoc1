package SnapDoc.snap;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class Withchange8 extends TestBase{
	String initiatedBy = "Ankita Ghosh";
	String InitiatedBy = "Ankita Ghosh ";
	String Category = "Analytical";
	String Subcategory = "Specification";
	String Type = "Hydrophi"; // Chroro 1MG- change control //Topiramite //amisulpride//Topiramite 1-not//
	String Typenames = " Hydrophi ";
	String TypeCode = "ABD2";
	String OrgID = "Org271";
	String Number = "272";
	String Description = "Hydrosulf 16Ac 2MG"; // mandatory change
	String ReviewPeriod = "2";
	String Makeeffectivelevelname = "frist";
	String TypeName2 = " Sample 1 ";
	String changecontrolnumbar = "7595";
	String changecontrolDescription = "change control descriptions 2";
	String Title = "Hydrosulfaror 21";
	String TypeDescription = "Amisulpride 35MG material";
//	String OrgID = "Org0023";
//	String Number = "0043 ";
	String displayNumber = " 272(Org271) ";
	String SubDOcNumber = "272(Org271)";
	String vertion = "0";
	String expectedTitlenuber = "Hydrosulfaror 21 \n272 (Org271) Ver 0.00";// title orgid number version
	String expectedlocationDepartment = "Loc     : Unit-II\nDept    : Quality Assurance";
	String Settingpresys = "A4 Potrait\nPre Approved";
	String Material = "150 CC LW HDPE Container ( 12001126 ) ";
	String Asset = "Air Compressor ( 2EN/E-005 ) ";
	String asset = " Air Compressor";
	String USER = "G Appala Naidu (12128) ";
	String useR = " appala.naidu";
	String Products = "Abacavir Tablets IP 300 mg ( 13001374 ) ";
	String productS = "Abacavir Tablets IP 300 mg";
	String Associateddoc1Type = "Topiramite";
	String Associateddoc1Title = "sodium-B";
	String number2 = "C4131";
	String Org2 = "org4231";
	String Description2 = "sodium 20m";
	String NonSignatory = "G Appala Naidu (12128)";
	String NonSignatoryNAME = "appala.naidu";
	String Reviewer1 = "MSR Reddy (20309)";// Ankita Ghosh (12079)
	String Reviewer1username = "sr.reddy";// ankita.ghosh
	String Password = "demo";
	String Reviewer2 = "Arun Kumar Singh (12390)";
	String Reviewer2username = "arun.singh";
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
	String nonsignatoryremarks="NO";
	String Reviewer1remarks = "No remarks";
	public static String Date;
	public static String NonSignataryAcceptedON;
	public static String NonSignatoryRemarks;
	public void Withchangeautouserbased() throws InterruptedException {
		driver.findElement(By.xpath("(//span[text()='Analytical'])[2]")).click();
		driver.findElement(By.xpath("//td[text()='Specification']")).click();
		Thread.sleep(10000);
		WebElement Add = driver.findElement(By.xpath("(//input[@value='Add'])[3]"));
		try {
			Add.click();
		} catch (StaleElementReferenceException e) {
			Add = driver.findElement(By.xpath("(//input[@value='Add'])[3]"));
			Add.click();
		}
		driver.findElement(By.xpath("//input[@id='TypeName']")).sendKeys(Type);
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id='TypeCode']")).sendKeys(TypeCode);
		driver.findElement(By.xpath("//input[@id='TypeDescription']")).sendKeys(TypeDescription);

//	CM.clickonElementbyXpath(EL.eleOrgid_XP, "Org Id ");// click unselect
//	CM.clickonElementbyXpath(EL.eleChangeNeeded_XP, "Change needed"); // click unselect
//	CM.clickonElementbyXpath(EL.eleAssociatedonly_XP, "Associated only");
		CM.clickonElementbyXpath(EL.eleEffectiveproccess_XP, "Effective manually");// click effective manually
		CM.clickonElementbyXpath(EL.eleManualnumber_XP, "Manual number check box");// click select
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
//			CM.selectValueinDropdownByVisualtextbyXpath(EL.elerdbtnNumberingType_XP, "Independent",
//					"Numbering Approach");
//			CM.enteringDataintoTextfiledByXpath(EL.eleDescriptionAutoNum_XP, "deiscription 1", "Discription");
//			CM.selectValueinDropdownByVisualtextbyXpath(EL.elePartsAutoNum_XP, "Fixed", "Selection");
//			CM.CheckElementDisplayedbyXpath(EL.elebtnAddNewRow_XP, "btnAddNewRow");

		}
		WebElement Orgid = driver.findElement(By.name("IsManualNumberReq"));
		System.out.println("Orgid is selected ?" + Orgid.isSelected());

		WebElement Asso = driver.findElement(By.name("IsCreateIndividual"));
		System.out.println("Associated is selected ?" + Asso.isSelected());
		WebElement ChangeNeeded = driver.findElement(By.name("IsChangeNeeded"));
		System.out.println("ChangeNeeded is selected ?" + ChangeNeeded.isSelected());
		WebElement Effective = driver.findElement(By.name("IsDocEffManually"));
		System.out.println("Effective is selected ?" + Effective.isSelected());
//Document Layout Configuration
		CM.clickonElementbyXpath(EL.eleA4PP_XP, "A4PotraitPreApproved checkbox");
		CM.clickonElementbyXpath(EL.eleSAVE_XP, "Save");
//Associations
		CM.CheckElementDisplayedbyXpath(EL.eleAssociations_XP, "Associations");
		CM.clickonElementbyXpath(EL.eleLocatio1_XP, "Location");
		CM.clickonElementbyXpath(EL.eleDepartment_XP, "Department");
		CM.clickonElementbyXpath(EL.eleMaterial_XP, "Material");
		CM.clickonElementbyXpath(EL.eleUser_XP, "User");
		CM.clickonElementbyXpath(EL.eleAsset1_XP, "Asset");
		CM.clickonElementbyXpath(EL.eleProduct_XP, "Product");
////Issue Configuration		
		CM.CheckElementDisplayedbyXpath(EL.eleConfiguration_XP, "Issue Configuration Header");
		CM.CheckElementDisplayedbyXpath(EL.eleIssuable_XP, "Issuable");
		CM.CheckElementDisplayedbyXpath(EL.eleReturnperiod_XP, "Default Return Period");
		CM.CheckElementDisplayedbyXpath(EL.eleIssueinmonths_XP, "Issue Doc Archival (In Months)");
		CM.enteringDataintoTextfiledByXpath(EL.elereturnperiod_XP, "2", "ReviewPeriod");
		CM.enteringDataintoTextfiledByXpath(EL.eleArvalperi_XP, "3", "ArchivalPeriod");
		CM.selectValueinDropdownByVisualtextbyXpath(EL.eleIssue_XP, "Yes", "ReviewPeriod");
//associations
		WebElement batchnum = driver.findElement(By.xpath("//a[text()='Batch Number']"));
		WebElement ARnumber = driver.findElement(By.xpath("//a[text()='AR Number']"));
		WebElement Product = driver.findElement(By.xpath("//a[text()='Product']"));
		WebElement Asset = driver.findElement(By.xpath("//a[text()='Asset']"));
		WebElement Manufacturing = driver.findElement(By.xpath("//a[text()='Manufacturing Date']"));
		batchnum.click();
		ARnumber.click();
		Product.click();
		Asset.click();
		Manufacturing.click();
//PrintConfiguration		
//			CM.clickonElementbyXpath(EL.eleControlled_XP, "Controlled print");  // if click off
		WebElement controlledprint = driver.findElement(By.name("IsCanControlCopy"));
		System.out.println("controlledprint is selected ?" + controlledprint.isSelected());
//iniciatioin
		try {
			CM.clickonElementbyXpath(EL.eleEnableWorkflow_XP, "EnableWorkflow on Iniciate");
			CM.enteringDataintoTextfiledByXpath(EL.eleLevelName1_XP, "Frist", "LevelName");
			WebElement Designased = driver.findElement(By.name("IsDesignationBased"));
			// Designased.click();
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
		try {
			WebElement SubmissionApproval = driver.findElement(By.name("IsSubmissionApprovalReq"));
			System.out.println("SubmissionApproval is selected ?" + SubmissionApproval.isSelected());
		} catch (Exception e) {
			System.out.println("not able select");
			System.out.println("Exception : " + e);
		}
		WebElement Designased2 = driver.findElement(By.xpath("(//input[@name='IsDesignationBased'])[3]"));
		// Designased2.click();
		Thread.sleep(500);
		System.out.println("Designased is selected ?" + Designased2.isSelected());
		if (Designased2.isSelected()) {
			CM.selectValueinDropdownByVisualtextbyXpath(EL.eleReviewerRoleId1_XP, "QA HOD (QAH1)", "Designation Based");
			System.out.println("selected designation based");
		} else {
			CM.selectValueinDropdownByVisualtextbyXpath(EL.eleUserbased2_XP, "User Based", "Userbased");
			System.out.println("selected userbased");
		}
		// Approver
		// Approver 1
		WebElement Approver1 = driver
				.findElement(By.xpath("//tr[@id='tr_Approval_278030_0']//input[@name='IsDesignationBased'][1]"));
		// Approver1.click();
		System.out.println("Designased is selected ?" + Approver1.isSelected());
		Thread.sleep(500);
		if (Approver1.isSelected()) {
			CM.selectValueinDropdownByVisualtextbyXpath(EL.eleApprovelrole_XP, "QA HOD (QAH1)", "Designation Based");
			System.out.println("selected designation based");
		} else {
			CM.selectValueinDropdownByVisualtextbyXpath(EL.eleuseR_XP, "User Based", "Userbased");
			System.out.println("selected userbased");
		}
		// Make effective
		CM.clickonElementbyID(EL.eleEffectiveApproval_XP, "EffectiveApproval");
		CM.enteringDataintoTextfiledByXpath(EL.eleLevelName_XP, Makeeffectivelevelname, "LevelName");
		WebElement Effectivedesig = driver
				.findElement(By.xpath("//tr[@id='tr_278031_0']//input[@id='IsDesignationBased']"));
//					Effectivedesig.click();
		Thread.sleep(500);
		System.out.println("Designased is selected ?" + Effectivedesig.isSelected());

		if (Effectivedesig.isSelected()) {
//								driver.findElement(By.xpath("//div[@class='cr-wrap workflow_278031']//select[@id='_ApproverRoleId_1']")).sendKeys("QA HOD (QAH1)");
			CM.selectValueinDropdownByVisualtextbyXpath(EL.eleApproverRol3_XP, "QA User (QAU1)", "Designation Based");
			System.out.println("selected designation based");
		} else {
			CM.selectValueinDropdownByVisualtextbyXpath(EL.eleUserbased4_XP, "User Based", "Userbased");
			System.out.println("selected userbased");
		}
		// issue
		CM.clickonElementbyXpath(EL.eledocissueON_XP, "doc issue ON");// issuebutton
		WebElement Issuedesibased1 = driver.findElement(By.xpath("//tr[@id='tr_305053_0']/td[4]/input[1]"));
//					Issuedesibased1.click();//designased on
		System.out.println("Issuedesibased1 is selected ?" + Issuedesibased1.isSelected());
		if (Issuedesibased1.isSelected()) {
			CM.selectValueinDropdownByVisualtextbyXpath(EL.eleissueifdesibased_XP, "QA User (QAU1)",
					"Designation Based");
		} else {
			CM.selectValueinDropdownByVisualtextbyXpath(EL.eleissueuserbased_XP, "User Based", "Userbased");
			System.out.println("selected userbased");
		}
		CM.enteringDataintoTextfiledByXpath(EL.eleIssuelevelinput_XP, "Issue Frist", " issue level name");
		// Control print //1 ////
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
//							Control1isdesibased.click();
		if (Control1isdesibased.isSelected()) {
			CM.selectValueinDropdownByVisualtextbyXpath(EL.eleIFdesi1control_XP, "QA User (QAU1)", "Designation Based");
		} else {
			CM.selectValueinDropdownByVisualtextbyXpath(EL.eleprintuserbased1_XP, "User Based", "Userbased");
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
//				Reconciliation1isdesibased.click();
		if (Reconciliation1isdesibased.isSelected()) {
			CM.selectValueinDropdownByVisualtextbyXpath(EL.eleRecounciIfDesibased_XP, "QA User (QAU1)",
					"Designation Based");
		} else {
			CM.selectValueinDropdownByVisualtextbyXpath(EL.eleRecounciUserbased1_XP, "User Based", "Userbased");
			System.out.println("selected userbased");
		}
//Destuctions
		CM.CheckElementDisplayedbyXpath(EL.eledestra_XP, "Workflow for Document - Destruction ");
		CM.clickonElementbyXpath(EL.eledescrict_XP, "IsDestructionApprovalReq");
//		driver.findElement(By.xpath("//tr[@id='tr_383002_0']/td[3]/input")).sendKeys("1");

		CM.enteringDataintoTextfiledByXpath(EL.eledeslevel_XP, "RecountLevelname 1", "Destuctions");
		WebElement Destuctions1isdesibased = driver.findElement(By.xpath("//tr[@id='tr_383002_0']/td[4]/input[1]"));
//				Destuctions1isdesibased.click();
		if (Destuctions1isdesibased.isSelected()) {
			CM.selectValueinDropdownByVisualtextbyXpath(EL.eledisdisignased_XP, "QA User (QAU1)", "Designation Based");
		} else {
			CM.selectValueinDropdownByVisualtextbyXpath(EL.eledistuuserbased_XP, "User Based", "Userbased");
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

	public void withchangeAuto() throws InterruptedException {
		Thread.sleep(3000);
		CM.clickonElementbyXpath(EL.eleInitiate_XP, "Initiate");
		Thread.sleep(2000);
		CM.selectValueinDropdownByVisualtextbyXpath(EL.eleAddtype_XP, Type, "Addtype");
		CM.enteringDataintoTextfiledByXpath(EL.eletxtTitle_XP, Title, "txtTitle_1");
		Thread.sleep(2000);
		WebElement DOCNUM = driver.findElement(By.xpath("//input[@id='txtIsNumberingAutoOrManual_1']"));
		if (DOCNUM.isEnabled()) {

			CM.enteringDataintoTextfiledByXpath(EL.eleDocNumber_XP, Number, "Document number");
		} else {
			System.out.println("doc number disabled");
		}
		WebElement ORGID = driver.findElement(By.xpath("//input[@id='txtNumber_1']"));
		if (ORGID.isEnabled()) {

			CM.enteringDataintoTextfiledByXpath(EL.eletxtNumber_XP, OrgID, "org id");
		} else {
			System.out.println("doc number disabled");
		}
		CM.enteringDataintoTextfiledByXpath(EL.eleVersionNo_XP, vertion, "txtVersionNo_1");
		try {
			WebElement location = driver.findElement(By.xpath("//div[text()='Location']"));
			if (location.isDisplayed()) {
				location.click();
				Thread.sleep(1500);
				WebElement ele = driver.findElement(By.xpath("//div[text()='Unit-II']"));
				AS.doubleClick(ele).perform();
			} else {
				System.out.println("location not mandatory");
			}
			if (driver.findElement(By.xpath("//div[text()='Quality Assurance']")).isEnabled()) {
				WebElement deparment = driver.findElement(By.xpath("//div[text()='Quality Assurance']"));

				AS.doubleClick(deparment).perform();
			} else {
				System.out.println("Department not mandatory");
			}
			if (driver.findElement(By.xpath("//div[text()='Material']")).isEnabled()) {
				CM.selectValueinDropdownByVisualtextbyXpath(EL.eleselectmaterial_XP, Material, "Material");
			} else {
				System.out.println("material disabled");
			}
			if (driver.findElement(By.xpath("//div[text()='Asset']")).isEnabled()) {
				CM.selectValueinDropdownByVisualtextbyXpath(EL.eleAsset_XP, Asset, "Asset");
			} else {
				System.out.println("material disabled");
			}
			if (driver.findElement(By.xpath("//div[text()='User']")).isDisplayed()) {
				CM.selectValueinDropdownByVisualtextbyXpath(EL.eleusers_XP, USER, "User");
			} else {
				System.out.println("User disabled");
			}
			if (driver.findElement(By.xpath("//div[text()='Product']")).isEnabled()) {
				CM.selectValueinDropdownByVisualtextbyXpath(EL.eleproduct_XP, Products, "Product");
			} else {
				System.out.println("Product disabled");
			}
		} catch (Exception e) {
			System.out.println("associations not selected");
		}
		CM.clickonElementbyXpath(EL.eleSaVe_XP, "Save");
		Thread.sleep(500);
		CM.selectValueinDropdownselectbyvalueXpath(EL.eledoclayoutp_XP, "1", "Select docu Lyout");
		CM.enteringDataintoTextfiledByXpath(EL.eleDescriptions1_XP, Description, "Description");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//i[@class='fa fa-upload']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\SSD\\Downloads\\pdf [3].pdf");
		Thread.sleep(500);
		CM.clickonElementbyXpath(EL.eleSaVe_XP, "Save");
		WebElement primary = driver.findElement(By.xpath("//input[@id='rbPrimary_1']"));
		if (primary.isSelected()) {
			System.out.println(" type is  primary ");
		} else {
			System.out.println("this type is not a primary");
		}
		CM.clickonElementbyXpath(EL.eleSubmit_XP, "Submit");

		try {
			String Alert = driver.switchTo().alert().getText();
			System.out.println(Alert);
			String atlistonechange = "At list one Change Control is needed";
			if (Alert.equals(atlistonechange)) {
				driver.switchTo().alert().accept();
				CM.CheckElementDisplayedbyXpath(EL.elechangeinfo_XP, "Change Control Info");
				CM.CheckElementDisplayedbyXpath(EL.elecontrolnum_XP, "Change Control Number");
				CM.CheckElementDisplayedbyXpath(EL.eleDescrisp_XP, "Description");
				CM.CheckElementDisplayedbyXpath(EL.elefilechange_XP, "File");
				CM.CheckElementDisplayedbyID(EL.eleAddchange_XP, "Add change info button");
				CM.clickonElementbyID(EL.eleAddchange_XP, "Add change info button");
				CM.enteringDataintoTextfiledByXpath(EL.eledoccahan_XP, changecontrolnumbar, "Change control number");
				CM.enteringDataintoTextfiledByXpath(EL.eleDescript_XP, changecontrolDescription,
						"Change control Description");
				CM.clickonElementbyXpath(EL.elechangefileadd_XP, "changefileadd");
				driver.findElement(By.xpath("//input[@type='file']"))
						.sendKeys("C:\\Users\\SSD\\Downloads\\sample2.pdf");
				Thread.sleep(500);
				CM.clickonElementbyXpath(EL.eleSaVe_XP, "Save");
				CM.clickonElementbyXpath(EL.eleSubmit_XP, "Submit");
				Thread.sleep(500);
			} else {
				System.out.println("without change control");
			}
		} catch (Exception e) {
			System.out.println("Change Control is not needed");
		}
		try {
			if (driver.findElement(By.xpath("//span[text()='Change Details']")).isDisplayed()) {
				driver.findElement(By.xpath("//input[@id='btnSubmitApprovalData']")).click();
				String Alert2 = driver.switchTo().alert().getText();
				System.out.println(Alert2);
				String selectprimary = "Please select Primary Document";
				if (Alert2.equals(selectprimary)) {
					driver.switchTo().alert().accept();
					CM.clickonElementbyXpath(EL.eleAdddprimary_XP, "(+) Symbal for Add primary document");
					CM.selectValueinDropdownByVisualtextbyXpath(EL.eleAddtype2_XP, Associateddoc1Type, "Addtype2");
					CM.enteringDataintoTextfiledByXpath(EL.eleTitle2_XP, Associateddoc1Title, "txtTitle_1");
					WebElement DOCNUM2 = driver.findElement(By.xpath("//input[@id='txtIsNumberingAutoOrManual_2']"));
					if (DOCNUM2.isEnabled()) {
						CM.enteringDataintoTextfiledByXpath(EL.elenumber2_XP, number2, "Number 2");
					} else {
						System.out.println("doc number disabled");
					}
					Thread.sleep(500);
					WebElement ORGID2 = driver.findElement(By.xpath("//input[@id='txtNumber_2']"));
					if (ORGID2.isEnabled()) {

						CM.enteringDataintoTextfiledByXpath(EL.eleorg2_XP, Org2, "ORG id 2");
						Thread.sleep(500);
					} else {
						System.out.println("doc number disabled");
					}
					Thread.sleep(500);
					CM.enteringDataintoTextfiledByXpath(EL.eleversion2_XP, vertion, "txtVersionNo_1");
					CM.selectValueinDropdownselectbyvalueXpath(EL.elelayout2_XP, "1", "Select docu Lyout");
					CM.enteringDataintoTextfiledByXpath(EL.eleDescrip2_XP, Description2, "Description");
					Thread.sleep(500);
					driver.findElement(By.xpath("//span[@id='File_2']")).click();
					Thread.sleep(500);
					driver.findElement(By.xpath("//input[@type='file']"))
							.sendKeys("C:\\Users\\SSD\\Downloads\\sample3.pdf");
					Thread.sleep(500);
					CM.clickonElementbyXpath(EL.eleSaVe_XP, "Save");
					WebElement Primary2 = driver.findElement(By.xpath("//input[@id='rbPrimary_2']"));
					Primary2.click();
					try {
						System.out.println("primary document" + Associateddoc1Type);
					} catch (Exception e1) {
						System.out.println("primary document not selected");
					}
					CM.clickonElementbyXpath(EL.eleSubmit_XP, "Submit");
				} else {
					System.out.println("this is primary document");
				}
			} else {
				CM.clickonElementbyXpath(EL.eleSubmit_XP, "Submit");
			}
		} catch (Exception e) {
			System.out.println("Primary Document already selected");
		}
		CM.selectValueinDropdownByVisualtextbyXpath(EL.eleNonsignatory1_XP, NonSignatory, "Non signatory Reviewer");
		CM.selectValueinDropdownByVisualtextbyXpath(EL.eleApproverUserId2_XP, Reviewer1, "Reviewer1");
		CM.selectValueinDropdownByVisualtextbyXpath(EL.eleApproverUserId3_XP, Reviewer2, "Reviewer2");
//		CM.selectValueinDropdownByVisualtextbyXpath(EL.eleApproverUserId4_XP, Reviewer3, "Reviewer3");
//		CM.selectValueinDropdownByVisualtextbyXpath(EL.eleApproverUserId5_XP, Approver1, "Approver1");
//		CM.selectValueinDropdownByVisualtextbyXpath(EL.eleApproverUserId6_XP, Approver2, "Approver2");
//		CM.selectValueinDropdownByVisualtextbyXpath(EL.eleApproverUserId7_XP, Approver3, "Approver3");
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
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
	}

	public void docinfo() throws InterruptedException {
		try {
			WebElement Displaynumber = driver.findElement(By.xpath("//a[text()='" + displayNumber + "']"));
			if (Displaynumber.isDisplayed()) {
				System.out.println("Displaynumber displayed");
				Displaynumber.click();
			} else {
				System.out.println("Displaynumber not displayed");
			}
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
		CM.CheckElementDisplayedbyXpath(EL.eleTitlenumber1_XP, "Doc info-Title & Number");
		CM.CheckElementDisplayedbyXpath(EL.eleDes1_XP, "Doc info-Description");
		CM.CheckElementDisplayedbyXpath(EL.eleLocadep1_XP, "Doc info-Loc, Dep");
		CM.CheckElementDisplayedbyXpath(EL.eleClassi1_XP, "Doc info-Classification");
		CM.CheckElementDisplayedbyXpath(EL.eleASso1_XP, "Doc info-Associations");
		CM.CheckElementDisplayedbyXpath(EL.eleSeett1_XP, "Doc info-Settings");
		CM.CheckElementDisplayedbyXpath(EL.eleFile1_XP, "Doc info-File");

		String Titlenmber1 = driver.findElement(By.xpath("//td[@id='tdPrimaryDocTitle']")).getText();
		System.out.println(Titlenmber1);
		if (Titlenmber1.equals(expectedTitlenuber)) {
			System.out.println("expected number title is correct");
		} else {
			System.out.println("expected number title incorrect");
		}
		String Description1 = driver.findElement(By.xpath("//td[@id='tdPrimaryDocDescription']")).getText();
		System.out.println(Description1);
		if (Description1.equals(Description)) {
			System.out.println("expected Description1 is correct");
		} else {
			System.out.println("expected Description1 incorrect");
		}
		String locationdepartment = driver.findElement(By.xpath("//td[@id='tdPrimaryDocLocationAndDepartment']"))
				.getText();
		System.out.println(locationdepartment);
		if (locationdepartment.equals(expectedlocationDepartment)) {
			System.out.println("expected location departmentn correct");
		} else {
			System.out.println("expected location department incorrect");
		}
		boolean category = driver
				.findElement(By.xpath("(//td[@id=\"tdPrimaryDocClassification\"]/table/tbody/tr/td/b)[1]"))
				.isDisplayed();
		if (category) {
			System.out.println("category");
		} else {
			System.out.println("category not displayed");
		}
		boolean subcategory = driver
				.findElement(By.xpath("(//td[@id=\"tdPrimaryDocClassification\"]/table/tbody/tr/td/b)[2]"))
				.isDisplayed();
		if (subcategory) {
			System.out.println("subcategory");
		} else {
			System.out.println("subcategory not displayed");
		}
		boolean Types = driver
				.findElement(By.xpath("(//td[@id=\"tdPrimaryDocClassification\"]/table/tbody/tr/td/b)[3]"))
				.isDisplayed();
		if (Types) {
			System.out.println("Types");
		} else {
			System.out.println("Types not displayed");
		}

		WebElement categoryname = driver.findElement(By.xpath("//td[text()='" + Category + "']"));
		if (categoryname.isDisplayed()) {
			System.out.println("category name displayed");
		} else {
			System.out.println("category name not displayed");
		}
		WebElement subcategoryname = driver.findElement(By.xpath("//td[text()='" + Subcategory + "']"));
		if (subcategoryname.isDisplayed()) {
			System.out.println("subcategory name displayed");
		} else {
			System.out.println("subcategory name not displayed");
		}
		WebElement typE = driver.findElement(By.xpath("//td[text()='" + Type + "']"));
		if (typE.isDisplayed()) {
			System.out.println("Type name displayed");
		} else {
			System.out.println("Type name not displayed");
		}

		WebElement product = driver.findElement(By.xpath("//td[text()='P']"));
		WebElement Material = driver.findElement(By.xpath("//td[text()='M']"));
		WebElement user = driver.findElement(By.xpath("//td[text()='U']"));
		WebElement Asset = driver.findElement(By.xpath("//td[text()='A']"));

		if (product.isDisplayed()) {
			System.out.println("product displayed");
		} else {
			System.out.println("product not displayed");
		}
		if (Material.isDisplayed()) {
			System.out.println("Material displayed");
		} else {
			System.out.println("Material not displayed");
		}
		if (user.isDisplayed()) {
			System.out.println("user displayed");
		} else {
			System.out.println("user not displayed");
		}
		if (Asset.isDisplayed()) {
			System.out.println("user name displayed");
		} else {
			System.out.println("user name not displayed");
		}

		WebElement productname = driver.findElement(By.xpath("//td[text()='" + productS + "']"));
		if (productname.isDisplayed()) {
			System.out.println("product name displayed");
		} else {
			System.out.println("product name not displayed");
		}
//WebElement Materialname =driver.findElement(By.xpath("//td[text()='"+MateriaL+"']"));
//if(Materialname.isDisplayed()) {
//	System.out.println("Material name displayed");
//}else {
//	System.out.println("Material name not displayed");
//	
//}
		WebElement User = driver.findElement(By.xpath("//td[text()='" + useR + "']"));
		if (User.isDisplayed()) {
			System.out.println("USER name displayed");
		} else {
			System.out.println("USER name not displayed");

		}
		WebElement Assets = driver.findElement(By.xpath("//td[text()='" + asset + "']"));
		if (Assets.isDisplayed()) {
			System.out.println("Assets name displayed");
		} else {
			System.out.println("Assets name not displayed");

		}
//settings
		String setting = driver.findElement(By.xpath("//td[@id='tdLayout']")).getText();
		System.out.println(setting);
		if (setting.equals(Settingpresys)) {
			System.out.println("setting is equals");
		} else {
			System.out.println("settings not equal");
		}
		String parentwindow = driver.getWindowHandle();
		System.out.println(parentwindow);
		driver.findElement(By.xpath("(//img[@title='View Document'])[1]")).click();
		String Childwindow = driver.getWindowHandle();
		System.out.println(Childwindow);
		Thread.sleep(10000);
		driver.switchTo().window(parentwindow);
//associated		
		WebElement Associated = driver.findElement(By.xpath("//h1[text()='Associated Documents']"));
		if (Associated.isDisplayed()) {
			System.out.println("Associated Documents header is displayed");
		} else {
			System.out.println("Associated Documents header is not displayed");
		}
		WebElement Assotitle = driver.findElement(By.xpath(
				"//table[@id='jsonTblAssDocs']//th[@class='t-header wid15pc'][normalize-space()='Title & Number']"));
		if (Assotitle.isDisplayed()) {
			System.out.println("ASSOCIATED DOCUMENTS Title & Number header is displayed");
		} else {
			System.out.println("ASSOCIATED DOCUMENTS Title & Number header is not displayed ");
		}

		WebElement AssoDescrip = driver.findElement(By.xpath(
				"//table[@id='jsonTblAssDocs']//th[@class='t-header wid20pc'][normalize-space()='Description']"));
		if (AssoDescrip.isDisplayed()) {
			System.out.println("ASSOCIATED DOCUMENTS description header is displayed");
		} else {
			System.out.println("ASSOCIATED DOCUMENTS description header is not displayed ");
		}

		WebElement AssoLocDoc = driver.findElement(
				By.xpath("//table[@id='jsonTblAssDocs']//th[@class='t-header wid15pc'][normalize-space()='Loc, Dep']"));
		if (AssoLocDoc.isDisplayed()) {
			System.out.println("ASSOCIATED DOCUMENTS location & department header is displayed");
		} else {
			System.out.println("ASSOCIATED DOCUMENTS location & department header is not displayed ");
		}

		WebElement Assoclassi = driver.findElement(By.xpath(
				"//table[@id='jsonTblAssDocs']//th[@class='t-header wid20pc'][normalize-space()='Classification']"));
		if (Assoclassi.isDisplayed()) {
			System.out.println("ASSOCIATED DOCUMENTS Classification header is displayed");
		} else {
			System.out.println("ASSOCIATED DOCUMENTS Classification header is not displayed ");
		}
		WebElement AssoASSOCIATION = driver.findElement(By.xpath(
				"//table[@id='jsonTblAssDocs']//th[@class='t-header wid20pc'][normalize-space()='Associations']"));
		if (AssoASSOCIATION.isDisplayed()) {
			System.out.println("ASSOCIATED DOCUMENTS Associations header is displayed");
		} else {
			System.out.println("ASSOCIATED DOCUMENTS Associations header is not displayed ");
		}

		WebElement AssoSETTING = driver.findElement(By.xpath(
				"//table[@id='jsonTblAssDocs']//th[@class='t-header wid20pc'][normalize-space()='Associations']"));
		if (AssoSETTING.isDisplayed()) {
			System.out.println("ASSOCIATED DOCUMENTS Settings header is displayed");
		} else {
			System.out.println("ASSOCIATED DOCUMENTS Settings header is not displayed ");
		}
		WebElement AssoFile = driver.findElement(
				By.xpath("//table[@id='jsonTblAssDocs']//th[@class='t-header wid5pc'][normalize-space()='File']"));
		if (AssoSETTING.isDisplayed()) {
			System.out.println("ASSOCIATED DOCUMENTS file header is displayed");
		} else {
			System.out.println("ASSOCIATED DOCUMENTS file header is not displayed ");
		}
//change details
		WebElement changedetails = driver.findElement(By.xpath("//h1[text()='Change Controls']"));
		if (changedetails.isDisplayed()) {
			System.out.println("Change detail header is displayed");
		} else {
			System.out.println("ckhange detail header is not displayed");
		}

		WebElement ID = driver.findElement(By.xpath("//span[text()='Id']"));
		if (ID.isDisplayed()) {
			System.out.println("ID header is displayed");
		} else {
			System.out.println("id header is not displayed");
		}
		WebElement changedis = driver.findElement(By.xpath("//span[text()='Description']"));
		if (changedis.isDisplayed()) {
			System.out.println("change control discription header is displayed");
		} else {
			System.out.println("change control discription  header not displayed");
		}
		WebElement filechangecontrol = driver.findElement(By.xpath("(//span[text()='File'])[1]"));
		if (filechangecontrol.isDisplayed()) {
			System.out.println("filechangecontrol header is displayed");
		} else {
			System.out.println("filechangecontrol header is not displayed");
		}
		WebElement chngecontrolID = driver.findElement(By.xpath("//td[text()='" + changecontrolnumbar + "']"));
		if (chngecontrolID.isDisplayed()) {
			System.out.println("Change control ID is displayed");
		} else {
			System.out.println("Change control ID is not displayed");
		}
		WebElement changecontroldiscription = driver
				.findElement(By.xpath("//td[text()='" + changecontrolDescription + "']"));
		if (changecontroldiscription.isDisplayed()) {
			System.out.println("change control discription is displayed");
		} else {
			System.out.println("change control discription displayed");
		}

		Thread.sleep(5000);
		String Changeparentwindow = driver.getWindowHandle();
		System.out.println(parentwindow);
		driver.findElement(By.xpath("(//img[@title='View Document'])[2]")).click();
		String ChangeChildwindow = driver.getWindowHandle();
		System.out.println(Childwindow);
		Thread.sleep(5000);
		driver.switchTo().window(Changeparentwindow);
//Approval history
		WebElement approvalhistory = driver.findElement(By.xpath("//h1[text()='Approval History']"));
		if (approvalhistory.isDisplayed()) {
			System.out.println("approvalhistory is displayed");
		} else {
			System.out.println("approvalhistory not dispalyed");
		}
		CM.CheckElementDisplayedbyXpath(EL.eleTypname_XP, "Type Name");
		CM.CheckElementDisplayedbyXpath(EL.eleinitiaon_XP, "Initiated On");
		CM.CheckElementDisplayedbyXpath(EL.eleinitiaby_XP, "Initiated By");
		CM.CheckElementDisplayedbyXpath(EL.elestatuS_XP, "Status");
		CM.CheckElementDisplayedbyXpath(EL.elecollpall_XP, "Collapse All");
		CM.CheckElementDisplayedbyXpath(EL.eleHidedetail_XP, "Hide details");
		CM.clickonElementbyXpath(EL.elecollpall_XP, "Collapse All");
		CM.clickonElementbyXpath(EL.eleshowdetails_XP, "Show details");
		WebElement submission = driver.findElement(By.xpath("//td[text()='Submission']"));
		if (submission.isDisplayed()) {
			System.out.println("submission is displayed");
		} else {
			System.out.println("submission not displayed");
		}
		WebElement initiatedby = driver.findElement(By.xpath("//td[text()='" + initiatedBy + "']"));
		if (initiatedby.isDisplayed()) {
			System.out.println("initiatedby" + initiatedBy);
		} else {
			System.out.println("initiatedby not displayed");
		}
		WebElement statuss = driver.findElement(By.xpath("//td[text()='In Progress']"));
		if (statuss.isDisplayed()) {
			System.out.println("status In Progress is displayed");
		} else {
			System.out.println("status In Progress is not displayed");
		}
		try {
			WebElement Dates = driver.findElement(By.xpath("(//td[@class='CLH'])[1]"));
			Thread.sleep(5000);
			Date = Dates.getText();
			System.out.println(Date);
		} catch (Exception e) {
			System.out.println("Exeption e");
		}
		CM.CheckElementDisplayedbyXpath(EL.elestepname_XP, "Step Name");
		CM.CheckElementDisplayedbyXpath(EL.eleActions_XP, "Action");
		CM.CheckElementDisplayedbyXpath(EL.eleactedby_XP, "Acted By");
		CM.CheckElementDisplayedbyXpath(EL.eleacceptedon_XP, "Accepted On");
		CM.CheckElementDisplayedbyXpath(EL.eleremarks_XP, "Remarks");
		CM.CheckElementDisplayedbyXpath(EL.eleattachedfile_XP, "File");
//nonsignatory
		String StringExpectstep1 = "Task for Non-Signatory Reviewers";
		WebElement Nonsignata = driver.findElement(By.xpath(
				"(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[1]/td[text()='Task for Non-Signatory Reviewers']"));

		if (Nonsignata.isDisplayed()) {
			System.out.println("Task for Non-Signatory Reviewers dispalyed");
		} else {
			System.out.println("Task for Non-Signatory Reviewers not dispalyed");
		}

		WebElement NonsignatoryAction = driver.findElement(
				By.xpath("(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[1]/td[text()='Approved']"));
		if (NonsignatoryAction.isDisplayed()) {
			System.out.println("Nonsignatory reviewer action Approve ");
		} else {
			System.out.println("Nonsignatory reviewer action not showing ");
		}
//		WebElement actedBYNONSIGNATORY = driver
//				.findElement(By.xpath("(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[1]/td[text()='"+NonSignatoryNAME+"']"));
//		
//		if (actedBYNONSIGNATORY.isDisplayed()) {
//			System.out.println("NonSignatoryNAME is dispalyed");
//		} else {
//			System.out.println("NonSignatoryNAME is not dispalyed");
//		}
//Reviewer
		String StringExpectstep2 = "Default Tasks for Reviewers";
		WebElement TaskReviewer = driver.findElement(By.xpath(
				"(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[2]/td[text()='Default Tasks for Reviewers']"));

		if (TaskReviewer.isDisplayed()) {
			System.out.println("Default Tasks for Reviewers dispalyed");
		} else {
			System.out.println("Default Tasks for Reviewers not dispalyed");
		}

		WebElement ReviewerAction = driver.findElement(
				By.xpath("(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[2]/td[text()='Pending']"));

		if (ReviewerAction.isDisplayed()) {
			System.out.println(" reviewer action Approve ");
		} else {
			System.out.println(" reviewer action not showing ");
		}
		WebElement actedBYReviewer = driver
				.findElement(By.xpath("(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[2]/td[text()='"
						+ Reviewer1username + "']"));

		if (actedBYReviewer.isDisplayed()) {
			System.out.println("Reviewer name is dispalyed");
		} else {
			System.out.println("Reviewer name  is not dispalyed");
		}
//Approver

		String StringExpectstep3 = "Approval 1";
		WebElement TaskApprover = driver.findElement(By
				.xpath("(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[3]/td[text()='Approval 1']"));

		if (TaskApprover.isDisplayed()) {
			System.out.println("Default Tasks for Reviewers dispalyed");
		} else {
			System.out.println("Default Tasks for Reviewers not dispalyed");
		}

		WebElement ApproverAction = driver.findElement(
				By.xpath("(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[3]/td[text()='Pending']"));

		if (ApproverAction.isDisplayed()) {
			System.out.println(" reviewer action Pending ");
		} else {
			System.out.println(" reviewer action not showing ");
		}
		WebElement actedBYApprover = driver
				.findElement(By.xpath("(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[3]/td[text()='"
						+ Reviewer2username + "']"));
		if (actedBYApprover.isDisplayed()) {
			System.out.println("Reviewer name is dispalyed");
		} else {
			System.out.println("Reviewer name  is not dispalyed");
		}
		WebElement Analyti = driver.findElement(By.xpath("//div[text()='An']"));
		AS.doubleClick(Analyti).perform();
		Thread.sleep(3000);
	}

//status
	public void status() throws InterruptedException {

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
		// title name
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
					+ "']/parent::td /following-sibling::td[2]/ul/li[text()='" + Typenames + "']"));
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
		// Threedot inside typename
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

		// type value
		try {
			WebElement typevalue = driver.findElement(By.xpath("//a[text()='" + displayNumber
					+ "']/parent::td/following-sibling::td[2]//ul[@class='first_assoc_block']/li[1]/p[text()='" + Type
					+ "']"));
			if (typevalue.isDisplayed()) {
				System.out.println("type value displayed");
			} else {
				System.out.println("type value not displayed");
			}

		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
		// Category
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
		// categoryvalue
		try {
			WebElement categoryvalue = driver.findElement(By.xpath("//a[text()='" + displayNumber
					+ "']/parent::td/following-sibling::td[2]//ul[@class='first_assoc_block']/li[2]/p[text()='"
					+ Category + "']"));
			if (categoryvalue.isDisplayed()) {
				System.out.println("categoryvalue displayed");
			} else {
				System.out.println("categoryvalue not displayed");
			}

		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
		// sub category name

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
		// sub category name value
		try {
			WebElement Subcategorynamevalue = driver.findElement(By.xpath("//a[text()='" + displayNumber
					+ "']/parent::td/following-sibling::td[2]//ul[@class='first_assoc_block']/li[3]/p[text()='"
					+ Subcategory + "']"));
			if (Subcategorynamevalue.isDisplayed()) {
				System.out.println("Subcategorynamevalue displayed");
			} else {
				System.out.println("Subcategorynamevalue not displayed");
			}

		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
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
		// view document
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
//		// Past Versions
//		try {
//			WebElement pastversions = driver.findElement(By.xpath("//a[text()='" + displayNumber
//					+ "']/parent::td/following-sibling::td/div[2]//a[text()='Past Versions']"));
//			if (pastversions.isDisplayed()) {
//				System.out.println("pastversions displayed");
//			} else {
//				System.out.println("pastversions not displayed");
//			}
//
//		} catch (Exception e) {
//			System.out.println("not able to validate");
//			System.out.println("Exception : " + e);
//		}
		try {
			WebElement Status = driver.findElement(By.xpath("//a[text()='" + displayNumber
					+ "']/parent::td/following-sibling::td[text()='Creation']/sup[text()='*']"));
			if (Status.isDisplayed()) {
				System.out.println("sended the file for Reviewer");
				Thread.sleep(500);
			} else {
				System.out.println("still file not send to reviewer and approval");
				Thread.sleep(500);
			}
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}

		CM.clickonElementbyXpath(EL.eleUsersetting_XP, "USER SETTINGS");
		CM.clickonElementbyXpath(EL.eleLogout_XP, "Log out");
		Thread.sleep(300);
	}

	public void NonSigntoryLogin() throws InterruptedException {

		CM.enteringDataintoTextfiledByXpath(EL.eleUserName_XP, NonSignatoryNAME, " Non signatory user");
		CM.enteringDataintoTextfiledByXpath(EL.elePassword_XP, Password, "Password");
		CM.clickonElementbyXpath(EL.eleLogin_XP, "LOGIN");
		Thread.sleep(5000);
	}

	public void NonsignatoryApprove() throws InterruptedException {
		Thread.sleep(5000);
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
			WebElement SmbmissonORIssue = driver.findElement(
					By.xpath("//span[text()='" + displayNumber + "']/parent::td/parent::tr/td[text()='Submission']"));
			if (SmbmissonORIssue.isDisplayed()) {
				System.out.println("document submission is displayed");
			} else {
				System.out.println("Document submission is not displayed");
			}
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);

		}
		try {
			WebElement initiatedby = driver.findElement(By.xpath("//span[text()='" + displayNumber
					+ "']/parent::td/following-sibling::td[text()='" + InitiatedBy + "']"));
			if (initiatedby.isDisplayed()) {
				System.out.println("initiatedby " + InitiatedBy);
			} else {
				System.out.println("initiatedby is not displayed");
			}
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}

		try {
			WebElement initiatedby = driver.findElement(By.xpath(
					"//span[text()='" + displayNumber + "']/parent::td/following-sibling::td[text()='" + Date + "']"));
			if (initiatedby.isDisplayed()) {
				System.out.println("initiatedby " + Date);
			} else {
				System.out.println("initiatedby date is not displayed");
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
		CM.CheckElementDisplayedbyXpath(EL.eledocinfo_XP, "Document Info");
		CM.CheckElementDisplayedbyXpath(EL.eledocinfoheader_XP, "Document Info Header");
		String Documentinfoheader = driver.findElement(By.xpath("(//thead[@class='t-grid-header'])[1]/tr")).getText();
		System.out.println(Documentinfoheader);

		// Title&Number
		try {
			WebElement TitleNumber = driver.findElement(By.xpath("//td[@id='tdPrimaryDocTitle']"));
			String actual = TitleNumber.getText();
			System.out.println(actual);

			if (actual.equals(expectedTitlenuber)) {
				System.out.println("Pass");
			} else {
				System.out.println("Fail");
			}
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
		// location &Department
		try {
			String locationdepartment = driver.findElement(By.xpath("//td[@id='tdPrimaryDocLocationAndDepartment']"))
					.getText();
			System.out.println(locationdepartment);
			if (locationdepartment.equals(expectedlocationDepartment)) {
				System.out.println("expected location departmentn correct");
			} else {
				System.out.println("expected location department incorrect");
			}
		} catch (Exception e) {
			System.out.println("not able  to validate expected location department element");
			System.out.println("Exception : " + e);
		}
		// classifications
		try {
			boolean category = driver
					.findElement(By.xpath("(//td[@id=\"tdPrimaryDocClassification\"]/table/tbody/tr/td/b)[1]"))
					.isDisplayed();
			if (category) {
				System.out.println("category");
			} else {
				System.out.println("category not displayed");
			}
		} catch (Exception e) {
			System.out.println("not able  to validate expected lcategory  displayed element");
			System.out.println("Exception : " + e);
		}
		try {
			boolean subcategory = driver
					.findElement(By.xpath("(//td[@id=\"tdPrimaryDocClassification\"]/table/tbody/tr/td/b)[2]"))
					.isDisplayed();
			if (subcategory) {
				System.out.println("subcategory");
			} else {
				System.out.println("subcategory not displayed");
			}
		} catch (Exception e) {
			System.out.println("not able  to validate expected subcategory  displayed element");
			System.out.println("Exception : " + e);
		}
		try {
			boolean Types = driver
					.findElement(By.xpath("(//td[@id=\"tdPrimaryDocClassification\"]/table/tbody/tr/td/b)[3]"))
					.isDisplayed();
			if (Types) {
				System.out.println("Types");
			} else {
				System.out.println("Types not displayed");
			}
		} catch (Exception e) {
			System.out.println("not able  to validate expected Types  displayed element");
			System.out.println("Exception : " + e);
		}
		try {
			WebElement categoryname = driver.findElement(By.xpath("//td[text()='" + Category + "']"));
			if (categoryname.isDisplayed()) {
				System.out.println("category name displayed");
			} else {
				System.out.println("category name not displayed");
			}
		} catch (Exception e) {
			System.out.println("not able  to validate expected category name   displayed element");
			System.out.println("Exception : " + e);
		}
		try {
			WebElement subcategoryname = driver.findElement(By.xpath("//td[text()='" + Subcategory + "']"));
			if (subcategoryname.isDisplayed()) {
				System.out.println("subcategory name displayed");
			} else {
				System.out.println("subcategory name not displayed");
			}
		} catch (Exception e) {
			System.out.println("not able  to validate expected subcategory name   displayed element");
			System.out.println("Exception : " + e);
		}
		try {
			WebElement typE = driver.findElement(By.xpath("//td[text()='" + Type + "']"));
			if (typE.isDisplayed()) {
				System.out.println("Type name displayed");
			} else {
				System.out.println("Type name not displayed");
			}
		} catch (Exception e) {
			System.out.println("not able  to validate expected Type name   displayed element");
			System.out.println("Exception : " + e);
		}

		WebElement user = driver.findElement(By.xpath("//td[text()='U']"));
		WebElement Asset = driver.findElement(By.xpath("//td[text()='A']"));
		try {
			WebElement product = driver.findElement(By.xpath("//td[text()='P']"));
			if (product.isDisplayed()) {
				System.out.println("product displayed");
			} else {
				System.out.println("product not displayed");
			}
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
		try {
			WebElement Material = driver.findElement(By.xpath("//td[text()='M']"));
			if (Material.isDisplayed()) {
				System.out.println("Material displayed");
			} else {
				System.out.println("Material not displayed");
			}
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
		try {
			if (user.isDisplayed()) {
				System.out.println("user displayed");
			} else {
				System.out.println("user not displayed");
			}
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
		try {
			if (Asset.isDisplayed()) {
				System.out.println("user name displayed");
			} else {
				System.out.println("user name not displayed");
			}
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
		try {
			WebElement productname = driver.findElement(By.xpath("//td[text()='" + productS + "']"));
			if (productname.isDisplayed()) {
				System.out.println("product name displayed");
			} else {
				System.out.println("product name not displayed");
			}
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
		// WebElement Materialname
		// =driver.findElement(By.xpath("//td[text()='"+MateriaL+"']"));
		// if(Materialname.isDisplayed()) {
//		System.out.println("Material name displayed");
		// }else {
//		System.out.println("Material name not displayed");
		//
		// }
		try {
			WebElement User = driver.findElement(By.xpath("//td[text()='" + useR + "']"));
			if (User.isDisplayed()) {
				System.out.println("USER name displayed");
			} else {
				System.out.println("USER name not displayed");
			}
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
		try {
			WebElement Assets = driver.findElement(By.xpath("//td[text()='" + asset + "']"));
			if (Assets.isDisplayed()) {
				System.out.println("Assets name displayed");
			} else {
				System.out.println("Assets name not displayed");
			}
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
		// settings
		try {
			String setting = driver.findElement(By.xpath("//td[@id='tdLayout']")).getText();
			System.out.println(setting);
			if (setting.equals(Settingpresys)) {
				System.out.println("setting is equals");
			} else {
				System.out.println("settings not equal");
			}
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
		try {
			WebElement uncontrolprint = driver
					.findElement(By.xpath("(//th[contains(text(),'Uncontrolled Print')])[1]"));
			if (uncontrolprint.isDisplayed()) {
				System.out.println("uncontrolprintchange is displayed");
			} else {
				System.out.println("uncontrolprintchange is not displayed");
			}
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
		String parentwindow = driver.getWindowHandle();
		driver.findElement(By.xpath("(//img[@title='View Document'])[1]")).click();
		String Childwindow = driver.getWindowHandle();
		Thread.sleep(3000);
		driver.switchTo().window(parentwindow);
		try {
			WebElement printimg = driver.findElement(By.xpath("//img[@id='btnUncontrolledPrint']"));
			if (printimg.isDisplayed()) {
				System.out.println("print img is displayed");
			} else {
				System.out.println("print img not displayed");
			}
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
		String parentwindow1 = driver.getWindowHandle();
		
		driver.findElement(By.xpath("//img[@id='btnUncontrolledPrint']")).click();
		String Childwindow1 = driver.getWindowHandle();
		Thread.sleep(3000);
		driver.switchTo().window(parentwindow1);
		try {
			driver.findElement(By.xpath("//input[@value='Change History']")).isDisplayed();
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
		// associated doc
		try {
			WebElement Associated = driver.findElement(By.xpath("//h1[text()='Associated Documents']"));
			if (Associated.isDisplayed()) {
				System.out.println("Associated Documents header is displayed");
			} else {
				System.out.println("Associated Documents header is not displayed");
			}
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
		try {
			WebElement Assotitle = driver.findElement(By.xpath(
					"//table[@id='jsonTblAssDocs']//th[@class='t-header wid15pc'][normalize-space()='Title & Number']"));
			if (Assotitle.isDisplayed()) {
				System.out.println("ASSOCIATED DOCUMENTS Title & Number header is displayed");
			} else {
				System.out.println("ASSOCIATED DOCUMENTS Title & Number header is not displayed ");
			}
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
		try {
			WebElement AssoDescrip = driver.findElement(By.xpath(
					"//table[@id='jsonTblAssDocs']//th[@class='t-header wid20pc'][normalize-space()='Description']"));
			if (AssoDescrip.isDisplayed()) {
				System.out.println("ASSOCIATED DOCUMENTS description header is displayed");
			} else {
				System.out.println("ASSOCIATED DOCUMENTS description header is not displayed ");
			}
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
		try {
			WebElement AssoLocDoc = driver.findElement(By.xpath(
					"//table[@id='jsonTblAssDocs']//th[@class='t-header wid15pc'][normalize-space()='Loc, Dep']"));
			if (AssoLocDoc.isDisplayed()) {
				System.out.println("ASSOCIATED DOCUMENTS location & department header is displayed");
			} else {
				System.out.println("ASSOCIATED DOCUMENTS location & department header is not displayed ");
			}
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
		try {
			WebElement Assoclassi = driver.findElement(By.xpath(
					"//table[@id='jsonTblAssDocs']//th[@class='t-header wid20pc'][normalize-space()='Classification']"));
			if (Assoclassi.isDisplayed()) {
				System.out.println("ASSOCIATED DOCUMENTS Classification header is displayed");
			} else {
				System.out.println("ASSOCIATED DOCUMENTS Classification header is not displayed ");
			}
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
		try {
			WebElement AssoASSOCIATION = driver.findElement(By.xpath(
					"//table[@id='jsonTblAssDocs']//th[@class='t-header wid20pc'][normalize-space()='Associations']"));
			if (AssoASSOCIATION.isDisplayed()) {
				System.out.println("ASSOCIATED DOCUMENTS Associations header is displayed");
			} else {
				System.out.println("ASSOCIATED DOCUMENTS Associations header is not displayed ");
			}
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
		try {
			WebElement AssoSETTING = driver.findElement(By.xpath(
					"//table[@id='jsonTblAssDocs']//th[@class='t-header wid20pc'][normalize-space()='Associations']"));
			if (AssoSETTING.isDisplayed()) {
				System.out.println("ASSOCIATED DOCUMENTS Settings header is displayed");
			} else {
				System.out.println("ASSOCIATED DOCUMENTS Settings header is not displayed ");
			}
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
		try {
			WebElement AssoFile = driver.findElement(
					By.xpath("//table[@id='jsonTblAssDocs']//th[@class='t-header wid5pc'][normalize-space()='File']"));
			if (AssoFile.isDisplayed()) {
				System.out.println("ASSOCIATED DOCUMENTS file header is displayed");
			} else {
				System.out.println("ASSOCIATED DOCUMENTS file header is not displayed ");
			}
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
		try {
			WebElement AssociatedUnControlprintheader = driver.findElement(By.xpath(
					"//table[@id='jsonTblAssDocs']//th[@class='t-header wid5pc'][normalize-space()='Uncontrolled Print']"));
			if (AssociatedUnControlprintheader.isDisplayed()) {
				System.out.println("Associated UnControl prin theader is displayed");
			} else {
				System.out.println("AssociatedUnControlprintheader not displayed");
			}
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
		// change details
		try {
			WebElement changedetails = driver.findElement(By.xpath("//span[text()='Change Control Number']"));
			if (changedetails.isDisplayed()) {
				System.out.println("Change detail header is displayed");
			} else {
				System.out.println("ckhange detail header is not displayed");
			}
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
		try {
			WebElement changedis = driver.findElement(By.xpath("(//span[text()='Description'])[2]"));
			if (changedis.isDisplayed()) {
				System.out.println("change control discription header is displayed");
			} else {
				System.out.println("change control discription  header not displayed");
			}
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
		try {
			WebElement statuscahnge = driver.findElement(By.xpath("(//span[text()='Status'])[1]"));
			if (statuscahnge.isDisplayed()) {
				System.out.println("status is displayed");
			} else {
				System.out.println("status not displayed");
			}
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
		try {
			WebElement filechangecontrol = driver.findElement(By.xpath("(//span[text()='File'])[1]"));
			if (filechangecontrol.isDisplayed()) {
				System.out.println("filechangecontrol header is displayed");
			} else {
				System.out.println("filechangecontrol header is not displayed");
			}
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
		try {
			WebElement chngecontrolID = driver.findElement(By.xpath("(//td[text()='" + changecontrolnumbar + "'])[2]"));
			if (chngecontrolID.isDisplayed()) {
				System.out.println("Change control ID is displayed");
			} else {
				System.out.println("Change control ID is not displayed");
			}
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
		try {
			WebElement changecontroldiscription = driver
					.findElement(By.xpath("//td[text()='" + changecontrolDescription + "']"));
			if (changecontroldiscription.isDisplayed()) {
				System.out.println("change control discription is displayed");
			} else {
				System.out.println("change control discription displayed");
			}
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
		Thread.sleep(500);
		String Changeparentwindow = driver.getWindowHandle();
		System.out.println(parentwindow);
		driver.findElement(By.xpath("(//img[@title='View Document'])[2]")).click();
		String ChangeChildwindow = driver.getWindowHandle();
		System.out.println(Childwindow);
		Thread.sleep(5000);
		driver.switchTo().window(Changeparentwindow);
		// Approval history
		try {
			WebElement approvalhistory = driver.findElement(By.xpath("//h1[text()='Approval History']"));
			if (approvalhistory.isDisplayed()) {
				System.out.println("approvalhistory is displayed");
			} else {
				System.out.println("approvalhistory not dispalyed");
			}
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}

		CM.CheckElementDisplayedbyXpath(EL.eleTypname_XP, "Type Name");
		CM.CheckElementDisplayedbyXpath(EL.eleinitiaon_XP, "Initiated On");
		CM.CheckElementDisplayedbyXpath(EL.eleinitiaby_XP, "Initiated By");
		CM.CheckElementDisplayedbyXpath(EL.elestatuS_XP, "Status");
		CM.CheckElementDisplayedbyXpath(EL.elecollpall_XP, "Collapse All");
		CM.CheckElementDisplayedbyXpath(EL.eleHidedetail_XP, "Hide details");
		CM.clickonElementbyXpath(EL.elecollpall_XP, "Collapse All");
		CM.clickonElementbyXpath(EL.eleshowdetails_XP, "Show details");
		try {
			WebElement submission = driver.findElement(By.xpath("//td[text()='Submission']"));
			if (submission.isDisplayed()) {
				System.out.println("submission is displayed");
			} else {
				System.out.println("submission not displayed");
			}
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
		try {
			WebElement initiatedby = driver.findElement(By.xpath("//td[text()='" + initiatedBy + "']"));
			if (initiatedby.isDisplayed()) {
				System.out.println("initiatedby " + initiatedBy);
			} else {
				System.out.println("initiatedby not displayed");
			}
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
		try {
			WebElement statuss = driver.findElement(By.xpath("//td[text()='In Progress']"));
			if (statuss.isDisplayed()) {
				System.out.println("status In Progress is displayed");
			} else {
				System.out.println("status In Progress is not displayed");
			}
		} catch (Exception e) {
			System.out.println("status In Progress is not displayed");
			System.out.println("Exception : " + e);
		}
		try {
			WebElement Dates = driver.findElement(By.xpath("(//td[text()='" + Date + "'])[2]"));

			if (Dates.isDisplayed()) {
				System.out.println("equal");

			} else {
				System.out.println("! equal");
			}
		} catch (Exception e) {
			System.out.println("date is not displayed");
			System.out.println("Exception : " + e);
		}
		CM.CheckElementDisplayedbyXpath(EL.elestepname_XP, "Step Name");
		CM.CheckElementDisplayedbyXpath(EL.eleActions_XP, "Action");
		CM.CheckElementDisplayedbyXpath(EL.eleactedby_XP, "Acted By");
		CM.CheckElementDisplayedbyXpath(EL.eleacceptedon_XP, "Accepted On");
		CM.CheckElementDisplayedbyXpath(EL.eleremarks_XP, "Remarks");
		CM.CheckElementDisplayedbyXpath(EL.eleattachedfile_XP, "File");
		// nonsignatory
		try {
			String StringExpectstep1 = "Task for Non-Signatory Reviewers";
			WebElement Nonsignata = driver.findElement(By.xpath(
					"(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[1]/td[text()='Task for Non-Signatory Reviewers']"));

			if (Nonsignata.isDisplayed()) {
				System.out.println("Task for Non-Signatory Reviewers dispalyed");
			} else {
				System.out.println("Task for Non-Signatory Reviewers not dispalyed");
			}
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
		try {
			WebElement NonsignatoryAction = driver.findElement(By.xpath(
					"(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[1]/td[text()='Approved']"));
			if (NonsignatoryAction.isDisplayed()) {
				System.out.println("Nonsignatory reviewer action Approve ");
			} else {
				System.out.println("Nonsignatory reviewer action not showing ");
			}
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
		try {
			WebElement actedBYNONSIGNATORY = driver.findElement(
					By.xpath("(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[1]/td[text()='"
							+ NonSignatoryNAME + "']"));

			if (actedBYNONSIGNATORY.isDisplayed()) {
				System.out.println("NonSignatoryNAME is dispalyed");
			} else {
				System.out.println("NonSignatoryNAME is not dispalyed");
			}
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
		// Reviewer
		try {
			String StringExpectstep2 = "Default Tasks for Reviewers";
			WebElement TaskReviewer = driver.findElement(By.xpath(
					"(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[2]/td[text()='Default Tasks for Reviewers']"));

			if (TaskReviewer.isDisplayed()) {
				System.out.println("Default Tasks for Reviewers dispalyed");
			} else {
				System.out.println("Default Tasks for Reviewers not dispalyed");
			}
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
		try {
			WebElement ReviewerAction = driver.findElement(By
					.xpath("(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[2]/td[text()='Pending']"));

			if (ReviewerAction.isDisplayed()) {
				System.out.println(" reviewer action Approve ");
			} else {
				System.out.println(" reviewer action not showing ");
			}
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
		try {
			WebElement actedBYReviewer = driver.findElement(
					By.xpath("(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[2]/td[text()='"
							+ Reviewer1username + "']"));

			if (actedBYReviewer.isDisplayed()) {
				System.out.println("Reviewer name is dispalyed");
			} else {
				System.out.println("Reviewer name  is not dispalyed");
			}
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
		// Approver
		try {
			String StringExpectstep3 = "Approval 1";
			WebElement TaskApprover = driver.findElement(By.xpath(
					"(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[3]/td[text()='Approval 1']"));

			if (TaskApprover.isDisplayed()) {
				System.out.println("Default Tasks for Reviewers dispalyed");
			} else {
				System.out.println("Default Tasks for Reviewers not dispalyed");
			}
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
		try {
			WebElement ApproverAction = driver.findElement(By
					.xpath("(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[3]/td[text()='Pending']"));

			if (ApproverAction.isDisplayed()) {
				System.out.println(" reviewer action Pending ");
			} else {
				System.out.println(" reviewer action not showing ");
			}
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
		try {
			WebElement actedBYApprover = driver.findElement(
					By.xpath("(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[3]/td[text()='"
							+ Reviewer2username + "']"));
			if (actedBYApprover.isDisplayed()) {
				System.out.println("Reviewer name is dispalyed");
			} else {
				System.out.println("Reviewer name  is not dispalyed");
			}
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
		CM.enteringDataintoTextfiledByXpath(EL.eleRemarksinput_XP, nonsignatoryremarks, " Reviewer1remarks");
		try {
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//select[@id='Decision']")));
			Select select = new Select(driver.findElement(By.xpath("//select[@id='Decision']")));
			select.selectByVisibleText(Approve);

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

	public void Reviewer1Login() throws InterruptedException {

		CM.enteringDataintoTextfiledByXpath(EL.eleUserName_XP, Reviewer1username, " Non signatory user");
		CM.enteringDataintoTextfiledByXpath(EL.elePassword_XP, Password, "Password");
		CM.clickonElementbyXpath(EL.eleLogin_XP, "LOGIN");
		Thread.sleep(5000);
	}

	public void Reviewer1Approve() throws InterruptedException {
		Thread.sleep(5000);
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
			WebElement SmbmissonORIssue = driver.findElement(
					By.xpath("//span[text()='" + displayNumber + "']/parent::td/parent::tr/td[text()='Submission']"));
			if (SmbmissonORIssue.isDisplayed()) {
				System.out.println("document submission is displayed");
			} else {
				System.out.println("Document submission is not displayed");
			}
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);

		}
		try {
			WebElement initiatedby = driver.findElement(By.xpath("//span[text()='" + displayNumber
					+ "']/parent::td/following-sibling::td[text()='" + InitiatedBy + "']"));
			if (initiatedby.isDisplayed()) {
				System.out.println("initiatedby " + InitiatedBy);
			} else {
				System.out.println("initiatedby is not displayed");
			}
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}

		try {
			WebElement initiatedby = driver.findElement(By.xpath(
					"//span[text()='" + displayNumber + "']/parent::td/following-sibling::td[text()='" + Date + "']"));
			if (initiatedby.isDisplayed()) {
				System.out.println("initiatedby " + Date);
			} else {
				System.out.println("initiatedby date is not displayed");
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
		
		CM.CheckElementDisplayedbyXpath(EL.eledocinfo_XP, "Document Info");
		CM.CheckElementDisplayedbyXpath(EL.eledocinfoheader_XP, "Document Info Header");
		String Documentinfoheader = driver.findElement(By.xpath("(//thead[@class='t-grid-header'])[1]/tr")).getText();
		System.out.println(Documentinfoheader);
		// Title&Number
		try {
			WebElement TitleNumber = driver.findElement(By.xpath("//td[@id='tdPrimaryDocTitle']"));
			String actual = TitleNumber.getText();
			System.out.println(actual);

			if (actual.equals(expectedTitlenuber)) {
				System.out.println("Pass");
			} else {
				System.out.println("Fail");
			}
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
		// location &Department
		try {
			String locationdepartment = driver.findElement(By.xpath("//td[@id='tdPrimaryDocLocationAndDepartment']"))
					.getText();
			System.out.println(locationdepartment);
			if (locationdepartment.equals(expectedlocationDepartment)) {
				System.out.println("expected location departmentn correct");
			} else {
				System.out.println("expected location department incorrect");
			}
		} catch (Exception e) {
			System.out.println("not able  to validate expected location department element");
			System.out.println("Exception : " + e);
		}
		// classifications
		try {
			boolean category = driver
					.findElement(By.xpath("(//td[@id='tdPrimaryDocClassification']/table/tbody/tr/td/b)[1]"))
					.isDisplayed();
			if (category) {
				System.out.println("category");
			} else {
				System.out.println("category not displayed");
			}
		} catch (Exception e) {
			System.out.println("not able  to validate expected lcategory  displayed element");
			System.out.println("Exception : " + e);
		}
		try {
			boolean subcategory = driver
					.findElement(By.xpath("(//td[@id='tdPrimaryDocClassification']/table/tbody/tr/td/b)[2]"))
					.isDisplayed();
			if (subcategory) {
				System.out.println("subcategory");
			} else {
				System.out.println("subcategory not displayed");
			}
		} catch (Exception e) {
			System.out.println("not able  to validate expected subcategory  displayed element");
			System.out.println("Exception : " + e);
		}
		try {
			boolean Types = driver
					.findElement(By.xpath("(//td[@id='tdPrimaryDocClassification']/table/tbody/tr/td/b)[3]"))
					.isDisplayed();
			if (Types) {
				System.out.println("Types");
			} else {
				System.out.println("Types not displayed");
			}
		} catch (Exception e) {
			System.out.println("not able  to validate expected Types  displayed element");
			System.out.println("Exception : " + e);
		}
		try {
			WebElement categoryname = driver.findElement(By.xpath("//td[text()='" + Category + "']"));
			if (categoryname.isDisplayed()) {
				System.out.println("category name displayed");
			} else {
				System.out.println("category name not displayed");
			}
		} catch (Exception e) {
			System.out.println("not able  to validate expected category name   displayed element");
			System.out.println("Exception : " + e);
		}
		try {
			WebElement subcategoryname = driver.findElement(By.xpath("//td[text()='" + Subcategory + "']"));
			if (subcategoryname.isDisplayed()) {
				System.out.println("subcategory name displayed");
			} else {
				System.out.println("subcategory name not displayed");
			}
		} catch (Exception e) {
			System.out.println("not able  to validate expected subcategory name   displayed element");
			System.out.println("Exception : " + e);
		}
		try {
			WebElement typE = driver.findElement(By.xpath("//td[text()='" + Type + "']"));
			if (typE.isDisplayed()) {
				System.out.println("Type name displayed");
			} else {
				System.out.println("Type name not displayed");
			}
		} catch (Exception e) {
			System.out.println("not able  to validate expected Type name   displayed element");
			System.out.println("Exception : " + e);
		}

		WebElement user = driver.findElement(By.xpath("//td[text()='U']"));
		WebElement Asset = driver.findElement(By.xpath("//td[text()='A']"));
		try {
			WebElement product = driver.findElement(By.xpath("//td[text()='P']"));
			if (product.isDisplayed()) {
				System.out.println("product displayed");
			} else {
				System.out.println("product not displayed");
			}
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
		try {
			WebElement Material = driver.findElement(By.xpath("//td[text()='M']"));
			if (Material.isDisplayed()) {
				System.out.println("Material displayed");
			} else {
				System.out.println("Material not displayed");
			}
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
		try {
			if (user.isDisplayed()) {
				System.out.println("user displayed");
			} else {
				System.out.println("user not displayed");
			}
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
		try {
			if (Asset.isDisplayed()) {
				System.out.println("user name displayed");
			} else {
				System.out.println("user name not displayed");
			}
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
		try {
			WebElement productname = driver.findElement(By.xpath("//td[text()='" + productS + "']"));
			if (productname.isDisplayed()) {
				System.out.println("product name displayed");
			} else {
				System.out.println("product name not displayed");
			}
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
		// WebElement Materialname
		// =driver.findElement(By.xpath("//td[text()='"+MateriaL+"']"));
		// if(Materialname.isDisplayed()) {
//				System.out.println("Material name displayed");
		// }else {
//				System.out.println("Material name not displayed");
		//
		// }
		try {
			WebElement User = driver.findElement(By.xpath("//td[text()='" + useR + "']"));
			if (User.isDisplayed()) {
				System.out.println("USER name displayed");
			} else {
				System.out.println("USER name not displayed");
			}
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
		try {
			WebElement Assets = driver.findElement(By.xpath("//td[text()='" + asset + "']"));
			if (Assets.isDisplayed()) {
				System.out.println("Assets name displayed");
			} else {
				System.out.println("Assets name not displayed");
			}
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
		// settings
		try {
			String setting = driver.findElement(By.xpath("//td[@id='tdLayout']")).getText();
			System.out.println(setting);
			if (setting.equals(Settingpresys)) {
				System.out.println("setting is equals");
			} else {
				System.out.println("settings not equal");
			}
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
		try {
			WebElement uncontrolprint = driver
					.findElement(By.xpath("(//th[contains(text(),'Uncontrolled Print')])[1]"));
			if (uncontrolprint.isDisplayed()) {
				System.out.println("uncontrolprintchange is displayed");
			} else {
				System.out.println("uncontrolprintchange is not displayed");
			}
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
		String parentwindow = driver.getWindowHandle();
		driver.findElement(By.xpath("(//img[@title='View Document'])[1]")).click();
		String Childwindow = driver.getWindowHandle();
		Thread.sleep(3000);
		driver.switchTo().window(parentwindow);
		try {
			WebElement printimg = driver.findElement(By.xpath("//img[@id='btnUncontrolledPrint']"));
			if (printimg.isDisplayed()) {
				System.out.println("print img is displayed");
			} else {
				System.out.println("print img not displayed");
			}
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
		String parentwindow1 = driver.getWindowHandle();
		System.out.println(parentwindow);
		driver.findElement(By.xpath("//img[@id='btnUncontrolledPrint']")).click();
		String Childwindow1 = driver.getWindowHandle();
		System.out.println(Childwindow1);
		Thread.sleep(10000);
		driver.switchTo().window(parentwindow1);
		try {
			driver.findElement(By.xpath("//input[@value='Change History']")).isDisplayed();
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
		// associated doc
		try {
			WebElement Associated = driver.findElement(By.xpath("//h1[text()='Associated Documents']"));
			if (Associated.isDisplayed()) {
				System.out.println("Associated Documents header is displayed");
			} else {
				System.out.println("Associated Documents header is not displayed");
			}
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
		try {
			WebElement Assotitle = driver.findElement(By.xpath(
					"//table[@id='jsonTblAssDocs']//th[@class='t-header wid15pc'][normalize-space()='Title & Number']"));
			if (Assotitle.isDisplayed()) {
				System.out.println("ASSOCIATED DOCUMENTS Title & Number header is displayed");
			} else {
				System.out.println("ASSOCIATED DOCUMENTS Title & Number header is not displayed ");
			}
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
		try {
			WebElement AssoDescrip = driver.findElement(By.xpath(
					"//table[@id='jsonTblAssDocs']//th[@class='t-header wid20pc'][normalize-space()='Description']"));
			if (AssoDescrip.isDisplayed()) {
				System.out.println("ASSOCIATED DOCUMENTS description header is displayed");
			} else {
				System.out.println("ASSOCIATED DOCUMENTS description header is not displayed ");
			}
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
		try {
			WebElement AssoLocDoc = driver.findElement(By.xpath(
					"//table[@id='jsonTblAssDocs']//th[@class='t-header wid15pc'][normalize-space()='Loc, Dep']"));
			if (AssoLocDoc.isDisplayed()) {
				System.out.println("ASSOCIATED DOCUMENTS location & department header is displayed");
			} else {
				System.out.println("ASSOCIATED DOCUMENTS location & department header is not displayed ");
			}
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
		try {
			WebElement Assoclassi = driver.findElement(By.xpath(
					"//table[@id='jsonTblAssDocs']//th[@class='t-header wid20pc'][normalize-space()='Classification']"));
			if (Assoclassi.isDisplayed()) {
				System.out.println("ASSOCIATED DOCUMENTS Classification header is displayed");
			} else {
				System.out.println("ASSOCIATED DOCUMENTS Classification header is not displayed ");
			}
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
		try {
			WebElement AssoASSOCIATION = driver.findElement(By.xpath(
					"//table[@id='jsonTblAssDocs']//th[@class='t-header wid20pc'][normalize-space()='Associations']"));
			if (AssoASSOCIATION.isDisplayed()) {
				System.out.println("ASSOCIATED DOCUMENTS Associations header is displayed");
			} else {
				System.out.println("ASSOCIATED DOCUMENTS Associations header is not displayed ");
			}
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
		try {
			WebElement AssoSETTING = driver.findElement(By.xpath(
					"//table[@id='jsonTblAssDocs']//th[@class='t-header wid20pc'][normalize-space()='Associations']"));
			if (AssoSETTING.isDisplayed()) {
				System.out.println("ASSOCIATED DOCUMENTS Settings header is displayed");
			} else {
				System.out.println("ASSOCIATED DOCUMENTS Settings header is not displayed ");
			}
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
		try {
			WebElement AssoFile = driver.findElement(
					By.xpath("//table[@id='jsonTblAssDocs']//th[@class='t-header wid5pc'][normalize-space()='File']"));
			if (AssoFile.isDisplayed()) {
				System.out.println("ASSOCIATED DOCUMENTS file header is displayed");
			} else {
				System.out.println("ASSOCIATED DOCUMENTS file header is not displayed ");
			}
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
		try {
			WebElement AssociatedUnControlprintheader = driver.findElement(By.xpath(
					"//table[@id='jsonTblAssDocs']//th[@class='t-header wid5pc'][normalize-space()='Uncontrolled Print']"));
			if (AssociatedUnControlprintheader.isDisplayed()) {
				System.out.println("Associated UnControl prin theader is displayed");
			} else {
				System.out.println("AssociatedUnControlprintheader not displayed");
			}
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
		// change details
		try {
			WebElement changedetails = driver.findElement(By.xpath("//span[text()='Change Control Number']"));
			if (changedetails.isDisplayed()) {
				System.out.println("Change detail header is displayed");
			} else {
				System.out.println("ckhange detail header is not displayed");
			}
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
		try {
			WebElement changedis = driver.findElement(By.xpath("(//span[text()='Description'])[2]"));
			if (changedis.isDisplayed()) {
				System.out.println("change control discription header is displayed");
			} else {
				System.out.println("change control discription  header not displayed");
			}
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
		try {
			WebElement statuscahnge = driver.findElement(By.xpath("(//span[text()='Status'])[1]"));
			if (statuscahnge.isDisplayed()) {
				System.out.println("status is displayed");
			} else {
				System.out.println("status not displayed");
			}
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
		try {
			WebElement filechangecontrol = driver.findElement(By.xpath("(//span[text()='File'])[1]"));
			if (filechangecontrol.isDisplayed()) {
				System.out.println("filechangecontrol header is displayed");
			} else {
				System.out.println("filechangecontrol header is not displayed");
			}
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
		try {
			WebElement chngecontrolID = driver.findElement(By.xpath("(//td[text()='" + changecontrolnumbar + "'])[2]"));
			if (chngecontrolID.isDisplayed()) {
				System.out.println("Change control ID is displayed");
			} else {
				System.out.println("Change control ID is not displayed");
			}
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
		try {
			WebElement changecontroldiscription = driver
					.findElement(By.xpath("//td[text()='" + changecontrolDescription + "']"));
			if (changecontroldiscription.isDisplayed()) {
				System.out.println("change control discription is displayed");
			} else {
				System.out.println("change control discription displayed");
			}
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
		Thread.sleep(500);
		String Changeparentwindow = driver.getWindowHandle();
		System.out.println(parentwindow);
		driver.findElement(By.xpath("(//img[@title='View Document'])[2]")).click();
		String ChangeChildwindow = driver.getWindowHandle();
		System.out.println(Childwindow);
		Thread.sleep(5000);
		driver.switchTo().window(Changeparentwindow);
		// Approval history
		try {
			WebElement approvalhistory = driver.findElement(By.xpath("//h1[text()='Approval History']"));
			if (approvalhistory.isDisplayed()) {
				System.out.println("approvalhistory is displayed");
			} else {
				System.out.println("approvalhistory not dispalyed");
			}
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
		CM.CheckElementDisplayedbyXpath(EL.eleTypname_XP, "Type Name");
		CM.CheckElementDisplayedbyXpath(EL.eleinitiaon_XP, "Initiated On");
		CM.CheckElementDisplayedbyXpath(EL.eleinitiaby_XP, "Initiated By");
		CM.CheckElementDisplayedbyXpath(EL.elestatuS_XP, "Status");
		CM.CheckElementDisplayedbyXpath(EL.elecollpall_XP, "Collapse All");
		CM.CheckElementDisplayedbyXpath(EL.eleHidedetail_XP, "Hide details");
		CM.clickonElementbyXpath(EL.elecollpall_XP, "Collapse All");
		CM.clickonElementbyXpath(EL.eleshowdetails_XP, "Show details");
		try {
			WebElement submission = driver.findElement(By.xpath("//td[text()='Submission']"));
			if (submission.isDisplayed()) {
				System.out.println("submission is displayed");
			} else {
				System.out.println("submission not displayed");
			}
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
		try {
			WebElement initiatedby = driver.findElement(By.xpath("//td[text()='" + initiatedBy + "']"));
			if (initiatedby.isDisplayed()) {
				System.out.println("initiatedby " + initiatedBy);
			} else {
				System.out.println("initiatedby not displayed");
			}
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
		try {
			WebElement statuss = driver.findElement(By.xpath("//td[text()='In Progress']"));
			if (statuss.isDisplayed()) {
				System.out.println("status In Progress is displayed");
			} else {
				System.out.println("status In Progress is not displayed");
			}
		} catch (Exception e) {
			System.out.println("status In Progress is not displayed");
			System.out.println("Exception : " + e);
		}
		try {
			WebElement Dates = driver.findElement(By.xpath("(//td[text()='" + Date + "'])[2]"));

			if (Dates.isDisplayed()) {
				System.out.println("equal");

			} else {
				System.out.println("! equal");
			}
		} catch (Exception e) {
			System.out.println("date is not displayed");
			System.out.println("Exception : " + e);
		}
		CM.CheckElementDisplayedbyXpath(EL.elestepname_XP, "Step Name");
		CM.CheckElementDisplayedbyXpath(EL.eleActions_XP, "Action");
		CM.CheckElementDisplayedbyXpath(EL.eleactedby_XP, "Acted By");
		CM.CheckElementDisplayedbyXpath(EL.eleacceptedon_XP, "Accepted On");
		CM.CheckElementDisplayedbyXpath(EL.eleremarks_XP, "Remarks");
		CM.CheckElementDisplayedbyXpath(EL.eleattachedfile_XP, "File");
		// nonsignatory
		try {
			String StringExpectstep1 = "Task for Non-Signatory Reviewers";
			WebElement Nonsignata = driver.findElement(By.xpath(
					"(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[1]/td[text()='Task for Non-Signatory Reviewers']"));

			if (Nonsignata.isDisplayed()) {
				System.out.println("Task for Non-Signatory Reviewers dispalyed");
			} else {
				System.out.println("Task for Non-Signatory Reviewers not dispalyed");
			}
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
		try {
			WebElement NonsignatoryAction = driver.findElement(By.xpath(
					"(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[1]/td[text()='Approved']"));
			if (NonsignatoryAction.isDisplayed()) {
				System.out.println("Nonsignatory reviewer action Approve ");
			} else {
				System.out.println("Nonsignatory reviewer action not showing ");
			}
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
		try {
			WebElement actedBYNONSIGNATORY = driver.findElement(
					By.xpath("(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[1]/td[text()='"
							+ NonSignatoryNAME + "']"));

			if (actedBYNONSIGNATORY.isDisplayed()) {
				System.out.println("NonSignatoryNAME is dispalyed");
			} else {
				System.out.println("NonSignatoryNAME is not dispalyed");
			}
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
		try {
			WebElement NonSignataryAcceptedon = driver.findElement(By.xpath("(//td[@class='CLH wid10pc'])[2]"));
			NonSignataryAcceptedON = NonSignataryAcceptedon.getText();
			Thread.sleep(5000);
			if (NonSignataryAcceptedon.isDisplayed()) {
				System.out.println("Non Signatary Accepted on DATE" );
			} else {
				System.out.println("NonSignataryAcceptedon DATE not showing");
			}
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
		try {
			String NonsignatoryRmarks = driver
					.findElement(By.xpath("(//td[@class='CL wid20pc shortNamelast'])[1]")).getText();
			Thread.sleep(500);
			if(NonsignatoryRmarks.equals(nonsignatoryremarks)) {
				System.out.println("Non signatory remarks is displayed");
			}else {
				System.out.println("Non signatory remarks not displayed");
			}
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
		try {
			WebElement Attachedfile1 = driver.findElement(By.xpath("(//td[@class='t-last'])[2]/div/a"));
			if (Attachedfile1.isDisplayed()) {
				String parentwindows = driver.getWindowHandle();
				Attachedfile1.click();
				String ChangeChildwindows = driver.getWindowHandle();
				Thread.sleep(5000);
				driver.switchTo().window(parentwindows);
			} else {
				System.out.println(" Nonsignatory  file not attached ");
			}
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
		try {
			WebElement Attachedfileprinterimg = driver.findElement(By.xpath("(//td[@class='t-last'])[2]/div/img"));
			if (Attachedfileprinterimg.isDisplayed()) {
				String parentwindows = driver.getWindowHandle();
				Attachedfileprinterimg.click();
				String ChangeChildwindows = driver.getWindowHandle();
				Thread.sleep(5000);
				driver.switchTo().window(parentwindows);
			} else {
				System.out.println("Attached file printer img not displayed");
			}
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
// Reviewer
		try {
			String StringExpectstep2 = "Default Tasks for Reviewers";
			WebElement TaskReviewer = driver.findElement(By.xpath(
					"(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[2]/td[text()='Default Tasks for Reviewers']"));

			if (TaskReviewer.isDisplayed()) {
				System.out.println("Default Tasks for Reviewers dispalyed");
			} else {
				System.out.println("Default Tasks for Reviewers not dispalyed");
			}
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
		try {
			WebElement ReviewerAction = driver.findElement(By.xpath(
					"(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[2]/td[text()='Approved']"));
			Thread.sleep(2000);
			if (ReviewerAction.isDisplayed()) {
				System.out.println(" reviewer action Approve ");
			} else {
				System.out.println(" reviewer action not showing ");
			}
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
		try {
			WebElement actedBYReviewer = driver.findElement(
					By.xpath("(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[2]/td[text()='"
							+ Reviewer1username + "']"));

			if (actedBYReviewer.isDisplayed()) {
				System.out.println("Reviewer name is dispalyed");
			} else {
				System.out.println("Reviewer name  is not dispalyed");
			}
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}	
		try {
			WebElement NonsignatoryRmarks = driver
					.findElement(By.xpath("(//td[@class='CL wid20pc shortNamelast'])[1]"));
			NonSignatoryRemarks = NonsignatoryRmarks.getText();
			Thread.sleep(5000);
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}	
		// Approver
		try {
			String StringExpectstep3 = "Approval 1";
			WebElement TaskApprover = driver.findElement(By.xpath(
					"(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[3]/td[text()='Approval 1']"));

			if (TaskApprover.isDisplayed()) {
				System.out.println("Default Tasks for Reviewers dispalyed");
			} else {
				System.out.println("Default Tasks for Reviewers not dispalyed");
			}
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
		try {
			WebElement ApproverAction = driver.findElement(By
					.xpath("(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[3]/td[text()='Pending']"));

			if (ApproverAction.isDisplayed()) {
				System.out.println(" reviewer action Pending ");
			} else {
				System.out.println(" reviewer action not showing ");
			}
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
		try {
			WebElement actedBYApprover = driver.findElement(
					By.xpath("(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[3]/td[text()='"
							+ Reviewer2username + "']"));
			if (actedBYApprover.isDisplayed()) {
				System.out.println("Reviewer name is dispalyed");
			} else {
				System.out.println("Reviewer name  is not dispalyed");
			}
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
		CM.enteringDataintoTextfiledByXpath(EL.eleRemarksinput_XP, Reviewer1remarks, " Reviewer1remarks");
		try {
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//select[@id='Decision']")));
			Select select = new Select(driver.findElement(By.xpath("//select[@id='Decision']")));
			select.selectByVisibleText(Approve);

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
	public void Approver1Login() throws InterruptedException {

		CM.enteringDataintoTextfiledByXpath(EL.eleUserName_XP, Reviewer2username, " Non signatory user");
		CM.enteringDataintoTextfiledByXpath(EL.elePassword_XP, Password, "Password");
		CM.clickonElementbyXpath(EL.eleLogin_XP, "LOGIN");
		Thread.sleep(5000);
	}
	public void Approver1Approve() throws InterruptedException {
		Thread.sleep(5000);
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
			WebElement SmbmissonORIssue = driver.findElement(
					By.xpath("//span[text()='" + displayNumber + "']/parent::td/parent::tr/td[text()='Submission']"));
			if (SmbmissonORIssue.isDisplayed()) {
				System.out.println("document submission is displayed");
			} else {
				System.out.println("Document submission is not displayed");
			}
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
		try {
			WebElement initiatedby = driver.findElement(By.xpath("//span[text()='" + displayNumber
					+ "']/parent::td/following-sibling::td[text()='" + InitiatedBy + "']"));
			if (initiatedby.isDisplayed()) {
				System.out.println("initiatedby " + InitiatedBy);
			} else {
				System.out.println("initiatedby is not displayed");
			}
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
	try {
			WebElement initiatedby = driver.findElement(By.xpath(
					"//span[text()='" + displayNumber + "']/parent::td/following-sibling::td[text()='" + Date + "']"));
			if (initiatedby.isDisplayed()) {
				System.out.println("initiatedby " + Date);
			} else {
				System.out.println("initiatedby date is not displayed");
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
		try {
			WebElement TitleNumber = driver.findElement(By.xpath("//td[@id='tdPrimaryDocTitle']"));
			String actual = TitleNumber.getText();
			System.out.println(actual);

			if (actual.equals(expectedTitlenuber)) {
				System.out.println("Pass");
			} else {
				System.out.println("Fail");
			}
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
		// location &Department
		try {
			String locationdepartment = driver.findElement(By.xpath("//td[@id='tdPrimaryDocLocationAndDepartment']"))
					.getText();
			System.out.println(locationdepartment);
			if (locationdepartment.equals(expectedlocationDepartment)) {
				System.out.println("expected location departmentn correct");
			} else {
				System.out.println("expected location department incorrect");
			}
		} catch (Exception e) {
			System.out.println("not able  to validate expected location department element");
			System.out.println("Exception : " + e);
		}
		// classifications
		try {
			boolean category = driver
					.findElement(By.xpath("(//td[@id='tdPrimaryDocClassification']/table/tbody/tr/td/b)[1]"))
					.isDisplayed();
			if (category) {
				System.out.println("category");
			} else {
				System.out.println("category not displayed");
			}
		} catch (Exception e) {
			System.out.println("not able  to validate expected lcategory  displayed element");
			System.out.println("Exception : " + e);
		}
		try {
			boolean subcategory = driver
					.findElement(By.xpath("(//td[@id='tdPrimaryDocClassification']/table/tbody/tr/td/b)[2]"))
					.isDisplayed();
			if (subcategory) {
				System.out.println("subcategory");
			} else {
				System.out.println("subcategory not displayed");
			}
		} catch (Exception e) {
			System.out.println("not able  to validate expected subcategory  displayed element");
			System.out.println("Exception : " + e);
		}
		try {
			boolean Types = driver
					.findElement(By.xpath("(//td[@id='tdPrimaryDocClassification']/table/tbody/tr/td/b)[3]"))
					.isDisplayed();
			if (Types) {
				System.out.println("Types");
			} else {
				System.out.println("Types not displayed");
			}
		} catch (Exception e) {
			System.out.println("not able  to validate expected Types  displayed element");
			System.out.println("Exception : " + e);
		}
		try {
			WebElement categoryname = driver.findElement(By.xpath("//td[text()='" + Category + "']"));
			if (categoryname.isDisplayed()) {
				System.out.println("category name displayed");
			} else {
				System.out.println("category name not displayed");
			}
		} catch (Exception e) {
			System.out.println("not able  to validate expected category name   displayed element");
			System.out.println("Exception : " + e);
		}
		try {
			WebElement subcategoryname = driver.findElement(By.xpath("//td[text()='" + Subcategory + "']"));
			if (subcategoryname.isDisplayed()) {
				System.out.println("subcategory name displayed");
			} else {
				System.out.println("subcategory name not displayed");
			}
		} catch (Exception e) {
			System.out.println("not able  to validate expected subcategory name   displayed element");
			System.out.println("Exception : " + e);
		}
		try {
			WebElement typE = driver.findElement(By.xpath("//td[text()='" + Type + "']"));
			if (typE.isDisplayed()) {
				System.out.println("Type name displayed");
			} else {
				System.out.println("Type name not displayed");
			}
		} catch (Exception e) {
			System.out.println("not able  to validate expected Type name   displayed element");
			System.out.println("Exception : " + e);
		}
		WebElement user = driver.findElement(By.xpath("//td[text()='U']"));
		WebElement Asset = driver.findElement(By.xpath("//td[text()='A']"));
		try {
			WebElement product = driver.findElement(By.xpath("//td[text()='P']"));
			if (product.isDisplayed()) {
				System.out.println("product displayed");
			} else {
				System.out.println("product not displayed");
			}
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
		try {
			WebElement Material = driver.findElement(By.xpath("//td[text()='M']"));
			if (Material.isDisplayed()) {
				System.out.println("Material displayed");
			} else {
				System.out.println("Material not displayed");
			}
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
		try {
			if (user.isDisplayed()) {
				System.out.println("user displayed");
			} else {
				System.out.println("user not displayed");
			}
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
		try {
			if (Asset.isDisplayed()) {
				System.out.println("user name displayed");
			} else {
				System.out.println("user name not displayed");
			}
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
		try {
			WebElement productname = driver.findElement(By.xpath("//td[text()='" + productS + "']"));
			if (productname.isDisplayed()) {
				System.out.println("product name displayed");
			} else {
				System.out.println("product name not displayed");
			}
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
		// WebElement Materialname
		// =driver.findElement(By.xpath("//td[text()='"+MateriaL+"']"));
		// if(Materialname.isDisplayed()) {
//				System.out.println("Material name displayed");
		// }else {
//				System.out.println("Material name not displayed");
		//
		// }
		try {
			WebElement User = driver.findElement(By.xpath("//td[text()='" + useR + "']"));
			if (User.isDisplayed()) {
				System.out.println("USER name displayed");
			} else {
				System.out.println("USER name not displayed");
			}
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
		try {
			WebElement Assets = driver.findElement(By.xpath("//td[text()='" + asset + "']"));
			if (Assets.isDisplayed()) {
				System.out.println("Assets name displayed");
			} else {
				System.out.println("Assets name not displayed");
			}
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
		// settings
		try {
			String setting = driver.findElement(By.xpath("//td[@id='tdLayout']")).getText();
			System.out.println(setting);
			if (setting.equals(Settingpresys)) {
				System.out.println("setting is equals");
			} else {
				System.out.println("settings not equal");
			}
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
		try {
			WebElement uncontrolprint = driver
					.findElement(By.xpath("(//th[contains(text(),'Uncontrolled Print')])[1]"));
			if (uncontrolprint.isDisplayed()) {
				System.out.println("uncontrolprintchange is displayed");
			} else {
				System.out.println("uncontrolprintchange is not displayed");
			}
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
		String parentwindow = driver.getWindowHandle();
		System.out.println(parentwindow);
		driver.findElement(By.xpath("(//img[@title='View Document'])[1]")).click();
		String Childwindow = driver.getWindowHandle();
		System.out.println(Childwindow);
		Thread.sleep(10000);
		driver.switchTo().window(parentwindow);
		try {
			WebElement printimg = driver.findElement(By.xpath("//img[@id='btnUncontrolledPrint']"));
			if (printimg.isDisplayed()) {
				System.out.println("print img is displayed");
			} else {
				System.out.println("print img not displayed");
			}
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
		String parentwindow1 = driver.getWindowHandle();
		System.out.println(parentwindow);
		driver.findElement(By.xpath("//img[@id='btnUncontrolledPrint']")).click();
		String Childwindow1 = driver.getWindowHandle();
		System.out.println(Childwindow1);
		Thread.sleep(10000);
		driver.switchTo().window(parentwindow1);
		try {
			driver.findElement(By.xpath("//input[@value='Change History']")).isDisplayed();
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
		// associated doc
		try {
			WebElement Associated = driver.findElement(By.xpath("//h1[text()='Associated Documents']"));
			if (Associated.isDisplayed()) {
				System.out.println("Associated Documents header is displayed");
			} else {
				System.out.println("Associated Documents header is not displayed");
			}
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
		try {
			WebElement Assotitle = driver.findElement(By.xpath(
					"//table[@id='jsonTblAssDocs']//th[@class='t-header wid15pc'][normalize-space()='Title & Number']"));
			if (Assotitle.isDisplayed()) {
				System.out.println("ASSOCIATED DOCUMENTS Title & Number header is displayed");
			} else {
				System.out.println("ASSOCIATED DOCUMENTS Title & Number header is not displayed ");
			}
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
		try {
			WebElement AssoDescrip = driver.findElement(By.xpath(
					"//table[@id='jsonTblAssDocs']//th[@class='t-header wid20pc'][normalize-space()='Description']"));
			if (AssoDescrip.isDisplayed()) {
				System.out.println("ASSOCIATED DOCUMENTS description header is displayed");
			} else {
				System.out.println("ASSOCIATED DOCUMENTS description header is not displayed ");
			}
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
		try {
			WebElement AssoLocDoc = driver.findElement(By.xpath(
					"//table[@id='jsonTblAssDocs']//th[@class='t-header wid15pc'][normalize-space()='Loc, Dep']"));
			if (AssoLocDoc.isDisplayed()) {
				System.out.println("ASSOCIATED DOCUMENTS location & department header is displayed");
			} else {
				System.out.println("ASSOCIATED DOCUMENTS location & department header is not displayed ");
			}
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
		try {
			WebElement Assoclassi = driver.findElement(By.xpath(
					"//table[@id='jsonTblAssDocs']//th[@class='t-header wid20pc'][normalize-space()='Classification']"));
			if (Assoclassi.isDisplayed()) {
				System.out.println("ASSOCIATED DOCUMENTS Classification header is displayed");
			} else {
				System.out.println("ASSOCIATED DOCUMENTS Classification header is not displayed ");
			}
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
		try {
			WebElement AssoASSOCIATION = driver.findElement(By.xpath(
					"//table[@id='jsonTblAssDocs']//th[@class='t-header wid20pc'][normalize-space()='Associations']"));
			if (AssoASSOCIATION.isDisplayed()) {
				System.out.println("ASSOCIATED DOCUMENTS Associations header is displayed");
			} else {
				System.out.println("ASSOCIATED DOCUMENTS Associations header is not displayed ");
			}
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
		try {
			WebElement AssoSETTING = driver.findElement(By.xpath(
					"//table[@id='jsonTblAssDocs']//th[@class='t-header wid20pc'][normalize-space()='Associations']"));
			if (AssoSETTING.isDisplayed()) {
				System.out.println("ASSOCIATED DOCUMENTS Settings header is displayed");
			} else {
				System.out.println("ASSOCIATED DOCUMENTS Settings header is not displayed ");
			}
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
		try {
			WebElement AssoFile = driver.findElement(
					By.xpath("//table[@id='jsonTblAssDocs']//th[@class='t-header wid5pc'][normalize-space()='File']"));
			if (AssoFile.isDisplayed()) {
				System.out.println("ASSOCIATED DOCUMENTS file header is displayed");
			} else {
				System.out.println("ASSOCIATED DOCUMENTS file header is not displayed ");
			}
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
		try {
			WebElement AssociatedUnControlprintheader = driver.findElement(By.xpath(
					"//table[@id='jsonTblAssDocs']//th[@class='t-header wid5pc'][normalize-space()='Uncontrolled Print']"));
			if (AssociatedUnControlprintheader.isDisplayed()) {
				System.out.println("Associated UnControl prin theader is displayed");
			} else {
				System.out.println("AssociatedUnControlprintheader not displayed");
			}
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
		// change details
		try {
			WebElement changedetails = driver.findElement(By.xpath("//span[text()='Change Control Number']"));
			if (changedetails.isDisplayed()) {
				System.out.println("Change detail header is displayed");
			} else {
				System.out.println("ckhange detail header is not displayed");
			}
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
		try {
			WebElement changedis = driver.findElement(By.xpath("(//span[text()='Description'])[2]"));
			if (changedis.isDisplayed()) {
				System.out.println("change control discription header is displayed");
			} else {
				System.out.println("change control discription  header not displayed");
			}
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
		try {
			WebElement statuscahnge = driver.findElement(By.xpath("(//span[text()='Status'])[1]"));
			if (statuscahnge.isDisplayed()) {
				System.out.println("status is displayed");
			} else {
				System.out.println("status not displayed");
			}
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
		try {
			WebElement filechangecontrol = driver.findElement(By.xpath("(//span[text()='File'])[1]"));
			if (filechangecontrol.isDisplayed()) {
				System.out.println("filechangecontrol header is displayed");
			} else {
				System.out.println("filechangecontrol header is not displayed");
			}
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
		try {
			WebElement chngecontrolID = driver.findElement(By.xpath("(//td[text()='" + changecontrolnumbar + "'])[2]"));
			if (chngecontrolID.isDisplayed()) {
				System.out.println("Change control ID is displayed");
			} else {
				System.out.println("Change control ID is not displayed");
			}
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
		try {
			WebElement changecontroldiscription = driver
					.findElement(By.xpath("//td[text()='" + changecontrolDescription + "']"));
			if (changecontroldiscription.isDisplayed()) {
				System.out.println("change control discription is displayed");
			} else {
				System.out.println("change control discription displayed");
			}
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
		Thread.sleep(500);
		String Changeparentwindow = driver.getWindowHandle();
		System.out.println(parentwindow);
		driver.findElement(By.xpath("(//img[@title='View Document'])[2]")).click();
		String ChangeChildwindow = driver.getWindowHandle();
		System.out.println(Childwindow);
		Thread.sleep(5000);
		driver.switchTo().window(Changeparentwindow);
		// Approval history
		try {
			WebElement approvalhistory = driver.findElement(By.xpath("//h1[text()='Approval History']"));
			if (approvalhistory.isDisplayed()) {
				System.out.println("approvalhistory is displayed");
			} else {
				System.out.println("approvalhistory not dispalyed");
			}
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
		CM.CheckElementDisplayedbyXpath(EL.eleTypname_XP, "Type Name");
		CM.CheckElementDisplayedbyXpath(EL.eleinitiaon_XP, "Initiated On");
		CM.CheckElementDisplayedbyXpath(EL.eleinitiaby_XP, "Initiated By");
		CM.CheckElementDisplayedbyXpath(EL.elestatuS_XP, "Status");
		CM.CheckElementDisplayedbyXpath(EL.elecollpall_XP, "Collapse All");
		CM.CheckElementDisplayedbyXpath(EL.eleHidedetail_XP, "Hide details");
		CM.clickonElementbyXpath(EL.elecollpall_XP, "Collapse All");
		CM.clickonElementbyXpath(EL.eleshowdetails_XP, "Show details");
		try {
			WebElement submission = driver.findElement(By.xpath("//td[text()='Submission']"));
			if (submission.isDisplayed()) {
				System.out.println("submission is displayed");
			} else {
				System.out.println("submission not displayed");
			}
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
		try {
			WebElement initiatedby = driver.findElement(By.xpath("//td[text()='" + initiatedBy + "']"));
			if (initiatedby.isDisplayed()) {
				System.out.println("initiatedby " + initiatedBy);
			} else {
				System.out.println("initiatedby not displayed");
			}
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
		try {
			WebElement statuss = driver.findElement(By.xpath("//td[text()='In Progress']"));
			if (statuss.isDisplayed()) {
				System.out.println("status In Progress is displayed");
			} else {
				System.out.println("status In Progress is not displayed");
			}
		} catch (Exception e) {
			System.out.println("status In Progress is not displayed");
			System.out.println("Exception : " + e);
		}
		try {
			WebElement Dates = driver.findElement(By.xpath("(//td[text()='" + Date + "'])[2]"));
			if (Dates.isDisplayed()) {
				System.out.println("equal");

			} else {
				System.out.println("! equal");
			}
		} catch (Exception e) {
			System.out.println("date is not displayed");
			System.out.println("Exception : " + e);
		}
		CM.CheckElementDisplayedbyXpath(EL.elestepname_XP, "Step Name");
		CM.CheckElementDisplayedbyXpath(EL.eleActions_XP, "Action");
		CM.CheckElementDisplayedbyXpath(EL.eleactedby_XP, "Acted By");
		CM.CheckElementDisplayedbyXpath(EL.eleacceptedon_XP, "Accepted On");
		CM.CheckElementDisplayedbyXpath(EL.eleremarks_XP, "Remarks");
		CM.CheckElementDisplayedbyXpath(EL.eleattachedfile_XP, "File");
		// nonsignatory
		try {
			String StringExpectstep1 = "Task for Non-Signatory Reviewers";
			WebElement Nonsignata = driver.findElement(By.xpath(
					"(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[1]/td[text()='Task for Non-Signatory Reviewers']"));
			if (Nonsignata.isDisplayed()) {
				System.out.println("Task for Non-Signatory Reviewers dispalyed");
			} else {
				System.out.println("Task for Non-Signatory Reviewers not dispalyed");
			}
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
		try {
			WebElement NonsignatoryAction = driver.findElement(By.xpath(
					"(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[1]/td[text()='Approved']"));
			if (NonsignatoryAction.isDisplayed()) {
				System.out.println("Nonsignatory reviewer action Approve ");
			} else {
				System.out.println("Nonsignatory reviewer action not showing ");
			}
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
		try {
			WebElement actedBYNONSIGNATORY = driver.findElement(
					By.xpath("(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[1]/td[text()='"
							+ NonSignatoryNAME + "']"));

			if (actedBYNONSIGNATORY.isDisplayed()) {
				System.out.println("NonSignatoryNAME is dispalyed");
			} else {
				System.out.println("NonSignatoryNAME is not dispalyed");
			}
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
		try {
			WebElement NonSignataryAcceptedon = driver.findElement(By.xpath("(//td[@class='CLH wid10pc'])[2]"));
			NonSignataryAcceptedON = NonSignataryAcceptedon.getText();
			Thread.sleep(5000);
			if (NonSignataryAcceptedon.isDisplayed()) {
				System.out.println("NonSignataryAcceptedon date " );
			} else {
				System.out.println("NonSignataryAcceptedon not showing");
			}
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
//g		try {
//			WebElement NonsignatoryRmarks = driver
//					.findElement(By.xpath("(//td[@class='CL wid20pc shortNamelast'])[1]"));
//			NonSignatoryRemarks = NonsignatoryRmarks.getText();
//			Thread.sleep(5000);
//		} catch (Exception e) {
//			System.out.println("not able to validate");
//			System.out.println("Exception : " + e);
//		}




try {
	String NonsignatoryRmarks = driver
			.findElement(By.xpath("(//td[@class='CL wid20pc shortNamelast'])[1]")).getText();
	Thread.sleep(500);
	if(NonsignatoryRmarks.equals(nonsignatoryremarks)) {
		System.out.println("Non signatory remarks is displayed");
	}else {
		System.out.println("Non signatory remarks not displayed");
	}
} catch (Exception e) {
	System.out.println("not able to validate");
	System.out.println("Exception : " + e);
}

		try {
			WebElement Attachedfile1 = driver.findElement(By.xpath("(//td[@class='t-last'])[2]/div/a"));
			if (Attachedfile1.isDisplayed()) {
				String parentwindows = driver.getWindowHandle();
				Attachedfile1.click();
				String ChangeChildwindows = driver.getWindowHandle();
				Thread.sleep(5000);
				driver.switchTo().window(parentwindows);
			} else {
				System.out.println(" Nonsignatory  file not attached ");
			}
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
		try {
			WebElement Attachedfileprinterimg = driver.findElement(By.xpath("(//td[@class='t-last'])[2]/div/img"));
			if (Attachedfileprinterimg.isDisplayed()) {
				String parentwindows = driver.getWindowHandle();
				Attachedfileprinterimg.click();
				String ChangeChildwindows = driver.getWindowHandle();
				Thread.sleep(5000);
				driver.switchTo().window(parentwindows);
			} else {
				System.out.println("Attached file printer img not displayed");
			}
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
// Reviewer
		try {
			String StringExpectstep2 = "Default Tasks for Reviewers";
			WebElement TaskReviewer = driver.findElement(By.xpath(
					"(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[2]/td[text()='Default Tasks for Reviewers']"));

			if (TaskReviewer.isDisplayed()) {
				System.out.println("Default Tasks for Reviewers dispalyed");
			} else {
				System.out.println("Default Tasks for Reviewers not dispalyed");
			}
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
		try {
			WebElement ReviewerAction = driver.findElement(By.xpath(
					"(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[2]/td[text()='Approved']"));
			Thread.sleep(2000);
			if (ReviewerAction.isDisplayed()) {
				System.out.println(" reviewer action Approve ");
			} else {
				System.out.println(" reviewer action not showing ");
			}
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
		try {
			WebElement actedBYReviewer = driver.findElement(
					By.xpath("(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[2]/td[text()='"
							+ Reviewer1username + "']"));

			if (actedBYReviewer.isDisplayed()) {
				System.out.println("Reviewer name is dispalyed");
			} else {
				System.out.println("Reviewer name  is not dispalyed");
			}
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
		// Approver
		try {
			String StringExpectstep3 = "Approval 1";
			WebElement TaskApprover = driver.findElement(By.xpath(
					"(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[3]/td[text()='Approval 1']"));

			if (TaskApprover.isDisplayed()) {
				System.out.println("Default Tasks for Reviewers dispalyed");
			} else {
				System.out.println("Default Tasks for Reviewers not dispalyed");
			}
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
		try {
			WebElement ApproverAction = driver.findElement(By
					.xpath("(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[3]/td[text()='Pending']"));

			if (ApproverAction.isDisplayed()) {
				System.out.println(" reviewer action Pending ");
			} else {
				System.out.println(" reviewer action not showing ");
			}
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
		try {
			WebElement actedBYApprover = driver.findElement(
					By.xpath("(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[3]/td[text()='"
							+ Reviewer2username + "']"));
			if (actedBYApprover.isDisplayed()) {
				System.out.println("Reviewer name is dispalyed");
			} else {
				System.out.println("Reviewer name  is not dispalyed");
			}
		} catch (Exception e) {
			System.out.println("not able to validate");
			System.out.println("Exception : " + e);
		}
		CM.enteringDataintoTextfiledByXpath(EL.eleRemarksinput_XP, Reviewer1remarks, " Reviewer1remarks");
		try {
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//select[@id='Decision']")));
			Select select = new Select(driver.findElement(By.xpath("//select[@id='Decision']")));
			select.selectByVisibleText(Reject);
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
}
