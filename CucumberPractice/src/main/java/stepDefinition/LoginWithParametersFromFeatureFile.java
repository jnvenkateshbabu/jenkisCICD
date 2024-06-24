package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginWithParametersFromFeatureFile {
	WebDriver driver;
	@Given("Open OrangeHRM Live in a Chrome browser")
	public void open_orange_hrm_live_in_a_chrome_browser() {
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	@When("Send username {string} and password {string} to their respective fields")
	public void send_username_and_password_to_their_respective_fields(String userName, String passWord) {
		WebElement enterUserName=driver.findElement(By.name("username"));
		enterUserName.sendKeys(userName);
		
		WebElement enterPassword=driver.findElement(By.name("password"));
		enterPassword.sendKeys(passWord);
	}
	@When("Click the login")
	public void click_the_login() {
		driver.findElement(By.xpath("//div/button")).click();
	}
	@Then("Get the current page URL")
	public void get_the_current_page_url() {
		System.out.println(driver.getCurrentUrl());
	}

}
