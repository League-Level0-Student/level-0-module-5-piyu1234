package extra;

import javax.swing.JOptionPane;

public class Review {
public static void main(String[] args) {
String pihu = "pihu";
String ishita = "ishita";
String ruhi = "ruhi";



String kill = JOptionPane.showInputDialog("Who kiled Ananya?");
if (kill.equals(pihu))    {
JOptionPane.showMessageDialog(null, "Good Job!");	

}
   else { 
	   JOptionPane.showMessageDialog(null, "You are stupid!");	
   }
   


String fight = JOptionPane.showInputDialog("Who fighted Ruhi?");
   if (fight.equals(ishita))    {
   JOptionPane.showMessageDialog(null, "Good Job!");	

   

}
   else {  JOptionPane.showMessageDialog(null, "You are stupid!");	
    
}



String loved = JOptionPane.showInputDialog("Who loved Pihu the most?");
if (loved.equals(ishita))    {
JOptionPane.showMessageDialog(null, "Good Job!");	

}


else {  JOptionPane.showMessageDialog(null, "You are stupid!");	
 
}
}
}
