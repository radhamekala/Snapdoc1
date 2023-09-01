package SnapDoc.snap;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
    public static ChromeDriver driver;
	public static WebDriverWait wait;
	public static Loginpage LG;
	public static CustomisedMethods CM;
	public static Elements EL;
	public static ExtentReports extent;
	public static ExtentSparkReporter spark;
	public static Justifications JS;
	public static Actions AS;
	public static Select select;
	public static Organization OR;
	
		@BeforeSuite
		public void Setup() {

//		System.setProperty("webdriver.chrome.driver", System.getProperty("C:\\Users\\Admin\\eclipse-workspace\\SnapDoc\\driver") + "\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		 extent = new ExtentReports();
		 spark = new ExtentSparkReporter("target/Spark.html");
		 spark.config().setTheme(Theme.DARK);
		 spark.config().setDocumentTitle("MyReport");
		 extent.attachReporter(spark);
	
		 extent.setSystemInfo("Host Name", "Radhas sree");
		 extent.setSystemInfo("User Name", "Radha");
		 extent.setSystemInfo("Environment", "QA");
		LG= new Loginpage();
		EL=new Elements();
		CM=new CustomisedMethods();
		JS= new Justifications();
		AS = new Actions(driver);
		OR= new Organization();
		
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebDriverManager.chromedriver().setup();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("https://at-snapdoc.azurewebsites.net/");
			driver.manage().window().maximize();
//			String username="admin";
//			String password ="infi";
//			CM.enteringDataintoTextfiledByXpath(EL.eleUserName_XP,username ," UserName");
//			CM.enteringDataintoTextfiledByXpath(EL.elePassword_XP, password,"Password");
//			CM.clickonElementbyXpath(EL.eleLogin_XP, "LOGIN");

}

}
//driver.switchTo().alert().dismiss();
//driver.switchTo().alert().accept();  
//driver.switchTo().alert().getText();
//driver.switchTo().alert().sendKeys("Value"); 