package com.sirma.itt.javacourse.arrayprocessing;
/**
 * 
 * @author ivasilev
 */
public class Arrays {

	/**
	 *
	 * returns the index of the element with minimum value
	 * @param array
	 * @return
	 */
    public int getMinElement(int[] array){
    	int minElIndex= 0;
    	for (int i=1; i< array.length; i++){
    		if (array[minElIndex]> array[i]) minElIndex = i;
    	}	
		return minElIndex+1;	
    } 
    
    /**
     * 
     * returns the sum of all elements in the array
     * @param array
     * @return
     */
    
    public int sum(int[] array){
    	int sumArray=0;
    	for (int i=0; i< array.length; i++){
    		sumArray += array[i];
    	}	
		return sumArray;
    } 
    
    /**
     * 
     * prints the array's elements to screen
     * @param array
     * @return
     */
    public int print(int [] array) {
    	
    	for (int i=0; i< array.length; i++){
    		System.out.println(array[i]+" "); 
    	}	
		
    }
}
