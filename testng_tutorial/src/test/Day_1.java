package test;

import org.testng.annotations.Test;

public class Day_1 {

	@Test
	public void Testcase1()						// testcase 1
	{
		System.out.println("TESTNG");
	}
	
	@Test(groups="Smoke")
	public void Testcase2()						// testcase 2
	{
		System.out.println("TESTNG 2");
	}

}
