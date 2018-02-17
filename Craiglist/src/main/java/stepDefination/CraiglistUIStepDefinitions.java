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


public class CraiglistUIStepDefinitions {
	
	WebDriver driver;
	//WebElement element;
	WebElement element = null;
	
	

@Given("^Log into craigslist site$")
public void log_into_craigslist_site() {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Gene_Regulatary_Backup\\Java GPRSTest\\Selenium_Driver\\chromedriver_win32\\chromedriver.exe");
	driver= new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://sfbay.craigslist.org");
}

@When("^check the title of the page$")
public void check_the_title_of_the_page() {
	
	String actual = driver.getTitle();
	System.out.println(actual);
	
	String expected = "craigslist: SF bay area jobs, apartments, personals, for sale, services, community, and events";
	
	Assert.assertEquals(actual, expected);
	
}


@Then("^Open searches tab$")
public void open_searches_tab() {
}

@Then("^Click edit on toyota search$")
public void click_edit_on_toyota_search() {
	
	driver.findElement(By.xpath("//input[@id='query']")).sendKeys("toyota");
	driver.findElement(By.xpath("//input[@id='query']")).submit();
}

@Then("^Change name to toyota prius$")
public void change_name_to_toyota_prius() {
	
	//elements =(List<WebElement>) driver.findElement(By.xpath("//ul[@class='rows']"));
	List<WebElement> elements  = driver.findElements(By.xpath("//li[@class='result-row']"));
	//		List<WebElement> elements  = driver.findElements(By.tagName("a"));
	
	for(WebElement ele :elements){
		String str = ele.getText();
		System.out.println(str);
	}
	
}

@Then("^Click save$")
public void click_save() {
	
	driver.findElement(By.xpath("//a[contains(text(),'save search')]")).click();
	
}

@Then("^Go to myAccount$")
public void go_to_myAccount() {
	
	driver.findElement(By.xpath("//a[contains(text(),'my account')]")).click();
	
}

@Then("^Verify name was changed$")
public void verify_name_was_changed() {
	
	
}

@Then("^Click delete$")
public void click_delete() {
}

@Then("^Verify search was deleted$")
public void verify_search_was_deleted() {
	
}
	
	/*
	@Given("^user is already in login page$")
	public void user_is_already_in_login_page() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Gene_Regulatary_Backup\\Java GPRSTest\\Selenium_Driver\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.freecrm.com/index.html");
	}

	@When("^Title of the login page is free CRM$")
	public void title_of_the_login_page_is_free_CRM() {
		
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("#1 Free CRM for Any Business: Online Customer Relationship Software", title);
		
	}

	@Then("^User enter username and password$")
	public void user_enter_username_and_password() {
		
		driver.findElement(By.name("username")).sendKeys("naveenk");
		driver.findElement(By.name("password")).sendKeys("test@123");
		
	}

	@Then("^User click the login button$")
	public void user_click_the_login_button() {
		
		WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", loginBtn);
	}

	@Then("^User enter the home page$")
	public void user_enter_the_home_page() {
		String title = driver.getTitle();
		 System.out.println("Home Page title ::"+ title);
//		 Assert.assertEquals("CRMPRO", title);
	}
	
	@Then("^Close the browser Example2$")
	public void close_the_browser() {
		driver.quit();
	}
	
	*/
}
