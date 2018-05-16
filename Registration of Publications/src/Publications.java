//Alexandra Spanou 


import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public abstract class Publications implements ActionListener
{ 
    public static void main(String[] args) 
    { 
        final ArrayList<String> list = new ArrayList<>(); 
        
        Magazine m1=new Magazine("Developing Java programs","Johnson K.","ComputerWorld","3","12");
        Magazine m2=new Magazine("Data structures","Kenson P.","Popular Science","2","23");
        Conference c1=new Conference("Developing Python applications","Walker A.","4th International conference of DPA","10/2/14","Amsterdam","Programming");
        Conference c2=new Conference("The Strategic Marketing Process","Romero N.","3th International conference of SMP","5/4/17","Thessaloniki","Business");
        list.add(m1.toString());
        list.add(m2.toString());
        list.add(c1.toString());
        list.add(c2.toString());
                
        final JFrame frame = new JFrame("Complete the publication you want!!!");
        frame.setLayout(new GridLayout(16,2)); 
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Creation of buttons-labels-textfields
        JLabel label6 =new JLabel(" <<<< PUBLICATION TO MAGAZINE >>>> ");
        JLabel label7 =new JLabel("( Please complete all the fields )");
        final JTextField field1=new JTextField(15);
        final JTextField field2=new JTextField(15);
        final JTextField field3=new JTextField(15);
        final JTextField field4=new JTextField(15);
        final JTextField field5=new JTextField(15);
        final JTextField field115=new JTextField(15);
        field115.setEditable(false);
        
        JLabel label1 =new JLabel(" TITLE : "); 
        JLabel label2 =new JLabel(" AUTHOR : "); 
        JLabel label3 =new JLabel(" MAGAZINE : ");
        JLabel label4 =new JLabel(" VOLUME : "); 
        JLabel label5 =new JLabel(" PAGES : "); 
        JButton button3 = new JButton("REGISTRATION");
        
        //add of buttons-labels-textfields to frame 
        frame.add(label6);frame.add(label7);frame.add(label1);frame.add(field1);
        frame.add(label2);frame.add(field2);frame.add(label3);frame.add(field3);
        frame.add(label4);frame.add(field4);frame.add(label5);frame.add(field5);
        frame.add(button3);frame.add(field115);
        
        JLabel label17 =new JLabel(" <<<< PUBLICATION TO CONFERENCE >>>> ");
        JLabel label18 =new JLabel("( Please complete all the fields )");
        final JTextField field11=new JTextField(10);
        final JTextField field12=new JTextField(10);
        final JTextField field13=new JTextField(10);
        final JTextField field14=new JTextField(10);
        final JTextField field15=new JTextField(10);
        final JTextField field16=new JTextField(10);
        JTextField field17=new JTextField(10);
        
        JLabel label19=new JLabel("Press RETRIEVAL to see all the publications!!!  ");
        JLabel label11 =new JLabel(" TITLE : "); 
        JLabel label12 =new JLabel(" AUTHOR : "); 
        JLabel label13 =new JLabel(" NAME OF CONFERENCE : ");
        JLabel label14 =new JLabel(" DATE : "); 
        JLabel label15 =new JLabel(" LOCATION : "); 
        JLabel label16 =new JLabel(" SUBJECT : "); 
        
        JButton button5 = new JButton("REGISTRATION");
        JButton button6 = new JButton("RETRIEVAL");
        
        field17.setEditable(false);
        label19.setBackground(Color.YELLOW);
        label19.setOpaque(true);
        button6.setBackground(Color.LIGHT_GRAY);        
        
        frame.add(label17);frame.add(label18);frame.add(label11);frame.add(field11);
        frame.add(label12);frame.add(field12);frame.add(label13);frame.add(field13);
        frame.add(label14);frame.add(field14);frame.add(label15);frame.add(field15);
        frame.add(label16);frame.add(field16);
        frame.add(button5);frame.add(field17);frame.add(label19);frame.add(button6);
        
        frame.pack();
        
//BUTTON FOR REGISTRATION TO MAGAZINE
   button3.addActionListener(new ActionListener()             
   {
     public void actionPerformed(ActionEvent e)
       {
       
       Magazine p=new Magazine(field1.getText(),field2.getText(),field3.getText(),field4.getText(),field5.getText());
       list.add(p.toString());
       field1.setText(null);field2.setText(null);field3.setText(null);
       field4.setText(null);field5.setText(null);
       }

   });  

      
//BUTTON FOR REGISTRATION TO CONFERENCE
     button5.addActionListener(new ActionListener() 
   {
     public void actionPerformed(ActionEvent e)
       {
          
       Conference s=new Conference(field11.getText(),field12.getText(),field13.getText(),field14.getText(),field15.getText(),field16.getText());
       list.add(s.toString());
       field11.setText(null);field12.setText(null);field13.setText(null);
       field14.setText(null);field15.setText(null);field16.setText(null);
       }

   });  
     
     
     //BUTTON FOR RETRIEVING THE LIST OF PUBLICATIONS
       button6.addActionListener(new ActionListener() 
   {
     public void actionPerformed(ActionEvent e)
       { //Display the list of publications
        JOptionPane.showMessageDialog(null," --- LIST OF PUBLICATIONS --- \n\n"+list.toString());
        
       }

   });
       }
   
    }
    

