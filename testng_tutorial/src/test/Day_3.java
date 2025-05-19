package test;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day_3 {

	@BeforeClass //@AfterClass
	public void Before_class()
	{
		System.out.println("class is executed");
	}
	@Test(groups="Smoke")
	public void Weblogincarloan()
	{
		System.out.println("car loan web login");
		Assert.assertTrue(true);
	}
	
//	@BeforeMethod @AfterMethod
	public void mobilelogincarloan()
	{
		System.out.println("Method is executed");
	}
	
	@BeforeTest //@AfterTest
	public void loginapicarloan()
	{
		System.out.println("test is executed");
	}
	
	@BeforeSuite //@AfterSuite
	public void before_suite()
	{
		System.out.println("suite is executed");
	}
	
	@Test(dependsOnMethods="Weblogincarloan2")					
//	Incase of multiple dependencies @Test(dependsOnMethods="Weblogincarloan2","Weblogincarloan3")
	public void Weblogincarloan1()
	{
		System.out.println("car loan web login 1");
	}
	@Parameters({"Link"})									// value is fetched fromxml file to Link here and handle single parameter
	@Test
	public void Weblogincarloan2(String url)				// value is passed to string url from Link set in the parameters above the method
	{
		System.out.println("car loan web login 2");
		System.out.println(url);
	}
	
	@Parameters({"Link","username","password"})				// to handle multiple parameters
	@Test(enabled =true)
	public void Weblogincarloan3(String url,String name, String pass)
	{
		System.out.println("car loan web login 3");
		System.out.println(url);
		System.out.println(name);
		System.out.println(pass);
	}
	
	@DataProvider
	public Object[][] dataprovide()
	{
		//1st combination ->  username & password with good credit history
		//2nd combination ->  username & password with no credit history
		//3rd combination ->  username & password fraud credit history
		Object[][] data= new Object[3][2];
		data[0][0] = "ajith";
		data[0][1] = "ajith@1234";
		data[1][0] = "seoul";
		data[1][1] = "seoul@1234";
		data[2][0] = "jojo";
		data[2][1] = "jojo@1234";
		
		return data;
	}
	
	@Test(dataProvider="dataprovide")
	public void Weblogincarloan4(String user, String pass)
	{
		System.out.println(user);
		System.out.println(pass);
	}
}
