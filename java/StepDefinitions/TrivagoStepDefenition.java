package StepDefinitions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TrivagoStepDefenition {

	public ChromeDriver driver;

	@Given("go to url")
	public void openUrl() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// System.setProperty("webdriver.chrome.silentOutput", "true");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.get("https://www.trivago.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@And("Type Agra in Destination and select Agra, Uttar Pradesh")
	public void Agra() {
		driver.findElementById("querytext").sendKeys("Agra");
		driver.findElementByXPath("(//span[@class='ssg-title'])[1]").click();
	}

	@And("Choose Jun 15 as check in and Jun 30 as check out")
	public void date() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,150)", "");
		wait.until(ExpectedConditions.elementToBeClickable(
				driver.findElementByXPath("(//time[contains(@class,'cal-day cal-is-selectable')])[4]")));
		WebElement path = driver.findElementByXPath("(//time[contains(@class,'cal-day cal-is-selectable')])[4]");
		js.executeScript("arguments[0].click()", path);
		wait.until(
				ExpectedConditions.elementToBeClickable(driver.findElementByXPath("//time[@datetime='2020-06-30']")));
		WebElement path1 = driver.findElementByXPath("//time[@datetime='2020-06-30']");

		js.executeScript("arguments[0].click()", path1);
	}

	@And("Select Room as Family Room")
	public void room() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		wait.until(ExpectedConditions
				.elementToBeClickable(driver.findElementByXPath("(//span[@class='roomtype-btn__label'])[3]")));
		WebElement element = driver.findElementByXPath("(//span[@class='roomtype-btn__label'])[3]");
		js.executeScript("arguments[0].click()", element);
	}

	@And("Choose Number of Adults 2, Childern 1 and set Child's Age as 4")
	public void age() throws InterruptedException {
		WebElement adults = driver.findElementByXPath("(//select[@class='df-select'])[1]");
		Select selectAdults = new Select(adults);
		selectAdults.selectByVisibleText("2");
		WebElement id = driver.findElementByXPath("(//select[@class='df-select'])[2]");
		Select sel = new Select(id);
		sel.selectByValue("1");
		Thread.sleep(2000);
		WebElement age = driver.findElementByXPath("//select[@class='df-select js-select-child-age']");
		Select ageDrop = new Select(age);
		ageDrop.selectByValue("4");
		Thread.sleep(1000);
	}

	@And("Click Confirm button and click Search")
	public void clickButton() {
		driver.findElementByXPath("//span[text()='Confirm']").click();
		driver.findElementByXPath("//span[text()='Search']").click();
	}

	@And("Select Accommodation type as Hotels only and choose 4 stars")
	public void accomodation() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElementByXPath("(//span[@class='filter-value'])[1]").click();
		driver.findElementByXPath("//div[@class='refinement-row__content']//button[@title='4-star hotels']").click();
		Thread.sleep(1000);
		driver.findElementByXPath("//button[text()='Done']").click();
		Thread.sleep(3000);
	}

	@And("Select Guest rating as Very Good")
	public void rating() throws InterruptedException {
		driver.findElementByXPath("(//span[@class='filter-value'])[2]").click();
		driver.findElementByXPath("//span[text()='Very good']").click();
		Thread.sleep(3000);
	}

	@And("Set Hotel Location as Agra Fort and click Done")
	public void location() throws InterruptedException {
		driver.findElementByXPath("(//span[@class='filter-value'])[3]").click();
		WebElement place = driver.findElementById("pois");
		Select dd = new Select(place);
		dd.selectByVisibleText("Agra Fort");
		driver.findElementByXPath("//button[text()='Done']").click();
		Thread.sleep(2000);
	}

	@And("In more Filters, select Air conditioning, Restaurant and WiFi and click Done")
	public void filters() {
		driver.findElementByXPath("(//span[@class='filter-value'])[4]").click();
		driver.findElementByXPath("//label[text()='Air conditioning']").click();
		driver.findElementByXPath("//label[text()='WiFi']").click();
		driver.findElementByXPath("//button[text()='Show more']").click();
		driver.findElementByXPath("//label[text()='Restaurant']").click();
		driver.findElementByXPath("//button[text()='Done']").click();
	}

	@And("Sort the result as Rating & Recommended")
	public void sortBy() {
		WebElement sortBy = driver.findElementByXPath("//select[@id='mf-select-sortby']");
		Select selectSortBy = new Select(sortBy);
		selectSortBy.selectByVisibleText("Rating & Recommended");
	}

	@And("Print the Hotel name, Rating, Number of Reviews and Click View Deal")
	public void print() throws InterruptedException {
		System.out.println("Hotel Name is : "
				+ driver.findElementByXPath("(//span[@class='item-link name__copytext'])[1]").getText());
		System.out
				.println("Rating is : " + driver.findElementByXPath("(//span[@itemprop='ratingValue'])[1]").getText());
		System.out.println("Number of Reviews is : " + driver
				.findElementByXPath("(//span[contains(text(),'reviews')])[1]").getText().replaceAll("[^0-9]", ""));
		Thread.sleep(2000);
		driver.findElementByXPath("(//span[text()='View Deal'])[1]").click();
	}

	@And("Print the URL of the Page")
	public void printUrl() throws InterruptedException {
		Thread.sleep(3000);
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> ls = new ArrayList<String>(windowHandles);
		driver.switchTo().window(ls.get(2));
		System.out.println("URL of the page is: " + driver.getCurrentUrl());
	}

	@When("Print the Price of the Room and click Book Now")
	public void price() {
		System.out.println("Room Price is: " + driver.findElementByXPath("//div[@class='price']").getText());
		driver.findElementByXPath("//a[text()='BOOK NOW']").click();

	}

	@Then("Close browser")
	public void close() {
		driver.quit();
	}

}
