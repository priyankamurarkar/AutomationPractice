package day3_SycronisationWaits;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActiTime {

	public static void main(String[] args) {
		// setup the required driver executable path using - System.setProperty(String
		// key, String value)
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		// create an instance of required browser driver class
		// example for runtime poly- Inheritance, upcasting & overriding
		WebDriver driver = new ChromeDriver();
		// implicit wait -- Browser instance will get time to wait for element after
		// this
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// enter the required URL
		driver.get("https://demo.actitime.com/login.do");
		System.out.println("Login page title: " + driver.getTitle());
		// type user name as admin ---> 0-30 sec,
		driver.findElement(By.id("username")).sendKeys("admin");
		/* type password as manager */ // 0-30 sec
		driver.findElement(By.name("pwd")).sendKeys("manager");
		/* click on login button, 0-30 sec */
		driver.findElement(By.id("loginButton")).click();
		// create an instance of WebDriverWait
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.titleContains("actiTIME - Enter Time-Track"));
		FluentWait waits= new FluentWait(driver).withTimeout(Duration.ofSeconds(20))
				.pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);
		// implement condition for wait, poling works like 5,10,15 and 20
		wait.until(ExpectedConditions.elementToBeClickable(By.id("logoutLink")));

		System.out.println("Home page title: " + driver.getTitle());
		// click on logout link, 0-30 sec
		driver.findElement(By.id("logoutLink")).click();// it will give NoSuchElemenet Exception, as our automation
														// script speed is not in sync with Application
		// close the browser
		// driver.close();
	}

}