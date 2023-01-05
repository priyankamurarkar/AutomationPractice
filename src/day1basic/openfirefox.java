package day1basic;

import org.openqa.selenium.firefox.FirefoxDriver;

public class openfirefox {

	public static void main(String[] args)
	{
      //set executable path of driver using System.setproperty
		System.setProperty("webdriver.gecko.driver",".\\drivers\\geckodriver.exe");
		//create an instance of browser
		FirefoxDriver fdriver =new FirefoxDriver();
	}

}
