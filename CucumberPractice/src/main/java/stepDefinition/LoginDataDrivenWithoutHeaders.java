package stepDefinition;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginDataDrivenWithoutHeaders {

WebDriver driver;
	@Given("Open OrangeHRM Live in a Chrome")
	public void open_orange_hrm_live_in_a_chrome() throws InterruptedException {
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	@When("Send username and password to login page")
	public void send_username_and_password_to_login_page(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
	    String username = data.get(0).get("UserName"); // Assuming "Admin" is the header in your DataTable
	    String password = data.get(0).get("Password");
	    

WebElement enterUserName=driver.findElement(By.name("username"));
enterUserName.sendKeys(username);

WebElement enterPassword=driver.findElement(By.name("password"));
enterPassword.sendKeys(password);
	}

	
	@When("Click the submit button")
	public void click_the_submit_button() {
		driver.findElement(By.xpath("//div/button")).click();
	}
	@Then("Retrive the current page URL")
	public void retrive_the_current_page_url() {
		System.out.println(driver.getCurrentUrl());
	}




}
