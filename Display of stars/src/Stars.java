// Alexandra Spanou


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Stars extends JPanel 
{
  static int random1,random2,sum;
  static String xrwma;
  static Color c1;
  
  public void paintComponent(Graphics g) 
  {
   
//dhmiourgia polygwnou
   Polygon p = new Polygon( 
   new int[]{0,6,24,9,15,0,-15,-9,-24,-6},
   new int[]{-25,-8,-8,3,20,9,20,3,-8,-8},10);
   
   g.setColor(c1);
    
    for(int x=0;x<sum;x++) //dhmiourgia tyxaiwn x,y
    {
    random1=((int)(200 * Math.random()));
    random2=((int)(45 * Math.random()));
    
    g.translate(random1,random2);
    g.fillPolygon(p);
  
    }
   
  }
  
  public static void main(String[] args) 
  {       String[] epiloges =null; //pinakes epilogwn
          String[] epiloges1 = {"yellow","blue","green","cyan","red"};
          Object A="0";
          A=JOptionPane.showInputDialog(null, "How many stars?", "Random Stars...", JOptionPane.QUESTION_MESSAGE,null, epiloges,""); //emfanish pollaplwn epilogwn
          Object B = JOptionPane.showInputDialog(null, "Select a color for your stars", "Color", JOptionPane.PLAIN_MESSAGE,null, epiloges1,""); //emfanish pollaplwn epilogwn
          System.out.println("--- EPILOGES XRHSTH ---");
          System.out.println("Arithmos asteriwn : "+A+", Xrwma asteriwn: "+B); 
          sum=Integer.parseInt((String) A);
          xrwma=(String) B;
          if(xrwma.equals("red")){c1=Color.RED;} //elegxos epiloghs xrhsth
          if(xrwma.equals("yellow")){c1=Color.YELLOW;}
          if(xrwma.equals("blue")){c1=Color.BLUE;}
          if(xrwma.equals("green")){c1=Color.GREEN;}
          if(xrwma.equals("cyan")){c1=Color.CYAN;}
          
    JFrame frame = new JFrame(); //dhmiourgia parathyrou +settings
    frame.setTitle("Stars");
    frame.setSize(1000, 1000);
    frame.setBackground(Color.BLACK);
    frame.setLocationRelativeTo(null); 
    frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
  
    frame.getContentPane().add(new Stars());//dhmiourgia neou antikeimenou kai prosthhkh sto frame mas 
                                            //gia thn emfanish twn grafikwn p dhmiourghthhkan
    frame.setVisible(true);
  }
}