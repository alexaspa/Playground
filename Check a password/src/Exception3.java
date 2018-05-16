// SPANOU ALEXANDRA


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Exception3 extends Exception{
     Exception3(){
   JFrame f2 = new JFrame("Exception 3 !!");   
   JPanel p2=new JPanel();
   JLabel l2 = new JLabel("The password does not include at least one capital letter (Α-Z)!!");
   
   p2.add(l2);
   f2.add(p2);
   f2.setSize(500, 180);
   f2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
   f2.setLocationRelativeTo(null); 
   f2.setVisible(true);
    } 
}