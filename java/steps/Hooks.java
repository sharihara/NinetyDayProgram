package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseClass{
	@Before
	public void precondition() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://carwale.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.switchTo().alert().accept();
		//System.out.println("I clicked ok button da kanna");
	}
	
	@After
	public void postcondition() {
		//driver.close();
	}

}
