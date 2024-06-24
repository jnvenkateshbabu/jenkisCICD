package stepDefinition;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TaggedHookDefinition {
	WebDriver driver;
	@Given("Send user name in chrome")
	public void send_user_name_in_chrome() {
        driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
	    WebElement email=driver.findElement(By.id("email"));
	    email.sendKeys("9994952944");
	}
	@When("Send password in chrome")
	public void send_password_in_chrome() {
		WebElement password=driver.findElement(By.id("pass"));
	    password.sendKeys("b@bu-jn53");
	}
	@Then("enter login in chrome")
	public void enter_login_in_chrome() {
	    WebElement login=driver.findElement(By.name("login"));
	    login.click();
	    driver.close();
	}
	
	
	@Given("Send user name in firefox")
	public void send_user_name_in_firefox() {
		driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		 WebElement email=driver.findElement(By.id("email"));
		    email.sendKeys("9994952944");
	}
	@When("Send password in firefox")
	public void send_password_in_firefox() {
		WebElement password=driver.findElement(By.id("pass"));
	    password.sendKeys("b@bu-jn53");
	}
	@Then("enter login in firefox")
	public void enter_login_in_firefox() {
		 WebElement login=driver.findElement(By.name("login"));
		    login.click();
		    driver.close();
	}

}
