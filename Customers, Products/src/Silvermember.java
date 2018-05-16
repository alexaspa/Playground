//Alexandra Spanou 


public class Silvermember extends Customers
{
    private double discount;
    
    public Silvermember(int id2,String a2,float b2,String c2,double d2)
    {
    super(id2,a2,b2,c2);
    this.discount=d2;
    }
    
    public String toString() 
    { 
     return super.toString()+", Category of Customer : SilverMember"+", Discount : "+this.discount;
    }
    
    float agora(float A)
    {
      float newA;
      newA=(float) (A-(A*0.1));
      return newA;
      
    }
}
