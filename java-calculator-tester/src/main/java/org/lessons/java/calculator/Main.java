package org.lessons.java.calculator;

public class Main {
	public static void main(String[] args) throws Exception {

		Calculator c = new Calculator();
		
		System.out.println(c.add(12, 1));
		System.out.println(c.subtract(8, 5));
		System.out.println(c.divide(25, 5));
		System.out.println(c.multiply(4, 10));
	}
}
