package SnapDoc.snap;

import java.awt.AWTException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class Emailchecking extends TestBase {
	private HashMap<Object, Object> excelinputDdata;
	public static String Date;
	public static String NonSignataryAcceptedON;
	public static String NonSignatoryRemarks;
	public static String DisplayNumbers;
	public static String EffectiveDate;

//	public void Documentinitiates() throws InterruptedException, AWTException, IOException {
//				excelinputDdata = new HashMap<>();
//				FileInputStream file = new FileInputStream("C:\\Users\\SSD\\Documents\\Type creation.xlsx");
//				XSSFWorkbook Workbook = new XSSFWorkbook(file);
//				XSSFSheet sheet = Workbook.getSheet("Sheet1");
//				int rowcount = sheet.getLastRowNum();
//				for (int i = 1; i <= rowcount; i++) {
//					XSSFRow row = sheet.getRow(i);
//					String Type = row.getCell(0).getStringCellValue();
//					String TypeCode = row.getCell(1).getStringCellValue();
//					String TypeDescription = row.getCell(2).getStringCellValue();
//					String MakeEffectiveLevel1 = row.getCell(3).getStringCellValue();
//					String IssueLevel1 = row.getCell(4).getStringCellValue();
//					String ControlPrintLevel1 = row.getCell(5).getStringCellValue();
//					String RecouncilationLevel1 = row.getCell(6).getStringCellValue();
//					String DestructionLevel1 = row.getCell(7).getStringCellValue();
//					String Category = row.getCell(8).getStringCellValue();
//					String Subcategory = row.getCell(9).getStringCellValue();
//					driver.findElement(By.xpath("(//span[text()='" + Category + "'])[2]")).click();
//					Thread.sleep(5000);
//					driver.findElement(By.xpath("//td[text()='" + Subcategory + "']")).click();
//					Thread.sleep(10000);
//					WebElement Add = driver.findElement(By.xpath("(//input[@value='Add'])[3]"));
//					try {
//						Add.click();
//					} catch (StaleElementReferenceException e) {
//						Add = driver.findElement(By.xpath("(//input[@value='Add'])[3]"));
//						Add.click();
//					}
//					driver.findElement(By.xpath("//input[@id='TypeName']")).sendKeys(Type);
//					Thread.sleep(500);
//					driver.findElement(By.xpath("//input[@id='TypeCode']")).sendKeys(TypeCode);
//					driver.findElement(By.xpath("//input[@id='TypeDescription']")).sendKeys(TypeDescription);
////						CM.clickonElementbyXpath(EL.eleOrgid_XP, "Org Id ");// click unselect
//					CM.clickonElementbyXpath(EL.eleChangeNeeded_XP, "Change needed"); // click unselect
////						CM.clickonElementbyXpath(EL.eleAssociatedonly_XP, "Associated only");
//					CM.clickonElementbyXpath(EL.eleEffectiveproccess_XP, "Effective manually");// click effective manually
//					CM.clickonElementbyXpath(EL.eleManualnumber_XP, "Manual number check box");// click select
//					WebElement Manualnumber = driver.findElement(By.name("IsNumberingAutoOrManual"));
//					System.out.println("Manualnumber is selected ?" + Manualnumber.isSelected());
//					if (Manualnumber.equals(true)) {
//						System.out.println("enter manal number");
//						CM.CheckElementDisplayedbyXpath(EL.eleActive_XP, "Active");
//						CM.CheckElementDisplayedbyXpath(EL.eleNumberingApproach_XP, "Numbering Approach");
//						CM.CheckElementDisplayedbyXpath(EL.eleNumberingAssociations_XP, "Numbering Associations");
//						CM.CheckElementDisplayedbyXpath(EL.eleNomenclature_XP, "Nomenclature");
//						CM.CheckElementDisplayedbyXpath(EL.eleDescriptionsA_XP, "Description");
//						CM.CheckElementDisplayedbyXpath(EL.eleSelection_XP, "Selection");
//						CM.CheckElementDisplayedbyXpath(EL.eleFormat_XP, "Format");
//						CM.CheckElementDisplayedbyXpath(EL.eleAddlInfo_XP, "Addl Info");
//						CM.CheckElementDisplayedbyXpath(EL.eleSeparator_XP, "Separator");
//						WebElement primarydocactive1 = driver.findElement(By.name("primarydocactive"));
//						System.out.println("primary doc active is selected ?" + primarydocactive1.isSelected());
//						primarydocactive1.equals(false);
//						System.out.println("Manual number selected");
//					} else {
//						CM.CheckElementDisplayedbyXpath(EL.eleNumberingApproach_XP, "Numbering Approach");
//						CM.CheckElementDisplayedbyXpath(EL.eleNumberingAssociations_XP, "Numbering Associations");
//						CM.CheckElementDisplayedbyXpath(EL.eleNomenclature_XP, "Nomenclature");
//						CM.CheckElementDisplayedbyXpath(EL.eleDescriptionsA_XP, "Description");
//						CM.CheckElementDisplayedbyXpath(EL.eleSelection_XP, "Selection");
//						CM.CheckElementDisplayedbyXpath(EL.eleFormat_XP, "Format");
//						CM.CheckElementDisplayedbyXpath(EL.eleAddlInfo_XP, "Addl Info");
//						CM.CheckElementDisplayedbyXpath(EL.eleSeparator_XP, "Separator");
//						CM.CheckElementDisplayedbyXpath(EL.elerdbtnNumberingType_XP, "rdbtnNumberingType");
//						WebElement primarydocactive1 = driver.findElement(By.name("primarydocactive"));
//						System.out.println("primary doc active is selected ?" + primarydocactive1.isSelected());
//						primarydocactive1.equals(true);
////								CM.selectValueinDropdownByVisualtextbyXpath(EL.elerdbtnNumberingType_XP, "Independent",
////										"Numbering Approach");
////								CM.enteringDataintoTextfiledByXpath(EL.eleDescriptionAutoNum_XP, "deiscription 1", "Discription");
////								CM.selectValueinDropdownByVisualtextbyXpath(EL.elePartsAutoNum_XP, "Fixed", "Selection");
////								CM.CheckElementDisplayedbyXpath(EL.elebtnAddNewRow_XP, "btnAddNewRow");
//
//					}
//					WebElement Orgid = driver.findElement(By.name("IsManualNumberReq"));
//					System.out.println("Orgid is selected ?" + Orgid.isSelected());
//
//					WebElement Asso = driver.findElement(By.name("IsCreateIndividual"));
//					System.out.println("Associated is selected ?" + Asso.isSelected());
//					WebElement ChangeNeeded = driver.findElement(By.name("IsChangeNeeded"));
//					System.out.println("ChangeNeeded is selected ?" + ChangeNeeded.isSelected());
//					WebElement Effective = driver.findElement(By.name("IsDocEffManually"));
//					System.out.println("Effective is selected ?" + Effective.isSelected());
//					// Document Layout Configuration
//					CM.clickonElementbyXpath(EL.eleA4PP_XP, "A4PotraitPreApproved checkbox");
//					CM.clickonElementbyXpath(EL.eleSAVE_XP, "Save");
//					// Associations
//					CM.CheckElementDisplayedbyXpath(EL.eleAssociations_XP, "Associations");
//					CM.clickonElementbyXpath(EL.eleLocatio1_XP, "Location");
//					CM.clickonElementbyXpath(EL.eleDepartment_XP, "Department");
//					CM.clickonElementbyXpath(EL.eleMaterial_XP, "Material");
//					CM.clickonElementbyXpath(EL.eleUser_XP, "User");
//					CM.clickonElementbyXpath(EL.eleAsset1_XP, "Asset");
//					CM.clickonElementbyXpath(EL.eleProduct_XP, "Product");
//					//// Issue Configuration
//					CM.CheckElementDisplayedbyXpath(EL.eleConfiguration_XP, "Issue Configuration Header");
//					CM.CheckElementDisplayedbyXpath(EL.eleIssuable_XP, "Issuable");
//					CM.CheckElementDisplayedbyXpath(EL.eleReturnperiod_XP, "Default Return Period");
//					CM.CheckElementDisplayedbyXpath(EL.eleIssueinmonths_XP, "Issue Doc Archival (In Months)");
//					CM.enteringDataintoTextfiledByXpath(EL.elereturnperiod_XP, "2", "ReviewPeriod");
//					CM.enteringDataintoTextfiledByXpath(EL.eleArvalperi_XP, "3", "ArchivalPeriod");
//					CM.selectValueinDropdownByVisualtextbyXpath(EL.eleIssue_XP, "Yes", "ReviewPeriod");
//					// associations
////							WebElement batchnum = driver.findElement(By.xpath("//a[text()='Batch Number']"));
////							WebElement ARnumber = driver.findElement(By.xpath("//a[text()='AR Number']"));
////							WebElement Product = driver.findElement(By.xpath("//a[text()='Product']"));
////							WebElement Assets = driver.findElement(By.xpath("//a[text()='Asset']"));
////							WebElement Manufacturing = driver.findElement(By.xpath("//a[text()='Manufacturing Date']"));
////							batchnum.click();
////							ARnumber.click();
////							Product.click();
////							Assets.click();
////							Manufacturing.click();
//					// PrintConfiguration
////								CM.clickonElementbyXpath(EL.eleControlled_XP, "Controlled print");  // if click off
//					WebElement controlledprint = driver.findElement(By.name("IsCanControlCopy"));
//					System.out.println("controlledprint is selected ?" + controlledprint.isSelected());
//					// iniciatioin
//					try {
//						CM.clickonElementbyXpath(EL.eleEnableWorkflow_XP, "EnableWorkflow on Iniciate");
//						CM.enteringDataintoTextfiledByXpath(EL.eleLevelName1_XP, "Frist", "LevelName");
//						WebElement Designased = driver.findElement(By.name("IsDesignationBased"));
//						// Designased.click();
//						System.out.println("Designased is selected ?" + Designased.isSelected());
//						if (Designased.isSelected()) {
//							CM.selectValueinDropdownByVisualtextbyXpath(EL.eleApproverRoleId_XP, "QA HOD (QAH1)",
//									"	Designation Based");
//							System.out.println("selected designation based");
//						} else {
//							CM.selectValueinDropdownByVisualtextbyXpath(EL.eleUserbased1_XP, "User Based", "Userbased");
//							System.out.println("selected userbased");
//						}
//					} catch (Exception e) {
//						System.out.println("not able select");
//						System.out.println("Exception : " + e);
//					}
//					// submition
//					try {
//						WebElement SubmissionApproval = driver.findElement(By.name("IsSubmissionApprovalReq"));
//						System.out.println("SubmissionApproval is selected ?" + SubmissionApproval.isSelected());
//					} catch (Exception e) {
//						System.out.println("not able select");
//						System.out.println("Exception : " + e);
//					}
//					WebElement Designased2 = driver.findElement(By.xpath("(//input[@name='IsDesignationBased'])[3]"));
//					// Designased2.click();
//					Thread.sleep(500);
//					System.out.println("Designased is selected ?" + Designased2.isSelected());
//					if (Designased2.isSelected()) {
//						CM.selectValueinDropdownByVisualtextbyXpath(EL.eleReviewerRoleId1_XP, "QA HOD (QAH1)",
//								"Designation Based");
//						System.out.println("selected designation based");
//					} else {
//						CM.selectValueinDropdownByVisualtextbyXpath(EL.eleUserbased2_XP, "User Based", "Userbased");
//						System.out.println("selected userbased");
//					}
//					// Approver
//					// Approver 1
//					WebElement Approver1 = driver
//							.findElement(By.xpath("//tr[@id='tr_Approval_278030_0']//input[@name='IsDesignationBased'][1]"));
//					// Approver1.click();
//					System.out.println("Designased is selected ?" + Approver1.isSelected());
//					Thread.sleep(500);
//					if (Approver1.isSelected()) {
//						CM.selectValueinDropdownByVisualtextbyXpath(EL.eleApprovelrole_XP, "QA HOD (QAH1)",
//								"Designation Based");
//						System.out.println("selected designation based");
//					} else {
//						CM.selectValueinDropdownByVisualtextbyXpath(EL.eleuseR_XP, "User Based", "Userbased");
//						System.out.println("selected userbased");
//					}
//		// Make effective
//					CM.clickonElementbyID(EL.eleEffectiveApproval_XP, "EffectiveApproval");
//					CM.enteringDataintoTextfiledByXpath(EL.eleLevelName_XP, MakeEffectiveLevel1, "LevelName");
//					WebElement Effectivedesig = driver
//							.findElement(By.xpath("//tr[@id='tr_278031_0']//input[@id='IsDesignationBased']"));
////										Effectivedesig.click();
//					Thread.sleep(500);
//					System.out.println("Designased is selected ?" + Effectivedesig.isSelected());
//
//					if (Effectivedesig.isSelected()) {
////													driver.findElement(By.xpath("//div[@class='cr-wrap workflow_278031']//select[@id='_ApproverRoleId_1']")).sendKeys("QA HOD (QAH1)");
//						CM.selectValueinDropdownByVisualtextbyXpath(EL.eleApproverRol3_XP, "QA User (QAU1)",
//								"Designation Based");
//						System.out.println("selected designation based");
//					} else {
//						CM.selectValueinDropdownByVisualtextbyXpath(EL.eleUserbased4_XP, "User Based", "Userbased");
//						System.out.println("selected userbased");
//					}
//		// issue
//					CM.clickonElementbyXpath(EL.eledocissueON_XP, "doc issue ON");// issuebutton
//					WebElement Issuedesibased1 = driver.findElement(By.xpath("//tr[@id='tr_305053_0']/td[4]/input[1]"));
////										Issuedesibased1.click();//designased on
//					System.out.println("Issuedesibased1 is selected ?" + Issuedesibased1.isSelected());
//					if (Issuedesibased1.isSelected()) {
//						CM.selectValueinDropdownByVisualtextbyXpath(EL.eleissueifdesibased_XP, "QA User (QAU1)",
//								"Designation Based");
//					} else {
//						CM.selectValueinDropdownByVisualtextbyXpath(EL.eleissueuserbased_XP, "User Based", "Userbased");
//						System.out.println("selected userbased");
//					}
//					CM.enteringDataintoTextfiledByXpath(EL.eleIssuelevelinput_XP, IssueLevel1, " issue level name");
//					// Control print //1 ////
//					CM.CheckElementDisplayedbyXpath(EL.eleControlprint_XP, "Control print");
//					CM.CheckElementDisplayedbyXpath(EL.eleControlworkflow_XP, "work flow");
//					String table = driver.findElement(By.xpath("//div[@class='cr-wrap workflow_305054']/table/thead/tr"))
//							.getText();
//					System.out.println(table);
//					String conditionheader = driver.findElement(By.xpath("//div[@class='cr-wrap workflow_305054']/div[3]//h2"))
//							.getText();
//					System.out.println(conditionheader);
//					String condition = driver.findElement(By.xpath("//div[@class='cr-wrap workflow_305054']/div[3]")).getText();
//					System.out.println(condition);
//					CM.clickonElementbyXpath(EL.eleControlprintON_XP, "IsCtrlPrintApprovalReq");
//					CM.enteringDataintoTextfiledByXpath(EL.elePrintlevel1_XP, ControlPrintLevel1, "Control print level name");
//					WebElement Control1isdesibased = driver.findElement(By.xpath("//tr[@id='tr_305054_0']/td[4]/input"));
////												Control1isdesibased.click();
//					if (Control1isdesibased.isSelected()) {
//						CM.selectValueinDropdownByVisualtextbyXpath(EL.eleIFdesi1control_XP, "QA User (QAU1)",
//								"Designation Based");
//					} else {
//						CM.selectValueinDropdownByVisualtextbyXpath(EL.eleprintuserbased1_XP, "User Based", "Userbased");
//						System.out.println("selected userbased");
//					}
//					// Reconciliation
//					CM.CheckElementDisplayedbyXpath(EL.eleReconciliation_XP, "Workflow for Document - Reconciliation");
//					CM.CheckElementDisplayedbyXpath(EL.eleReconciationworkfliow_XP, "Reconciliation workflow");
//					CM.clickonElementbyXpath(EL.eleIsReconcillationApprovalReq_XP, "IsReconcillationApprovalReq");
//					String counciation = driver.findElement(By.xpath("//table[@id='tableDoc_Approval_383001_Types']//th"))
//							.getText();
//					CM.CheckElementDisplayedbyXpath(EL.eleRecounConditioFlow_XP, "Conditional work flow");
//					CM.enteringDataintoTextfiledByXpath(EL.eleRecountLevelname1_XP, RecouncilationLevel1, "RecountLevelname");
//					WebElement Reconciliation1isdesibased = driver.findElement(By.xpath("//tr[@id='tr_383001_0']/td[4]/input"));
////									Reconciliation1isdesibased.click();
//					if (Reconciliation1isdesibased.isSelected()) {
//						CM.selectValueinDropdownByVisualtextbyXpath(EL.eleRecounciIfDesibased_XP, "QA User (QAU1)",
//								"Designation Based");
//					} else {
//						CM.selectValueinDropdownByVisualtextbyXpath(EL.eleRecounciUserbased1_XP, "User Based", "Userbased");
//						System.out.println("selected userbased");
//					}
//					// Destuctions
//					CM.CheckElementDisplayedbyXpath(EL.eledestra_XP, "Workflow for Document - Destruction ");
//					CM.clickonElementbyXpath(EL.eledescrict_XP, "IsDestructionApprovalReq");
//					driver.findElement(By.xpath("//tr[@id='tr_383002_0']/td[3]/input")).sendKeys("1");
//
//					WebElement Destuctions1isdesibased = driver.findElement(By.xpath("//tr[@id='tr_383002_0']/td[4]/input[1]"));
////									Destuctions1isdesibased.click();
//					if (Destuctions1isdesibased.isSelected()) {
//						CM.selectValueinDropdownByVisualtextbyXpath(EL.eledisdisignased_XP, "QA User (QAU1)",
//								"Designation Based");
//					} else {
//						CM.selectValueinDropdownByVisualtextbyXpath(EL.eledistuuserbased_XP, "User Based", "Userbased");
//						System.out.println("selected userbased");
//					}
//
//					CM.CheckElementDisplayedbyXpath(EL.eleEffectivedate_XP, "Effectivedate");
//					CM.clickonElementbyXpath(EL.eledatepicker_XP, "datepicker");
//					CM.clickonElementbyXpath(EL.eletoday_XP, "Today date");
//					CM.clickonElementbyXpath(EL.eleSaveE_XP, "Save");
//					CM.CheckElementDisplayedbyXpath(EL.eleActionHEA_XP, "Justification for Action");
//					CM.CheckElementDisplayedbyXpath(EL.elePrefilled_XP, "Prefilled Reason");
//					CM.CheckElementDisplayedbyXpath(EL.eleCustom_XP, "Custom Reason");
//					CM.CheckElementDisplayedbyXpath(EL.eleclose_XP, "CLOSE");
//					CM.selectValueinDropdownselectbyvalueXpath(EL.eleREason_XP, "9", "Prefilled Reason");
//					CM.clickonElementbyXpath(EL.eleSave_XP, "Save");
//					Thread.sleep(500);
//					driver.switchTo().alert().accept();
//					Thread.sleep(2000);
//					// accessgroup
//					CM.clickonElementbyXpath(EL.elemenuicon_XP, "Menu icon");
//					driver.findElement(By.xpath("//div[text()='Admin']")).click();
//					Thread.sleep(5000);
//					driver.findElement(By.xpath("//div[text()='Us']")).click();
//					Thread.sleep(5000);
//					CM.clickonElementbyXpath(EL.eleAccessg_XP, "Access Groups");
//					CM.clickonElementbyXpath(EL.eleAccessgrouptoggle_XP, "Default AccessGroup TOGGLE");
//					CM.clickonElementbyXpath(EL.eleEditAccess_XP, "Edit");
//					CM.clickonElementbyXpath(EL.elepermissions_XP, "Permissions");
//					CM.clickonElementbyXpath(EL.eleDocuments_XP, "Documents");// input[@id='chkSiteMapAll_1']
//					driver.findElement(By.xpath("//label[text()='Analytical']/parent::b")).isDisplayed();
//					driver.findElement(By.xpath("//label[text()='Analytical']/parent::b/parent::td/input[1]")).click();
//					CM.clickonElementbyXpath(EL.eleAssSave_XP, "Save");
//					CM.CheckElementDisplayedbyXpath(EL.eleActionHEA_XP, "Justification for Action");
//					CM.CheckElementDisplayedbyXpath(EL.elePrefilled_XP, "Prefilled Reason");
//					CM.CheckElementDisplayedbyXpath(EL.eleCustom_XP, "Custom Reason");
//					CM.CheckElementDisplayedbyXpath(EL.eleclose_XP, "CLOSE");
//					CM.selectValueinDropdownselectbyvalueXpath(EL.eleREason_XP, "9", "Prefilled Reason");
//					CM.clickonElementbyXpath(EL.eleSave_XP, "Save");
//					Thread.sleep(3000);
//					driver.switchTo().alert().accept();
//				}

	public void Documentinitiate() throws InterruptedException, AWTException, IOException {
		excelinputDdata = new HashMap<>();
		FileInputStream file = new FileInputStream("C:\\Users\\SSD\\Documents\\Type creation.xlsx");
		XSSFWorkbook Workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = Workbook.getSheet("Sheet5");
		int rowcount = sheet.getLastRowNum();
		for (int j = 1; j <= rowcount; j++) {
			XSSFRow row = sheet.getRow(j);
			String Type = row.getCell(0).getStringCellValue();
			String Title = row.getCell(1).getStringCellValue();
			String DocNumber = row.getCell(2).getStringCellValue();
			String DocOrgID = row.getCell(3).getStringCellValue();
			String displayNumber = row.getCell(4).getStringCellValue();
			String DocDiscription = row.getCell(5).getStringCellValue();
			String Version = row.getCell(6).getStringCellValue();
			String AssociatedDocTypeName = row.getCell(7).getStringCellValue();
			String AssociatedDocmentTitle = row.getCell(8).getStringCellValue();
			String AssociatedDocumentNumber = row.getCell(9).getStringCellValue();
			String AssociatedDocumentOrgID = row.getCell(10).getStringCellValue();
			String AssociateddocVesion = row.getCell(11).getStringCellValue();
			String AssociatedDiscription = row.getCell(12).getStringCellValue();
			String Changecontrolnumber = row.getCell(13).getStringCellValue();
			String ChangeDiscription = row.getCell(14).getStringCellValue();
			String NonSignatory = row.getCell(15).getStringCellValue();
			String NonSignatoryNAME = row.getCell(16).getStringCellValue();
			String Reviewer1 = row.getCell(17).getStringCellValue();
			String Reviewer1username = row.getCell(18).getStringCellValue();
			String Reviewer2 = row.getCell(19).getStringCellValue();
			String Reviewer2username = row.getCell(20).getStringCellValue();
			String Password = row.getCell(21).getStringCellValue();
			String Material = row.getCell(22).getStringCellValue();
			String Asset = row.getCell(23).getStringCellValue();
			String User = row.getCell(24).getStringCellValue();
			String Products = row.getCell(25).getStringCellValue();
			String initiatedBy = row.getCell(26).getStringCellValue();
			String ApprovalType = row.getCell(27).getStringCellValue();
			String Category = row.getCell(28).getStringCellValue();
			String Subcategory = row.getCell(29).getStringCellValue();
			String NonsignatoryRemarks = row.getCell(30).getStringCellValue();
			String Decision1 = row.getCell(31).getStringCellValue();
			String Decision2 = row.getCell(32).getStringCellValue();
			String Decision3 = row.getCell(33).getStringCellValue();
			

			String initiatorusername = row.getCell(34).getStringCellValue();
			String asset = row.getCell(35).getStringCellValue();
			String Productss = row.getCell(36).getStringCellValue();
			String TrainingID = row.getCell(37).getStringCellValue();
			String TrainingDiscription = row.getCell(38).getStringCellValue();
			String EffectiveDecision1 = row.getCell(39).getStringCellValue();
			String IssuedocDecision = row.getCell(40).getStringCellValue();
			String Nonsignatory = row.getCell(41).getStringCellValue();
			String Re1 = row.getCell(42).getStringCellValue();
			String Re2 = row.getCell(43).getStringCellValue();
			String Ap1 = row.getCell(44).getStringCellValue();
			String Ap2 = row.getCell(45).getStringCellValue();
			String Nonsignatoryusername = row.getCell(46).getStringCellValue();
			String Re1name = row.getCell(47).getStringCellValue();
			String Re2name = row.getCell(48).getStringCellValue();
			String Ap1name = row.getCell(49).getStringCellValue();
			String Ap2name = row.getCell(50).getStringCellValue();
			String Decision4 = row.getCell(51).getStringCellValue();
			String Decision5 = row.getCell(52).getStringCellValue();
			

		
			Thread.sleep(2000);
			CM.clickonElementbyXpath(EL.eleInitiate_XP, "Initiate");
			Thread.sleep(3000);
			CM.selectValueinDropdownByVisualtextbyXpath(EL.eleAddtype_XP, Type, "Addtype");
			CM.enteringDataintoTextfiledByXpath(EL.eletxtTitle_XP, Title, "txtTitle_1");
			Thread.sleep(500);
			WebElement DOCNUM = driver.findElement(By.xpath("//input[@id='txtIsNumberingAutoOrManual_1']"));
			if (DOCNUM.isEnabled()) {
				CM.enteringDataintoTextfiledByXpath(EL.eleDocNumber_XP, DocNumber, "Document number");
				Thread.sleep(3000);
			} else {
				System.out.println("doc number disabled");
			}
			WebElement ORGID = driver.findElement(By.xpath("//input[@id='txtNumber_1']"));
			if (ORGID.isEnabled()) {
				CM.enteringDataintoTextfiledByXpath(EL.eletxtNumber_XP, DocOrgID, "org id");
				Thread.sleep(3000);
			} else {
				System.out.println("doc number disabled");
			}
			CM.enteringDataintoTextfiledByXpath(EL.eleVersionNo_XP, Version, "txtVersionNo_1");
			Thread.sleep(1000);
			try {
				WebElement location = driver.findElement(By.xpath("//div[text()='Location']"));
				if (location.isDisplayed()) {
					location.click();
					Thread.sleep(1500);
					WebElement ele = driver.findElement(By.xpath("//div[text()='Unit-I']"));
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

			} catch (Exception e) {
				System.out.println("associations not selected");
			}
			CM.clickonElementbyXpath(EL.eleSaVe_XP, "Save");
			Thread.sleep(500);
			CM.selectValueinDropdownselectbyvalueXpath(EL.eledoclayoutp_XP, "1", "Select docu Lyout");
			CM.enteringDataintoTextfiledByXpath(EL.eleDescriptions1_XP, DocDiscription, "Description");
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
					CM.enteringDataintoTextfiledByXpath(EL.eledoccahan_XP, Changecontrolnumber,
							"Change control number");
					CM.enteringDataintoTextfiledByXpath(EL.eleDescript_XP, ChangeDiscription,
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
						CM.selectValueinDropdownByVisualtextbyXpath(EL.eleAddtype2_XP, AssociatedDocTypeName,
								"Addtype2");
						CM.enteringDataintoTextfiledByXpath(EL.eleTitle2_XP, AssociatedDocmentTitle, "txtTitle_1");
						WebElement DOCNUM2 = driver
								.findElement(By.xpath("//input[@id='txtIsNumberingAutoOrManual_2']"));
						if (DOCNUM2.isEnabled()) {
							CM.enteringDataintoTextfiledByXpath(EL.elenumber2_XP, AssociatedDocumentNumber, "Number 2");
						} else {
							System.out.println("doc number disabled");
						}
						Thread.sleep(500);
						WebElement ORGID2 = driver.findElement(By.xpath("//input[@id='txtNumber_2']"));
						if (ORGID2.isEnabled()) {

							CM.enteringDataintoTextfiledByXpath(EL.eleorg2_XP, AssociatedDocumentOrgID, "ORG id 2");
							Thread.sleep(500);
						} else {
							System.out.println("doc number disabled");
						}
						Thread.sleep(500);
						CM.enteringDataintoTextfiledByXpath(EL.eleversion2_XP, AssociateddocVesion, "txtVersionNo_1");
						CM.selectValueinDropdownselectbyvalueXpath(EL.elelayout2_XP, "1", "Select docu Lyout");
						CM.enteringDataintoTextfiledByXpath(EL.eleDescrip2_XP, AssociatedDiscription, "Description");
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
							System.out.println("primary document" + AssociatedDocTypeName);
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
			
			
			
			CM.selectValueinDropdownByVisualtextbyXpath(EL.eleNonsignatory1_XP, Nonsignatory, "Reviewer1");
			Thread.sleep(300);
			CM.selectValueinDropdownByVisualtextbyXpath(EL.eleApproverUserId2_XP, Re1, "Reviewer2");
			Thread.sleep(300);
			CM.selectValueinDropdownByVisualtextbyXpath(EL.eleApproverUserId3_XP, Re2, "Reviewer3");
			Thread.sleep(300);
			CM.selectValueinDropdownByVisualtextbyXpath(EL.eleApproverUserId4_XP, Ap1, "Approver1");
			Thread.sleep(300);
			CM.selectValueinDropdownByVisualtextbyXpath(EL.eleApproverUserId5_XP, Ap2, "Approver2");
			Thread.sleep(300);
			
			
	
//			String Reviewer9 ="appala.naidu";
//			CM.selectValueinDropdownByVisualtextbyXpath(EL.eleNonsignatory1_XP, Reviewers1, "Non signatory Reviewer");
//			CM.selectValueinDropdownByVisualtextbyXpath(EL.eleApproverUserId2_XP, Reviewers2, "Reviewer1");
//			CM.selectValueinDropdownByVisualtextbyXpath(EL.eleApproverUserId3_XP, Reviewer3, "Reviewer2");
//			CM.selectValueinDropdownByVisualtextbyXpath(EL.eleApproverUserId4_XP, Reviewer4, "Approver1");
//			CM.selectValueinDropdownByVisualtextbyXpath(EL.eleApproverUserId5_XP, Reviewer5, "Approver2");
//			CM.selectValueinDropdownByVisualtextbyXpath(EL.eleApproverUserId6_XP, Reviewer2, "Reviewer2");
//			CM.selectValueinDropdownByVisualtextbyXpath(EL.eleApproverUserId7_XP, Reviewer2, "Reviewer2");
//			CM.selectValueinDropdownByVisualtextbyXpath(EL.eleApproverUserId8_XP, Reviewer2, "Reviewer2");
//			CM.selectValueinDropdownByVisualtextbyXpath(EL.eleApproverUserId9_XP, Reviewer2, "Reviewer2");
			CM.clickonElementbyXpath(EL.elesubmitapprover_XP, "Submit iniciate");
			Thread.sleep(3000);
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

			CM.clickonElementbyXpath(EL.eleUsersetting_XP, "USER SETTINGS");
			Thread.sleep(500);
			CM.clickonElementbyXpath(EL.eleLogout_XP, "Log out");
			Thread.sleep(100);
			CM.enteringDataintoTextfiledByXpath(EL.eleUserName_XP, Nonsignatoryusername, " Non signatory user");
			CM.enteringDataintoTextfiledByXpath(EL.elePassword_XP, Password, "Password");
			CM.clickonElementbyXpath(EL.eleLogin_XP, "LOGIN");
			Thread.sleep(2000);

			try {
				WebElement number2 = driver.findElement(By.xpath(" //span[text()=' " + displayNumber + " ']"));
				number2.click();
				System.out.println("numbar is displayed");
			} catch (Exception e) {
				System.out.println("numbar is not displayed");
				System.out.println("Exception:" + e);
			}
			Thread.sleep(2000);
			CM.enteringDataintoTextfiledByXpath(EL.eleRemarksinput_XP, NonsignatoryRemarks, " Reviewer1remarks");

			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//select[@id='Decision']")));
			try {
				wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(
						By.xpath("//select[@id='Decision']")));
				Select select2 = new Select(
						driver.findElement(By.xpath("//select[@id='Decision']")));
				select2.selectByVisibleText(Decision1);
				
			} catch (StaleElementReferenceException e) {
				wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(
						By.xpath("//select[@id='Decision']")));
				Select select2 = new Select(
						driver.findElement(By.xpath("//select[@id='Decision']")));
				select2.selectByVisibleText(Decision1);
			
			}
			if (Decision1.equals("Approve")) {
				System.out.println("Non Signatory Submission flow  Approved");
				Thread.sleep(2000);
				CM.clickonElementbyXpath(EL.elebtnComplete_XP, "Complete");
				driver.switchTo().alert().accept();
				Thread.sleep(2000);
				driver.switchTo().alert().accept();
				Thread.sleep(2000);
				CM.clickonElementbyXpath(EL.eleUsersetting_XP, "USER SETTINGS");
				Thread.sleep(300);
				CM.clickonElementbyXpath(EL.eleLogout_XP, "Log out");
				Thread.sleep(200);
				CM.enteringDataintoTextfiledByXpath(EL.eleUserName_XP, Re1name, " Non signatory user");
				CM.enteringDataintoTextfiledByXpath(EL.elePassword_XP, Password, "Password");
				CM.clickonElementbyXpath(EL.eleLogin_XP, "LOGIN");
				Thread.sleep(5000);
			

				try {
					WebElement number2 = driver.findElement(By.xpath(" //span[text()=' " + displayNumber + " ']"));
					number2.click();
					System.out.println("numbar is displayed");
				} catch (Exception e) {
					System.out.println("numbar is not displayed");
					System.out.println("Exception:" + e);
				}
				Thread.sleep(2000);
				CM.enteringDataintoTextfiledByXpath(EL.eleRemarksinput_XP, NonsignatoryRemarks, " Reviewer1remarks");

				wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//select[@id='Decision']")));
//				Select select = new Select(driver.findElement(By.xpath("//select[@id='Decision']")));
				try {
					wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(
							By.xpath("//select[@id='Decision']")));
					Select select2 = new Select(
							driver.findElement(By.xpath("//select[@id='Decision']")));
					select2.selectByVisibleText(Decision2);
					
				} catch (StaleElementReferenceException e) {
					wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(
							By.xpath("//select[@id='Decision']")));
					Select select2 = new Select(
							driver.findElement(By.xpath("//select[@id='Decision']")));
					select2.selectByVisibleText(Decision2);
				
				}
				if (Decision2.equals("Approve")) {
					
					System.out.println("Non Signatory Submission flow  Approved");
					CM.clickonElementbyXpath(EL.elebtnComplete_XP, "Complete");
					driver.switchTo().alert().accept();
					Thread.sleep(2000);
					driver.switchTo().alert().accept();
					Thread.sleep(2000);
					CM.clickonElementbyXpath(EL.eleUsersetting_XP, "USER SETTINGS");
					Thread.sleep(300);
					CM.clickonElementbyXpath(EL.eleLogout_XP, "Log out");
					Thread.sleep(200);
					CM.enteringDataintoTextfiledByXpath(EL.eleUserName_XP, Re2name, " Non signatory user");
					CM.enteringDataintoTextfiledByXpath(EL.elePassword_XP, Password, "Password");
					CM.clickonElementbyXpath(EL.eleLogin_XP, "LOGIN");
					Thread.sleep(2000);
					try {
						WebElement number2 = driver.findElement(By.xpath(" //span[text()=' " + displayNumber + " ']"));
						number2.click();
						System.out.println("numbar is displayed");
					} catch (Exception e) {
						System.out.println("numbar is not displayed");
						System.out.println("Exception:" + e);
					}
					Thread.sleep(2000);
					CM.enteringDataintoTextfiledByXpath(EL.eleRemarksinput_XP, NonsignatoryRemarks, " Reviewer1remarks");

					wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//select[@id='Decision']")));
//					Select select = new Select(driver.findElement(By.xpath("//select[@id='Decision']")));
					try {
						wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(
								By.xpath("//select[@id='Decision']")));
						Select select2 = new Select(
								driver.findElement(By.xpath("//select[@id='Decision']")));
						select2.selectByVisibleText(Decision3);
						
					} catch (StaleElementReferenceException e) {
						wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(
								By.xpath("//select[@id='Decision']")));
						Select select2 = new Select(
								driver.findElement(By.xpath("//select[@id='Decision']")));
						select2.selectByVisibleText(Decision3);
					
					}
					if (Decision3.equals("Approve")) {
						
						System.out.println("Non Signatory Submission flow  Approved");
						CM.clickonElementbyXpath(EL.elebtnComplete_XP, "Complete");
						driver.switchTo().alert().accept();
						Thread.sleep(2000);
						driver.switchTo().alert().accept();
						Thread.sleep(2000);
						CM.clickonElementbyXpath(EL.eleUsersetting_XP, "USER SETTINGS");
						Thread.sleep(300);
						CM.clickonElementbyXpath(EL.eleLogout_XP, "Log out");
						Thread.sleep(200);
						CM.enteringDataintoTextfiledByXpath(EL.eleUserName_XP, Ap1name, " Non signatory user");
						CM.enteringDataintoTextfiledByXpath(EL.elePassword_XP, Password, "Password");
						CM.clickonElementbyXpath(EL.eleLogin_XP, "LOGIN");
						Thread.sleep(2000);
						try {
							WebElement number2 = driver.findElement(By.xpath(" //span[text()=' " + displayNumber + " ']"));
							number2.click();
							System.out.println("numbar is displayed");
						} catch (Exception e) {
							System.out.println("numbar is not displayed");
							System.out.println("Exception:" + e);
						}
						Thread.sleep(2000);
						CM.enteringDataintoTextfiledByXpath(EL.eleRemarksinput_XP, NonsignatoryRemarks, " Reviewer1remarks");

						wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//select[@id='Decision']")));
//						Select select = new Select(driver.findElement(By.xpath("//select[@id='Decision']")));
						try {
							wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(
									By.xpath("//select[@id='Decision']")));
							Select select2 = new Select(
									driver.findElement(By.xpath("//select[@id='Decision']")));
							select2.selectByVisibleText(Decision4);
							
						} catch (StaleElementReferenceException e) {
							wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(
									By.xpath("//select[@id='Decision']")));
							Select select2 = new Select(
									driver.findElement(By.xpath("//select[@id='Decision']")));
							select2.selectByVisibleText(Decision4);
						
						}
						if (Decision4.equals("Approve")) {
							
							System.out.println("Non Signatory Submission flow  Approved");
							CM.clickonElementbyXpath(EL.elebtnComplete_XP, "Complete");
							driver.switchTo().alert().accept();
							Thread.sleep(2000);
							driver.switchTo().alert().accept();
							Thread.sleep(2000);
							CM.clickonElementbyXpath(EL.eleUsersetting_XP, "USER SETTINGS");
							Thread.sleep(300);
							CM.clickonElementbyXpath(EL.eleLogout_XP, "Log out");
							Thread.sleep(200);
							CM.enteringDataintoTextfiledByXpath(EL.eleUserName_XP, Ap2name, " Non signatory user");
							CM.enteringDataintoTextfiledByXpath(EL.elePassword_XP, Password, "Password");
							CM.clickonElementbyXpath(EL.eleLogin_XP, "LOGIN");
							Thread.sleep(2000);
							try {
								WebElement number2 = driver.findElement(By.xpath(" //span[text()=' " + displayNumber + " ']"));
								number2.click();
								System.out.println("numbar is displayed");
							} catch (Exception e) {
								System.out.println("numbar is not displayed");
								System.out.println("Exception:" + e);
							}
							Thread.sleep(2000);
							CM.enteringDataintoTextfiledByXpath(EL.eleRemarksinput_XP, NonsignatoryRemarks, " Reviewer1remarks");

							wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//select[@id='Decision']")));
//							Select select = new Select(driver.findElement(By.xpath("//select[@id='Decision']")));
							try {
								wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(
										By.xpath("//select[@id='Decision']")));
								Select select2 = new Select(
										driver.findElement(By.xpath("//select[@id='Decision']")));
								select2.selectByVisibleText(Decision5);
								
							} catch (StaleElementReferenceException e) {
								wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(
										By.xpath("//select[@id='Decision']")));
								Select select2 = new Select(
										driver.findElement(By.xpath("//select[@id='Decision']")));
								select2.selectByVisibleText(Decision5);
							
							}
							if (Decision5.equals("Approve")) {
								
								System.out.println("Non Signatory Submission flow  Approved");
								CM.clickonElementbyXpath(EL.elebtnComplete_XP, "Complete");
								driver.switchTo().alert().accept();
								Thread.sleep(2000);
								driver.switchTo().alert().accept();
								Thread.sleep(2000);
								CM.clickonElementbyXpath(EL.eleUsersetting_XP, "USER SETTINGS");
								Thread.sleep(300);
								CM.clickonElementbyXpath(EL.eleLogout_XP, "Log out");
								Thread.sleep(200);
								CM.enteringDataintoTextfiledByXpath(EL.eleUserName_XP,
										initiatorusername, " UserName");
								CM.enteringDataintoTextfiledByXpath(EL.elePassword_XP, Password,
										"Password");
								CM.clickonElementbyXpath(EL.eleLogin_XP, "LOGIN");
								Thread.sleep(2000);
								CM.clickonElementbyXpath(EL.elemenuicon_XP, "Menu icon");
								try {
									driver.findElement(By.xpath("//div[text()='Documents']"))
											.click();
									Thread.sleep(4000);
								} catch (StaleElementReferenceException e) {
									driver.findElement(By.xpath("//div[text()='Documents']"))
											.click();
								}
								try {
									driver.findElement(By.xpath("//div[text()='An']")).click();
								} catch (StaleElementReferenceException e) {
									driver.findElement(By.xpath("//div[text()='An']")).click();
								}
								
							}else if(Decision5.equals("Reject")) {
								
								CM.clickonElementbyXpath(EL.elebtnComplete_XP, "Complete");
								driver.switchTo().alert().accept();
								Thread.sleep(2000);
								driver.switchTo().alert().accept();
								Thread.sleep(2000);
								CM.clickonElementbyXpath(EL.eleUsersetting_XP, "USER SETTINGS");
								Thread.sleep(300);
								CM.clickonElementbyXpath(EL.eleLogout_XP, "Log out");
								Thread.sleep(200);
								CM.enteringDataintoTextfiledByXpath(EL.eleUserName_XP,
										initiatorusername, " UserName");
								CM.enteringDataintoTextfiledByXpath(EL.elePassword_XP, Password,
										"Password");
								CM.clickonElementbyXpath(EL.eleLogin_XP, "LOGIN");
								Thread.sleep(5000);
								CM.clickonElementbyXpath(EL.elemenuicon_XP, "Menu icon");
								try {
									driver.findElement(By.xpath("//div[text()='Documents']"))
											.click();
									Thread.sleep(4000);
								} catch (StaleElementReferenceException e) {
									driver.findElement(By.xpath("//div[text()='Documents']"))
											.click();
								}
								try {
									driver.findElement(By.xpath("//div[text()='An']")).click();
								} catch (StaleElementReferenceException e) {
									driver.findElement(By.xpath("//div[text()='An']")).click();
								}
								
							}else if(Decision5.equals("Resubmit")) {
								
								CM.clickonElementbyXpath(EL.elebtnComplete_XP, "Complete");
								driver.switchTo().alert().accept();
								Thread.sleep(2000);
								driver.switchTo().alert().accept();
								Thread.sleep(2000);
								CM.clickonElementbyXpath(EL.eleUsersetting_XP, "USER SETTINGS");
								Thread.sleep(300);
								CM.clickonElementbyXpath(EL.eleLogout_XP, "Log out");
								Thread.sleep(200);
								CM.enteringDataintoTextfiledByXpath(EL.eleUserName_XP,
										initiatorusername, " UserName");
								CM.enteringDataintoTextfiledByXpath(EL.elePassword_XP, Password,
										"Password");
								CM.clickonElementbyXpath(EL.eleLogin_XP, "LOGIN");
								Thread.sleep(2000);
								CM.clickonElementbyXpath(EL.elemenuicon_XP, "Menu icon");
								try {
									driver.findElement(By.xpath("//div[text()='Documents']"))
											.click();
									Thread.sleep(4000);
								} catch (StaleElementReferenceException e) {
									driver.findElement(By.xpath("//div[text()='Documents']"))
											.click();
								}
								try {
									driver.findElement(By.xpath("//div[text()='An']")).click();
								} catch (StaleElementReferenceException e) {
									driver.findElement(By.xpath("//div[text()='An']")).click();
								}
								
							}		
					
						}else if(Decision4.equals("Reject")) {
							
							CM.clickonElementbyXpath(EL.elebtnComplete_XP, "Complete");
							driver.switchTo().alert().accept();
							Thread.sleep(2000);
							driver.switchTo().alert().accept();
							Thread.sleep(2000);
							CM.clickonElementbyXpath(EL.eleUsersetting_XP, "USER SETTINGS");
							Thread.sleep(300);
							CM.clickonElementbyXpath(EL.eleLogout_XP, "Log out");
							Thread.sleep(200);
							CM.enteringDataintoTextfiledByXpath(EL.eleUserName_XP,
									initiatorusername, " UserName");
							CM.enteringDataintoTextfiledByXpath(EL.elePassword_XP, Password,
									"Password");
							CM.clickonElementbyXpath(EL.eleLogin_XP, "LOGIN");
							Thread.sleep(5000);
							CM.clickonElementbyXpath(EL.elemenuicon_XP, "Menu icon");
							try {
								driver.findElement(By.xpath("//div[text()='Documents']"))
										.click();
								Thread.sleep(4000);
							} catch (StaleElementReferenceException e) {
								driver.findElement(By.xpath("//div[text()='Documents']"))
										.click();
							}
							try {
								driver.findElement(By.xpath("//div[text()='An']")).click();
							} catch (StaleElementReferenceException e) {
								driver.findElement(By.xpath("//div[text()='An']")).click();
							}
							
						}else if(Decision4.equals("Resubmit")) {
							
							CM.clickonElementbyXpath(EL.elebtnComplete_XP, "Complete");
							driver.switchTo().alert().accept();
							Thread.sleep(2000);
							driver.switchTo().alert().accept();
							Thread.sleep(2000);
							CM.clickonElementbyXpath(EL.eleUsersetting_XP, "USER SETTINGS");
							Thread.sleep(300);
							CM.clickonElementbyXpath(EL.eleLogout_XP, "Log out");
							Thread.sleep(200);
							CM.enteringDataintoTextfiledByXpath(EL.eleUserName_XP,
									initiatorusername, " UserName");
							CM.enteringDataintoTextfiledByXpath(EL.elePassword_XP, Password,
									"Password");
							CM.clickonElementbyXpath(EL.eleLogin_XP, "LOGIN");
							Thread.sleep(5000);
							CM.clickonElementbyXpath(EL.elemenuicon_XP, "Menu icon");
							try {
								driver.findElement(By.xpath("//div[text()='Documents']"))
										.click();
								Thread.sleep(4000);
							} catch (StaleElementReferenceException e) {
								driver.findElement(By.xpath("//div[text()='Documents']"))
										.click();
							}
							try {
								driver.findElement(By.xpath("//div[text()='An']")).click();
							} catch (StaleElementReferenceException e) {
								driver.findElement(By.xpath("//div[text()='An']")).click();
							}
							
						}		
							
						
						
						
						
					}else if(Decision3.equals("Reject")) {
						Thread.sleep(2000);
						CM.clickonElementbyXpath(EL.elebtnComplete_XP, "Complete");
						driver.switchTo().alert().accept();
						Thread.sleep(2000);
						driver.switchTo().alert().accept();
						Thread.sleep(2000);
						CM.clickonElementbyXpath(EL.eleUsersetting_XP, "USER SETTINGS");
						Thread.sleep(300);
						CM.clickonElementbyXpath(EL.eleLogout_XP, "Log out");
						Thread.sleep(200);
						CM.enteringDataintoTextfiledByXpath(EL.eleUserName_XP,
								initiatorusername, " UserName");
						CM.enteringDataintoTextfiledByXpath(EL.elePassword_XP, Password,
								"Password");
						CM.clickonElementbyXpath(EL.eleLogin_XP, "LOGIN");
						Thread.sleep(5000);
						CM.clickonElementbyXpath(EL.elemenuicon_XP, "Menu icon");
						try {
							driver.findElement(By.xpath("//div[text()='Documents']"))
									.click();
							Thread.sleep(4000);
						} catch (StaleElementReferenceException e) {
							driver.findElement(By.xpath("//div[text()='Documents']"))
									.click();
						}
						try {
							driver.findElement(By.xpath("//div[text()='An']")).click();
						} catch (StaleElementReferenceException e) {
							driver.findElement(By.xpath("//div[text()='An']")).click();
						}
						
					}else if(Decision3.equals("Resubmit")) {
						Thread.sleep(2000);
						CM.clickonElementbyXpath(EL.elebtnComplete_XP, "Complete");
						driver.switchTo().alert().accept();
						Thread.sleep(2000);
						driver.switchTo().alert().accept();
						Thread.sleep(2000);
						CM.clickonElementbyXpath(EL.eleUsersetting_XP, "USER SETTINGS");
						Thread.sleep(300);
						CM.clickonElementbyXpath(EL.eleLogout_XP, "Log out");
						Thread.sleep(200);
						CM.enteringDataintoTextfiledByXpath(EL.eleUserName_XP,
								initiatorusername, " UserName");
						CM.enteringDataintoTextfiledByXpath(EL.elePassword_XP, Password,
								"Password");
						CM.clickonElementbyXpath(EL.eleLogin_XP, "LOGIN");
						Thread.sleep(15000);
						CM.clickonElementbyXpath(EL.elemenuicon_XP, "Menu icon");
						try {
							driver.findElement(By.xpath("//div[text()='Documents']"))
									.click();
							Thread.sleep(4000);
						} catch (StaleElementReferenceException e) {
							driver.findElement(By.xpath("//div[text()='Documents']"))
									.click();
						}
						try {
							driver.findElement(By.xpath("//div[text()='An']")).click();
						} catch (StaleElementReferenceException e) {
							driver.findElement(By.xpath("//div[text()='An']")).click();
						}
						
					}			
					
					
					
					
				}else if(Decision2.equals("Reject")) {
					Thread.sleep(2000);
					CM.clickonElementbyXpath(EL.elebtnComplete_XP, "Complete");
					driver.switchTo().alert().accept();
					Thread.sleep(2000);
					driver.switchTo().alert().accept();
					Thread.sleep(2000);
					CM.clickonElementbyXpath(EL.eleUsersetting_XP, "USER SETTINGS");
					Thread.sleep(300);
					CM.clickonElementbyXpath(EL.eleLogout_XP, "Log out");
					Thread.sleep(300);
					CM.enteringDataintoTextfiledByXpath(EL.eleUserName_XP,
							initiatorusername, " UserName");
					CM.enteringDataintoTextfiledByXpath(EL.elePassword_XP, Password,
							"Password");
					CM.clickonElementbyXpath(EL.eleLogin_XP, "LOGIN");
					Thread.sleep(15000);
					CM.clickonElementbyXpath(EL.elemenuicon_XP, "Menu icon");
					try {
						driver.findElement(By.xpath("//div[text()='Documents']"))
								.click();
						Thread.sleep(4000);
					} catch (StaleElementReferenceException e) {
						driver.findElement(By.xpath("//div[text()='Documents']"))
								.click();
					}
					try {
						driver.findElement(By.xpath("//div[text()='An']")).click();
					} catch (StaleElementReferenceException e) {
						driver.findElement(By.xpath("//div[text()='An']")).click();
					}
					
				}else if(Decision2.equals("Resubmit")) {
					Thread.sleep(2000);
					CM.clickonElementbyXpath(EL.elebtnComplete_XP, "Complete");
					driver.switchTo().alert().accept();
					Thread.sleep(2000);
					driver.switchTo().alert().accept();
					Thread.sleep(2000);
					CM.clickonElementbyXpath(EL.eleUsersetting_XP, "USER SETTINGS");
					Thread.sleep(300);
					CM.clickonElementbyXpath(EL.eleLogout_XP, "Log out");
					Thread.sleep(200);
					CM.enteringDataintoTextfiledByXpath(EL.eleUserName_XP,
							initiatorusername, " UserName");
					CM.enteringDataintoTextfiledByXpath(EL.elePassword_XP, Password,
							"Password");
					CM.clickonElementbyXpath(EL.eleLogin_XP, "LOGIN");
					Thread.sleep(15000);
					CM.clickonElementbyXpath(EL.elemenuicon_XP, "Menu icon");
					try {
						driver.findElement(By.xpath("//div[text()='Documents']"))
								.click();
						Thread.sleep(4000);
					} catch (StaleElementReferenceException e) {
						driver.findElement(By.xpath("//div[text()='Documents']"))
								.click();
					}
					try {
						driver.findElement(By.xpath("//div[text()='An']")).click();
					} catch (StaleElementReferenceException e) {
						driver.findElement(By.xpath("//div[text()='An']")).click();
					}
					
				}			
			}else if(Decision1.equals("Reject")) {
				Thread.sleep(2000);
				CM.clickonElementbyXpath(EL.elebtnComplete_XP, "Complete");
				driver.switchTo().alert().accept();
				Thread.sleep(2000);
				driver.switchTo().alert().accept();
				Thread.sleep(2000);
				CM.clickonElementbyXpath(EL.eleUsersetting_XP, "USER SETTINGS");
				Thread.sleep(300);
				CM.clickonElementbyXpath(EL.eleLogout_XP, "Log out");
				Thread.sleep(200);
				CM.enteringDataintoTextfiledByXpath(EL.eleUserName_XP,
						initiatorusername, " UserName");
				CM.enteringDataintoTextfiledByXpath(EL.elePassword_XP, Password,
						"Password");
				CM.clickonElementbyXpath(EL.eleLogin_XP, "LOGIN");
				Thread.sleep(15000);
				CM.clickonElementbyXpath(EL.elemenuicon_XP, "Menu icon");
				try {
					driver.findElement(By.xpath("//div[text()='Documents']"))
							.click();
					Thread.sleep(4000);
				} catch (StaleElementReferenceException e) {
					driver.findElement(By.xpath("//div[text()='Documents']"))
							.click();
				}
				try {
					driver.findElement(By.xpath("//div[text()='An']")).click();
				} catch (StaleElementReferenceException e) {
					driver.findElement(By.xpath("//div[text()='An']")).click();
				}
				
			}else if(Decision1.equals("Resubmit")) {
				CM.clickonElementbyXpath(EL.elebtnComplete_XP, "Complete");
				Thread.sleep(2000);
				driver.switchTo().alert().accept();
				Thread.sleep(2000);
				driver.switchTo().alert().accept();
				Thread.sleep(2000);
				CM.clickonElementbyXpath(EL.eleUsersetting_XP, "USER SETTINGS");
				Thread.sleep(300);
				CM.clickonElementbyXpath(EL.eleLogout_XP, "Log out");
				Thread.sleep(200);
				CM.enteringDataintoTextfiledByXpath(EL.eleUserName_XP,
						initiatorusername, " UserName");
				CM.enteringDataintoTextfiledByXpath(EL.elePassword_XP, Password,
						"Password");
				CM.clickonElementbyXpath(EL.eleLogin_XP, "LOGIN");
				Thread.sleep(5000);
				CM.clickonElementbyXpath(EL.elemenuicon_XP, "Menu icon");
				try {
					driver.findElement(By.xpath("//div[text()='Documents']"))
							.click();
					Thread.sleep(4000);
				} catch (StaleElementReferenceException e) {
					driver.findElement(By.xpath("//div[text()='Documents']"))
							.click();
				}
				try {
					driver.findElement(By.xpath("//div[text()='An']")).click();
				} catch (StaleElementReferenceException e) {
					driver.findElement(By.xpath("//div[text()='An']")).click();
				}
				
			}
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
//
//				try {
//					WebElement number2 = driver.findElement(By.xpath(" //span[text()=' " + displayNumber + " ']"));
//					number2.click();
//					System.out.println("numbar is displayed");
//				} catch (Exception e) {
//					System.out.println("numbar is not displayed");
//					System.out.println("Exception:" + e);
//				}
//
//				CM.enteringDataintoTextfiledByXpath(EL.eleRemarksinput_XP, NonsignatoryRemarks, " Reviewer1remarks");
//				try {
//					select.selectByVisibleText(Decision2);
//				} catch (StaleElementReferenceException e) {
//					Select select2 = new Select(driver.findElement(By.xpath("//select[@id='Decision']")));
//					select2.selectByVisibleText(Decision2);
//					Thread.sleep(3000);
//
//				}
//
//				if (Decision2.equals("Approve")) {
//					System.out.println(" Reviewer submission flow Approved");
//					CM.clickonElementbyXpath(EL.elebtnComplete_XP, "Complete");
//					driver.switchTo().alert().accept();
//					Thread.sleep(2000);
//					driver.switchTo().alert().accept();
//					Thread.sleep(2000);
//					CM.clickonElementbyXpath(EL.eleUsersetting_XP, "USER SETTINGS");
//					Thread.sleep(500);
//					CM.clickonElementbyXpath(EL.eleLogout_XP, "Log out");
//					Thread.sleep(500);
//					CM.enteringDataintoTextfiledByXpath(EL.eleUserName_XP, Reviewer2username, " Non signatory user");
//					CM.enteringDataintoTextfiledByXpath(EL.elePassword_XP, Password, "Password");
//					CM.clickonElementbyXpath(EL.eleLogin_XP, "LOGIN");
//					Thread.sleep(3000);
//
//					try {
//						WebElement number2 = driver.findElement(By.xpath(" //span[text()=' " + displayNumber + " ']"));
//						number2.click();
//						System.out.println("numbar is displayed");
//					} catch (Exception e) {
//						System.out.println("numbar is not displayed");
//						System.out.println("Exception:" + e);
//					}
//
//					try {
//						WebElement DocNO = driver.findElement(By.xpath("//table[@id='tblDetails']/tbody/tr[2]/td[2]"));
//						if (DocNO.equals(displayNumber)) {
//							System.out.println("Doc No is displayed");
//						} else {
//							System.out.println("Doc no number is not displayed");
//						}
//					} catch (Exception e) {
//						System.out.println("numbar is not displayed");
//						System.out.println("Exception:" + e);
//					}
//					CM.enteringDataintoTextfiledByXpath(EL.eleRemarksinput_XP, NonsignatoryRemarks,
//							" Reviewer1remarks");
//					try {
//						select.selectByVisibleText(Decision3);
//					} catch (StaleElementReferenceException e) {
//						Select select2 = new Select(driver.findElement(By.xpath("//select[@id='Decision']")));
//						select2.selectByVisibleText(Decision3);
//						Thread.sleep(3000);
//					}
//
//					if (Decision3.equals("Approve")) {
//						System.out.println("Approver submission flow Approved");
//						CM.clickonElementbyXpath(EL.elebtnComplete_XP, "Complete");
//						driver.switchTo().alert().accept();
//						Thread.sleep(2000);
//						driver.switchTo().alert().accept();
//						Thread.sleep(2000);
//						CM.clickonElementbyXpath(EL.eleUsersetting_XP, "USER SETTINGS");
//						CM.clickonElementbyXpath(EL.eleLogout_XP, "Log out");
//						Thread.sleep(1000);
//						/////////////
//						CM.enteringDataintoTextfiledByXpath(EL.eleUserName_XP, Reviewer2username,
//								" Non signatory user");
//						CM.enteringDataintoTextfiledByXpath(EL.elePassword_XP, Password, "Password");
//						CM.clickonElementbyXpath(EL.eleLogin_XP, "LOGIN");
//						Thread.sleep(3000);
//						try {
//							WebElement number2 = driver
//									.findElement(By.xpath(" //span[text()=' " + displayNumber + " ']"));
//							number2.click();
//							System.out.println("numbar is displayed");
//						} catch (Exception e) {
//							System.out.println("numbar is not displayed");
//							System.out.println("Exception:" + e);
//						}
//						CM.enteringDataintoTextfiledByXpath(EL.eleRemarksinput_XP, NonsignatoryRemarks,
//								" Reviewer1remarks");
//						try {
//							select.selectByVisibleText(Decision4);
//						} catch (StaleElementReferenceException e) {
//							Select select2 = new Select(driver.findElement(By.xpath("//select[@id='Decision']")));
//							select2.selectByVisibleText(Decision4);
//							Thread.sleep(3000);
//						}
//
//						if (Decision4.equals("Approve")) {
//							System.out.println("Approver submission flow Approved");
//							CM.clickonElementbyXpath(EL.elebtnComplete_XP, "Complete");
//							driver.switchTo().alert().accept();
//							Thread.sleep(2000);
//							driver.switchTo().alert().accept();
//							Thread.sleep(2000);
//							CM.clickonElementbyXpath(EL.eleUsersetting_XP, "USER SETTINGS");
//							CM.clickonElementbyXpath(EL.eleLogout_XP, "Log out");
//							Thread.sleep(1000);
//							CM.enteringDataintoTextfiledByXpath(EL.eleUserName_XP, Reviewer2username,
//									" Non signatory user");
//							CM.enteringDataintoTextfiledByXpath(EL.elePassword_XP, Password, "Password");
//							CM.clickonElementbyXpath(EL.eleLogin_XP, "LOGIN");
//							Thread.sleep(3000);
//							try {
//								WebElement number2 = driver
//										.findElement(By.xpath(" //span[text()=' " + displayNumber + " ']"));
//								number2.click();
//								System.out.println("numbar is displayed");
//							} catch (Exception e) {
//								System.out.println("numbar is not displayed");
//								System.out.println("Exception:" + e);
//							}
//							CM.enteringDataintoTextfiledByXpath(EL.eleRemarksinput_XP, NonsignatoryRemarks,
//									" Reviewer1remarks");
//							try {
//								select.selectByVisibleText(Decision5);
//							} catch (StaleElementReferenceException e) {
//								Select select2 = new Select(driver.findElement(By.xpath("//select[@id='Decision']")));
//								select2.selectByVisibleText(Decision5);
//								Thread.sleep(3000);
//							}
//
//							if (Decision5.equals("Approve")) {
//								System.out.println("Approver submission flow Approved");
//								CM.clickonElementbyXpath(EL.elebtnComplete_XP, "Complete");
//								driver.switchTo().alert().accept();
//								Thread.sleep(2000);
//								driver.switchTo().alert().accept();
//								Thread.sleep(2000);
//								CM.clickonElementbyXpath(EL.eleUsersetting_XP, "USER SETTINGS");
//								CM.clickonElementbyXpath(EL.eleLogout_XP, "Log out");
//								Thread.sleep(1000);
//								CM.enteringDataintoTextfiledByXpath(EL.eleUserName_XP, Reviewer2username,
//										" Non signatory user");
//								CM.enteringDataintoTextfiledByXpath(EL.elePassword_XP, Password, "Password");
//								CM.clickonElementbyXpath(EL.eleLogin_XP, "LOGIN");
//								Thread.sleep(3000);
//								try {
//									WebElement number2 = driver
//											.findElement(By.xpath(" //span[text()=' " + displayNumber + " ']"));
//									number2.click();
//									System.out.println("numbar is displayed");
//								} catch (Exception e) {
//									System.out.println("numbar is not displayed");
//									System.out.println("Exception:" + e);
//								}
//								CM.enteringDataintoTextfiledByXpath(EL.eleRemarksinput_XP, NonsignatoryRemarks,
//										" Reviewer1remarks");
//								try {
//									select.selectByVisibleText(Decision6);
//								} catch (StaleElementReferenceException e) {
//									Select select2 = new Select(
//											driver.findElement(By.xpath("//select[@id='Decision']")));
//									select2.selectByVisibleText(Decision6);
//									Thread.sleep(3000);
//								}
//								if (Decision6.equals("Approve")) {
//									System.out.println("Approver submission flow Approved");
//									CM.clickonElementbyXpath(EL.elebtnComplete_XP, "Complete");
//									driver.switchTo().alert().accept();
//									Thread.sleep(2000);
//									driver.switchTo().alert().accept();
//									Thread.sleep(2000);
//									CM.clickonElementbyXpath(EL.eleUsersetting_XP, "USER SETTINGS");
//									CM.clickonElementbyXpath(EL.eleLogout_XP, "Log out");
//									Thread.sleep(1000);
//
//									CM.enteringDataintoTextfiledByXpath(EL.eleUserName_XP, Reviewer2username,
//											" Non signatory user");
//									CM.enteringDataintoTextfiledByXpath(EL.elePassword_XP, Password, "Password");
//									CM.clickonElementbyXpath(EL.eleLogin_XP, "LOGIN");
//									Thread.sleep(3000);
//									try {
//										WebElement number2 = driver
//												.findElement(By.xpath(" //span[text()=' " + displayNumber + " ']"));
//										number2.click();
//										System.out.println("numbar is displayed");
//									} catch (Exception e) {
//										System.out.println("numbar is not displayed");
//										System.out.println("Exception:" + e);
//									}
//									CM.enteringDataintoTextfiledByXpath(EL.eleRemarksinput_XP, NonsignatoryRemarks,
//											" Reviewer1remarks");
//									try {
//										select.selectByVisibleText(Decision7);
//									} catch (StaleElementReferenceException e) {
//										Select select2 = new Select(
//												driver.findElement(By.xpath("//select[@id='Decision']")));
//										select2.selectByVisibleText(Decision7);
//										Thread.sleep(3000);
//									}
//
//									if (Decision7.equals("Approve")) {
//										System.out.println("Approver submission flow Approved");
//										CM.clickonElementbyXpath(EL.elebtnComplete_XP, "Complete");
//										driver.switchTo().alert().accept();
//										Thread.sleep(2000);
//										driver.switchTo().alert().accept();
//										Thread.sleep(2000);
//										CM.clickonElementbyXpath(EL.eleUsersetting_XP, "USER SETTINGS");
//										CM.clickonElementbyXpath(EL.eleLogout_XP, "Log out");
//										Thread.sleep(1000);
//
//										CM.enteringDataintoTextfiledByXpath(EL.eleUserName_XP, Reviewer2username,
//												" Non signatory user");
//										CM.enteringDataintoTextfiledByXpath(EL.elePassword_XP, Password, "Password");
//										CM.clickonElementbyXpath(EL.eleLogin_XP, "LOGIN");
//										Thread.sleep(3000);
//
//										try {
//											WebElement number2 = driver
//													.findElement(By.xpath(" //span[text()=' " + displayNumber + " ']"));
//											number2.click();
//											System.out.println("numbar is displayed");
//										} catch (Exception e) {
//											System.out.println("numbar is not displayed");
//											System.out.println("Exception:" + e);
//										}
//										CM.enteringDataintoTextfiledByXpath(EL.eleRemarksinput_XP, NonsignatoryRemarks,
//												" Reviewer1remarks");
//										try {
//											select.selectByVisibleText(Decision8);
//										} catch (StaleElementReferenceException e) {
//											Select select2 = new Select(
//													driver.findElement(By.xpath("//select[@id='Decision']")));
//											select2.selectByVisibleText(Decision8);
//											Thread.sleep(3000);
//										}
//
//										if (Decision8.equals("Approve")) {
//											System.out.println("Approver submission flow Approved");
//											CM.clickonElementbyXpath(EL.elebtnComplete_XP, "Complete");
//											driver.switchTo().alert().accept();
//											Thread.sleep(2000);
//											driver.switchTo().alert().accept();
//											Thread.sleep(2000);
//											CM.clickonElementbyXpath(EL.eleUsersetting_XP, "USER SETTINGS");
//											CM.clickonElementbyXpath(EL.eleLogout_XP, "Log out");
//											Thread.sleep(1000);
//
//											CM.enteringDataintoTextfiledByXpath(EL.eleUserName_XP, Reviewer2username,
//													" Non signatory user");
//											CM.enteringDataintoTextfiledByXpath(EL.elePassword_XP, Password,
//													"Password");
//											CM.clickonElementbyXpath(EL.eleLogin_XP, "LOGIN");
//											Thread.sleep(3000);
//
//											try {
//												WebElement number2 = driver.findElement(
//														By.xpath(" //span[text()=' " + displayNumber + " ']"));
//												number2.click();
//												System.out.println("numbar is displayed");
//											} catch (Exception e) {
//												System.out.println("numbar is not displayed");
//												System.out.println("Exception:" + e);
//											}
//											CM.enteringDataintoTextfiledByXpath(EL.eleRemarksinput_XP,
//													NonsignatoryRemarks, " Reviewer1remarks");
//											try {
//												select.selectByVisibleText(Decision9);
//											} catch (StaleElementReferenceException e) {
//												Select select2 = new Select(
//														driver.findElement(By.xpath("//select[@id='Decision']")));
//												select2.selectByVisibleText(Decision9);
//												Thread.sleep(3000);
//											}
//
//											if (Decision9.equals("Approve")) {
//												System.out.println("Approver submission flow Approved");
//												CM.clickonElementbyXpath(EL.elebtnComplete_XP, "Complete");
//												driver.switchTo().alert().accept();
//												Thread.sleep(2000);
//												driver.switchTo().alert().accept();
//												Thread.sleep(2000);
//												CM.clickonElementbyXpath(EL.eleUsersetting_XP, "USER SETTINGS");
//												CM.clickonElementbyXpath(EL.eleLogout_XP, "Log out");
//												Thread.sleep(1000);
//
//												CM.enteringDataintoTextfiledByXpath(EL.eleUserName_XP,
//														Reviewer2username, " Non signatory user");
//												CM.enteringDataintoTextfiledByXpath(EL.elePassword_XP, Password,
//														"Password");
//												CM.clickonElementbyXpath(EL.eleLogin_XP, "LOGIN");
//												Thread.sleep(3000);
//
//											} else if (Decision9.equals("Resubmit")) {
//												System.out.println("Resubmited");
//												CM.clickonElementbyXpath(EL.elebtnComplete_XP, "Complete");
//												driver.switchTo().alert().accept();
//												Thread.sleep(2000);
//												driver.switchTo().alert().accept();
//												Thread.sleep(2000);
//												CM.clickonElementbyXpath(EL.eleUsersetting_XP, "USER SETTINGS");
//												CM.clickonElementbyXpath(EL.eleLogout_XP, "Log out");
//												Thread.sleep(1000);
//												CM.enteringDataintoTextfiledByXpath(EL.eleUserName_XP,
//														initiatorusername, " UserName");
//												CM.enteringDataintoTextfiledByXpath(EL.elePassword_XP, Password,
//														"Password");
//												CM.clickonElementbyXpath(EL.eleLogin_XP, "LOGIN");
//												Thread.sleep(5000);
//												CM.clickonElementbyXpath(EL.elemenuicon_XP, "Menu icon");
//
//											} else if (Decision8.equals("Resubmit")) {
//												System.out.println("Resubmited");
//												CM.clickonElementbyXpath(EL.elebtnComplete_XP, "Complete");
//												driver.switchTo().alert().accept();
//												Thread.sleep(2000);
//												driver.switchTo().alert().accept();
//												Thread.sleep(2000);
//												CM.clickonElementbyXpath(EL.eleUsersetting_XP, "USER SETTINGS");
//												CM.clickonElementbyXpath(EL.eleLogout_XP, "Log out");
//												Thread.sleep(1000);
//												CM.enteringDataintoTextfiledByXpath(EL.eleUserName_XP,
//														initiatorusername, " UserName");
//												CM.enteringDataintoTextfiledByXpath(EL.elePassword_XP, Password,
//														"Password");
//												CM.clickonElementbyXpath(EL.eleLogin_XP, "LOGIN");
//												Thread.sleep(5000);
//												CM.clickonElementbyXpath(EL.elemenuicon_XP, "Menu icon");
//												WebElement Documents = driver
//														.findElement(By.xpath("//div[text()='Documents']"));
//												AS.moveToElement(Documents).perform();
//												Documents.findElement(
//														By.xpath("//span[@class='sub-tlt'][normalize-space()='"
//																+ Category + "']"))
//														.click();
//												Thread.sleep(4000);
//											} else if (Decision7.equals("Resubmit")) {
//												System.out.println("Resubmited");
//												CM.clickonElementbyXpath(EL.elebtnComplete_XP, "Complete");
//												driver.switchTo().alert().accept();
//												Thread.sleep(2000);
//												driver.switchTo().alert().accept();
//												Thread.sleep(2000);
//												CM.clickonElementbyXpath(EL.eleUsersetting_XP, "USER SETTINGS");
//												CM.clickonElementbyXpath(EL.eleLogout_XP, "Log out");
//												Thread.sleep(1000);
//												CM.enteringDataintoTextfiledByXpath(EL.eleUserName_XP,
//														initiatorusername, " UserName");
//												CM.enteringDataintoTextfiledByXpath(EL.elePassword_XP, Password,
//														"Password");
//												CM.clickonElementbyXpath(EL.eleLogin_XP, "LOGIN");
//												Thread.sleep(5000);
//												CM.clickonElementbyXpath(EL.elemenuicon_XP, "Menu icon");
//												WebElement Documents = driver
//														.findElement(By.xpath("//div[text()='Documents']"));
//												AS.moveToElement(Documents).perform();
//												Documents.findElement(
//														By.xpath("//span[@class='sub-tlt'][normalize-space()='"
//																+ Category + "']"))
//														.click();
//												Thread.sleep(4000);
//											} else if (Decision6.equals("Resubmit")) {
//												System.out.println("Resubmited");
//												CM.clickonElementbyXpath(EL.elebtnComplete_XP, "Complete");
//												driver.switchTo().alert().accept();
//												Thread.sleep(2000);
//												driver.switchTo().alert().accept();
//												Thread.sleep(2000);
//												CM.clickonElementbyXpath(EL.eleUsersetting_XP, "USER SETTINGS");
//												CM.clickonElementbyXpath(EL.eleLogout_XP, "Log out");
//												Thread.sleep(1000);
//												CM.enteringDataintoTextfiledByXpath(EL.eleUserName_XP,
//														initiatorusername, " UserName");
//												CM.enteringDataintoTextfiledByXpath(EL.elePassword_XP, Password,
//														"Password");
//												CM.clickonElementbyXpath(EL.eleLogin_XP, "LOGIN");
//												Thread.sleep(5000);
//												CM.clickonElementbyXpath(EL.elemenuicon_XP, "Menu icon");
//												WebElement Documents = driver
//														.findElement(By.xpath("//div[text()='Documents']"));
//												AS.moveToElement(Documents).perform();
//												Documents.findElement(
//														By.xpath("//span[@class='sub-tlt'][normalize-space()='"
//																+ Category + "']"))
//														.click();
//												Thread.sleep(4000);
//											} else if (Decision5.equals("Resubmit")) {
//												System.out.println("Resubmited");
//												CM.clickonElementbyXpath(EL.elebtnComplete_XP, "Complete");
//												driver.switchTo().alert().accept();
//												Thread.sleep(2000);
//												driver.switchTo().alert().accept();
//												Thread.sleep(2000);
//												CM.clickonElementbyXpath(EL.eleUsersetting_XP, "USER SETTINGS");
//												CM.clickonElementbyXpath(EL.eleLogout_XP, "Log out");
//												Thread.sleep(1000);
//												CM.enteringDataintoTextfiledByXpath(EL.eleUserName_XP,
//														initiatorusername, " UserName");
//												CM.enteringDataintoTextfiledByXpath(EL.elePassword_XP, Password,
//														"Password");
//												CM.clickonElementbyXpath(EL.eleLogin_XP, "LOGIN");
//												Thread.sleep(5000);
//												CM.clickonElementbyXpath(EL.elemenuicon_XP, "Menu icon");
//												WebElement Documents = driver
//														.findElement(By.xpath("//div[text()='Documents']"));
//												AS.moveToElement(Documents).perform();
//												Documents.findElement(
//														By.xpath("//span[@class='sub-tlt'][normalize-space()='"
//																+ Category + "']"))
//														.click();
//												Thread.sleep(4000);
//											} else if (Decision4.equals("Resubmit")) {
//												System.out.println("Resubmited");
//												CM.clickonElementbyXpath(EL.elebtnComplete_XP, "Complete");
//												driver.switchTo().alert().accept();
//												Thread.sleep(2000);
//												driver.switchTo().alert().accept();
//												Thread.sleep(2000);
//												CM.clickonElementbyXpath(EL.eleUsersetting_XP, "USER SETTINGS");
//												CM.clickonElementbyXpath(EL.eleLogout_XP, "Log out");
//												Thread.sleep(1000);
//												CM.enteringDataintoTextfiledByXpath(EL.eleUserName_XP,
//														initiatorusername, " UserName");
//												CM.enteringDataintoTextfiledByXpath(EL.elePassword_XP, Password,
//														"Password");
//												CM.clickonElementbyXpath(EL.eleLogin_XP, "LOGIN");
//												Thread.sleep(5000);
//												CM.clickonElementbyXpath(EL.elemenuicon_XP, "Menu icon");
//												WebElement Documents = driver
//														.findElement(By.xpath("//div[text()='Documents']"));
//												AS.moveToElement(Documents).perform();
//												Documents.findElement(
//														By.xpath("//span[@class='sub-tlt'][normalize-space()='"
//																+ Category + "']"))
//														.click();
//												Thread.sleep(4000);
//											} else if (Decision3.equals("Resubmit")) {
//												System.out.println("Resubmited");
//												CM.clickonElementbyXpath(EL.elebtnComplete_XP, "Complete");
//												driver.switchTo().alert().accept();
//												Thread.sleep(2000);
//												driver.switchTo().alert().accept();
//												Thread.sleep(2000);
//												CM.clickonElementbyXpath(EL.eleUsersetting_XP, "USER SETTINGS");
//												CM.clickonElementbyXpath(EL.eleLogout_XP, "Log out");
//												Thread.sleep(1000);
//												CM.enteringDataintoTextfiledByXpath(EL.eleUserName_XP,
//														initiatorusername, " UserName");
//												CM.enteringDataintoTextfiledByXpath(EL.elePassword_XP, Password,
//														"Password");
//												CM.clickonElementbyXpath(EL.eleLogin_XP, "LOGIN");
//												Thread.sleep(5000);
//												CM.clickonElementbyXpath(EL.elemenuicon_XP, "Menu icon");
//												WebElement Documents = driver
//														.findElement(By.xpath("//div[text()='Documents']"));
//												AS.moveToElement(Documents).perform();
//												Documents.findElement(
//														By.xpath("//span[@class='sub-tlt'][normalize-space()='"
//																+ Category + "']"))
//														.click();
//												Thread.sleep(4000);
//											} else if (Decision9.equals("Reject")) {
//												System.out.println("Reject");
//												CM.clickonElementbyXpath(EL.elebtnComplete_XP, "Complete");
//												driver.switchTo().alert().accept();
//												Thread.sleep(2000);
//												driver.switchTo().alert().accept();
//												Thread.sleep(2000);
//												CM.clickonElementbyXpath(EL.eleUsersetting_XP, "USER SETTINGS");
//												CM.clickonElementbyXpath(EL.eleLogout_XP, "Log out");
//												Thread.sleep(1000);
//												CM.enteringDataintoTextfiledByXpath(EL.eleUserName_XP,
//														initiatorusername, " UserName");
//												CM.enteringDataintoTextfiledByXpath(EL.elePassword_XP, Password,
//														"Password");
//												CM.clickonElementbyXpath(EL.eleLogin_XP, "LOGIN");
//												Thread.sleep(5000);
//												CM.clickonElementbyXpath(EL.elemenuicon_XP, "Menu icon");
//												WebElement Documents = driver
//														.findElement(By.xpath("//div[text()='Documents']"));
//												AS.moveToElement(Documents).perform();
//												Documents.findElement(
//														By.xpath("//span[@class='sub-tlt'][normalize-space()='"
//																+ Category + "']"))
//														.click();
//												Thread.sleep(4000);
//											} else if (Decision8.equals("Reject")) {
//												System.out.println("Reject");
//												CM.clickonElementbyXpath(EL.elebtnComplete_XP, "Complete");
//												driver.switchTo().alert().accept();
//												Thread.sleep(2000);
//												driver.switchTo().alert().accept();
//												Thread.sleep(2000);
//												CM.clickonElementbyXpath(EL.eleUsersetting_XP, "USER SETTINGS");
//												CM.clickonElementbyXpath(EL.eleLogout_XP, "Log out");
//												Thread.sleep(1000);
//												CM.enteringDataintoTextfiledByXpath(EL.eleUserName_XP,
//														initiatorusername, " UserName");
//												CM.enteringDataintoTextfiledByXpath(EL.elePassword_XP, Password,
//														"Password");
//												CM.clickonElementbyXpath(EL.eleLogin_XP, "LOGIN");
//												Thread.sleep(5000);
//												CM.clickonElementbyXpath(EL.elemenuicon_XP, "Menu icon");
//												WebElement Documents = driver
//														.findElement(By.xpath("//div[text()='Documents']"));
//												AS.moveToElement(Documents).perform();
//												Documents.findElement(
//														By.xpath("//span[@class='sub-tlt'][normalize-space()='"
//																+ Category + "']"))
//														.click();
//												Thread.sleep(4000);
//											} else if (Decision7.equals("Reject")) {
//												System.out.println("Reject");
//												CM.clickonElementbyXpath(EL.elebtnComplete_XP, "Complete");
//												driver.switchTo().alert().accept();
//												Thread.sleep(2000);
//												driver.switchTo().alert().accept();
//												Thread.sleep(2000);
//												CM.clickonElementbyXpath(EL.eleUsersetting_XP, "USER SETTINGS");
//												CM.clickonElementbyXpath(EL.eleLogout_XP, "Log out");
//												Thread.sleep(1000);
//												CM.enteringDataintoTextfiledByXpath(EL.eleUserName_XP,
//														initiatorusername, " UserName");
//												CM.enteringDataintoTextfiledByXpath(EL.elePassword_XP, Password,
//														"Password");
//												CM.clickonElementbyXpath(EL.eleLogin_XP, "LOGIN");
//												Thread.sleep(5000);
//												CM.clickonElementbyXpath(EL.elemenuicon_XP, "Menu icon");
//												WebElement Documents = driver
//														.findElement(By.xpath("//div[text()='Documents']"));
//												AS.moveToElement(Documents).perform();
//												Documents.findElement(
//														By.xpath("//span[@class='sub-tlt'][normalize-space()='"
//																+ Category + "']"))
//														.click();
//												Thread.sleep(4000);
//											} else if (Decision6.equals("Reject")) {
//												System.out.println("Reject");
//												CM.clickonElementbyXpath(EL.elebtnComplete_XP, "Complete");
//												driver.switchTo().alert().accept();
//												Thread.sleep(2000);
//												driver.switchTo().alert().accept();
//												Thread.sleep(2000);
//												CM.clickonElementbyXpath(EL.eleUsersetting_XP, "USER SETTINGS");
//												CM.clickonElementbyXpath(EL.eleLogout_XP, "Log out");
//												Thread.sleep(1000);
//												CM.enteringDataintoTextfiledByXpath(EL.eleUserName_XP,
//														initiatorusername, " UserName");
//												CM.enteringDataintoTextfiledByXpath(EL.elePassword_XP, Password,
//														"Password");
//												CM.clickonElementbyXpath(EL.eleLogin_XP, "LOGIN");
//												Thread.sleep(5000);
//												CM.clickonElementbyXpath(EL.elemenuicon_XP, "Menu icon");
//												WebElement Documents = driver
//														.findElement(By.xpath("//div[text()='Documents']"));
//												AS.moveToElement(Documents).perform();
//												Documents.findElement(
//														By.xpath("//span[@class='sub-tlt'][normalize-space()='"
//																+ Category + "']"))
//														.click();
//												Thread.sleep(4000);
//
//											} else if (Decision5.equals("Reject")) {
//												System.out.println("Reject");
//												CM.clickonElementbyXpath(EL.elebtnComplete_XP, "Complete");
//												driver.switchTo().alert().accept();
//												Thread.sleep(2000);
//												driver.switchTo().alert().accept();
//												Thread.sleep(2000);
//												CM.clickonElementbyXpath(EL.eleUsersetting_XP, "USER SETTINGS");
//												CM.clickonElementbyXpath(EL.eleLogout_XP, "Log out");
//												Thread.sleep(1000);
//												CM.enteringDataintoTextfiledByXpath(EL.eleUserName_XP,
//														initiatorusername, " UserName");
//												CM.enteringDataintoTextfiledByXpath(EL.elePassword_XP, Password,
//														"Password");
//												CM.clickonElementbyXpath(EL.eleLogin_XP, "LOGIN");
//												Thread.sleep(5000);
//												CM.clickonElementbyXpath(EL.elemenuicon_XP, "Menu icon");
//												WebElement Documents = driver
//														.findElement(By.xpath("//div[text()='Documents']"));
//												AS.moveToElement(Documents).perform();
//												Documents.findElement(
//														By.xpath("//span[@class='sub-tlt'][normalize-space()='"
//																+ Category + "']"))
//														.click();
//												Thread.sleep(4000);
//											} else if (Decision4.equals("Reject")) {
//												System.out.println("Reject");
//												CM.clickonElementbyXpath(EL.elebtnComplete_XP, "Complete");
//												driver.switchTo().alert().accept();
//												Thread.sleep(2000);
//												driver.switchTo().alert().accept();
//												Thread.sleep(2000);
//												CM.clickonElementbyXpath(EL.eleUsersetting_XP, "USER SETTINGS");
//												CM.clickonElementbyXpath(EL.eleLogout_XP, "Log out");
//												Thread.sleep(1000);
//												CM.enteringDataintoTextfiledByXpath(EL.eleUserName_XP,
//														initiatorusername, " UserName");
//												CM.enteringDataintoTextfiledByXpath(EL.elePassword_XP, Password,
//														"Password");
//												CM.clickonElementbyXpath(EL.eleLogin_XP, "LOGIN");
//												Thread.sleep(5000);
//												CM.clickonElementbyXpath(EL.elemenuicon_XP, "Menu icon");
//												WebElement Documents = driver
//														.findElement(By.xpath("//div[text()='Documents']"));
//												AS.moveToElement(Documents).perform();
//												Documents.findElement(
//														By.xpath("//span[@class='sub-tlt'][normalize-space()='"
//																+ Category + "']"))
//														.click();
//												Thread.sleep(4000);
//											} else if (Decision3.equals("Reject")) {
//												System.out.println("Reject");
//												CM.clickonElementbyXpath(EL.elebtnComplete_XP, "Complete");
//												driver.switchTo().alert().accept();
//												Thread.sleep(2000);
//												driver.switchTo().alert().accept();
//												Thread.sleep(2000);
//												CM.clickonElementbyXpath(EL.eleUsersetting_XP, "USER SETTINGS");
//												CM.clickonElementbyXpath(EL.eleLogout_XP, "Log out");
//												Thread.sleep(1000);
//												CM.enteringDataintoTextfiledByXpath(EL.eleUserName_XP,
//														initiatorusername, " UserName");
//												CM.enteringDataintoTextfiledByXpath(EL.elePassword_XP, Password,
//														"Password");
//												CM.clickonElementbyXpath(EL.eleLogin_XP, "LOGIN");
//												Thread.sleep(5000);
//												CM.clickonElementbyXpath(EL.elemenuicon_XP, "Menu icon");
//												WebElement Documents = driver
//														.findElement(By.xpath("//div[text()='Documents']"));
//												AS.moveToElement(Documents).perform();
//												Documents.findElement(
//														By.xpath("//span[@class='sub-tlt'][normalize-space()='"
//																+ Category + "']"))
//														.click();
//												Thread.sleep(4000);
//
//											} else if (Decision2.equals("Resubmit")) {
//												System.out.println("Resubmited");
//												CM.clickonElementbyXpath(EL.elebtnComplete_XP, "Complete");
//												driver.switchTo().alert().accept();
//												Thread.sleep(2000);
//												driver.switchTo().alert().accept();
//												Thread.sleep(2000);
//												CM.clickonElementbyXpath(EL.eleUsersetting_XP, "USER SETTINGS");
//												CM.clickonElementbyXpath(EL.eleLogout_XP, "Log out");
//												Thread.sleep(1000);
//												CM.enteringDataintoTextfiledByXpath(EL.eleUserName_XP,
//														initiatorusername, " UserName");
//												CM.enteringDataintoTextfiledByXpath(EL.elePassword_XP, Password,
//														"Password");
//												CM.clickonElementbyXpath(EL.eleLogin_XP, "LOGIN");
//												Thread.sleep(5000);
//												CM.clickonElementbyXpath(EL.elemenuicon_XP, "Menu icon");
//												WebElement Documents = driver
//														.findElement(By.xpath("//div[text()='Documents']"));
//												AS.moveToElement(Documents).perform();
//												Documents.findElement(
//														By.xpath("//span[@class='sub-tlt'][normalize-space()='"
//																+ Category + "']"))
//														.click();
//												Thread.sleep(4000);
//											} else if (Decision2.equals("Reject")) {
//												System.out.println("Reject");
//												CM.clickonElementbyXpath(EL.elebtnComplete_XP, "Complete");
//												driver.switchTo().alert().accept();
//												Thread.sleep(2000);
//												driver.switchTo().alert().accept();
//												Thread.sleep(2000);
//												CM.clickonElementbyXpath(EL.eleUsersetting_XP, "USER SETTINGS");
//												CM.clickonElementbyXpath(EL.eleLogout_XP, "Log out");
//												Thread.sleep(1000);
//												CM.enteringDataintoTextfiledByXpath(EL.eleUserName_XP,
//														initiatorusername, " UserName");
//												CM.enteringDataintoTextfiledByXpath(EL.elePassword_XP, Password,
//														"Password");
//												CM.clickonElementbyXpath(EL.eleLogin_XP, "LOGIN");
//												Thread.sleep(5000);
//												CM.clickonElementbyXpath(EL.elemenuicon_XP, "Menu icon");
//												WebElement Documents = driver
//														.findElement(By.xpath("//div[text()='Documents']"));
//												AS.moveToElement(Documents).perform();
//												Documents.findElement(
//														By.xpath("//span[@class='sub-tlt'][normalize-space()='"
//																+ Category + "']"))
//														.click();
//											} else if (Decision1.equals("Resubmit")) {
//												System.out.println("Resubmited");
//												CM.clickonElementbyXpath(EL.elebtnComplete_XP, "Complete");
//												driver.switchTo().alert().accept();
//												Thread.sleep(2000);
//												driver.switchTo().alert().accept();
//												Thread.sleep(2000);
//												CM.clickonElementbyXpath(EL.eleUsersetting_XP, "USER SETTINGS");
//												CM.clickonElementbyXpath(EL.eleLogout_XP, "Log out");
//												Thread.sleep(1000);
//												CM.enteringDataintoTextfiledByXpath(EL.eleUserName_XP,
//														initiatorusername, " UserName");
//												CM.enteringDataintoTextfiledByXpath(EL.elePassword_XP, Password,
//														"Password");
//												CM.clickonElementbyXpath(EL.eleLogin_XP, "LOGIN");
//												Thread.sleep(5000);
//												CM.clickonElementbyXpath(EL.elemenuicon_XP, "Menu icon");
//												WebElement Documents = driver
//														.findElement(By.xpath("//div[text()='Documents']"));
//												AS.moveToElement(Documents).perform();
//												Documents.findElement(
//														By.xpath("//span[@class='sub-tlt'][normalize-space()='"
//																+ Category + "']"))
//														.click();
//												Thread.sleep(4000);
//											} else if (Decision1.equals("Reject")) {
//												System.out.println("Reject");
//												CM.clickonElementbyXpath(EL.elebtnComplete_XP, "Complete");
//												driver.switchTo().alert().accept();
//												Thread.sleep(2000);
//												driver.switchTo().alert().accept();
//												Thread.sleep(2000);
//												CM.clickonElementbyXpath(EL.eleUsersetting_XP, "USER SETTINGS");
//												CM.clickonElementbyXpath(EL.eleLogout_XP, "Log out");
//												Thread.sleep(1000);
//												CM.enteringDataintoTextfiledByXpath(EL.eleUserName_XP,
//														initiatorusername, " UserName");
//												CM.enteringDataintoTextfiledByXpath(EL.elePassword_XP, Password,
//														"Password");
//												CM.clickonElementbyXpath(EL.eleLogin_XP, "LOGIN");
//												Thread.sleep(5000);
//												CM.clickonElementbyXpath(EL.elemenuicon_XP, "Menu icon");
//												WebElement Documents = driver
//														.findElement(By.xpath("//div[text()='Documents']"));
//												AS.moveToElement(Documents).perform();
//												Documents.findElement(
//														By.xpath("//span[@class='sub-tlt'][normalize-space()='"
//																+ Category + "']"))
//														.click();
//												Thread.sleep(4000);
//
//											}
//										}
//									}
//								}
//							}
//						}
//					}
//				}
//			}
		}
	}
}
