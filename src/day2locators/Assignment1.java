package day2locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) 
	{
     System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
     WebDriver driver = new ChromeDriver();
     driver.get("https://demo.actitime.com/");
     String PageTitle = driver.getTitle();
     System.out.println("Page Title is " +driver.getTitle());
     System.out.println("length " +PageTitle.length());
     System.out.println("Page validation " +PageTitle.equals("actiTIME - Login"));
     WebElement Usernameinputfield = driver.findElement(By.id("username"));
     Usernameinputfield.sendKeys("admin");
     WebElement Passwordinputfield = driver.findElement(By.name("pwd"));
     Passwordinputfield.sendKeys("manager");
     WebElement loginbutton = driver.findElement(By.id("loginButton"));
     loginbutton.click();  
     
	}

}
