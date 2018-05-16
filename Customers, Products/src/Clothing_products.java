//Alexandra Spanou 


public class Clothing_products extends Products
{
   
    String color,size;
    
    public Clothing_products(int k6,String a6,String b6,String c6,float d6,String e2,String e3)
    {
    
     super(k6,a6,b6,c6,d6);
     this.size=e2;
     this.color=e3;
    
    }
    public String toString() 
    { 
     return super.toString()+" , Product's size : " +this.size+" , Product's color : " +this.color+"\n";
    }
}
