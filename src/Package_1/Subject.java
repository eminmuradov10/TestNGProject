package Package_1;

import Utils.LoggerUtility;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Subject {
	@BeforeMethod

	public void beforeMethod()

	{

		System.out.println("Before Method...");
		LoggerUtility.log("Before Method");
	}

	@AfterMethod

	public void afterMethod()

	{

		System.out.println("After Method...");
		LoggerUtility.log("After Method");

	}

	// Before any test case, it will run the following first
	@BeforeClass

	public void beforeClass()

	{

		System.out.println("Before Class...");
		LoggerUtility.log("Before Class");

	}

	// Since class is enclosing all test, the following will run after all tests in
	// this class have been executed
	@AfterClass

	public void afterClass()

	{

		System.out.println("After Class...");
		LoggerUtility.log("After Class");

	}

	// Why beforeTest is even before the class?
	// It is because this Subject.java is part of Package_1 package
	// And in the testng2.xml, it is mentioned inside test name="Subject"
	// BeforeTest and AfterTest only affect inside this test so BeforeTest function
	// will run first
	// AfterTest will run last
	@BeforeTest

	public void beforeTest()

	{

		System.out.println("Before Test...");
		LoggerUtility.log("Before Test");

	}

	@AfterTest

	public void afterTest()

	{

		System.out.println("After Test...");
		LoggerUtility.log("After Test");

	}

	// Now it will take into account all tests inside testng2
	// It will run this particular test even before any test on testng
	@BeforeSuite

	public void beforeSuite()

	{

		System.out.println("Before Suite...");
		LoggerUtility.log("Before Suite");

	}

	@AfterSuite

	public void afterSuite()

	{

		System.out.println("After Suite...");
		LoggerUtility.log("After Suite");

	}

	@Test

	public void SubjectLogin()

	{

		System.out.println("Subject Login");// code for testcase
		LoggerUtility.log("Subject Login");
	}

	@Test

	public void SubjectBrokenlinks()

	{

		System.out.println("Subject Broken links"); // code for testcase
		LoggerUtility.log("Subject Broken links");

	}
}
