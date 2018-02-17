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


public class CraiglistUIStepDefinitionsTaskTwo {
	
	WebDriver driver;
	//WebElement element;
	WebElement element = null;
	
	@Given("^open browser enter craigslist url Tasktwo$")
	public void open_browser_enter_craigslist_url_Tasktwo() {
		System.setProperty("webdriver.chrome.driver", "C:\\Gene_Regulatary_Backup\\Java GPRSTest\\Selenium_Driver\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://sfbay.craigslist.org");
		
		System.out.println("Successful open browser enter craigslist url");
	}

	@When("^check home page title Tasktwo$")
	public void check_home_page_title_Tasktwo() {
		String actual = driver.getTitle();
		String expected = "craigslist: SF bay area jobs, apartments, personals, for sale, services, community, and events";
		
		System.out.println("Successful check_home_page_title"+actual);
		Assert.assertEquals(actual, expected);
	}

	@Then("^click on my account Tasktwo$")
	public void click_on_my_account_Tasktwo() {
		driver.findElement(By.xpath("//a[contains(text(),'my account')]")).click();
		
		System.out.println("Successful clicked on my account link");
	}

	@Then("^provide logindetails Tasktwo$")
	public void provide_logindetails_Tasktwo() {
		driver.findElement(By.id("inputEmailHandle")).sendKeys("murthy.boddu@gmail.com");
		driver.findElement(By.id("inputPassword")).sendKeys("Test@123#Test");
		driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
		
		System.out.println("Successful entered logindetails");
	}

	@Then("^open Searches tab Tasktwo$")
	public void open_Searches_tab_Tasktwo() {
		driver.findElement(By.xpath("//a[contains(text(),'searches')]")).click();
		
		System.out.println("Successful clicked on searches tab");
	}

	@Then("^click on edit search Tasktwo$")
	public void click_on_edit_search_Tasktwo() {
		
		if(driver.findElement(By.xpath("//button[contains(text(),'edit')]")).isDisplayed())
			driver.findElement(By.xpath("//button[contains(text(),'edit')]")).click();
		
		System.out.println("Successful clicked on edit button");

	}

	@Then("^change name to toyota prius Tasktwo$")
	public void change_name_to_toyota_prius_Tasktwo() {
		driver.findElement(By.xpath("//input[@name='subName']")).sendKeys("toyota prius");
		//driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Then("^click save Tasktwo$")
	public void click_save_Tasktwo() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Then("^verify name Tasktwo$")
	public void verify_name_Tasktwo() {
		
		WebElement element =driver.findElement(By.xpath("//td[contains(text(),'toyota prius')]"));
		//element.isDisplayed();
		System.out.println(element.isDisplayed());
		Assert.assertTrue(element.isDisplayed());
	}

	@Then("^click delete Tasktwo$")
	public void click_delete_Tasktwo() {
		
		if(driver.findElement(By.xpath("//button[contains(text(),'delete')]")).isDisplayed())
			driver.findElement(By.xpath("//button[contains(text(),'delete')]")).click();
		
		System.out.println("Successful clicked on delete button");

	}

	@Then("^search was deleted Tasktwo$")
	public void search_was_deleted_Tasktwo(){
		
		WebElement element =driver.findElement(By.xpath("//p[contains(text(),'was deleted.')]"));
		//element.isDisplayed();
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
