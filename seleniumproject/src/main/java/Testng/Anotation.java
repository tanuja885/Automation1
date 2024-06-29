package Testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Anotation {
@BeforeMethod
	void beforeMethod() {
		System.out.println("This is method beforeMethod");

	}
@AfterMethod
	void afterMethod() {
		System.out.println("This is method afterMethod");

	}
@Test
	void test1() {

		System.out.println("This is method test1");
	}

@BeforeClass
	void beforeClass() {
		System.out.println("This is method beforeClass");

	}
@AfterClass
	void afterClass() {
		System.out.println("This is method afterClass");

	}

@BeforeTest
	void beforeTest() {
		System.out.println("This is method beforeTest");

	}
@AfterTest
	void afterTest() {
		System.out.println("This is method afterTest");

	}
@BeforeSuite
	void beforeSuite() {
		System.out.println("This is method beforeSuite");

	}
@AfterSuite
	void afterSuite() {
		System.out.println("This is method afterSuite");

	}
	
} 


