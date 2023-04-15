package scs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://shivaconceptsolution.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("name")).sendKeys("xyz123");
		driver.findElement(By.name("email")).sendKeys("xyz123@gmail.com");
		driver.findElement(By.name("mobile")).sendKeys("112233344444");
		driver.findElement(By.name("massege")).sendKeys("hello world");
		driver.findElement(By.className("btn")).click();
		

	}

}
