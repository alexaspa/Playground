//Alexandra Spanou 


public class Goldmembers extends Customers
{
    private double discount;
    
    public Goldmembers(int id1,String a1,float b1,String c1,double d1)
    {
    super(id1,a1,b1,c1); //kalemsa constructor ths super class
    this.discount=d1;
    }
    
    public String toString() 
    { 
     return super.toString()+", Category of Customer : GoldMember"+", Discount : "+this.discount;
    }
    
    float agora(float A)
    {
      float newA;
      newA=(float) (A-(A*0.15));
      return newA;
      
    }
}
