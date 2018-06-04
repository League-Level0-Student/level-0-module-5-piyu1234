package extra;

import javax.swing.JOptionPane;

public class Rollercoaster {
public static void main(String[] args) {
String Tall = JOptionPane.showInputDialog("How tall are you?");
int Inch = Integer.parseInt(Tall);  
if(Inch>=4)  {
	JOptionPane.showMessageDialog(null, "Enjoy the ride");	
}

else {
	JOptionPane.showMessageDialog(null, "You are not tall enough to ride");
}

}
}
