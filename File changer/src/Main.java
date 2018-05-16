// SPANOU ALEXANDRA


import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Main {

   
    public static void main(String[] args) {
        
      JFrame f1=new JFrame("File Changer");
      f1.setLayout(new GridLayout(6,2));     
      
      f1.getContentPane().add(new JLabel(" File path: "));
      final JTextField jt1=new JTextField(40);
      f1.getContentPane().add(jt1);
      
      f1.getContentPane().add(new JLabel(" Find: "));
      final JTextField jt2=new JTextField(40);
      f1.getContentPane().add(jt2);
      
      f1.getContentPane().add(new JLabel(" Replace with: "));
      final JTextField jt3=new JTextField(40);
      f1.getContentPane().add(jt3);
      
      f1.getContentPane().add(new JLabel(" Only replace if the previous word is: "));
      final JTextField jt4=new JTextField(40);
      f1.getContentPane().add(jt4);
      
      
      JButton start=new JButton("Start");
      f1.getContentPane().add(start);
      JButton reset=new JButton("Reset values");
      f1.getContentPane().add(reset);    
   
    f1.setSize(450, 200);              
    f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);             
    f1.setLocationRelativeTo(null);
    f1.setVisible(true);    
    
      start.addActionListener(new ActionListener() { // an path8ei to start 
 
            public void actionPerformed(ActionEvent e)
            {
                String path=(String)jt1.getText();
                String find=jt2.getText();
                String replace_with=jt3.getText();
                String previous=jt4.getText();
                System.out.println(path);
                
               BufferedReader in;
               BufferedWriter out;
try {
in = new BufferedReader(new FileReader(path)); //C:\Users\Alexia\Downloads\file.txt
out = new BufferedWriter(new FileWriter("newfile.txt"));

String str ;
//diabasma grammh-grammh
     	  int counter=0;
          String last="";

         while( (str=in.readLine()) !=null){
         System.out.println( str );
         String[] ale=str.split("(?=[,.()])|\\s+");      		   

          for (int i=1; i<ale.length; i++){            			   

            	   if(ale[0].equals(find)&&previous.equals(""))
                   {
                       ale[0]=replace_with;		 
            	   }
            	   if(previous.equals("")&&ale[i].equals(find))
                   {
            	       ale[i]=replace_with; 
            	       counter++;		
            	   }
            	   if(((ale[i].equals(find)&&(ale[i-1].equals(previous))&&last.equals(""))||ale[0].equals(find)&&last.equals(previous)))
                   {
                       ale[i]=replace_with; 
                       counter++;
            	   }
           	   if(!ale[i].equals(",")&&!ale[i].equals("."))
                   {
            	       out.write(" ");  
            	       out.flush();
                   } 
            	    out.write(ale[i-1]);
            	    out.flush();            			   
                   }
            	    out.newLine();
                    last=ale[ale.length-1];
}
JOptionPane.showMessageDialog(null,counter+" occurences of "+find+" have been replaced!! ");
in.close();
out.close();
}
catch ( FileNotFoundException e2 ) {
System.out.println( "File not found" );
}
catch( IOException e2 ) {
System.out.println( "Read error" );
}
            }             
});  
      
reset.addActionListener(new ActionListener() { // an path8ei to reset
 
            public void actionPerformed(ActionEvent e)
            {
               jt1.setText("");
               jt2.setText("");
               jt3.setText("");
               jt4.setText("");
            
            }});
    }    
}
