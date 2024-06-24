package org.tagged.hooks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class TaggedHooksTags  {
	WebDriver driver;
	
	@Before
	public void beforeStart()
	{
		System.out.println("Login Facebook");
	}
	@Before("@logininchrome")
	public void openInChrome()
	{
		System.out.println("Going to open facebook in chrome");
		
		
	}
	@After("@logininchrome")
	public void closeChrome()
	{
		
		System.out.println("Facebook login completed in Chrome");
	}
	@Before("@logininfirefox")
	public void openInFireFox()
	{
		System.out.println("Going to open facebook in firefox");
		
	}
	@After("@logininfirefox")
	public void closeFireFox()
	{
		
		System.out.println("Facebook login completed in Firefox");
	}
	@After
	public void afterComplete()
	{

		System.out.println("Login Operation sucessfully completed");
	}
	

}
