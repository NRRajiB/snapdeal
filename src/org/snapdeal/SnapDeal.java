package org.snapdeal;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SnapDeal {
public static void main(String[] args) throws IOException, Exception {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ammu\\eclipse-workspace\\Tasks\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.snapdeal.com");
	WebElement searchBox = driver.findElement(By.id("inputValEnter"));
	searchBox.sendKeys("Redmi note 7 Pro");
	WebElement searchbtn = driver.findElement(By.xpath("//button[@class='searchformButton col-xs-4 rippleGrey']"));
	searchbtn.click();
	WebElement mobile = driver.findElement(By.xpath("//p[text()='Redmi Note 7 Pro ( 128GB , 6 GB ) Black']"));
mobile.click();
Set<String> windowHandles = driver.getWindowHandles();
for (String w1 : windowHandles) {
	System.out.println(w1);
	driver.switchTo().window(w1);
}
WebElement cart = driver.findElement(By.xpath("//div[@class='mmm col-xs-6 btn btn-xl btn-theme-secondary rippleWhite buyLink']"));
cart.click();
WebElement checkout = driver.findElement(By.xpath("//a[@class='btn marR5']"));
checkout.click();
WebElement input = driver.findElement(By.id("username"));
input.sendKeys("9095476181");
WebElement ctnclk = driver.findElement(By.id("login-continue"));
ctnclk.click();
WebElement otp = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
otp.sendKeys("5206");
WebElement pincode = driver.findElement(By.id("zip"));
pincode.sendKeys("6000041");
WebElement name = driver.findElement(By.id("fullName"));
name.sendKeys("Rajalakshmi N R");
WebElement adress = driver.findElement(By.id("address"));
adress.sendKeys("Ladies Hostel");
WebElement landmark = driver.findElement(By.id("nearestLandmark"));
landmark.sendKeys("Behind V3 hyundai showroom");
WebElement city = driver.findElement(By.id("city"));
city.sendKeys("Chennai");
WebElement state = driver.findElement(By.id("state"));
state.sendKeys("TamilNadu");
WebElement mobno = driver.findElement(By.id("mobile"));
mobno.sendKeys("909476181");
WebElement radiobtn = driver.findElement(By.xpath("//span[@class='circle']"));
radiobtn.click();
WebElement submt = driver.findElement(By.id("delivery-modes-continue"));
submt.click();
WebElement proceedtopay = driver.findElement(By.id("make-payment"));
proceedtopay.click();
TakesScreenshot tk=(TakesScreenshot)driver;
File src = tk.getScreenshotAs(OutputType.FILE);
File dest=new File("C:\\Users\\Ammu\\eclipse-workspace\\RajibGIT\\src\\Screenshot-snapdeal");
FileUtils.copyFile(src, dest);
System.out.println("Screenshot done");
}
}
