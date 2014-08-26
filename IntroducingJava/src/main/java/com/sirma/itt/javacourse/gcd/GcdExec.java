package com.sirma.itt.javacourse.gcd;

import static org.junit.Assert.*;

import java.util.Scanner;

import junit.framework.Assert;

import org.junit.Test;

/**
 * 
 * @author ivasilev
 */
public class GcdExec {

	@Test
	public void test() {
		// two numbers input
		System.out.println("Enter two integer numbers:");
		System.out.println("Enter the first number:");
		Scanner input = new Scanner(System.in);
		int number1 = input.nextInt();
		System.out.println("Enter the second number:");
		int number2 = input.nextInt();
		
		//check if number1>number2
		//if not, replace them
		if(number1<number2){
			int temp = 0;
		temp = number2;
		number2 = number1;
		number1 = temp;
		}
		
		GreatestCommonDivider gcd = new GreatestCommonDivider();
		LowestCommonMultiplier lcm = new LowestCommonMultiplier();
		System.out.println("GCD: "+gcd.findGcd(number1, number2));
		System.out.println("LCM: "+lcm.findLCM(number1, number2));
		
	}

}
