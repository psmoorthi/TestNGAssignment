package com.testNGassignment;

import org.testng.annotations.Test;

import com.maveric.core.testng.BaseTest;
import org.testng.Assert;
import org.testng.Reporter;

public class TestNG_AssertionReports extends BaseTest{
  static int number1=25;
  static int number2=10;
  @Test
  public void method1() {

	 int expectedresults=35;
	 int actual=number1+number2;
	 Assert.assertEquals(expectedresults, actual);
	 Reporter.log("Test Passed", true);
  }
  @Test
  public void method2() {
	 int expectedresults=15;
	 int actual=number1-number2;
	 Assert.assertTrue(false);
	 Reporter.log("Failed Testcase", true); 
  }
  @Test
  public void method3() {

		 int expectedresults=33;
		 int actual=number1+number2;
		 Assert.assertNotEquals(expectedresults, actual);
		 Reporter.log("Testcase Passed", true);
	  }
  @Test
  public void method4() {

		 int expectedresults=35;
		 int actual=number1+number2;
		 Assert.assertFalse(false);
		 Reporter.log("Test Passed", true);
	  }
}
