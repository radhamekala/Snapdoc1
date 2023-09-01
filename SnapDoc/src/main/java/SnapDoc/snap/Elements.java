package SnapDoc.snap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Elements extends TestBase {
	public static String eleUserName_XP = "//input[@id='UserName']";
	public static String elePassword_XP = "//input[@id='Password']";
	public static String eleHeterologo_XP = "//img[@src='/Images/Hetero_logo.png']";
	public static String eleinfilogo_XP = "//img[@src='/images/05.png']";

	public static String eleWelcome_XP = "//p[text()='Welcome to Infionic ']";
	public static String elewelcomsnspdoc_XP = "//p[text()='Welcome to Infionic ']/span[text()=' SnapDoc ']";

	public static String elesystemimg_XP = "//img[@src='../../images/01.png']";
	public static String eleForgot_XP = "//a[text()='Forgot Password ?']";
	public static String eleLogin_XP = "//a[text()='LOGIN ']";

	public static String eleUserNameformError_XP = "(//div[@class='fa fa-exclamation-circle exc-icon cursor-pointer'])[1]";
	public static String elepasswordError_XP = "(//div[@class='fa fa-exclamation-circle exc-icon cursor-pointer'])[2]";
	public static String eleuserfieldre_XP = "//div[@class='UserNameformError error-wrap']/div[text()='This field is required']";
	public static String elepasswordfilre_XP = "//div[@class='PasswordformError error-wrap']/div[text()='This field is required']";

	public static String elemenuicon_XP = "//i[@class='bi bi-list']"; // menu icon
	public static String elemenu1_XP = "//div[text()='Dashboard']";
	public static String elemenu2_XP = "//div[text()='Documents']";
	public static String elemenu3_XP = "//div[text()='Masters']";
	public static String elemenu4_XP = "//div[text()='Admin']";

	public static String eleactiveMenu_XP = "//td[@class='activeMenu']";
	public static String eletogglearrow_XP = "//div[@class='wid100pc toggle-btn-row']";
	public static String eleUs_XP = "//div[@class='iconWrap']/div/div[text()='Us']";
	public static String eleUsers_XP = "//div[@class='iconWrap']/p[text()='Users']";
	public static String eleOr_XP = "(//div[@class='iconWrap']/div/div[text()='Or'])[1]";
	public static String eleOrganization_XP = "//div[@class='iconWrap']/p[text()='Organization ']";
	public static String eleCi_XP = "(//div[@class='iconWrap']/div/div[text()='Cl'])[1]";
	public static String eleClassifications_XP = "(//div[@class='iconWrap']/p[text()='Classifications'])[1]";
	public static String eleSe_XP = "(//div[@class='iconWrap']/div/div[text()='Se'])[1]";
	public static String eleSettings_XP = "//div[@class='iconWrap']/p[text()='Settings ']";
	public static String eleGI_XP = "(//div[@class='iconWrap']/div/div[text()='Gl'])[1]";
	public static String eleGlobal_XP = "//div[@class='iconWrap']/p[text()='Global Sequences']";
	public static String eleAu_XP = "(//div[@class='iconWrap']/div/div[text()='Au'])[1]";
	public static String eleAudit_XP = "//div[@class='iconWrap']/p[text()='Audit Trail']";
	public static String eleJu_XP = "(//div[@class='iconWrap']/div/div[text()='Ju'])[1]";
	public static String eleJustifications_XP = "//div[@class='iconWrap']/p[text()='Justifications']";
	public static String eleJustificationshea_XP = "//a[text()='Justifications']";
	public static String elejust_XP = "(//span[text()='Justifications'])[3]";
	public static String elesyadd_XP = "//a[text()='System Address']";
	public static String elePredefined_XP = "//a[text()='No Predefined Reasons']";
	public static String eleGlobals_XP = "//td[text()='Global']";
	public static String eleGlobaltoggle_XP = "//td[text()='Global']/parent::tr/td[5]";
	public static String eleglobaledit_XP = "//td[text()='Global']/parent::tr/td[5]//a[text()='Edit']";
	
	public static String elePre_XP = "//span[text()='Pre Defined Reasons']";
	public static String eleSystem_XP = "//label[normalize-space()='System Address']";
	public static String eleGlobalA_XP = "//span[text()='Global']";
	public static String eleReasons_XP = "//h1[text()='Reasons ']";
	public static String eleReason_XP = "//th[text()='Reason']";
	public static String elebtnAdd_XP = "//input[@id='btnAdd']";
	
	public static String eleClose_XP = "//span[text()='Close']";
	
	public static String elebtnSave_XP = "//input[@id='btnSave']";
	
	public static String eleActionHEA_XP = "//h3[text()='Justification for Action']";
	public static String elePrefilled_XP = "//td[normalize-space()='Prefilled Reason']";
	public static String eleCustom_XP = "//td[normalize-space()='Custom Reason']";
	public static String eleclose_XP = "//span[text()='X']";
	public static String eleSave_XP = "//span[text()='Save']";
	public static String eleREason_XP = "//select[@id='PrefilledReasonId']";
	
//	Dashboard///
	public static String eleDashboard_XP = "//td[text()='Dashboard']";
	public static String eleDashboardtoggle_XP = "//td[text()='Dashboard']/parent::tr/td[5]";
	
	public static String eleDashboardedit_XP = "//td[text()='Dashboard']/parent::tr/td[5]//a[text()='Edit']";
	public static String eleDashboards_XP = "(//span[text()='Dashboard'])[2]";
	//Admin
	public static String eleadminedit_XP = "//td[text()='Admin']/parent::tr/td[5]//a[text()='Edit']";
	public static String eleadmins_XP = "(//span[text()='Admin'])[2]";
//adminuser
	public static String eleadminuseredit_XP = "//td[text()='Admin-->>Users']/parent::tr/td[5]//a[text()='Edit']";
	public static String eleadminsuser_XP = "//span[text()='Admin-->>Users']";
	//audit trail
	public static String eleadminaditedit_XP = "//td[text()='Admin-->>Audit Trail']/parent::tr/td[5]//a[text()='Edit']";
	public static String eleadminaudit_XP = "//span[text()='Admin-->>Audit Trail']";	
	//justifiction
		public static String elejustificedit_XP = "//td[text()='Admin-->>Justifications']/parent::tr/td[5]//a[text()='Edit']";
		public static String elejusti_XP = "//span[text()='Admin-->>Justifications']";	
//organization
				public static String eleorgedit_XP = "//td[text()='Admin-->>Organization ']/parent::tr/td[5]//a[text()='Edit']";
				public static String eleorg_XP = "//span[text()='Admin-->>Organization ']";	
//settting
				public static String elesettingedit_XP = "//td[text()='Admin-->>Settings ']/parent::tr/td[5]//a[text()='Edit']";
				public static String elesetting_XP = "//span[text()='Admin-->>Settings ']";	
//Global Sequences
				public static String eleglobalsedit_XP = "//td[text()='Admin-->>Global Sequences']/parent::tr/td[5]//a[text()='Edit']";
				public static String eleglobal_XP = "//span[text()='Admin-->>Global Sequences']";	
//Classification
				public static String eleClassiedit_XP = "//td[text()='Admin-->>Classifications']/parent::tr/td[5]//a[text()='Edit']";
				public static String eleClassi_XP = "//span[text()='Admin-->>Classifications']";
				
				//documents
				public static String eleDocedit_XP = "//td[text()='Documents']/parent::tr/td[5]//a[text()='Edit']";
				public static String eleDocument_XP = "//span[text()='Documents']";
				//documents analytical
				public static String eleDocanedit_XP = "//td[text()='Documents-->>Analytical']/parent::tr/td[5]//a[text()='Edit']";
				public static String eleDocumentan_XP = "//span[text()='Documents-->>Analytical']";

//organizTION
				public static String eleLocation_XP = "//a[text()='Locations']";
				public static String eleLocations_XP = "//span[text()='Locations']";
				public static String eleShortcode_XP = "//a[text()='Short Code']";
				public static String eleLocationname_XP = "//span[text()='Location Name']";
				public static String eleDescription_XP = "//a[text()='Description']";
				public static String eleAddress_XP = "//a[text()='Address']";
				public static String eleAddlocation_XP = "//input[@id='btnAddSite']";
				public static String eleHeader_XP = "//span[text()='Add/Edit Location']";
				public static String eleLocationnam_XP = "//label[text()='Location Name']";
				public static String eleLocationnamman_XP = "//label[text()='Location Name']/span[text()='*']";
				public static String eleShortcodes_XP = "//div[@class='flx-col-3 flex-row-colpad15']//label[1]";
				public static String eleDescriptions_XP = "//label[text()='Description']";
				public static String eleDescriptionman_XP = "//label[text()='Description']/span[text()='*']";
				public static String eleaddre1_XP = "//label[text()='Add 1']";
				public static String eleaddresman_XP = "//label[text()='Add 1']/span[text()='*']";
				public static String eleaddress2_XP = "//label[text()='Add 2']";
				public static String eleaddressman_XP = "//label[text()='Add 2']/span[text()='*']";
				public static String eleCountry_XP = "//label[text()='Country']";
				public static String eleCountryman_XP = "//label[text()='Country']/span[text()='*']";
				public static String eleState_XP = "//label[text()='   State  ']";
				public static String eleCity_XP = "//label[text()='City ']";
				public static String eleZipcode_XP = "//label[text()='Zip code ']";
				public static String elecountry_XP = "//select[@id='CountryId']";
				public static String eleStates_XP = "//select[@id='StateId']";
				public static String elecityname_XP = "//input[@id='CityName']";
				public static String elezipcode_XP = "//input[@id='ZipCode']";
				public static String elebuttonSave_XP = "//input[@id='btnSaveSite']";
				
//				public static String ele_XP = "//h3[text()='Justification for Action']";
				public static String eletoggle_XP = "//td[text()='Auro 1']/parent::tr/td[12]/div[@class='inficon dotIcon']";
				public static String elepencilicon_XP = "//td[text()='Auro 1']/parent::tr/td[12]/div[2]/div/div[1]/div[@class='cell icons']";
				public static String eleEdit_XP = "//td[text()='Auro 1']/parent::tr/td[12]/div[2]/div/div[1]/div[2]/a[text()='Edit']";
				public static String eleviewicon_XP = "//td[text()='Auro 1']/parent::tr/td[12]/div[2]/div/div[2]/div[@class='cell icons']";
				
				
				
				
				
//				public static String ele_XP = "(//a[@class='t-icon t-refresh'])[1]";
//				public static String ele_XP = "(//span[text()='first'])[1]";
				
//						public static String ele_XP = "(//span[text()='prev'])[1]";
//						public static String ele_XP = "(//span[text()='next'])[1]";
//						public static String ele_XP = "(//span[text()='last'])[1]";
//						public static String ele_XP = "(//li[text()='5'])[1]";
//						public static String ele_XP = "(//li[text()='10'])[1]";
//						public static String ele_XP = "";
//						public static String ele_XP = "";
//						public static String ele_XP = "";
//						public static String ele_XP = "";
//						public static String ele_XP = "";
//						public static String ele_XP = "";
//						public static String ele_XP = "";
//						public static String ele_XP = "";
//						public static String ele_XP = "";
//						public static String ele_XP = "";
//						public static String ele_XP = "";
//						public static String ele_XP = "";
//						public static String ele_XP = "";
//						public static String ele_XP = "";
//						public static String ele_XP = "";
//						public static String ele_XP = "";
//						public static String ele_XP = "";
//						public static String ele_XP = "";


				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				

				
				
	
	
			
			
	
	
	
			
			

}
