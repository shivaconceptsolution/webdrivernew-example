package scs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hello {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //loose coupling
		driver.get("http://shivaconceptdigital.com/test.html"); // get is the command to open web page
		driver.manage().window().maximize(); // maximize window
		String s = driver.getTitle(); // getTitle is used to get the title
		if(s.length()>0)
		{
			System.out.println(s);
		}
		else
		{
			System.out.println("Title not set");
		}

	}

}
