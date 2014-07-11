package com.sirma.itt.javacourse.gcd;

import java.util.Scanner;

/**
 * 
 * @author ivasilev
 */
public class Gcd {

	static int x = 0;
	static int y = 0;

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("Enter two digits to find out the GCD and LCM: ");
		Scanner input = new Scanner(System.in);
		System.out.println("The first number:");
		x = input.nextInt();
		System.out.println("The second number:");
		y = input.nextInt();

		if (y > x) {
			int temp = 0;
			temp = y;
			y = x;
			x = temp;
		}

		System.out.println("The GCD is: " + findGDC(x, y));
		System.out.println("The LCM is: " + findLCM(x, y));
	}

	public static int findGDC(int x, int y) {
		return 0;

	}

	public static int findLCM(int x, int y) {
		return 0;

	}
}
