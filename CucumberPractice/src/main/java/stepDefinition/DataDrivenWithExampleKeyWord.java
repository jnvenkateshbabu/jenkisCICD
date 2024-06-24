package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataDrivenWithExampleKeyWord {
	WebDriver driver;
	@Given("I go to OrangeHRM Live in Chrome")
	public void i_go_to_orange_hrm_live_in_chrome() {
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	@When("I send username {string} and password {string} to the login page")
	public void i_send_username_and_password_to_the_login_page(String userName, String passWord) {
		WebElement enterUserName=driver.findElement(By.name("username"));
		enterUserName.sendKeys(userName);

		WebElement enterPassword=driver.findElement(By.name("password"));
		enterPassword.sendKeys(passWord);
	}
	@When("I enter the submit button")
	public void i_enter_the_submit_button() {
		driver.findElement(By.xpath("//div/button")).click();
	}
	@Then("I gather the current page URL")
	public void i_gather_the_current_page_url() {
		System.out.println(driver.getCurrentUrl());
	}

}
