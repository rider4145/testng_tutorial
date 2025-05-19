# testng_tutorial
**Testng learning codes and instructions**


Testng Tutorial: Testng is a testing framework
-> Installation: 
	Go to Eclipse->click on Help button->click Eclipse MarketPlace
	Search for testng-> click install-> After complete installaton-> Restart the eclipse
	
-> Verify the testng installed or not:
   click window-> click prefences-> search testng(if available testng is installed)
	
-> The java project runs on java complier using the public static void main method
-> if user incoporate the testng framework and testng library in the project, Testng will work as complier

-> @Test is one of the annotations in the testng library. 
-> we can trigger multiple testcase under single class by usinng @Test annotation

-> To create Testng Xml file for project:
	right click on project-> click testNg-> convert to testng-> complete the steps by clicking ok button
	Testng XML file is used to run defined multiple class by a single testng run compliation
	In testng we can restrict what are the classes has to be executed
	
-> XML hirerachy:  Test suite-> Test folder(module)-> Testcase
	
-> Testmodule is nothing but different modules in a project (Appt, Scan, community, VC etc.,)

-> Collection of test folders inside a XMl file is called as testsuite
-> Inside test folders we have testcase class which contains multiple testcases in it

-> Include or exclude specific method inside a class and execute using xml file:
	1. Syntax to exclude the specific TC:- To remove the methods from test execution
	<test name="Car loan">
	    <classes>
	      <class name="test.Day_3">					
	      	<methods>										// define the methods tag to include or exclude the specific testcase
	      	<exclude name="mobilelogincarloan"></exclude>	//exclude tag and pass the method name
	      	</methods>
	      </class>
	    </classes>
	  </test>
	  	
	2. Syntax to include specific TC(method):- To Add methods to execute
  	<test name="Car loan">
    <classes>
      <class name="test.Day_3">
      	<methods>
      	<include name="loginapicarloan"></include>		//include tag and pass the method name
      	</methods>
      </class>
    </classes>
  	</test>
 
	3. To exclude any test method which starts with Mobile keyword:-
 	<methods>
	     <exclude name="mobile.*"></exclude>	//exclude tag and pass keyword name with .* in it
	</methods>
	
	4. To run all the class inside a package
	<test name="Personal loan">
 		<package>
 			<package name="test"/>			// provide the package name
 		</package>
  	</test>
  	
  	
-> Annotations: All the annotations is defined based on the tags present in XML file.

-> Hirearchy of Annotations:
	@BeforeSuite -> @BeforeTest -> @BeforeGroups-> @BeforeClass -> od -> @Test -> @@BeforeMethAfterMethod -> @AfterClass -> @AfterGroups -> @AfterTest -> @AfterSuite

-> @BeforeTest: Beforetest annotation defined method is executed before all the methods in the test name defined in XML file 
				Ex: there is 2 testfolder(modules) in xml file and @beforetest is defined in one of the method classes of 2nd test folder.    
-> @AfterTest: It will execute the @aftertest method once it executes all the methods in the test name definded in XML file
-> @BeforeSuite: It executes before all the methods in test suite
-> @AfterSuite: It executes after all the methods in test suite is executed
-> @BeforeMethod: It is executed before each test method in the class. 
				  Ex:It can be useful, if we want to delete cookies and cache before each test begin.
-> @AfterMethod: It is same as before method, this after method will be everytime after each test

-> To run only specific testcase(methods) from all the testfolders(modules):
	1. Tag specific method using the groups keyword along with Test annonataion
	Ex: @Test(groups="Smoke")

	2. Update the xml file with group tag to run specific methods from all class
	Ex:<suite name="Loan department">
  	<test name="Smoketest">
 		 <groups>											// include groups before test and classes tag
  			<run>											// use run tag
  				<include name="Smoke"></include>			// use inclulde/exclude tag and provide the name specified for all the test case -> @Test(groups="Smoke")
  			</run>
  		</groups>
   	 <classes>
      <class name="test.Day_1"/>
      <class name="test.Day_2"/>
      <class name="test.Day_3"/>
     </classes>
 	 </test>
		</suite>

-> DependsOnMethods Annotation: used to execute the prerequiste of the another method. Based on the command provided it calls the other method first and execute this method
	Ex: @Test(dependsOnMethods="Weblogincarloan2")			// it will execute for Weblogincarloan2 and then it executes Weblogincarloan1 
		public void Weblogincarloan1()
		{
			System.out.println("car loan web login 1");
		}
		Incase of multiple dependencies
		@Test(dependsOnMethods="Weblogincarloan2","Weblogincarloan3")

-> Parameterizing the data in Testng XML file: It can be delcared any where in the xml file (inside suite/test/class etc.,)
 	xml syntax: <parameter name="URL" value="www.google.com"/>		// URL will store the value www.google.com
 	code syntax: @Parameters({"Link","username","password"})		// to pass multiple parameters
 	code syntax: @Parameters({"Link"});								// to pass single parameter. Refer day_3 java file for reference
 	
 -> Dataprovider: This annotation is used to pass datas to single or multiple methods in a class
 	Refer Day_3 java file for reference
 	
 -> Listeners: 
	1. One of the scenario to use the listeners. When we need to capture the screenshot everytime when the script fails in this case listeners is helpful
	2. Listeners track/listen to execution results continously and if something is failed, it will invoke a particular method. If result is pass, it will 
 	  invoke another method
 	  Refer Listeners class for reference.
 	3. To implement the listeners in testng. There is interface called as ITestListener which has all the methods for this TestNG listeners.
 	4. Xml file has to be updated to call the defined methods in the listeners class files.
 
 -> Run the test cases parallely:
 	Syntax: <suite name="Loan department" parallel="tests" thread-count="2">
 	1. Parallel attribute is used to define at which level it has to run. There are multiple levels we can run the test. 
 		Types of parallels: tests, classes, methods, instances etc.,
 		Syntax for tests: 	<suite name="Loan department" parallel="tests" thread-count="2">
 		Syntax for classes:  <test name="Smoketest" parallel="classes" thread-count="2">
 		
 	2. Thread count attribute is defined to tell how many tests has to be runned parallely. Based on the number the tests will run parallely
 	Refer the testng.xml file for reference
 	 
 	
 	
  
