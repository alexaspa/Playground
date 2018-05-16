// SPANOU ALEXANDRA


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Exception1 extends Exception 
{
    Exception1(){
   JFrame f2 = new JFrame("Exception 1 !!");   
   JPanel p2=new JPanel();
   JLabel l2 = new JLabel("The length of the password is smaller than 8 characters !! ");
   
   p2.add(l2);
   f2.add(p2);
   f2.setSize(500, 400);
   f2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
   f2.setLocationRelativeTo(null); 
   f2.setVisible(true);
    }
    
}
