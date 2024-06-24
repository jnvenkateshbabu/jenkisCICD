package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {
	
	WebDriver driver;
	
	
	@Given("Access OrangeHRM Live in a Chrome browser")
	public void access_orange_hrm_live_in_a_chrome_browser() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		driver=new ChromeDriver();
	
		
	}
	@Given("Copy the username and password and store them in strings")
	public void copy_the_username_and_password_and_store_them_in_strings() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	}
	@When("Send username and password to their respective fields")
	public void send_username_and_password_to_their_respective_fields() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		WebElement enterUserName=driver.findElement(By.name("username"));
		enterUserName.sendKeys("Admin");
		
		WebElement enterPassword=driver.findElement(By.name("password"));
		enterPassword.sendKeys("admin123");
	}
	@When("Click the login button")
	public void click_the_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		driver.findElement(By.xpath("//div/button")).click();
	}
	@Then("Retrieve the current page URL")
	public void retrieve_the_current_page_url() {
	    System.out.println(driver.getCurrentUrl());
	}
	




}
