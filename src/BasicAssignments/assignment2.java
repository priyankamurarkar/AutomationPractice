package BasicAssignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment2 {

	public static void main(String[] args) 
	{
		//set executable path of driver using setproperty
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		//create the instance of webdriver in generic way
		WebDriver driver = new ChromeDriver();
		//get URL using get(string URL)
		driver.get("https://www.facebook.com");
		String PageTitle = driver.getTitle();
		System.out.println("Page Title" +driver.getTitle());
		System.out.println("Page validation " +PageTitle.equals("Facebook – log in or sign up"));
		driver.close();
		
	
	}

}
