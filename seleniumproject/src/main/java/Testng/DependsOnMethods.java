package Testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethods {

	@Test 
		void Test1() {
		System.out.println("This is test1");
		
	}

	@Test(dependsOnMethods = {"Test1"})//,alwaysRun=true)
	void Test2() {
		System.out.println("This is test2");
	}
	
	@Test(dependsOnMethods = {"Test2"})
	void Test3() {
		Assert.fail();///
		System.out.println("This is test3");
	}
	
	@Test(dependsOnMethods = {"Test3"},alwaysRun=true)
	void Test4() {
		
		System.out.println("This is test4");
	}
	@Test(dependsOnMethods = {"Test4"})
	void Test5() {
		System.out.println("This is test5");
	}
	@Test(dependsOnMethods = {"Test5","Test4"})
	void Test6() {
		System.out.println("This is test6");
	}
	
	@Test(dependsOnMethods = {"Test6"})
	void Test7() {
		System.out.println("This is test7");
	}

}
