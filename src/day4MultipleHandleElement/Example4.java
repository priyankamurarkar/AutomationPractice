package day4MultipleHandleElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.cricinfo.com");
		List<WebElement> menu = driver
				.findElements(By.cssSelector("div.ds-bg-fill-navbar>div:nth-child(1)>div:nth-child(1)>div:nth-child(2)>div:nth-child(1)>div>a"));
		System.out.println("Menu Count " +menu.size());
		for (int i = 0; i < menu.size(); i++) {
			System.out.println(menu.get(i).getText());

		}
		driver.close();
	}

}
