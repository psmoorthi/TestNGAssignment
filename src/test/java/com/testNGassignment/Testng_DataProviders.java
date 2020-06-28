package com.testNGassignment;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Testng_DataProviders {

	@DataProvider(name="inputs")
	public Object[][] getData() {
		return new Object[][] {
			{4,2},
			{4,6},
			{4,4}
		};
	}
	
	@Test(dataProvider="inputs")
	public void add(int input1, int input2) {
		System.out.println("Dataproviders add"+" " +(input1+input2));
	}
	
	@Test(dataProvider="inputs")
	public void subtract(int input1, int input2) {
		System.out.println("Dataproviders sub"+" "+ (input1-input2));
	}
	
	@Test(dataProvider="inputs")
	public void multiply(int input1, int input2) {
		System.out.println("Dataproviders mult"+" " +(input1*input2));
	}
	
	@Test(dataProvider="inputs")
	public void divide(int input1, int input2) {
		System.out.println("Dataproviders div" +" "+ (input1/input2));
	}
}
