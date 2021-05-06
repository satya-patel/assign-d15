package com.Genric_MaxProbTest;

import org.junit.Assert;
import org.junit.Test;

public class GenricFindMaxTest {
	
	
	// testing methods 
	@Test
	public void Test_Generics_OF_Integer() {
		Integer maxValue = new FindMaximum<Integer>(998, 88, 7).findMaximumValue();
		Assert.assertEquals((Integer) 998, maxValue);
	}
	
	@Test
	public void Test_Generics_OF_Float() {
		Float maxValue = new FindMaximum<Float>(88.3f, 56.2f, 7.2f).findMaximumValue();
		Assert.assertEquals((Float) 88.3f, maxValue);
	}
	
	@Test
	public void Test_Generics_OF_String() {
		String maxValue = new FindMaximum<String>("peach", "apple", "banana").findMaximumValue();
		Assert.assertEquals((String)"peach", maxValue);
	}
	
	@Test
	public void Test_Generics_OF_Integer_for_more_parameters() {
		Integer maxValueInteger = FindMaximum.maximumOfObject(97, 67, 58, 854, 73, 44, 35, 85, 53, 32, 414);
		Assert.assertEquals((Integer) 854, maxValueInteger);
	}

	@Test
	public void Test_Generics_OF_Float_for_more_parameters() {
		Float maxValueInteger = FindMaximum.maximumOfObject(259.45f, 134.498f, 556.989f, 698.898f, 901.586f, 983.96f);
		Assert.assertEquals((Float) 983.96f, maxValueInteger);
	}
	
	@Test
	public void Test_Generics_OF_String_for_more_parameters() {
		String maxValueInteger = FindMaximum.maximumOfObject("APPLE", "FB", "SAMSUNG", "MARUTI", "MI", "TATA", "NASA", "REALME");
		Assert.assertEquals((String) "TETA", maxValueInteger);
	}
}