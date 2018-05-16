//Alexandra Spanou 


public abstract class Customers 
{ 
    private int ID;
    private float account_balance; //upoloipo
    private String shopping_cart,name;
    
    float getypoloipo() {return account_balance;}
    void setYpoloipo(float y)  {this.account_balance=y;}
    
    Customers(int id,String a,float b,String c)
    { 
     this.ID=id;
     this.name=a;
     this.account_balance=b;
     this.shopping_cart=c;
    }
    
    //methodos ektypwshs stoixeiwn
    public String toString() 
    { 
     return "Customer's Name: " +this.name+ " , Customer's ID: " +this.ID+ " , Ypoloipo logariasmou : " +this.account_balance
             +" , Shopping Cart : " +this.shopping_cart;
    }
    
}
