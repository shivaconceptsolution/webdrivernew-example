package scs;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.shivaconceptsolution.com/backupmain/test.html");
		driver.findElement(By.linkText("Click"));
		driver.findElement(By.partialLinkText("shivaconcept")).click();
        driver.navigate().back();
        Thread.sleep(1000);
        for(int i=0;i<2;i++)
        {
        driver.findElement(By.name("chk2")).click();
        }
        	//System.out.println(driver.findElement(By.name("chk2")));
        
       // driver.close();
	}

}
