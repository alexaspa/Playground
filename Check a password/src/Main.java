// SPANOU ALEXANDRA


import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Main {
    
    public static void main(String[] args) 
    {
      final JFrame f1=new JFrame();
      JPanel p1=new JPanel();
      
      JLabel l1=new JLabel("New password: ");
      final JTextField jt1= new JTextField(10);
      JButton b1=new JButton("Check password");
      
      p1.add(l1);
      p1.add(jt1);
      p1.add(b1);      
      f1.add(p1);
      
    f1.setSize(250, 100);              
    f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);             
    f1.setLocationRelativeTo(null); 
    f1.setVisible(true);
     
    b1.addActionListener(new ActionListener() { // an path8ei to b1 
 
            public void actionPerformed(ActionEvent e)
            {
              String password=jt1.getText();
              //System.out.println(password);
              f1.dispose();
              check_password(password);
            }             
});   
 }
    
 public static void check_password(String s) 
{    
    try{
        if (s.length()<8) // 1) if the length of the password is at least 8 characters 
            throw new Exception1();         
   }catch(Exception1 e1){}
    try{
	if(!Pattern.compile("[0-9]").matcher(s).find()) // 2) if the password includes at least one numeric digit
	throw new Exception2();
   }catch(Exception2 e2){}
     try{
	if(s.equals(s.toLowerCase())) // 3) if the password includes at least one capital letter (Α-Z)
	throw new Exception3();					
    }catch(Exception3 e3){}
     try{						
	if(!s.matches(".*[" + Pattern.quote("!@#") + "].*")) // 4) if the password includes at least one of the special characters (!, @ και #).
	throw new Exception4();
    }catch(Exception4 e4){}      
} 
}