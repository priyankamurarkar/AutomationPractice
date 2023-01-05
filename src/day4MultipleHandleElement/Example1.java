package day4MultipleHandleElement;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {

	public static void main(String[] args) {
		// set executable path
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		// Create an instance of browser
		WebDriver driver = new ChromeDriver();
		// maximize the browser
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// enter url
		driver.get("https://demo.automationtesting.in/Register.html");
		// links presents in auto demo site
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Links Counts = " + links.size());
		List<WebElement> Inputfields = driver.findElements(By.tagName("input"));
		System.out.println("InputFields Counts = " + Inputfields.size());
		// using ClassName common
		List<WebElement> ClassObject = driver.findElements(By.className("ng-pristine"));
		System.out.println("Class Name Counts = " + ClassObject.size());
		// inorder to get specific element from the list using get(index)
		ClassObject.get(1).sendKeys("Priyanka");
		ClassObject.get(2).sendKeys("Murarkar");
		ClassObject.get(3).sendKeys("House no 333, New Sukruwari Behind Choudhary Hospital Mahal Nagpur-440032");
		ClassObject.get(4).sendKeys("Priyanka.murarkar132@gmail.com");
		ClassObject.get(5).sendKeys("7276043697");
		

	}

}
