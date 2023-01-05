package day3_SycronisationWaits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserOperations {

	public static void main(String[] args)
	{
        System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://demo.automationtesting.in/Register.html");
        driver.manage().window().maximize();
        driver.manage().window().setSize(new Dimension(400,500));
        driver.manage().window().maximize();
        driver.findElement(By.linkText("SwitchTo")).click();
        driver.navigate().back();
        driver.navigate().forward();
		driver.navigate().refresh();
		driver.navigate().to("http://www.google.com");
		driver.close();
		
       
       
       
	}

}
