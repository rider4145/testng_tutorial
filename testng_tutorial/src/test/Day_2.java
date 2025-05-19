package test;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day_2 {

	@AfterTest
	public void Testcase3()						// testcase
	{
		System.out.println("TESTNG 3");
	}
	
	@Test(groups="Smoke")
	public void Testcase4()						
	{
		System.out.println("Testng 4");
	}
	
	@AfterSuite
	public void after_suite()						
	{
		System.out.println("Last come last long");
	}
		
	@BeforeTest 
	public void Testcase6()						
	{
		System.out.println("TESTNG 5");
	}
	
	@Parameters({"Link"})
	@Test
	public void Testcase7(String url)						
	{
		System.out.println("Testng 7 ");
		System.out.println(url);
	}
}
 