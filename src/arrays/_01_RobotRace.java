package arrays;

import java.lang.reflect.Array;
import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	// 1. make a main method
	public static void main(String[] args) {

		// 2. create an array of 5 robots.
		Robot[] robotArray = new Robot[2];
		// 3. use a for loop to initialize the robots.
		for (int i = 0; i < 2; i++) {
			robotArray[i] = new Robot();
			robotArray[i].setX(50 + i * 100);
			robotArray[i].setY(500);
			robotArray[i].setSpeed(123);
		}
		// 4. make each robot start at the bottom of the screen, side by side, facing up

		// 5. use another for loop to iterate through the array and make each robot move
		// a random amount less than 50.
		Random randy = new Random();
		while (true) {
			for (int i = 0; i < 2; i++) {
				int routput = randy.nextInt(51);
				robotArray[i].move(routput);
				if (robotArray[i].getY() < 100) {
					robotArray[i].turn(90);
					robotArray[i].setY(101);
				} else if (robotArray[i].getX() < 100) {
					robotArray[i].turn(90);
					robotArray[i].setX(101);
				} else if (robotArray[i].getY() < 100) {
					robotArray[i].turn(90);
					robotArray[i].setY(101);
				} else if (robotArray[i].getY() < 100) {
					robotArray[i].turn(90);
					robotArray[i].setY(101);
				}
			}
		}
		// 6. use a while loop to repeat step 5 until a robot has reached the top of the
		// screen.

		// 7. declare that robot the winner and throw it a party!

		// 8. try different races with different amounts of robots.

		// 9. make the robots race around a circular track.
	}

}
