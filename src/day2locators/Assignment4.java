package day2locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

	public static void main(String[] args) 
	{
          System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
          driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
          String PageTitle = driver.getTitle();
          System.out.println("PageTitle " +driver.getTitle());
          WebElement UsernameinputField = driver.findElement(By.name("username"));
          UsernameinputField.sendKeys("Admin");
          WebElement PasswordInputfield = driver.findElement(By.name("password"));
          PasswordInputfield.sendKeys("admin123");
         WebElement LoginButton = driver.findElement(By.tagName("button"));
         LoginButton.click();
         driver.close();
          
	}

}
