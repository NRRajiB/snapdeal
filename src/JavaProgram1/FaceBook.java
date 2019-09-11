package JavaProgram1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ammu\\eclipse-workspace\\GIT project\\src\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	
}
}
