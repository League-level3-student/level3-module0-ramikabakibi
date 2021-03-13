package _00_Intro_To_Arrays;

import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _02_RobotRace {
    // 1. make a main method
	JFrame frame=new JFrame();
public static void main(String[] args) {
	
	Robot[] robots=new Robot[5];
	for(int i=0; i<robots.length; i++) {
		robots[i]=new Robot();
		robots[i].setY(300);
		robots[i].setX(i*150+50);
		}
	Random rand=new Random();
	
	boolean stillPlaying=true;
	while(stillPlaying) {
	for(int i=0; i<robots.length; i++) {
		int randomNumber=rand.nextInt(5)+1;
		for(int f=0; f<randomNumber; f++) {
		robots[i].move(30);
		robots[i].turn(30);
		if(robots[i].getY()==300&&robots[i].getX()==i*150+50) {
			stillPlaying=false;
			JOptionPane.showMessageDialog(null, "Robot "+ i+1 +" wins!!");
		}
		}
		}
	}
	}
	}

        // 2. create an array of 5 robots.

        // 3. use a for loop to initialize the robots.

        // 4. make each robot start at the bottom of the screen, side by side, facing up
  
        // 5. use another for loop to iterate through the array and make each robot move
        // a random amount less than 50.
    
        // 6. use a while loop to repeat step 5 until a robot has reached the top of the
        // screen.
    
        // 7. declare that robot the winner and throw it a party!
    
        // 8. try different races with different amounts of robots.
    
        // 9. make the robots race around a circular track.


