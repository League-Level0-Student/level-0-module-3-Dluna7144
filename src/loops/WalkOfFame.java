
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package loops;

import org.jointheleague.graphical.robot.Robot;

public class WalkOfFame {
	public static void main(String[] args) {
		Robot rob = new Robot();
		// 1. Set the X position of the robot so that it starts on the left. 
		// You also need to show the robot to see the result of this line.
		rob.setX(100);
		System.out.println(rob.getY());
		rob.setY(450);
		rob.penDown();
		
		
		// 2. Make the robot draw a star shape. Hint: 144.
				
		// 3. Set the size of the star to 30.
		rob.setSpeed(100);
		rob.turn(25);
		rob.move(30);
		rob.turn(135);		
		rob.move(30);
		rob.turn(144);
		rob.move(30);
		rob.turn(147);
		rob.move(30);
		rob.turn(149);
		rob.move(30);
		rob.hide();
		
		 
		/** THE CHALLENGE: **/
		/*
		 * Make the robot draw a line of stars like this:
		 * http://bit.ly/walk-of-fame
		 
		 * 
		 * Hint: The distance between stars is 50.
		 */

		for (int i = 0; i < 10; i++) {
			 
		}
	}

}
