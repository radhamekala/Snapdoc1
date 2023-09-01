package SnapDoc.snap;

import java.awt.AWTException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class Resubmission extends TestBase {
	private HashMap<Object, Object> excelinputDdata;
	public static String Date;
	public static String NonSignataryAcceptedON;
	public static String NonSignatoryRemarks;
	public static String DisplayNumbers;
	public static String EffectiveDate;

	public void Documentinitiate() throws InterruptedException, AWTException, IOException {
		excelinputDdata = new HashMap<>();
		FileInputStream file = new FileInputStream("C:\\Users\\SSD\\Documents\\Type creation.xlsx");
		XSSFWorkbook Workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = Workbook.getSheet("Sheet7");
		int rowcount = sheet.getLastRowNum();
		for (int j = 1; j <= rowcount; j++) {
			XSSFRow row = sheet.getRow(j);
			String Type = row.getCell(0).getStringCellValue();
			String Title = row.getCell(1).getStringCellValue();
			String Associateddocno=row.getCell(2).getStringCellValue();
			String DocNumber = row.getCell(3).getStringCellValue();
			String DocOrgID = row.getCell(4).getStringCellValue();
			String displayNumber = row.getCell(5).getStringCellValue();
			String DocDiscription = row.getCell(6).getStringCellValue();
			String Version = row.getCell(7).getStringCellValue();
			String AssociatedDocTypeName = row.getCell(8).getStringCellValue();
			String AssociatedDocmentTitle = row.getCell(9).getStringCellValue();
			String AssociatedDocumentNumber = row.getCell(10).getStringCellValue();
			String AssociatedDocumentOrgID = row.getCell(11).getStringCellValue();
			String AssociateddocVesion = row.getCell(12).getStringCellValue();
			String AssociatedDiscription = row.getCell(13).getStringCellValue();
			String Changecontrolnumber = row.getCell(14).getStringCellValue();
			String ChangeDiscription = row.getCell(15).getStringCellValue();
			String NonSignatory = row.getCell(16).getStringCellValue();
			String NonSignatoryNAME = row.getCell(17).getStringCellValue();
			String Reviewer1 = row.getCell(18).getStringCellValue();
			String Reviewer1username = row.getCell(19).getStringCellValue();
			String Reviewer2 = row.getCell(20).getStringCellValue();
			String Reviewer2username = row.getCell(21).getStringCellValue();
			String Password = row.getCell(22).getStringCellValue();
			String Material = row.getCell(23).getStringCellValue();
			String Asset = row.getCell(24).getStringCellValue();
			String User = row.getCell(25).getStringCellValue();
			String Products = row.getCell(26).getStringCellValue();
			String initiatedBy = row.getCell(27).getStringCellValue();
			String ApprovalType = row.getCell(28).getStringCellValue();
			String Category = row.getCell(29).getStringCellValue();
			String Subcategory = row.getCell(30).getStringCellValue();
			String NonsignatoryRemarks = row.getCell(31).getStringCellValue();
			String Decision1 = row.getCell(32).getStringCellValue();
			String Decision2 = row.getCell(33).getStringCellValue();
			String Decision3 = row.getCell(34).getStringCellValue();
			String initiatorusername = row.getCell(35).getStringCellValue();
			String asset = row.getCell(36).getStringCellValue();
			String Productss = row.getCell(37).getStringCellValue();
			String TrainingID = row.getCell(38).getStringCellValue();
			String TrainingDiscription = row.getCell(39).getStringCellValue();
			String EffectiveDecision1 = row.getCell(40).getStringCellValue();
			String IssuedocDecision = row.getCell(41).getStringCellValue();
			String ControlprintDecision = row.getCell(42).getStringCellValue();
			Thread.sleep(3000);	
			CM.clickonElementbyXpath(EL.eleInitiate_XP, "Initiate");
			Thread.sleep(1000);
			CM.selectValueinDropdownByVisualtextbyXpath(EL.eleAddtype_XP, Type, "Addtype");
			CM.enteringDataintoTextfiledByXpath(EL.eletxtTitle_XP, Title, "txtTitle_1");
			Thread.sleep(500);
			WebElement DOCNUM = driver.findElement(By.xpath("//input[@id='txtIsNumberingAutoOrManual_1']"));
			if (DOCNUM.isEnabled()) {
				CM.enteringDataintoTextfiledByXpath(EL.eleDocNumber_XP, DocNumber, "Document number");
				Thread.sleep(2000);
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
//						if (driver.findElement(By.xpath("//div[text()='Material']")).isEnabled()) {
//							CM.selectValueinDropdownByVisualtextbyXpath(EL.eleselectmaterial_XP, Material, "Material");
//						} else {
//							System.out.println("material disabled");
//						}
//						if (driver.findElement(By.xpath("//div[text()='Asset']")).isEnabled()) {
//							CM.selectValueinDropdownByVisualtextbyXpath(EL.eleAsset_XP, Asset, "Asset");
//						} else {
//							System.out.println("material disabled");
//						}
//						if (driver.findElement(By.xpath("//div[text()='User']")).isDisplayed()) {
//							CM.selectValueinDropdownByVisualtextbyXpath(EL.eleusers_XP, User, "User");
//						} else {
//							System.out.println("User disabled");
//						}
//						if (driver.findElement(By.xpath("//div[text()='Product']")).isEnabled()) {
//							CM.selectValueinDropdownByVisualtextbyXpath(EL.eleproduct_XP, Products, "Product");
//							Thread.sleep(4000);
//						} else {
//							System.out.println("Product disabled");
//						}
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
						try {
							WebElement location = driver.findElement(By.xpath("//div[text()='Location']"));
							if (location.isDisplayed()) {
								location.click();
								Thread.sleep(1500);
								WebElement ele = driver.findElement(By.xpath("//div[text()='Unit-I']"));
								AS.doubleClick(ele).perform();
								CM.clickonElementbyXpath(EL.eleSaVe_XP, "Save");
								Thread.sleep(500);
							} else {
								System.out.println("location not mandatory");
							}
							
						} catch (Exception e) {
							System.out.println("associations not selected");
						}
						
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
				WebElement Associateddocnos=driver.findElement(By.xpath("(//td[@class='CL documentNumber wid15pc'])[1]/a[text()=' "+Associateddocno+" ']"));
			
			if(Associateddocnos.isDisplayed()) {
				System.out.println("Associated document number is displayed");
			}else {
				System.out.println("Associated document number is not displayed");
			}
			
			} catch (Exception e) {
				System.out.println("not able to validate");
				System.out.println("Exception : " + e);
			}
			try {
				WebElement Primarydocnos=driver.findElement(By.xpath("(//td[@class='CL documentNumber wid15pc'])[1]/a[text()=' "+Associateddocno+" ']"));
			
			if(Primarydocnos.isDisplayed()) {
				System.out.println("Primary doc no document number is displayed");
			}else {
				System.out.println("Primary doc no document number is not displayed");
			}
			} catch (Exception e) {
				System.out.println("not able to validate");
				System.out.println("Exception : " + e);
			}
			
			CM.clickonElementbyXpath(EL.eleUsersetting_XP, "USER SETTINGS");
			Thread.sleep(5000);
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
				WebElement number2 = driver.findElement(By.xpath(" (//span[text()=' " + displayNumber + " '])[1]"));
				number2.click();
				Thread.sleep(2000);
				System.out.println("numbar is displayed");
			} catch (Exception e) {
				System.out.println("numbar is not displayed");
				System.out.println("Exception:" + e);
			}
			Thread.sleep(2000);
			CM.enteringDataintoTextfiledByXpath(EL.eleRemarksinput_XP, NonsignatoryRemarks, " Reviewer1remarks");
			Thread.sleep(1000);
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
						WebElement number2 = driver.findElement(By.xpath(" //span[text()=' " + displayNumber + " ']"));
						number2.click();
						System.out.println("numbar is displayed");
					} catch (Exception e) {
						System.out.println("numbar is not displayed");
						System.out.println("Exception:" + e);
					}
					Thread.sleep(2000);
					CM.enteringDataintoTextfiledByXpath(EL.eleRemarksinput_XP, NonsignatoryRemarks,
							" Reviewer1remarks");
					Thread.sleep(1000);
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
								WebElement number2 = driver
										.findElement(By.xpath(" //span[text()=' " + displayNumber + " ']"));
								number2.click();
								System.out.println("numbar is displayed");
							} catch (Exception e) {
								System.out.println("numbar is not displayed");
								System.out.println("Exception:" + e);
							}
							Thread.sleep(2000);
					
							CM.enteringDataintoTextfiledByXpath(EL.eleRemarksinput_XP, NonsignatoryRemarks,
									" Reviewer1remarks");
							Thread.sleep(1000);
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
												CM.clickonElementbyXpath(EL.eleTodaydate_XP, "Today date effective");

