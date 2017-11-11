package com.test;

import java.text.DecimalFormat;
import java.text.NumberFormat;


import org.testng.annotations.Test;

import com.main.Implementation;

public class testcase extends Implementation{
	
	NumberFormat formatter = new DecimalFormat("#0.00000");

	@Test(priority = 0)
	public void intersection_one() {
		long start = System.nanoTime();
		method_one();
		long end = System.nanoTime();
		System.out.println("\nExecution time of method_one is "+ formatter.format((end - start) / 10000000d) + " seconds" +"\n");
	}

	@Test(priority = 1)
	public void intersection_two() {
		long start1 = System.nanoTime();
		method_two();
		long end1 = System.nanoTime();
		System.out.println("Execution time method_two is " + formatter.format((end1 - start1) / 10000000d) + " seconds"+ "\n");

	}

	@Test(priority = 2)
	public void intersection_three() {
		long start2 = System.nanoTime();
		method_three();
		long end2 = System.nanoTime();
		System.out.println("Execution time method_three is " + formatter.format((end2 - start2) / 10000000d) + " seconds");
	}}
	
	

