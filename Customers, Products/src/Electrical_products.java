//Alexandra Spanou 


public class Electrical_products extends Products
{
    private int chronology,warranty;
    
    public Electrical_products(int k5,String a5,String b5,String c5,float d5,int e,int e1)
    {
    
     super(k5,a5,b5,c5,d5);
     this.chronology=e;
     this.warranty=e1;
    
    }
    public String toString() 
    { 
     return super.toString()+" , Product's chronology : " +this.chronology+" , Product's warranty : " +this.warranty+"\n";
    }
}
