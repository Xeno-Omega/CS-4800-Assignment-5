package tests;

import static org.junit.Assert.*;
import org.junit.Test;

import PrimeCheck.Prime;

public class PrimeTests {
	
	@Test
	public void test2() 
	{
		assertTrue("Checking if Number 2 is Prime", Prime.isPrime(2));
	}
	
	@Test
	public void test3() 
	{
		assertTrue("Checking if Number 3 is Prime", Prime.isPrime(3));
	}
	
	@Test
	public void test4() 
	{
		assertTrue("Checking if Number 4 is Prime", Prime.isPrime(4));
	}
	
	@Test
	public void test5() 
	{
		assertTrue("Checking if Number 5 is Prime", Prime.isPrime(5));
	}
	
	@Test
	public void test6() 
	{
		assertTrue("Checking if Number 6 is Prime", Prime.isPrime(6));
	}
}
