package com.jh.s2.overloading;

public class Count {

	public int hap(int num1, int num2) {
		int sum = num1 + num2;
		System.out.println(sum);
		return sum;
	}

	public void hap(int num1, double num2) {
		double sum = num1 + num2;
		System.out.println(sum);

	}
}