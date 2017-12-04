
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
Robot anon = new Robot();
		//3. ask the user what color they would like the robot to draw
for (int i = 0; i < 10;) {
	
	String input = 	JOptionPane.showInputDialog("What color do you want you shape?");
		//4. use an if/else statement to set the pen color that the user requested
   if(input.equalsIgnoreCase("Red")) {
	   anon.setPenColor(Color.red);
   }
   else if(input.equalsIgnoreCase("Green")) {
	   anon.setPenColor(Color.GREEN);
   }
   else if(input.equalsIgnoreCase("Blue")) {
	   anon.setPenColor(Color.cyan);
   }
   else if(input.equalsIgnoreCase("Pink")) {
	   anon.setPenColor(Color.pink);
   }
   else if(input.equalsIgnoreCase("Purple")) {
	   anon.setPenColor(136, 61, 206);
   }
   else if(input.equalsIgnoreCase("Black")) {
	   anon.setPenColor(Color.black);
   }
   else { anon.setRandomPenColor();
   }

   
        //5. if the user doesn’t enter anything, choose a random color

        //6. put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//2. set the pen width to 10
		anon.setPenWidth(10);
	    //1. make the robot draw a shape (this will take more than one line of code)
anon.penDown();
anon.setSpeed(10);

for (int j = 0; j < 4; j++) {
	anon.turn(90);
	anon.move(100);
}

}}}

