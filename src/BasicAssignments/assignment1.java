package BasicAssignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment1 {

	public static void main(String[] args) 
	{
   //set executable path of driver using setproperty
	System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
	//create the instance of webdriver in generic way
	WebDriver driver = new ChromeDriver();
	//get URL using get(string URL)
	driver.get("https://demo.actitime.com/");
	//get title 
	String PageTitle = driver.getTitle();
	System.out.println("Page Title = " +driver.getTitle());
	//get title Length
    String getTitle = driver.getTitle();
	System.out.println("Page Length " + getTitle.length());
	//get titlevalidation
	System.out.println("Page validation " +PageTitle.equals("actiTIME - Login"));
	//get source code
	String Sourcecode = driver.getPageSource();
	System.out.println("Page Source code" +Sourcecode);
	//get source code length
	System.out.println("Page source Length" +Sourcecode.length());
	driver.close();

	}

}
