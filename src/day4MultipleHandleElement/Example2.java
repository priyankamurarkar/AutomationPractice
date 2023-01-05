package day4MultipleHandleElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		String PageTitle = driver.getTitle();
		System.out.println("Page Title validation " + PageTitle.equals(
				"Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!"));
		List<WebElement> menu = driver.findElements(By.cssSelector("div#container>div>:nth-of-type(2)>div>div>div"));
		System.out.println("Menu size =" +menu.size());
		for (int i = 0; i < menu.size(); i++) {
			menu = driver.findElements(By.cssSelector("div#container>div>:nth-of-type(2)>div>div>div"));
			System.out.println(menu.get(i).getText());
		}

	}

}
