package JavaProgram1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert2 {
	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ammu\\eclipse-workspace\\Tasks\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://toolsqa.com/handling-alerts-using-selenium-webdriver/");
		WebElement cookie = driver.findElement(By.xpath("//a[text()='ACCEPT']"));
		cookie.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='Prompt Pop up']")).click();
	Alert alt = driver.switchTo().alert();Thread.sleep(5000);
	alt.sendKeys("Yes");
	Thread.sleep(5000);
	alt.accept();

	}

}
