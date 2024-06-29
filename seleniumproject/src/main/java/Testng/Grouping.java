package Testng;

import org.testng.annotations.Test;

public class Grouping {
	
	@Test(groups= {"Sanity"})
	void test1() {

		System.out.println("This is method test1");
	}
	
	@Test(groups= {"Regression"})
	void test2() {

		System.out.println("This is method test2");
	}
	
	@Test(groups= {"Sanity"})
	void test3() {

		System.out.println("This is method test3");
	}
	
	@Test(groups= {"Sanity"})
	void test4() {
   
		System.out.println("This is method test4");
	}
	
	@Test(groups= {"Sanity,Regression"})
	void test5() {

		System.out.println("This is method test5");
	}
	
}
