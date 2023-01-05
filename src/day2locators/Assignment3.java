package day2locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {

	public static void main(String[] args)
	{
      System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      driver.get("https://demo.vtiger.com/vtigercrm/index.php");
      String PageTitle = driver.getTitle();
      System.out.println("PageTitle is " +driver.getTitle());
      System.out.println("Page Validation " +PageTitle.equals("vtiger"));
      WebElement Usernameinput = driver.findElement(By.id("username"));
      Usernameinput.clear();
      WebElement Passwordinput =driver.findElement(By.id("password"));
      Passwordinput.clear();
      Usernameinput.sendKeys("admin");
      Passwordinput.sendKeys("Test@123");
      WebElement Loginbutton = driver.findElement(By.className("button"));
      Loginbutton.click();
      
	}

}
