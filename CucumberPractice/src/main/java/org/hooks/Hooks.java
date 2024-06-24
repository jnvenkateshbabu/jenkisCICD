package org.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	@Before(order=1)
	public void beforescenario()
	{
		System.out.println("Before Scenario 1");
	}
	@After(order=0)
	public void afterscenario1()
	{
		System.out.println("After scenario 1");
	}
	@Before(order=0)
	public void beforescenario1()
	{
		System.out.println("Before Scenario 2");
	}
	@After(order=1)
	public void afterscenario()
	{
		System.out.println("After scenario ");
	}

}
