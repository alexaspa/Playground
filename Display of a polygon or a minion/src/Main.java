// SPANOU ALEXANDRA


import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Main {
    
    public static void main(String[] args) {  
     String[] buttons = { "MINION", "POLYGON"};    
     int returnValue = JOptionPane.showOptionDialog(null, "WHAT DO YOU WANT TO DISPLAY?? ", "",
     JOptionPane.YES_NO_OPTION, 0, null, buttons, buttons[0]);
     System.out.println(returnValue);
      
     if (returnValue==0)
     {
        JFrame jf2=new JFrame();
        jf2.setSize(400, 400);
        jf2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf2.setLocationRelativeTo(null); 
        jf2.setVisible(true);
        Minion m1=new Minion();
        jf2.add(m1);  
     } 
     if (returnValue==1)
     {   
         JFrame jf3=new JFrame();
         int g;
         do{
         String s = (String)JOptionPane.showInputDialog("HOW MANY ANGLES OF POLYGON DO YOU WANT?? ");
         g=Integer.parseInt(s);
         }while(g<3 || g>6);
         
         String[] epiloges= {"RED","YELLOW","BLUE","BLACK","GREEN"};
        
         Object A = JOptionPane.showInputDialog(null, "SELECT COLOR:", "", JOptionPane.PLAIN_MESSAGE,null, epiloges,""); 
         
         if (A=="RED"){
             Polygono p1=new Polygono(g, Color.RED);
             jf3.add(p1);}
         else if (A=="YELLOW"){
             Polygono p1=new Polygono(g, Color.YELLOW);
             jf3.add(p1);}
         else if (A=="BLUE"){
             Polygono p1=new Polygono(g, Color.BLUE);
             jf3.add(p1);}
         else if (A=="BLACK"){
             Polygono p1=new Polygono(g, Color.BLACK);
             jf3.add(p1);}
         else if (A=="GREEN"){
             Polygono p1=new Polygono(g, Color.GREEN);
             jf3.add(p1);}            
                            
             jf3.setSize(500, 500);              
             jf3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);             
             jf3.setLocationRelativeTo(null); 
             jf3.setVisible(true);          
     }
  }
}