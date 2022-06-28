package Assesment;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sauce_Demo {
	
		public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aravind\\eclipse-workspace\\Amazon _project\\Chrome driver actual\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		

		
		
		
		
	    driver.get("https://www.saucedemo.com/");
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
		
		driver.manage().window().maximize();
		WebElement usName= driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
		usName.click();
		usName.sendKeys("standard_user");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement paWrd= driver.findElement(By.xpath("//*[@id=\"password\"]"));
		paWrd.click();
		paWrd.sendKeys("secret_sauce");
		

		
		WebElement login= driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
		login.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		
		
		
		
		
		
		WebElement  addToCart=driver.findElement(By.xpath("//button[@class='btn btn_primary btn_small btn_inventory']"));
		addToCart.click();
		
		WebElement  aCart2=driver.findElement(By.xpath("//button[@class='btn btn_primary btn_small btn_inventory']"));
		aCart2.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		
		WebElement  aCaButton=driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
		aCaButton.click();
		
		
		WebElement  checkOut=driver.findElement(By.xpath("//button[@class='btn btn_action btn_medium checkout_button']"));
		checkOut.click();
		
		
		WebElement  firstName=driver.findElement(By.xpath("(//input[@class='input_error form_input'])[1]"));
		firstName.click();
		firstName.sendKeys("aravind");
		
		WebElement  lastName=driver.findElement(By.xpath("(//input[@class='input_error form_input'])[2]"));
		lastName.click();
		lastName.sendKeys("kumar");

		WebElement  zipCode=driver.findElement(By.xpath("(//input[@class='input_error form_input'])[3]"));
		zipCode.click();
		zipCode.sendKeys("600100");
		WebElement  continueSubmit=driver.findElement(By.xpath("//input[@class='submit-button btn btn_primary cart_button btn_action']"));
		continueSubmit.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement  finish=driver.findElement(By.xpath("//button[@class='btn btn_action btn_medium cart_button']"));
		finish.click();
		
		WebElement  scrollUp=driver.findElement(By.xpath("//div[@class='app_logo']"));
		scrollUp.click();
		
		
		
		js.executeScript("window.scrollBy(0,1000)");
		
		TakesScreenshot scrShot =(TakesScreenshot) driver;
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		File DestFile=new File("C:\\Users\\Aravind\\eclipse-workspace\\Amazon _project\\screenshot\\sauceDemoScreenshot.png");
		FileUtils.copyFile(SrcFile, DestFile);
		
		
		

}
	}
