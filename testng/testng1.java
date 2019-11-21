package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testng1 {

	@BeforeSuite
	public void method1(){
		System.out.println("before suite");
	}
	@BeforeTest
	public void method2(){
			System.out.println("before test");
	}
	@BeforeClass
	public void method3(){
			System.out.println("before class");
	}		
	@BeforeMethod
	public void method4(){
		System.out.println("before method");
	}
	@Test
	public void mathod5(){
		System.out.println("test");
	}
	@AfterMethod
	public void method6(){
		System.out.println("after method");
	}
	@AfterClass
	public void method7(){
		System.out.println("afterclass");
	}
	@AfterTest
	public void mathod8(){
		System.out.println("aftertest");
	}
	@AfterSuite
	public void method9(){
		System.out.println("aftersuite");
	}
		
			
		
	}

