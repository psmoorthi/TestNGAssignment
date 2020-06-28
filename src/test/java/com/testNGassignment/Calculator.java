package com.testNGassignment;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.maveric.core.testng.BaseTest;
import com.maveric.core.utils.reporter.Report;

public class Calculator extends BaseTest{
	
	static int number1 = 4;
	static int number2 = 2;
	
	@Test(groups="Track A")
	public static void add() {
	
		int add = number1 + number2;
		Assert.assertEquals(6, add);
		System.out.println(add);
		Report.log("Test Passed Successfully");
	}
	
	@Test(groups="Track A")
	public static void subtract() {
	
		int sub = number1 - number2;
		Assert.assertEquals(2, sub);
		System.out.println(sub);
		Report.log("Test Passed Successfully");
	}
	
	@Test(groups="Track B")
	public static void multiply() {
	
		int mul = number1 * number2;
		assertEquals(8, mul);
		System.out.println(mul);
		Report.log("Test Passed Successfully");
	}
	
	@Test(groups="Track C")
	public static void divideInt() {
	
		if (number2 == 0) {
			throw new IllegalArgumentException("Cannot divide by 0!");
         	}
		int div = number1/number2;
		assertEquals(2, div);
		System.out.println(div);
		Report.log("Test Passed Successfully");
	}
	
	@Test(groups="Track B")
	public static void divideReal() {
		
		if (number2 == 0) {
			throw new IllegalArgumentException("Cannot divide by 0!");
        	}
		int divR = number1/number2;
		assertEquals(2, divR);
		System.out.println(divR);
		Report.log("Test Passed Successfully");
	}
	
	@Test(groups="Track A")
	public static void exponent() {
		
		double exp = Math.pow(number1, number2);
		assertEquals(16, exp);
		System.out.println(exp);
		Report.log("Test Passed Successfully");
	}
	
	@Test(groups="Track B")
	public static void inverse() {
	
		if (number1 == 0) {
			throw new IllegalArgumentException("Cannot divide by 0!");
			}	
		int exp = 1/number1;
		assertEquals(1/4,exp);
		System.out.println(exp);
		Report.log("Test Passed Successfully");
	}
	
	@Test(groups="Track C")
	public static void modulus() {
	
		if (number2 == 0) {
			throw new IllegalArgumentException("Cannot divide by 0!");
			}
		int mod = number1 % number2;
		assertEquals(0, mod);
		System.out.println(mod);
		Report.log("Test Passed Successfully");
	}
	
	@Test(groups="Track A")
	public static void negate() {
		
		int neg = (-1) * number1;
		Assert.assertEquals(-4, neg);
		System.out.println(neg);
		Report.log("Test Passed Successfully");
	}
	
	@BeforeTest
	public static void main(String[] args) {
		
		add();
		subtract();
		multiply();
		divideInt();
		divideReal();
		exponent();
		inverse();
		modulus();
		negate();
		
	}
}