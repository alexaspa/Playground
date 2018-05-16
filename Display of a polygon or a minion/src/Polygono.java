// SPANOU ALEXANDRA


import java.awt.Color;
import static java.awt.Color.YELLOW;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Polygono extends JPanel {
    private int gwnies;
    private Color colour;
    
   public Polygono(int gwnies, Color colour)
   {
       this.gwnies=gwnies;
       this.colour=colour;
   }     
   
  public void paint(Graphics g) {   
      
    if (this.gwnies==4){ // an kai to tetragwno polugwno den einai aparaithta or8ogwnio, alla to ekana etsi kalou kakou.
        
     g.setColor(this.colour);
     g.drawRect(150,100,110,100); 
     g.fillRect(150,100,110,100);
     
     /* allos tropos
       int xpoints[] = {160, 160, 220, 220};
     int ypoints[] = {170, 220, 220, 170};
     int npoints = this.gwnies;    
     g.setColor(this.colour);
     g.fillPolygon(xpoints, ypoints, npoints);
     g.drawPolygon(xpoints, ypoints, npoints);      
      */
        
    }else if (this.gwnies==5)
    {
    int xpoints[] = {100, 140, 210, 250, 175, 100};
    int ypoints[] = {150, 200,200, 150, 100, 400};        
    int npoints = this.gwnies;
    
    g.setColor(this.colour);
    g.fillPolygon(xpoints, ypoints, npoints);
    g.drawPolygon(xpoints, ypoints, npoints); 
    }
    else{            
    int xpoints[] = {100, 200, 300, 300, 200, 100};
    int ypoints[] = {100, 50,100, 200, 250, 200};        
    int npoints = this.gwnies;
    
    g.setColor(this.colour);
    g.fillPolygon(xpoints, ypoints, npoints);
    g.drawPolygon(xpoints, ypoints, npoints);   
    } 
  }
}