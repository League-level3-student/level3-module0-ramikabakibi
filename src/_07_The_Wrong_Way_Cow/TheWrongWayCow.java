/*
 * https://www.codewars.com/kata/the-wrong-way-cow
 * 
 * Task
 * Given a field of cows find which one is the Wrong-Way Cow and return her
 * position.
 * 
 * Notes:
 * 
 * There are always at least 3 cows in a herd
 * There is only 1 Wrong-Way Cow!
 * Fields are rectangular
 * The cow position is zero-based [col,row] of her head (i.e. the letter c)
 * Examples
 * Ex1
 * 
 * cow.cow.cow.cow.cow
 * cow.cow.cow.cow.cow
 * cow.woc.cow.cow.cow
 * cow.cow.cow.cow.cow
 * Answer: [6,2]
 * 
 * Ex2
 * 
 * c..........
 * o...c......
 * w...o.c....
 * ....w.o....
 * ......w.cow
 * Answer: [8,4]
 * 
 * Notes
 * The test cases will NOT test any situations where there are "imaginary" cows,
 * so your solution does not need to worry about such things!
 * 
 * To explain - Yes, I recognize that there are certain configurations where an
 * "imaginary" cow may appear that in fact is just made of three other "real" cows.
 * 
 * In the following field you can see there are 4 real cows (3 are facing south and
 * 1 is facing north). There are also 2 imaginary cows (facing east and west).
 * 
 * ...w...
 * ..cow..
 * .woco..
 * .ow.c..
 * .c.....
*/

package _07_The_Wrong_Way_Cow;

public class TheWrongWayCow {

    public static int[] findWrongWayCow(final char[][] field) {
        // Fill in the code to return the [col, row] coordinate position of the
        // head (letter 'c') of the wrong way cow!
        int leftRight=0;
        int rightLeft=0;
        int topBottom=0;
        int bottomTop=0;
        int [] leftRightArray;
        int [] rightLeftArray;
        int [] topBottomArray;
        int [] bottomTopArray;
    	for(int i=0; i<field.length;i++) {
    		
    		for(int j=0; j<field[i].length; j++) {
    			if(field[i][j]=='c'&&field[i][j+1]=='o'&&field[i][j+2]=='w') {
    				 leftRight+=1;
    				 leftRightArray=new int [] {i, j};
    			}
    			if(field[i][j]=='w'&&field[i][j+1]=='o'&&field[i][j+2]=='c') {
    				rightLeft+=1;
    				rightLeftArray=new int [] {i, j+2};
    			}
    			if(field[i][j]=='c'&&field[i+1][j]=='o'&&field[i+2][j]=='w') {
    				topBottom+=1;
    				topBottomArray=new int [] {i, j};
    			}
    			if(field[i][j]=='w'&& field[i+1][j]=='o'&&field[i+2][j]=='c') {
    				bottomTop+=1;
    				bottomTopArray=new int [] {i+2, j};
    		}
    			if(leftRight==1 && rightLeft==0 && topBottom==0&& bottomTop==0) {
    				return leftRightArray;
    			}
    			//what this if statement is doing is saying if the left right is 1 and all the others are 0, then the left right is the only way cow is spelled and so it is the
    			//wrong way cow and it returns the array with the c position. Need to do this for all the other variables
    			if(leftRight==1 && rightLeft>=2 || topBottom>=2 || bottomTop>=2) {
    				return leftRightArray;
    			}
    			//what this if statement is doing is saying if left right only appears once, and either of the other ways appears twice or more, the other variable is
    			//not the wrong way cow and the left right is the worng way cow and it returns the array with the c position, need to do this for all the other variables
    	}
        return null;
    }
}
}
//Go through the array and see if there is a cow, facing cow, and if there is I guess keep going through the array to see if there's another cow written the same way.
//If there is a way that cow is written that appears twice, then that is not the wrong way cow, and the next time a cow is written another way, then that is the wrong way cow
//HOWEVER: There can be a not-wrong way cow and then the wrong-way cow and then another not-wrong way cow, so don't count on finding not-wrong way cows twice and the next one is
//the wrong way cow because the wrong way cow could be in between two not-wrong way cows.


//Basically what you need to do is go through the array, and find the main way that "cow is written in it. That could be cow, or woc, or vertically cow or vertically cow flipped"
//Then you need to find the cow in that array that does not match the way that the other cows are written. THERE WILL ONLY BE ONE COW LIKE THIS
//I put flipped beneath the methods that i flipped the numbers of the coordinates in the test line, assert array equals. ask if the first number should be the index that the line is in
//and then the second number is the index of that particular line, because if it is, then the coordinates right now are correct, but if they are flipped then flip the numbers and delete flipped

//GOT THE IDEA: 
//leftRight=cow
//rightLeft=woc
//topBottom=C
//          O
//          W
//bottomTop=W
//          O
//          C

//ALMOST DONE, I JUST NEED MORE IF STATEMENTS BELOW THE ONES I ALREADY HAVE COMPARING THE 4 DIFFERENT VARIABLES AT THE TOP(NOT THE ARRAYS). I need to have if statements 
//saying if one of the variables is 1, and all the other ones are 0, then return the array for that variable(do that for all the variables)I TRIED TO DO IT FOR THE FIRST ONE
// BUT THERE'S AN ERROR, ASK THE TEACHER. After that, we need to compare 