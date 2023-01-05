package day1basic;

import org.openqa.selenium.chrome.ChromeDriver;

public class openchrome {

	public static void main(String[] args) 
	{
		//set the executable path of driver using Setproperty
      System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
      //create an instance of required browser
      ChromeDriver cdriver =new ChromeDriver();
      
      
	}

}
