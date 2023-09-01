package SnapDoc.snap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Loginpage extends TestBase {
	String username = "ankita.ghosh";
	String password = "demo";

	public void loginsnapdoc2() throws InterruptedException {
		CM.CheckElementDisplayedbyXpath(EL.eleWelcome_XP, "Welcome to Infionic ");
		CM.CheckElementDisplayedbyXpath(EL.elewelcomsnspdoc_XP, "Welcome to Infionic SnapDoc ");
//		CM.CheckElementDisplayedbyXpath(EL.eleHeterologo_XP, "Hetero_logo");
		CM.CheckElementDisplayedbyXpath(EL.eleinfilogo_XP, "infi logo");
		CM.CheckElementDisplayedbyXpath(EL.elesystemimg_XP, "System logo");
		CM.CheckElementDisplayedbyXpath(EL.eleUserName_XP, "UserName");
		CM.CheckElementDisplayedbyXpath(EL.elePassword_XP, "Password");
		CM.CheckElementDisplayedbyXpath(EL.eleForgot_XP, "Forgot Password ?");
		CM.enteringDataintoTextfiledByXpath(EL.eleUserName_XP, username, " UserName");
		CM.enteringDataintoTextfiledByXpath(EL.elePassword_XP, password, "Password");
		CM.clickonElementbyXpath(EL.eleLogin_XP, "LOGIN");
		Thread.sleep(5000);

	}
	
	public void loginsnapdoc() throws InterruptedException {
		
		CM.clickonElementbyXpath(EL.eleLogin_XP, "LOGIN");
CM.clickonElementbyXpath(EL.eleUserNameformError_XP, "UserNameformError");
CM.CheckElementDisplayedbyXpath(EL.eleuserfieldre_XP, "This field is required");
CM.clickonElementbyXpath(EL.elepasswordError_XP, "passwordError");
CM.CheckElementDisplayedbyXpath(EL.elepasswordfilre_XP, "This field is required");
	}
}
