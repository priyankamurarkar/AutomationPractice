package day3_SycronisationWaits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicFunAss1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.techlistic.com/");
		driver.manage().window().maximize();
		WebElement jc = driver.findElement(By.linkText("JAVA"));
		jc.click();
		String PageTitle = driver.getTitle();
        System.out.println("PageTitle = " +driver.getTitle());
	}

}
