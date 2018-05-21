package extra;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class practiceExam {
	public static void main(String[] args) {



// 1. Create a Robot
Robot shapes = new Robot();   

// 2. Ask the user what color they like
String Dude = JOptionPane.showInputDialog("What color do you like?");

String drawstring = JOptionPane.showInputDialog("How many shapes do you want?");
int draw;
draw =Integer.parseInt(drawstring);
for (int i = 0; i < draw; i++) {
	

// 4. Draw the shapes that the user wants
if (Dude.equals("red")) {
	shapes.setPenColor(255, 0, 0);
	}
	shapes.penDown();
	

	shapes.move(80);
	shapes.turn(90);
	shapes.move(80);
	shapes.turn(90);
	shapes.move(80);
	shapes.turn(0);
	shapes.move(80);
	






}
}
}