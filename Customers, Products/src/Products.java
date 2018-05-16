//Alexandra Spanou 


public abstract class Products 
{
    private int ID1;
    private String firm,name,description;
    private float price;
    
    float gettimh() {return price;}
    
    public Products(int k4,String a4,String b4,String c4,float d4)
    {
     this.ID1=k4;
     this.firm=a4;
     this.name=b4;
     this.description=c4;
     this.price=d4;
    }
    
    public String toString() 
    { 
     return "Product's Firm: " +this.firm+ " , Product's ID  : " +this.ID1+ " , Product's name : " +this.name
             +" , Description of the product : " +this.description+" , Product's price : " +this.price;
    }
    
    
}
