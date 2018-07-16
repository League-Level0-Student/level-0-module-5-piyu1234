package extra;

import javax.swing.JOptionPane;

public class apples {
	public static void main(String[] args) {
		String Shop = JOptionPane.showInputDialog("How many apples do you have?");
		int Market = Integer.parseInt(Shop);
		if (Market < 5) {
			JOptionPane.showMessageDialog(null, "You need to go shopping!!");
		}
		else { JOptionPane.showMessageDialog(null, "You have too many apples");
	}
}
}