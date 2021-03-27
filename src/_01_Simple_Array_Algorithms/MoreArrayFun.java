package _01_Simple_Array_Algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MoreArrayFun {
    //1. Create a main method to test the other methods you write.
		public static void main(String[] args) {
			String [] strings=new String [5];
			strings[0]="Bob";
			strings[1]="Yo";
			strings[2]="Hi";
			strings[3]="Helooooo";
			strings[4]="Gday";
			
			//printStrings(strings);
		//printReverse(strings);
			//everyOther(strings);
			randomString(strings);
		}


    //2. Write a method that takes an array of Strings and prints all the Strings in the array.
		static void printStrings(String [] values) {
			for(int i=0; i<values.length; i++) {
				System.out.println(values[i]);
			}
		}


    //3. Write a method that takes an array of Strings and prints all the Strings in the array
    //   in reverse order.
		static void printReverse(String [] things) {
			for(int i=things.length-1; i>=0; i--) {
				System.out.println(things[i]);
			}
		}



    //4. Write a method that takes an array of Strings and prints every other String in the array.
			static void everyOther(String [] yo) {
				for(int i=0; i<yo.length; i+=2) {
					System.out.println(yo[i]);
				}
			}

    //5. Write a method that takes an array of Strings and prints all the Strings in the array
    //   in a completely random order. Almost every run of the program should result in a different order.
			static void randomString(String [] hi) {
				ArrayList <String> list=new ArrayList(Arrays.asList(hi));
				for(int i=list.size(); i>0; i--) {
					Random rand=new Random();
					int randString=rand.nextInt(list.size());
					System.out.println(list.get(randString));
					list.remove(randString);
				}
			}

}
