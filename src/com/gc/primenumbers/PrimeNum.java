package com.gc.primenumbers;

import java.util.ArrayList;


/**
 * @author allisonfarr
 * 5-20-18 Lab 17
 */
public class PrimeNum {

	public boolean isPrime(Integer num) {

		ArrayList<Integer> numList = new ArrayList<>();

		boolean value = true;
		for (int n = 1; n < 1000000000; n++) {
			for (int i = 2; i < num.intValue(); i++) {
				if (num.intValue() % i == 0) {
					value = false;
					
					break;
				}
			}
			
			numList.add(num);
			numList.get(n);
			System.out.println();
			return true;
		}
		return true;
	}

}
