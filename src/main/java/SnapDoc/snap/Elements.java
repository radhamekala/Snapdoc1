package SnapDoc.snap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Elements extends TestBase {
	public static String eleUserName_XP = "//input[@id='UserName']";
	public static String elePassword_XP = "//input[@id='Password']";
	public static String eleHeterologo_XP = "//img[@src='/Images/Hetero_logo.png']";
	public static String eleinfilogo_XP = "//img[@src='/images/05.png']";

	public static String eleWelcome_XP = "//p[text()='Welcome to Infionic']";
	public static String elewelcomsnspdoc_XP = "//p[text()='Welcome to Infionic']/following-sibling::p[text()=' SnapDoc']";

	public static String elesystemimg_XP = "//img[@src='../../images/01.png']";
	public static String eleForgot_XP = "//a[text()='Forgot Password ?']";
	public static String eleLogin_XP = "//a[text()='LOGIN ']";

	public static String eleUserNameformError_XP = "(//div[@class='fa fa-exclamation-circle exc-icon cursor-pointer'])[1]";
	public static String elepasswordError_XP = "(//div[@class='fa fa-exclamation-circle exc-icon cursor-pointer'])[2]";
	public static String eleuserfieldre_XP = "//div[@class='UserNameformError error-wrap']/div[text()='This field is required']";
	public static String elepasswordfilre_XP = "//div[@class='PasswordformError error-wrap']/div[text()='This field is required']";

	public static String elemenuicon_XP = "//div[@id='mobi']"; // menu icon
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
	// Admin
	public static String eleadminedit_XP = "//td[text()='Admin']/parent::tr/td[5]//a[text()='Edit']";
	public static String eleadmins_XP = "(//span[text()='Admin'])[2]";
//adminuser
	public static String eleadminuseredit_XP = "//td[text()='Admin-->>Users']/parent::tr/td[5]//a[text()='Edit']";
	public static String eleadminsuser_XP = "//span[text()='Admin-->>Users']";
	// audit trail
	public static String eleadminaditedit_XP = "//td[text()='Admin-->>Audit Trail']/parent::tr/td[5]//a[text()='Edit']";
	public static String eleadminaudit_XP = "//span[text()='Admin-->>Audit Trail']";
	// justifiction
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

	// documents
	public static String eleDocedit_XP = "//td[text()='Documents']/parent::tr/td[5]//a[text()='Edit']";
	public static String eleDocument_XP = "//span[text()='Documents']";
	// documents analytical
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

	public static String elerefresh_XP = "(//a[@class='t-icon t-refresh'])[1]";
	public static String elefirst_XP = "(//span[text()='first'])[1]";
	public static String eleprev_XP = "(//span[text()='prev'])[1]";
	public static String elenext_XP = "(//span[text()='next'])[1]";
	public static String elelast_XP = "(//span[text()='last'])[1]";
	public static String ele5_XP = "(//li[text()='5'])[1]";
	public static String ele10_XP = "(//li[text()='10'])[1]";
	public static String ele20_XP = "//li[text()='20']";
	public static String ele50_XP = "//li[text()='50']";

	public static String eleArrowdown_XP = "//span[text()='select']";

	public static String eleDepartments_XP = "//a[text()='Departments']";
	public static String eleDepart_XP = "//span[text()='Departments']";
	public static String eledepartname_XP = "//a[text()='Department Name']";
	public static String eledepatshotcode_XP = "//a[text()='Short Code']";
	public static String eleDis_XP = "//a[text()='Description']";
	public static String eleAdddepart_XP = "//input[@id='btnAddDept']";
	public static String eleAdddepH_XP = "//span[text()='Add Department']";
	public static String eleDepName_XP = "//label[text()='Department Name ']";
	public static String eleDepNameMAN_XP = "//label[text()='Department Name ']/span[text()='*']";
	public static String eleDepDis_XP = "//label[text()='Department Description  ']";
	public static String eledepDisman_XP = "//label[text()='Department Description  ']/span[text()='*']";
	public static String elesCode_XP = "//label[text()='Short Code ']";
	public static String eleshorman_XP = "//label[text()='Short Code ']/span[text()='*']";
	public static String eleCloses_XP = "//span[text()='Close']";
	public static String eleDepartmentName_XP = "//input[@id='DepartmentName']";
	public static String eleDepartmentCode_XP = "//input[@id='DepartmentCode']";
	public static String eleDescriptionS_XP = "//textarea[@id='Description']";
	public static String eleSaves_XP = "//input[@id='btnSave']";
	public static String eleDepREQ_XP = "//div[@class='DepartmentNameformError error-wrap']//div[@class='fa fa-exclamation-circle exc-icon cursor-pointer']";
	public static String eleCodREQ_XP = "//div[@class='DepartmentCodeformError error-wrap']//div[@class='fa fa-exclamation-circle exc-icon cursor-pointer']";
	public static String eleDisREQ_XP = "//div[@class='DescriptionformError error-wrap']//div[@class='fa fa-exclamation-circle exc-icon cursor-pointer']";
	public static String eleReq1_XP = "(//div[text()='This field is required'])[1]";
	public static String eleReq2_XP = "(//div[text()='This field is required'])[2]";
	public static String eleReq3_XP = "(//div[text()='This field is required'])[3]";

	public static String eleEditsymbal_XP = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/div[3]/table[1]/tbody[1]/tr[1]/td[6]/div[2]/div[1]/div[1]/div[1]/a[1]/span[1]";
	public static String eleviewsymbal_XP = "//tbody/tr[6]/td[6]/div[2]/div[1]/div[1]/div[2]/a[1]";
	public static String eleDeactive_XP = "//tbody/tr[6]/td[6]/div[2]/div[1]/div[1]/div[2]/a[1]";
	public static String eleEdits_XP = "//tbody/tr[6]/td[6]/div[2]/div[1]/div[1]/div[2]/a[1]";
	public static String eleStores_XP = "//tbody/tr[12]/td[6]/div[1]";
	public static String eleview_XP = "(//a[text()='View History'])[12]";

	public static String eleviewheader_XP = "//span[text()='View Change History']";
	public static String elesearch_XP = "//input[@id='auditSearchText']";
	public static String eleTraid_XP = "//th[text()='Transaction ID']";
	public static String eleItemid_XP = "//th[text()='Item ID']";
	public static String eleAction_XP = "//th[text()='Action']";
	public static String eleSubAction_XP = "//th[text()='Sub Action']";
	public static String eleEntity_XP = "(//th[text()='Entity'])[1]";
	public static String eleField_XP = "//th[text()='Field']";
	public static String eledatetime_XP = "//th[text()='Date & Time']";
	public static String eleuser_XP = "//th[text()='User']";
	public static String elejustif_XP = "//th[text()='Justification']";
	public static String eleExpand_XP = "(//span[text()='Expand'])[2]";
	public static String elebutton_XP = "//div[@id='btnCollapseExpandAuditHistory']";

//						public static String ele_XP = "(//th[text()='Entity'])[2]";
//					public static String ele_XP = "(//th[text()='Field Name'])[2]";
//						public static String ele_XP = "(//th[text()='New Value'])[2]";
//						public static String ele_XP = "(//th[text()='Old Value'])[2]";
//						public static String ele_XP = "(//td[text()='Departments'])[2]";

	public static String elecloses_XP = "//span[text()='Close']";
	public static String eleDeactivate_XP = "(//a[text()='Deactivate'])[12]";
	public static String eleDepname_XP = "//a[text()='Department Name']";
	public static String eleShotc_XP = "(//th[@class='t-header CLH'])[2]";
	public static String eleDescrip_XP = "(//th[@class='t-header CLH'])[3]";
	public static String eleStorestoggle_XP = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/div[3]/table[1]/tbody[1]/tr[2]/td[6]/div[1]";
	public static String eleView_XP = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/div[3]/table[1]/tbody[1]/tr[2]/td[6]/div[2]/div[1]/div[1]/div[2]/a[1]";
	public static String eleReactive_XP = "//tr[contains(@class,'t-alt')]//a[contains(@class,'t-grid-Activate t-ajax t-button-icon')][normalize-space()='Activate']";
//roles
	public static String eleRoles_XP = "//a[text()='Roles']";
	public static String elebtnAddRole_XP = "//input[@id='btnAddRole']";
	public static String eleRolepermission_XP = "//span[text()='ROLE PERMISSIONS']";
	public static String eleBasicinfo_XP = "//a[text()='Basic Info']";
	public static String elepermissions_XP = "//a[text()='Permissions']";
	public static String eleName_XP = "//label[text()='Name']";
	public static String eleDescription1_XP = "//label[text()='Description']";
	public static String eletxtRoleName_XP = "//input[@id='txtRoleName']";
	public static String eleDescription2_XP = "//textarea[@id='Description']";
	public static String eleDashboards1_XP = "//a[text()='Dashboard ']";
	public static String eleApprovals_XP = "(//label[text()='Approvals'])[1]";
	public static String eleApprovalsbox_XP = "(//label[text()='Approvals'])[1]/parent::b/parent::td/input[1]";
	public static String eleApprovals2_XP = "(//label[text()='Approvals'])[2]";
	public static String eleinput1_XP = "//input[@id='chkSiteMap_454']";
	public static String eleinput2_XP = "(//label[text()='Approvals'])[3]";
	public static String eleinput3_XP = " //input[@id='chkSiteMap_762']";
	public static String eleNotifications1 = "(//label[text()='Notifications'])[1]";
	public static String eleNotifications2_XP = "(//label[text()='Notifications'])[2]";
	public static String eleinput4_XP = "//input[@id='chkSiteMapAll_40']";
	public static String eleinput5_XP = "//input[@id='chkSiteMap_763']";
	public static String eleAdmin_XP = "//a[text()='Admin ']";

	public static String eleDoccheck_XP = "//input[@id='chkSiteMapAll_26']";
	public static String eledocCla_XP = "//label[text()='Document Classification']";
	public static String eleSAve_XP = "//input[@value='SAVE']";
	public static String eleAccessg_XP = "//a[text()='Access Groups']";
	public static String eleAccess_XP = "//input[@id='btnAddAccessGrop']";
	public static String eleAccessgroup_XP = "//span[text()='ACCESSS GROUPS']";
	public static String eleAssSave_XP = "//input[@value='SAVE']";
	public static String eleDepLoc_XP = "//a[text()='Departments & Locations']";
	public static String eleDocuments_XP = "//a[text()='Documents']";

	public static String eleDesignations_XP = "//a[text()='Designations']";
	public static String elebtnAddDesignation_XP = "//input[@id='btnAddDesignation']";
	public static String eleDesignation_XP = "//span[text()='Add/Edit Designation']";
	public static String eledesName_XP = "//label[text()='Designation Name ']";
	public static String elenameman_XP = "//label[text()='Designation Name ']/span[text()='*']";
	public static String eleShotco_XP = "//label[text()='Short Code ']";
	public static String elecodman_XP = "//label[text()='Short Code ']/span[text()='*']";
	public static String eledesdis_XP = "//label[text()='Designation Description  ']";
	public static String eledesman_XP = "//label[text()='Designation Description  ']/span[text()='*']";
	public static String eleesc_XP = "//label[text()='Escalation Designation']";
	public static String eleEscman_XP = "//label[text()='Escalation Designation']/span[text()='*']";
	public static String elePermissions_XP = "//label[text()='Permissions']";
	public static String eleviewrole_XP = "//a[text()=' View All Role Permissions ']";
	public static String eleViewAsses_XP = "//a[text()=' View All Access Groups ']";
	public static String eleRoles1_XP = "//h2[text()='Roles']";
	public static String eleRnamre_XP = "(//th[text()='Name'])[1]";
	public static String eleRdes_XP = "(//th[text()='Description'])[1]";
	public static String eleRdesig_XP = "(//th[text()='Other Designations'])[1]";
	public static String eleAccessgr_XP = "//h2[text()='Access Group']";
	public static String eleAname_XP = "(//th[text()='Name'])[2]";
	public static String eleOdes_XP = "(//th[text()='Other Designations'])[2]";
	public static String eleOdeman_XP = "(//th[text()='Other Designations'])[2]";
	public static String eleBurole_XP = "//h2[text()='Roles']/parent::td/following-sibling::td/input";
	public static String eleBuAcces_XP = "//h2[text()='Access Group']/parent::td/following-sibling::td/input";

	public static String eleAdd_XP = "//span[text()='Add']";
	public static String elefilter_XP = "(//img[@src='/Images/Icons/filter_new.png'])[3]";
	public static String elerefreshi_XP = "(//img[@src='/Images/Icons/reset.png'])[3]";
	public static String eleNamE_XP = "//span[text()='Name']";
	public static String eleDesC_XP = "//span[text()='Description']";
	public static String eleOrDis_XP = "//span[text()='Other Designations']";
	public static String eleSearh_XP = "//input[@id='txtsearchTextAssociateRole']";
	public static String elebtnAddAccessGrop_XP = "//input[@id='btnAddAccessGrop']";
						public static String eleAccessS_XP = "//input[@id='txtsearchAssociateGroup']";
						public static String Dis = "//span[text()='Other Desigantions']";
						public static String eleChekbox_XP = "(//input[@name='checkedDesignationRecords'])[1]";
						public static String eleDesignationName_XP = "//input[@id='DesignationName']";
						public static String eleDesignationCode_XP = "//input[@id='DesignationCode']";
						public static String eleDesignationDesc_XP = "//textarea[@id='DesignationDesc']";
						public static String eleEscalationDesignation_XP = "//select[@id='EscalationDesignation']";
						public static String eleSavess_XP = "//input[@value='Save']";
						
						
						
                       public static String eleInitiate_XP = "//input[@value='Initiate']";
						public static String eleAddtype_XP = "//select[@name='ddlType_1']";
						public static String eleDocNumber_XP = "//input[@id='txtIsNumberingAutoOrManual_1']";
						public static String eletxtTitle_XP = "//input[@id='txtTitle_1']";
						public static String eletxtNumber_XP = "//input[@id='txtNumber_1']";
						public static String eleVersionNo_XP = "//input[@id='txtVersionNo_1']";
						public static String eleDesLocation_XP = "//textarea[@id='DesLocation_1']";
						public static String eledoclayoutp_XP = "//select[@id='ddlLayout_1']";
						
						public static String elecheckedprimary_XP = "(//input[@checked='checked'])[2]";
						public static String eleDescriptions1_XP = "//textarea[@id='Description_1']";
						public static String eleLocation1_XP = "//div[@id='Location_1']";
						public static String eleselectmaterial_XP = "//select[@class='StockItemId ']";
						public static String eleAsset_XP = "//select[@class='MachineId']";
						public static String eleusers_XP = "//select[@class='UserId']";
						public static String eleproduct_XP = "//select[@name='ProductId']";
						public static String eleSaVe_XP = "(//input[@value='Save'])[2]";
						public static String eleSubmit_XP = "//input[@id='btnSubmit_1']";
						public static String elebutsaves_XP = "//input[@id='btnSave']";
						public static String elenon_XP="//input[@id='TaskId_437331465546_0']/parent::td/following-sibling::td[3]/select";
						public static String eleNonsignatory1_XP="(//select[@name='ApproverUserId'])[1]";
						public static String eleApproverUserId2_XP = "(//select[@name='ApproverUserId'])[2]";
						public static String eleApproverUserId3_XP = "(//select[@name='ApproverUserId'])[3]";
						public static String eleApproverUserId4_XP = "(//select[@name='ApproverUserId'])[4]";
						public static String eleApproverUserId5_XP = "(//select[@name='ApproverUserId'])[5]";
						public static String eleApproverUserId6_XP = "(//select[@name='ApproverUserId'])[6]";
						public static String eleApproverUserId7_XP = "(//select[@name='ApproverUserId'])[7]";
						public static String eleApproverUserId8_XP = "(//select[@name='ApproverUserId'])[8]";
						public static String eleApproverUserId9_XP = "(//select[@name='ApproverUserId'])[9]";
						public static String eleApproval1_XP="//label[text()='Approval 1']/parent::td/following-sibling::td/select";

						public static String elesubmitapprover_XP = "(//input[@value='Submit'])[3]";
						public static String eleDecision_XP = "//select[@id='Decision']";
						public static String eleComplete_XP = "//input[@value='Complete']";
						
						
						
						public static String eleClassificationsm_XP = "//a[contains(text(),'Classifications')]";
						public static String Hierarchy = "//h2[text()='Hierarchy']";
						public static String elecatadd_XP = "(//input[@value='Add'])[1]";
						public static String elebtnCollapse_XP = "//div[@id='btnCollapse']";
						public static String eleInformation_XP = "//h2[text()='Information']";
						public static String eleCatinfo_XP = "//h1[text()='Category Info ']";
						public static String eleName1_XP = "(//span[text()='Name'])[1]";
						public static String eleshortcode1_XP = "(//span[text()='Short Code'])[1]";
						public static String elediscription1_XP = "(//span[text()='Description'])[1]";
						public static String elenoofsub_XP = "(//span[text()='No Of Subcategories'])[1]";
						public static String eleitems1_XP = "(//span[text()='Items'])[1]";
						public static String eletype1_XP = "(//span[text()='Types'])[1]";
						public static String eleHeadersub_XP = "//h1[text()='Subcategories ']";
						public static String eleSubadd_XP = "(//input[@value='Add'])[2]";
						public static String eleName2_XP = "(//span[text()='Name'])[2]";
						public static String eleshort2_XP = "(//span[text()='Short Code'])[2]";
						public static String eleDis2_XP = "(//span[text()='Description'])[2]";
						public static String eleitem2_XP = "(//span[text()='Items'])[2]";
						public static String eletype2_XP = "(//span[text()='Types'])[2]";
						public static String eleTypeheader_XP = "//h1[text()='Types ']";
						public static String eleName3_XP = "(//span[text()='Name'])[3]";
						public static String eleshort3_XP = "(//span[text()='Short Code'])[3]";
						public static String eleselection_XP = "//span[text()='Selections']";
						public static String eleitem3_XP = "(//span[text()='Items'])[3]";
						public static String eleAdd3_XP = "(//input[@value='Add'])[3]";
						
						
						
						public static String eleAddTypeh_XP = "//span[text()='Add Type']";
						public static String eleBasicinfo1_XP = "//div[text()='Basic Info']";
						public static String eleClassifications1_XP = "//th[text()='Classification']";
						public static String eleName1s_XP = "(//th[text()='Name'])[1]";
						public static String eleShortcode1_XP = "(//th[text()='Short Code'])[1]";
						public static String eleDescriptio_XP = "(//th[text()='Description'])[1]";
						public static String eleCatego_XP = "//td[text()='Category']";
						public static String eleSubCat_XP = "//td[text()='Subcategory']";
						public static String eleTypes_XP = "//td[text()='Type']";
						public static String eleAnalytical_XP = "(//td[text()='Analytical'])[3]";
						public static String eleSpecificati_XP = "/html[1]/body[1]/div[6]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[3]/td[2]";
						public static String eleDoccreation_XP="//div[text()='Document Creation']";
						public static String elebasicConfiguration_XP="//div[text()='Basic Configuration']";
						
						public static String eleManu_XP="//div[text()='Manual Number']";
						public static String eleOrg_XP="//div[text()='Organization ID']";
						public static String eleAss_XP="//div[text()='Associated Only']";
						public static String eleChan_XP="//div[text()='Change Needed']";
						public static String eleEff_XP="//div[text()='Effective Process']";
						public static String eleTra_XP="//div[text()='Training']";
						public static String eleRev_XP="//div[text()='Review Period (In Months)']";
					
					
						public static String eleManualnumber_XP="//label[@for='IsNumberingAutoOrManual']//span";
						public static String eleOrgid_XP="//label[@for='IsManualNumberReq']/span";
						public static String eleAssociatedonly_XP="//label[@for='IsCreateIndividual']/span";
						public static String eleChangeNeeded_XP="//label[@for='IsChangeNeeded']/span";
						public static String eleEffectiveproccess_XP="//label[@for='IsDocEffManually']/span";
						public static String eleTrareq_XP="//select[@id='TrainingRequired']";
						public static String eleReviewPeriod_XP="//input[@id='ReviewPeriod']";
						public static String eleMAN_XP="//select[@id='TrainingRequired']";
						
						
						public static String eleLayout_XP="Document Layout Configuration";
						public static String ele4Potraitpre_XP="//div[text()='A4-Potrait-Pre Approved']";
						public static String ele4Potraitsystem_XP="//div[text()='A4-Potrait-System Approval']";
						public static String elepre4Landscape_XP="//div[text()='A4-Landscape-Pre Approved']";
						public static String ele4Landscapesystem_XP="//div[text()='A4-Landscape-System Approval']";
						public static String ele3Potraitpre_XP="//div[text()='A3-Potrait-Pre Approved']";
						public static String ele3Potraitsystem_XP="//div[text()='A3-Potrait-System Approval']";
						public static String ele3Landscapepre_XP="//div[text()='A3-Landscape-Pre Approved']";
						public static String ele3Landscapesystem_XP="//div[text()='A3-Landscape-System Approval']";
						public static String eleA4PP_XP="//label[@for='A4PotraitPreApproved']/span";
						public static String eleA4PS_XP="//label[@for='A4PotraitSystemApproval']/span";
						public static String eleA4LP_XP="//label[@for='A4LandscapePreApproved']/span";
						public static String eleA4LS_XP="//label[@for='A4LandscapeSystemApproval']/span";
						public static String eleA3PP_XP="//label[@for='A3PotraitPreApproved']/span";
						public static String eleA3PS_XP="//label[@for='A3PotraitSystemApproval']/span";
						public static String eleA3LP_XP="//label[@for='A3LandscapePreApproved']/span";
						public static String eleA3LS_XP="//label[@for='A3LandscapeSystemApproval']/span";
						
						public static String eleLayout1a4_XP="//div[@class='LayoutDet1']";
						public static String elePotrait_XP="//div[normalize-space()='Potrait']";
						public static String elepreAp_XP="//div[normalize-space()='Pre Approved']";
						public static String elefieldADD_XP="//label[text()='Select the Overlays Field to Add']";
						public static String eleselectprint_XP="//select[@id='ddlPrintObjects']";
						public static String elePreview_XP="//input[@id='btnPreView']";
						public static String eleUploadfile_XP="//input[@id='btnUploadFile']";
						public static String eleCancle_XP="//input[@id='btnoverlayCancel']";
						public static String eleSAVE_XP="//input[@id='btnSaveoverlayProperties']";
						
						public static String eleAssociations_XP="//div[text()='Associations']";
						public static String eleLocatio1_XP="//div[text()='Location']";
						public static String eleDepartment_XP="//div[text()='Department']";
						public static String eleMaterial_XP="//div[text()='Material']";
						public static String eleUser_XP="//div[text()='User']";
						public static String eleAsset1_XP="//div[text()='Asset']";
						public static String eleProduct_XP="//div[text()='Product']";
						
						
						public static String eleConfiguration_XP="//div[text()='Issue Configuration']";
						public static String eleIssuable_XP="//div[text()='Issuable']";
						public static String eleReturnperiod_XP="(//div[text()='Default Return Period'])[2]";
						public static String eleIssueinmonths_XP="//div[text()='Issue Doc Archival (In Months)']";
						public static String eleIssue_XP="//select[@id='IsCanIssue']";
						public static String elereturnperiod_XP="//input[@id='DefaultReturnPeriod']";
						public static String eleArvalperi_XP="//input[@id='ArchivalPeriod']";
						
						public static String eleIssuASS_XP="//div[text()='Issue Associations']";
						public static String elePrintConfiguration_XP="//div[text()='Print Configuration']";
						public static String eleAllowControlled_XP="//div[text()='Allow Controlled Print']";
						public static String eleReturnPeriod_XP="(//div[text()='Default Return Period'])[1]";
						public static String eleControlled_XP="//label[@for='IsCanControlCopy']/span";
						
						public static String eleAutoNumbering_XP="//div[text()='Auto Numbering']";
						
						public static String elePrimaryDocuments_XP="//div[@class='flx-col']";
						public static String eleActive_XP="//div[@class='flx-col']/following-sibling::div/div/div[1]";
						
						public static String eleNumberingApproach_XP="//td[text()='Numbering Approach']";
						public static String eleNumberingAssociations_XP="//td[text()='Numbering Associations']";
						public static String eleNomenclature_XP="//label[text()='Nomenclature']";
						public static String eleDescriptionsA_XP="(//th[text()='Description'])[2]";
						public static String eleSelection_XP="//th[text()='Selection']";
						public static String eleFormat_XP="//th[text()='Format']";
						public static String eleAddlInfo_XP="//th[text()='Addl Info']";
						public static String eleSeparator_XP="//th[text()='Separator']";
						public static String elerdbtnNumberingType_XP="//select[@id='rdbtnNumberingType']";
						public static String eleDescriptionAutoNum_XP="//input[@id='Description_AutoNum1']";
						public static String elePartsAutoNum_XP="//select[@id='Parts_AutoNum1']";
						public static String elebtnAddNewRow_XP="//span[@id='btnAddNewRow']";
						
						public static String eleWorkflo_XP="//div[text()='Workflows']";
						public static String eleInici_XP="//h2[text()='Initiation ']";
						public static String eleDefult1_XP="(//h2[text()='DEFAULT WORKFLOW '])[1]";
						public static String eleLevel1_XP="(//th[text()='Level'])[1]";
						public static String eleDesibased_XP="(//th[text()='Designation Based?'])[1]";
						public static String eleuserbased1_XP="(//th[text()='User Based'])[1]";
						public static String eleUserBased1man_XP="(//th[text()='User Based'])[1]/span[text()='*']";
						public static String eleDesignation1_XP="(//th[text()='Designation (If Designation Based)'])[1]";
						public static String eleDesignationBasedman_XP="(//th[text()='Designation (If Designation Based)'])[1]/span[text()='*']";
						public static String eleLevelName1_XP="(//input[@name='LevelName'])[1]";
						public static String eleIsDesignationBased1_XP="(//input[@id='_IsDesignationBased_1'])[1]";
						public static String eleUserbased1_XP="(//select[@name='Userbased'])[1]";
						public static String eleApproverRoleId_XP="(//select[@name='ApproverRoleId'])[1]";
						public static String eleAddlevelsiniciate_XP="(//span[@title='Add'])[1]";
						
						public static String eleAddcondiworkflow_XP="(//button[text()='Add Cond Workflow'])[1]";
						public static String eleheaderconditionworkflow_XP="(//h2[text()='CONDITIONAL WORKFLOWS '])[1]";
						public static String eleNamea1_XP="(//th[text()='Name'])[3]";
						public static String eleCondition1_XP="(//th[text()='Conditions'])[1]";
						public static String eleLevels1_XP="(//th[text()='Levels'])[1]";
						public static String eleActiveinac_XP="(//th[text()='Active/Inactive'])[1]";
						public static String eleEnableWorkflow_XP="(//input[@title='Enable Workflow'])[1]";
						
						public static String eleSubmission_XP="//h2[text()='Workflow for Document - Submission ']";
						public static String eleWORKFLOW_XP="(//h2[text()='DEFAULT WORKFLOW '])[2]";
						public static String eleWORKFLOW2_XP="(//h2[text()='DEFAULT WORKFLOW '])[3]";
						public static String eleReviewer_XP="(//th[text()='Reviewer'])[1]";
						public static String eleReviewer1_XP="//span[text()='Reviewer 1']";
						public static String eleDesignationbased1_XP="(//th[text()='Designation Based?'])[2]";
						public static String eleUseased_XP="(//th[text()='User Based'])[2]";
						public static String eleuserman_XP="(//th[text()='User Based'])[2]/span[text()='*']";
						public static String eledesig_XP="(//th[text()='Designation (If Designation Based)'])[2]";
						public static String eledesigman_XP="(//th[text()='Designation (If Designation Based)'])[2]/span[text()='*']";
						public static String eleAdd2_XP="(//span[@title='Add'])[2]";
						
						public static String eleReviewerRoleId1_XP="//select[@name='ReviewerRoleId']";
						public static String eleUserbased2_XP="(//select[@name='Userbased'])[2]";
						public static String ele_ReviewerRoleId2_XP="//select[@id='_ReviewerRoleId_2']";
						public static String eleuserbased2_XP="//select[@id='_Userbased_2']";
						public static String eleReviewr3_XP="//select[@id='_ReviewerRoleId_3']";
						public static String eleuserbased3_XP="//select[@id='_Userbased_3']";
						
						
						
						public static String eleApprover_XP="//th[text()='Approver']";
						public static String eledesi2_XP="(//th[text()='Designation Based?'])[3]";
						public static String eleuserba_XP="(//th[text()='User Based'])[3]";
						public static String eleusermand_XP="(//th[text()='User Based'])[3]/span[text()='*']";
						public static String eleDesig_XP="(//th[text()='Designation (If Designation Based)'])[3]";
						public static String eleDesignased_XP="(//th[text()='Designation (If Designation Based)'])[3]/span[text()='*']";
						public static String eleApproval_XP="//span[text()='Approval 1']";
						public static String eleuserbased1a_XP="(//select[@name='Userbased'])[5]";
						public static String eleuseR_XP="//tr[@id='tr_Approval_278030_0']//select[@name='Userbased']";
						public static String eleApprovelrole_XP="(//select[@name='ApproverRoleId'])[2]";
						public static String eleAdd1_XP="(//span[@title='Add'])[5]";
						public static String eleApprover2_XP="//select[@id='_ApproverRoleId_2']";
						public static String eleUsers2_XP="(//select[@id='_Userbased_2'])[2]";
						public static String eleApprover3_XP="//select[@id='_ApproverRoleId_3']";
						public static String eleUser3_XP="(//select[@id='_Userbased_3'])[2]";
						public static String eleUserbased2s_XP="(//select[@id='_Userbased_2'])[1]";
						public static String eleReviewerRoleId2_XP="(//select[@id='_ReviewerRoleId_2'])[1]";
						public static String eleSaveE_XP="//input[@value='Save']";
						public static String eleEffectivedate_XP="//strong[text()='Effective Date']";
						public static String eledatepicker_XP="//img[@class='ui-datepicker-trigger']";
						public static String eletoday_XP="//td[@class=' ui-datepicker-days-cell-over  ui-datepicker-today']";
						
						
						public static String eleUsera_XP="//a[text()='Users']";
						public static String eleAdduser_XP="Add User";
						public static String eleAddUs_XP="//span[text()='Add User']";
						public static String eleClose1_XP="//span[text()='Close']";
						public static String eleName1A_XP="//label[text()='Name']";
						public static String eleUsername_XP="//label[text()='Username']";
						public static String eleEmployee_XP="//label[text()='Employee ID']";
						public static String eleEmail_XP="//label[text()='Email ID']";
						public static String Mobile="//label[text()='Mobile Number']";
						public static String eleJob_XP="(//label[text()='Job Title'])[1]";
						public static String eleJoining_XP="//label[text()='Date of Joining']";
						public static String elebirth_XP="//label[text()='Date of birth']";
						public static String eleLocation1A_XP="//label[text()='Location']";
						public static String eleDepartmentsA_XP="//label[text()='Department']";
						public static String eleAdminmanager_XP="//label[text()='Admin Manager']";
						public static String eleDesignationlevel_XP="//label[text()='Designation Level']";
						
						public static String eleEmployeeName_XP="EmployeeName";
					public static String eleSAVE1_XP="//input[@id='btnSaveUser']";
					public static String eleDesignation1A_XP="Designation";
						public static String eleDateOfJoining_XP="DateOfJoining_JDate";
						public static String elecalendar1_XP="(//img[@src='/images/calendar.png'])[1]";
						public static String eletoday1_XP="//td[@class=' ui-datepicker-days-cell-over  ui-datepicker-today']";
						public static String eleDateOfBirth_XP="//input[@class='  TextboxCSS IgnoreConvertion']";
						public static String elecalendar_XP="(//img[@src='/images/calendar.png'])[2]";
						public static String eleLOCA_XP="//select[@id='ddlLocation']";
						public static String eleDepartmentss_XP="ddlDepartment";
						public static String eleAdminmanagers_XP="ReportingManagerId";
						public static String eleDesiglevel_XP="//input[@class='multiselect-input']";
						
						
						
						
//						public static String ele_XP="//h2[text()='Workflow for Document - Make Effective ']";
						public static String eleEffectiveApproval_XP="IsEffectiveApprovalReq";
						public static String eleEEfect_XP="(//input[@id='IsEffectiveApprovalReq'])[1]";
					public static String eleLevelName2_XP="(//input[@name='LevelName'])[2]";
						public static String eleMakeEffective_XP="//h2[text()='Workflow for Document - Make Effective ']";
						public static String eleworkflow4_XP="(//h2[text()='DEFAULT WORKFLOW '])[4]";
						public static String elelevel2_XP="(//th[text()='Level'])[2]";
						public static String eledesibased4_XP="(//th[text()='Designation Based?'])[4]";
						public static String eleubased4_XP="(//th[text()='User Based'])[4]";
						public static String eledesi4_XP="(//th[text()='Designation (If Designation Based)'])[4]";
						public static String eleadd4_XP="//tr[@id='tr_278031_0']/td[11]/div/span[@title='Add']";
						public static String elecondi3_XP="(//h2[text()='CONDITIONAL WORKFLOWS '])[3]";
						public static String elename5_XP="(//th[text()='Name'])[5]";
						public static String eleConditions3_XP="(//th[text()='Conditions'])[3]";
						public static String eleLevels3_XP="(//th[text()='Levels'])[3]";
						public static String eleActiveinactive_XP="(//th[text()='Active/Inactive'])[3]";
						public static String eleLevelName_XP="(//input[@name='LevelName'])[2]";
						public static String eleApproverRol3_XP="(//div[@class='cr-wrap workflow_278031']/table//select[@name='ApproverRoleId'])[1]";
						public static String eleUserbased4_XP="(//div[@class='cr-wrap workflow_278031']/table//select[@name='Userbased'])[1]";
						public static String eleUSer2Effeect_XP="//tr[@id='tr_278031_1']/td[5]/select[@id='_Userbased_2']";
						public static String eleApproverR2_XP="//tr[@id='tr_278031_1']/td[6]/select[@id='_ApproverRoleId_2']";
						public static String eleLevelNam2input_XP="//tr[@id='tr_278031_1']/td[3]/input[@id='_LevelName_2']";
						public static String eleeffectivelabel3_XP="//tr[@id='tr_278031_2']/td[3]/input";
						public static String eleEffectiveadd2_XP="//tr[@id='tr_278031_1']/td[11]/div/span[@title='Add']";
						public static String eleeffectiveuser3_XP="//tr[@id='tr_278031_2']/td[5]/select";
						public static String eleEffectivapprovar3_XP="//tr[@id='tr_278031_2']/td[6]/select";
						
						
						public static String eleEssuWorkflow_XP="//h2[text()='Workflow for Document - Issue ']";
						public static String eleissuedefult_XP="(//h2[text()='DEFAULT WORKFLOW '])[5]";
						public static String eleissuelavalname_XP="//table[@id='tableDoc_Approval_305053_Types']//th[@class='CLH'][normalize-space()='Level']";
						public static String eleissuedesi_XP="//table[@id='tableDoc_Approval_305053_Types']//th[4]";
						public static String eleissueuser_XP="//table[@id='tableDoc_Approval_305053_Types']//th[5]";
						public static String eleissuedesig_XP="//table[@id='tableDoc_Approval_305053_Types']//th[6]";
						public static String eleAddissuerow_XP="//tr[@id='tr_305053_0']//div[@class='flex-item']";
						
						public static String eledocissueON_XP="//td[@class='text-right']//input[@id='IsDocIssueApprovalReq']";
						public static String eleIssuelevelinput_XP="//tr[@id='tr_305053_0']/td[3]/input";
						public static String eleIssuedesibasedON_XP="//tr[@id='tr_305053_0']/td[4]/input[1]";
						public static String eleissueuserbased_XP="//tr[@id='tr_305053_0']/td[5]/select[1]";
						public static String eleissueifdesibased_XP="//tr[@id='tr_305053_0']/td[6]/select[1]";
						public static String eleAddissueRow_XP="//tr[@id='tr_305053_0']/td[11]/div/span[1]";
						
						public static String eleissuelevel2_XP="//tr[@id='tr_305053_1']/td[3]/input";
						public static String eleifdesibased2issue_XP="//tr[@id='tr_305053_1']/td[4]/input[1]";
						public static String eleuserbased2issu_XP="//tr[@id='tr_305053_1']/td[5]/select[1]";
						public static String eleDesibasedifissue2_XP="//tr[@id='tr_305053_1']/td[6]/select[1]";
						
						public static String eleAddissuerow3_XP="//tr[@id='tr_305053_1']/td[11]/div/span[1]";
						public static String eleissueleve3_XP="//tr[@id='tr_305053_2']/td[3]/input";
						public static String eleifdesibased3issue_XP="//tr[@id='tr_305053_2']/td[4]/input[1]";
						public static String eleuserbased3issu_XP="//tr[@id='tr_305053_2']/td[5]/select[1]";
						public static String eleDesibasedifissue3_XP="//tr[@id='tr_305053_2']/td[6]/select[1]";
						
						
						
						
						
						
						public static String eleControlprint_XP="//h2[text()='Workflow for Document - Control Print ']";
						public static String eleControlworkflow_XP="//div[@class='cr-wrap workflow_305054']/div[2]/table";
						
						public static String eleControlprintON_XP="//td[@class='text-right']//input[@id='IsCtrlPrintApprovalReq']";
						public static String elePrintlevel1_XP="//tr[@id='tr_305054_0']/td[3]/input";
						public static String eleifdesig1_XP="//tr[@id='tr_305054_0']/td[4]/input";
						public static String eleprintuserbased1_XP="//tr[@id='tr_305054_0']/td[5]/select[1]";
						public static String eleIFdesi1control_XP="//tr[@id='tr_305054_0']/td[6]/select[1]";
						public static String eleAddcontrolRow2_XP="//tr[@id='tr_305054_0']/td[11]/div/span[1]";
						
						public static String elePrintlevel2_XP="//tr[@id='tr_305054_1']/td[3]/input";
						public static String eleifdesig2_XP="//tr[@id='tr_305054_1']/td[4]/input";
						public static String eleprintuserbased2_XP="//tr[@id='tr_305054_1']/td[5]/select[1]";
						public static String eleIFdesi1contro2_XP="//tr[@id='tr_305054_1']/td[6]/select[1]";
						public static String eleAddcontrolRow3_XP="//tr[@id='tr_305054_1']/td[11]/div/span[1]";
						
						public static String elePrintlevel3_XP="//tr[@id='tr_305054_2']/td[3]/input";
						public static String eleifdesig3_XP="//tr[@id='tr_305054_2']/td[4]/input";
						public static String eleprintuserbased3_XP="//tr[@id='tr_305054_2']/td[5]/select[1]";
						public static String eleIFdesi1contro3_XP="//tr[@id='tr_305054_2']/td[6]/select[1]";
						
						public static String eleReconciliation_XP="/html[1]/body[1]/div[5]/div[2]/div[1]/div[1]/form[1]/div[4]/div[6]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/h2[1]";
						public static String eleReconciationworkfliow_XP="/html[1]/body[1]/div[5]/div[2]/div[1]/div[1]/form[1]/div[4]/div[6]/div[2]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/h2[1]";
						public static String eleIsReconcillationApprovalReq_XP="//td[@class='text-right']//input[@id='IsReconcillationApprovalReq']";
					public static String eleRecounConditioFlow_XP="/html[1]/body[1]/div[5]/div[2]/div[1]/div[1]/form[1]/div[4]/div[6]/div[2]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/h2[1]";
						
					   public static String eleRecountLevelname1_XP="//tr[@id='tr_383001_0']/td[3]/input";
						public static String eleRecounDesibased1_XP="//tr[@id='tr_383001_0']/td[4]/input";
						public static String eleRecounciUserbased1_XP="//tr[@id='tr_383001_0']/td[5]/select[1]";
						public static String eleRecounciIfDesibased_XP="//tr[@id='tr_383001_0']/td[6]/select[1]";
						public static String eleRecounci2rowAdd_XP="//tr[@id='tr_383001_0']/td[11]/div/span[1]";
						
						public static String eleRecountLevelname2_XP="//tr[@id='tr_383001_1']/td[3]/input";
						public static String eleRecounDesibased2_XP="//tr[@id='tr_383001_1']/td[4]/input";
						public static String eleRecounciUserbased2_XP="//tr[@id='tr_383001_1']/td[5]/select[1]";
						public static String eleRecounciIfDesibased2_XP="//tr[@id='tr_383001_1']/td[6]/select[1]";
						public static String eleRecounci3rowAdd_XP="//tr[@id='tr_383001_1']/td[11]/div/span[1]";
						
						public static String eleRecountLevelname3_XP="//tr[@id='tr_383001_2']/td[3]/input";
						public static String eleRecounDesibased3_XP="//tr[@id='tr_383001_2']/td[4]/input";
						public static String eleRecounciUserbased3_XP="//tr[@id='tr_383001_2']/td[5]/select[1]";
						public static String eleRecounciIfDesibased3_XP="//tr[@id='tr_383001_2']/td[6]/select[1]";
						
//						public static String eleDestruction_XP="/html[1]/body[1]/div[5]/div[2]/div[1]/div[1]/form[1]/div[4]/div[7]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/h2[1]";
//						public static String eleWorkflodistruction_XP="/html[1]/body[1]/div[5]/div[2]/div[1]/div[1]/form[1]/div[4]/div[7]/div[2]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/h2[1]";
//						public static String eleIsDestructionApprovalReq_XP="//td[@class='text-right']//input[@id='IsDestructionApprovalReq']";
//						public static String eleLevel_XP="//table[@id='tableDoc_Approval_383002_Types']//th[@class='CLH'][normalize-space()='Level']";
//						public static String eleIsDEsigDestruct_XP=//table[@id='tableDoc_Approval_383002_Types']//th[@class='CLH'][normalize-space()='Designation Based?']";
//						public static String eledesidistruction_XP="//table[@id='tableDoc_Approval_383002_Types']//th[7]";

						
						
												public static String eleUsersetting_XP="//div[@id='optimg']";
						public static String eleLogout_XP="//a[@id='lnkLogOff']//div[@class='link']";
						public static String eleAccessgrouptoggle_XP="//td[normalize-space()='Default AccessGroup']/parent::tr/td[7]/div[1]";
						public static String eleEditAccess_XP="(//td[text()='Default AccessGroup']/parent::tr/td[7]/div[2]/div/div/div[2]/a)[1]";

						
						
						
					    public static String eleApprovaldetails_XP="//span[text()='Approval Details']";
						public static String eleApprovaltype_XP="//td[text()='Approval Type']";
						public static String eleSubmission2_XP="//td[@class='tableData bold tdFieldValue'][normalize-space()='Submission']";
						public static String eleDocnum_XP="//td[normalize-space()='Doc No']";
						public static String eleSubmitedby_XP="//td[text()='Submitted by']";
						public static String eleEffec_XP="//td[@class='tableData bold tdFieldValue'][normalize-space()='Effective']";
						public static String eleRemarks_XP="//div[@class='label bold']";
						public static String eleclose1_XP="//span[@class='t-icon t-close']";
						public static String eleDecision1_XP="//label[normalize-space()='Decision']";
						public static String eleRemarksinput_XP="//textarea[@id='Remarks']";
						public static String eleUploadfile1_XP="//td[@class='tableData bold']";
						public static String eleUploadfiles_XP="//i[@class='fa fa-file']";
						public static String eledocinfo_XP="//a[text()='Document Info']";
						public static String eledocinfoheader_XP="//h2[text()='Document Info']";
						
//						
			public static String eleApprovalhistory_XP="//h1[text()='Approval History']";
						public static String eleTypeName_XP="//div[@id='positionInfo']//span[text()='Type Name']";
						public static String eleIniciationon_XP="//div[@id='positionInfo']//span[text()='Initiated On']";
						public static String eleInitiBy_XP="//div[@id='positionInfo']//span[text()='Initiated By']";
						public static String elestatuu_XP="//div[@id='positionInfo']//span[text()='Status']";
						public static String eleStepName_XP="//span[text()='Step Name']";
						public static String eleActioN_XP="//span[text()='Action']";
						public static String eleActedBy_XP="//span[text()='Acted By']";
						public static String eleAcceptedON_XP="//span[text()='Accepted On']";
						public static String eleReMarks_XP="//span[text()='Remarks']";
						public static String elefile2_XP="(//span[text()='File'])[2]";
						public static String elebtnComplete_XP="//input[@id='btnComplete']";
						public static String eleDecisionss_XP="//select[@id='Decision']";
						
						public static String elechangeinfo_XP="//h1[text()='Change Control Info']";
						public static String elecontrolnum_XP="//th[text()='Change Control Number']";
						public static String eleDescrisp_XP="//th[text()='Description']";
						public static String elefilechange_XP="(//th[text()='File'])[1]";
						public static String eleAddchange_XP="btnAddQMSOriginEventNew";
						
						public static String eledoccahan_XP="//input[@id='tdQAEventNumber_1']";
						public static String eleDescript_XP="//textarea[@id='tdQADescription_1']";
						public static String elechangefileadd_XP="//span[@id='FilechangeCT_1']";
						public static String eleChangedetail_XP="//span[text()='Change Details']";
						public static String eleNonsignatory_XP="//label[text()='Task for Non-Signatory Reviewers']/parent::td/following-sibling::td/select";
						public static String elechangeDe_XP="//span[text()='Change Details']";
						public static String elchangetablee_XP="//table[@id='tableDoc_Approval']";
						public static String eleSUbmit_XP="(//input[@value='Submit'])[3]";
						public static String eleAdddprimary_XP="//img[@id='btnAddPrimaryDocumentss']";
						
						public static String eleAddtype2_XP="//select[@id='ddlType_2']";
     					public static String eleTitle2_XP="//input[@id='txtTitle_2']";
						public static String eleversion2_XP="//input[@id='txtVersionNo_2']";
						public static String eleDescrip2_XP="//textarea[@id='Description_2']";
						public static String elelayout2_XP="//select[@id='ddlLayout_2']";
						public static String ele_XP="//span[@id='File_2']";
						public static String eledelete_XP="(//span[@onclick='deleteRows(this);'])[2]";
					public static String eleinitiatesearch_XP="//input[@id='searchText_1']";
					
						public static String eleSearchdis_XP="//input[@id='myAppSearchText']";
						public static String eleseletapproval_XP="//select[@id='WorkFlowId']";
						public static String eleInitiatedate_XP="//select[@id='DateRangePrintDate_638218190550580798']";
						public static String eleDocuInfoheader_XP="//a[text()='Document Info']";
						public static String eleissueheader_XP="//a[normalize-space()='Issues']";
						public static String eleContrrolheader_XP="//a[normalize-space()='Controlled']";
						public static String elePastversions_XP="//a[normalize-space()='Past Versions']";
						public static String eleDOcInfo_XP="//h2[text()='Document Info']";
						
						public static String eleErrorwraptitle_XP="//div[@class='txtTitle_1formError error-wrap']/div[text()='This field is required']";
		               public static String eleTitlebutton_XP="//div[@class='txtTitle_1formError error-wrap']/div[2]";
						public static String eleErrorwrapnumber_XP="//div[@class='txtIsNumberingAutoOrManual_1formError error-wrap']/div[2]";
						public static String elenumbererrorwrap_XP="//div[@class='txtIsNumberingAutoOrManual_1formError error-wrap']/div[text()='This field is required']";
						public static String eleorgiderrorwrap_XP="//div[@class='txtNumber_1formError error-wrap']/div[2]";
						public static String eleerrorwroporgid_XP="//div[@class='txtNumber_1formError error-wrap']/div[text()='This field is required']";
						public static String eleversionerror_XP="//div[@class='txtVersionNo_1formError error-wrap']/div[2]";
						public static String eleversionerrorwrap_XP="//div[@class='txtVersionNo_1formError error-wrap']/div[text()='This field is required']";
						public static String elelayouterror_XP="//div[@class='ddlLayout_1formError error-wrap']/div[2]";
						public static String elelayourwrrorwrap_XP="//div[@class='ddlLayout_1formError error-wrap']/div[text()='This field is required']";
					
						
						public static String eleAddtype3_XP="//select[@id='ddlType_3']";
						public static String eleTitle3_XP="//input[@id='txtTitle_3']";
						public static String elenumber3_XP="//input[@id='txtIsNumberingAutoOrManual_3']";
						public static String eleorg3_XP="//input[@id='txtNumber_3']";
						public static String eleversion3_XP="//input[@id='txtVersionNo_3']";
						public static String eledes3_XP="//textarea[@id='Description_3']";
						public static String eleLayout3_XP="//select[@id='ddlLayout_3']";
						
						public static String elenumber2_XP="//input[@id='txtIsNumberingAutoOrManual_2']";
						public static String eleorg2_XP="//input[@id='txtNumber_2']";
						
						public static String eleReviewer1errorwrap_XP="//div[@class='DesignationId_178786635783_1formError error-wrap']/div[2]";
						public static String eleReviewererrorwrap1_XP="//div[@class='DesignationId_178786635783_1formError error-wrap']/div[text()='This field is required']";
						public static String eleApprover2errorwrap_XP="//div[@class='DesignationId_178786635783_2formError error-wrap']/div[2]";
						public static String eleReviewererrorwrap2_XP="//div[@class='DesignationId_178786635783_2formError error-wrap']/div[text()='This field is required']";
//					
						
						public static String eleHeaderdoc_XP="//a[text()='Document Info']";
						public static String eleheadesoc_XP="//h2[text()='Document Info']";
						
						
						public static String eledestra_XP="//h2[text()='Workflow for Document - Destruction ']";
						public static String eledescrict_XP="//td[@class='text-right']//input[@id='IsDestructionApprovalReq']";
						public static String eledeslevel_XP="//input[@id='LevelName_179719718061']";
						public static String eledisdisignased_XP="//tr[@id='tr_383002_0']/td[6]/select";
						public static String eledistuuserbased_XP="//tr[@id='tr_383002_0']/td[5]/select";
						
						
						
						
						public static String eleTitlenumber1_XP="(//thead[@class='t-grid-header'])[1]/tr/th[1]";
						public static String eleDes1_XP="(//thead[@class='t-grid-header'])[1]/tr/th[2]";
						public static String eleLocadep1_XP="(//thead[@class='t-grid-header'])[1]/tr/th[3]";
						public static String eleClassi1_XP="(//thead[@class='t-grid-header'])[1]/tr/th[4]";
						public static String eleASso1_XP="(//thead[@class='t-grid-header'])[1]/tr/th[5]";
						public static String eleSeett1_XP="(//thead[@class='t-grid-header'])[1]/tr/th[6]";
						public static String eleFile1_XP="(//thead[@class='t-grid-header'])[1]/tr/th[7]";
						
						public static String eleTypname_XP="//span[text()='Type Name']";
						public static String eleinitiaon_XP="//span[text()='Initiated On']";
						public static String eleinitiaby_XP="//span[text()='Initiated By']";
						public static String elestatuS_XP="(//span[text()='Status'])[2]";
						public static String elestatuS1_XP="//span[text()='Status']";
	
						public static String elecollpall_XP="//input[@value='Collapse All']";
						public static String eleHidedetail_XP="//a[@class='t-minus']";//
						public static String eleshowdetails_XP="//a[@class='t-plus']";
						public static String elestepname_XP="//span[text()='Step Name']";
						public static String eleActions_XP="//span[text()='Action']";
						public static String eleactedby_XP="//span[text()='Acted By']";
						public static String eleacceptedon_XP="//span[text()='Accepted On']";
						public static String eleremarks_XP="//span[text()='Remarks']";
						public static String eleattachedfile_XP="(//span[text()='File'])[2]";
						
						
						
//						make effective
						public static String eleDocEffectiveheader_XP="//span[text()='DOCUMENT EFFECTIVE']";
						public static String eleTrainingassociatedheader_XP="//h3[text()='Training Associated']";
						public static String eleTraininID_XP="//th[normalize-space()='Training Id']";
						public static String eleTrainingdiscription_XP="//th[@class='t-header'][normalize-space()='Description']";
						public static String eleComDate_XP="//th[normalize-space()='Comp. Date']";
						public static String eleEvidance_XP="//th[normalize-space()='Evidence']";
						public static String eleActionz_XP="//th[normalize-space()='Action']";
						public static String eleEffectivedateheader_XP="//h2[text()='Effective Date']";
						public static String eleEfffecivedates_XP="//label[text()='Effective Date']";
						public static String eleEfffectiveDatemandatory_XP="//label[text()='Effective Date']/parent::h3/span[text()='*']";
						public static String elePrimaryparentdoc_XP="//h2[text()='Primary / Parent Document Details']";
						public static String elePChangehistrory_XP="//input[@value='Change History']";
						public static String eleTitlem_XP="//div[@class='t-grid t-widget']//th[@class='t-header'][normalize-space()='Title']";
						public static String elelocationdep_XP="//th[@class='t-header'][normalize-space()='Loc, Dep']";
						public static String eleaClassification_XP="//th[@class='t-header'][normalize-space()='Classification']";
						public static String eleaAssociations_XP="//th[@class='t-header'][normalize-space()='Associations']";
						public static String eleafile_XP="//th[@class='t-header'][normalize-space()='File']";
						public static String eleAsssodoc_XP="//h1[text()='Associated Documents']";
						public static String eleassotitlenum_XP="//th[normalize-space()='Title & Number']";
						public static String eleassodess_XP="//th[@class='t-header wid20pc'][normalize-space()='Description']";
						public static String eleAssolocdep_XP="//th[@class='t-header wid15pc'][normalize-space()='Loc, Dep']";
						public static String eleAssoclassiz_XP="//th[@class='t-header wid20pc'][normalize-space()='Classification']";
						public static String eleAssoclassi_XP="//th[@class='t-header wid20pc'][normalize-space()='Associations']";
						public static String eleAssoSetting_XP="//th[@class='t-header wid8pc']";
						public static String eleAssociFile_XP="//th[@class='t-header wid5pc']";
						public static String eleEffectiveclose_XP="//span[text()='Close']";
						
						public static String eletraininginfraheader_XP="//h2[text()='Training Information']";
						public static String eleaddtrainingheader_XP="//span[text()='Add Training']";
						public static String eletrainingidheader_XP="//label[text()='Training ID']";
						public static String eletrainingidmandatory_XP="//label[text()='Training ID']/parent::h3/span[text()='*']";
						public static String eleTrainingDiscription_XP="//label[text()='Description']";
						public static String eleTrainindescripmandatory_XP="//label[text()='Description']/parent::h3/span[text()='*']";
						public static String eleCompletiondate_XP="//label[text()='Completion Date']";
						public static String eleCompleationdateman_XP="//label[text()='Completion Date']/parent::h3/span[text()='*']";
						public static String eleattachment_XP="//label[text()='Attachment']";
						public static String elesavetraining_XP="//input[@id='btnSaveTraining']";
						public static String eletraingID_XP="//input[@id='TrainingCode']";
						public static String eleTrainingDesc_XP="//textarea[@id='TrainingDesc']";
						public static String elesaveclose_XP="//input[@value='Save & Close']";
						public static String eleCaliender_XP="//label[text()='Completion Date']/parent::h3/following-sibling::img";
						public static String eleTodaydate_XP="//td[@class=' ui-datepicker-days-cell-over  ui-datepicker-today']";
						public static String eleEffectivecale_XP="//label[text()='Effective Date']/parent::h3/following-sibling::img";
						public static String eleEffectiveSAVE_XP="//input[@value='Save']";
						public static String eleEfffectiveSUBMIT_XP="//input[@value='Submit']";
						
						public static String eleEfffeciveApproves_XP="//span[text()='Approvers']";
						public static String eleEffectivelevelapproval_XP="//label[text()='1']";
						public static String eleEfffectivelevel_XP="//th[text()='Level']";
						public static String eleEffeciveleveluserordesig_XP="//th[text()='User / Designation']";
						public static String eleEffectiveapprovalLEVEL1_XP="//select[@id='DesignationId_219005833329_0']";
						public static String eleSubmitApprovaldata_XP="//input[@id='btnSubmitApprovalData']";

						public static String eleEffeciveddate_XP="//input[@id='EffectiveDate_New_JDate']";
						
						public static String eletraininAssoci_XP="//h3[text()='Training Associated']";
						public static String eletrainID_XP="//th[normalize-space()='Training Id']";
						public static String eleTRAINDES_XP="//th[@class='t-header'][normalize-space()='Description']";
						public static String eleEFFECOMPLETION_XP="//th[normalize-space()='Comp. Date']";
						public static String eleEvidancse_XP="//th[normalize-space()='Evidence']";
						public static String eleEvidens_XP="(//thead[@class='t-grid-header'])[4]/following-sibling::tbody//td[@id='tdEvidence']";

						
						public static String eleEffectivedateheaderr_XP="//h2[text()='Effective Date']";
						public static String eleeffecticveheader_XP="//label[text()='Effective Date']";
						public static String eleReviewdate_XP="//h2[text()='Review Date']";
						public static String elecorrentriviewdate_XP="//label[text()='Current Review Date']";
						
						public static String elestepname1_XP="(//span[text()='Step Name'])[1]";
						public static String eleActions1_XP="(//span[text()='Action'])[1]";
						public static String eleactedby1_XP="(//span[text()='Acted By'])[1]";
						public static String eleacceptedon1_XP="(//span[text()='Accepted On'])[1]";
						public static String eleremarks1_XP="(//span[text()='Remarks'])[1]";
						public static String eleattachedfile1_XP="(//span[text()='File'])[2]";

						public static String elestepname2_XP="(//span[text()='Step Name'])[2]";
						public static String eleActions2_XP="(//span[text()='Action'])[2]";
						public static String eleactedby2_XP="(//span[text()='Acted By'])[2]";
						public static String eleacceptedon2_XP="(//span[text()='Accepted On'])[2]";
						public static String eleremarks2_XP="(//span[text()='Remarks'])[2]";
						public static String eleattachedfile2_XP="(//span[text()='File'])[3]";
						
						public static String eleDocissu_XP="//span[text()='Document Issue']";
						public static String elePrintsheader_XP="//h1[text()='Prints']";
						public static String eleTitleNumber_XP="(//th[text()='Title & Number'])[1]";
						public static String eleASSociations_XP="(//th[text()='Associations'])[1]";
						public static String elePrintss_XP="(//th[text()='Print'])[1]";
						public static String eleRecalltime_XP="(//th[text()='Recall Time'])[1]";
						public static String eleStatuss_XP="(//th[text()='Status'])[1]";
						public static String eleIssueclose_XP="//span[text()='Close']";
						public static String eleReconciliationarchival_XP="//h1[text()='RECONCILIATION & ARCHIVAL']";
						public static String eleprints_XP="(//label[text()='Prints:'])[1]";
						public static String elepages_XP="(//label[text()='Pages:'])[1]";
						public static String eleprintsnumber_XP="(//b[text()='0'])[1]";
						public static String elepagesnumber_XP="(//b[text()='0'])[2]";
						public static String eledatepickers_XP="//div[@class='date-picker mb-10']";
						public static String elereviewewperiods_XP="//div[@class='assoc-label']";
						public static String eleDelete_XP="//img[@alt='Delete']";
						public static String elecollapse_XP="(//span[@class='Collapescss'])[1]";
						public static String elePrintNO_XP="//th[text()='Print No.']";
						public static String elePrintID_XP="//th[text()='Print Id']";
						public static String eleCopies_XP="//th[text()='Copies']";
						public static String eleRange_XP="//th[text()='Range']";
						public static String elePages_XP="//th[text()='Pages']";
						public static String eleReasonforprint_XP="//th[text()='Reason for Print ']";
						public static String eleSubmitted_XP="//th[text()='Submitted']";
						public static String eleApproved_XP="//th[text()='Approved']";
						public static String elePrintedBy_XP="//th[text()='Printed By']";
						public static String eleViewdocument_XP="//img[@alt='View Document']";
						public static String eleSubMIT_XP="//img[@alt='Submit']";
						//input[@value='ChroroA33']
						//input[@value='A33']
						
						public static String elePRINTDOCheader_XP="//span[text()='Print Document']";
						public static String eleprintdocheader_XP="//h1[text()='Print Document']";
						public static String eleDocNAME_XP="//th[text()='Document Name']";
						public static String eleTotalpages_XP="//th[text()='Total Pages']";
						public static String elePrintno_XP="(//th[text()='Print No.'])[2]";
						public static String eleCopiess_XP="(//th[text()='Copies'])[2]";
						public static String eleRanges_XP="(//th[text()='Range'])[2]";
						public static String elePagess_XP="(//th[text()='Pages'])[2]";
						public static String eleSTatus_XP="(//th[text()='Status'])[2]";
						public static String elereadytoprint_XP="//label[text()='Ready To Submit']";
						public static String elechkHeadAll_XP="//input[@id='chkHeadAll']";
						public static String elechkChild_XP="//input[@class='chkChild']";
						//label[text()='ChroroA26']
						public static String elePrintNumber_XP="(//thead[@class='t-grid-header'])[7]/following-sibling::tbody/tr/td[8]";
						public static String elePrintCopies_XP="(//thead[@class='t-grid-header'])[7]/following-sibling::tbody/tr/td[9]";
						public static String eleSaVes_XP="//input[@id='btnSubmit']";
						public static String eleClOse_XP="//input[@id='btnDocCloseTemplate']";
						public static String eleIssuesubmit_XP="//input[@id='btnSaveDet']";
						
				
						public static String eleIssed_XP="//a[normalize-space()='Issued']";
						public static String eleDocnum1_XP="(//span[@class='DocNo'])[1]";
						
						public static String elemainheaderapprovaldetail_XP="//span[text()='Approval Details']";
						public static String eleheaderapprovaltype_XP="//table[@id='tblDetails']/tbody/tr[1]/td[text()='Approval Type']";
						public static String eleissuesetnumber_XP="//table[@id='tblDetails']/tbody/tr[2]/td[text()='Issue Set Number']";
						public static String eleheaderdocnum_XP="//table[@id='tblDetails']/tbody/tr[3]/td[text()='Doc Number']";
						public static String eleheaderrange_XP="//table[@id='tblDetails']/tbody/tr[4]/td[text()='Range']";
						public static String eleheadernumberofcopies_XP="//table[@id='tblDetails']/tbody/tr[5]/td[text()='Number of Copies']";
						public static String eleheadersubmittedby_XP="//table[@id='tblDetails']/tbody/tr[6]/td[text()='Submitted by']";
						
						public static String eleReMarkss_XP="//div[@class='label bold']";
						public static String eleHeaderPrint_XP="//h1[text()='Prints']";
						public static String eleheadertitlenumber_XP="//table[@id='tblAnciIssue']/thead/tr/th[text()='Title & Number']";
						public static String eleheaderAssoci_XP="//table[@id='tblAnciIssue']/thead/tr/th[text()='Associations']";
						public static String eleheaderprint_XP="//table[@id='tblAnciIssue']/thead/tr/th[text()='Print']";
						public static String eleHeaderrecall_XP="//table[@id='tblAnciIssue']/thead/tr/th[text()='Recall Time']";
						public static String eleHeaderstatus_XP="//table[@id='tblAnciIssue']/thead/tr/th[text()='Status']";
						public static String eleVER_XP="//table[@id='tblAnciIssue']/tbody/tr[1]/td[5]/div/div/input[@value='0.00']";
						public static String elePRINT_XP="//table[@id='tblAnciIssue']/tbody/tr[1]/td[7]/div/label[text()='Prints:']";
						public static String elePAGE_XP="//table[@id='tblAnciIssue']/tbody/tr[1]/td[7]/div/label[text()='Pages:']";
						public static String elePRINTS_XP="//table[@id='tblAnciIssue']/tbody/tr[1]/td[7]/div/label[2]/b[text()='0']";
						public static String elePAGES_XP="//table[@id='tblAnciIssue']/tbody/tr[1]/td[7]/div/label[4]/b[text()='0']";
						public static String eleYearcla_XP="//table[@id='tblAnciIssue']/tbody/tr[1]/td[8]/div/input";
						public static String eleReviePeriods_XP="//table[@id='tblAnciIssue']/tbody/tr[1]/td[8]/div[2]/label[text()='2 days']";
						public static String eleReconArchi_XP="//h1[text()='RECONCILIATION & ARCHIVAL']";
						public static String eleCoLLapse_XP="(//span[@class='Collapescss'])[1]";
						public static String elePRINTNO_XP="//div[@class='CollapeDet expanded']/table/thead/tr/th[text()='Print No.']";
						public static String elePrINTID_XP="//div[@class='CollapeDet expanded']/table/thead/tr/th[text()='Print Id']";
						public static String eleCopiES_XP="//div[@class='CollapeDet expanded']/table/thead/tr/th[text()='Copies']";
						public static String eleRaNGE_XP="//div[@class='CollapeDet expanded']/table/thead/tr/th[text()='Range']";
						public static String elePaGES_XP="//div[@class='CollapeDet expanded']/table/thead/tr/th[text()='Pages']";
						public static String eleREAsonforprint_XP="//div[@class='CollapeDet expanded']/table/thead/tr/th[text()='Reason for Print ']";
						public static String eleSuBMITTED_XP="//div[@class='CollapeDet expanded']/table/thead/tr/th[text()='Submitted']";
						public static String eleAppROVED_XP="//div[@class='CollapeDet expanded']/table/thead/tr/th[text()='Approved']";
						public static String elePrINTEDBY_XP="//div[@class='CollapeDet expanded']/table/thead/tr/th[text()='Printed By']";
						public static String eleIssuesave_XP="//input[@value='Save']";
						public static String eleIssueComplete_XP="//input[@id='btnComplete']";
						
						public static String eleHeadercontrolprint_XP="//span[text()='CONTROLLED PRINT']";
						public static String eleCOntrolprint_XP="//h1[text()='Prints']";
						public static String eleControltitleID_XP="//div[@class='t-grid t-widget wrapperanciissue']/table/thead/tr/th[5][text()='Title & ID']";
						public static String elecontrolprintsummary_XP="//div[@class='t-grid t-widget wrapperanciissue']/table/thead/tr/th[6][text()='Print Summary']";
						public static String elereconSetting_XP="//div[@class='t-grid t-widget wrapperanciissue']/table/thead/tr/th[7][text()='Recon. Setting']";
						public static String elecontrolrecon_XP="//div[@class='t-grid t-widget wrapperanciissue']/table/thead/tr/th[8][text()='Reconciliation']";
						public static String eleReconcilcomment_XP="//div[@class='t-grid t-widget wrapperanciissue']/table/thead/tr/th[9][text()='Reconcile Comments']";
						public static String elecontrolstatus_XP="//div[@class='t-grid t-widget wrapperanciissue']/table/thead/tr/th[10][text()='Status']";
						public static String elecontrolAction_XP="//div[@class='t-grid t-widget wrapperanciissue']/table/thead/tr/th[11][text()='Actions']";
						public static String elecontrolver_XP="//div[@class='t-grid t-widget wrapperanciissue']/table/tbody/tr/td[5]//label[text()='Ver']";
						public static String elecontrolprints_XP="//div[@class='t-grid t-widget wrapperanciissue']/table/tbody/tr/td[6]//label[text()='Prints:']";
						public static String eleConpages_XP="//div[@class='t-grid t-widget wrapperanciissue']/table/tbody/tr/td[6]//label[text()='Pages:']";
						public static String eleDatepicker_XP="//div[@class='t-grid t-widget wrapperanciissue']/table/tbody/tr/td[7]//input[@class='RemoveAllDate']";
						public static String eleDatepickerremove_XP="//div[@class='t-grid t-widget wrapperanciissue']/table/tbody/tr/td[7]//img[@alt='Remove']";
						public static String eledays_XP="//div[@class='t-grid t-widget wrapperanciissue']/table/tbody/tr/td[7]//label[text()='  days']";
						public static String elePaages_XP="//div[@class='t-grid t-widget wrapperanciissue']/table/tbody/tr/td[8]//label[text()='Pages:']";
						public static String elereconcilpages_XP="//div[@class='t-grid t-widget wrapperanciissue']/table/tbody/tr/td[8]//input[@disabled='disabled']";
						public static String elereconcicomplete_XP="//div[@class='t-grid t-widget wrapperanciissue']/table/tbody/tr/td[8]//label[text()=' Complete']";
						public static String elecompletedes_XP="//div[@class='t-grid t-widget wrapperanciissue']/table/tbody/tr/td[8]//input[@disabled='Desabled']";
						public static String eletextarea_XP="//div[@class='t-grid t-widget wrapperanciissue']/table/tbody/tr/td[9]/textarea[@disabled='disabled']";
						public static String elestatusprints_XP="//div[@class='t-grid t-widget wrapperanciissue']/table/tbody/tr/td[10]/label[text()='Print:']";
						public static String elereadytosubmit_XP="//div[@class='t-grid t-widget wrapperanciissue']/table/tbody/tr/td[10]/label[text()='Ready To Submit']";
						public static String elereconc_XP="//div[@class='t-grid t-widget wrapperanciissue']/table/tbody/tr/td[10]/div/label[text()='Recon.:']";
						public static String eleviewdoc_XP="//div[@class='t-grid t-widget wrapperanciissue']/table/tbody/tr/td[11]/img[@alt='View Document']";
						public static String eledeleteoption_XP="//div[@class='t-grid t-widget wrapperanciissue']/table/tbody/tr/td[11]/img[@alt='Delete']";
						public static String eleCollapsexpand_XP="//div[@class='t-grid t-widget wrapperanciissue']/table/tbody/tr/td[12]/span[@class='Collapescss']";
						public static String eleprintno1_XP="//div[@class='CollapeDet expanded']/table/thead/tr/th[1][text()='Print No.']";
						public static String eleprintid2_XP="//div[@class='CollapeDet expanded']/table/thead/tr/th[2][text()='Print Id']";
						public static String elecopies_XP="//div[@class='CollapeDet expanded']/table/thead/tr/th[3][text()='Copies']";
						public static String elerandge_XP="//div[@class='CollapeDet expanded']/table/thead/tr/th[4][text()='Range']";
						public static String elepages2_XP="//div[@class='CollapeDet expanded']/table/thead/tr/th[5][text()='Pages']";
						public static String elereasonprint_XP="//div[@class='CollapeDet expanded']/table/thead/tr/th[6][text()='Reason for Print ']";
						public static String elesubmite_XP="//div[@class='CollapeDet expanded']/table/thead/tr/th[7][text()='Submitted']";
						public static String eleAppro_XP="//div[@class='CollapeDet expanded']/table/thead/tr/th[8][text()='Approved']";
						public static String eleprintby_XP="//div[@class='CollapeDet expanded']/table/thead/tr/th[9][text()='Printed By']";
						public static String elecontrolprintpageclose_XP="//span[text()='Close']";
						public static String elecontrolpagesave_XP="//input[@id='btnSubmit']";
						public static String elesbmit_XP="//input[@id='btnSubmitAllDocument']";
						public static String elesubmit_XP="//input[@id='btnSUBMITApproval']";
						public static String eleprinyt_XP="//input[@value='PRINT']";
						public static String eleFINISH_XP="//input[@value='FINISH']";
						public static String eleCLOSE_XP="//input[@value='CLOSE']";
						
						public static String elesubmitdocumentmainheader_XP="//span[text()='Submit Documents']";
						public static String eleheader_XP="//h1[text()='Submit Document']";
						public static String eleAllselectedcheckbox_XP="//table[@id='tblSubmitAnciIssue']/thead/tr/th[5]";
						public static String elesubtitlrid_XP="//table[@id='tblSubmitAnciIssue']/thead/tr/th[6][text()='Title & ID']";
						public static String eleprintsummary_XP="//table[@id='tblSubmitAnciIssue']/thead/tr/th[7][text()='Print Summary']";
						public static String elepagescopies_XP="//table[@id='tblSubmitAnciIssue']/thead/tr/th[8][text()='Pages & Copies']";
						public static String eleresonforprint_XP="//table[@id='tblSubmitAnciIssue']/thead/tr/th[9][text()='Reason for Print']";
						public static String elestatuus_XP="//table[@id='tblSubmitAnciIssue']/thead/tr/th[10][text()='Status']";
						public static String eledocumentselectcheckbox_XP="//input[@data-parent='chkHeadAll']";
						public static String eleversion_XP="//table[@id='tblSubmitAnciIssue']/tbody/tr/td[6]//label[text()='Ver']";
						public static String elep1_XP="//table[@id='tblSubmitAnciIssue']/tbody/tr/td[7]//label[text()='Prints:']";
						public static String eleradytop_XP="//table[@id='tblSubmitAnciIssue']/tbody/tr/td[10]/label[text()='Ready To Submit']";
						public static String elereason_XP="//table[@id='tblSubmitAnciIssue']/tbody/tr/td[9]/textarea";
						public static String elecancleoption_XP="//input[@value='Cancel']";
						
						public static String eleWorkflowselectedheader_XP="//span[text()='WORKFLOW TO BE SELECTED']";
						public static String eleSubmitdocument_XP="//h1[text()='Submit Document']";
						public static String eletitleheader_XP="//table[@id='tblFinalSubmitAnciIssue']/thead/tr/th[6][text()='Title & ID']";
						public static String eleworkflow_XP="//table[@id='tblFinalSubmitAnciIssue']/thead/tr/th[7][text()='Workflow']";
						public static String eleworkflowdocselect_XP="//table[@id='tblFinalSubmitAnciIssue']/tbody/tr/td[5]/input";
						
						public static String eleworkflowlevel_XP="//table[@id='tblFinalSubmitAnciIssue']/tbody/tr/td[7]//label[text()='1 :']";
						public static String eleControlprintapprover_XP="(//select[@name='ApproverUserIds'])[1]";
						public static String eleControlprintapprover2_XP="(//select[@name='ApproverUserIds'])[2]";
						public static String eleSElect_XP="//input[@value='Select']";
						
						public static String elestep1_XP="(//div[@class='t-widget t-grid'])[3]/table/thead/tr/th/span[text()='Step Name']";
						public static String eleAction1_XP="(//div[@class='t-widget t-grid'])[3]/table/thead/tr/th/span[text()='Action']";
						public static String eleacteddby1_XP="(//div[@class='t-widget t-grid'])[3]/table/thead/tr/th/span[text()='Acted By']";
						public static String eleaccepted1_XP="(//div[@class='t-widget t-grid'])[3]/table/thead/tr/th/span[text()='Accepted On']";
						public static String eleremark1_XP="(//div[@class='t-widget t-grid'])[3]/table/thead/tr/th/span[text()='Remarks']";
						public static String elefile1_XP="(//div[@class='t-widget t-grid'])[3]/table/thead/tr/th/span[text()='File']";
						public static String eleeffecti_XP="(//div[@class='t-widget t-grid'])[3]/table/tbody/tr/td[2][text()='1']";
						public static String eleapproved_XP="(//div[@class='t-widget t-grid'])[3]/table/tbody/tr/td[3][text()='Approved']";
//						(//div[@class='t-widget t-grid'])[3]/table/tbody/tr/td[4][text()='Approver']
								public static String elestep2_XP="(//div[@class='t-widget t-grid'])[3]/table/thead/tr/th/span[text()='Step Name']";
								public static String eleAction2_XP="(//div[@class='t-widget t-grid'])[3]/table/thead/tr/th/span[text()='Action']";
								public static String eleacteddby2_XP="(//div[@class='t-widget t-grid'])[3]/table/thead/tr/th/span[text()='Acted By']";
								public static String eleaccepted2_XP="(//div[@class='t-widget t-grid'])[3]/table/thead/tr/th/span[text()='Accepted On']";
								public static String eleremark2_XP="(//div[@class='t-widget t-grid'])[3]/table/thead/tr/th/span[text()='Remarks']";
								public static String elefile22_XP="(//div[@class='t-widget t-grid'])[3]/table/thead/tr/th/span[text()='File']";
								
						public static String eleControlleds_XP="//a[normalize-space()='Controlled']";
						public static String elePRintS_XP="//h1[text()='Prints']";
						public static String eletitleID_XP="//div[@class='t-grid t-widget wrapperanciissue']/table/thead/tr/th[5]";
						public static String elePrintSummary_XP="//div[@class='t-grid t-widget wrapperanciissue']/table/thead/tr/th[6]";
						public static String eleRecoSetting_XP="//div[@class='t-grid t-widget wrapperanciissue']/table/thead/tr/th[7]";
						public static String eleReconciliationID_XP="//div[@class='t-grid t-widget wrapperanciissue']/table/thead/tr/th[8]";
						public static String eleReconcileComments_XP="//div[@class='t-grid t-widget wrapperanciissue']/table/thead/tr/th[9]";
						public static String eleStatusS_XP="//div[@class='t-grid t-widget wrapperanciissue']/table/thead/tr/th[10]";
						public static String eleActionsH_XP="//div[@class='t-grid t-widget wrapperanciissue']/table/thead/tr/th[11]";
						public static String elePrintss1_XP="//label[text()='Prints:']";
						public static String elePAges_XP="(//label[text()='Pages:'])[1]";
						public static String eleDAys_XP="//label[text()='  days']";
						public static String elepagw_XP="(//label[text()='Pages:'])[2]";
						//div[@class='t-grid t-widget wrapperanciissue']/table/tbody/tr/td[5]/div/div/input[@value='ChroroC52']
						//div[@class='t-grid t-widget wrapperanciissue']/table/tbody/tr/td[5]/div[2]/div/input[@value='C52']
						public static String eleCompletea_XP="//input[@id='btnComplete']";
//						public static String ele_XP="";
//						public static String ele_XP="";
//						public static String ele_XP="";
//						public static String ele_XP="";
//						public static String ele_XP="";
//						public static String ele_XP="";
//						public static String ele_XP="";
//						public static String ele_XP="";
//						public static String ele_XP="";
//						public static String ele_XP="";
//						public static String ele_XP="";


}
