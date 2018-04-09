import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class EvilPolygonsChallenge {
	
	public static void main(String[] args) {
		//1. Create a robot
		Robot polygon = new Robot();

		//2. Set the speed to 100
polygon.setSpeed(100);
		int colorChoice=JOptionPane.showOptionDialog(null, "hello", "title", JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new String[]{"Color 1","Color 2", "Color 3"}, 0);
		
		//3. Set the pen color of the robot according to the value of the colorChoise variable
		polygon.setPenColor(colorChoice, colorChoice, colorChoice);
		//4. Ask the use how many polygons they want to be drawn.
String numberword =		JOptionPane.showInputDialog("How many polygons do you want to be drawn?");
int number;
number = Integer.parseInt(numberword);
		//5. Use the robot to draw the number of polygons the user requested.
for (int i = 0; i < number; i++) {
	

	polygon.move(colorChoice);
	polygon.penDown();
	polygon.move(80);
	polygon.turn(40);
	polygon.move(80);
	polygon.turn(40);
	polygon.move(80);
	polygon.turn(40);
	polygon.move(80);
	polygon.turn(40);
	polygon.move(80);
	polygon.turn(40);
	polygon.move(80);
	polygon.turn(40);
	polygon.move(80);
	polygon.turn(40);
	polygon.move(80);
	polygon.turn(40);
	polygon.move(80);
	polygon.turn(40);
	polygon.move(80);
	polygon.turn(40);
	polygon.move(80);
}
	
		//6. Make it so your shapes do not overlap

		//7. Challenge: add more colors to the Option Dialog.
	}
}

