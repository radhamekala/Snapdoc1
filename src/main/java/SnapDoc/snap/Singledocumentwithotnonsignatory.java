package SnapDoc.snap;
	import java.awt.AWTException;
	import java.io.FileInputStream;
	import java.io.IOException;
	import java.time.LocalDateTime;
	import java.time.format.DateTimeFormatter;
	import java.util.Calendar;
	import java.util.HashMap;
	import java.util.concurrent.TimeUnit;
	import org.apache.poi.xssf.usermodel.XSSFRow;
	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	import org.openqa.selenium.By;
	import org.openqa.selenium.StaleElementReferenceException;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.Select;
	public class Singledocumentwithotnonsignatory extends TestBase {
		private HashMap<Object, Object> excelinputDdata;
		public static String Date;
		public static String NonSignataryAcceptedON;
		public static String NonSignatoryRemarks;
		public static String DisplayNumbers;
		public static String EffectiveDate;

		public void Typecreation() throws InterruptedException, AWTException, IOException {
			excelinputDdata = new HashMap<>();
			FileInputStream file = new FileInputStream("C:\\Users\\SSD\\Documents\\Type creation.xlsx");
			XSSFWorkbook Workbook = new XSSFWorkbook(file);
			XSSFSheet sheet = Workbook.getSheet("Sheet1");
			int rowcount = sheet.getLastRowNum();
			for (int i = 1; i <= rowcount; i++) {
				XSSFRow row = sheet.getRow(i);
				String Type = row.getCell(0).getStringCellValue();
				String TypeCode = row.getCell(1).getStringCellValue();
				String TypeDescription = row.getCell(2).getStringCellValue();
				String MakeEffectiveLevel1 = row.getCell(3).getStringCellValue();
				String IssueLevel1 = row.getCell(4).getStringCellValue();
				String ControlPrintLevel1 = row.getCell(5).getStringCellValue();
				String RecouncilationLevel1 = row.getCell(6).getStringCellValue();
				String DestructionLevel1 = row.getCell(7).getStringCellValue();
				String Category = row.getCell(8).getStringCellValue();
				String Subcategory = row.getCell(9).getStringCellValue();
				driver.findElement(By.xpath("(//span[text()='" + Category + "'])[2]")).click();
				Thread.sleep(5000);
				driver.findElement(By.xpath("//td[text()='" + Subcategory + "']")).click();
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
//					CM.clickonElementbyXpath(EL.eleOrgid_XP, "Org Id ");// click unselect
				CM.clickonElementbyXpath(EL.eleChangeNeeded_XP, "Change needed"); // click unselect
//					CM.clickonElementbyXpath(EL.eleAssociatedonly_XP, "Associated only");
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
//							CM.selectValueinDropdownByVisualtextbyXpath(EL.elerdbtnNumberingType_XP, "Independent",
//									"Numbering Approach");
//							CM.enteringDataintoTextfiledByXpath(EL.eleDescriptionAutoNum_XP, "deiscription 1", "Discription");
//							CM.selectValueinDropdownByVisualtextbyXpath(EL.elePartsAutoNum_XP, "Fixed", "Selection");
//							CM.CheckElementDisplayedbyXpath(EL.elebtnAddNewRow_XP, "btnAddNewRow");

				}
				WebElement Orgid = driver.findElement(By.name("IsManualNumberReq"));
				System.out.println("Orgid is selected ?" + Orgid.isSelected());

				WebElement Asso = driver.findElement(By.name("IsCreateIndividual"));
				System.out.println("Associated is selected ?" + Asso.isSelected());
				WebElement ChangeNeeded = driver.findElement(By.name("IsChangeNeeded"));
				System.out.println("ChangeNeeded is selected ?" + ChangeNeeded.isSelected());
				WebElement Effective = driver.findElement(By.name("IsDocEffManually"));
				System.out.println("Effective is selected ?" + Effective.isSelected());
				// Document Layout Configuration
				CM.clickonElementbyXpath(EL.eleA4PP_XP, "A4PotraitPreApproved checkbox");
				CM.clickonElementbyXpath(EL.eleSAVE_XP, "Save");
				// Associations
				CM.CheckElementDisplayedbyXpath(EL.eleAssociations_XP, "Associations");
				CM.clickonElementbyXpath(EL.eleLocatio1_XP, "Location");
				CM.clickonElementbyXpath(EL.eleDepartment_XP, "Department");
				CM.clickonElementbyXpath(EL.eleMaterial_XP, "Material");
				CM.clickonElementbyXpath(EL.eleUser_XP, "User");
				CM.clickonElementbyXpath(EL.eleAsset1_XP, "Asset");
				CM.clickonElementbyXpath(EL.eleProduct_XP, "Product");
				//// Issue Configuration
				CM.CheckElementDisplayedbyXpath(EL.eleConfiguration_XP, "Issue Configuration Header");
				CM.CheckElementDisplayedbyXpath(EL.eleIssuable_XP, "Issuable");
				CM.CheckElementDisplayedbyXpath(EL.eleReturnperiod_XP, "Default Return Period");
				CM.CheckElementDisplayedbyXpath(EL.eleIssueinmonths_XP, "Issue Doc Archival (In Months)");
				CM.enteringDataintoTextfiledByXpath(EL.elereturnperiod_XP, "2", "ReviewPeriod");
				CM.enteringDataintoTextfiledByXpath(EL.eleArvalperi_XP, "3", "ArchivalPeriod");
				CM.selectValueinDropdownByVisualtextbyXpath(EL.eleIssue_XP, "Yes", "ReviewPeriod");
				// associations
//						WebElement batchnum = driver.findElement(By.xpath("//a[text()='Batch Number']"));
//						WebElement ARnumber = driver.findElement(By.xpath("//a[text()='AR Number']"));
//						WebElement Product = driver.findElement(By.xpath("//a[text()='Product']"));
//						WebElement Assets = driver.findElement(By.xpath("//a[text()='Asset']"));
//						WebElement Manufacturing = driver.findElement(By.xpath("//a[text()='Manufacturing Date']"));
//						batchnum.click();
//						ARnumber.click();
//						Product.click();
//						Assets.click();
//						Manufacturing.click();
				// PrintConfiguration
//							CM.clickonElementbyXpath(EL.eleControlled_XP, "Controlled print");  // if click off
				WebElement controlledprint = driver.findElement(By.name("IsCanControlCopy"));
				System.out.println("controlledprint is selected ?" + controlledprint.isSelected());
				// iniciatioin
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
				// submition
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
					CM.selectValueinDropdownByVisualtextbyXpath(EL.eleReviewerRoleId1_XP, "QA HOD (QAH1)",
							"Designation Based");
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
					CM.selectValueinDropdownByVisualtextbyXpath(EL.eleApprovelrole_XP, "QA HOD (QAH1)",
							"Designation Based");
					System.out.println("selected designation based");
				} else {
					CM.selectValueinDropdownByVisualtextbyXpath(EL.eleuseR_XP, "User Based", "Userbased");
					System.out.println("selected userbased");
				}
	// Make effective
				CM.clickonElementbyID(EL.eleEffectiveApproval_XP, "EffectiveApproval");
				CM.enteringDataintoTextfiledByXpath(EL.eleLevelName_XP, MakeEffectiveLevel1, "LevelName");
				WebElement Effectivedesig = driver
						.findElement(By.xpath("//tr[@id='tr_278031_0']//input[@id='IsDesignationBased']"));
//									Effectivedesig.click();
				Thread.sleep(500);
				System.out.println("Designased is selected ?" + Effectivedesig.isSelected());

				if (Effectivedesig.isSelected()) {
//												driver.findElement(By.xpath("//div[@class='cr-wrap workflow_278031']//select[@id='_ApproverRoleId_1']")).sendKeys("QA HOD (QAH1)");
					CM.selectValueinDropdownByVisualtextbyXpath(EL.eleApproverRol3_XP, "QA User (QAU1)",
							"Designation Based");
					System.out.println("selected designation based");
				} else {
					CM.selectValueinDropdownByVisualtextbyXpath(EL.eleUserbased4_XP, "User Based", "Userbased");
					System.out.println("selected userbased");
				}
	// issue
				CM.clickonElementbyXpath(EL.eledocissueON_XP, "doc issue ON");// issuebutton
				WebElement Issuedesibased1 = driver.findElement(By.xpath("//tr[@id='tr_305053_0']/td[4]/input[1]"));
//									Issuedesibased1.click();//designased on
				System.out.println("Issuedesibased1 is selected ?" + Issuedesibased1.isSelected());
				if (Issuedesibased1.isSelected()) {
					CM.selectValueinDropdownByVisualtextbyXpath(EL.eleissueifdesibased_XP, "QA User (QAU1)",
							"Designation Based");
				} else {
					CM.selectValueinDropdownByVisualtextbyXpath(EL.eleissueuserbased_XP, "User Based", "Userbased");
					System.out.println("selected userbased");
				}
				CM.enteringDataintoTextfiledByXpath(EL.eleIssuelevelinput_XP, IssueLevel1, " issue level name");
				// Control print //1 ////
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
				CM.enteringDataintoTextfiledByXpath(EL.elePrintlevel1_XP, ControlPrintLevel1, "Control print level name");
				WebElement Control1isdesibased = driver.findElement(By.xpath("//tr[@id='tr_305054_0']/td[4]/input"));
//											Control1isdesibased.click();
				if (Control1isdesibased.isSelected()) {
					CM.selectValueinDropdownByVisualtextbyXpath(EL.eleIFdesi1control_XP, "QA User (QAU1)",
							"Designation Based");
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
				CM.enteringDataintoTextfiledByXpath(EL.eleRecountLevelname1_XP, RecouncilationLevel1, "RecountLevelname");
				WebElement Reconciliation1isdesibased = driver.findElement(By.xpath("//tr[@id='tr_383001_0']/td[4]/input"));
//								Reconciliation1isdesibased.click();
				if (Reconciliation1isdesibased.isSelected()) {
					CM.selectValueinDropdownByVisualtextbyXpath(EL.eleRecounciIfDesibased_XP, "QA User (QAU1)",
							"Designation Based");
				} else {
					CM.selectValueinDropdownByVisualtextbyXpath(EL.eleRecounciUserbased1_XP, "User Based", "Userbased");
					System.out.println("selected userbased");
				}
				// Destuctions
				CM.CheckElementDisplayedbyXpath(EL.eledestra_XP, "Workflow for Document - Destruction ");
				CM.clickonElementbyXpath(EL.eledescrict_XP, "IsDestructionApprovalReq");
				driver.findElement(By.xpath("//tr[@id='tr_383002_0']/td[3]/input")).sendKeys("1");

				WebElement Destuctions1isdesibased = driver.findElement(By.xpath("//tr[@id='tr_383002_0']/td[4]/input[1]"));
//								Destuctions1isdesibased.click();
				if (Destuctions1isdesibased.isSelected()) {
					CM.selectValueinDropdownByVisualtextbyXpath(EL.eledisdisignased_XP, "QA User (QAU1)",
							"Designation Based");
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
		}
		public void Documentinitiate() throws InterruptedException, AWTException, IOException {
			excelinputDdata = new HashMap<>();
			FileInputStream file = new FileInputStream("C:\\Users\\SSD\\Documents\\Type creation.xlsx");
			XSSFWorkbook Workbook = new XSSFWorkbook(file);
			XSSFSheet sheet = Workbook.getSheet("Sheet3");
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
				Thread.sleep(3000);	
				CM.clickonElementbyXpath(EL.eleInitiate_XP, "Initiate");
				Thread.sleep(1000);
				CM.selectValueinDropdownByVisualtextbyXpath(EL.eleAddtype_XP, Type, "Addtype");
				CM.enteringDataintoTextfiledByXpath(EL.eletxtTitle_XP, Title, "txtTitle_1");
				Thread.sleep(500);
				WebElement DOCNUM = driver.findElement(By.xpath("//input[@id='txtIsNumberingAutoOrManual_1']"));
				if (DOCNUM.isEnabled()) {
					CM.enteringDataintoTextfiledByXpath(EL.eleDocNumber_XP, DocNumber, "Document number");
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
//							if (driver.findElement(By.xpath("//div[text()='Material']")).isEnabled()) {
//								CM.selectValueinDropdownByVisualtextbyXpath(EL.eleselectmaterial_XP, Material, "Material");
//							} else {
//								System.out.println("material disabled");
//							}
//							if (driver.findElement(By.xpath("//div[text()='Asset']")).isEnabled()) {
//								CM.selectValueinDropdownByVisualtextbyXpath(EL.eleAsset_XP, Asset, "Asset");
//							} else {
//								System.out.println("material disabled");
//							}
//							if (driver.findElement(By.xpath("//div[text()='User']")).isDisplayed()) {
//								CM.selectValueinDropdownByVisualtextbyXpath(EL.eleusers_XP, User, "User");
//							} else {
//								System.out.println("User disabled");
//							}
//							if (driver.findElement(By.xpath("//div[text()='Product']")).isEnabled()) {
//								CM.selectValueinDropdownByVisualtextbyXpath(EL.eleproduct_XP, Products, "Product");
//								Thread.sleep(4000);
//							} else {
//								System.out.println("Product disabled");
//							}
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
				CM.selectValueinDropdownByVisualtextbyXpath(EL.eleNonsignatory1_XP, NonSignatory, "Non signatory Reviewer");
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
				driver.switchTo().alert().accept();
				Thread.sleep(2000);
				try {
					WebElement Displaynumber = driver.findElement(By.xpath("(//a[text()=' " + displayNumber + " '])[1]"));
					if (Displaynumber.isDisplayed()) {
						System.out.println("Displaynumber displayed");
						Displaynumber.click();
						System.out.println("document info page navigated");
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
				try {
					String Titlenmber1 = driver.findElement(By.xpath("//td[@id='tdPrimaryDocTitle']")).getText();
					System.out.println(Titlenmber1);
					if (Titlenmber1.equals(Title)) {
						System.out.println("expected number title is correct");
					} else {
						System.out.println("expected number title incorrect");
					}
				} catch (Exception e) {
					System.out.println("not able to validate");
					System.out.println("Exception : " + e);
				}
				try {
					String Description1 = driver
							.findElement(By.xpath("//td[@id='tdPrimaryDocTitle']/following-sibling::td[1]")).getText();
					System.out.println(Description1);
					if (Description1.equals(DocDiscription)) {
						System.out.println("expected Description1 is correct");
					} else {
						System.out.println("expected Description1 incorrect");
					}
				} catch (Exception e) {
					System.out.println("not able to validate");
					System.out.println("Exception : " + e);
				}
				try {
					WebElement Loctaion = driver.findElement(By.xpath(" //p[text()='  Unit-I']"));
					if (Loctaion.isDisplayed()) {
						System.out.println("Location name displayed");
					} else {
						System.out.println("Location name  not displayed");
					}
				} catch (Exception e) {
					System.out.println("not able  to validate expected location department element");
					System.out.println("Exception : " + e);
				}
				try {
					WebElement department = driver.findElement(By.xpath(" //p[text()='  Quality Assurance']"));
					if (department.isDisplayed()) {
						System.out.println("department is displayed");
					} else {
						System.out.println("department not displayed");
					}
				} catch (Exception e) {
					System.out.println("not able  to validate expected location department element");
					System.out.println("Exception : " + e);
				}
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
					System.out.println("not able to validate");
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
					System.out.println("not able to validate");
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
					System.out.println("not able to validate");
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
					System.out.println("not able to validate");
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
					System.out.println("not able to validate");
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
					System.out.println("not able to validate");
					System.out.println("Exception : " + e);
				}

				WebElement product = driver.findElement(By.xpath("//td[text()='P']"));
				WebElement Materials = driver.findElement(By.xpath("//td[text()='M']"));
				WebElement user = driver.findElement(By.xpath("//td[text()='U']"));
				WebElement Assets = driver.findElement(By.xpath("//td[text()='A']"));
				try {
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
					if (Materials.isDisplayed()) {
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
					if (Assets.isDisplayed()) {
						System.out.println("Assets name displayed");
					} else {
						System.out.println("Assets name not displayed");
					}
				} catch (Exception e) {
					System.out.println("not able to validate");
					System.out.println("Exception : " + e);
				}
//				try {
	//
//					WebElement productname = driver.findElement(By.xpath("//td[text()='" + Productss + "']"));
//					if (productname.isDisplayed()) {
//						System.out.println("product name displayed");
//					} else {
//						System.out.println("product name not displayed");
//					}
//				} catch (Exception e) {
//					System.out.println("not able to validate");
//					System.out.println("Exception : " + e);
//				}
				// WebElement Materialname
				// =driver.findElement(By.xpath("//td[text()='"+MateriaL+"']"));
				// if(Materialname.isDisplayed()) {
//						System.out.println("Material name displayed");
				// }else {
//						System.out.println("Material name not displayed");
				//
				// }
//				try {
//					WebElement Users = driver.findElement(By.xpath("//td[text()='" + User + "']"));
//					if (Users.isDisplayed()) {
//						System.out.println("USER name displayed");
//					} else {
//						System.out.println("USER name not displayed");
	//
//					}
//				} catch (Exception e) {
//					System.out.println("not able to validate");
//					System.out.println("Exception : " + e);
//				}
//				try {
//					WebElement Asset1 = driver.findElement(By.xpath("//td[text()='" + asset + "']"));
//					if (Asset1.isDisplayed()) {
//						System.out.println("Assets name displayed");
//					} else {
//						System.out.println("Assets name not displayed");
	//
//					}
//				} catch (Exception e) {
//					System.out.println("not able to validate");
//					System.out.println("Exception : " + e);
//				}
				// settings1
				try {
					WebElement setting = driver.findElement(By.xpath("//td[@id='tdLayout']"));
					if (setting.isDisplayed()) {
						System.out.println("setting is Displayed");
					} else {
						System.out.println("settings not equal");
					}
				} catch (Exception e) {
					System.out.println("not able to validate");
					System.out.println("Exception : " + e);
				}
				String parentwindow = driver.getWindowHandle();
				driver.findElement(By.xpath("(//img[@title='View Document'])[1]")).click();
				String Childwindow = driver.getWindowHandle();
				Thread.sleep(5000);
				driver.switchTo().window(parentwindow);
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
					WebElement AssoFile = driver.findElement(By.xpath(
							"//table[@id='jsonTblAssDocs']//th[@class='t-header wid5pc'][normalize-space()='File']"));
					if (AssoFile.isDisplayed()) {
						System.out.println("ASSOCIATED DOCUMENTS file header is displayed");
					} else {
						System.out.println("ASSOCIATED DOCUMENTS file header is not displayed ");
					}
				} catch (Exception e) {
					System.out.println("not able to validate");
					System.out.println("Exception : " + e);
				}
				// change details
//				try {
//					WebElement changedetails = driver.findElement(By.xpath("//h1[text()='Change Controls']"));
//					if (changedetails.isDisplayed()) {
//						System.out.println("Change detail header is displayed");
//					} else {
//						System.out.println("change detail header is not displayed");
//					}
//				} catch (Exception e) {
//					System.out.println("not able to validate");
//					System.out.println("Exception : " + e);
//				}
//				try {
//					WebElement ID = driver.findElement(By.xpath("//span[text()='Id']"));
//					if (ID.isDisplayed()) {
//						System.out.println("ID header is displayed");
//					} else {
//						System.out.println("id header is not displayed");
//					}
//				} catch (Exception e) {
//					System.out.println("not able to validate");
//					System.out.println("Exception : " + e);
//				}
//							try {
//							WebElement changedis = driver.findElement(By.xpath("//span[text()='Description']"));
//							if (changedis.isDisplayed()) {
//								System.out.println("change control discription header is displayed");
//							} else {
//								System.out.println("change control discription  header not displayed");
//							}
//								} catch (Exception e) {
//									System.out.println("not able to validate");
//									System.out.println("Exception : " + e);
//								}
//							try {
//							WebElement filechangecontrol = driver.findElement(By.xpath("(//span[text()='File'])[1]"));
//							if (filechangecontrol.isDisplayed()) {
//								System.out.println("filechangecontrol header is displayed");
//							} else {
//								System.out.println("filechangecontrol header is not displayed");
//							}
//								} catch (Exception e) {
//									System.out.println("not able to validate");
//									System.out.println("Exception : " + e);
//								}
//							try {
//							WebElement chngecontrolID = driver.findElement(By.xpath("//td[text()='" + changecontrolnumbar + "']"));
//							if (chngecontrolID.isDisplayed()) {
//								System.out.println("Change control ID is displayed");
//							} else {
//								System.out.println("Change control ID is not displayed");
//							}
//								} catch (Exception e) {
//									System.out.println("not able to validate");
//									System.out.println("Exception : " + e);
//								}
//							try {
//							WebElement changecontroldiscription = driver
//									.findElement(By.xpath("//td[text()='" + changecontrolDescription + "']"));
//							if (changecontroldiscription.isDisplayed()) {
//								System.out.println("change control discription is displayed");
//							} else {
//								System.out.println("change control discription displayed");
//							}
//								} catch (Exception e) {
//									System.out.println("not able to validate");
//									System.out.println("Exception : " + e);
//								}
//							Thread.sleep(5000);
//							String Changeparentwindow = driver.getWindowHandle();
//							System.out.println(parentwindow);
//							driver.findElement(By.xpath("(//img[@title='View Document'])[2]")).click();
//							String ChangeChildwindow = driver.getWindowHandle();
//							System.out.println(Childwindow);
//							Thread.sleep(5000);
//							driver.switchTo().window(Changeparentwindow);
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
				CM.CheckElementDisplayedbyXpath(EL.elestatuS1_XP, "Status");
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
						Thread.sleep(500);
						System.out.println("initiatedby" + initiatedBy);
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
					System.out.println("not able to validate");
					System.out.println("Exception : " + e);
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
				// nonsignatory
				String StringExpectstep1 = "Task for Non-Signatory Reviewers";
				WebElement Nonsignata = driver.findElement(By.xpath(
						"(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[1]/td[text()='Task for Non-Signatory Reviewers']"));

				try {
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
				// Reviewer
				String StringExpectstep2 = "Default Tasks for Reviewers";
				WebElement TaskReviewer = driver.findElement(By.xpath(
						"(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[2]/td[text()='Default Tasks for Reviewers']"));

				try {
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
							"(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[2]/td[text()='Pending']"));

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
				String StringExpectstep3 = "Approval 1";
				WebElement TaskApprover = driver.findElement(By.xpath(
						"(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[3]/td[text()='Approval 1']"));
				try {
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
					WebElement ApproverAction = driver.findElement(By.xpath(
							"(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[3]/td[text()='Pending']"));
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
				try {
					WebElement Analyti = driver.findElement(By.xpath("//div[text()='An']"));
					AS.doubleClick(Analyti).perform();
					Thread.sleep(3000);
					System.out.println("doc info page close");
				} catch (Exception e) {
					System.out.println("not able to validate");
					System.out.println("Exception : " + e);
				}
				try {
					WebElement Displaynumber = driver.findElement(By.xpath("(//a[text()=' " + displayNumber + " '])[1]"));
					if (Displaynumber.isDisplayed()) {
						System.out.println("Displaynumber displayed");
					} else {
						System.out.println("Displaynumber not displayed");
					}
				} catch (Exception e) {
					System.out.println("not able to validate");
					System.out.println("Exception : " + e);
				}
				try {
					WebElement Titlename = driver.findElement(By.xpath("//a[text()=' " + displayNumber
							+ " ']/parent::td /following-sibling::td[text()='" + Title + "'][1]"));
					if (Titlename.isDisplayed()) {
						System.out.println("Titlename displayed");
					} else {
						System.out.println("Titlename not displayed");
					}
				} catch (Exception e) {
					System.out.println("not able to validate");
					System.out.println("Exception : " + e);
				}
				try {
					WebElement Typename = driver.findElement(By.xpath("//a[text()=' " + displayNumber
							+ " ']/parent::td /following-sibling::td[2]/ul/li[text()=' " + Type + " ']"));
					if (Typename.isDisplayed()) {
						System.out.println("Typename displayed");
					} else {
						System.out.println("Typename not displayed");
					}

				} catch (Exception e) {
					System.out.println("not able to validate");
					System.out.println("Exception : " + e);
				}
				try {
					WebElement typethreedot = driver.findElement(By.xpath("//a[text()=' " + displayNumber
							+ " ']/parent::td/following-sibling::td[2]//i[@class='bi bi-three-dots']"));
					typethreedot.click();
					System.out.println("type s checking three dot symble");
				} catch (Exception e) {
					System.out.println("not able to validate");
					System.out.println("Exception : " + e);
				}
				try {
					WebElement insidetypename = driver.findElement(By.xpath("//a[text()=' " + displayNumber
							+ " ']/parent::td/following-sibling::td[2]//ul[@class='first_assoc_block']/li[1]/p[text()='Type']"));
					if (insidetypename.isDisplayed()) {
						System.out.println("inside typename displayed");
					} else {
						System.out.println("insidet ypename not displayed");
					}
				} catch (Exception e) {
					System.out.println("not able to validate");
					System.out.println("Exception : " + e);
				}
				try {
					WebElement typevalue = driver.findElement(By.xpath("//a[text()=' " + displayNumber
							+ " ']/parent::td/following-sibling::td[2]//ul[@class='first_assoc_block']/li[1]/p[text()='"
							+ Type + "']"));
					if (typevalue.isDisplayed()) {
						System.out.println("type value displayed");
					} else {
						System.out.println("type value not displayed");
					}
				} catch (Exception e) {
					System.out.println("not able to validate");
					System.out.println("Exception : " + e);
				}
				try {
					WebElement Category1 = driver.findElement(By.xpath("//a[text()=' " + displayNumber
							+ " ']/parent::td/following-sibling::td[2]//ul[@class='first_assoc_block']/li[2]/p[text()='Category']"));
					if (Category1.isDisplayed()) {
						System.out.println("Category displayed");
					} else {
						System.out.println("Category not displayed");
					}
				} catch (Exception e) {
					System.out.println("not able to validate");
					System.out.println("Exception : " + e);
				}
				try {
					WebElement categoryvalue = driver.findElement(By.xpath("//a[text()=' " + displayNumber
							+ " ']/parent::td/following-sibling::td[2]//ul[@class='first_assoc_block']/li[2]/p[text()='"
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
				try {
					WebElement Subcategoryname = driver.findElement(By.xpath("//a[text()=' " + displayNumber
							+ " ']/parent::td/following-sibling::td[2]//ul[@class='first_assoc_block']/li[3]/p[text()='Sub Category']"));
					if (Subcategoryname.isDisplayed()) {
						System.out.println("Subcategoryname displayed");
					} else {
						System.out.println("Subcategoryname not displayed");
					}
				} catch (Exception e) {
					System.out.println("not able to validate");
					System.out.println("Exception : " + e);
				}
				try {
					WebElement Subcategorynamevalue = driver.findElement(By.xpath("//a[text()=' " + displayNumber
							+ " ']/parent::td/following-sibling::td[2]//ul[@class='first_assoc_block']/li[3]/p[text()='"
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
				try {
					WebElement toggle = driver.findElement(By.xpath("//a[text()=' " + displayNumber
							+ " ']/parent::td/following-sibling::td/div[@class='inficon dotIcon']"));
					toggle.click();
					System.out.println("toggle clicked");
				} catch (Exception e) {
					System.out.println("not able to validate");
					System.out.println("Exception : " + e);
				}
				try {
					WebElement Viewdoc = driver.findElement(By.xpath("//a[text()=' " + displayNumber
							+ " ']/parent::td/following-sibling::td/div[2]//a[text()='View Document']"));
					if (Viewdoc.isDisplayed()) {
						System.out.println("Viewdoc displayed");
					} else {
						System.out.println("Viewdoc not displayed");
					}
				} catch (Exception e) {
					System.out.println("not able to validate");
					System.out.println("Exception : " + e);
				}
				try {
					WebElement uncontroledprint = driver.findElement(By.xpath("//a[text()=' " + displayNumber
							+ " ']/parent::td/following-sibling::td/div[2]//a[text()='Uncontrolled Print']"));
					if (uncontroledprint.isDisplayed()) {
						System.out.println("uncontroledprint displayed");
					} else {
						System.out.println("uncontroledprint not displayed");
					}
				} catch (Exception e) {
					System.out.println("not able to validate");
					System.out.println("Exception : " + e);
				}
				try {
					WebElement printhistory = driver.findElement(By.xpath("//a[text()=' " + displayNumber
							+ " ']/parent::td/following-sibling::td/div[2]//a[text()='Print History']"));
					if (printhistory.isDisplayed()) {
						System.out.println("printhistory displayed");
					} else {
						System.out.println("printhistory not displayed");
					}
				} catch (Exception e) {
					System.out.println("not able to validate");
					System.out.println("Exception : " + e);
				}
				try {
					WebElement Changehistory = driver.findElement(By.xpath("//a[text()=' " + displayNumber
							+ " ']/parent::td/following-sibling::td/div[2]//a[text()='Change History']"));
					if (Changehistory.isDisplayed()) {
						System.out.println("Changehistory displayed");
					} else {
						System.out.println("Changehistory not displayed");
					}
				} catch (Exception e) {
					System.out.println("not able to validate");
					System.out.println("Exception : " + e);
				}
				try {
					WebElement Status = driver.findElement(By.xpath("//a[text()=' " + displayNumber
							+ " ']/parent::td/following-sibling::td[text()='Creation']/sup[text()='*']"));
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
				Thread.sleep(500);
				CM.clickonElementbyXpath(EL.eleLogout_XP, "Log out");
				Thread.sleep(100);
				CM.enteringDataintoTextfiledByXpath(EL.eleUserName_XP, NonSignatoryNAME, " Non signatory user");
				CM.enteringDataintoTextfiledByXpath(EL.elePassword_XP, Password, "Password");
				CM.clickonElementbyXpath(EL.eleLogin_XP, "LOGIN");
				Thread.sleep(2000);
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
					WebElement Submission = driver.findElement(By.xpath("//span[text()=' " + displayNumber
							+ " ']/parent::td/parent::tr/td[text()='" + ApprovalType + "']"));
					if (Submission.isDisplayed()) {
						System.out.println("document submission is displayed");
					} else {
						System.out.println("Document submission is not displayed");
					}
				} catch (Exception e) {
					System.out.println("not able to validate");
					System.out.println("Exception : " + e);
				}
				try {
					WebElement initiatedby = driver.findElement(By.xpath("//span[text()=' " + displayNumber
							+ " ']/parent::td/following-sibling::td[text()='" + initiatedBy + " ']"));
					if (initiatedby.isDisplayed()) {
						System.out.println("initiatedby " + initiatedBy);
					} else {
						System.out.println("initiatedby is not displayed");
					}
				} catch (Exception e) {
					System.out.println("not able to validate");
					System.out.println("Exception : " + e);
				}
				try {
					WebElement initiatedby = driver.findElement(By.xpath("//span[text()=' " + displayNumber
							+ " ']/parent::td/following-sibling::td[text()='" + Date + "']"));
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
					WebElement titlenemes = driver.findElement(By.xpath("(//span[text()=' " + displayNumber
							+ " ']/parent::td/following-sibling::td//div[text()='" + Title + "'])[2]"));
					if (titlenemes.isDisplayed()) {
						System.out.println("title name displayed");
					} else {
						System.out.println("title name not displayed");
					}
				} catch (Exception e) {
					System.out.println("not able to validate");
					System.out.println("Exception : " + e);
				}
				try {
					WebElement number2 = driver.findElement(By.xpath(" //span[text()=' " + displayNumber + " ']"));
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
					WebElement DocNO = driver.findElement(By.xpath("//td[contains(text(),'" + displayNumber + "')]"));
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
				String Documentinfoheader = driver.findElement(By.xpath("(//thead[@class='t-grid-header'])[1]/tr"))
						.getText();
				System.out.println(Documentinfoheader);
				try {
					WebElement TitleNumber = driver.findElement(By.xpath("//td[@id='tdPrimaryDocTitle']"));
					String actual = TitleNumber.getText();
					System.out.println(actual);

					if (actual.equals(DisplayNumbers)) {
						System.out.println("Pass");
					} else {
						System.out.println("Fail");
					}
				} catch (Exception e) {
					System.out.println("not able to validate");
					System.out.println("Exception : " + e);
				}
				try {
					WebElement Loctaion = driver.findElement(By.xpath(" //p[text()='  Unit-I']"));
					if (Loctaion.isDisplayed()) {
						System.out.println("Location name displayed");
					} else {
						System.out.println("Location name  not displayed");
					}
				} catch (Exception e) {
					System.out.println("not able  to validate expected location department element");
					System.out.println("Exception : " + e);
				}
				try {
					WebElement department = driver.findElement(By.xpath(" //p[text()='  Quality Assurance']"));
					if (department.isDisplayed()) {
						System.out.println("department is displayed");
					} else {
						System.out.println("department not displayed");
					}
				} catch (Exception e) {
					System.out.println("not able  to validate expected location department element");
					System.out.println("Exception : " + e);
				}
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
				WebElement user1 = driver.findElement(By.xpath("//td[text()='U']"));
				WebElement AssetS = driver.findElement(By.xpath("//td[text()='A']"));
				try {
					WebElement product1 = driver.findElement(By.xpath("//td[text()='P']"));
					if (product1.isDisplayed()) {
						System.out.println("product displayed");
					} else {
						System.out.println("product not displayed");
					}
				} catch (Exception e) {
					System.out.println("not able to validate");
					System.out.println("Exception : " + e);
				}
				try {
					WebElement MaterialS = driver.findElement(By.xpath("//td[text()='M']"));
					if (MaterialS.isDisplayed()) {
						System.out.println("Material displayed");
					} else {
						System.out.println("Material not displayed");
					}
				} catch (Exception e) {
					System.out.println("not able to validate");
					System.out.println("Exception : " + e);
				}
				try {
					if (user1.isDisplayed()) {
						System.out.println("user displayed");
					} else {
						System.out.println("user not displayed");
					}
				} catch (Exception e) {
					System.out.println("not able to validate");
					System.out.println("Exception : " + e);
				}
				try {
					if (AssetS.isDisplayed()) {
						System.out.println("user name displayed");
					} else {
						System.out.println("user name not displayed");
					}
				} catch (Exception e) {
					System.out.println("not able to validate");
					System.out.println("Exception : " + e);
				}
//						try {
//							WebElement productname = driver.findElement(By.xpath("//td[text()='" + Productss + "']"));
//							if (productname.isDisplayed()) {
//								System.out.println("product name displayed");
//							} else {
//								System.out.println("product name not displayed");
//							}
//						} catch (Exception e) {
//							System.out.println("not able to validate");
//							System.out.println("Exception : " + e);
//						}
				// WebElement Materialname
				// =driver.findElement(By.xpath("//td[text()='"+MateriaL+"']"));
				// if(Materialname.isDisplayed()) {
//						System.out.println("Material name displayed");
				// }else {
//						System.out.println("Material name not displayed");
				//
//						// }
//						try {
//							WebElement Users = driver.findElement(By.xpath("//td[text()='" + Reviewer1username + "']"));
//							if (Users.isDisplayed()) {
//								System.out.println("USER name displayed");
//							} else {
//								System.out.println("USER name not displayed");
//							}
//						} catch (Exception e) {
//							System.out.println("not able to validate");
//							System.out.println("Exception : " + e);
//						}
//						try {
//							WebElement Assets = driver.findElement(By.xpath("//td[text()='"+asset+"']"));
//							if (Assets.isDisplayed()) {
//								System.out.println("Assets name displayed");
//							} else {
//								System.out.println("Assets name not displayed");
//							}
//						} catch (Exception e) {
//							System.out.println("not able to validate");
//							System.out.println("Exception : " + e);
//						}
				// settings
				try {
					WebElement setting = driver.findElement(By.xpath("//td[@id='tdLayout']"));
					if (setting.isDisplayed()) {
						System.out.println("setting is displayed");
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
				String parentwindow11 = driver.getWindowHandle();
				driver.findElement(By.xpath("(//img[@title='View Document'])[1]")).click();
				String Childwindow11 = driver.getWindowHandle();
				Thread.sleep(3000);
				driver.switchTo().window(parentwindow11);
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
					WebElement AssoFile = driver.findElement(By.xpath(
							"//table[@id='jsonTblAssDocs']//th[@class='t-header wid5pc'][normalize-space()='File']"));
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
				try {
					WebElement changedetails = driver.findElement(By.xpath("//span[text()='Change Control Number']"));
					if (changedetails.isDisplayed()) {
						System.out.println("Change detail header is displayed");
					} else {
						System.out.println("change detail header is not displayed");
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
					WebElement statuscahnge = driver.findElement(By.xpath("(//span[text()='Status'])[2]"));
					if (statuscahnge.isDisplayed()) {
						System.out.println("status is displayed");
					} else {
						System.out.println("status not displayed");
					}
				} catch (Exception e) {
					System.out.println("not able to validate");
					System.out.println("Exception : " + e);
				}
//						try {
//			S				WebElement filechangecontrol = driver.findElement(By.xpath("(//span[text()='File'])[1]"));
//							if (filechangecontrol.isDisplayed()) {
//								System.out.println("filechangecontrol header is displayed");
//							} else {
//								System.out.println("filechangecontrol header is not displayed");
//							}
//						} catch (Exception e) {
//							System.out.println("not able to validate");
//							System.out.println("Exception : " + e);
//						}
//						try {
//							WebElement chngecontrolID = driver.findElement(By.xpath("(//td[text()=' " + Changecontrolnumber + " '])[2]"));
//							if (chngecontrolID.isDisplayed()) {
//								System.out.println("Change control ID is displayed");
//							} else {
//								System.out.println("Change control ID is not displayed");
//							}
//						} catch (Exception e) {
//							System.out.println("not able to validate");
//							System.out.println("Exception : " + e);
//						}
//						try {
//							WebElement changecontroldiscription = driver
//									.findElement(By.xpath("//td[text()='" + ChangeDiscription + "']"));
//							if (changecontroldiscription.isDisplayed()) {
//								System.out.println("change control discription is displayed");
//							} else {
//								System.out.println("change control discription displayed");
//							}
//						} catch (Exception e) {
//							System.out.println("not able to validate");
//							System.out.println("Exception : " + e);
//						}
//						Thread.sleep(500);
//						String Changeparentwindow = driver.getWindowHandle();
//						System.out.println(parentwindow);
//						driver.findElement(By.xpath("(//img[@title='View Document'])[2]")).click();
//						String ChangeChildwindow = driver.getWindowHandle();
//						System.out.println(Childwindow);
//						Thread.sleep(5000);
//						driver.switchTo().window(Changeparentwindow);
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
				try {
					String StringExpectedstep1 = "Task for Non-Signatory Reviewers";
					WebElement Nonsignatory = driver.findElement(By.xpath(
							"(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[1]/td[text()='Task for Non-Signatory Reviewers']"));
					if (Nonsignatory.isDisplayed()) {
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
					String StringExpectedstep2 = "Default Tasks for Reviewers";
					WebElement TaskReviewers = driver.findElement(By.xpath(
							"(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[2]/td[text()='Default Tasks for Reviewers']"));
					if (TaskReviewers.isDisplayed()) {
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
							"(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[2]/td[text()='Pending']"));
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
					String StringExpectedstep3 = "Approval 1";
					WebElement TaskApproverd = driver.findElement(By.xpath(
							"(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[3]/td[text()='Approval 1']"));
					if (TaskApproverd.isDisplayed()) {
						System.out.println("Default Tasks for Reviewers dispalyed");
					} else {
						System.out.println("Default Tasks for Reviewers not dispalyed");
					}
				} catch (Exception e) {
					System.out.println("not able to validate");
					System.out.println("Exception : " + e);
				}
				try {
					WebElement ApproverAction = driver.findElement(By.xpath(
							"(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[3]/td[text()='Pending']"));
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
				CM.enteringDataintoTextfiledByXpath(EL.eleRemarksinput_XP, NonsignatoryRemarks, " Reviewer1remarks");
				try {
					wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//select[@id='Decision']")));
					Select select = new Select(driver.findElement(By.xpath("//select[@id='Decision']")));
					try {
						select.selectByVisibleText(Decision1);
					} catch (StaleElementReferenceException e) {
						select.selectByVisibleText(Decision1);
					}
					if (Decision1.equals("Approve")) {
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
						CM.enteringDataintoTextfiledByXpath(EL.eleUserName_XP, Reviewer1username, " Non signatory user");
						CM.enteringDataintoTextfiledByXpath(EL.elePassword_XP, Password, "Password");
						CM.clickonElementbyXpath(EL.eleLogin_XP, "LOGIN");
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
							WebElement Submission = driver.findElement(By.xpath("//span[text()=' " + displayNumber
									+ " ']/parent::td/parent::tr/td[text()='" + ApprovalType + "']"));
							if (Submission.isDisplayed()) {
								System.out.println("document submission is displayed");
							} else {
								System.out.println("Document submission is not displayed");
							}
						} catch (Exception e) {
							System.out.println("not able to validate");
							System.out.println("Exception : " + e);
						}
						try {
							WebElement initiatedby = driver.findElement(By.xpath("//span[text()=' " + displayNumber
									+ " ']/parent::td/following-sibling::td[text()='" + initiatedBy + " ']"));
							if (initiatedby.isDisplayed()) {
								System.out.println("initiatedby " + initiatedBy);
							} else {
								System.out.println("initiatedby is not displayed");
							}
						} catch (Exception e) {
							System.out.println("not able to validate");
							System.out.println("Exception : " + e);
						}
						try {
							WebElement initiatedby = driver.findElement(By.xpath("//span[text()=' " + displayNumber
									+ " ']/parent::td/following-sibling::td[text()='" + Date + "']"));
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
							WebElement titlenemes = driver.findElement(By.xpath("(//span[text()=' " + displayNumber
									+ " ']/parent::td/following-sibling::td//div[text()='" + Title + "'])[2]"));
							if (titlenemes.isDisplayed()) {
								System.out.println("title name displayed");
							} else {
								System.out.println("title name not displayed");
							}
						} catch (Exception e) {
							System.out.println("not able to validate");
							System.out.println("Exception : " + e);
						}
						try {
							WebElement number2 = driver.findElement(By.xpath(" //span[text()=' " + displayNumber + " ']"));
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
							WebElement DocNO = driver.findElement(By.xpath("//table[@id='tblDetails']/tbody/tr[2]/td[2]"));
							if (DocNO.equals(displayNumber)) {
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
						String Documentinfoheader1 = driver.findElement(By.xpath("(//thead[@class='t-grid-header'])[1]/tr"))
								.getText();
						System.out.println(Documentinfoheader1);
						try {
							WebElement TitleNumber = driver.findElement(By.xpath("//td[@id='tdPrimaryDocTitle']"));
							String actual = TitleNumber.getText();
							System.out.println(actual);
							if (actual.equals(DisplayNumbers)) {
								System.out.println("Pass");
							} else {
								System.out.println("Fail");
							}
						} catch (Exception e) {
							System.out.println("not able to validate");
							System.out.println("Exception : " + e);
						}
						try {
							WebElement Loctaion = driver.findElement(By.xpath(" //p[text()='  Unit-I']"));
							if (Loctaion.isDisplayed()) {
								System.out.println("Location name displayed");
							} else {
								System.out.println("Location name  not displayed");
							}
						} catch (Exception e) {
							System.out.println("not able  to validate expected location department element");
							System.out.println("Exception : " + e);
						}
						try {
							WebElement department = driver.findElement(By.xpath(" //p[text()='  Quality Assurance']"));
							if (department.isDisplayed()) {
								System.out.println("department is displayed");
							} else {
								System.out.println("department not displayed");
							}
						} catch (Exception e) {
							System.out.println("not able  to validate expected location department element");
							System.out.println("Exception : " + e);
						}				// classifications
						try {
							boolean category = driver
									.findElement(
											By.xpath("(//td[@id='tdPrimaryDocClassification']/table/tbody/tr/td/b)[1]"))
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
									.findElement(
											By.xpath("(//td[@id='tdPrimaryDocClassification']/table/tbody/tr/td/b)[2]"))
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
									.findElement(
											By.xpath("(//td[@id='tdPrimaryDocClassification']/table/tbody/tr/td/b)[3]"))
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
						try {
							WebElement productd = driver.findElement(By.xpath("//td[text()='P']"));
							if (productd.isDisplayed()) {
								System.out.println("product displayed");
							} else {
								System.out.println("product not displayed");
							}
						} catch (Exception e) {
							System.out.println("not able to validate");
							System.out.println("Exception : " + e);
						}
						try {
							WebElement MaterialS = driver.findElement(By.xpath("//td[text()='M']"));
							if (MaterialS.isDisplayed()) {
								System.out.println("Material displayed");
							} else {
								System.out.println("Material not displayed");
							}
						} catch (Exception e) {
							System.out.println("not able to validate");
							System.out.println("Exception : " + e);
						}
//								try {
//									if (user.isDisplayed()) {
//										System.out.println("user displayed");
//									} else {
//										System.out.println("user not displayed");
//									}
//								} catch (StaleElementReferenceException e ) {
//									
//									 driver.findElement(By.xpath("//td[text()='U']")).isDisplayed();
//										System.out.println("user displayed");						
//								}
//								try {
//									if (AssetS.isDisplayed()) {
//										System.out.println("user name displayed");
//									} else {
//										System.out.println("user name not displayed");
//									}
//								} catch (Exception e) {
//									System.out.println("not able to validate");
//									System.out.println("Exception : " + e);
//								}
//								try {
//									WebElement productname = driver.findElement(By.xpath("//td[text()='" + Productss + "']"));
//									if (productname.isDisplayed()) {
//										System.out.println("product name displayed");
//									} else {
//										System.out.println("product name not displayed");
//									}
//								} catch (Exception e) {
//									System.out.println("not able to validate");
//									System.out.println("Exception : " + e);
//								}
						// WebElement Materialname
						// =driver.findElement(By.xpath("//td[text()='"+MateriaL+"']"));
						// if(Materialname.isDisplayed()) {
//								System.out.println("Material name displayed");
						// }else {
//								System.out.println("Material name not displayed");
						//
						// }
//								try {
//									WebElement Users = driver.findElement(By.xpath("//td[text()='" + Reviewer1username + "']"));
//									if (Users.isDisplayed()) {
//										System.out.println("USER name displayed");
//									} else {
//										System.out.println("USER name not displayed");
//									}
//								} catch (Exception e) {
//									System.out.println("not able to validate");
//									System.out.println("Exception : " + e);
//								}
//								try {
//									WebElement Assets = driver.findElement(By.xpath("//td[text()='"+asset+"']"));
//									if (Assets.isDisplayed()) {
//										System.out.println("Assets name displayed");
//									} else {
//										System.out.println("Assets name not displayed");
//									}
//								} catch (Exception e) {
//									System.out.println("not able to validate");
//									System.out.println("Exception : " + e);
//								}
						try {
							WebElement setting = driver.findElement(By.xpath("//td[@id='tdLayout']"));
							System.out.println(setting);
							if (setting.isDisplayed()) {
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
						driver.findElement(By.xpath("(//img[@title='View Document'])[1]")).click();
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
						driver.findElement(By.xpath("//img[@id='btnUncontrolledPrint']")).click();
						Thread.sleep(3000);
						driver.switchTo().window(parentwindow1);
						try {
							driver.findElement(By.xpath("//input[@value='Change History']")).isDisplayed();
						} catch (Exception e) {
							System.out.println("not able to validate");
							System.out.println("Exception : " + e);
						}
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
							WebElement AssoFile = driver.findElement(By.xpath(
									"//table[@id='jsonTblAssDocs']//th[@class='t-header wid5pc'][normalize-space()='File']"));
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
						try {
							WebElement changedetails = driver
									.findElement(By.xpath("//span[text()='Change Control Number']"));
							if (changedetails.isDisplayed()) {
								System.out.println("Change detail header is displayed");
							} else {
								System.out.println("change detail header is not displayed");
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
							WebElement statuscahnge = driver.findElement(By.xpath("(//span[text()='Status'])[2]"));
							if (statuscahnge.isDisplayed()) {
								System.out.println("status is displayed");
							} else {
								System.out.println("status not displayed");
							}
						} catch (Exception e) {
							System.out.println("not able to validate");
							System.out.println("Exception : " + e);
						}
//								try {
//					S				WebElement filechangecontrol = driver.findElement(By.xpath("(//span[text()='File'])[1]"));
//									if (filechangecontrol.isDisplayed()) {
//										System.out.println("filechangecontrol header is displayed");
//									} else {
//										System.out.println("filechangecontrol header is not displayed");
//									}
//								} catch (Exception e) {
//									System.out.println("not able to validate");
//									System.out.println("Exception : " + e);
//								}
//								try {
//									WebElement chngecontrolID = driver.findElement(By.xpath("(//td[text()=' " + Changecontrolnumber + " '])[2]"));
//									if (chngecontrolID.isDisplayed()) {
//										System.out.println("Change control ID is displayed");
//									} else {
//										System.out.println("Change control ID is not displayed");
//									}
//								} catch (Exception e) {
//									System.out.println("not able to validate");
//									System.out.println("Exception : " + e);
//								}
//								try {
//									WebElement changecontroldiscription = driver
//											.findElement(By.xpath("//td[text()='" + ChangeDiscription + "']"));
//									if (changecontroldiscription.isDisplayed()) {
//										System.out.println("change control discription is displayed");
//									} else {
//										System.out.println("change control discription displayed");
//									}
//								} catch (Exception e) {
//									System.out.println("not able to validate");
//									System.out.println("Exception : " + e);
//								}
//								Thread.sleep(500);
//								String Changeparentwindow = driver.getWindowHandle();
//								System.out.println(parentwindow);
//								driver.findElement(By.xpath("(//img[@title='View Document'])[2]")).click();
//								String ChangeChildwindow = driver.getWindowHandle();
//								System.out.println(Childwindow);
//								Thread.sleep(5000);
//								driver.switchTo().window(Changeparentwindow);
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
						try {
							String StringExpectsstep1 = "Task for Non-Signatory Reviewers";
							WebElement Nonsignatas = driver.findElement(By.xpath(
									"(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[1]/td[text()='Task for Non-Signatory Reviewers']"));
							if (Nonsignatas.isDisplayed()) {
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
							WebElement actedBYNONSIGNATORY = driver.findElement(By
									.xpath("(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[1]/td[text()='"
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
							String NonSignatoryApprovedondate = driver
									.findElement(By.xpath(
											"(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[1]/td[5]"))
									.getText();
							System.out.println(NonSignatoryApprovedondate);
						} catch (Exception e) {
							System.out.println("not able to validate");
							System.out.println("Exception : " + e);
						}
						try {
							WebElement nonsigRemarkss = driver.findElement(By
									.xpath("(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[1]/td[text()='"
											+ NonsignatoryRemarks + "']"));
							if (nonsigRemarkss.isDisplayed()) {
								System.out.println("Non signatory remarks" + NonsignatoryRemarks);
							} else {
								System.out.println("Non signatory remarks" + NonsignatoryRemarks + "not displayed");
							}
						} catch (Exception e) {
							System.out.println("not able to validate");
							System.out.println("Exception : " + e);
						}
						try {
							String StringExpectdstep2 = "Default Tasks for Reviewers";
							WebElement TaskReviewerd = driver.findElement(By.xpath(
									"(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[2]/td[text()='Default Tasks for Reviewers']"));
							if (TaskReviewerd.isDisplayed()) {
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
							if (ReviewerAction.isDisplayed()) {
								System.out.println(" reviewer action Approved ");
							} else {
								System.out.println(" reviewer action not showing ");
							}
						} catch (Exception e) {
							System.out.println("not able to validate");
							System.out.println("Exception : " + e);
						}
						try {
							WebElement actedBYReviewer = driver.findElement(By
									.xpath("(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[2]/td[text()='"
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
							String StringExpectdstep3 = "Approval 1";
							WebElement TaskApprovers = driver.findElement(By.xpath(
									"(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[3]/td[text()='Approval 1']"));
							if (TaskApprovers.isDisplayed()) {
								System.out.println("Default Tasks for Reviewers dispalyed");
							} else {
								System.out.println("Default Tasks for Reviewers not dispalyed");
							}
						} catch (Exception e) {
							System.out.println("not able to validate");
							System.out.println("Exception : " + e);
						}
						try {
							WebElement ApproverAction = driver.findElement(By.xpath(
									"(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[3]/td[text()='Pending']"));
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
							WebElement actedBYApprover = driver.findElement(By
									.xpath("(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[3]/td[text()='"
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
						CM.enteringDataintoTextfiledByXpath(EL.eleRemarksinput_XP, NonsignatoryRemarks,
								" Reviewer1remarks");
						try {
							select.selectByVisibleText(Decision2);
						} catch (StaleElementReferenceException e) {
							Select select2 = new Select(driver.findElement(By.xpath("//select[@id='Decision']")));
							select2.selectByVisibleText(Decision2);
							Thread.sleep(3000);

						}
						try {
							if (Decision2.equals("Approve")) {
								System.out.println(" Reviewer submission flow Approved");
								CM.clickonElementbyXpath(EL.elebtnComplete_XP, "Complete");
								driver.switchTo().alert().accept();
								Thread.sleep(2000);
								driver.switchTo().alert().accept();
								Thread.sleep(2000);
								CM.clickonElementbyXpath(EL.eleUsersetting_XP, "USER SETTINGS");
								Thread.sleep(500);
								CM.clickonElementbyXpath(EL.eleLogout_XP, "Log out");
								Thread.sleep(500);
								CM.enteringDataintoTextfiledByXpath(EL.eleUserName_XP, Reviewer2username,
										" Non signatory user");
								CM.enteringDataintoTextfiledByXpath(EL.elePassword_XP, Password, "Password");
								CM.clickonElementbyXpath(EL.eleLogin_XP, "LOGIN");
								Thread.sleep(3000);
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
									WebElement Submission = driver.findElement(By.xpath("//span[text()=' " + displayNumber
											+ " ']/parent::td/parent::tr/td[text()='" + ApprovalType + "']"));
									if (Submission.isDisplayed()) {
										System.out.println("document submission is displayed");
									} else {
										System.out.println("Document submission is not displayed");
									}
								} catch (Exception e) {
									System.out.println("not able to validate");
									System.out.println("Exception : " + e);
								}
								try {
									WebElement initiatedby = driver.findElement(By.xpath("//span[text()=' " + displayNumber
											+ " ']/parent::td/following-sibling::td[text()='" + initiatedBy + " ']"));
									if (initiatedby.isDisplayed()) {
										System.out.println("initiatedby " + initiatedBy);
									} else {
										System.out.println("initiatedby is not displayed");
									}
								} catch (Exception e) {
									System.out.println("not able to validate");
									System.out.println("Exception : " + e);
								}
								try {
									WebElement initiatedby = driver.findElement(By.xpath("//span[text()=' " + displayNumber
											+ " ']/parent::td/following-sibling::td[text()='" + Date + "']"));
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
									WebElement titlenemes = driver.findElement(By.xpath("(//span[text()=' " + displayNumber
											+ " ']/parent::td/following-sibling::td//div[text()='" + Title + "'])[2]"));
									if (titlenemes.isDisplayed()) {
										System.out.println("title name displayed");
									} else {
										System.out.println("title name not displayed");
									}
								} catch (Exception e) {
									System.out.println("not able to validate");
									System.out.println("Exception : " + e);
								}
								try {
									WebElement number2 = driver
											.findElement(By.xpath(" //span[text()=' " + displayNumber + " ']"));
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
									WebElement DocNO = driver
											.findElement(By.xpath("//table[@id='tblDetails']/tbody/tr[2]/td[2]"));
									if (DocNO.equals(displayNumber)) {
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
								String Documentinfoheader2 = driver
										.findElement(By.xpath("(//thead[@class='t-grid-header'])[1]/tr")).getText();
								System.out.println(Documentinfoheader2);
								try {
									WebElement TitleNumber = driver.findElement(By.xpath("//td[@id='tdPrimaryDocTitle']"));
									String actual = TitleNumber.getText();
									System.out.println(actual);
									if (actual.equals(DisplayNumbers)) {
										System.out.println("Pass");
									} else {
										System.out.println("Fail");
									}
								} catch (Exception e) {
									System.out.println("not able to validate");
									System.out.println("Exception : " + e);
								}
								try {
									String locationdepartment = driver
											.findElement(By.xpath("//td[@id='tdPrimaryDocLocationAndDepartment']"))
											.getText();
									System.out.println(locationdepartment);
									if (locationdepartment.equals(DisplayNumbers)) {
										System.out.println("expected location departmentn correct");
									} else {
										System.out.println("expected location department incorrect");
									}
								} catch (Exception e) {
									System.out.println("not able  to validate expected location department element");
									System.out.println("Exception : " + e);
								}
								try {
									boolean category = driver
											.findElement(By.xpath(
													"(//td[@id='tdPrimaryDocClassification']/table/tbody/tr/td/b)[1]"))
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
											.findElement(By.xpath(
													"(//td[@id='tdPrimaryDocClassification']/table/tbody/tr/td/b)[2]"))
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
											.findElement(By.xpath(
													"(//td[@id='tdPrimaryDocClassification']/table/tbody/tr/td/b)[3]"))
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
									WebElement categoryname = driver
											.findElement(By.xpath("//td[text()='" + Category + "']"));
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
									WebElement subcategoryname = driver
											.findElement(By.xpath("//td[text()='" + Subcategory + "']"));
									if (subcategoryname.isDisplayed()) {
										System.out.println("subcategory name displayed");
									} else {
										System.out.println("subcategory name not displayed");
									}
								} catch (Exception e) {
									System.out
											.println("not able  to validate expected subcategory name   displayed element");
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
								try {
									WebElement producta = driver.findElement(By.xpath("//td[text()='P']"));
									if (producta.isDisplayed()) {
										System.out.println("product displayed");
									} else {
										System.out.println("product not displayed");
									}
								} catch (Exception e) {
									System.out.println("not able to validate");
									System.out.println("Exception : " + e);
								}
								try {
									WebElement MaterialS = driver.findElement(By.xpath("//td[text()='M']"));
									if (MaterialS.isDisplayed()) {
										System.out.println("Material displayed");
									} else {
										System.out.println("Material not displayed");
									}
								} catch (Exception e) {
									System.out.println("not able to validate");
									System.out.println("Exception : " + e);
								}
//										try {
//											if (user.isDisplayed()) {
//												System.out.println("user displayed");
//											} else {
//												System.out.println("user not displayed");
//											}
//										} catch (Exception e) {
//											System.out.println("not able to validate");
//											System.out.println("Exception : " + e);
//										}
//										try {
//											if (AssetS.isDisplayed()) {
//												System.out.println("user name displayed");
//											} else {
//												System.out.println("user name not displayed");
//											}
//										} catch (Exception e) {
//											System.out.println("not able to validate");
//											System.out.println("Exception : " + e);
//										}
//										try {
//											WebElement productname = driver.findElement(By.xpath("//td[text()='" + Products + "']"));
//											if (productname.isDisplayed()) {
//												System.out.println("product name displayed");
//											} else {
//												System.out.println("product name not displayed");
//											}
//										} catch (Exception e) {
//											System.out.println("not able to validate");
//											System.out.println("Exception : " + e);
//										}
								// WebElement Materialname
								// =driver.findElement(By.xpath("//td[text()='"+MateriaL+"']"));
								// if(Materialname.isDisplayed()) {
//										System.out.println("Material name displayed");
								// }else {
//										System.out.println("Material name not displayed");
								//
								// }
//											try {
//										WebElement Users = driver.findElement(By.xpath("//td[text()='" + Reviewer1username + "']"));
//										if (Users.isDisplayed()) {
//											System.out.println("USER name displayed");
//										} else {
//											System.out.println("USER name not displayed");
//										}
//									} catch (Exception e) {
//										System.out.println("not able to validate");
//										System.out.println("Exception : " + e);
//									}
//									try {
//										WebElement Assets = driver.findElement(By.xpath("//td[text()='"+asset+"']"));
//										if (Assets.isDisplayed()) {
//											System.out.println("Assets name displayed");
//										} else {
//											System.out.println("Assets name not displayed");
//										}
//									} catch (Exception e) {
//										System.out.println("not able to validate");
//										System.out.println("Exception : " + e);
//									}
								// settings
								try {
									WebElement setting = driver.findElement(By.xpath("//td[@id='tdLayout']"));
									System.out.println(setting);
									if (setting.isDisplayed()) {
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
								driver.findElement(By.xpath("(//img[@title='View Document'])[1]")).click();
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
								driver.findElement(By.xpath("//img[@id='btnUncontrolledPrint']")).click();
								Thread.sleep(3000);
								driver.switchTo().window(parentwindow1);
								try {
									driver.findElement(By.xpath("//input[@value='Change History']")).isDisplayed();
								} catch (Exception e) {
									System.out.println("not able to validate");
									System.out.println("Exception : " + e);
								}
								try {
									WebElement Associated = driver
											.findElement(By.xpath("//h1[text()='Associated Documents']"));
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
										System.out
												.println("ASSOCIATED DOCUMENTS location & department header is displayed");
									} else {
										System.out.println(
												"ASSOCIATED DOCUMENTS location & department header is not displayed ");
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
									WebElement AssoFile = driver.findElement(By.xpath(
											"//table[@id='jsonTblAssDocs']//th[@class='t-header wid5pc'][normalize-space()='File']"));
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
//								try {
//									WebElement changedetails = driver
//											.findElement(By.xpath("//span[text()='Change Control Number']"));
//									if (changedetails.isDisplayed()) {
//										System.out.println("Change detail header is displayed");
//									} else {
//										System.out.println("change detail header is not displayed");
//									}
//								} catch (Exception e) {
//									System.out.println("not able to validate");
//									System.out.println("Exception : " + e);
//								}
//								try {
//									WebElement changedis = driver
//											.findElement(By.xpath("(//span[text()='Description'])[2]"));
//									if (changedis.isDisplayed()) {
//										System.out.println("change control discription header is displayed");
//									} else {
//										System.out.println("change control discription  header not displayed");
//									}
//								} catch (Exception e) {
//									System.out.println("not able to validate");
//									System.out.println("Exception : " + e);
//								}
//								try {
//									WebElement statuscahnge = driver.findElement(By.xpath("(//span[text()='Status'])[2]"));
//									if (statuscahnge.isDisplayed()) {
//										System.out.println("status is displayed");
//									} else {
//										System.out.println("status not displayed");
//									}
//								} catch (Exception e) {
//									System.out.println("not able to validate");
//									System.out.println("Exception : " + e);
//								}
//										try {
//							S				WebElement filechangecontrol = driver.findElement(By.xpath("(//span[text()='File'])[1]"));
//											if (filechangecontrol.isDisplayed()) {
//												System.out.println("filechangecontrol header is displayed");
//											} else {
//												System.out.println("filechangecontrol header is not displayed");
//											}
//										} catch (Exception e) {
//											System.out.println("not able to validate");
//											System.out.println("Exception : " + e);
//										}
//										try {
//											WebElement chngecontrolID = driver.findElement(By.xpath("(//td[text()=' " + Changecontrolnumber + " '])[2]"));
//											if (chngecontrolID.isDisplayed()) {
//												System.out.println("Change control ID is displayed");
//											} else {
//												System.out.println("Change control ID is not displayed");
//											}
//										} catch (Exception e) {
//											System.out.println("not able to validate");
//											System.out.println("Exception : " + e);
//										}
//										try {
//											WebElement changecontroldiscription = driver
//													.findElement(By.xpath("//td[text()='" + ChangeDiscription + "']"));
//											if (changecontroldiscription.isDisplayed()) {
//												System.out.println("change control discription is displayed");
//											} else {
//												System.out.println("change control discription displayed");
//											}
//										} catch (Exception e) {
//											System.out.println("not able to validate");
//											System.out.println("Exception : " + e);
//										}
//										Thread.sleep(500);
//										String Changeparentwindow = driver.getWindowHandle();
//										System.out.println(parentwindow);
//										driver.findElement(By.xpath("(//img[@title='View Document'])[2]")).click();
//										String ChangeChildwindow = driver.getWindowHandle();
//										System.out.println(Childwindow);
//										Thread.sleep(5000);
//										driver.switchTo().window(Changeparentwindow);
								// Approval history
								try {
									WebElement approvalhistory = driver
											.findElement(By.xpath("//h1[text()='Approval History']"));
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
									WebElement initiatedby = driver
											.findElement(By.xpath("//td[text()='" + initiatedBy + "']"));
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
								try {
									String StringExpectdstep1 = "Task for Non-Signatory Reviewers";
									WebElement Nonsignatas = driver.findElement(By.xpath(
											"(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[1]/td[text()='Task for Non-Signatory Reviewers']"));

									if (Nonsignatas.isDisplayed()) {
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
									WebElement actedBYNONSIGNATORY = driver.findElement(By.xpath(
											"(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[1]/td[text()='"
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
									String NonSignatoryApprovedondate = driver.findElement(By.xpath(
											"(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[1]/td[5]"))
											.getText();
									System.out.println(NonSignatoryApprovedondate);
								} catch (Exception e) {
									System.out.println("not able to validate");
									System.out.println("Exception : " + e);
								}
								try {
									WebElement nonsigRemarkss = driver.findElement(By.xpath(
											"(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[1]/td[text()='"
													+ NonsignatoryRemarks + "']"));
									if (nonsigRemarkss.isDisplayed()) {
										System.out.println("Non signatory remarks" + NonsignatoryRemarks);
									} else {
										System.out.println("Non signatory remarks" + NonsignatoryRemarks + "not displayed");
									}
								} catch (Exception e) {
									System.out.println("not able to validate");
									System.out.println("Exception : " + e);
								}
								try {
									String StringExpecststep2 = "Default Tasks for Reviewers";
									WebElement TaskReviewers = driver.findElement(By.xpath(
											"(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[2]/td[text()='Default Tasks for Reviewers']"));
									if (TaskReviewers.isDisplayed()) {
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
									if (ReviewerAction.isDisplayed()) {
										System.out.println(" reviewer action Approved ");
									} else {
										System.out.println(" reviewer action not showing ");
									}
								} catch (Exception e) {
									System.out.println("not able to validate");
									System.out.println("Exception : " + e);
								}
								try {
									WebElement actedBYReviewer = driver.findElement(By.xpath(
											"(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[2]/td[text()='"
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
									String StringExpectdstep3 = "Approval 1";
									WebElement TaskApproverd = driver.findElement(By.xpath(
											"(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[3]/td[text()='Approval 1']"));
									if (TaskApproverd.isDisplayed()) {
										System.out.println("Default Tasks for Reviewers dispalyed");
									} else {
										System.out.println("Default Tasks for Reviewers not dispalyed");
									}
								} catch (Exception e) {
									System.out.println("not able to validate");
									System.out.println("Exception : " + e);
								}
								try {
									WebElement ApproverAction = driver.findElement(By.xpath(
											"(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[3]/td[text()='Approved']"));
									if (ApproverAction.isDisplayed()) {
										System.out.println(" reviewer action Approved ");
									} else {
										System.out.println(" reviewer action not showing ");
									}
								} catch (Exception e) {
									System.out.println("not able to validate");
									System.out.println("Exception : " + e);
								}
								try {
									WebElement actedBYApprover = driver.findElement(By.xpath(
											"(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[3]/td[text()='"
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
								CM.enteringDataintoTextfiledByXpath(EL.eleRemarksinput_XP, NonsignatoryRemarks,
										" Reviewer1remarks");
								try {
									select.selectByVisibleText(Decision2);
								} catch (StaleElementReferenceException e) {
									Select select2 = new Select(driver.findElement(By.xpath("//select[@id='Decision']")));
									select2.selectByVisibleText(Decision3);
									Thread.sleep(3000);

								}
								try {
									if (Decision3.equals("Approve")) {
										System.out.println("Approver submission flow Approved");
										CM.clickonElementbyXpath(EL.elebtnComplete_XP, "Complete");
										driver.switchTo().alert().accept();
										Thread.sleep(2000);
										driver.switchTo().alert().accept();
										Thread.sleep(2000);
										CM.clickonElementbyXpath(EL.eleUsersetting_XP, "USER SETTINGS");
										CM.clickonElementbyXpath(EL.eleLogout_XP, "Log out");
										Thread.sleep(1000);
										CM.enteringDataintoTextfiledByXpath(EL.eleUserName_XP, initiatorusername,
												" UserName");
										CM.enteringDataintoTextfiledByXpath(EL.elePassword_XP, Password, "Password");
										CM.clickonElementbyXpath(EL.eleLogin_XP, "LOGIN");
										Thread.sleep(5000);
										CM.clickonElementbyXpath(EL.elemenuicon_XP, "Menu icon");
										WebElement Documents = driver.findElement(By.xpath("//div[text()='Documents']"));
										AS.moveToElement(Documents).perform();
										Documents
												.findElement(By.xpath(
														"//span[@class='sub-tlt'][normalize-space()='" + Category + "']"))
												.click();
										Thread.sleep(4000);
										System.out.println("Analytical page opened");
										try {
											WebElement Displaynumber = driver
													.findElement(By.xpath("(//a[text()=' " + displayNumber + " '])[1]"));
											if (Displaynumber.isDisplayed()) {
												System.out.println("Displaynumber displayed");
												Displaynumber.click();
												System.out.println("document info page navigated");
											} else {
												System.out.println("Displaynumber not displayed");
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
											WebElement NonsignatoryAction = driver.findElement(By.xpath(
													"(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[1]/td[text()='"
															+ NonsignatoryRemarks + "']"));
											if (NonsignatoryAction.isDisplayed()) {
												System.out.println("Nonsignatory action Remarks " + NonsignatoryRemarks);
											} else {
												System.out.println("Nonsignatory action not showing ");
											}
										} catch (Exception e) {
											System.out.println("not able to validate");
											System.out.println("Exception : " + e);
										}
										try {
											WebElement Nonsignatoryattachedfile = driver.findElement(By.xpath(
													"(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[1]/td[7]/div/a"));
											if (Nonsignatoryattachedfile.isDisplayed()) {
												System.out.println("Nonsignatory Attached file");
											} else {
												System.out.println("Nonsignatory Attached file not showing ");
											}
										} catch (Exception e) {
											System.out.println("not able to validate");
											System.out.println("Exception : " + e);
										}
										try {
											WebElement Nonsignatoryattachedfileprintsymbal = driver.findElement(By.xpath(
													"(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[1]/td[7]/div/img"));
											if (Nonsignatoryattachedfileprintsymbal.isDisplayed()) {
												System.out.println("Nonsignatory Attached file withprint symbal");
											} else {
												System.out.println("Nonsignatory Attached file print symbal not showing ");
											}
										} catch (Exception e) {
											System.out.println("not able to validate");
											System.out.println("Exception : " + e);
										}
										
										
									
										try {
											WebElement ReviewerAction = driver.findElement(By.xpath(
													"(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[2]/td[text()='Approved']"));
											if (ReviewerAction.isDisplayed()) {
												System.out.println(" Reviewer action Approve ");
											} else {
												System.out.println(" Reviewer action not showing ");
											}
										} catch (Exception e) {
											System.out.println("not able to validate");
											System.out.println("Exception : " + e);
										}
										try {
											WebElement NonsignatoryAction = driver.findElement(By.xpath(
													"(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[2]/td[text()='"
															+ NonsignatoryRemarks + "']"));
											if (NonsignatoryAction.isDisplayed()) {
												System.out.println(" Reviewer action Remarks " + NonsignatoryRemarks);
											} else {
												System.out.println(" Reviewer action not showing ");
											}
										} catch (Exception e) {
											System.out.println("not able to validate");
											System.out.println("Exception : " + e);
										}
										
										try {
											WebElement Nonsignatoryattachedfile = driver.findElement(By.xpath(
													"(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[2]/td[7]/div/a"));
											if (Nonsignatoryattachedfile.isDisplayed()) {
												System.out.println("Nonsignatory Attached file");
											} else {
												System.out.println("Nonsignatory Attached file not showing ");
											}
										} catch (Exception e) {
											System.out.println("not able to validate");
											System.out.println("Exception : " + e);
										}
										try {
											WebElement Nonsignatoryattachedfileprintsymbal = driver.findElement(By.xpath(
													"(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[2]/td[7]/div/img"));
											if (Nonsignatoryattachedfileprintsymbal.isDisplayed()) {
												System.out.println("Nonsignatory Attached file withprint symbal");
											} else {
												System.out.println("Nonsignatory Attached file print symbal not showing ");
											}
										} catch (Exception e) {
											System.out.println("not able to validate");
											System.out.println("Exception : " + e);
										}
										
										
										
										try {
											WebElement ApproverAction = driver.findElement(By.xpath(
													"(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[3]/td[text()='Approved']"));
											if (ApproverAction.isDisplayed()) {
												System.out.println(" Approver action Approved ");
											} else {
												System.out.println(" Approver action not showing ");
											}
										} catch (Exception e) {
											System.out.println("not able to validate");
											System.out.println("Exception : " + e);
										}
										try {
											WebElement NonsignatoryAction = driver.findElement(By.xpath(
													"(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[3]/td[text()='"
															+ NonsignatoryRemarks + "']"));
											if (NonsignatoryAction.isDisplayed()) {
												System.out.println("Approver Remarks " + NonsignatoryRemarks);
											} else {
												System.out.println(" Approver action not showing ");
											}
										} catch (Exception e) {
											System.out.println("not able to validate");
											System.out.println("Exception : " + e);
										}
										try {
											WebElement Nonsignatoryattachedfile = driver.findElement(By.xpath(
													"(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[3]/td[7]/div/a"));
											if (Nonsignatoryattachedfile.isDisplayed()) {
												System.out.println("Nonsignatory Attached file");
											} else {
												System.out.println("Nonsignatory Attached file not showing ");
											}
										} catch (Exception e) {
											System.out.println("not able to validate");
											System.out.println("Exception : " + e);
										}
										try {
											WebElement Nonsignatoryattachedfileprintsymbal = driver.findElement(By.xpath(
													"(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[3]/td[7]/div/img"));
											if (Nonsignatoryattachedfileprintsymbal.isDisplayed()) {
												System.out.println("Nonsignatory Attached file withprint symbal");
											} else {
												System.out.println("Nonsignatory Attached file print symbal not showing ");
											}
										} catch (Exception e) {
											System.out.println("not able to validate");
											System.out.println("Exception : " + e);
										}
										try {
											WebElement Analyti = driver.findElement(By.xpath("//div[text()='An']"));
											Analyti.click();
											Thread.sleep(5000);
											System.out.println("doc info page close");
										} catch (Exception e) {
											System.out.println("not able to validate");
											System.out.println("Exception : " + e);
										}
										try {
											WebElement StatusApproved = driver.findElement(By.xpath("//a[text()=' " + displayNumber
													+ " ']/parent::td/following-sibling::td[7][text()='Approved']"));
											if(StatusApproved.isDisplayed()) {
												System.out.println(
														"Make effective Approvals after status = Approved");
											WebElement toggle = driver.findElement(By.xpath("//a[text()=' " + displayNumber
													+ " ']/parent::td/following-sibling::td/div[@class='inficon dotIcon']"));
											toggle.click();
											System.out.println("toggle clicked");
										try {
											WebElement Viewdoc = driver.findElement(By.xpath("//a[text()=' " + displayNumber
													+ " ']/parent::td/following-sibling::td/div[2]//a[text()='View Document']"));
											if (Viewdoc.isDisplayed()) {
												System.out.println("View Document displayed");
											} else {
												System.out.println("View Document not displayed");
											}
										} catch (Exception e) {
											System.out.println("not able to validate");
											System.out.println("Exception : " + e);
										}
										try {
											WebElement Uncontrol = driver.findElement(By.xpath("//a[text()=' "
													+ displayNumber
													+ " ']/parent::td/following-sibling::td/div[2]//a[text()='Uncontrolled Print']"));
											if (Uncontrol.isDisplayed()) {
												System.out.println("Uncontrolled Print displayed");
											} else {
												System.out.println("Uncontrolled Print not displayed");
											}
										} catch (Exception e) {
											System.out.println("not able to validate");
											System.out.println("Exception : " + e);
										}
										try {
											WebElement printhistory = driver.findElement(By.xpath("//a[text()=' "
													+ displayNumber
													+ " ']/parent::td/following-sibling::td/div[2]//a[text()='Print History']"));
											if (printhistory.isDisplayed()) {
												System.out.println("Print History displayed");
											} else {
												System.out.println("Print History not displayed");
											}
										} catch (Exception e) {
											System.out.println("not able to validate");
											System.out.println("Exception : " + e);
										}
										try {
											WebElement changehistory = driver.findElement(By.xpath("//a[text()=' "
													+ displayNumber
													+ " ']/parent::td/following-sibling::td/div[2]//a[text()='Change History']"));
											if (changehistory.isDisplayed()) {
												System.out.println("Change History displayed");
											} else {
												System.out.println("Change History not displayed");
											}
										} catch (Exception e) {
											System.out.println("not able to validate");
											System.out.println("Exception : " + e);
										}
										try {
											WebElement initiatechange = driver.findElement(By.xpath("//a[text()=' "
													+ displayNumber
													+ " ']/parent::td/following-sibling::td/div[2]//a[text()='Initiate Change']"));
											if (initiatechange.isDisplayed()) {
												System.out.println("Initiate Change displayed");
											} else {
												System.out.println("Initiate Change not displayed");
											}
										} catch (Exception e) {
											System.out.println("not able to validate");
											System.out.println("Exception : " + e);
										}
										try {
											WebElement makeeffe = driver.findElement(By.xpath("//a[text()=' "
													+ displayNumber
													+ " ']/parent::td/following-sibling::td/div[2]//a[text()='Make Effective']"));
												System.out.println("make effective displayed");
												makeeffe.click();
												System.out.println("clicked make effective option");
												CM.CheckElementDisplayedbyXpath(EL.eleDocEffectiveheader_XP,
														"DOCUMENT EFFECTIVE");
												CM.CheckElementDisplayedbyXpath(EL.eleTrainingassociatedheader_XP,
														"Training Associated");
												CM.CheckElementDisplayedbyXpath(EL.eleTraininID_XP, "Training Id");
												CM.CheckElementDisplayedbyXpath(EL.eleTrainingdiscription_XP,
														"Description");
												CM.CheckElementDisplayedbyXpath(EL.eleComDate_XP, "completion date");
												CM.CheckElementDisplayedbyXpath(EL.eleEvidance_XP, "Evidence");
												CM.CheckElementDisplayedbyXpath(EL.eleActionz_XP, "Action");
												CM.CheckElementDisplayedbyXpath(EL.eleEffectivedateheader_XP,
														"Effective Date header");
												CM.CheckElementDisplayedbyXpath(EL.eleEfffecivedates_XP, "Effective Date");
												CM.CheckElementDisplayedbyXpath(EL.eleEfffectiveDatemandatory_XP,
														"Effective Date *");
												CM.CheckElementDisplayedbyXpath(EL.elePrimaryparentdoc_XP,
														"Primary / parent doc");
												CM.CheckElementDisplayedbyXpath(EL.elePChangehistrory_XP,
														" change history");
												CM.CheckElementDisplayedbyXpath(EL.eleTitlem_XP, "Title");
												CM.CheckElementDisplayedbyXpath(EL.elelocationdep_XP, "Loc, Dep");
												CM.CheckElementDisplayedbyXpath(EL.eleaClassification_XP, "Classification");
												CM.CheckElementDisplayedbyXpath(EL.eleaAssociations_XP, "Associations");
												CM.CheckElementDisplayedbyXpath(EL.eleafile_XP, "File");
												CM.CheckElementDisplayedbyXpath(EL.eleAsssodoc_XP, "Associated Documents");
												CM.CheckElementDisplayedbyXpath(EL.eleassotitlenum_XP, "Title & Number");
												CM.CheckElementDisplayedbyXpath(EL.eleassodess_XP, "Description");
												CM.CheckElementDisplayedbyXpath(EL.eleAssolocdep_XP, "Loc, Dep");
												CM.CheckElementDisplayedbyXpath(EL.eleAssoclassiz_XP, "Classification");
												CM.CheckElementDisplayedbyXpath(EL.eleAssoclassi_XP, "Associations");
												CM.CheckElementDisplayedbyXpath(EL.eleAssoSetting_XP, "settings");
												CM.CheckElementDisplayedbyXpath(EL.eleAssociFile_XP, "Asso file");
												CM.CheckElementDisplayedbyXpath(EL.eleEffectiveclose_XP,
														"Effective page close option");
												try {
													WebElement Titlename = driver.findElement(By.xpath(
															"//div[@class='t-grid t-widget']//td[normalize-space(text())='"
																	+ Title + "']"));
													if (Titlename.isDisplayed()) {
														System.out.println("Title name displayed");
													} else {
														System.out.println("title name is not displayed");
													}
												} catch (Exception e) {
													System.out.println("not able to validate");
													System.out.println("Exception : " + e);
												}
												try {
													WebElement Locationname = driver.findElement(By.xpath(
															"//td[@id='tdPrimaryDocTitle']//p[contains(text(),'HHCL U-I')]"));
													if (Locationname.isDisplayed()) {
														System.out.println("Location name is displayed");
													} else {
														System.out.println("Location name not is displayed");
													}
												} catch (Exception e) {
													System.out.println("not able to validate");
													System.out.println("Exception : " + e);
												}
												try {
													WebElement Depname = driver.findElement(By.xpath(
															"//td[@id='tdPrimaryDocTitle']//p[contains(text(),'QA')]"));
													if (Depname.isDisplayed()) {
														System.out.println("Department name is displayed");
													} else {
														System.out.println("Department name not is displayed");
													}
												} catch (Exception e) {
													System.out.println("not able to validate");
													System.out.println("Exception : " + e);
												}
												try {
													WebElement Categorya = driver.findElement(
															By.xpath("//td[normalize-space()='" + Category + "']"));
													if (Categorya.isDisplayed()) {
														System.out.println("Category name is displayed");
													} else {
														System.out.println("Category name not is displayed");
													}
												} catch (Exception e) {
													System.out.println("not able to validate");
													System.out.println("Exception : " + e);
												}
												try {
													WebElement subCategorya = driver.findElement(
															By.xpath("//div[@class='t-grid t-widget']//td[text()='"
																	+ Subcategory + "']"));
													if (subCategorya.isDisplayed()) {
														System.out.println("subCategory name is displayed");
													} else {
														System.out.println("subCategory name not is displayed");
													}
												} catch (Exception e) {
													System.out.println("not able to validate");
													System.out.println("Exception : " + e);
												}
												try {
													WebElement Typea = driver.findElement(By.xpath(
															"//div[@class='t-grid t-widget']//td[text()='" + Type + "']"));
													if (Typea.isDisplayed()) {
														System.out.println("Type name is displayed");
													} else {
														System.out.println("Type name not is displayed");
													}
												} catch (Exception e) {
													System.out.println("not able to validate");
													System.out.println("Exception : " + e);
												}
												String parentwindows = driver.getWindowHandle();
												driver.findElement(By.xpath("(//img[@title='View Document'])[1]")).click();
												String Childwindows = driver.getWindowHandle();
												Thread.sleep(500);
												driver.switchTo().window(parentwindows);
												WebElement addTraining = driver
														.findElement(By.xpath("//input[@id='btnAddAssociatedTraining']"));
												if (addTraining.isDisplayed()) {
													addTraining.click();
													System.out.println("Trainind Add Button clicked");
													CM.CheckElementDisplayedbyXpath(EL.eletraininginfraheader_XP,
															"Training Information");
													CM.CheckElementDisplayedbyXpath(EL.eleaddtrainingheader_XP,
															"Add Training");
													CM.CheckElementDisplayedbyXpath(EL.eletrainingidheader_XP,
															"Training ID");
													CM.CheckElementDisplayedbyXpath(EL.eletrainingidmandatory_XP,
															"Training ID *");
													CM.CheckElementDisplayedbyXpath(EL.eleTrainingDiscription_XP,
															"Description");
													CM.CheckElementDisplayedbyXpath(EL.eleTrainindescripmandatory_XP,
															"Description * ");
													CM.CheckElementDisplayedbyXpath(EL.eleCompletiondate_XP,
															"Completion Date");
													CM.CheckElementDisplayedbyXpath(EL.eleCompleationdateman_XP,
															"Completion Date *");
													CM.CheckElementDisplayedbyXpath(EL.eleattachment_XP, "Attachment");
													CM.enteringDataintoTextfiledByXpath(EL.eletraingID_XP, TrainingID,
															"Training ID");
													Thread.sleep(1000);
													if (TrainingDiscription.length() > 6
															&& TrainingDiscription.length() < 150) {
														CM.enteringDataintoTextfiledByXpath(EL.eleTrainingDesc_XP,
																TrainingDiscription, "Training Discription");
														System.out.println("Location name " + TrainingDiscription.length());
													} else {
														CM.enteringDataintoTextfiledByXpath(EL.eleTrainingDesc_XP,
																TrainingDiscription, "Training Discription");
														driver.findElement(By
																.xpath("//div[@class='TrainingDescformError error-wrap']"))
																.click();
														boolean element = driver.findElement(By.xpath(
																"//div[text()='* Please Add a Description between 30 and 260 characters to Proceed Further']"))
																.isDisplayed();
														if (element) {
															System.out.println(
																	"//div[text()='* Please Add a Description between 30 and 260 characters to Proceed Further'");
														} else {
															System.out.println(
																	"//div[text()='* Please Add a Description between 30 and 260 characters to Proceed Further' is Not Displaying");
														}
													}
													try {
														driver.findElement(By.xpath("//input[@type='file']"))
																.sendKeys("C:\\Users\\SSD\\Downloads\\pdf [3].pdf");
														Thread.sleep(500);
														System.out.println("Training document added");
													} catch (Exception e) {
														System.out.println("not able to validate training added doc");
														System.out.println("Exception : " + e);
													}
													CM.clickonElementbyXpath(EL.eleCaliender_XP, "Calender");
													CM.clickonElementbyXpath(EL.eleTodaydate_XP, "Today date taining");
													CM.clickonElementbyXpath(EL.elesaveclose_XP, "Save & close ");
													Thread.sleep(500);
													String Alert = driver.switchTo().alert().getText();
													System.out.println(Alert);
													String successfullysave = "successfully save";
													if (Alert.equals(successfullysave)) {
														driver.switchTo().alert().accept();
													} else {
														System.out.println("alert not same");
													}
												}else {
													System.out.println("Training is not displayed");
												}
													CM.clickonElementbyXpath(EL.eleEffectivecale_XP, "Effective calender");
													try {
														WebElement weekend=driver.findElement(By.xpath("(//td[@class=' ui-datepicker-week-end '])[6]"));
														if(weekend.isDisplayed()) {
														System.out.println("Effective feature date selected");
													}else {
														System.out.println("Effective feature date not selected");
													}
										} catch (Exception e) {
											System.out.println("Exeption e");
										}
//													CM.clickonElementbyXpath(EL.eleTodaydate_XP, "Today date effective");d
													try {
														WebElement EffectiveDates = driver.findElement(
																By.xpath("//a[@class='ui-state-default ui-state-highlight ui-state-active']"));
														Thread.sleep(5000);
														EffectiveDate = EffectiveDates.getText();
														System.out.println(EffectiveDates);
													} catch (Exception e) {
														System.out.println("Exeption e");
													}
													CM.CheckElementDisplayedbyXpath(EL.eleEffectiveSAVE_XP,
															"Effective save");
													CM.clickonElementbyXpath(EL.eleEfffectiveSUBMIT_XP,
															"Efffective submit");
													CM.CheckElementDisplayedbyXpath(EL.eleEfffeciveApproves_XP,
															"Approvers");
													CM.CheckElementDisplayedbyXpath(EL.eleEfffectivelevel_XP, "Level");
													CM.CheckElementDisplayedbyXpath(EL.eleEffeciveleveluserordesig_XP,
															"User / Designation");
													CM.CheckElementDisplayedbyXpath(EL.eleEffectivelevelapproval_XP, "1");
													CM.selectValueinDropdownByVisualtextbyXpath(EL.eleNonsignatory1_XP,
															NonSignatory, "Non signatory Reviewer");
													CM.clickonElementbyXpath(EL.eleSubmitApprovaldata_XP,
															"Submit Approval data");
													CM.CheckElementDisplayedbyXpath(EL.eleActionHEA_XP,
															"Justification for Action");
													CM.CheckElementDisplayedbyXpath(EL.elePrefilled_XP, "Prefilled Reason");
													CM.CheckElementDisplayedbyXpath(EL.eleCustom_XP, "Custom Reason");
													CM.CheckElementDisplayedbyXpath(EL.eleclose_XP, "CLOSE");
													Thread.sleep(500);
													CM.selectValueinDropdownselectbyvalueXpath(EL.eleREason_XP, "3",
															"Prefilled Reason");
													CM.clickonElementbyXpath(EL.eleSave_XP, "Save");
													Thread.sleep(1500);
													driver.switchTo().alert().accept();
													Thread.sleep(5000);
													try {
														WebElement effectivedate = driver
																.findElement(By.xpath("//a[text()=' " + displayNumber
																		+ " ']/parent::td/following-sibling::td[6]/ul/li[1]"));
														EffectiveDate = effectivedate.getText();
													} catch (Exception e) {
														System.out.println("not able to validate");
														System.out.println("Exception : " + e);
													}
													try {
														WebElement effectivethreedot = driver
																.findElement(By.xpath("//a[text()=' " + displayNumber
																		+ " ']/parent::td/following-sibling::td[6]//i[@class='bi bi-three-dots']"));
														effectivethreedot.click();
														System.out.println(
																"Document info page make effecive three dots clicked");
														System.out.println(
																"Document info page make effecive  three dots  displayed");
													} catch (Exception e) {
														System.out.println("not able to validate");
														System.out.println("Exception : " + e);
													}
													try {
														WebElement effective = driver.findElement(By.xpath("//a[text()=' "
																+ displayNumber
																+ " ']/parent::td/following-sibling::td[6]//div/input/following-sibling::div/ul/li/p[text()='Effective']"));
														if (effective.isDisplayed()) {
															System.out.println(
																	"Document info page make effecive three dots inside Effective displayed");
														} else {
															System.out.println(
																	"Document info page make effecive three dots inside Effective displayed");
														}
													} catch (Exception e) {
														System.out.println("not able to validate");
														System.out.println("Exception : " + e);
													}
//													try {
//														WebElement effective = driver.findElement(By.xpath(
//																"//a[text()=' "+displayNumber+" ']/parent::td/following-sibling::td[6]//div/input/following-sibling::div/ul/li/p[text()='"+EffectiveDate+"']"));
//														if(effective.isDisplayed()){
//															System.out.println("Document info page make effecive three dots inside Effective date displayed");
//														}else {
//															System.out.println(
//																	"Document info page make effecive three dots inside Effective date displayed");
//														}
//													} catch (Exception e) {
//														System.out.println("not able to validate");
//														System.out.println("Exception : " + e);
//													}
													try {
														WebElement effective = driver.findElement(By.xpath("//a[text()=' "
																+ displayNumber
																+ " ']/parent::td/following-sibling::td[6]//div/input/following-sibling::div/ul/li/p[text()='Approved']"));
														if (effective.isDisplayed()) {
															System.out.println(
																	"Document info page make effecive three dots inside Approved displayed");
														} else {
															System.out.println(
																	"Document info page make effecive three dots inside Approved displayed");
														}
													} catch (Exception e) {
														System.out.println("not able to validate");
														System.out.println("Exception : " + e);
													}
													try {
														WebElement effective = driver.findElement(By.xpath("//a[text()=' "
																+ displayNumber
																+ " ']/parent::td/following-sibling::td[6]//div/input/following-sibling::div/ul/li/p[text()='Review']"));
														if (effective.isDisplayed()) {
															System.out.println(
																	"Document info page make effecive three dots inside Review displayed");
														} else {
															System.out.println(
																	"Document info page make effecive three dots inside Review displayed");
														}
													} catch (Exception e) {
														System.out.println("not able to validate");
														System.out.println("Exception : " + e);
													}
													try {
														WebElement Status1 = driver.findElement(By.xpath("//a[text()=' "
																+ displayNumber
																+ " ']/parent::td/following-sibling::td[text()='Approved']"));
														if (Status1.isDisplayed()) {
															System.out.println(
																	"Make Effective after Status changed Approved");
															Thread.sleep(500);
														} else {
															System.out.println(
																	"Make Effective after Status not changed Approved  ");
															Thread.sleep(500);
														}
													} catch (Exception e) {
														System.out.println("not able to validate");
														System.out.println("Exception : " + e);
													}
													try {
														WebElement Statusr = driver.findElement(By.xpath("//a[text()=' "
																+ displayNumber
																+ " ']/parent::td/following-sibling::td[text()='Approved']/sup"));
														if (Statusr.isDisplayed()) {
															System.out.println(
																	"Make Effective after Status changed Approved *");
															Thread.sleep(500);
														} else {
															System.out.println(
																	"Make Effective after Status not changed Approved * ");
															Thread.sleep(500);
														}
													} catch (Exception e) {
														System.out.println("not able to validate");
														System.out.println("Exception : " + e);
													}
													try {
														WebElement toggles = driver.findElement(By.xpath("//a[text()=' "
																+ displayNumber
																+ " ']/parent::td/following-sibling::td/div[@class='inficon dotIcon']"));
														toggles.click();
														System.out.println("toggle clicked");
													} catch (Exception e) {
														System.out.println("not able to validate");
														System.out.println("Exception : " + e);
													}
													WebElement Viewdoc = driver.findElement(By.xpath("//a[text()=' "
															+ displayNumber
															+ " ']/parent::td/following-sibling::td/div[2]//a[text()='View Document']"));
													try {
														Viewdoc.isDisplayed();
														System.out.println("View Document displayed");
													} catch (StaleElementReferenceException e) {
														Viewdoc.isDisplayed();
														System.out.println("View Document displayed");
													}
													WebElement Uncontrol = driver.findElement(By.xpath("//a[text()=' "
															+ displayNumber
															+ " ']/parent::td/following-sibling::td/div[2]//a[text()='Uncontrolled Print']"));
													try {
														Uncontrol.isDisplayed();
														System.out.println("Uncontrolled Print displayed");
													} catch (StaleElementReferenceException e) {
														Uncontrol.isDisplayed();
														System.out.println("Uncontrolled Print displayed");
													}
													WebElement printhistory = driver.findElement(By.xpath("//a[text()=' "
															+ displayNumber
															+ " ']/parent::td/following-sibling::td/div[2]//a[text()='Print History']"));
													try {
														printhistory.isDisplayed();
														System.out.println("Print History displayed");
													} catch (StaleElementReferenceException e) {
														printhistory.isDisplayed();
														System.out.println("Print History displayed");
													}
													WebElement changehistory = driver.findElement(By.xpath("//a[text()=' "
															+ displayNumber
															+ " ']/parent::td/following-sibling::td/div[2]//a[text()='Change History']"));
													try {
														changehistory.isDisplayed();
														System.out.println("Change History displayed");
													} catch (StaleElementReferenceException e) {
														changehistory.isDisplayed();
														System.out.println("Change History displayed");
													}
													CM.clickonElementbyXpath(EL.eleUsersetting_XP, "USER SETTINGS");
													CM.clickonElementbyXpath(EL.eleLogout_XP, "Log out");
													Thread.sleep(1000);
													CM.enteringDataintoTextfiledByXpath(EL.eleUserName_XP, NonSignatoryNAME,
															" Non signatory user");
													CM.enteringDataintoTextfiledByXpath(EL.elePassword_XP, Password,
															"Password");
													CM.clickonElementbyXpath(EL.eleLogin_XP, "LOGIN");
													Thread.sleep(2000);
													try {
														WebElement Effective = driver
																.findElement(By.xpath("//span[text()=' " + displayNumber
																		+ " ']/parent::td/parent::tr/td[text()='Effective']"));
														if (Effective.isDisplayed()) {
															System.out.println("document Effective is displayed");
														} else {
															System.out.println("Document Effective is not displayed");
														}
													} catch (Exception e) {
														System.out.println("not able to validate");
														System.out.println("Exception : " + e);
													}
													try {
														WebElement initiatedby = driver
																.findElement(By.xpath("//span[text()=' " + displayNumber
																		+ " ']/parent::td/following-sibling::td[text()='"
																		+ initiatedBy + " ']"));
														if (initiatedby.isDisplayed()) {
															System.out.println("initiatedby " + initiatedBy);
														} else {
															System.out.println("initiatedby is not displayed");
														}
													} catch (Exception e) {
														System.out.println("not able to validate");
														System.out.println("Exception : " + e);
													}
//													try {
//														WebElement initiatedby = driver
//																.findElement(By.xpath("//span[text()=' " + displayNumber
//																		+ " ']/parent::td/following-sibling::td[text()='"
//																		+ Date + "']"));
//														if (initiatedby.isDisplayed()) {
//															System.out.println("initiatedby " + Date);
//														} else {
//															System.out.println("initiatedby date is not displayed");
//														}
//													} catch (Exception e) {
//														System.out.println("not able to validate");
//														System.out.println("Exception : " + e);
//													}
													try {
														WebElement titlenemes = driver
																.findElement(By.xpath("(//span[text()=' " + displayNumber
																		+ " ']/parent::td/following-sibling::td//div[text()='"
																		+ Title + "'])[2]"));
														if (titlenemes.isDisplayed()) {
															System.out.println("title name displayed");
														} else {
															System.out.println("title name not displayed");
														}
													} catch (Exception e) {
														System.out.println("not able to validate");
														System.out.println("Exception : " + e);
													}
													try {
														WebElement number2 = driver.findElement(
																By.xpath(" //span[text()=' " + displayNumber + " ']"));
														number2.click();
														System.out.println("numbar is displayed");
													} catch (Exception e) {
														System.out.println("numbar is not displayed");
														System.out.println("Exception:" + e);
													}
													Thread.sleep(2000);
													CM.CheckElementDisplayedbyXpath(EL.eleApprovaldetails_XP,
															"Approval Details header");
													CM.CheckElementDisplayedbyXpath(EL.eleApprovaltype_XP,
															" Approval Type");
													CM.CheckElementDisplayedbyXpath(EL.eleEffec_XP, "Effective");
													CM.CheckElementDisplayedbyXpath(EL.eleDocnum_XP, "Doc No");
													CM.CheckElementDisplayedbyXpath(EL.eleSubmitedby_XP, "Submitted by");
													try {
														WebElement DocNO = driver.findElement(
																By.xpath("//td[contains(text(),'" + displayNumber + "')]"));
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
//													 upload file add
															CM.clickonElementbyXpath(EL.eleUploadfiles_XP, "File upload");
															driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\SSD\\Downloads\\pdf [3].pdf");
															CM.clickonElementbyXpath(EL.elebutsaves_XP, "Save");
													CM.CheckElementDisplayedbyXpath(EL.eledocinfo_XP, "Document Info");
													CM.CheckElementDisplayedbyXpath(EL.eledocinfoheader_XP,
															"Document Info Header");
													try {
														WebElement TitleNumber = driver
																.findElement(By.xpath("//td[@id='tdPrimaryDocTitle']"));
														String actual = TitleNumber.getText();
														System.out.println(actual);

														if (actual.equals(DisplayNumbers)) {
															System.out.println("Pass");
														} else {
															System.out.println("Fail");
														}
													} catch (Exception e) {
														System.out.println("not able to validate");
														System.out.println("Exception : " + e);
													}
													try {
														WebElement Loctaion = driver
																.findElement(By.xpath(" //p[text()='  Unit-I']"));
														if (Loctaion.isDisplayed()) {
															System.out.println("Location name displayed");
														} else {
															System.out.println("Location name  not displayed");
														}
													} catch (Exception e) {
														System.out.println(
																"not able  to validate expected location department element");
														System.out.println("Exception : " + e);
													}
													try {
														WebElement department = driver.findElement(
																By.xpath(" //p[text()='  Quality Assurance']"));
														if (department.isDisplayed()) {
															System.out.println("department is displayed");
														} else {
															System.out.println("department not displayed");
														}
													} catch (Exception e) {
														System.out.println(
																"not able  to validate expected location department element");
														System.out.println("Exception : " + e);
													}
													try {
														boolean category = driver.findElement(By.xpath(
																"(//td[@id='tdPrimaryDocClassification']/table/tbody/tr/td/b)[1]"))
																.isDisplayed();
														if (category) {
															System.out.println("category");
														} else {
															System.out.println("category not displayed");
														}
													} catch (Exception e) {
														System.out.println(
																"not able  to validate expected lcategory  displayed element");
														System.out.println("Exception : " + e);
													}
													try {
														boolean subcategory = driver.findElement(By.xpath(
																"(//td[@id='tdPrimaryDocClassification']/table/tbody/tr/td/b)[2]"))
																.isDisplayed();
														if (subcategory) {
															System.out.println("subcategory");
														} else {
															System.out.println("subcategory not displayed");
														}
													} catch (Exception e) {
														System.out.println(
																"not able  to validate expected subcategory  displayed element");
														System.out.println("Exception : " + e);
													}
													try {
														boolean Types = driver.findElement(By.xpath(
																"(//td[@id='tdPrimaryDocClassification']/table/tbody/tr/td/b)[3]"))
																.isDisplayed();
														if (Types) {
															System.out.println("Types");
														} else {
															System.out.println("Types not displayed");
														}
													} catch (Exception e) {
														System.out.println(
																"not able  to validate expected Types  displayed element");
														System.out.println("Exception : " + e);
													}
													try {
														WebElement categoryname = driver
																.findElement(By.xpath("//td[text()='" + Category + "']"));
														if (categoryname.isDisplayed()) {
															System.out.println("category name displayed");
														} else {
															System.out.println("category name not displayed");
														}
													} catch (Exception e) {
														System.out.println(
																"not able  to validate expected category name   displayed element");
														System.out.println("Exception : " + e);
													}
													try {
														WebElement subcategoryname = driver.findElement(
																By.xpath("//td[text()='" + Subcategory + "']"));
														if (subcategoryname.isDisplayed()) {
															System.out.println("subcategory name displayed");
														} else {
															System.out.println("subcategory name not displayed");
														}
													} catch (Exception e) {
														System.out.println(
																"not able  to validate expected subcategory name   displayed element");
														System.out.println("Exception : " + e);
													}
													try {
														WebElement typE = driver
																.findElement(By.xpath("//td[text()='" + Type + "']"));
														if (typE.isDisplayed()) {
															System.out.println("Type name displayed");
														} else {
															System.out.println("Type name not displayed");
														}
													} catch (Exception e) {
														System.out.println(
																"not able  to validate expected Type name   displayed element");
														System.out.println("Exception : " + e);
													}
													try {
														WebElement product1 = driver
																.findElement(By.xpath("//td[text()='P']"));
														if (product1.isDisplayed()) {
															System.out.println("product displayed");
														} else {
															System.out.println("product not displayed");
														}
													} catch (Exception e) {
														System.out.println("not able to validate");
														System.out.println("Exception : " + e);
													}
													try {
														WebElement MaterialS = driver
																.findElement(By.xpath("//td[text()='M']"));
														if (MaterialS.isDisplayed()) {
															System.out.println("Material displayed");
														} else {
															System.out.println("Material not displayed");
														}
													} catch (Exception e) {
														System.out.println("not able to validate");
														System.out.println("Exception : " + e);
													}
//													try {
//														if (user1.isDisplayed()) {
//															System.out.println("user displayed");
//														} else {
//															System.out.println("user not displayed");
//														}
//													} catch (Exception e) {
//														System.out.println("not able to validate");
//														System.out.println("Exception : " + e);
//													}
//													try {
//														if (AssetS.isDisplayed()) {
//															System.out.println("user name displayed");
//														} else {
//															System.out.println("user name not displayed");
//														}
//													} catch (Exception e) {
//														System.out.println("not able to validate");
//														System.out.println("Exception : " + e);
//													}
//															try {
//																WebElement productname = driver.findElement(By.xpath("//td[text()='" + Productss + "']"));
//																if (productname.isDisplayed()) {
//																	System.out.println("product name displayed");
//																} else {
//																	System.out.println("product name not displayed");
//																}
//															} catch (Exception e) {
//																System.out.println("not able to validate");
//																System.out.println("Exception : " + e);
//															}
													// WebElement Materialname
													// =driver.findElement(By.xpath("//td[text()='"+MateriaL+"']"));
													// if(Materialname.isDisplayed()) {
//															System.out.println("Material name displayed");
													// }else {
//															System.out.println("Material name not displayed");
//															// }
//															try {
//																WebElement Users = driver.findElement(By.xpath("//td[text()='" + Reviewer1username + "']"));
//																if (Users.isDisplayed()) {
//																	System.out.println("USER name displayed");
//																} else {
//																	System.out.println("USER name not displayed");
//																}
//															} catch (Exception e) {
//																System.out.println("not able to validate");
//																System.out.println("Exception : " + e);
//															}
//															try {
//																WebElement Assets = driver.findElement(By.xpath("//td[text()='"+asset+"']"));
//																if (Assets.isDisplayed()) {
//																	System.out.println("Assets name displayed");
//																} else {
//																	System.out.println("Assets name not displayed");
//																}
//															} catch (Exception e) {
//																System.out.println("not able to validate");
//																System.out.println("Exception : " + e);
//															}
													try {
														WebElement setting = driver
																.findElement(By.xpath("//td[@id='tdLayout']"));
														if (setting.isDisplayed()) {
															System.out.println("setting is displayed");
														} else {
															System.out.println("settings not equal");
														}
													} catch (Exception e) {
														System.out.println("not able to validate");
														System.out.println("Exception : " + e);
													}
													try {
														WebElement uncontrolprint = driver.findElement(By
																.xpath("(//th[contains(text(),'Uncontrolled Print')])[1]"));
														if (uncontrolprint.isDisplayed()) {
															System.out.println("uncontrolprintchange is displayed");
														} else {
															System.out.println("uncontrolprintchange is not displayed");
														}
													} catch (Exception e) {
														System.out.println("not able to validate");
														System.out.println("Exception : " + e);
													}
													driver.findElement(By.xpath("(//img[@title='View Document'])[1]"))
															.click();
													Thread.sleep(3000);
													driver.switchTo().window(parentwindow11);
													try {
														WebElement printimg = driver
																.findElement(By.xpath("//img[@id='btnUncontrolledPrint']"));
														if (printimg.isDisplayed()) {
															System.out.println("print img is displayed");
														} else {
															System.out.println("print img not displayed");
														}
													} catch (Exception e) {
														System.out.println("not able to validate");
														System.out.println("Exception : " + e);
													}
													driver.findElement(By.xpath("//img[@id='btnUncontrolledPrint']"))
															.click();
													Thread.sleep(3000);
													driver.switchTo().window(parentwindow1);
													try {
														driver.findElement(By.xpath("//input[@value='Change History']"))
																.isDisplayed();
													} catch (Exception e) {
														System.out.println("not able to validate");
														System.out.println("Exception : " + e);
													}
													try {
														WebElement Associated = driver.findElement(
																By.xpath("//h1[text()='Associated Documents']"));
														if (Associated.isDisplayed()) {
															System.out.println("Associated Documents header is displayed");
														} else {
															System.out.println(
																	"Associated Documents header is not displayed");
														}
													} catch (Exception e) {
														System.out.println("not able to validate");
														System.out.println("Exception : " + e);
													}
													try {
														WebElement Assotitle = driver.findElement(By.xpath(
																"//table[@id='jsonTblAssDocs']//th[@class='t-header wid15pc'][normalize-space()='Title & Number']"));
														if (Assotitle.isDisplayed()) {
															System.out.println(
																	"ASSOCIATED DOCUMENTS Title & Number header is displayed");
														} else {
															System.out.println(
																	"ASSOCIATED DOCUMENTS Title & Number header is not displayed ");
														}
													} catch (Exception e) {
														System.out.println("not able to validate");
														System.out.println("Exception : " + e);
													}
													try {
														WebElement AssoDescrip = driver.findElement(By.xpath(
																"//table[@id='jsonTblAssDocs']//th[@class='t-header wid20pc'][normalize-space()='Description']"));
														if (AssoDescrip.isDisplayed()) {
															System.out.println(
																	"ASSOCIATED DOCUMENTS description header is displayed");
														} else {
															System.out.println(
																	"ASSOCIATED DOCUMENTS description header is not displayed ");
														}
													} catch (Exception e) {
														System.out.println("not able to validate");
														System.out.println("Exception : " + e);
													}
													try {
														WebElement AssoLocDoc = driver.findElement(By.xpath(
																"//table[@id='jsonTblAssDocs']//th[@class='t-header wid15pc'][normalize-space()='Loc, Dep']"));
														if (AssoLocDoc.isDisplayed()) {
															System.out.println(
																	"ASSOCIATED DOCUMENTS location & department header is displayed");
														} else {
															System.out.println(
																	"ASSOCIATED DOCUMENTS location & department header is not displayed ");
														}
													} catch (Exception e) {
														System.out.println("not able to validate");
														System.out.println("Exception : " + e);
													}
													try {
														WebElement Assoclassi = driver.findElement(By.xpath(
																"//table[@id='jsonTblAssDocs']//th[@class='t-header wid20pc'][normalize-space()='Classification']"));
														if (Assoclassi.isDisplayed()) {
															System.out.println(
																	"ASSOCIATED DOCUMENTS Classification header is displayed");
														} else {
															System.out.println(
																	"ASSOCIATED DOCUMENTS Classification header is not displayed ");
														}
													} catch (Exception e) {
														System.out.println("not able to validate");
														System.out.println("Exception : " + e);
													}
													try {
														WebElement AssoASSOCIATION = driver.findElement(By.xpath(
																"//table[@id='jsonTblAssDocs']//th[@class='t-header wid20pc'][normalize-space()='Associations']"));
														if (AssoASSOCIATION.isDisplayed()) {
															System.out.println(
																	"ASSOCIATED DOCUMENTS Associations header is displayed");
														} else {
															System.out.println(
																	"ASSOCIATED DOCUMENTS Associations header is not displayed ");
														}
													} catch (Exception e) {
														System.out.println("not able to validate");
														System.out.println("Exception : " + e);
													}
													try {
														WebElement AssoSETTING = driver.findElement(By.xpath(
																"//table[@id='jsonTblAssDocs']//th[@class='t-header wid20pc'][normalize-space()='Associations']"));
														if (AssoSETTING.isDisplayed()) {
															System.out.println(
																	"ASSOCIATED DOCUMENTS Settings header is displayed");
														} else {
															System.out.println(
																	"ASSOCIATED DOCUMENTS Settings header is not displayed ");
														}
													} catch (Exception e) {
														System.out.println("not able to validate");
														System.out.println("Exception : " + e);
													}
													try {
														WebElement AssoFile = driver.findElement(By.xpath(
																"//table[@id='jsonTblAssDocs']//th[@class='t-header wid5pc'][normalize-space()='File']"));
														if (AssoFile.isDisplayed()) {
															System.out.println(
																	"ASSOCIATED DOCUMENTS file header is displayed");
														} else {
															System.out.println(
																	"ASSOCIATED DOCUMENTS file header is not displayed ");
														}
													} catch (Exception e) {
														System.out.println("not able to validate");
														System.out.println("Exception : " + e);
													}
													try {
														WebElement AssociatedUnControlprintheader = driver.findElement(By
																.xpath("//table[@id='jsonTblAssDocs']//th[@class='t-header wid5pc'][normalize-space()='Uncontrolled Print']"));
														if (AssociatedUnControlprintheader.isDisplayed()) {
															System.out.println(
																	"Associated UnControl print header is displayed");
														} else {
															System.out.println(
																	"AssociatedUnControlprint header not displayed");
														}
													} catch (Exception e) {
														System.out.println("not able to validate");
														System.out.println("Exception : " + e);
													}
													// change details
//													try {
//														WebElement changedetails = driver.findElement(By.xpath("//span[text()='Change Control Number']"));
//														if (changedetails.isDisplayed()) {
//															System.out.println("Change detail header is displayed");
//														} else {
//															System.out.println("change detail header is not displayed");
//														}
//													} catch (Exception e) {
//														System.out.println("not able to validate");
//														System.out.println("Exception : " + e);
//													}
//													try {
//														WebElement changedis = driver.findElement(By.xpath("(//span[text()='Description'])[2]"));
//														if (changedis.isDisplayed()) {
//															System.out.println("change control discription header is displayed");
//														} else {
//															System.out.println("change control discription  header not displayed");
//														}
//													} catch (Exception e) {
//														System.out.println("not able to validate");
//														System.out.println("Exception : " + e);
//													}
//													try {
//														WebElement statuscahnge = driver.findElement(By.xpath("(//span[text()='Status'])[2]"));
//														if (statuscahnge.isDisplayed()) {
//															System.out.println("status is displayed");
//														} else {
//															System.out.println("status not displayed");
//														}
//													} catch (Exception e) {
//														System.out.println("not able to validate");
//														System.out.println("Exception : " + e);
//													}
////															try {
//												S				WebElement filechangecontrol = driver.findElement(By.xpath("(//span[text()='File'])[1]"));
//																if (filechangecontrol.isDisplayed()) {
//																	System.out.println("filechangecontrol header is displayed");
//																} else {
//																	System.out.println("filechangecontrol header is not displayed");
//																}
//															} catch (Exception e) {
//																System.out.println("not able to validate");
//																System.out.println("Exception : " + e);
//															}
//															try {
//																WebElement chngecontrolID = driver.findElement(By.xpath("(//td[text()=' " + Changecontrolnumber + " '])[2]"));
//																if (chngecontrolID.isDisplayed()) {
//																	System.out.println("Change control ID is displayed");
//																} else {
//																	System.out.println("Change control ID is not displayed");
//																}
//															} catch (Exception e) {
//																System.out.println("not able to validate");
//																System.out.println("Exception : " + e);
//															}
//															try {
//																WebElement changecontroldiscription = driver
//																		.findElement(By.xpath("//td[text()='" + ChangeDiscription + "']"));
//																if (changecontroldiscription.isDisplayed()) {
//																	System.out.println("change control discription is displayed");
//																} else {
//																	System.out.println("change control discription displayed");
//																}
//															} catch (Exception e) {
//																System.out.println("not able to validate");
//																System.out.println("Exception : " + e);
//															}
//															Thread.sleep(500);
//															String Changeparentwindow = driver.getWindowHandle();
//															System.out.println(parentwindow);
//															driver.findElement(By.xpath("(//img[@title='View Document'])[2]")).click();
//															String ChangeChildwindow = driver.getWindowHandle();
//															System.out.println(Childwindow);
//															Thread.sleep(5000);
//															driver.switchTo().window(Changeparentwindow);
													CM.CheckElementDisplayedbyXpath(EL.eletraininAssoci_XP,
															"Training Associated");
													CM.CheckElementDisplayedbyXpath(EL.eletrainID_XP, "Training Id");
													CM.CheckElementDisplayedbyXpath(EL.eleTRAINDES_XP,
															"Training Description");
													CM.CheckElementDisplayedbyXpath(EL.eleEFFECOMPLETION_XP, "Comp. Date");
													CM.CheckElementDisplayedbyXpath(EL.eleEvidancse_XP, "Evidence");
													CM.CheckElementDisplayedbyXpath(EL.eleEvidens_XP, "Evidence PDF DOC");
													try {
														WebElement TrainingId = driver.findElement(By.xpath(
																"(//thead[@class='t-grid-header'])[4]/following-sibling::tbody//td[text()='"
																		+ TrainingID + "']"));
														if (TrainingId.isDisplayed()) {
															System.out.println("Traing id" + TrainingID);
														} else {
															System.out.println("Traing id not displayed");
														}
													} catch (Exception e) {
														System.out.println("not able to validate");
														System.out.println("Exception : " + e);
													}
													try {
														WebElement Trainingdescr = driver.findElement(By.xpath(
																"(//thead[@class='t-grid-header'])[4]/following-sibling::tbody//td[text()='"
																		+ TrainingDiscription + "']"));
														if (Trainingdescr.isDisplayed()) {
															System.out.println("Traing description" + TrainingDiscription);
														} else {
															System.out.println("Traing description not displayed");
														}
													} catch (Exception e) {
														System.out.println("not able to validate");
														System.out.println("Exception : " + e);
													}
//											try {
//												WebElement Effectivedates= driver.findElement(By.xpath("(//thead[@class='t-grid-header'])[4]/following-sibling::tbody//td[text()='"+EffectiveDate+"']"));
//												if(Effectivedates.isDisplayed()) {
//													System.out.println("Effective DATE"+EffectiveDate );
//												}else {
//													System.out.println("Effective DATE not displayed" );	
//												}
//											} catch (Exception e) {
//												System.out.println("not able to validate");
//												System.out.println("Exception : " + e);
//											}
													try {
														WebElement Effectivedates = driver.findElement(By.xpath(
																"(//thead[@class='t-grid-header'])[4]/following-sibling::tbody//td[@id='tdEvidence']"));
														if (Effectivedates.isDisplayed()) {
															System.out.println("Effective DATE" + EffectiveDate);
														} else {
															System.out.println("Effective DATE not displayed");
														}
													} catch (Exception e) {
														System.out.println("not able to validate");
														System.out.println("Exception : " + e);
													}
													CM.CheckElementDisplayedbyXpath(EL.eleEffectivedateheaderr_XP,
															"Effective Date Main header");
													CM.CheckElementDisplayedbyXpath(EL.eleeffecticveheader_XP,
															"Effective Date  header");
													CM.CheckElementDisplayedbyXpath(EL.eleReviewdate_XP, "Review Date");
													CM.CheckElementDisplayedbyXpath(EL.elecorrentriviewdate_XP,
															"Current Review Date");
													try {
														WebElement approvalhistory = driver
																.findElement(By.xpath("//h1[text()='Approval History']"));
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
													try {
														WebElement submission = driver.findElement(By.xpath(
																"(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr/td[text()='Submission']"));
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
														WebElement initiatedby = driver.findElement(
																By.xpath("(//td[text()='" + initiatedBy + "'])[2]"));
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
														WebElement statuss = driver.findElement(By.xpath(
																"(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr/td[text()='Completed']"));
														if (statuss.isDisplayed()) {
															System.out.println("status Completed is displayed");
														} else {
															System.out.println("status Completed is not displayed");
														}
													} catch (Exception e) {
														System.out.println("status  Completed is not displayed");
														System.out.println("Exception : " + e);
													}
													CM.CheckElementDisplayedbyXpath(EL.elestepname1_XP,
															"Effective step name");
													CM.CheckElementDisplayedbyXpath(EL.eleActions1_XP, "Effective Action");
													CM.CheckElementDisplayedbyXpath(EL.eleactedby1_XP,
															"Effective acted by");
													CM.CheckElementDisplayedbyXpath(EL.eleacceptedon1_XP,
															" Effective Accepted on");
													CM.CheckElementDisplayedbyXpath(EL.eleremarks1_XP, "Effective Remarks");
													CM.CheckElementDisplayedbyXpath(EL.eleattachedfile1_XP,
															"Effective File");
													try {
														WebElement StepnameEffecive = driver.findElement(By.xpath(
																"(//thead[@class='t-grid-header'])[6]/following-sibling::tbody/tr/td[text()='1']"));
														if (StepnameEffecive.isDisplayed()) {
															System.out.println("Step name is displayed");
														} else {
															System.out.println("Step name not is displayed");
														}
													} catch (Exception e) {
														System.out.println("Step name is not displayed");
														System.out.println("Exception : " + e);
													}
													try {
														WebElement ApproveEffecive = driver.findElement(By.xpath(
																"(//thead[@class='t-grid-header'])[6]/following-sibling::tbody/tr/td[text()='Approved']"));
														if (ApproveEffecive.isDisplayed()) {
															System.out.println("Effective Action Approved is displayed");
														} else {
															System.out
																	.println("Effective Action Approved is not displayed");
														}
													} catch (Exception e) {
														System.out.println("Effective Action Approved is not displayed");
														System.out.println("Exception : " + e);
													}
													try {
														WebElement ApproverEffecive = driver.findElement(By.xpath(
																"(//thead[@class='t-grid-header'])[6]/following-sibling::tbody/tr/td[text()='"
																		+ NonSignatoryNAME + "']"));
														if (ApproverEffecive.isDisplayed()) {
															System.out.println("Effective Approver is displayed");
														} else {
															System.out.println("Effective  Approver is not displayed");
														}
													} catch (Exception e) {
														System.out.println("Effective  Approver is not displayed");
														System.out.println("Exception : " + e);
													}
													CM.CheckElementDisplayedbyXpath(EL.elestepname2_XP, "Step Name");
													CM.CheckElementDisplayedbyXpath(EL.eleActions2_XP, "Action");
													CM.CheckElementDisplayedbyXpath(EL.eleactedby2_XP, "Acted By");
													CM.CheckElementDisplayedbyXpath(EL.eleacceptedon2_XP, "Accepted On");
													CM.CheckElementDisplayedbyXpath(EL.eleremarks2_XP, "Remarks");
													CM.CheckElementDisplayedbyXpath(EL.eleattachedfile2_XP,
															"submission approval history added file");
													try {
														String StringExpectedstep1 = "Task for Non-Signatory Reviewers";
														WebElement Nonsignatory = driver.findElement(By.xpath(
																"(//thead[@class='t-grid-header'])[7]/following-sibling::tbody/tr[1]/td[text()='Task for Non-Signatory Reviewers']"));
														if (Nonsignatory.isDisplayed()) {
															System.out
																	.println("Task for Non-Signatory Reviewers dispalyed");
														} else {
															System.out.println(
																	"Task for Non-Signatory Reviewers not dispalyed");
														}
													} catch (Exception e) {
														System.out.println("not able to validate");
														System.out.println("Exception : " + e);
													}
													try {
														WebElement NonsignatoryAction = driver.findElement(By.xpath(
																"(//thead[@class='t-grid-header'])[7]/following-sibling::tbody/tr[1]/td[text()='Approved']"));
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
														WebElement Nonsignatoryaccepteddate = driver.findElement(By.xpath(
																"(//thead[@class='t-grid-header'])[7]/following-sibling::tbody/tr[1]/td[5]"));
														if (Nonsignatoryaccepteddate.isDisplayed()) {
															System.out.println("Nonsignatory reviewer  Accepted date ");
														} else {
															System.out.println(
																	"Nonsignatory reviewer  Accepted date not showing ");
														}
													} catch (Exception e) {
														System.out.println("not able to validate");
														System.out.println("Exception : " + e);
													}
													try {
														WebElement Nonsignatoryremarks = driver.findElement(By.xpath(
																"(//thead[@class='t-grid-header'])[7]/following-sibling::tbody/tr[1]/td[text()='"
																		+ NonsignatoryRemarks + "']"));
														if (Nonsignatoryremarks.isDisplayed()) {
															System.out.println("Nonsignatory remarks displayed ");
														} else {
															System.out.println("Nonsignatory reviewer  not displayed ");
														}
													} catch (Exception e) {
														System.out.println("not able to validate");
														System.out.println("Exception : " + e);
													}
													try {
														WebElement actedBYNONSIGNATORY = driver.findElement(By.xpath(
																"(//thead[@class='t-grid-header'])[7]/following-sibling::tbody/tr[1]/td[text()='"
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
														String StringExpectedstep2 = "Default Tasks for Reviewers";
														WebElement TaskReviewers = driver.findElement(By.xpath(
																"(//thead[@class='t-grid-header'])[7]/following-sibling::tbody/tr[2]/td[text()='Default Tasks for Reviewers']"));
														if (TaskReviewers.isDisplayed()) {
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
																"(//thead[@class='t-grid-header'])[7]/following-sibling::tbody/tr[2]/td[text()='Approved']"));
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
														WebElement actedBYReviewer = driver.findElement(By.xpath(
																"(//thead[@class='t-grid-header'])[7]/following-sibling::tbody/tr[2]/td[text()='"
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
														WebElement Nonsignatoryremarks = driver.findElement(By.xpath(
																"(//thead[@class='t-grid-header'])[7]/following-sibling::tbody/tr[2]/td[text()='"
																		+ NonsignatoryRemarks + "']"));
														if (Nonsignatoryremarks.isDisplayed()) {
															System.out.println("Nonsignatory remarks displayed ");
														} else {
															System.out.println("Nonsignatory reviewer  not displayed ");
														}
													} catch (Exception e) {
														System.out.println("not able to validate");
														System.out.println("Exception : " + e);
													}
													try {
														String StringExpectedstep3 = "Approval 1";
														WebElement TaskApproverd = driver.findElement(By.xpath(
																"(//thead[@class='t-grid-header'])[7]/following-sibling::tbody/tr[3]/td[text()='Approval 1']"));
														if (TaskApproverd.isDisplayed()) {
															System.out.println("Default Tasks for Reviewers dispalyed");
														} else {
															System.out.println("Default Tasks for Reviewers not dispalyed");
														}
													} catch (Exception e) {
														System.out.println("not able to validate");
														System.out.println("Exception : " + e);
													}
													try {
														WebElement ApproverAction = driver.findElement(By.xpath(
																"(//thead[@class='t-grid-header'])[7]/following-sibling::tbody/tr[3]/td[text()='Approved']"));
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
														WebElement actedBYApprover = driver.findElement(By.xpath(
																"(//thead[@class='t-grid-header'])[7]/following-sibling::tbody/tr[3]/td[text()='"
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
													try {
														WebElement Nonsignatoryremarks = driver.findElement(By.xpath(
																"(//thead[@class='t-grid-header'])[7]/following-sibling::tbody/tr[3]/td[text()='"
																		+ NonsignatoryRemarks + "']"));
														if (Nonsignatoryremarks.isDisplayed()) {
															System.out.println("Nonsignatory remarks displayed ");
														} else {
															System.out.println("Nonsignatory reviewer  not displayed ");
														}
													} catch (Exception e) {
														System.out.println("not able to validate");
														System.out.println("Exception : " + e);
													}
													CM.enteringDataintoTextfiledByXpath(EL.eleRemarksinput_XP,
															NonsignatoryRemarks, " Reviewer1remarks");
													try {
														wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(
																By.xpath("//select[@id='Decision']")));
														Select select2 = new Select(
																driver.findElement(By.xpath("//select[@id='Decision']")));
														select2.selectByVisibleText(EffectiveDecision1);
														System.out.println("Selected " + EffectiveDecision1);
													} catch (StaleElementReferenceException e) {
														wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(
																By.xpath("//select[@id='Decision']")));
														Select select2 = new Select(
																driver.findElement(By.xpath("//select[@id='Decision']")));
														select2.selectByVisibleText(EffectiveDecision1);
														System.out.println("Selected " + EffectiveDecision1);
													}
													if (EffectiveDecision1.equals("Approve")) {
														System.out.println("Make Effective Approved");
														CM.clickonElementbyXpath(EL.elebtnComplete_XP, "Complete");
														Thread.sleep(1000);
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
														try {
															WebElement statusa = driver.findElement(By.xpath("//a[text()=' "
																	+ displayNumber
																	+ " ']/parent::td/following-sibling::td[text()='Effective'][1]"));
															if (statusa.isDisplayed()) {
																System.out.println(
																		"Make effective Approvals after status = Effective");
															} else {
																System.out.println(
																		"Make effective Approvals after status  not changed");
															}
														} catch (Exception e) {
															System.out.println("not able to validate");
															System.out.println("Exception : " + e);
														}
													} else if (EffectiveDecision1.equals("Reject")) {
														System.out.println("Reject");
														CM.clickonElementbyXpath(EL.elebtnComplete_XP, "Complete");
														driver.switchTo().alert().accept();
														Thread.sleep(2000);
														driver.switchTo().alert().accept();
														Thread.sleep(2000);
														CM.clickonElementbyXpath(EL.eleUsersetting_XP, "USER SETTINGS");
														Thread.sleep(300);
														CM.clickonElementbyXpath(EL.eleLogout_XP, "Log out");
														Thread.sleep(200);
														CM.enteringDataintoTextfiledByXpath(EL.eleUserName_XP, initiatorusername,
																" UserName");
														CM.enteringDataintoTextfiledByXpath(EL.elePassword_XP, Password, "Password");
														CM.clickonElementbyXpath(EL.eleLogin_XP, "LOGIN");
														Thread.sleep(5000);
														CM.clickonElementbyXpath(EL.elemenuicon_XP, "Menu icon");
														driver.findElement(By.xpath("//div[contains(text(),'Documents')]")).click();
														driver.findElement(By.xpath("//div[contains(text(),'An')]")).click();
														Thread.sleep(2000);
														try {
															WebElement statusf = driver.findElement(By.xpath("//a[text()=' "
																	+ displayNumber
																	+ " ']/parent::td/following-sibling::td[text()='Approved'][1]"));
															if (statusf.isDisplayed()) {
																System.out.println(
																		"Make effective Reject after status = Approved");
															} else {
																System.out.println(
																		"Make effective Reject after status  not changed");
															}
														} catch (Exception e) {
															System.out.println("not able to validate");
															System.out.println("Exception : " + e);
														}
														try {
															WebElement statusg = driver.findElement(By.xpath("//a[text()=' "
																	+ displayNumber
																	+ " ']/parent::td/following-sibling::td[text()='Approved'][1]/sup[text()='R']"));
															if (statusg.isDisplayed()) {
																System.out.println(
																		"Make effective Approvals after status = Approved R");
															} else {
																System.out.println(
																		"Make effective Approvals Reject after status  not changed");
															}
														} catch (Exception e) {
															System.out.println("not able to validate");
															System.out.println("Exception : " + e);
														}
													} else if (EffectiveDecision1.equals("Resubmit")) {
														System.out.println("Resubmit");
														CM.clickonElementbyXpath(EL.elebtnComplete_XP, "Complete");
														driver.switchTo().alert().accept();
														Thread.sleep(2000);
														driver.switchTo().alert().accept();
														Thread.sleep(2000);
														CM.clickonElementbyXpath(EL.eleUsersetting_XP, "USER SETTINGS");
														Thread.sleep(300);
														CM.clickonElementbyXpath(EL.eleLogout_XP, "Log out");
														Thread.sleep(200);
														CM.enteringDataintoTextfiledByXpath(EL.eleUserName_XP, initiatorusername,
																" UserName");
														CM.enteringDataintoTextfiledByXpath(EL.elePassword_XP, Password, "Password");
														CM.clickonElementbyXpath(EL.eleLogin_XP, "LOGIN");
														Thread.sleep(5000);
														CM.clickonElementbyXpath(EL.elemenuicon_XP, "Menu icon");
														WebElement Documentss = driver.findElement(By.xpath("//div[text()='Documents']"));
														AS.moveToElement(Documentss).perform();
														Documentss
																.findElement(By.xpath(
																		"//span[@class='sub-tlt'][normalize-space()='" + Category + "']"))
																.click();
														Thread.sleep(4000);
														try {
															WebElement statusd = driver.findElement(By.xpath("//a[text()=' "
																	+ displayNumber
																	+ " ']/parent::td/following-sibling::td[text()='Approved'][1]"));
															if (statusd.isDisplayed()) {
																System.out.println(
																		"Make effective Resubmit after status = Approved");
															} else {
																System.out.println(
																		"Make effective Resubmit after status  not changed");
															}
														} catch (Exception e) {
															System.out.println("not able to validate");
															System.out.println("Exception : " + e);
														}}
													} catch (Exception e) {
														System.out.println("not able to validate");
														System.out.println("Exception : " + e);
													}}else  {
											WebElement StatusEffective = driver.findElement(By.xpath("(//a[text()=' " + displayNumber
													+ " ']/parent::td/following-sibling::td[7][text()='Effective'])[1]"));
											if(StatusEffective.isDisplayed()) {
												System.out.println(
														"Make effective Approvals after status = Approved");
											}else {
												System.out.println("Make effecive after status is not changege Effectively");
											}}} catch (Exception e) {
											System.out.println("not able to validate");
											System.out.println("Exception : " + e);
										}
									} else if (Decision3.equals("Resubmit")) {
										System.out.println("Resubmited");
										CM.clickonElementbyXpath(EL.elebtnComplete_XP, "Complete");
										driver.switchTo().alert().accept();
										Thread.sleep(2000);
										driver.switchTo().alert().accept();
										Thread.sleep(2000);
										CM.clickonElementbyXpath(EL.eleUsersetting_XP, "USER SETTINGS");
										CM.clickonElementbyXpath(EL.eleLogout_XP, "Log out");
										Thread.sleep(1000);
										CM.enteringDataintoTextfiledByXpath(EL.eleUserName_XP, initiatorusername,
												" UserName");
										CM.enteringDataintoTextfiledByXpath(EL.elePassword_XP, Password, "Password");
										CM.clickonElementbyXpath(EL.eleLogin_XP, "LOGIN");
										Thread.sleep(5000);
										CM.clickonElementbyXpath(EL.elemenuicon_XP, "Menu icon");
										WebElement Documents = driver.findElement(By.xpath("//div[text()='Documents']"));
										AS.moveToElement(Documents).perform();
										Documents
												.findElement(By.xpath(
														"//span[@class='sub-tlt'][normalize-space()='" + Category + "']"))
												.click();
										Thread.sleep(4000);
										try {
											WebElement Displaynumber = driver
													.findElement(By.xpath("(//a[text()=' " + displayNumber + " '])[1]"));
											if (Displaynumber.isDisplayed()) {
												System.out.println("Displaynumber displayed");
												Displaynumber.click();
												System.out.println("document info page navigated");
											} else {
												System.out.println("Displaynumber not displayed");
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

											WebElement NonsignatoryAction = driver.findElement(By.xpath(
													"(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[1]/td[text()='"
															+ NonsignatoryRemarks + "']"));
											if (NonsignatoryAction.isDisplayed()) {
												System.out.println(
														"Nonsignatory reviewer action Remarks " + NonsignatoryRemarks);
											} else {
												System.out.println("Nonsignatory reviewer action not showing ");
											}
										} catch (Exception e) {
											System.out.println("not able to validate");
											System.out.println("Exception : " + e);
										}
										
										try {
											WebElement Nonsignatoryattachedfile = driver.findElement(By.xpath(
													"(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[1]/td[7]/div/a"));
											if (Nonsignatoryattachedfile.isDisplayed()) {
												System.out.println("Nonsignatory Attached file");
											} else {
												System.out.println("Nonsignatory Attached file not showing ");
											}
										} catch (Exception e) {
											System.out.println("not able to validate");
											System.out.println("Exception : " + e);
										}
										try {
											WebElement Nonsignatoryattachedfileprintsymbal = driver.findElement(By.xpath(
													"(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[1]/td[7]/div/img"));
											if (Nonsignatoryattachedfileprintsymbal.isDisplayed()) {
												System.out.println("Nonsignatory Attached file withprint symbal");
											} else {
												System.out.println("Nonsignatory Attached file print symbal not showing ");
											}
										} catch (Exception e) {
											System.out.println("not able to validate");
											System.out.println("Exception : " + e);
										}
										
										try {
											WebElement ReviewerAction = driver.findElement(By.xpath(
													"(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[2]/td[text()='Approved']"));
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
											WebElement NonsignatoryAction = driver.findElement(By.xpath(
													"(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[2]/td[text()='"
															+ NonsignatoryRemarks + "']"));
											if (NonsignatoryAction.isDisplayed()) {
												System.out.println(" reviewer action Remarks " + NonsignatoryRemarks);
											} else {
												System.out.println(" reviewer action not showing ");
											}
										} catch (Exception e) {
											System.out.println("not able to validate");
											System.out.println("Exception : " + e);
										}
										try {
											WebElement Nonsignatoryattachedfile = driver.findElement(By.xpath(
													"(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[2]/td[7]/div/a"));
											if (Nonsignatoryattachedfile.isDisplayed()) {
												System.out.println("Nonsignatory Attached file");
											} else {
												System.out.println("Nonsignatory Attached file not showing ");
											}
										} catch (Exception e) {
											System.out.println("not able to validate");
											System.out.println("Exception : " + e);
										}
										try {
											WebElement Nonsignatoryattachedfileprintsymbal = driver.findElement(By.xpath(
													"(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[2]/td[7]/div/img"));
											if (Nonsignatoryattachedfileprintsymbal.isDisplayed()) {
												System.out.println("Nonsignatory Attached file withprint symbal");
											} else {
												System.out.println("Nonsignatory Attached file print symbal not showing ");
											}
										} catch (Exception e) {
											System.out.println("not able to validate");
											System.out.println("Exception : " + e);
										}
										try {
											WebElement ApproverAction = driver.findElement(By.xpath(
													"(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[3]/td[text()='Requested for Re-Submit']"));
											if (ApproverAction.isDisplayed()) {
												System.out.println(" reviewer action Re-Submit ");
											} else {
												System.out.println(" reviewer action not showing ");
											}
										} catch (Exception e) {
											System.out.println("not able to validate");
											System.out.println("Exception : " + e);
										}
										try {
											WebElement NonsignatoryAction = driver.findElement(By.xpath(
													"(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[3]/td[text()='"
															+ NonsignatoryRemarks + "']"));
											if (NonsignatoryAction.isDisplayed()) {
												System.out.println(" reviewer action Remarks " + NonsignatoryRemarks);
											} else {
												System.out.println(" reviewer action not showing ");
											}
										} catch (Exception e) {
											System.out.println("not able to validate");
											System.out.println("Exception : " + e);
										}
										try {
											WebElement Nonsignatoryattachedfile = driver.findElement(By.xpath(
													"(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[3]/td[7]/div/a"));
											if (Nonsignatoryattachedfile.isDisplayed()) {
												System.out.println("Nonsignatory Attached file");
											} else {
												System.out.println("Nonsignatory Attached file not showing ");
											}
										} catch (Exception e) {
											System.out.println("not able to validate");
											System.out.println("Exception : " + e);
										}
										try {
											WebElement Nonsignatoryattachedfileprintsymbal = driver.findElement(By.xpath(
													"(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[3]/td[7]/div/img"));
											if (Nonsignatoryattachedfileprintsymbal.isDisplayed()) {
												System.out.println("Nonsignatory Attached file withprint symbal");
											} else {
												System.out.println("Nonsignatory Attached file print symbal not showing ");
											}
										} catch (Exception e) {
											System.out.println("not able to validate");
											System.out.println("Exception : " + e);
										}
										try {
											WebElement Analyti = driver.findElement(By.xpath("//div[text()='An']"));
											AS.doubleClick(Analyti).perform();
											Thread.sleep(3000);
											System.out.println("doc info page close");
										} catch (Exception e) {
											System.out.println("not able to validate");
											System.out.println("Exception : " + e);
										}
										try {
											WebElement Status = driver.findElement(By.xpath("//a[text()=' " + displayNumber
													+ " ']/parent::td/following-sibling::td[text()='Creation'])[1]"));
											if (Status.isDisplayed()) {
												System.out.println("Document status Approved");
												Thread.sleep(500);
											} else {
												System.out.println("Document status  not changed Approved");
												Thread.sleep(500);
											}
										} catch (Exception e) {
											System.out.println("not able to validate");
											System.out.println("Exception : " + e);
										}
										try {
											WebElement toggle = driver.findElement(By.xpath("//a[text()=' " + displayNumber
													+ " ']/parent::td/following-sibling::td/div[@class='inficon dotIcon']"));
											toggle.click();
											System.out.println("toggle clicked");
										} catch (Exception e) {
											System.out.println("not able to validate");
											System.out.println("Exception : " + e);
										}
										try {
											WebElement Submit = driver.findElement(By.xpath("//a[text()=' " + displayNumber
													+ " ']/parent::td/following-sibling::td/div[2]//a[text()='Submit']"));
											if (Submit.isDisplayed()) {
												System.out.println("Submit displayed");
											} else {
												System.out.println("Submit not displayed");
											}
										} catch (Exception e) {
											System.out.println("not able to validate");
											System.out.println("Exception : " + e);
										}
										try {
											WebElement Submit = driver.findElement(By.xpath("//a[text()=' " + displayNumber
													+ " ']/parent::td/following-sibling::td/div[2]//a[text()='Uncontrolled Print']"));
											if (Submit.isDisplayed()) {
												System.out.println("Uncontrolled Print displayed");
											} else {
												System.out.println("Uncontrolled Print not displayed");
											}
										} catch (Exception e) {
											System.out.println("not able to validate");
											System.out.println("Exception : " + e);
										}
										try {
											WebElement Submit = driver.findElement(By.xpath("//a[text()=' " + displayNumber
													+ " ']/parent::td/following-sibling::td/div[2]//a[text()='Print History']"));
											if (Submit.isDisplayed()) {
												System.out.println("Print History displayed");
											} else {
												System.out.println("Print History not displayed");
											}
										} catch (Exception e) {
											System.out.println("not able to validate");
											System.out.println("Exception : " + e);
										}
										try {
											WebElement Submit = driver.findElement(By.xpath("//a[text()=' " + displayNumber
													+ " ']/parent::td/following-sibling::td/div[2]//a[text()='Change History']"));
											if (Submit.isDisplayed()) {
												System.out.println("Change History displayed");
											} else {
												System.out.println("Change History not displayed");
											}
										} catch (Exception e) {
											System.out.println("not able to validate");
											System.out.println("Exception : " + e);
										}
									} else if (Decision3.equals("Reject")) {
										System.out.println("Reject");
										CM.clickonElementbyXpath(EL.elebtnComplete_XP, "Complete");
										driver.switchTo().alert().accept();
										Thread.sleep(2000);
										driver.switchTo().alert().accept();
										Thread.sleep(2000);
										CM.clickonElementbyXpath(EL.eleUsersetting_XP, "USER SETTINGS");
										CM.clickonElementbyXpath(EL.eleLogout_XP, "Log out");
										Thread.sleep(1000);
										CM.enteringDataintoTextfiledByXpath(EL.eleUserName_XP, initiatorusername,
												" UserName");
										CM.enteringDataintoTextfiledByXpath(EL.elePassword_XP, Password, "Password");
										CM.clickonElementbyXpath(EL.eleLogin_XP, "LOGIN");
										Thread.sleep(5000);
										CM.clickonElementbyXpath(EL.elemenuicon_XP, "Menu icon");
										WebElement Documents = driver.findElement(By.xpath("//div[text()='Documents']"));
										AS.moveToElement(Documents).perform();
										Documents
												.findElement(By.xpath(
														"//span[@class='sub-tlt'][normalize-space()='" + Category + "']"))
												.click();
										Thread.sleep(4000);
										try {
											WebElement Displaynumber = driver
													.findElement(By.xpath("(//a[text()=' " + displayNumber + " '])[1]"));
											if (Displaynumber.isDisplayed()) {
												System.out.println("Displaynumber displayed");
												Displaynumber.click();
												System.out.println("document info page navigated");
											} else {
												System.out.println("Displaynumber not displayed");
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
											WebElement NonsignatoryAction = driver.findElement(By.xpath(
													"(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[1]/td[text()='"
															+ NonsignatoryRemarks + "']"));
											if (NonsignatoryAction.isDisplayed()) {
												System.out.println(
														"Nonsignatory reviewer action Remarks " + NonsignatoryRemarks);
											} else {
												System.out.println("Nonsignatory reviewer action not showing ");
											}
										} catch (Exception e) {
											System.out.println("not able to validate");
											System.out.println("Exception : " + e);
										}try {
											WebElement Nonsignatoryattachedfile = driver.findElement(By.xpath(
													"(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[1]/td[7]/div/a"));
											if (Nonsignatoryattachedfile.isDisplayed()) {
												System.out.println("Nonsignatory Attached file");
											} else {
												System.out.println("Nonsignatory Attached file not showing ");
											}
										} catch (Exception e) {
											System.out.println("not able to validate");
											System.out.println("Exception : " + e);
										}
										try {
											WebElement Nonsignatoryattachedfileprintsymbal = driver.findElement(By.xpath(
													"(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[1]/td[7]/div/img"));
											if (Nonsignatoryattachedfileprintsymbal.isDisplayed()) {
												System.out.println("Nonsignatory Attached file withprint symbal");
											} else {
												System.out.println("Nonsignatory Attached file print symbal not showing ");
											}
										} catch (Exception e) {
											System.out.println("not able to validate");
											System.out.println("Exception : " + e);
										}
										
										try {
											WebElement ReviewerAction = driver.findElement(By.xpath(
													"(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[2]/td[text()='Approved']"));
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
											WebElement NonsignatoryAction = driver.findElement(By.xpath(
													"(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[2]/td[text()='"
															+ NonsignatoryRemarks + "']"));
											if (NonsignatoryAction.isDisplayed()) {
												System.out.println(" reviewer action Remarks " + NonsignatoryRemarks);
											} else {
												System.out.println(" reviewer action not showing ");
											}
										} catch (Exception e) {
											System.out.println("not able to validate");
											System.out.println("Exception : " + e);
										}
										try {
											WebElement Nonsignatoryattachedfile = driver.findElement(By.xpath(
													"(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[2]/td[7]/div/a"));
											if (Nonsignatoryattachedfile.isDisplayed()) {
												System.out.println("Nonsignatory Attached file");
											} else {
												System.out.println("Nonsignatory Attached file not showing ");
											}
										} catch (Exception e) {
											System.out.println("not able to validate");
											System.out.println("Exception : " + e);
										}
										try {
											WebElement Nonsignatoryattachedfileprintsymbal = driver.findElement(By.xpath(
													"(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[2]/td[7]/div/img"));
											if (Nonsignatoryattachedfileprintsymbal.isDisplayed()) {
												System.out.println("Nonsignatory Attached file withprint symbal");
											} else {
												System.out.println("Nonsignatory Attached file print symbal not showing ");
											}
										} catch (Exception e) {
											System.out.println("not able to validate");
											System.out.println("Exception : " + e);
										}
										try {
											WebElement ApproverAction = driver.findElement(By.xpath(
													"(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[3]/td[text()='Rejected']"));
											if (ApproverAction.isDisplayed()) {
												System.out.println(" reviewer action Reject ");
											} else {
												System.out.println(" reviewer action not showing ");
											}
										} catch (Exception e) {
											System.out.println("not able to validate");
											System.out.println("Exception : " + e);
										}
										try {
											WebElement NonsignatoryAction = driver.findElement(By.xpath(
													"(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[3]/td[text()='"
															+ NonsignatoryRemarks + "']"));
											if (NonsignatoryAction.isDisplayed()) {
												System.out.println(" reviewer action Remarks " + NonsignatoryRemarks);
											} else {
												System.out.println(" reviewer action not showing ");
											}
										} catch (Exception e) {
											System.out.println("not able to validate");
											System.out.println("Exception : " + e);
										}
										try {
											WebElement Nonsignatoryattachedfile = driver.findElement(By.xpath(
													"(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[3]/td[7]/div/a"));
											if (Nonsignatoryattachedfile.isDisplayed()) {
												System.out.println("Nonsignatory Attached file");
											} else {
												System.out.println("Nonsignatory Attached file not showing ");
											}
										} catch (Exception e) {
											System.out.println("not able to validate");
											System.out.println("Exception : " + e);
										}
										try {
											WebElement Nonsignatoryattachedfileprintsymbal = driver.findElement(By.xpath(
													"(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[3]/td[7]/div/img"));
											if (Nonsignatoryattachedfileprintsymbal.isDisplayed()) {
												System.out.println("Nonsignatory Attached file withprint symbal");
											} else {
												System.out.println("Nonsignatory Attached file print symbal not showing ");
											}
										} catch (Exception e) {
											System.out.println("not able to validate");
											System.out.println("Exception : " + e);
										}
										try {
											WebElement Analyti = driver.findElement(By.xpath("//div[text()='An']"));
											Analyti.click();
											Thread.sleep(500);
											System.out.println("doc info page close");
										} catch (Exception e) {
											System.out.println("not able to validate");
											System.out.println("Exception : " + e);
										}
										try {
											WebElement Status = driver.findElement(By.xpath("//a[text()=' " + displayNumber
													+ " ']/parent::td/following-sibling::td[text()='Creation'])[1]"));
											if (Status.isDisplayed()) {
												System.out.println("Document status Approved");
												Thread.sleep(500);
											} else {
												System.out.println("Document status  not changed Approved");
												Thread.sleep(500);
											}
										} catch (Exception e) {
											System.out.println("not able to validate");
											System.out.println("Exception : " + e);
										}
										try {
											WebElement Status = driver.findElement(By.xpath("//a[text()=' " + displayNumber
													+ " ']/parent::td/following-sibling::td[text()='Creation'])[1]/sup"));
											if (Status.isDisplayed()) {
												System.out.println("Document status Approved");
												Thread.sleep(500);
											} else {
												System.out.println("Document status  not changed Approved");
												Thread.sleep(500);
											}
										} catch (Exception e) {
											System.out.println("not able to validate");
											System.out.println("Exception : " + e);
										}
										try {
											WebElement toggle = driver.findElement(By.xpath("//a[text()=' " + displayNumber
													+ " ']/parent::td/following-sibling::td/div[@class='inficon dotIcon']"));
											toggle.click();
											System.out.println("toggle clicked");
										} catch (Exception e) {
											System.out.println("not able to validate");
											System.out.println("Exception : " + e);
										}
										try {
											WebElement Submit = driver.findElement(By.xpath("//a[text()=' " + displayNumber
													+ " ']/parent::td/following-sibling::td/div[2]//a[text()='View Document']"));
											if (Submit.isDisplayed()) {
												System.out.println("Submit displayed");
											} else {
												System.out.println("Submit not displayed");
											}
										} catch (Exception e) {
											System.out.println("not able to validate");
											System.out.println("Exception : " + e);
										}
										try {
											WebElement Submit = driver.findElement(By.xpath("//a[text()=' " + displayNumber
													+ " ']/parent::td/following-sibling::td/div[2]//a[text()='Uncontrolled Print']"));
											if (Submit.isDisplayed()) {
												System.out.println("Uncontrolled Print displayed");
											} else {
												System.out.println("Uncontrolled Print not displayed");
											}
										} catch (Exception e) {
											System.out.println("not able to validate");
											System.out.println("Exception : " + e);
										}
										try {
											WebElement Submit = driver.findElement(By.xpath("//a[text()=' " + displayNumber
													+ " ']/parent::td/following-sibling::td/div[2]//a[text()='Print History']"));
											if (Submit.isDisplayed()) {
												System.out.println("Print History displayed");
											} else {
												System.out.println("Print History not displayed");
											}
										} catch (Exception e) {
											System.out.println("not able to validate");
											System.out.println("Exception : " + e);
										}
										try {
											WebElement Submit = driver.findElement(By.xpath("//a[text()=' " + displayNumber
													+ " ']/parent::td/following-sibling::td/div[2]//a[text()='Change History']"));
											if (Submit.isDisplayed()) {
												System.out.println("Change History displayed");
											} else {
												System.out.println("Change History not displayed");
											}
										} catch (Exception e) {
											System.out.println("not able to validate");
											System.out.println("Exception : " + e);
										}
									}
								} catch (Exception e) {
									System.out.println("not able select " + Decision2);
									System.out.println("Exception : " + e);
								}
							} else if (Decision2.equals("Resubmit")) {
								System.out.println("Resubmited");
								CM.clickonElementbyXpath(EL.elebtnComplete_XP, "Complete");
								driver.switchTo().alert().accept();
								Thread.sleep(2000);
								driver.switchTo().alert().accept();
								Thread.sleep(2000);
								CM.clickonElementbyXpath(EL.eleUsersetting_XP, "USER SETTINGS");
								CM.clickonElementbyXpath(EL.eleLogout_XP, "Log out");
								Thread.sleep(1000);
								CM.enteringDataintoTextfiledByXpath(EL.eleUserName_XP, initiatorusername, " UserName");
								CM.enteringDataintoTextfiledByXpath(EL.elePassword_XP, Password, "Password");
								CM.clickonElementbyXpath(EL.eleLogin_XP, "LOGIN");
								Thread.sleep(5000);
								CM.clickonElementbyXpath(EL.elemenuicon_XP, "Menu icon");
								WebElement Documents = driver.findElement(By.xpath("//div[text()='Documents']"));
								AS.moveToElement(Documents).perform();
								Documents
										.findElement(
												By.xpath("//span[@class='sub-tlt'][normalize-space()='" + Category + "']"))
										.click();
								Thread.sleep(4000);
								try {
									WebElement Displaynumber = driver
											.findElement(By.xpath("(//a[text()=' " + displayNumber + " '])[1]"));
									if (Displaynumber.isDisplayed()) {
										System.out.println("Displaynumber displayed");
										Displaynumber.click();
										System.out.println("document info page navigated");
									} else {
										System.out.println("Displaynumber not displayed");
									}
								} catch (Exception e) {
									System.out.println("not able to validate");
									System.out.println("Exception : " + e);
								}
								try {
									WebElement NonsignatoryAction = driver.findElement(By.xpath(
											"(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[1]/td[text()='Approved']"));
									if (NonsignatoryAction.isDisplayed()) {
										System.out.println("Nonsignatory reviewer action Approved ");
									} else {
										System.out.println("Nonsignatory reviewer action not showing ");
									}
								} catch (Exception e) {
									System.out.println("not able to validate");
									System.out.println("Exception : " + e);
								}
								try {
									WebElement NonsignatoryAction = driver.findElement(By.xpath(
											"(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[1]/td[text()='"
													+ NonsignatoryRemarks + "']"));
									if (NonsignatoryAction.isDisplayed()) {
										System.out.println("Nonsignatory reviewer action Remarks " + NonsignatoryRemarks);
									} else {
										System.out.println("Nonsignatory reviewer action not showing ");
									}
								} catch (Exception e) {
									System.out.println("not able to validate");
									System.out.println("Exception : " + e);
								}
								try {
									WebElement Nonsignatoryattachedfile = driver.findElement(By.xpath(
											"(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[1]/td[7]/div/a"));
									if (Nonsignatoryattachedfile.isDisplayed()) {
										System.out.println("Nonsignatory Attached file");
									} else {
										System.out.println("Nonsignatory Attached file not showing ");
									}
								} catch (Exception e) {
									System.out.println("not able to validate");
									System.out.println("Exception : " + e);
								}
								try {
									WebElement Nonsignatoryattachedfileprintsymbal = driver.findElement(By.xpath(
											"(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[1]/td[7]/div/img"));
									if (Nonsignatoryattachedfileprintsymbal.isDisplayed()) {
										System.out.println("Nonsignatory Attached file withprint symbal");
									} else {
										System.out.println("Nonsignatory Attached file print symbal not showing ");
									}
								} catch (Exception e) {
									System.out.println("not able to validate");
									System.out.println("Exception : " + e);
								}
								try {
									WebElement ReviewerAction = driver.findElement(By.xpath(
											"(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[2]/td[text()='Requested for Re-Submit']"));
									if (ReviewerAction.isDisplayed()) {
										System.out.println(" reviewer action Resubmit ");
									} else {
										System.out.println(" reviewer action not showing ");
									}
								} catch (Exception e) {
									System.out.println("not able to validate");
									System.out.println("Exception : " + e);
								}
								try {
									WebElement NonsignatoryAction = driver.findElement(By.xpath(
											"(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[2]/td[text()='"
													+ NonsignatoryRemarks + "']"));
									if (NonsignatoryAction.isDisplayed()) {
										System.out.println("Nonsignatory reviewer action Remarks " + NonsignatoryRemarks);
									} else {
										System.out.println("Nonsignatory reviewer action not showing ");
									}
								} catch (Exception e) {
									System.out.println("not able to validate");
									System.out.println("Exception : " + e);
								}
								try {
									WebElement Nonsignatoryattachedfile = driver.findElement(By.xpath(
											"(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[2]/td[7]/div/a"));
									if (Nonsignatoryattachedfile.isDisplayed()) {
										System.out.println("Reviewer Attached file");
									} else {
										System.out.println("Reviewer Attached file not showing ");
									}
								} catch (Exception e) {
									System.out.println("not able to validate");
									System.out.println("Exception : " + e);
								}
								try {
									WebElement Nonsignatoryattachedfileprintsymbal = driver.findElement(By.xpath(
											"(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[2]/td[7]/div/img"));
									if (Nonsignatoryattachedfileprintsymbal.isDisplayed()) {
										System.out.println("Reviewer Attached file withprint symbal");
									} else {
										System.out.println("Reviewer Attached file print symbal not showing ");
									}
								} catch (Exception e) {
									System.out.println("not able to validate");
									System.out.println("Exception : " + e);
								}
								try {
									WebElement ApproverAction = driver.findElement(By.xpath(
											"(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[3]/td[text()='Pending']"));
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
									WebElement Analyti = driver.findElement(By.xpath("//div[text()='An']"));
									Analyti.click();
									Thread.sleep(3000);
									System.out.println("doc info page close");
								} catch (Exception e) {
									System.out.println("not able to validate");
									System.out.println("Exception : " + e);
								}
								try {
									WebElement Status = driver.findElement(By.xpath("//a[text()=' " + displayNumber
											+ " ']/parent::td/following-sibling::td[text()='Creation']"));
									if (Status.isDisplayed()) {
										System.out.println("Document status Approved");
										Thread.sleep(500);
									} else {
										System.out.println("Document status  not changed Approved");
										Thread.sleep(500);
									}
								} catch (Exception e) {
									System.out.println("not able to validate");
									System.out.println("Exception : " + e);
								}
								try {
									WebElement toggle = driver.findElement(By.xpath("//a[text()=' " + displayNumber
											+ " ']/parent::td/following-sibling::td/div[@class='inficon dotIcon']"));
									toggle.click();
									System.out.println("toggle clicked");

								} catch (Exception e) {
									System.out.println("not able to validate");
									System.out.println("Exception : " + e);
								}
								try {
									WebElement Submit = driver.findElement(By.xpath("//a[text()=' " + displayNumber
											+ " ']/parent::td/following-sibling::td/div[2]//a[text()='Submit']"));
									if (Submit.isDisplayed()) {
										System.out.println("Submit displayed");
									} else {
										System.out.println("Submit not displayed");
									}
								} catch (Exception e) {
									System.out.println("not able to validate");
									System.out.println("Exception : " + e);
								}
								try {
									WebElement Submit = driver.findElement(By.xpath("//a[text()=' " + displayNumber
											+ " ']/parent::td/following-sibling::td/div[2]//a[text()='Uncontrolled Print']"));
									if (Submit.isDisplayed()) {
										System.out.println("Uncontrolled Print displayed");
									} else {
										System.out.println("Uncontrolled Print not displayed");
									}

								} catch (Exception e) {
									System.out.println("not able to validate");
									System.out.println("Exception : " + e);
								}
								try {
									WebElement Submit = driver.findElement(By.xpath("//a[text()=' " + displayNumber
											+ " ']/parent::td/following-sibling::td/div[2]//a[text()='Print History']"));
									if (Submit.isDisplayed()) {
										System.out.println("Print History displayed");
									} else {
										System.out.println("Print History not displayed");
									}
								} catch (Exception e) {
									System.out.println("not able to validate");
									System.out.println("Exception : " + e);
								}
								try {
									WebElement Submit = driver.findElement(By.xpath("//a[text()=' " + displayNumber
											+ " ']/parent::td/following-sibling::td/div[2]//a[text()='Change History']"));
									if (Submit.isDisplayed()) {
										System.out.println("Change History displayed");
									} else {
										System.out.println("Change History not displayed");
									}
								} catch (Exception e) {
									System.out.println("not able to validate");
									System.out.println("Exception : " + e);
								}
							} else if (Decision2.equals("Reject")) {
								System.out.println("Reject");
								CM.clickonElementbyXpath(EL.elebtnComplete_XP, "Complete");
								driver.switchTo().alert().accept();
								Thread.sleep(2000);
								driver.switchTo().alert().accept();
								Thread.sleep(2000);
								CM.clickonElementbyXpath(EL.eleUsersetting_XP, "USER SETTINGS");
								CM.clickonElementbyXpath(EL.eleLogout_XP, "Log out");
								Thread.sleep(1000);
								CM.enteringDataintoTextfiledByXpath(EL.eleUserName_XP, initiatorusername, " UserName");
								CM.enteringDataintoTextfiledByXpath(EL.elePassword_XP, Password, "Password");
								CM.clickonElementbyXpath(EL.eleLogin_XP, "LOGIN");
								Thread.sleep(5000);
								CM.clickonElementbyXpath(EL.elemenuicon_XP, "Menu icon");
								WebElement Documents = driver.findElement(By.xpath("//div[text()='Documents']"));
								AS.moveToElement(Documents).perform();
								Documents
										.findElement(
												By.xpath("//span[@class='sub-tlt'][normalize-space()='" + Category + "']"))
										.click();
								Thread.sleep(4000);
								try {
									WebElement Displaynumber = driver
											.findElement(By.xpath("(//a[text()=' " + displayNumber + " '])[1]"));
									if (Displaynumber.isDisplayed()) {
										System.out.println("Displaynumber displayed");
										Displaynumber.click();
										System.out.println("document info page navigated");
									} else {
										System.out.println("Displaynumber not displayed");
									}
								} catch (Exception e) {
									System.out.println("not able to validate");
									System.out.println("Exception : " + e);
								}
								try {
									WebElement NonsignatoryAction = driver.findElement(By.xpath(
											"(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[1]/td[text()='Approved']"));
									if (NonsignatoryAction.isDisplayed()) {
										System.out.println("Nonsignatory reviewer action Rejected ");
									} else {
										System.out.println("Nonsignatory reviewer action not showing ");
									}
								} catch (Exception e) {
									System.out.println("not able to validate");
									System.out.println("Exception : " + e);
								}
								try {
									WebElement NonsignatoryAction = driver.findElement(By.xpath(
											"(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[1]/td[text()='"
													+ NonsignatoryRemarks + "']"));
									if (NonsignatoryAction.isDisplayed()) {
										System.out.println("Nonsignatory reviewer action Remarks " + NonsignatoryRemarks);
									} else {
										System.out.println("Nonsignatory reviewer action not showing ");
									}
								} catch (Exception e) {
									System.out.println("not able to validate");
									System.out.println("Exception : " + e);
								}
								try {
									WebElement Nonsignatoryattachedfile = driver.findElement(By.xpath(
											"(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[1]/td[7]/div/a"));
									if (Nonsignatoryattachedfile.isDisplayed()) {
										System.out.println("Nonsignatory Attached file");
									} else {
										System.out.println("Nonsignatory Attached file not showing ");
									}
								} catch (Exception e) {
									System.out.println("not able to validate");
									System.out.println("Exception : " + e);
								}
								try {
									WebElement Nonsignatoryattachedfileprintsymbal = driver.findElement(By.xpath(
											"(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[1]/td[7]/div/img"));
									if (Nonsignatoryattachedfileprintsymbal.isDisplayed()) {
										System.out.println("Nonsignatory Attached file withprint symbal");
									} else {
										System.out.println("Nonsignatory Attached file print symbal not showing ");
									}
								} catch (Exception e) {
									System.out.println("not able to validate");
									System.out.println("Exception : " + e);
								}
								try {
									WebElement ReviewerAction = driver.findElement(By.xpath(
											"(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[2]/td[text()='Rejected']"));
									if (ReviewerAction.isDisplayed()) {
										System.out.println(" reviewer action Pending ");
									} else {
										System.out.println(" reviewer action not showing ");
									}
								} catch (Exception e) {
									System.out.println("not able to validate");
									System.out.println("Exception : " + e);
								}
								try {
									WebElement NonsignatoryAction = driver.findElement(By.xpath(
											"(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[2]/td[text()='"
													+ NonsignatoryRemarks + "']"));
									if (NonsignatoryAction.isDisplayed()) {
										System.out.println("Nonsignatory reviewer action Remarks " + NonsignatoryRemarks);
									} else {
										System.out.println("Nonsignatory reviewer action not showing ");
									}
								} catch (Exception e) {
									System.out.println("not able to validate");
									System.out.println("Exception : " + e);
								}
								try {
									WebElement Nonsignatoryattachedfile = driver.findElement(By.xpath(
											"(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[2]/td[7]/div/a"));
									if (Nonsignatoryattachedfile.isDisplayed()) {
										System.out.println("Nonsignatory Attached file");
									} else {
										System.out.println("Nonsignatory Attached file not showing ");
									}
								} catch (Exception e) {
									System.out.println("not able to validate");
									System.out.println("Exception : " + e);
								}
								try {
									WebElement Nonsignatoryattachedfileprintsymbal = driver.findElement(By.xpath(
											"(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[2]/td[7]/div/img"));
									if (Nonsignatoryattachedfileprintsymbal.isDisplayed()) {
										System.out.println("Nonsignatory Attached file withprint symbal");
									} else {
										System.out.println("Nonsignatory Attached file print symbal not showing ");
									}
								} catch (Exception e) {
									System.out.println("not able to validate");
									System.out.println("Exception : " + e);
								}
								try {
									WebElement ApproverAction = driver.findElement(By.xpath(
											"(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[3]/td[text()='Pending']"));
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
									WebElement Analyti = driver.findElement(By.xpath("//div[text()='An']"));
									Analyti.click();
									Thread.sleep(500);
									System.out.println("doc info page close");
								} catch (Exception e) {
									System.out.println("not able to validate");
									System.out.println("Exception : " + e);
								}
								try {
									WebElement Status = driver.findElement(By.xpath("//a[text()=' " + displayNumber
											+ " ']/parent::td/following-sibling::td[text()='Creation'])[1]"));
									if (Status.isDisplayed()) {
										System.out.println("Document status Approved");
										Thread.sleep(500);
									} else {
										System.out.println("Document status  not changed Approved");
										Thread.sleep(500);
									}
								} catch (Exception e) {
									System.out.println("not able to validate");
									System.out.println("Exception : " + e);
								}
								try {
									WebElement Status = driver.findElement(By.xpath("//a[text()=' " + displayNumber
											+ " ']/parent::td/following-sibling::td[text()='Creation'])[1]/sup"));
									if (Status.isDisplayed()) {
										System.out.println("Document status Approved");
										Thread.sleep(500);
									} else {
										System.out.println("Document status  not changed Approved");
										Thread.sleep(500);
									}
								} catch (Exception e) {
									System.out.println("not able to validate");
									System.out.println("Exception : " + e);
								}
								try {
									WebElement toggle = driver.findElement(By.xpath("//a[text()=' " + displayNumber
											+ " ']/parent::td/following-sibling::td/div[@class='inficon dotIcon']"));
									toggle.click();
									System.out.println("toggle clicked");
								} catch (Exception e) {
									System.out.println("not able to validate");
									System.out.println("Exception : " + e);
								}
								try {
									WebElement Submit = driver.findElement(By.xpath("//a[text()=' " + displayNumber
											+ " ']/parent::td/following-sibling::td/div[2]//a[text()='View Document']"));
									if (Submit.isDisplayed()) {
										System.out.println("Submit displayed");
									} else {
										System.out.println("Submit not displayed");
									}
								} catch (Exception e) {
									System.out.println("not able to validate");
									System.out.println("Exception : " + e);
								}
								try {
									WebElement Submit = driver.findElement(By.xpath("//a[text()=' " + displayNumber
											+ " ']/parent::td/following-sibling::td/div[2]//a[text()='Uncontrolled Print']"));
									if (Submit.isDisplayed()) {
										System.out.println("Uncontrolled Print displayed");
									} else {
										System.out.println("Uncontrolled Print not displayed");
									}
								} catch (Exception e) {
									System.out.println("not able to validate");
									System.out.println("Exception : " + e);
								}
								try {
									WebElement Submit = driver.findElement(By.xpath("//a[text()=' " + displayNumber
											+ " ']/parent::td/following-sibling::td/div[2]//a[text()='Print History']"));
									if (Submit.isDisplayed()) {
										System.out.println("Print History displayed");
									} else {
										System.out.println("Print History not displayed");
									}
								} catch (Exception e) {
									System.out.println("not able to validate");
									System.out.println("Exception : " + e);
								}
								try {
									WebElement Submit = driver.findElement(By.xpath("//a[text()=' " + displayNumber
											+ " ']/parent::td/following-sibling::td/div[2]//a[text()='Change History']"));
									if (Submit.isDisplayed()) {
										System.out.println("Change History displayed");
									} else {
										System.out.println("Change History not displayed");
									}
								} catch (Exception e) {
									System.out.println("not able to validate");
									System.out.println("Exception : " + e);
								}
							}
						} catch (Exception e) {
							System.out.println("not able select " + Decision2);
							System.out.println("Exception : " + e);
						}
					} else if (Decision1.equals("Resubmit")) {
						System.out.println("Resubmited");
						CM.clickonElementbyXpath(EL.elebtnComplete_XP, "Complete");
						driver.switchTo().alert().accept();
						Thread.sleep(2000);
						driver.switchTo().alert().accept();
						Thread.sleep(2000);
						CM.clickonElementbyXpath(EL.eleUsersetting_XP, "USER SETTINGS");
						CM.clickonElementbyXpath(EL.eleLogout_XP, "Log out");
						Thread.sleep(1000);
						CM.enteringDataintoTextfiledByXpath(EL.eleUserName_XP, initiatorusername, " UserName");
						CM.enteringDataintoTextfiledByXpath(EL.elePassword_XP, Password, "Password");
						CM.clickonElementbyXpath(EL.eleLogin_XP, "LOGIN");
						Thread.sleep(5000);
						CM.clickonElementbyXpath(EL.elemenuicon_XP, "Menu icon");
						WebElement Documents = driver.findElement(By.xpath("//div[text()='Documents']"));
						AS.moveToElement(Documents).perform();
						Documents.findElement(By.xpath("//span[@class='sub-tlt'][normalize-space()='" + Category + "']"))
								.click();
						Thread.sleep(4000);
						try {
							WebElement Displaynumber = driver
									.findElement(By.xpath("(//a[text()=' " + displayNumber + " '])[1]"));
							if (Displaynumber.isDisplayed()) {
								System.out.println("Displaynumber displayed");
								Displaynumber.click();
								System.out.println("document info page navigated");
							} else {
								System.out.println("Displaynumber not displayed");
							}
						} catch (Exception e) {
							System.out.println("not able to validate");
							System.out.println("Exception : " + e);
						}
						try {
							WebElement NonsignatoryAction = driver.findElement(By.xpath(
									"(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[1]/td[text()='Requested for Re-Submit']"));
							if (NonsignatoryAction.isDisplayed()) {
								System.out.println("Nonsignatory reviewer action Resubmit ");
							} else {
								System.out.println("Nonsignatory reviewer action not showing ");
							}
						} catch (Exception e) {
							System.out.println("not able to validate");
							System.out.println("Exception : " + e);
						}
						try {
							WebElement NonsignatoryAction = driver.findElement(By
									.xpath("(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[1]/td[text()='"
											+ NonsignatoryRemarks + "']"));
							if (NonsignatoryAction.isDisplayed()) {
								System.out.println("Nonsignatory reviewer action Remarks " + NonsignatoryRemarks);
							} else {
								System.out.println("Nonsignatory reviewer action not showing ");
							}
						} catch (Exception e) {
							System.out.println("not able to validate");
							System.out.println("Exception : " + e);
						}
						try {
							WebElement Nonsignatoryattachedfile = driver.findElement(By.xpath(
									"(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[1]/td[7]/div/a"));
							if (Nonsignatoryattachedfile.isDisplayed()) {
								System.out.println("Nonsignatory Attached file");
							} else {
								System.out.println("Nonsignatory Attached file not showing ");
							}
						} catch (Exception e) {
							System.out.println("not able to validate");
							System.out.println("Exception : " + e);
						}
						try {
							WebElement Nonsignatoryattachedfileprintsymbal = driver.findElement(By.xpath(
									"(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[1]/td[7]/div/img"));
							if (Nonsignatoryattachedfileprintsymbal.isDisplayed()) {
								System.out.println("Nonsignatory Attached file withprint symbal");
							} else {
								System.out.println("Nonsignatory Attached file print symbal not showing ");
							}
						} catch (Exception e) {
							System.out.println("not able to validate");
							System.out.println("Exception : " + e);
						}
						try {
							WebElement ReviewerAction = driver.findElement(By.xpath(
									"(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[2]/td[text()='Pending']"));
							if (ReviewerAction.isDisplayed()) {
								System.out.println(" reviewer action Pending ");
							} else {
								System.out.println(" reviewer action not showing ");
							}
						} catch (Exception e) {
							System.out.println("not able to validate");
							System.out.println("Exception : " + e);
						}
						try {
							WebElement ApproverAction = driver.findElement(By.xpath(
									"(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[3]/td[text()='Pending']"));
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
							WebElement Analyti = driver.findElement(By.xpath("//div[text()='An']"));
							Analyti.click();
							Thread.sleep(500);
							System.out.println("doc info page close");
						} catch (Exception e) {
							System.out.println("not able to validate");
							System.out.println("Exception : " + e);
						}
						try {
							WebElement Status = driver.findElement(By.xpath("//a[text()=' " + displayNumber
									+ " ']/parent::td/following-sibling::td[text()='Creation'])[1]"));
							if (Status.isDisplayed()) {
								System.out.println("Document status Approved");
								Thread.sleep(500);
							} else {
								System.out.println("Document status  not changed Approved");
								Thread.sleep(500);
							}
						} catch (Exception e) {
							System.out.println("not able to validate");
							System.out.println("Exception : " + e);
						}
						try {
							WebElement toggle = driver.findElement(By.xpath("//a[text()=' " + displayNumber
									+ " ']/parent::td/following-sibling::td/div[@class='inficon dotIcon']"));
							toggle.click();
							System.out.println("toggle clicked");
						} catch (Exception e) {
							System.out.println("not able to validate");
							System.out.println("Exception : " + e);
						}
						try {
							WebElement Submit = driver.findElement(By.xpath("//a[text()=' " + displayNumber
									+ " ']/parent::td/following-sibling::td/div[2]//a[text()='Submit']"));
							if (Submit.isDisplayed()) {
								System.out.println("Submit displayed");
							} else {
								System.out.println("Submit not displayed");
							}
						} catch (Exception e) {
							System.out.println("not able to validate");
							System.out.println("Exception : " + e);
						}
						try {
							WebElement Submit = driver.findElement(By.xpath("//a[text()=' " + displayNumber
									+ " ']/parent::td/following-sibling::td/div[2]//a[text()='Uncontrolled Print']"));
							if (Submit.isDisplayed()) {
								System.out.println("Uncontrolled Print displayed");
							} else {
								System.out.println("Uncontrolled Print not displayed");
							}
						} catch (Exception e) {
							System.out.println("not able to validate");
							System.out.println("Exception : " + e);
						}
						try {
							WebElement Submit = driver.findElement(By.xpath("//a[text()=' " + displayNumber
									+ " ']/parent::td/following-sibling::td/div[2]//a[text()='Print History']"));
							if (Submit.isDisplayed()) {
								System.out.println("Print History displayed");
							} else {
								System.out.println("Print History not displayed");
							}
						} catch (Exception e) {
							System.out.println("not able to validate");
							System.out.println("Exception : " + e);
						}
						try {
							WebElement Submit = driver.findElement(By.xpath("//a[text()=' " + displayNumber
									+ " ']/parent::td/following-sibling::td/div[2]//a[text()='Change History']"));
							if (Submit.isDisplayed()) {
								System.out.println("Change History displayed");
							} else {
								System.out.println("Change History not displayed");
							}
						} catch (Exception e) {
							System.out.println("not able to validate");
							System.out.println("Exception : " + e);
						}
					} else if (Decision1.equals("Reject")) {
						System.out.println("Reject");
						CM.clickonElementbyXpath(EL.elebtnComplete_XP, "Complete");
						driver.switchTo().alert().accept();
						Thread.sleep(2000);
						driver.switchTo().alert().accept();
						Thread.sleep(2000);
						CM.clickonElementbyXpath(EL.eleUsersetting_XP, "USER SETTINGS");
						CM.clickonElementbyXpath(EL.eleLogout_XP, "Log out");
						Thread.sleep(1000);
						CM.enteringDataintoTextfiledByXpath(EL.eleUserName_XP, initiatorusername, " UserName");
						CM.enteringDataintoTextfiledByXpath(EL.elePassword_XP, Password, "Password");
						CM.clickonElementbyXpath(EL.eleLogin_XP, "LOGIN");
						Thread.sleep(5000);
						CM.clickonElementbyXpath(EL.elemenuicon_XP, "Menu icon");
						WebElement Documents = driver.findElement(By.xpath("//div[text()='Documents']"));
						AS.moveToElement(Documents).perform();
						Documents.findElement(By.xpath("//span[@class='sub-tlt'][normalize-space()='" + Category + "']"))
								.click();
						Thread.sleep(4000);
						try {
							WebElement Displaynumber = driver
									.findElement(By.xpath("(//a[text()=' " + displayNumber + " '])[1]"));
							if (Displaynumber.isDisplayed()) {
								System.out.println("Displaynumber displayed");
								Displaynumber.click();
								System.out.println("document info page navigated");
							} else {
								System.out.println("Displaynumber not displayed");
							}
						} catch (Exception e) {
							System.out.println("not able to validate");
							System.out.println("Exception : " + e);
						}
						try {
							WebElement NonsignatoryAction = driver.findElement(By.xpath(
									"(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[1]/td[text()='Rejected']"));
							if (NonsignatoryAction.isDisplayed()) {
								System.out.println("Nonsignatory reviewer action Rejected ");
							} else {
								System.out.println("Nonsignatory reviewer action not showing ");
							}
						} catch (Exception e) {
							System.out.println("not able to validate");
							System.out.println("Exception : " + e);
						}
						try {
							WebElement NonsignatoryAction = driver.findElement(By
									.xpath("(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[1]/td[text()='"
											+ NonsignatoryRemarks + "']"));
							if (NonsignatoryAction.isDisplayed()) {
								System.out.println("Nonsignatory reviewer action Remarks " + NonsignatoryRemarks);
							} else {
								System.out.println("Nonsignatory reviewer action not showing ");
							}
						} catch (Exception e) {
							System.out.println("not able to validate");
							System.out.println("Exception : " + e);
						}
						try {
							WebElement Nonsignatoryattachedfile = driver.findElement(By.xpath(
									"(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[1]/td[7]/div/a"));
							if (Nonsignatoryattachedfile.isDisplayed()) {
								System.out.println("Nonsignatory Attached file");
							} else {
								System.out.println("Nonsignatory Attached file not showing ");
							}
						} catch (Exception e) {
							System.out.println("not able to validate");
							System.out.println("Exception : " + e);
						}
						try {
							WebElement Nonsignatoryattachedfileprintsymbal = driver.findElement(By.xpath(
									"(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[1]/td[7]/div/img"));
							if (Nonsignatoryattachedfileprintsymbal.isDisplayed()) {
								System.out.println("Nonsignatory Attached file withprint symbal");
							} else {
								System.out.println("Nonsignatory Attached file print symbal not showing ");
							}
						} catch (Exception e) {
							System.out.println("not able to validate");
							System.out.println("Exception : " + e);
						}
						try {
							WebElement ReviewerAction = driver.findElement(By.xpath(
									"(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[2]/td[text()='Pending']"));
							if (ReviewerAction.isDisplayed()) {
								System.out.println(" reviewer action Pending ");
							} else {
								System.out.println(" reviewer action not showing ");
							}
						} catch (Exception e) {
							System.out.println("not able to validate");
							System.out.println("Exception : " + e);
						}
						try {
							WebElement ApproverAction = driver.findElement(By.xpath(
									"(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[3]/td[text()='Pending']"));
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
							WebElement Analyti = driver.findElement(By.xpath("//div[text()='An']"));
							Analyti.click();
							Thread.sleep(3000);
							System.out.println("doc info page close");
						} catch (Exception e) {
							System.out.println("not able to validate");
							System.out.println("Exception : " + e);
						}
						try {
							WebElement Status = driver.findElement(By.xpath("//a[text()=' " + displayNumber
									+ " ']/parent::td/following-sibling::td[text()='Creation'])[1]"));
							if (Status.isDisplayed()) {
								System.out.println("Document status Approved");
								Thread.sleep(500);
							} else {
								System.out.println("Document status  not changed Approved");
								Thread.sleep(500);
							}
						} catch (Exception e) {
							System.out.println("not able to validate");
							System.out.println("Exception : " + e);
						}
						try {
							WebElement Status = driver.findElement(By.xpath("//a[text()=' " + displayNumber
									+ " ']/parent::td/following-sibling::td[text()='Creation'])[1]/sup"));
							if (Status.isDisplayed()) {
								System.out.println("Document status Approved");
								Thread.sleep(500);
							} else {
								System.out.println("Document status  not changed Approved");
								Thread.sleep(500);
							}
						} catch (Exception e) {
							System.out.println("not able to validate");
							System.out.println("Exception : " + e);
						}
						try {
							WebElement toggle = driver.findElement(By.xpath("//a[text()=' " + displayNumber
									+ " ']/parent::td/following-sibling::td/div[@class='inficon dotIcon']"));
							toggle.click();
							System.out.println("toggle clicked");
						} catch (Exception e) {
							System.out.println("not able to validate");
							System.out.println("Exception : " + e);
						}
						try {
							WebElement Submit = driver.findElement(By.xpath("//a[text()=' " + displayNumber
									+ " ']/parent::td/following-sibling::td/div[2]//a[text()='View Document']"));
							if (Submit.isDisplayed()) {
								System.out.println("Submit displayed");
							} else {
								System.out.println("Submit not displayed");
							}
						} catch (Exception e) {
							System.out.println("not able to validate");
							System.out.println("Exception : " + e);
						}
						try {
							WebElement Submit = driver.findElement(By.xpath("//a[text()=' " + displayNumber
									+ " ']/parent::td/following-sibling::td/div[2]//a[text()='Uncontrolled Print']"));
							if (Submit.isDisplayed()) {
								System.out.println("Uncontrolled Print displayed");
							} else {
								System.out.println("Uncontrolled Print not displayed");
							}
						} catch (Exception e) {
							System.out.println("not able to validate");
							System.out.println("Exception : " + e);
						}
						try {
							WebElement Submit = driver.findElement(By.xpath("//a[text()=' " + displayNumber
									+ " ']/parent::td/following-sibling::td/div[2]//a[text()='Print History']"));
							if (Submit.isDisplayed()) {
								System.out.println("Print History displayed");
							} else {
								System.out.println("Print History not displayed");
							}
						} catch (Exception e) {
							System.out.println("not able to validate");
							System.out.println("Exception : " + e);
						}
						try {
							WebElement Submit = driver.findElement(By.xpath("//a[text()=' " + displayNumber
									+ " ']/parent::td/following-sibling::td/div[2]//a[text()='Change History']"));
							if (Submit.isDisplayed()) {
								System.out.println("Change History displayed");
							} else {
								System.out.println("Change History not displayed");
							}
						} catch (Exception e) {
							System.out.println("not able to validate");
							System.out.println("Exception : " + e);
						}
					}
				} catch (Exception e) {
					System.out.println("not able select " + Decision1);
					System.out.println("Exception : " + e);
				}
			}
		}}
	//try {
//		WebElement Displaynumber = driver.findElement(By.xpath("(//a[text()=' " + displayNumber + " '])[1]"));
//		if (Displaynumber.isDisplayed()) {
//			System.out.println("Displaynumber displayed");
//			Displaynumber.click();
//			System.out.println("document info page navigated");
//		} else {
//			System.out.println("Displaynumber not displayed");
//		}
	//} catch (Exception e) {
//		System.out.println("not able to validate");
//		System.out.println("Exception : " + e);
	//}
	//CM.CheckElementDisplayedbyXpath(EL.eleTitlenumber1_XP, "Doc info-Title & Number");
	//CM.CheckElementDisplayedbyXpath(EL.eleDes1_XP, "Doc info-Description");
	//CM.CheckElementDisplayedbyXpath(EL.eleLocadep1_XP, "Doc info-Loc, Dep");
	//CM.CheckElementDisplayedbyXpath(EL.eleClassi1_XP, "Doc info-Classification");
	//CM.CheckElementDisplayedbyXpath(EL.eleASso1_XP, "Doc info-Associations");
	//CM.CheckElementDisplayedbyXpath(EL.eleSeett1_XP, "Doc info-Settings");
	//CM.CheckElementDisplayedbyXpath(EL.eleFile1_XP, "Doc info-File");
	//try {
//		String Titlenmber1 = driver.findElement(By.xpath("//td[@id='tdPrimaryDocTitle']")).getText();
//		System.out.println(Titlenmber1);
//		if (Titlenmber1.equals(Title)) {
//			System.out.println("expected number title is correct");
//		} else {
//			System.out.println("expected number title incorrect");
//		}
	//} catch (Exception e) {
//		System.out.println("not able to validate");
//		System.out.println("Exception : " + e);
	//}
	//try {
//		String Description1 = driver
//				.findElement(By.xpath("//td[@id='tdPrimaryDocTitle']/following-sibling::td[1]")).getText();
//		System.out.println(Description1);
//		if (Description1.equals(DocDiscription)) {
//			System.out.println("expected Description1 is correct");
//		} else {
//			System.out.println("expected Description1 incorrect");
//		}
	//} catch (Exception e) {
//		System.out.println("not able to validate");
//		System.out.println("Exception : " + e);
	//}
	//try {
//		WebElement Loctaion = driver.findElement(By.xpath(" //p[text()='  Unit-I']"));
//		if (Loctaion.isDisplayed()) {
//			System.out.println("Location name displayed");
//		} else {
//			System.out.println("Location name  not displayed");
//		}
	//} catch (Exception e) {
//		System.out.println("not able  to validate expected location department element");
//		System.out.println("Exception : " + e);
	//}
	//try {
//		WebElement department = driver.findElement(By.xpath(" //p[text()='  Quality Assurance']"));
//		if (department.isDisplayed()) {
//			System.out.println("department is displayed");
//		} else {
//			System.out.println("department not displayed");
//		}
	//} catch (Exception e) {
//		System.out.println("not able  to validate expected location department element");
//		System.out.println("Exception : " + e);
	//}
	//try {
//		boolean category = driver
//				.findElement(By.xpath("(//td[@id='tdPrimaryDocClassification']/table/tbody/tr/td/b)[1]"))
//				.isDisplayed();
//		if (category) {
//			System.out.println("category");
//		} else {
//			System.out.println("category not displayed");
//		}
	//} catch (Exception e) {
//		System.out.println("not able to validate");
//		System.out.println("Exception : " + e);
	//}
	//try {
//		boolean subcategory = driver
//				.findElement(By.xpath("(//td[@id='tdPrimaryDocClassification']/table/tbody/tr/td/b)[2]"))
//				.isDisplayed();
//		if (subcategory) {
//			System.out.println("subcategory");
//		} else {
//			System.out.println("subcategory not displayed");
//		}
	//} catch (Exception e) {
//		System.out.println("not able to validate");
//		System.out.println("Exception : " + e);
	//}
	//try {
//		boolean Types = driver
//				.findElement(By.xpath("(//td[@id='tdPrimaryDocClassification']/table/tbody/tr/td/b)[3]"))
//				.isDisplayed();
//		if (Types) {
//			System.out.println("Types");
//		} else {
//			System.out.println("Types not displayed");
//		}
	//} catch (Exception e) {
//		System.out.println("not able to validate");
//		System.out.println("Exception : " + e);
	//}
	//try {
	//
//		WebElement categoryname = driver.findElement(By.xpath("//td[text()='" + Category + "']"));
//		if (categoryname.isDisplayed()) {
//			System.out.println("category name displayed");
//		} else {
//			System.out.println("category name not displayed");
//		}
	//} catch (Exception e) {
//		System.out.println("not able to validate");
//		System.out.println("Exception : " + e);
	//}
	//try {
//		WebElement subcategoryname = driver.findElement(By.xpath("//td[text()='" + Subcategory + "']"));
//		if (subcategoryname.isDisplayed()) {
//			System.out.println("subcategory name displayed");
//		} else {
//			System.out.println("subcategory name not displayed");
//		}
	//} catch (Exception e) {
//		System.out.println("not able to validate");
//		System.out.println("Exception : " + e);
	//}
	//try {
//		WebElement typE = driver.findElement(By.xpath("//td[text()='" + Type + "']"));
//		if (typE.isDisplayed()) {
//			System.out.println("Type name displayed");
//		} else {
//			System.out.println("Type name not displayed");
//		}
	//} catch (Exception e) {
//		System.out.println("not able to validate");
//		System.out.println("Exception : " + e);
	//}
	//try {
//		if (product.isDisplayed()) {
//			System.out.println("product displayed");
//		} else {
//			System.out.println("product not displayed");
//		}
	//} catch (Exception e) {
//		System.out.println("not able to validate");
//		System.out.println("Exception : " + e);
	//}
	//try {
//		if (Materials.isDisplayed()) {
//			System.out.println("Material displayed");
//		} else {
//			System.out.println("Material not displayed");
//		}
	//} catch (Exception e) {
//		System.out.println("not able to validate");
//		System.out.println("Exception : " + e);
	//}
	//try {
//		if (user.isDisplayed()) {
//			System.out.println("user displayed");
//		} else {
//			System.out.println("user not displayed");
//		}
	//} catch (Exception e) {
//		System.out.println("not able to validate");
//		System.out.println("Exception : " + e);
	//}
	//try {
//		if (Assets.isDisplayed()) {
//			System.out.println("Assets name displayed");
//		} else {
//			System.out.println("Assets name not displayed");
//		}
	//} catch (Exception e) {
//		System.out.println("not able to validate");
//		System.out.println("Exception : " + e);
	//}
	////try {
////		WebElement productname = driver.findElement(By.xpath("//td[text()='" + Productss + "']"));
////		if (productname.isDisplayed()) {
////			System.out.println("product name displayed");
////		} else {
////			System.out.println("product name not displayed");
////		}
	////} catch (Exception e) {
////		System.out.println("not able to validate");
////		System.out.println("Exception : " + e);
	////}
	//// WebElement Materialname
	//// =driver.findElement(By.xpath("//td[text()='"+MateriaL+"']"));
	//// if(Materialname.isDisplayed()) {
////			System.out.println("Material name displayed");
	//// }else {
////			System.out.println("Material name not displayed");
	//// }
	////try {
////		WebElement Users = driver.findElement(By.xpath("//td[text()='" + User + "']"));
////		if (Users.isDisplayed()) {
////			System.out.println("USER name displayed");
////		} else {
////			System.out.println("USER name not displayed");
////		}
	////} catch (Exception e) {
////		System.out.println("not able to validate");
////		System.out.println("Exception : " + e);
	////}
	////try {
////		WebElement Asset1 = driver.findElement(By.xpath("//td[text()='" + asset + "']"));
////		if (Asset1.isDisplayed()) {
////			System.out.println("Assets name displayed");
////		} else {
////			System.out.println("Assets name not displayed");
////		}
	////} catch (Exception e) {
////		System.out.println("not able to validate");
////		System.out.println("Exception : " + e);
	////}
	//try {
//		WebElement setting = driver.findElement(By.xpath("//td[@id='tdLayout']"));
//		if (setting.isDisplayed()) {
//			System.out.println("setting is Displayed");
//		} else {
//			System.out.println("settings not equal");
//		}
	//} catch (Exception e) {
//		System.out.println("not able to validate");
//		System.out.println("Exception : " + e);
	//}
	//driver.findElement(By.xpath("(//img[@title='View Document'])[1]")).click();
	//Thread.sleep(2000);
	//driver.switchTo().window(parentwindow);
	//try {
//		WebElement Associated = driver.findElement(By.xpath("//h1[text()='Associated Documents']"));
//		if (Associated.isDisplayed()) {
//			System.out.println("Associated Documents header is displayed");
//		} else {
//			System.out.println("Associated Documents header is not displayed");
//		}
	//} catch (Exception e) {
//		System.out.println("not able to validate");
//		System.out.println("Exception : " + e);
	//}
	//try {
//		WebElement Assotitle = driver.findElement(By.xpath(
//				"//table[@id='jsonTblAssDocs']//th[@class='t-header wid15pc'][normalize-space()='Title & Number']"));
//		if (Assotitle.isDisplayed()) {
//			System.out.println("ASSOCIATED DOCUMENTS Title & Number header is displayed");
//		} else {
//			System.out.println("ASSOCIATED DOCUMENTS Title & Number header is not displayed ");
//		}
	//} catch (Exception e) {
//		System.out.println("not able to validate");
//		System.out.println("Exception : " + e);
	//}
	//try {
//		WebElement AssoDescrip = driver.findElement(By.xpath(
//				"//table[@id='jsonTblAssDocs']//th[@class='t-header wid20pc'][normalize-space()='Description']"));
//		if (AssoDescrip.isDisplayed()) {
//			System.out.println("ASSOCIATED DOCUMENTS description header is displayed");
//		} else {
//			System.out.println("ASSOCIATED DOCUMENTS description header is not displayed ");
//		}
	//} catch (Exception e) {
//		System.out.println("not able to validate");
//		System.out.println("Exception : " + e);
	//}
	//try {
//		WebElement AssoLocDoc = driver.findElement(By.xpath(
//				"//table[@id='jsonTblAssDocs']//th[@class='t-header wid15pc'][normalize-space()='Loc, Dep']"));
//		if (AssoLocDoc.isDisplayed()) {
//			System.out.println("ASSOCIATED DOCUMENTS location & department header is displayed");
//		} else {
//			System.out.println("ASSOCIATED DOCUMENTS location & department header is not displayed ");
//		}
	//} catch (Exception e) {
//		System.out.println("not able to validate");
//		System.out.println("Exception : " + e);
	//}
	//try {
//		WebElement Assoclassi = driver.findElement(By.xpath(
//				"//table[@id='jsonTblAssDocs']//th[@class='t-header wid20pc'][normalize-space()='Classification']"));
//		if (Assoclassi.isDisplayed()) {
//			System.out.println("ASSOCIATED DOCUMENTS Classification header is displayed");
//		} else {
//			System.out.println("ASSOCIATED DOCUMENTS Classification header is not displayed ");
//		}
	//} catch (Exception e) {
//		System.out.println("not able to validate");
//		System.out.println("Exception : " + e);
	//}
	//try {
//		WebElement AssoASSOCIATION = driver.findElement(By.xpath(
//				"//table[@id='jsonTblAssDocs']//th[@class='t-header wid20pc'][normalize-space()='Associations']"));
//		if (AssoASSOCIATION.isDisplayed()) {
//			System.out.println("ASSOCIATED DOCUMENTS Associations header is displayed");
//		} else {
//			System.out.println("ASSOCIATED DOCUMENTS Associations header is not displayed ");
//		}
	//} catch (Exception e) {
//		System.out.println("not able to validate");
//		System.out.println("Exception : " + e);
	//}
	//try {
//		WebElement AssoSETTING = driver.findElement(By.xpath(
//				"//table[@id='jsonTblAssDocs']//th[@class='t-header wid20pc'][normalize-space()='Associations']"));
//		if (AssoSETTING.isDisplayed()) {
//			System.out.println("ASSOCIATED DOCUMENTS Settings header is displayed");
//		} else {
//			System.out.println("ASSOCIATED DOCUMENTS Settings header is not displayed ");
//		}
	//} catch (Exception e) {
//		System.out.println("not able to validate");
//		System.out.println("Exception : " + e);
	//}
	//try {
//		WebElement AssoFile = driver.findElement(By.xpath(
//				"//table[@id='jsonTblAssDocs']//th[@class='t-header wid5pc'][normalize-space()='File']"));
//		if (AssoFile.isDisplayed()) {
//			System.out.println("ASSOCIATED DOCUMENTS file header is displayed");
//		} else {
//			System.out.println("ASSOCIATED DOCUMENTS file header is not displayed ");
//		}
	//} catch (Exception e) {
//		System.out.println("not able to validate");
//		System.out.println("Exception : " + e);
	//}
	//// change details
	////try {
////		WebElement changedetails = driver.findElement(By.xpath("//h1[text()='Change Controls']"));
////		if (changedetails.isDisplayed()) {
////			System.out.println("Change detail header is displayed");
////		} else {
////			System.out.println("change detail header is not displayed");
////		}
	////} catch (Exception e) {
////		System.out.println("not able to validate");
////		System.out.println("Exception : " + e);
	////}
	////try {
////		WebElement ID = driver.findElement(By.xpath("//span[text()='Id']"));
////		if (ID.isDisplayed()) {
////			System.out.println("ID header is displayed");
////		} else {
////			System.out.println("id header is not displayed");
////		}
	////} catch (Exception e) {
////		System.out.println("not able to validate");
////		System.out.println("Exception : " + e);
	////}
////				try {
////				WebElement changedis = driver.findElement(By.xpath("//span[text()='Description']"));
////				if (changedis.isDisplayed()) {
////					System.out.println("change control discription header is displayed");
////				} else {
////					System.out.println("change control discription  header not displayed");
////				}
////					} catch (Exception e) {
////						System.out.println("not able to validate");
////						System.out.println("Exception : " + e);
////					}
////				try {
////				WebElement filechangecontrol = driver.findElement(By.xpath("(//span[text()='File'])[1]"));
////				if (filechangecontrol.isDisplayed()) {
////					System.out.println("filechangecontrol header is displayed");
////				} else {
////					System.out.println("filechangecontrol header is not displayed");
////				}
////					} catch (Exception e) {
////						System.out.println("not able to validate");
////						System.out.println("Exception : " + e);
////					}
////				try {
////				WebElement chngecontrolID = driver.findElement(By.xpath("//td[text()='" + changecontrolnumbar + "']"));
////				if (chngecontrolID.isDisplayed()) {
////					System.out.println("Change control ID is displayed");
////				} else {
////					System.out.println("Change control ID is not displayed");
////				}
////					} catch (Exception e) {
////						System.out.println("not able to validate");
////						System.out.println("Exception : " + e);
////					}
////				try {
////				WebElement changecontroldiscription = driver
////						.findElement(By.xpath("//td[text()='" + changecontrolDescription + "']"));
////				if (changecontroldiscription.isDisplayed()) {
////					System.out.println("change control discription is displayed");
////				} else {
////					System.out.println("change control discription displayed");
////				}
////					} catch (Exception e) {
////						System.out.println("not able to validate");
////						System.out.println("Exception : " + e);
////					}
////				Thread.sleep(5000);
////				String Changeparentwindow = driver.getWindowHandle();
////				System.out.println(parentwindow);
////				driver.findElement(By.xpath("(//img[@title='View Document'])[2]")).click();
////				String ChangeChildwindow = driver.getWindowHandle();
////				System.out.println(Childwindow);
////				Thread.sleep(5000);
////				driver.switchTo().window(Changeparentwindow);
	//// Approval history
	//try {
//		WebElement approvalhistory = driver.findElement(By.xpath("//h1[text()='Approval History']"));
//		if (approvalhistory.isDisplayed()) {
//			System.out.println("approvalhistory is displayed");
//		} else {
//			System.out.println("approvalhistory not dispalyed");
//		}
	//} catch (Exception e) {
//		System.out.println("not able to validate");
//		System.out.println("Exception : " + e);
	//}
	//CM.CheckElementDisplayedbyXpath(EL.eleTypname_XP, "Type Name");
	//CM.CheckElementDisplayedbyXpath(EL.eleinitiaon_XP, "Initiated On");
	//CM.CheckElementDisplayedbyXpath(EL.eleinitiaby_XP, "Initiated By");
	//CM.CheckElementDisplayedbyXpath(EL.elestatuS1_XP, "Status");
	//CM.CheckElementDisplayedbyXpath(EL.elecollpall_XP, "Collapse All");
	//CM.CheckElementDisplayedbyXpath(EL.eleHidedetail_XP, "Hide details");
	//CM.clickonElementbyXpath(EL.elecollpall_XP, "Collapse All");
	//CM.clickonElementbyXpath(EL.eleshowdetails_XP, "Show details");
	//try {
//		WebElement submission = driver.findElement(By.xpath("//td[text()='Effective']"));
//		if (submission.isDisplayed()) {
//			System.out.println("submission is displayed");
//		} else {
//			System.out.println("submission not displayed");
//		}
	//} catch (Exception e) {
//		System.out.println("not able to validate");
//		System.out.println("Exception : " + e);
	//}
	//try {
//		WebElement initiatedby = driver.findElement(By.xpath("(//td[text()='" + initiatedBy + "'])[1]"));
//		if (initiatedby.isDisplayed()) {
//			Thread.sleep(500);
//			System.out.println("initiatedby" + initiatedBy);
//		} else {
//			System.out.println("initiatedby not displayed");
//		}
	//} catch (Exception e) {
//		System.out.println("not able to validate");
//		System.out.println("Exception : " + e);
	//}
	//try {
	//WebElement statuss = driver.findElement(By.xpath("//td[text()='In Progress']"));
	//if (statuss.isDisplayed()) {
//		System.out.println("status In Progress is displayed");
	//} else {
//		System.out.println("status In Progress is not displayed");
	//}
	//} catch (Exception e) {
	//System.out.println("not able to validate");
	//System.out.println("Exception : " + e);
	//}
	//try {
	//WebElement EffectiveDates = driver.findElement(By.xpath("(//td[@class='CLH'])[1]"));
	//Thread.sleep(5000);
	//EffectiveDate = EffectiveDates.getText();
	//System.out.println(Date);
	//} catch (Exception e) {
	//System.out.println("Exeption e");
	//}	
	//try {
//		WebElement submission = driver.findElement(By.xpath("//td[text()='Submission']"));
//		if (submission.isDisplayed()) {
//			System.out.println("submission is displayed");
//		} else {
//			System.out.println("submission not displayed");
//		}
	//} catch (Exception e) {
//		System.out.println("not able to validate");
//		System.out.println("Exception : " + e);
	//}
	//try {
//		WebElement initiatedby = driver.findElement(By.xpath("(//td[text()='" + initiatedBy + "'])[2]"));
//		if (initiatedby.isDisplayed()) {
//			Thread.sleep(500);
//			System.out.println("initiatedby" + initiatedBy);
//		} else {
//			System.out.println("initiatedby not displayed");
//		}
	//} catch (Exception e) {
//		System.out.println("not able to validate");
//		System.out.println("Exception : " + e);
	//}
	//try {
//		WebElement statuss = driver.findElement(By.xpath("//td[text()='Completed']"));
//		if (statuss.isDisplayed()) {
//			System.out.println("status Completed is displayed");
//		} else {
//			System.out.println("status Completed is not displayed");
//		}
	//} catch (Exception e) {
//		System.out.println("not able to validate");
//		System.out.println("Exception : " + e);
	//}
	//CM.CheckElementDisplayedbyXpath(EL.elestep1_XP, "Step Name");
	//CM.CheckElementDisplayedbyXpath(EL.eleAction1_XP, "Action");
	//CM.CheckElementDisplayedbyXpath(EL.eleacteddby1_XP, "Acted By");
	//CM.CheckElementDisplayedbyXpath(EL.eleaccepted1_XP, "Accepted On");
	//CM.CheckElementDisplayedbyXpath(EL.eleremark1_XP, "Remarks");
	//CM.CheckElementDisplayedbyXpath(EL.elefile1_XP, "File");
	//CM.CheckElementDisplayedbyXpath(EL.eleeffecti_XP, "effective stepname");
	//CM.CheckElementDisplayedbyXpath(EL.eleapproved_XP, "Approved");
	//try {
//		WebElement effectiveinitiator= driver.findElement(By.xpath("(//div[@class='t-widget t-grid'])[3]/table/tbody/tr/td[4][text()='"+initiatedBy+"']"));
//		if(effectiveinitiator.isDisplayed()) {
//			System.out.println("Make Effectiv einitiator"+initiatedBy);
//		}else {
//			System.out.println("Make effective initiator not displayed");
//		}
//		} catch (Exception e) {
//			System.out.println("not able to validate");
//			System.out.println("Exception : " + e);
//		}
	//CM.CheckElementDisplayedbyXpath(EL.elestep2_XP, "Step Name");
	//CM.CheckElementDisplayedbyXpath(EL.eleAction2_XP, "Action");
	//CM.CheckElementDisplayedbyXpath(EL.eleacteddby2_XP, "Acted By");
	//CM.CheckElementDisplayedbyXpath(EL.eleaccepted2_XP, "Accepted On");
	//CM.CheckElementDisplayedbyXpath(EL.eleremark2_XP, "Remarks");
	//CM.CheckElementDisplayedbyXpath(EL.elefile22_XP, "File");
	//WebElement Nonsignata1 = driver.findElement(By.xpath(
//			"(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[1]/td[text()='Task for Non-Signatory Reviewers']"));
	//try {
//		if (Nonsignata1.isDisplayed()) {
//			System.out.println("Task for Non-Signatory Reviewers dispalyed");
//		} else {
//			System.out.println("Task for Non-Signatory Reviewers not dispalyed");
//		}
	//} catch (Exception e) {
//		System.out.println("not able to validate");
//		System.out.println("Exception : " + e);
	//}
	//WebElement TaskReviewer1 = driver.findElement(By.xpath(
//			"(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[2]/td[text()='Default Tasks for Reviewers']"));
	//try {
//		if (TaskReviewer1.isDisplayed()) {
//			System.out.println("Default Tasks for Reviewers dispalyed");
//		} else {
//			System.out.println("Default Tasks for Reviewers not dispalyed");
//		}
	//} catch (Exception e) {
//		System.out.println("not able to validate");
//		System.out.println("Exception : " + e);
	//}
	//WebElement TaskApprover1 = driver.findElement(By.xpath(
//			"(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[3]/td[text()='Approval 1']"));
	//try {
//		if (TaskApprover1.isDisplayed()) {
//			System.out.println("Default Tasks for Reviewers dispalyed");
//		} else {
//			System.out.println("Default Tasks for Reviewers not dispalyed");
//		}
	//} catch (Exception e) {
//		System.out.println("not able to validate");
//		System.out.println("Exception : " + e);
	//}
	//try {
//		WebElement NonsignatoryAction = driver.findElement(By.xpath(
//				"(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[1]/td[text()='Approved']"));
//		if (NonsignatoryAction.isDisplayed()) {
//			System.out.println("Nonsignatory reviewer action Approve ");
//		} else {
//			System.out.println("Nonsignatory reviewer action not showing ");
//		}
	//} catch (Exception e) {
//		System.out.println("not able to validate");
//		System.out.println("Exception : " + e);
	//}
	//try {
//		WebElement NonsignatoryAction = driver.findElement(By.xpath(
//				"(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[1]/td[text()='"
//						+ NonsignatoryRemarks + "']"));
//		if (NonsignatoryAction.isDisplayed()) {
//			System.out.println("Nonsignatory action Remarks " + NonsignatoryRemarks);
//		} else {
//			System.out.println("Nonsignatory action not showing ");
//		}
	//} catch (Exception e) {
//		System.out.println("not able to validate");
//		System.out.println("Exception : " + e);
	//}
	//try {
//		WebElement ReviewerAction = driver.findElement(By.xpath(
//				"(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[2]/td[text()='Approved']"));
//		if (ReviewerAction.isDisplayed()) {
//			System.out.println(" Reviewer action Approve ");
//		} else {
//			System.out.println(" Reviewer action not showing ");
//		}
	//} catch (Exception e) {
//		System.out.println("not able to validate");
//		System.out.println("Exception : " + e);
	//}
	//try {
//		WebElement NonsignatoryAction = driver.findElement(By.xpath(
//				"(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[2]/td[text()='"
//						+ NonsignatoryRemarks + "']"));
//		if (NonsignatoryAction.isDisplayed()) {
//			System.out.println(" Reviewer action Remarks " + NonsignatoryRemarks);
//		} else {
//			System.out.println(" Reviewer action not showing ");
//		}
	//} catch (Exception e) {
//		System.out.println("not able to validate");
//		System.out.println("Exception : " + e);
	//}
	//try {
//		WebElement ApproverAction = driver.findElement(By.xpath(
//				"(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[3]/td[text()='Approved']"));
//		if (ApproverAction.isDisplayed()) {
//			System.out.println(" Approver action Approved ");
//		} else {
//			System.out.println(" Approver action not showing ");
//		}
	//} catch (Exception e) {
//		System.out.println("not able to validate");
//		System.out.println("Exception : " + e);
	//}
	//try {
//		WebElement NonsignatoryAction = driver.findElement(By.xpath(
//				"(//thead[@class='t-grid-header'])[5]/following-sibling::tbody/tr[3]/td[text()='"
//						+ NonsignatoryRemarks + "']"));
//		if (NonsignatoryAction.isDisplayed()) {
//			System.out.println("Approver Remarks " + NonsignatoryRemarks);
//		} else {
//			System.out.println(" Approver action not showing ");
//		}
	//} catch (Exception e) {
//		System.out.println("not able to validate");
//		System.out.println("Exception : " + e);
	//}
	//try {
//		WebElement Analyti = driver.findElement(By.xpath("//div[text()='An']"));
//		AS.doubleClick(Analyti).perform();
//		Thread.sleep(3000);
//		System.out.println("doc info page close");
	//} catch (Exception e) {
//		System.out.println("not able to validate");
//		System.out.println("Exception : " + e);
	//}

	
	

