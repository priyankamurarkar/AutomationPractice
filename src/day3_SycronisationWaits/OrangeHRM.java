package day3_SycronisationWaits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrangeHRM {
	public static void main(String[] args) {
		// set the executable path of WebDriver
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");

		// Create an instance of the Driver
		WebDriver driver = new ChromeDriver();

		// Implicit waits
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// get URL
		driver.get("https://opensource-demo.orangehrmlive.com/");

		// get PageTitle
		String PageTitle = driver.getTitle();
		System.out.println("PageTitle " + driver.getTitle());

		// get PageTitleValidate
		System.out.println("PageValidation " + PageTitle.equals("OrangeHRM"));

		// get SourceLength
		String SourceCode = driver.getPageSource();
		System.out.println("PageValidation " + SourceCode.length());
		System.out.println("PageTitle " + driver.getTitle());
		WebElement UsernameinputField = driver.findElement(By.name("username"));
		UsernameinputField.sendKeys("Admin");
		WebElement PasswordInputfield = driver.findElement(By.name("password"));
		PasswordInputfield.sendKeys("admin123");
		WebElement LoginButton = driver.findElement(By.tagName("button"));
		LoginButton.click();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.titleContains("https://opensource-demo.orangehrmlive.com/"));
		driver.getTitle();
		System.out.println("get title  URL= " + driver.getTitle());

	}

}
