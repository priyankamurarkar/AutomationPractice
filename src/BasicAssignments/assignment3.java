package BasicAssignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment3 {

	public static void main(String[] args) 
	{
    System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.irctc.co.in/");
    String PageTitle = driver.getTitle();
    System.out.println("Page Title is " +driver.getTitle());
    System.out.println("Page url is "  +driver.getCurrentUrl());
    String Pagevalidation = driver.getTitle();
    System.out.println("Page title validation " +PageTitle.equals("IRCTC Next Generation eTicketing System"));
    String SourceCode = driver.getPageSource();
   // System.out.println("Pagesource code " +driver.getPageSource());
   System.out.println("Source code Length " +SourceCode.length());
    driver.close();
	}

}
