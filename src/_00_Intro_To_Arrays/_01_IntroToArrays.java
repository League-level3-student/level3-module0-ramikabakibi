package _00_Intro_To_Arrays;

import java.util.Random;

public class _01_IntroToArrays {
    public static void main(String[] args) {
        // 1. declare and Initialize an array 5 Strings
    	String [] names=new String[5];
    	names[0]="Bob";
    	names[1]="Joe";
    	names[2]="Rami";
    	names[3]="Jackie";
    	names[4]="Joaquin";
        // 2. print the third element in the array
    		System.out.println(names[2]);
        // 3. set the third element to a different value
    		names[2]="YOOOOOO";
        // 4. print the third element again
    		System.out.println(names[2]);
        // 5. use a for loop to set all the elements in the array to a string
        //    of your choice
    			for(int i=0; i<names.length; i++) {
    				names[i]="Yessir";
    				System.out.println(names[i]);
    			}
        // 6. use a for loop to print all the values in the array
        //    BE SURE TO USE THE ARRAY'S length VARIABLE
    			
        // 7. make an array of 50 integers
    			Integer [] integers=new Integer[50];
        // 8. use a for loop to make every value of the integer array a random
        //    number
    			Random rand=new Random();
    			
    			for(int i=0; i<integers.length; i++) {
    				int randomNumber=rand.nextInt(50);
    				integers[i]=randomNumber;
    				
    				
    			}
        // 9. without printing the entire array, print only the smallest number
        //    on the array
    			int min=integers[0];
    			for(Integer f: integers) {
    				if(integers[f]<min) {
    					min=integers[f];
    				}
    				
    			}
    			System.out.println("The smallest number in the array is "+ min);
        // 10 print the entire array to see if step 8 was correct
    			for(int i: integers) {
    				System.out.println(i);
    			}
        // 11. print the largest number in the array.
    			int max=integers[0];
    			for(Integer i: integers) {
    				if(integers[i]>max) {
    					max=integers[i];
    				}
    			}
    			System.out.println("The largest number in the array is "+ max);
        // 12. print only the last element in the array
    			System.out.println(integers[integers.length-1]);
    }
}
