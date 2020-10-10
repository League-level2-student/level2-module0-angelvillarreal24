package arrays;

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
		int r1Counter = 0;
		int r2Counter = 0;
		while (true) {
			for (int i = 0; i < 2; i++) {
				int routput = randy.nextInt(51);
				robotArray[i].move(routput);
				if (robotArray[i].getY() < 50) {
					robotArray[i].turn(90);
					robotArray[i].setY(50);
				}
				if (robotArray[i].getX() > 500) {
					robotArray[i].turn(90);
					robotArray[i].setX(500);
				}
				if (robotArray[i].getY() > 500) {
					robotArray[i].turn(90);
					robotArray[i].setY(500);
				}
				if (robotArray[1].getX() < 50) {
					robotArray[1].turn(90);
					robotArray[1].setX(50);
					r1Counter++;
				}
				if (robotArray[0].getX() < 50) {
					robotArray[0].turn(90);
					robotArray[0].setX(50);
					r2Counter++;
				}
				if(r2Counter==3) {
					robotArray[0].sparkle();
					JOptionPane.showMessageDialog(null, "We have a winner, robot 1!!");
					System.exit(0);
				}
				if(r1Counter==3) {
					robotArray[1].sparkle();
					JOptionPane.showMessageDialog(null, "We have a winner, robot 2!!");
					System.exit(0);
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
