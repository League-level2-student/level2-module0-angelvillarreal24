package arrays;

import java.lang.reflect.Array;
import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] stringArray = new String[5];
		//2. print the third element in the array
		System.out.println(stringArray[2]);
		//3. set the third element to a different value
		stringArray[2] = "bruh";
		//4. print the third element again
		System.out.println(stringArray[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for(int i = 0; i < stringArray.length; i++) {
			System.out.println(stringArray[i]);
		}
		
		//6. make an array of 50 integers
		int[] intArray = new int[50];
		//7. use a for loop to make every value of the integer array a random number
		Random randy = new Random();
		int minimum = 1000;
		int maximum = 0;
		for(int i = 0; i < intArray.length; i++) {
			int d = randy.nextInt(1000);
			intArray[i] = d;
			System.out.println(intArray[i]);
			if(intArray[i] <= minimum) {
				minimum = intArray[i];
			}
			if(intArray[i] >= maximum) {
				maximum = intArray[i];
			}
			
		}
		System.out.println(minimum+" is min");
		System.out.println(maximum+" is max");
		//8. without printing the entire array, print only the smallest number in the array
		
		//9 print the entire array to see if step 8 was correct
		
		//10. print the largest number in the array.
	}
}
