package day3_SycronisationWaits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) 
	{
			 System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
			 WebDriver driver = new ChromeDriver();
			 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			 driver.get("https://www.amazon.in/");
			 String PageTitle =driver.getTitle();
			 System.out.println("PageTitle =" +driver.getTitle());
			 System.out.println("Page Validation " +PageTitle.equals("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"));
             String PageURL = driver.getCurrentUrl();
             System.out.println("current URL " +driver.getCurrentUrl());
             System.out.println("current url validation " +PageURL.equals("https://www.amazon.in/"));
			 driver.close();
			 
	}

}
