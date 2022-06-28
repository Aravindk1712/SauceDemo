package Amazon_website;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.session.CapabilitiesFilter;

public class Page_1 {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aravind\\eclipse-workspace\\Amazon _project\\Chrome driver actual\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	

	
	
	
	driver.get("https://www.amazon.in/");
	Thread.sleep(3000);
	}
	

}
