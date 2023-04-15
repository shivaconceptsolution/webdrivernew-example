package scs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //loose coupling
		driver.get("http://shivaconceptdigital.com/test.html"); // get is the command to open web page
        driver.findElement(By.name("xyz")).sendKeys("xyz shv f");
        driver.findElement(By.id("xyz")).sendKeys("dgf gd f");
        driver.findElement(By.className("abc")).sendKeys("dgf gd f");
        driver.findElement(By.cssSelector("input[type=email]")).sendKeys("d sydg");
        driver.findElement(By.xpath("//html/body/input[6]")).sendKeys("sjdgsaj");
        driver.findElement(By.name("course")).click();
        Select s = new Select(driver.findElement(By.cssSelector("select[classname=course]")));
        s.selectByIndex(2);
        Select s1 = new Select(driver.findElement(By.cssSelector("select[multiple=true]")));
        s1.selectByIndex(1);
        s1.selectByIndex(2);
        
        
	}

}
