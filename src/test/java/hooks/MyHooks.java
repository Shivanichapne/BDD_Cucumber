package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class MyHooks {
	
	@Before()
	public void preCondition()
	{
		System.out.println("Before hook");
	}
	
	@After()
	public void postCondition()
	{
		System.out.println("After hook");
	}
	
	
	
	
//	@Before(order = 1)
//	public void beforeHook1()
//	{
//		System.out.println("Before hook1");
//	}
//	
//	@BeforeStep(order = 1)
//	public void beforeStep1()
//	{
//		System.out.println("Before step1");
//	}
//	
//
//	@AfterStep(order = 1)
//	public void afterStep1()
//	{
//		System.out.println("After step1");
//	}
//	
//	@BeforeStep(order = 2)
//	public void beforeStep2()
//	{
//		System.out.println("Before step2");
//	}
//	
//
//	@AfterStep(order = 2)
//	public void afterStep2()	
//	{
//		System.out.println("After step2");
//	}
//	
//	@Before(order = 2)
//	public void beforeHook2()
//	{
//		System.out.println("Before hook2");
//	}
//	
//	
//	@After(order = 1)
//	public void afterHook1()
//	{
//		System.out.println("After hook1");
//	}
//	
//	@After(order = 2)
//	public void afterHook2()
//	{
//		System.out.println("After hook2");
//	}

}
