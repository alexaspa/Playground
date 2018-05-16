//Alexandra Spanou 


import javax.swing.JOptionPane;
public class Main 
{
    public static void main(String[] args) 
    {   String epilogh;
        String[] epiloges1 = {"GoldMember","SilverMember","Member"};
           
           //creation of product type objects 
        Electrical_products pr1=new Electrical_products(11,"Acer","Laptop","Gamers",100,2012,2);
        Clothing_products pr2=new Clothing_products(12,"Adidas","T-shirt","Running stuff",55,"medium","Green");
        Clothing_products pr3=new Clothing_products(13,"Nike","Shoes","Training stuff",85,"40","White");
        
        Products [] ola =  new Products[]{pr1,pr2,pr3}; //This table includes all the types of products 
   
        //Display available products 
        System.out.println(" --- AVAILABLE PRODUCTS --- "); 
        JOptionPane.showMessageDialog(null,pr1.toString()+pr2.toString()+pr3.toString()," *** AVAILABLE PRODUCTS *** ", 1);
        System.out.println(pr1.toString()+pr2.toString()+pr3.toString()); 
        
        
        
        String p=JOptionPane.showInputDialog("How many customers do you want to create?");
        int sum=Integer.parseInt(p);
        Customers [] pelates=new Customers[sum]; //table of customers
        
        
        
        for(int i=0;i<sum;i++)
        {
        JOptionPane.showMessageDialog(null, "DATA INPUT "+(i+1)+" CUSTOMER ","PELATOLOGIO KATASTHMATOS", i);
        Object B = JOptionPane.showInputDialog(null, "Choose a category of a customer", "Customer's Category", JOptionPane.PLAIN_MESSAGE,null, epiloges1,""); //emfanish pollaplwn epilogwn
        String a=JOptionPane.showInputDialog("Name of the customer?");
        String f=JOptionPane.showInputDialog("Customer's account balance?");
        float b = Float.parseFloat(f);
        epilogh=(String)B;
        
        if(epilogh.equals("GoldMember"))
        {
         Goldmembers p1=new Goldmembers((i+1),a,b,"empty",0.15);//creation of a Goldmember customer
         String f1=JOptionPane.showInputDialog("Deposit money to your account balance. ");
         float b1 = Float.parseFloat(f1);
         p1.setYpoloipo(b+b1);//set to ypoloipo
         JOptionPane.showMessageDialog(null,p1.toString(),"Data of Customer", i);
         pelates[i]=p1;//save the customer to the table 
         Products B1 = (Products) JOptionPane.showInputDialog(null, "Choose a product", "Check out", JOptionPane.PLAIN_MESSAGE,null,ola,"");
         
         System.out.println("\n --- STOIXEIA "+(i+1)+ "OY PELATH --- "); 
         System.out.println(p1.toString()); 
         System.out.println("\n The product you bought : "+B1);
         System.out.println("Price of the chosen product : "+B1.gettimh());
         System.out.println("Discount price : "+p1.agora(B1.gettimh()));
         float s=p1.getypoloipo()-p1.agora(B1.gettimh());
         System.out.println("\n Your new account balance is : "+s); //after the check out
         
        }
        
        if(epilogh.equals("SilverMember"))
        {
         Silvermember p1=new Silvermember((i+1),a,b,"empty",0.10);
         String f1=JOptionPane.showInputDialog("Deposit money to your account balance. ");
         float b1 = Float.parseFloat(f1);
         p1.setYpoloipo((b+b1));
         JOptionPane.showMessageDialog(null,p1.toString(),"Data of Customer", i);
         pelates[i]=p1;
         
         Products B1 = (Products) JOptionPane.showInputDialog(null, "Choose a product", "Check out", JOptionPane.PLAIN_MESSAGE,null,ola,"");
         
         System.out.println("\n --- DATA OF CUSTOMER --- ");  
         System.out.println(p1.toString());
         System.out.println("\nYou bought the product : "+B1);
         System.out.println("Price of the chosen product : "+B1.gettimh());
         System.out.println("Discount price : "+p1.agora(B1.gettimh()));
         float s=p1.getypoloipo()-p1.agora(B1.gettimh());
         System.out.println("\nYour new account balance is : "+s);
         
        }
        
         if(epilogh.equals("Member"))
        {
         Member p1=new Member((i+1),a,b,"empty",0);
         String f1=JOptionPane.showInputDialog("Deposit money to your account balance.");
         float b1 = Float.parseFloat(f1);
         p1.setYpoloipo(b+b1);
         JOptionPane.showMessageDialog(null,p1.toString(),"Data of Customer", i);
         pelates[i]=p1;
         
         Products B1 = (Products) JOptionPane.showInputDialog(null, "Choose a Product", "Check out", JOptionPane.PLAIN_MESSAGE,null,ola,"");
         
         System.out.println("\n --- DATA OF CUSTOMER --- ");  
         System.out.println(p1.toString()); 
         System.out.println("\nYou bought the product : "+B1);
         System.out.println("Price of the chosen product : "+B1.gettimh());
         float s=p1.getypoloipo()-B1.gettimh();
         System.out.println("\nYour new account balance is  : "+s);
       
        }
        
        
        }//the end of customer's creation
 
    }
    
}
