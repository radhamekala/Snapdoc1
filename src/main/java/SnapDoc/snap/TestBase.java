package SnapDoc.snap;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
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
//	public static FirefoxDriver driver;
	public static WebDriverWait wait;
	public static Loginpage LG;
	public static CustomisedMethods CM;
	public static Elements EL;
	public static ExtentReports extent;
	public static ExtentSparkReporter spark;
	public static Justifications JS;
	public static Actions AS;
	public static Organization OR;
	public static Departments DR;
	public static UserRoles UR;
	public static iniciate IC;
	public static Type TP;
	public static AddUser AU;
	public static User US;
	public static Scenario1 S1;
	public static initiatescenario1 IS;
	public static MultiDocuments MD;
	public static Scenario2 S2;
	public static WithChangeAutoUserbased WCAU;
	public static Type2 T2;
	public static Type3 T3;
	public static Type4 T4;
	public static Type5 T5;
	public static TypeUserBased TUB;
	public static Emailchecking EC;
	public static WithChange2 WC2;
	public static WithChange3 WC3;
	public static WithChange4 WC4;
	public static Withchange6 WC6;
	public static WithChange7 WC7;
	public static Withchange8 WC8;
	public static WithChange9 WC9;
	public static WithChange10 WC10;
	public static WithChange11 WC11;
	public static WithChange12 WC12;
	public static WithChange13 WC13;
	public static Singledocumentwithotnonsignatory SWS;
	public static Resubmission RSub;
	@BeforeSuite
	public void Setup() {

		System.setProperty("webdriver.chrome.driver","./driver1/chromedriver.exe");
	driver = new ChromeDriver();
//		driver = new FirefoxDriver();
		extent = new ExtentReports();
		spark = new ExtentSparkReporter("target/Spark.html");
		spark.config().setTheme(Theme.DARK);
		spark.config().setDocumentTitle("MyReport");
		extent.attachReporter(spark);
		extent.setSystemInfo("Host Name", "Radhas sree");
		extent.setSystemInfo("User Name", "Radha");
		extent.setSystemInfo("Environment", "QA");
		LG = new Loginpage();
		EL = new Elements();
		CM = new CustomisedMethods();
		JS = new Justifications();
		AS = new Actions(driver);
		OR = new Organization();
		DR = new Departments();
		UR = new UserRoles();
		IC = new iniciate();
		TP = new Type();
		TUB= new TypeUserBased ();
		AU = new AddUser();
		US = new User();
		S1= new Scenario1();
		IS=new initiatescenario1();
		MD= new MultiDocuments();
		S2=new Scenario2();
		T2=new Type2 ();
		T3=new Type3();
		T4 = new Type4();
		T5 = new Type5 ();
		EC=new Emailchecking();
		WCAU= new WithChangeAutoUserbased();
		WC2 = new WithChange2();
		WC3 = new WithChange3();	
		WC4 = new WithChange4();	
		WC6=new Withchange6();
		WC7=new WithChange7();
		WC8= new Withchange8();
		WC9=new WithChange9 ();
		WC10 = new WithChange10();
		WC11 = new WithChange11();
		WC12 = new WithChange12();
		WC13 = new WithChange13();
		SWS= new Singledocumentwithotnonsignatory();
		RSub= new Resubmission();
		
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
//		
//		ChromeOptions ops = new ChromeOptions();
//		ops.addArguments("--remote-allow-origins=*");
		
		WebDriverManager.chromedriver().setup();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		WebDriverManager.firefoxdriver().setup();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://13.127.63.63:9984");
//		driver.get("https://at-snapdoc.azurewebsites.net/");
		driver.manage().window().maximize();

	}
}
//restapi security
//driver.switchTo().alert().dismiss();
//driver.switchTo().alert().accept();  
//driver.switchTo().alert().getText();
//driver.switchTo().alert().sendKeys("Value"); 