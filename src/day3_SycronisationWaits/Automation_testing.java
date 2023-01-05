package day3_SycronisationWaits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation_testing {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		// create an instance of required browser driver class
		// example for runtime poly- Inheritance, upcasting & overriding
		WebDriver driver = new ChromeDriver();
		// implicit wait -- Browser instance will get time to wait for element after
		// this
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// enter the required URL
		driver.get("https://demo.automationtesting.in/Register.html");
		System.out.println("Login PageTitle " + driver.getTitle());
		String PageTitle = driver.getTitle();
		System.out.println("Lagin Page Validation " + PageTitle.equals("Register"));
		driver.getCurrentUrl();
		System.out.println("Current url " + driver.getCurrentUrl());
		String SourceCode = driver.getPageSource();
		System.out.println("Source Length " + SourceCode.length());

	}

}
