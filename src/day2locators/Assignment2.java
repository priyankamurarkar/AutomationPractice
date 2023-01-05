package day2locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment2 {

	public static void main(String[] args) 
	{
    System.setProperty("webdriver.gecko.driver",".\\drivers\\geckodriver.exe");
    WebDriver driver = new FirefoxDriver();
    driver.get("https://demosite.executeautomation.com/Login.html");
    String PageTitle = driver.getTitle();
    System.out.println("Page title " +driver.getTitle());
    System.out.println("Page Length " +PageTitle.length());
    System.out.println("Page validate" +PageTitle.equals("Execute Automation"));
    WebElement Usernameinput = driver.findElement(By.name("UserName"));
    Usernameinput.sendKeys("execution");
    WebElement Passwordinput = driver.findElement(By.name("Password"));
    Passwordinput.sendKeys("admin");
    driver.findElement(By.cssSelector("input[name='Login']")).click();
    
   
	}

}
