package com.sirma.itt.javacourse.arrayprocessing;

import java.util.Scanner;

/**
 * 
 * @author ivasilev
 */
public class ArrayProcessing {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//entering the array
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of elements of the array:");
		int elNumber = input.nextInt();
		int[] myArray = new int[elNumber];
		
		//entering the elements of the array
		for (int i=0; i<myArray.length; i++){
			System.out.println("Enter element "+(i+1)+": ");
			myArray[i] = input.nextInt();
		}
		
		
		// output
		Arrays methodCall = new Arrays();
		System.out.println("The min element is "+methodCall.getMinElement(myArray) );
		System.out.println("The sum of the elements is: "+methodCall.sum(myArray));
		System.out.println("The array elements are: ");
		methodCall.print(myArray);
	}

}
