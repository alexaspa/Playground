//Alexandra Spanou 


public class Member extends Customers
{
    private double discount;
    
    public Member(int id3,String a3,float b3,String c3,double d3)
    {
    super(id3,a3,b3,c3);
    this.discount=d3;
    }
    
    public String toString() 
    { 
     return super.toString()+", Category of Customer : Member"+", Discount : "+this.discount;
    }
}
