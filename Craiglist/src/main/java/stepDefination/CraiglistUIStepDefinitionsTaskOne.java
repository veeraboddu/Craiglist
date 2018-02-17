package stepDefination;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class CraiglistUIStepDefinitionsTaskOne {
	
	WebDriver driver;
	//WebElement element;
	WebElement element = null;
	
	
	@Given("^open browser enter craigslist url Taskone$")
	public void open_browser_enter_craigslist_url_Taskone() {
		System.setProperty("webdriver.chrome.driver", "C:\\Gene_Regulatary_Backup\\Java GPRSTest\\Selenium_Driver\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://sfbay.craigslist.org");
		
		System.out.println("Successful open browser enter craigslist url");
	}

	@When("^check home page title Taskone$")
	public void check_home_page_title_Taskone() {
		String actual = driver.getTitle();
		String expected = "craigslist: SF bay area jobs, apartments, personals, for sale, services, community, and events";
		
		System.out.println("Successful check_home_page_title"+actual);
		Assert.assertEquals(actual, expected);
	}

	@Then("^perform search for toyota Taskone$")
	public void perform_search_for_toyota_Taskone(){
		
		driver.findElement(By.xpath("//input[@id='query']")).sendKeys("toyota");
		driver.findElement(By.xpath("//input[@id='query']")).submit();
		
		System.out.println("Successful Enter tex in search field");
	}

	@Then("^print all ad titles from page to console Taskone$")
	public void print_all_ad_titles_from_page_to_console_Taskone() {
		
		List<WebElement> elements  = driver.findElements(By.xpath("//li[@class='result-row']"));
		//		List<WebElement> elements  = driver.findElements(By.tagName("a"));
		
		for(WebElement ele :elements){
			String str = ele.getText();
			System.out.println(str);
		}
	}

	@Then("^Save search by clicking Savesearch button Taskone$")
	public void save_search_by_clicking_Savesearch_button_Taskone() {
		
		driver.findElement(By.xpath("//a[contains(text(),'save search')]")).click();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		System.out.println("Successful clicking_Savesearch_button");
	}

	@Then("^provide logindetails Taskone$")
	public void provide_logindetails_Taskone() {
		
		driver.findElement(By.id("inputEmailHandle")).sendKeys("murthy.boddu@gmail.com");
		driver.findElement(By.id("inputPassword")).sendKeys("Test@123#Test");
		driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
		
		System.out.println("Successful entered logindetails");
	}

	@Then("^verify search was saved Taskone$")
	public void verify_search_was_saved_Taskone() {
		
		System.out.println("Successful entered myaccount page");
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		WebElement element =driver.findElement(By.xpath("//p[contains(text(),'search has been saved.')]"));
		
		System.out.println(element.isDisplayed());
		Assert.assertTrue(element.isDisplayed());
	}

/*	
	@Then("^Close the browser Example2$")
	public void close_the_browser() {
		driver.quit();
	}
	
	*/
}
