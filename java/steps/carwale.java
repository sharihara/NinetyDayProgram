package steps;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class carwale extends BaseClass
{
	
	
	@Given("click on Used")
	public void clickOnUsed() {
		driver.findElementByXPath("//li[@data-tabs='usedCars']").click();
		
	}
	@And("Select the City as Chennai")
	public void city() throws InterruptedException {
		driver.findElementByXPath("//div[@class='used-cars-search']/input").sendKeys("chennai");
		Thread.sleep(3000);
		driver.findElementByXPath("//li//a[@cityname='chennai,tamilnadu']").click();
		
	}
	
	@And("Select budget min 8L and max 12L")
	public void budget() throws InterruptedException {
		//driver.findElementByXPath("//input[@searchtype='citySearch']").click();
		//driver.findElementByXPath("//div[@class='used-budget-box']/div[@id='minMaxContainer']").click();
		WebElement e =driver.findElementByXPath("//div[@id='minMaxContainer']/span[@id='upDownArrow']");
		//e.click();

Actions builder = new Actions(driver);
builder.moveToElement(e).perform();
		Thread.sleep(3000);
		driver.findElementByXPath("//div[@id='budgetListContainer']//div/input[@id='minInput']").sendKeys("8");
		driver.findElementByXPath("//div[@id='budgetListContainer']//div/input[@id='maxInput']").sendKeys("12");
		driver.findElementByXPath("//div[@id='budgetListContainer']//div/input[@id='maxInput']").sendKeys(Keys.TAB);
		
	}
	
	@And("Click Search")
	public void search() {
		driver.findElementById("btnFindCar").click();
		
	}
	
	@And("Select Cars with Photos")
	public void carwithphotos() throws InterruptedException {
		driver.findElementByXPath("//div[@name='filterbyadditional']//ul/li[1]").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//div[@class='custom-search-box position-rel']/input[@name='search']").sendKeys("Hyundai");
		driver.findElementByXPath("//div[@id='manu-box']//div[@class='list-points-makes ul-makes manufacture-list']/ul/li[@data-manufacture-en='Hyundai']").click();
		WebElement HyundaiEle = driver.findElementByXPath("//span[@class='filterText' and contains(text(),'Hyundai')]");
		JavascriptExecutor js= (JavascriptExecutor)driver;
		int y = HyundaiEle.getLocation().y+200;
		js.executeScript("window.scrollBy(0,"+y+")");
		Thread.sleep(3000);
		driver.findElementByXPath("//span[@class='filterText' and contains(text(),'Hyundai')]").click();
		driver.findElementByXPath("//div[@name='fuel']").click();
		driver.findElementByXPath("//ul/li[@name='Petrol']").click();
		
		/*
		 * WebElement
		 * f=driver.findElementByXPath("//li[@data-manufacture-en='Hyundai']"); Actions
		 * builder = new Actions(driver); builder.moveToElement(f).perform(); f.click();
		 * Thread.sleep(3000);
		 */
	}
	
	
}