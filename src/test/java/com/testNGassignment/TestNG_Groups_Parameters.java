package com.testNGassignment;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG_Groups_Parameters {
  @Test(groups ="Test A")
  @Parameters({"a","b"})
  public void add(int number1, int number2) {
	  
	  System.out.println("parameterclass add"+" "+ (number1+number2));
  }
  
  @Test(groups = {"Test B","Test A"})
  @Parameters({"a","b"})
  public void subtract(int number1, int number2) {
	  
	  System.out.println("parameterclass sub"+" "+ (number1-number2));
  }
  
  @Test(groups = "Test A")
  @Parameters({"a","b"})
  public void multiply(int number1, int number2) {
	  
	  System.out.println("parameterclass mul"+" "+ (number1*number2));
  }
  
  @Test(groups = "Test A")
  @Parameters({"a","b"})
  public void divide(int number1, int number2) {
	  
	  System.out.println("parameterclass div "+" "+ (number1/number2));
  }
}
