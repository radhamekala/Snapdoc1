package SnapDoc.snap;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class CustomisedMethods extends TestBase{
	public static boolean CheckElementDisplayedbyXpath(String xpath, String elementName) {
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
			boolean element = driver.findElement(By.xpath(xpath)).isDisplayed();
			if (element) {
				System.out.println(elementName + " is Displaying");
			} else {
				System.out.println(elementName + "  -----------is Not Displaying");
			}
			return true;
		} catch (Exception e) {
			System.out.println("not able  to validate Display element");
			System.out.println("Exception : " + e);
			return false;
		}

	}

	public static boolean CheckElementDisplayedbyID(String id, String elementName) {
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(id)));
			boolean element = driver.findElement(By.id(id)).isDisplayed();
			System.out.println(elementName + " is Displaying");
			return true;
		} catch (Exception e) {
			System.out.println("not able validate Display element");
			System.out.println("Exception : " + e);
			return false;
		}

	}

	public static boolean CheckElementDisplayedbyName(String name, String elementName) {
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(name)));
			boolean element = driver.findElement(By.name(name)).isDisplayed();
			if (element) {
				System.out.println(elementName + " is Displaying");
			} else {
				System.out.println(elementName + " is Not Displaying");
			}
			return true;
		} catch (Exception e) {
			System.out.println("not able validate Display element");
			System.out.println("Exception : " + e);
			return false;
		}

	}

	public static boolean CheckElementDisplayedbyClassName(String className, String elementName) {
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(className)));
			boolean element = driver.findElement(By.className(className)).isDisplayed();
			if (element) {
				System.out.println(elementName + " is Displaying");
			} else {
				System.out.println(elementName + " is Not Displaying");
			}
			return true;
		} catch (Exception e) {
			System.out.println("not able validate Display element");
			System.out.println("Exception : " + e);
			return false;
		}

	}

	public static boolean enteringDataintoTextfiledByID(String ID, String DataneedtoEnter, String elementName) {
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(ID)));
			driver.findElement(By.id(ID)).sendKeys(DataneedtoEnter);
			System.out.println("entered data into " + elementName + " : " + DataneedtoEnter);
			return true;
		} catch (Exception e) {
			System.out.println("not able to enter the data into " + elementName);
			System.out.println("Exception : " + e);
			return false;

		}
	}

	public static boolean enteringDataintoTextfiledByName(String name, String DataneedtoEnter, String elementName) {
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(name)));
			driver.findElement(By.name(name)).sendKeys(DataneedtoEnter);
			System.out.println("entered data into " + elementName + " : " + DataneedtoEnter);
			return true;
		} catch (Exception e) {
			System.out.println("not able to enter the data into " + elementName);
			System.out.println("Exception : " + e);
			return false;

		}
	}

	public static boolean enteringDataintoTextfiledByClassName(String className, String DataneedtoEnter,
			String elementName) {
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(className)));
			driver.findElement(By.className(className)).sendKeys(DataneedtoEnter);
			System.out.println("entered data into " + elementName + " : " + DataneedtoEnter);
			return true;
		} catch (Exception e) {
			System.out.println("not able to enter the data into " + elementName);
			System.out.println("Exception : " + e);
			return false;

		}
	}

	public static boolean enteringDataintoTextfiledByXpath(String xpath, String DataneedtoEnter, String elementName) {
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
			driver.findElement(By.xpath(xpath)).sendKeys(DataneedtoEnter);
			System.out.println("entered data into " + elementName + " : " + DataneedtoEnter);
			return true;
		} catch (Exception e) {
			System.out.println(" ------------------------not able to enter the data into " + elementName);
			System.out.println("Exception : " + e);
			return false;

		}
	}

	public static boolean clickonElementbyID(String ID, String elementName) {
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(ID)));
			driver.findElement(By.id(ID)).click();
			System.out.println("clicked on " + elementName + " element");
			return true;
		} catch (Exception e) {
			System.out.println("not able click on " + elementName + " element");
			System.out.println("Exception : " + e);
			return false;

		}
	}

	public static boolean clickonElementbyXpath(String xpath, String elementName) {
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
			driver.findElement(By.xpath(xpath)).click();
			System.out.println("clicked on " + elementName + " element");
			return true;
		} catch (Exception e) {
			System.out.println("--------------------not able click on " + elementName + " element");
			System.out.println("Exception : " + e);
			return false;

		}
	}

	public static boolean CheckEnteredDataisDisplaying(String xpath, String DataneedtoValidate) {
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
			String element = driver.findElement(By.xpath(xpath)).getText();
			if (element.contains(DataneedtoValidate)) {
				System.out.println("the " + DataneedtoValidate + " data is Displaying");
			} else {
				System.out.println("The " + DataneedtoValidate + " data is not Displaying");
			}
			return true;
		} catch (Exception e) {
			System.out.println("not able validate " + DataneedtoValidate);
			System.out.println("Exception : " + e);
			return false;
		}
	}

	public static boolean selectValueinDropdownByVisualtextbyID(String ID, String valuetoSelect, String fieldName) {
		try {
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id(ID)));
			Select select = new Select(driver.findElement(By.id(ID)));
			select.selectByVisibleText(valuetoSelect);
			System.out.println("Selected " + valuetoSelect + " from " + fieldName + " Menu");
			return true;
		} catch (Exception e) {
			System.out.println("not able select " + valuetoSelect + " from " + fieldName + " Menu");
			System.out.println("Exception : " + e);
			return false;
		}

	}
	public static boolean selectValueinDropdownByVisualtextbyXpath(String xpath, String valuetoSelect, String fieldName) {
		try {
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(xpath)));
			Select select = new Select(driver.findElement(By.xpath(xpath)));
			select.selectByVisibleText(valuetoSelect);
			System.out.println("Selected " + valuetoSelect + " from " + fieldName + " Menu");
			return true;
		} catch (Exception e) {
			System.out.println("not able select " + valuetoSelect + " from " + fieldName + " Menu");
			System.out.println("Exception : " + e);
			return false;
		}

	}
	
	public static boolean selectValueinDropdownselectbyvalueXpath(String xpath, String valuetoSelect, String fieldName) {
		try {
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(xpath)));
			Select select = new Select(driver.findElement(By.xpath(xpath)));
			select.selectByValue(valuetoSelect);
			System.out.println("Selected " + valuetoSelect + " from " + fieldName + " Menu");
			return true;
		} catch (Exception e) {
			System.out.println("not able select " + valuetoSelect + " from " + fieldName + " Menu");
			System.out.println("Exception : " + e);
			return false;
		}

	}


	public static boolean scrolltoElementByXpath(String xpath) {
		try {
			WebElement element = driver.findElement(By.xpath(xpath));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
			Thread.sleep(500);
			return true;
		} catch (Exception e) {
			System.out.println("FAIL:: not able to scroll to element");
			return false;

		}
	}}
	
	

	
	
