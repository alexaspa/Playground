// SPANOU ALEXANDRA


import java.awt.Color;
import static java.awt.Color.BLUE;
import static java.awt.Color.YELLOW;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Minion extends JPanel
{    
    public void paintComponent(Graphics g)
    {        
        g.setColor(YELLOW);
        g.fillOval(150,60,110,100); //to kefali 
                  
        g.setColor(YELLOW);
        g.drawRect(150,100,110,100); //to swma
        g.fillRect(150,100,110,100);
               
        g.setColor(YELLOW);
        g.fillOval(150,240,110,100); //to katw meros        
        
        g.setColor(Color.RED);// 3 kuklous gia aristero mati
        g.fillOval(168,100,30,30);
        g.setColor(Color.WHITE);
        g.fillOval(170,102,25,25);
        g.setColor(Color.BLACK);
        g.fillOval(174,107,16,16);
         
        g.setColor(Color.RED);// 3 kuklous gia deksi mati
        g.fillOval(208,100,30,30);
        g.setColor(Color.WHITE);
        g.fillOval(210,102,25,25);
        g.setColor(Color.BLACK);
        g.fillOval(215,107,16,16);
        
        g.setColor(BLUE);
        g.drawRect(150,200,110,100);//th zaketa
        g.fillRect(150,200,110,100);
      
        g.setColor(YELLOW);
        g.drawRect(235,210,25,25);//deksia tseph
        g.fillRect(235,210,25,25);
        
        g.setColor(YELLOW);
        g.drawRect(150,210,25,25);//aristerh tseph
        g.fillRect(150,210,25,25);        
  }
}