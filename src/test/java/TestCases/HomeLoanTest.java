package TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import testcases.HomeLoanTest.BaseClass;

public class HomeLoanTest extends BaseClass {



	@Test
	public void test2() {

		System.out.println("Inside home loan test 2");
	}

	@AfterMethod
	public void method2() {

		System.out.println("Inside after method");
	}

	@AfterTest
	public void method4() {

		System.out.println("Inside after test");

	}

}
