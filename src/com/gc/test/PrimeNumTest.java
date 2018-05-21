package com.gc.test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.gc.primenumbers.PrimeNum;

class PrimeNumTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test1() {
		PrimeNum obj = new PrimeNum();
		boolean expected = true;
		boolean actual = obj.isPrime(1);
		
		assertEquals(expected, actual);
	}
	
	@Test
	void test2() {
		PrimeNum obj = new PrimeNum();
		boolean expected = true;
		boolean actual = obj.isPrime(2);
		
		assertEquals(expected, actual);
	}
	
	@Test
	void test3() {
		PrimeNum obj = new PrimeNum();
		boolean expected = true;
		boolean actual = obj.isPrime(3);
		
		assertEquals(expected, actual);
	}
	
	@Test
	void test4() {
		PrimeNum obj = new PrimeNum();
		boolean expected = true;
		boolean actual = obj.isPrime(4);
		
		assertEquals(expected, actual);
	}
	
	@Test
	void test5() {
		PrimeNum obj = new PrimeNum();
		boolean expected = true;
		boolean actual = obj.isPrime(5);
		
		assertEquals(expected, actual);
	}
	
	@Test
	void test6() {
		PrimeNum obj = new PrimeNum();
		boolean expected = true;
		boolean actual = obj.isPrime(6);
		
		assertEquals(expected, actual);
	}
	


}