//												try {
//													WebElement EffectiveDates = driver.findElement(
//															By.xpath("//a[@class='ui-state-default ui-state-highlight ui-state-active']"));
//													Thread.sleep(3000);
//													EffectiveDate = EffectiveDates.getText();
//													System.out.println(EffectiveDates);
//												} catch (Exception e) {
//													System.out.println("Exeption e");
//												}
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
													Thread.sleep(500);
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
															.findElement(By.xpath("(//span[text()=' " + displayNumber
																	+ " ']/parent::td/parent::tr/td[text()='Effective'])[1]"));
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
															By.xpath(" (//span[text()=' " + displayNumber + " '])[1]"));
													number2.click();
													System.out.println("numbar is displayed");
												} catch (Exception e) {
													System.out.println("numbar is not displayed");
													System.out.println("Exception:" + e);
												}
												Thread.sleep(2000);
												CM.enteringDataintoTextfiledByXpath(EL.eleRemarksinput_XP,
														NonsignatoryRemarks, " Reviewer1remarks");
												Thread.sleep(1000);
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
													try {
														WebElement toggle1 = driver.findElement(By.xpath("//a[text()=' " + displayNumber
																+ " ']/parent::td/following-sibling::td/div[@class='inficon dotIcon']"));
														toggle1.click();
														Thread.sleep(600);
													} catch (Exception e) {
														System.out.println("not able to validate");
														System.out.println("Exception : " + e);
													}
													try {
													WebElement Issuedoc = driver.findElement(By.xpath("//a[text()=' " + displayNumber
															+ " ']/parent::td/following-sibling::td/div[2]//a[text()='Issue Document']"));
														if (Issuedoc.isDisplayed()) {
															System.out.println("Issue Document displayed");
														Issuedoc.click();
														CM.CheckElementDisplayedbyXpath(EL.eleDocissu_XP, "'Document Issue");
														CM.CheckElementDisplayedbyXpath(EL.elePrintsheader_XP, "Prints");
														CM.CheckElementDisplayedbyXpath(EL.eleTitleNumber_XP, "Title & Number");
														CM.CheckElementDisplayedbyXpath(EL.eleASSociations_XP, "Associations");
														CM.CheckElementDisplayedbyXpath(EL.elePrintss_XP, "Print");
														CM.CheckElementDisplayedbyXpath(EL.eleRecalltime_XP, "Recall Time");
														CM.CheckElementDisplayedbyXpath(EL.eleStatuss_XP, "Status");
														CM.CheckElementDisplayedbyXpath(EL.eleIssueclose_XP, "Close");
														CM.CheckElementDisplayedbyXpath(EL.eleReconciliationarchival_XP, "RECONCILIATION & ARCHIVAL");
														CM.CheckElementDisplayedbyXpath(EL.eleprints_XP, "Prints :");
														CM.CheckElementDisplayedbyXpath(EL.elepages_XP, "Pages:");
														CM.CheckElementDisplayedbyXpath(EL.eleprintsnumber_XP, "Prints : 0");
														CM.CheckElementDisplayedbyXpath(EL.elepagesnumber_XP, "Pages:0");
														CM.CheckElementDisplayedbyXpath(EL.eledatepickers_XP, "date-picker");
														CM.CheckElementDisplayedbyXpath(EL.elereviewewperiods_XP, "Review period");
														CM.CheckElementDisplayedbyXpath(EL.eleDelete_XP, "delete option");
														CM.CheckElementDisplayedbyXpath(EL.elecollapse_XP, "collapse option");
														CM.clickonElementbyXpath(EL.elecollapse_XP, "collapse option");
														CM.CheckElementDisplayedbyXpath(EL.elePrintNO_XP, "Print No.");
														CM.CheckElementDisplayedbyXpath(EL.elePrintID_XP, "Print Id");
														CM.CheckElementDisplayedbyXpath(EL.eleCopies_XP, "Copies");
														CM.CheckElementDisplayedbyXpath(EL.eleRange_XP, "Range");
														CM.CheckElementDisplayedbyXpath(EL.elePages_XP, "Pages");
														CM.CheckElementDisplayedbyXpath(EL.eleReasonforprint_XP, "Reason for Print");
														CM.CheckElementDisplayedbyXpath(EL.eleSubmitted_XP, "Submitted");
														CM.CheckElementDisplayedbyXpath(EL.eleApproved_XP, "Approved");
														CM.CheckElementDisplayedbyXpath(EL.elePrintedBy_XP, "Printed By");
														CM.CheckElementDisplayedbyXpath(EL.eleViewdocument_XP, "View Document");
														CM.CheckElementDisplayedbyXpath(EL.eleSubMIT_XP, "Submit");
														try {
															WebElement title = driver.findElement(By.xpath("//input[@value='" + Title + "']"));
															if (title.isDisplayed()) {
																System.out.println("title unabled");
															} else {
																System.out.println("Title is not displayed");
															}
														} catch (Exception e) {
															System.out.println("not able to validate");
															System.out.println("Exception : " + e);
														}
														try {
															WebElement number = driver.findElement(By.xpath("//input[@value='" + DocNumber + "']"));
															if (number.isDisplayed()) {
																System.out.println("number unabled");
															} else {
																System.out.println("number is not displayed");
															}
														} catch (Exception e) {
															System.out.println("not able to validate");
															System.out.println("Exception : " + e);
														}
														CM.clickonElementbyXpath(EL.eleSubMIT_XP, "Submit");
														CM.CheckElementDisplayedbyXpath(EL.elePRINTDOCheader_XP, "Print Document Header main");
														CM.CheckElementDisplayedbyXpath(EL.eleprintdocheader_XP, "Print Document header");
														CM.CheckElementDisplayedbyXpath(EL.eleDocNAME_XP, "Document Name");
														CM.CheckElementDisplayedbyXpath(EL.eleTotalpages_XP, "Total Pages");
														CM.CheckElementDisplayedbyXpath(EL.elePrintno_XP, "Print No.");
														CM.CheckElementDisplayedbyXpath(EL.eleCopiess_XP, "Copies");
														CM.CheckElementDisplayedbyXpath(EL.eleRanges_XP, "Range");
														CM.CheckElementDisplayedbyXpath(EL.elePagess_XP, "Pages");
														CM.CheckElementDisplayedbyXpath(EL.eleSTatus_XP, "Status");
														CM.CheckElementDisplayedbyXpath(EL.elereadytoprint_XP, "Ready To Submit");
														CM.CheckElementDisplayedbyXpath(EL.elechkHeadAll_XP, "chkHeadAll");
														CM.CheckElementDisplayedbyXpath(EL.elechkChild_XP, "chkChild");
														CM.CheckElementDisplayedbyXpath(EL.eleIssueclose_XP, "Close");
														CM.CheckElementDisplayedbyXpath(EL.eleSubMIT_XP, "Submit");
														CM.clickonElementbyXpath(EL.elechkChild_XP, "chkChild");
														CM.CheckElementDisplayedbyXpath(EL.eleSaVes_XP, "Save");
														CM.CheckElementDisplayedbyXpath(EL.eleClOse_XP, "btnDocCloseTemplate");
														try {
															WebElement title = driver.findElement(By.xpath("//label[text()='" + Title + "']"));
															if (title.isDisplayed()) {
																System.out.println("title unabled");
															} else {
																System.out.println("Title is not displayed");
															}
														} catch (Exception e) {
															System.out.println("not able to validate");
															System.out.println("Exception : " + e);
														}
														CM.CheckElementDisplayedbyXpath(EL.elePrintNumber_XP, "1");
														CM.CheckElementDisplayedbyXpath(EL.elePrintCopies_XP, "1");
														try {
															String Totalpages = driver
																	.findElement(
																			By.xpath("(//thead[@class='t-grid-header'])[7]/following-sibling::tbody/tr/td[7]"))
																	.getText();
															String Range = driver
																	.findElement(By.xpath(
																			"(//thead[@class='t-grid-header'])[7]/following-sibling::tbody/tr/td[10]/input[2]"))
																	.getText();
															String Pages = driver
																	.findElement(
																			By.xpath("(//thead[@class='t-grid-header'])[7]/following-sibling::tbody/tr/td[11]"))
																	.getText();				
															if (Totalpages.equals(Range)) {
																System.out.println("Total pages and Range equal");
															} else {
																System.out.println("Total page and range not equal");
															}
														} catch (Exception e) {
															System.out.println("not able to validate");
															System.out.println("Exception : " + e);
														}
														try {
															String Range = driver
																	.findElement(By.xpath(
																			"(//thead[@class='t-grid-header'])[7]/following-sibling::tbody/tr/td[10]/input[2]"))
																	.getText();
															String Pages = driver
																	.findElement(
																			By.xpath("(//thead[@class='t-grid-header'])[7]/following-sibling::tbody/tr/td[11]"))
																	.getText();
															if (Range.equals(Pages)) {
																System.out.println("Range and Pages equal");
															} else {
																System.out.println("Range and pages not equal");
															}
														} catch (Exception e) {
															System.out.println("not able to validate");
															System.out.println("Exception : " + e);
														}
														CM.clickonElementbyXpath(EL.eleIssuesubmit_XP, "Submit");
														CM.CheckElementDisplayedbyXpath(EL.eleEfffeciveApproves_XP, "Approvers");
														CM.CheckElementDisplayedbyXpath(EL.eleEfffectivelevel_XP, "Level");
														CM.CheckElementDisplayedbyXpath(EL.eleEffeciveleveluserordesig_XP, "User / Designation");
														CM.CheckElementDisplayedbyXpath(EL.eleEffectivelevelapproval_XP, "1");
														CM.selectValueinDropdownByVisualtextbyXpath(EL.eleNonsignatory1_XP, NonSignatory,
																"Non signatory Reviewer");
														CM.clickonElementbyXpath(EL.eleSubmitApprovaldata_XP, "Submit Approval data");
														CM.CheckElementDisplayedbyXpath(EL.eleActionHEA_XP, "Justification for Action");
														CM.CheckElementDisplayedbyXpath(EL.elePrefilled_XP, "Prefilled Reason");
														CM.CheckElementDisplayedbyXpath(EL.eleCustom_XP, "Custom Reason");
														CM.CheckElementDisplayedbyXpath(EL.eleclose_XP, "CLOSE");
														Thread.sleep(500);
														CM.selectValueinDropdownselectbyvalueXpath(EL.eleREason_XP, "3", "Prefilled Reason");
														CM.clickonElementbyXpath(EL.eleSave_XP, "Save");
														Thread.sleep(1500);
														driver.switchTo().alert().accept();
														Thread.sleep(2000);
														String PageNO = driver
																.findElement(By.xpath("//div[@class='CollapeDet expanded']//td[@style='text-align: left;'][1]"))
																.getText();
														System.out.println(PageNO);
														String PrintID = driver
																.findElement(By.xpath("//div[@class='CollapeDet expanded']//td[@style='text-align: left;'][2]"))
																.getText();
														System.out.println(PrintID);
														String Copies = driver
																.findElement(By.xpath("//div[@class='CollapeDet expanded']//td[@style='text-align: left;'][3]"))
																.getText();
														System.out.println(Copies);
														String Range = driver
																.findElement(By.xpath("//div[@class='CollapeDet expanded']//td[@style='text-align: left;'][4]"))
																.getText();
														System.out.println(Range);
														String Pages = driver
																.findElement(By.xpath("//div[@class='CollapeDet expanded']//td[@style='text-align: left;'][5]"))
																.getText();
														System.out.println(Pages);
														String Submitted = driver
																.findElement(By.xpath("//div[@class='CollapeDet expanded']//td[@style='text-align: left;'][7]"))
																.getText();
														System.out.println(Submitted);
														CM.clickonElementbyXpath(EL.eleClOse_XP, "close");
														CM.clickonElementbyXpath(EL.eleIssed_XP, "Issued");
														String issuedNumber = driver.findElement(By.xpath("(//span[@class='DocNo'])[1]")).getText();
														String IssueDateandTime = driver
																.findElement(By.xpath("(//span[@class='DocNo'])[1]/parent::td/following-sibling::td[2]"))
																.getText();
														CM.clickonElementbyXpath(EL.eleDocnum1_XP, "Frist doc no");
														CM.CheckElementDisplayedbyXpath(EL.eleDocissu_XP, "'Document Issue");
														CM.CheckElementDisplayedbyXpath(EL.elePrintsheader_XP, "Prints");
														CM.CheckElementDisplayedbyXpath(EL.eleTitleNumber_XP, "Title & Number");
														CM.CheckElementDisplayedbyXpath(EL.eleASSociations_XP, "Associations");
														CM.CheckElementDisplayedbyXpath(EL.elePrintss_XP, "Print");
														CM.CheckElementDisplayedbyXpath(EL.eleRecalltime_XP, "Recall Time");
														CM.CheckElementDisplayedbyXpath(EL.eleStatuss_XP, "Status");
														CM.CheckElementDisplayedbyXpath(EL.eleIssueclose_XP, "Close");
														CM.CheckElementDisplayedbyXpath(EL.eleReconciliationarchival_XP, "RECONCILIATION & ARCHIVAL");
														CM.CheckElementDisplayedbyXpath(EL.eleprints_XP, "Prints :");
														CM.CheckElementDisplayedbyXpath(EL.elepages_XP, "Pages:");
														CM.CheckElementDisplayedbyXpath(EL.eleprintsnumber_XP, "Prints : 0");
														CM.CheckElementDisplayedbyXpath(EL.elepagesnumber_XP, "Pages:0");
														CM.CheckElementDisplayedbyXpath(EL.eledatepickers_XP, "date-picker");
														CM.CheckElementDisplayedbyXpath(EL.elereviewewperiods_XP, "Review period");
//													CM.CheckElementDisplayedbyXpath(EL.eleDelete_XP, "delete option");
														CM.CheckElementDisplayedbyXpath(EL.elecollapse_XP, "collapse option");
														CM.clickonElementbyXpath(EL.elecollapse_XP, "collapse option");
														CM.CheckElementDisplayedbyXpath(EL.elePrintNO_XP, "Print No.");
														CM.CheckElementDisplayedbyXpath(EL.elePrintID_XP, "Print Id");
														CM.CheckElementDisplayedbyXpath(EL.eleCopies_XP, "Copies");
														CM.CheckElementDisplayedbyXpath(EL.eleRange_XP, "Range");
														CM.CheckElementDisplayedbyXpath(EL.elePages_XP, "Pages");
														CM.CheckElementDisplayedbyXpath(EL.eleReasonforprint_XP, "Reason for Print");
														CM.CheckElementDisplayedbyXpath(EL.eleSubmitted_XP, "Submitted");
														CM.CheckElementDisplayedbyXpath(EL.eleApproved_XP, "Approved");
														CM.CheckElementDisplayedbyXpath(EL.elePrintedBy_XP, "Printed By");
														try {
															WebElement title = driver.findElement(By.xpath("//input[@value='" + Title + "']"));
															if (title.isDisplayed()) {
																System.out.println("title unabled");
															} else {
																System.out.println("Title is not displayed");
															}
														} catch (Exception e) {
															System.out.println("not able to validate");
															System.out.println("Exception : " + e);
														}
														try {
															WebElement number = driver.findElement(By.xpath("//input[@value='" + DocNumber + "']"));
															if (number.isDisplayed()) {
																System.out.println("number unabled");
															} else {
																System.out.println("number is not displayed");
															}
														} catch (Exception e) {
															System.out.println("not able to validate");
															System.out.println("Exception : " + e);
														}
														String PageNO2 = driver
																.findElement(By.xpath("//div[@class='CollapeDet expanded']//td[@style='text-align: left;'][1]"))
																.getText();
														System.out.println(PageNO2);
														try {
															if (PageNO.equals(PageNO2)) {
																System.out.println("issue doc Page number equal");
															} else {
																System.out.println("issue doc Page number not equal");
															}
														} catch (Exception e) {
															System.out.println("not able to validate");
															System.out.println("Exception : " + e);
														}
														String PrintID2 = driver
																.findElement(By.xpath("//div[@class='CollapeDet expanded']//td[@style='text-align: left;'][2]"))
																.getText();
														System.out.println(PrintID2);
														try {
															if (PrintID.equals(PrintID2)) {
																System.out.println("issue doc PrintID equal");
															} else {
																System.out.println("issue doc PrintID not equal");
															}
														} catch (Exception e) {
															System.out.println("not able to validate");
															System.out.println("Exception : " + e);
														}
														String Copies2 = driver
																.findElement(By.xpath("//div[@class='CollapeDet expanded']//td[@style='text-align: left;'][3]"))
																.getText();
														System.out.println(Copies2);
														try {
															if (Copies.equals(Copies2)) {
																System.out.println("issue doc Copies equal");
															} else {
																System.out.println("issue doc Copies not equal");
															}
														} catch (Exception e) {
															System.out.println("not able to validate");
															System.out.println("Exception : " + e);
														}
														String Range2 = driver
																.findElement(By.xpath("//div[@class='CollapeDet expanded']//td[@style='text-align: left;'][4]"))
																.getText();
														System.out.println(Range2);
														try {
															if (Range.equals(Range2)) {
																System.out.println("issue doc Range equal");
															} else {
																System.out.println("issue doc Range not equal");
															}
														} catch (Exception e) {
															System.out.println("not able to validate");
															System.out.println("Exception : " + e);
														}
														String Pages2 = driver
																.findElement(By.xpath("//div[@class='CollapeDet expanded']//td[@style='text-align: left;'][5]"))
																.getText();
														System.out.println(Pages2);
														try {
															if (Pages.equals(Pages2)) {
																System.out.println("issue doc Pages equal");
															} else {
																System.out.println("issue doc Pages not equal");
															}
														} catch (Exception e) {
															System.out.println("not able to validate");
															System.out.println("Exception : " + e);
														}
														String Submitted2 = driver
																.findElement(By.xpath("//div[@class='CollapeDet expanded']//td[@style='text-align: left;'][7]"))
																.getText();
														System.out.println(Submitted2);
														try {
															if (Submitted.equals(Submitted2)) {
																System.out.println("issue doc Submitted equal");
															} else {
																System.out.println("issue doc Submitted not equal");
															}
														} catch (Exception e) {
															System.out.println("not able to validate");
															System.out.println("Exception : " + e);
														}
														CM.clickonElementbyXpath(EL.eleEffectiveclose_XP, "close");
														String text = driver.findElement(By.xpath("(//td[@class='CL documentNumber wid50pc'])[1]")).getText();
														int openingParenthesis = text.indexOf("(");
														int closingParenthesis = text.indexOf(")");
														String part1 = text.substring(0, openingParenthesis).trim();
														String part2 = text.substring(openingParenthesis + 1, closingParenthesis).trim();
														String[] part2Parts = part2.split(",");
														String part2_1 = part2Parts[0].trim();
														String part2_2 = part2Parts[1].trim();
														System.out.println("Part 1: " + part1);
														System.out.println("Part 2 (1st subpart): " + part2_1);
														System.out.println("Part 2 (2nd subpart): " + part2_2);
														if (part1.equals(Title)) {
															System.out.println(part1 + "is displayed");
														} else {
															System.out.println(part1 + "is not displayed");
														}
														if (part2_1.equals(DocNumber)) {
															System.out.println(part2_1 + "is displayed");
														} else {
															System.out.println(part2_1 + "is not displayed");
														}
														String ver = "Ver 0";
														if (part2_2.equals(ver)) {
															System.out.println(part2_2 + "is displayed");
														} else {
															System.out.println(part2_2 + "is not displayed");
														}
														String issuedocdateandtime = driver
																.findElement(By.xpath("(//td[@class='CL documentNumber wid50pc'])[1]/following-sibling::td[1]"))
																.getText();
														try {
															WebElement status = driver.findElement(By.xpath(
																	"(//td[@class='CL documentNumber wid50pc'])[1]/following-sibling::td[text()='Under Approval']"));
															if (status.isDisplayed()) {
																System.out.println("Issue document before approval status Under Approval");
															} else {
																System.out.println("Issue document before approval status wrong");
															}
														} catch (Exception e) {
															System.out.println("not able to validate");
															System.out.println("Exception : " + e);
														}
														try {
															WebElement Option1 = driver.findElement(By.xpath(
																	"(//td[@class='CL documentNumber wid50pc'])[1]/following-sibling::td[5]/div[2]/div/div/div[2]/a[text()='View']"));
															if (Option1.isDisplayed()) {
																System.out.println("Issue document approval status Under Approval Options 1 = View ");
															} else {
																System.out.println(
																		"Issue document approval status Under Approval Options 1 = View is not displayed ");
															}
														} catch (Exception e) {
															System.out.println("not able to validate");
															System.out.println("Exception : " + e);
														}
														try {
															WebElement Option2 = driver.findElement(By.xpath(
																	"(//td[@class='CL documentNumber wid50pc'])[1]/following-sibling::td[5]/div[2]/div/div[2]//a[text()='History']"));
															if (Option2.isDisplayed()) {
																System.out.println("Issue document approval status Under Approval Options 2 = History ");
															} else {
																System.out.println(
																		"Issue document approval status Under Approval Options 2 = History is not displayed ");
															}
														} catch (Exception e) {
															System.out.println("not able to validate");
															System.out.println("Exception : " + e);
														}
														try {
															WebElement Option3 = driver.findElement(By.xpath(
																	"(//td[@class='CL documentNumber wid50pc'])[1]/following-sibling::td[5]/div[2]/div/div[3]//a[text()='Manage']"));
															if (Option3.isDisplayed()) {
																System.out.println("Issue document approval status Under Approval Options 3 = Manage ");
															} else {
																System.out.println(
																		"Issue document approval status Under Approval Options 3 = Manage is not displayed ");
															}
														} catch (Exception e) {
															System.out.println("not able to validate");
															System.out.println("Exception : " + e);
														}
														try {
															WebElement Option4 = driver.findElement(By.xpath(
																	"(//td[@class='CL documentNumber wid50pc'])[1]/following-sibling::td[5]/div[2]/div/div[4]//a[text()='Post Edit']"));
															if (Option4.isDisplayed()) {
																System.out.println("Issue document approval status Under Approval Options 3 = Post Edit ");
															} else {
																System.out.println(
																		"Issue document approval status Under Approval Options 3 = Post Edit is not displayed ");
															}
														} catch (Exception e) {
															System.out.println("not able to validate");
															System.out.println("Exception : " + e);
														}
														CM.clickonElementbyXpath(EL.eleUsersetting_XP, "USER SETTINGS");
														CM.clickonElementbyXpath(EL.eleLogout_XP, "Log out");
														Thread.sleep(1000);
														CM.enteringDataintoTextfiledByXpath(EL.eleUserName_XP, NonSignatoryNAME, " Non signatory user");
														CM.enteringDataintoTextfiledByXpath(EL.elePassword_XP, Password, "Password");
														CM.clickonElementbyXpath(EL.eleLogin_XP, "LOGIN");
														Thread.sleep(2000);
														try {
															WebElement Issuedocnumber = driver.findElement(By.xpath("//span[text()=' " + issuedNumber + " ']"));
															if (Issuedocnumber.isDisplayed()) {
																System.out.println("Issue document number displayed");
															} else {
																System.out.println("Issue doc number not displayed");
															}
														} catch (Exception e) {
															System.out.println("not able to validate");
															System.out.println("Exception : " + e);
														}
														try {
															WebElement Issuedocnumber = driver.findElement(By
																	.xpath("//span[text()=' " + issuedNumber + " ']/parent::td/parent::tr/td[text()='Issue']"));
															if (Issuedocnumber.isDisplayed()) {
																System.out.println(issuedNumber + "type= Issue");
															} else {
																System.out.println(issuedNumber + "type= Issue is not displayed");
															}
														} catch (Exception e) {
															System.out.println("not able to validate");
															System.out.println("Exception : " + e);
														}
														try {
															WebElement Issutime = driver.findElement(
																	By.xpath("//span[text()=' " + issuedNumber + " ']/parent::td/parent::tr/td[16]"));
															if (Issutime.isDisplayed()) {
																System.out.println("Issue document time is displayed");
															} else {
																System.out.println("Issue document time is not displayed");
															}
														} catch (Exception e) {
															System.out.println("not able to validate");
															System.out.println("Exception : " + e);
														}
														String details = driver
																.findElement(By
																		.xpath("//span[text()=' " + issuedNumber + " ']/parent::td/parent::tr/td[19]/div/div"))
																.getText();
														try {
															WebElement Issuedocnumber = driver.findElement(By.xpath("//span[text()=' " + issuedNumber + " ']"));
															Issuedocnumber.click();
															System.out.println("Issuedocnumber clicked Approvals details page opend");
														} catch (Exception e) {
															System.out.println("not able to validate");
															System.out.println("Exception : " + e);
														}
														CM.CheckElementDisplayedbyXpath(EL.elemainheaderapprovaldetail_XP, "Approval Details");
														CM.CheckElementDisplayedbyXpath(EL.eleheaderapprovaltype_XP, "Approval Type");
														CM.CheckElementDisplayedbyXpath(EL.eleissuesetnumber_XP, "Issue Set Number");
														CM.CheckElementDisplayedbyXpath(EL.eleheaderdocnum_XP, "Doc Number");
														try {
															WebElement displayissuem = driver
																	.findElement(By.xpath("//td[contains(text(),'" + issuedNumber + "')]"));
															if (displayissuem.isDisplayed()) {
																System.out.println("issue doc number" + issuedNumber);
															} else {
																System.out.println("issue doc number not equal");
															}
														} catch (Exception e) {
															System.out.println("not able to validate");
															System.out.println("Exception : " + e);
														}
														CM.CheckElementDisplayedbyXpath(EL.eleheaderrange_XP, "Range");
														try {
															WebElement DOCNUBER = driver.findElement(By.xpath("//td[normalize-space()='" + DocNumber + "']"));
															if (DOCNUBER.isDisplayed()) {
																System.out.println("doc number equal");
															} else {
																System.out.println("doc nmber not equal");
															}
														} catch (Exception e) {
															System.out.println("not able to validate");
															System.out.println("Exception : " + e);
														}
														try {
															WebElement range = driver.findElement(By.xpath("//td[contains(text(),'" + Range + "')]"));
															if (range.isDisplayed()) {
																System.out.println("doc range equal");
															} else {
																System.out.println("doc range not equal");
															}
														} catch (Exception e) {
															System.out.println("not able to validate");
															System.out.println("Exception : " + e);
														}
														CM.CheckElementDisplayedbyXpath(EL.eleheadernumberofcopies_XP, "Number of Copies");
														try {
															WebElement Numberofcopies = driver.findElement(
																	By.xpath("//td[@class='tableData bold tdFieldValue'][normalize-space()='" + Copies + "']"));
															if (Numberofcopies.isDisplayed()) {
																System.out.println("Numberofcopies equal");
															} else {
																System.out.println("Numberofcopies equal");
															}
														} catch (Exception e) {
															System.out.println("not able to validate");
															System.out.println("Exception : " + e);
														}
														CM.CheckElementDisplayedbyXpath(EL.eleheadersubmittedby_XP, "Submitted by");
														try {
															WebElement Submittedby = driver.findElement(By.xpath(
																	"//td[@class='tableData bold tdFieldValue'][normalize-space()='" + initiatedBy + "']"));
															if (Submittedby.isDisplayed()) {
																System.out.println("initiatedBy" + initiatedBy);
															} else {
																System.out.println("initiatedBy " + initiatedBy);
															}
														} catch (Exception e) {
															System.out.println("not able to validate");
															System.out.println("Exception : " + e);
														}
														CM.CheckElementDisplayedbyXpath(EL.eleReMarkss_XP, "Remarks");
														CM.CheckElementDisplayedbyXpath(EL.eleHeaderPrint_XP, "Prints");
														CM.CheckElementDisplayedbyXpath(EL.eleheadertitlenumber_XP, "Title & Number");
														CM.CheckElementDisplayedbyXpath(EL.eleheaderAssoci_XP, "Associations");
														CM.CheckElementDisplayedbyXpath(EL.eleheaderprint_XP, "Print");
														CM.CheckElementDisplayedbyXpath(EL.eleHeaderrecall_XP, "Recall Time");
														CM.CheckElementDisplayedbyXpath(EL.eleHeaderstatus_XP, "Status");
														CM.CheckElementDisplayedbyXpath(EL.eleVER_XP, "ver 0.00");
														CM.CheckElementDisplayedbyXpath(EL.elePRINT_XP, "Prints:");
														CM.CheckElementDisplayedbyXpath(EL.elePAGE_XP, "Pages:");
														CM.CheckElementDisplayedbyXpath(EL.elePRINTS_XP, "0");
														CM.CheckElementDisplayedbyXpath(EL.elePAGES_XP, "0");
														CM.CheckElementDisplayedbyXpath(EL.eleYearcla_XP, "years month ");
														CM.CheckElementDisplayedbyXpath(EL.eleReviePeriods_XP, "reviewdays 2");
														CM.CheckElementDisplayedbyXpath(EL.eleReconArchi_XP, "RECONCILIATION & ARCHIVAL");
														CM.clickonElementbyXpath(EL.eleCoLLapse_XP, "Collapescss");
														CM.CheckElementDisplayedbyXpath(EL.elePRINTNO_XP, "Print No.");
														CM.CheckElementDisplayedbyXpath(EL.elePrINTID_XP, "Print Id");
														CM.CheckElementDisplayedbyXpath(EL.eleCopiES_XP, "Copies");
														CM.CheckElementDisplayedbyXpath(EL.eleRaNGE_XP, "Range");
														CM.CheckElementDisplayedbyXpath(EL.elePaGES_XP, "Pages");
														CM.CheckElementDisplayedbyXpath(EL.eleREAsonforprint_XP, "Reason for Print");
														CM.CheckElementDisplayedbyXpath(EL.eleSuBMITTED_XP, "Submitted");
														CM.CheckElementDisplayedbyXpath(EL.eleAppROVED_XP, "Approved");
														CM.CheckElementDisplayedbyXpath(EL.elePrINTEDBY_XP, "Printed By");
														CM.CheckElementDisplayedbyXpath(EL.eleIssuesave_XP, "Save");
														CM.CheckElementDisplayedbyXpath(EL.eleIssueComplete_XP, "btnComplete");
														try {
															WebElement doctitle = driver.findElement(By.xpath(
																	"//table[@id='tblAnciIssue']/tbody/tr[1]/td[5]/div/div/input[@value='" + Title + "']"));
															if (doctitle.isDisplayed()) {
																System.out.println("doc title is displayed");
															} else {
																System.out.println("doc title is not displayed");
															}
														} catch (Exception e) {
															System.out.println("not able to validate");
															System.out.println("Exception : " + e);
														}
														try {
															WebElement docnum = driver.findElement(By.xpath(
																	"//div[@class='CollapeDet expanded']/table/tbody/tr/td[1]/label[text()='" + PageNO + "']"));
															if (docnum.isDisplayed()) {
																System.out.println("Page number is displayed");
															} else {
																System.out.println("Page number  is not displayed");
															}
														} catch (Exception e) {
															System.out.println("not able to validate");
															System.out.println("Exception : " + e);
														}
														try {
															WebElement printID = driver.findElement(
																	By.xpath("//div[@class='CollapeDet expanded']/table/tbody/tr/td[2]/label[text()='" + PrintID
																			+ "']"));
															if (printID.isDisplayed()) {
																System.out.println("printID is displayed");
															} else {
																System.out.println("printID  is not displayed");
															}
														} catch (Exception e) {
															System.out.println("not able to validate");
															System.out.println("Exception : " + e);
														}
														try {
															WebElement Copiess = driver.findElement(By.xpath(
																	"//div[@class='CollapeDet expanded']/table/tbody/tr/td[3]/label[text()='" + Copies + "']"));
															if (Copiess.isDisplayed()) {
																System.out.println("Copiess is displayed");
															} else {
																System.out.println("Copiess  is not displayed");
															}
														} catch (Exception e) {
															System.out.println("not able to validate");
															System.out.println("Exception : " + e);
														}
														try {
															WebElement range = driver.findElement(By.xpath(
																	"//div[@class='CollapeDet expanded']/table/tbody/tr/td[4]/label[text()='" + Range + "']"));
															if (range.isDisplayed()) {
																System.out.println("Copiess is displayed");
															} else {
																System.out.println("Copiess  is not displayed");
															}
														} catch (Exception e) {
															System.out.println("not able to validate");
															System.out.println("Exception : " + e);
														}
														try {
															WebElement pages = driver.findElement(By.xpath(
																	"//div[@class='CollapeDet expanded']/table/tbody/tr/td[5]/label[text()='" + Pages + "']"));
															if (pages.isDisplayed()) {
																System.out.println("pages is displayed");
															} else {
																System.out.println("pages  is not displayed");
															}
														} catch (Exception e) {
															System.out.println("not able to validate");
															System.out.println("Exception : " + e);
														}
														try {
															WebElement Submittedd = driver
																	.findElement(By.xpath("//div[@class='CollapeDet expanded']/table/tbody/tr/td[7]/label"));
															if (Submittedd.equals(Submitted)) {
																System.out.println(" Submitted all details are all equal" + Submitted);
															} else {
																System.out.println(" Submitted all details are all not equal");
															}
														} catch (Exception e) {
															System.out.println("not able to validate");
															System.out.println("Exception : " + e);
														}
														CM.enteringDataintoTextfiledByXpath(EL.eleRemarksinput_XP, NonsignatoryRemarks, " Reviewer1remarks");
														Thread.sleep(1000);
														try {
															wait.until(
																	ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//select[@id='Decision']")));
															Select select2 = new Select(driver.findElement(By.xpath("//select[@id='Decision']")));
															select2.selectByVisibleText(IssuedocDecision);
															System.out.println("Selected " + IssuedocDecision);
														} catch (StaleElementReferenceException e) {
															wait.until(
																	ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//select[@id='Decision']")));
															Select select2 = new Select(driver.findElement(By.xpath("//select[@id='Decision']")));
															select2.selectByVisibleText(IssuedocDecision);
															System.out.println("Selected " + IssuedocDecision);
														}
														if (IssuedocDecision.equals("Approve")) {
															System.out.println("Approved");
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
															CM.enteringDataintoTextfiledByXpath(EL.eleUserName_XP, initiatorusername, " UserName");
															CM.enteringDataintoTextfiledByXpath(EL.elePassword_XP, Password, "Password");
															CM.clickonElementbyXpath(EL.eleLogin_XP, "LOGIN");
															Thread.sleep(5000);
															CM.clickonElementbyXpath(EL.elemenuicon_XP, "Menu icon");
															try {
																driver.findElement(By.xpath("//div[text()='Documents']")).click();
																Thread.sleep(4000);
															} catch (StaleElementReferenceException e) {
																driver.findElement(By.xpath("//div[text()='Documents']")).click();
															}
															try {
																driver.findElement(By.xpath("//div[text()='An']")).click();
															} catch (StaleElementReferenceException e) {
																driver.findElement(By.xpath("//div[text()='An']")).click();
															}
															Thread.sleep(3000);
															CM.clickonElementbyXpath(EL.eleIssed_XP, "Issued");
															Thread.sleep(5000);
															try {
																WebElement Approvalafterissuestatus = driver.findElement(By.xpath("//span[text()=' "
																		+ issuedNumber + " ']/parent::td/following-sibling::td[4][text()='Ready To Print']"));
																if (Approvalafterissuestatus.isDisplayed()) {
																	System.out.println("Issue document approved after status = Ready To Print");
																} else {
																	System.out.println("Issue document approvaed after status not equal ");
																}
															} catch (Exception e) {
																System.out.println("not able to validate");
																System.out.println("Exception : " + e);
															}
															driver.findElement(By.xpath("//a[contains(text(),'Documents')]")).click();
															Thread.sleep(2000);
														} else if (IssuedocDecision.equals("Reject")) {
															System.out.println(" Issue document Reject");
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
															CM.enteringDataintoTextfiledByXpath(EL.eleUserName_XP, initiatorusername, " UserName");
															CM.enteringDataintoTextfiledByXpath(EL.elePassword_XP, Password, "Password");
															CM.clickonElementbyXpath(EL.eleLogin_XP, "LOGIN");
															Thread.sleep(5000);
															CM.clickonElementbyXpath(EL.elemenuicon_XP, "Menu icon");
															try {
																driver.findElement(By.xpath("//div[text()='Documents']")).click();
																Thread.sleep(4000);
															} catch (StaleElementReferenceException e) {
																driver.findElement(By.xpath("//div[text()='Documents']")).click();
															}
															try {
																driver.findElement(By.xpath("//div[text()='An']")).click();
															} catch (StaleElementReferenceException e) {
																driver.findElement(By.xpath("//div[text()='An']")).click();
															}
															Thread.sleep(3000);
															CM.clickonElementbyXpath(EL.eleIssed_XP, "Issued");
															Thread.sleep(5000);
															try {
																WebElement Approvalafterissuestatus = driver.findElement(By.xpath("//span[text()=' "
																		+ issuedNumber + " ']/parent::td/following-sibling::td[4][text()='Added']"));
																if (Approvalafterissuestatus.isDisplayed()) {
																	System.out.println("Issue document Reject after status = Added");
																} else {
																	System.out.println("Issue document Reject after status not equal ");
																}
															} catch (Exception e) {
																System.out.println("not able to validate");
																System.out.println("Exception : " + e);
															}
															driver.findElement(By.xpath("//a[contains(text(),'Documents')]")).click();
															Thread.sleep(3000);
														}
													} else {
														System.out.println("Issue Document not displayed");
													}
												} catch (Exception e) {
													System.out.println("not able to validate");
													System.out.println("Exception : " + e);
												}//CONTROL PRINT start
												try {  
													WebElement toggle1 = driver.findElement(By.xpath("//a[text()=' " + displayNumber
															+ " ']/parent::td/following-sibling::td/div[@class='inficon dotIcon']"));
													toggle1.click();
													Thread.sleep(2000);
												} catch (Exception e) {
													System.out.println("not able to validate");
													System.out.println("Exception : " + e);
												}
												try {
												WebElement Controlprint = driver.findElement(By.xpath("//a[text()=' " + displayNumber
														+ " ']/parent::td/following-sibling::td/div[2]//a[text()='Controlled Print']"));
												Controlprint.click();
												System.out.println("Control print document clicked");
												String Alert = driver.switchTo().alert().getText();
												System.out.println(Alert);
												String Doyoywantassociateddoc = "Do you want to add all Associated Documents related to this document to this print";
												if (Alert.equals(Doyoywantassociateddoc)) {
													driver.switchTo().alert().accept();
												} else {
													System.out.println("alert not same");
												}	
													CM.CheckElementDisplayedbyXpath(EL.eleHeadercontrolprint_XP, "CONTROLLED PRINT HEADER");
													CM.CheckElementDisplayedbyXpath(EL.eleCOntrolprint_XP, "Prints Header");
													CM.CheckElementDisplayedbyXpath(EL.eleControltitleID_XP, "Title & ID");
													CM.CheckElementDisplayedbyXpath(EL.elecontrolprintsummary_XP, "Print Summary");
													CM.CheckElementDisplayedbyXpath(EL.elereconSetting_XP, "Recon. Setting");
													CM.CheckElementDisplayedbyXpath(EL.elecontrolrecon_XP, "Reconciliation");
													CM.CheckElementDisplayedbyXpath(EL.eleReconcilcomment_XP, "Reconcile Comments");
													CM.CheckElementDisplayedbyXpath(EL.elecontrolstatus_XP, "Status");
													CM.CheckElementDisplayedbyXpath(EL.elecontrolAction_XP, "Actions");
													CM.CheckElementDisplayedbyXpath(EL.elecontrolver_XP, "Ver");
													CM.CheckElementDisplayedbyXpath(EL.elecontrolprints_XP, "Prints:");
													CM.CheckElementDisplayedbyXpath(EL.eleConpages_XP, "Pages:");
													CM.CheckElementDisplayedbyXpath(EL.eleDatepicker_XP, "RemoveAllDate");
													CM.CheckElementDisplayedbyXpath(EL.eleDatepickerremove_XP, "Remove img");
													CM.CheckElementDisplayedbyXpath(EL.eledays_XP, "days");
													CM.CheckElementDisplayedbyXpath(EL.elePaages_XP, "Pages:");
													CM.CheckElementDisplayedbyXpath(EL.elereconcilpages_XP, "reconcilpages disabled");
													CM.CheckElementDisplayedbyXpath(EL.elereconcicomplete_XP, "Complete");
													CM.CheckElementDisplayedbyXpath(EL.elecompletedes_XP, "complete Desabled");
													CM.CheckElementDisplayedbyXpath(EL.eletextarea_XP, "textarea disabled");
													CM.CheckElementDisplayedbyXpath(EL.elestatusprints_XP, "Print:");
													CM.CheckElementDisplayedbyXpath(EL.elereadytosubmit_XP, "Ready To Submit");
													CM.CheckElementDisplayedbyXpath(EL.elereconc_XP, "Recon.:");
													CM.CheckElementDisplayedbyXpath(EL.eleviewdoc_XP, "View Document");
													CM.CheckElementDisplayedbyXpath(EL.eledeleteoption_XP, "Delete option ");
													CM.clickonElementbyXpath(EL.eleCollapsexpand_XP, "Collapescss expanded");
													CM.CheckElementDisplayedbyXpath(EL.eleprintno1_XP, "Print No.");
													CM.CheckElementDisplayedbyXpath(EL.eleprintid2_XP, "Print Id");
													CM.CheckElementDisplayedbyXpath(EL.elecopies_XP, "Copies");
													CM.CheckElementDisplayedbyXpath(EL.elerandge_XP, "Range");
													CM.CheckElementDisplayedbyXpath(EL.elepages2_XP, "Pages");
													CM.CheckElementDisplayedbyXpath(EL.elereasonprint_XP, "Reason for Print");
													CM.CheckElementDisplayedbyXpath(EL.elesubmite_XP, "Submitted");
													CM.CheckElementDisplayedbyXpath(EL.eleAppro_XP, "Approved");
													CM.CheckElementDisplayedbyXpath(EL.eleprintby_XP, "Printed By");
													CM.CheckElementDisplayedbyXpath(EL.elecontrolprintpageclose_XP, "Close");
													CM.CheckElementDisplayedbyXpath(EL.elecontrolpagesave_XP, "btnSubmit");
													CM.CheckElementDisplayedbyXpath(EL.eleprinyt_XP, "PRINT");
													CM.CheckElementDisplayedbyXpath(EL.eleFINISH_XP, "FINISH");
													CM.CheckElementDisplayedbyXpath(EL.eleCLOSE_XP, "CLOSE");
													CM.clickonElementbyXpath(EL.elesubmit_XP, "SUBMIT");
													CM.CheckElementDisplayedbyXpath(EL.elesubmitdocumentmainheader_XP, "Submit Documents header");
													CM.CheckElementDisplayedbyXpath(EL.eleheader_XP, "Submit Document");
													CM.CheckElementDisplayedbyXpath(EL.eleAllselectedcheckbox_XP, "Allselectedcheckbox");
													CM.CheckElementDisplayedbyXpath(EL.elesubtitlrid_XP, "Title & ID");
													CM.CheckElementDisplayedbyXpath(EL.eleprintsummary_XP, "Print Summary");
													CM.CheckElementDisplayedbyXpath(EL.elepagescopies_XP, "Pages & Copies");
													CM.CheckElementDisplayedbyXpath(EL.eleresonforprint_XP, "Reason for Print");
													CM.CheckElementDisplayedbyXpath(EL.elestatuus_XP, "Status");
													CM.CheckElementDisplayedbyXpath(EL.eledocumentselectcheckbox_XP, "documentselectcheckbox");
													CM.CheckElementDisplayedbyXpath(EL.eleversion_XP, "Ver");
													CM.CheckElementDisplayedbyXpath(EL.elep1_XP, "Prints:");
													CM.CheckElementDisplayedbyXpath(EL.eleradytop_XP, "Ready To Submit");
													CM.CheckElementDisplayedbyXpath(EL.elecancleoption_XP, "Cancel");
													try {
														WebElement title = driver.findElement(By.xpath("//table[@id='tblSubmitAnciIssue']/tbody/tr/td[6]//input[@value='" + Title + "']"));
														if (title.isDisplayed()) {
															System.out.println("title unabled");
														} else {
															System.out.println("Title is not displayed");
														}
													} catch (Exception e) {
														System.out.println("not able to validate");
														System.out.println("Exception : " + e);
													}
													try {
														WebElement number = driver.findElement(By.xpath("//table[@id='tblSubmitAnciIssue']/tbody/tr/td[6]//input[@value='" + DocNumber + "']"));
														if (number.isDisplayed()) {
															System.out.println("number unabled");
														} else {
															System.out.println("number is not displayed");
														}
													} catch (Exception e) {
														System.out.println("not able to validate");
														System.out.println("Exception : " + e);
													}
													try {
														WebElement ver = driver.findElement(By.xpath("//table[@id='tblSubmitAnciIssue']/tbody/tr/td[6]//input[@value='0.00']"));
														if (ver.isDisplayed()) {
															System.out.println("ver unabled");
														} else {
															System.out.println("ver is not displayed");
														}
													} catch (Exception e) {
														System.out.println("not able to validate");
														System.out.println("Exception : " + e);
													}
													CM.clickonElementbyXpath(EL.eledocumentselectcheckbox_XP, "documentselectcheckbox");
													String reasonprint="Controlprintcopy";
													CM.enteringDataintoTextfiledByXpath(EL.elereason_XP,reasonprint , "Reason for Print");
													CM.clickonElementbyXpath(EL.elesbmit_XP, "Submit");
													CM.CheckElementDisplayedbyXpath(EL.eleWorkflowselectedheader_XP, "WORKFLOW TO BE SELECTED");
													CM.CheckElementDisplayedbyXpath(EL.eleSubmitdocument_XP, "Submit Document HEADER");
													CM.CheckElementDisplayedbyXpath(EL.eletitleheader_XP, "Title & ID");
													CM.CheckElementDisplayedbyXpath(EL.eleworkflow_XP, "Workflow");
													CM.CheckElementDisplayedbyXpath(EL.eleworkflowdocselect_XP, "Work flow document select option");
													CM.CheckElementDisplayedbyXpath(EL.eleworkflowlevel_XP, "1 : workflow");
													try {
														WebElement title = driver.findElement(By.xpath("//table[@id='tblFinalSubmitAnciIssue']/tbody/tr/td[6]//input[@value='" + Title + "']"));
														if (title.isDisplayed()) {
															System.out.println("title unabled");
														} else {
															System.out.println("Title is not displayed");
														}
													} catch (Exception e) {
														System.out.println("not able to validate");
														System.out.println("Exception : " + e);
													}
													try {
														WebElement number = driver.findElement(By.xpath("//table[@id='tblFinalSubmitAnciIssue']/tbody/tr/td[6]//input[@value='" + DocNumber + "']"));
														if (number.isDisplayed()) {
															System.out.println("number unabled");
														} else {
															System.out.println("number is not displayed");
														}
													} catch (Exception e) {
														System.out.println("not able to validate");
														System.out.println("Exception : " + e);
													}
													try {
														WebElement ver = driver.findElement(By.xpath("//table[@id='tblFinalSubmitAnciIssue']/tbody/tr/td[6]//input[@value='0.00']"));
														if (ver.isDisplayed()) {
															System.out.println("ver unabled");
														} else {
															System.out.println("ver is not displayed");
														}
													} catch (Exception e) {
														System.out.println("not able to validate");
														System.out.println("Exception : " + e);
													}
													CM.clickonElementbyXpath(EL.eleworkflowdocselect_XP, "Workflow document select");
													CM.selectValueinDropdownByVisualtextbyXpath(EL.eleControlprintapprover_XP, NonSignatory,
															"Non signatory Reviewer");
													CM.clickonElementbyXpath(EL.eleSElect_XP, "select and submit Approval data");
													CM.CheckElementDisplayedbyXpath(EL.eleActionHEA_XP, "Justification for Action");
													CM.CheckElementDisplayedbyXpath(EL.elePrefilled_XP, "Prefilled Reason");
													CM.CheckElementDisplayedbyXpath(EL.eleCustom_XP, "Custom Reason");
													CM.CheckElementDisplayedbyXpath(EL.eleclose_XP, "CLOSE");
													Thread.sleep(500);
													CM.selectValueinDropdownselectbyvalueXpath(EL.eleREason_XP, "3", "Prefilled Reason");
													CM.clickonElementbyXpath(EL.eleSave_XP, "Save");
													Thread.sleep(2000);
													CM.clickonElementbyXpath(EL.eleCLOSE_XP, "Close");
													Thread.sleep(2000);
													CM.clickonElementbyXpath(EL.eleControlleds_XP, "Controlled");
													String ControlprintNumber = driver.findElement(By.xpath("(//span[@class='DocNo'])[1]")).getText();
													String ControlprintONTIME = driver
															.findElement(By.xpath("(//span[@class='DocNo'])[1]/parent::td/following-sibling::td[2]"))
															.getText();
													CM.clickonElementbyXpath(EL.eleUsersetting_XP, "USER SETTINGS");
													CM.clickonElementbyXpath(EL.eleLogout_XP, "Log out");
													Thread.sleep(1000);
													CM.enteringDataintoTextfiledByXpath(EL.eleUserName_XP, NonSignatoryNAME, " Non signatory user");
													CM.enteringDataintoTextfiledByXpath(EL.elePassword_XP, Password, "Password");
													CM.clickonElementbyXpath(EL.eleLogin_XP, "LOGIN");
													Thread.sleep(2000);
													String details = driver
															.findElement(By
																	.xpath("//span[text()=' "+ControlprintNumber+" ']/parent::td/parent::tr/td[19]/div/div"))
															.getText();
													try {
														WebElement controldocnumber = driver.findElement(By.xpath("//span[text()=' "+ControlprintNumber+" ']"));
														controldocnumber.click();
														System.out.println("controldocnumber clicked Approvals details page opend");
													} catch (Exception e) {
														System.out.println("not able to validate");
														System.out.println("Exception : " + e);
													}
													CM.CheckElementDisplayedbyXpath(EL.elemainheaderapprovaldetail_XP, "Approval Details");
													CM.CheckElementDisplayedbyXpath(EL.eleheaderapprovaltype_XP, "Approval Type");
													CM.CheckElementDisplayedbyXpath(EL.eleissuesetnumber_XP, "Issue Set Number");
													CM.CheckElementDisplayedbyXpath(EL.eleheaderdocnum_XP, "Doc Number");
													CM.CheckElementDisplayedbyXpath(EL.eleheaderrange_XP, "Range");
													CM.CheckElementDisplayedbyXpath(EL.eleheadernumberofcopies_XP, "Number of Copies");
													CM.CheckElementDisplayedbyXpath(EL.eleheadersubmittedby_XP, "Submitted by");
													try {
														WebElement Submittedby = driver.findElement(By.xpath(
																"//td[@class='tableData bold tdFieldValue'][normalize-space()='" + initiatedBy + "']"));
														if (Submittedby.isDisplayed()) {
															System.out.println("initiatedBy" + initiatedBy);
														} else {
															System.out.println("initiatedBy " + initiatedBy);
														}
													} catch (Exception e) {
														System.out.println("not able to validate");
														System.out.println("Exception : " + e);
													}
													CM.CheckElementDisplayedbyXpath(EL.eleReMarkss_XP, "Remarks");
													CM.CheckElementDisplayedbyXpath(EL.elePRintS_XP, "PrinTs");
													CM.CheckElementDisplayedbyXpath(EL.eletitleID_XP, "TitleID");
													CM.CheckElementDisplayedbyXpath(EL.elePrintSummary_XP, "PrintSummary");
													CM.CheckElementDisplayedbyXpath(EL.eleRecoSetting_XP, "RecoSetting");
													CM.CheckElementDisplayedbyXpath(EL.eleReconciliationID_XP, "ReconciliationID");
													CM.CheckElementDisplayedbyXpath(EL.eleReconcileComments_XP, "ReconcileComments");
													CM.CheckElementDisplayedbyXpath(EL.eleStatusS_XP, "Status");
													CM.CheckElementDisplayedbyXpath(EL.eleActionsH_XP, "Action");
													CM.CheckElementDisplayedbyXpath(EL.elePrintss1_XP, "print");
													CM.CheckElementDisplayedbyXpath(EL.elePAges_XP, "Pages");
													CM.CheckElementDisplayedbyXpath(EL.eleDAys_XP, "days");
													CM.CheckElementDisplayedbyXpath(EL.elepagw_XP, "page");

													
													
													
												
													//div[@class='t-grid t-widget wrapperanciissue']/table/tbody/tr/td[5]/div/div/input[@value='"+DocNumber+"']
													//div[@class='t-grid t-widget wrapperanciissue']/table/tbody/tr/td[5]/div[2]/div/input[@value='"+DocNumber+"']
//													public static String eleCompletea_XP="//input[@id='btnComplete']";
													
													try {
														WebElement DOCNUBER = driver.findElement(By.xpath("//div[@class='t-grid t-widget wrapperanciissue']/table/tbody/tr/td[5]/div/div/input[@value='"+Title+"']"));
														if (DOCNUBER.isDisplayed()) {
															System.out.println("doc Title equal");
														} else {
															System.out.println("doc Title not equal");
														}
													} catch (Exception e) {
														System.out.println("not able to validate");
														System.out.println("Exception : " + e);
													}
													try {
														WebElement doctitle = driver.findElement(By.xpath(
																"//div[@class='t-grid t-widget wrapperanciissue']/table/tbody/tr/td[5]/div[2]/div/input[@value='"+DocNumber+"']"));
														if (doctitle.isDisplayed()) {
															System.out.println("doc number is displayed");
														} else {
															System.out.println("doc number is not displayed");
														}
													} catch (Exception e) {
														System.out.println("not able to validate");
														System.out.println("Exception : " + e);
													}
													CM.enteringDataintoTextfiledByXpath(EL.eleRemarksinput_XP, NonsignatoryRemarks, " Reviewer1remarks");
													Thread.sleep(1000);
													try {
														wait.until(
																ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//select[@id='Decision']")));
														Select select2 = new Select(driver.findElement(By.xpath("//select[@id='Decision']")));
														select2.selectByVisibleText(ControlprintDecision);
														System.out.println("Selected " + ControlprintDecision);
													} catch (StaleElementReferenceException e) {
														wait.until(
																ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//select[@id='Decision']")));
														Select select2 = new Select(driver.findElement(By.xpath("//select[@id='Decision']")));
														select2.selectByVisibleText(ControlprintDecision);
														System.out.println("Selected " + ControlprintDecision);
													}
													if (ControlprintDecision.equals("Approve")) {
														System.out.println("Approved");
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
														CM.enteringDataintoTextfiledByXpath(EL.eleUserName_XP, initiatorusername, " UserName");
														CM.enteringDataintoTextfiledByXpath(EL.elePassword_XP, Password, "Password");
														CM.clickonElementbyXpath(EL.eleLogin_XP, "LOGIN");
														Thread.sleep(5000);
														CM.clickonElementbyXpath(EL.elemenuicon_XP, "Menu icon");
														try {
															driver.findElement(By.xpath("//div[text()='Documents']")).click();
															Thread.sleep(4000);
														} catch (StaleElementReferenceException e) {
															driver.findElement(By.xpath("//div[text()='Documents']")).click();
														}
														try {
															driver.findElement(By.xpath("//div[text()='An']")).click();
															System.out.println("Analytical page opened");
														} catch (StaleElementReferenceException e) {
															driver.findElement(By.xpath("//div[text()='An']")).click();
														}
														Thread.sleep(3000);
														CM.clickonElementbyXpath(EL.eleControlleds_XP, "Controlled");
														Thread.sleep(5000);
														try {
															WebElement ApprovalafterControlstatus = driver.findElement(By.xpath("//span[text()=' "
																	+ ControlprintNumber + " ']/parent::td/following-sibling::td[4][text()='Ready To Print']"));
															if (ApprovalafterControlstatus.isDisplayed()) {
																System.out.println("controlled document approved after status = Ready To Print");
															} else {
																System.out.println("controlled document approvaed after status not equal ");
															}
														} catch (Exception e) {
															System.out.println("not able to validate");
															System.out.println("Exception : " + e);
														}
														driver.findElement(By.xpath("//a[contains(text(),'Documents')]")).click();
														Thread.sleep(2000);
													} else if (IssuedocDecision.equals("Reject")) {
														System.out.println(" Issue document Reject");
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
														CM.enteringDataintoTextfiledByXpath(EL.eleUserName_XP, initiatorusername, " UserName");
														CM.enteringDataintoTextfiledByXpath(EL.elePassword_XP, Password, "Password");
														CM.clickonElementbyXpath(EL.eleLogin_XP, "LOGIN");
														Thread.sleep(5000);
														CM.clickonElementbyXpath(EL.elemenuicon_XP, "Menu icon");
														try {
															driver.findElement(By.xpath("//div[text()='Documents']")).click();
															Thread.sleep(4000);
														} catch (StaleElementReferenceException e) {
															driver.findElement(By.xpath("//div[text()='Documents']")).click();
														}
														try {
															driver.findElement(By.xpath("//div[text()='An']")).click();
														} catch (StaleElementReferenceException e) {
															driver.findElement(By.xpath("//div[text()='An']")).click();
														}
														Thread.sleep(3000);
														CM.clickonElementbyXpath(EL.eleControlleds_XP, "Controlled");
														Thread.sleep(5000);
														try {
															WebElement ApprovalafterControltatus = driver.findElement(By.xpath("//span[text()=' "
																	+ ControlprintNumber + " ']/parent::td/following-sibling::td[4][text()='Added']"));
															if (ApprovalafterControltatus.isDisplayed()) {
																System.out.println("Issue document Reject after status = Added");
															} else {
																System.out.println("Issue document Reject after status not equal ");
															}
														} catch (Exception e) {
															System.out.println("not able to validate");
															System.out.println("Exception : " + e);
														}
														driver.findElement(By.xpath("//a[contains(text(),'Documents')]")).click();
														Thread.sleep(5000);
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
													Thread.sleep(2000);
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
								+ " ']/parent::td/following-sibling::td/div[2]//a[text()='Submit']"));
						Submit.click();
						System.out.println("Resubmit button clicked");
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
