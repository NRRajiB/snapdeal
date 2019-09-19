package org.snapdeal;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SnapDeal{
public static void main(String[] args) throws IOException, NullPointerException {
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
TakesScreenshot tk=(TakesScreenshot)driver;
File src = tk.getScreenshotAs(OutputType.FILE);
File dest=new File("C:\\Users\\Ammu\\eclipse-workspace\\RajibGIT\\src\\screenshot\\Initial.png");
FileUtils.copyFile(src, dest);
System.out.println("Screenshot done");
WebElement cart = driver.findElement(By.xpath("//div[@class='mmm col-xs-6 btn btn-xl btn-theme-secondary rippleWhite buyLink']"));
cart.click();
File src1 = tk.getScreenshotAs(OutputType.FILE);
File dest1=new File("C:\\Users\\Ammu\\eclipse-workspace\\RajibGIT\\src\\screenshot\\first.png");
FileUtils.copyFile(src1, dest1);
System.out.println("Screenshot done");
WebElement checkout = driver.findElement(By.xpath("//a[@class='btn marR5']"));
checkout.click();
File src2 = tk.getScreenshotAs(OutputType.FILE);
File dest2=new File("C:\\Users\\Ammu\\eclipse-workspace\\RajibGIT\\src\\screenshot\\second.png");
FileUtils.copyFile(src2, dest2);
System.out.println("Screenshot done");
WebElement input = driver.findElement(By.id("username"));
input.sendKeys("9095476181");
WebElement ctnclk = driver.findElement(By.id("login-continue"));
ctnclk.click();
File src3 = tk.getScreenshotAs(OutputType.FILE);
File dest3=new File("C:\\Users\\Ammu\\eclipse-workspace\\RajibGIT\\src\\screenshot\\third.png");
FileUtils.copyFile(src3, dest3);
System.out.println("Screenshot done");
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
mobno.sendKeys("9095476181");
WebElement radiobtn = driver.findElement(By.xpath("//span[@class='circle']"));
radiobtn.click();
WebElement submt = driver.findElement(By.id("delivery-modes-continue"));
submt.click();
File src4 = tk.getScreenshotAs(OutputType.FILE);
File dest4=new File("C:\\Users\\Ammu\\eclipse-workspace\\RajibGIT\\src\\screenshot\\fourth.png");
FileUtils.copyFile(src4, dest4);
System.out.println("Screenshot done");
WebElement proceedtopay = driver.findElement(By.id("make-payment"));
proceedtopay.click();
File src5 = tk.getScreenshotAs(OutputType.FILE);
File dest5=new File("C:\\Users\\Ammu\\eclipse-workspace\\RajibGIT\\src\\screenshot\\final.png");
FileUtils.copyFile(src5, dest5);
System.out.println("Screenshot done");


}
}
