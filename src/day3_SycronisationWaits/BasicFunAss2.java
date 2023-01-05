package day3_SycronisationWaits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasicFunAss2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		String PageTitle = driver.getTitle();
		System.out.println("PageTitle is " + driver.getTitle());
		WebElement coustomerserv = driver.findElement(By.linkText("Customer Service"));
		coustomerserv.click();

		//WebElement Amzpaylink = driver.findElement(By.className("hm-icon"));
		//Amzpaylink.click();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.titleContains("Help-Amazon Customer Service"));
		driver.getTitle();
		System.out.println("PageValidation" + PageTitle.equals("Help-Amazon Customer Service"));

	}

}
