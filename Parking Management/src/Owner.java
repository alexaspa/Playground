 //ALEXANDRA SPANOU


public class Owner {
    
    private String name;
    private String last_name;
    private int phone_number;
    
public Owner(String n, String ln, int pn)
{
    this.name=n;
    this.last_name=ln;
    this.phone_number=pn;
}

public String getname(){return name;}
public String getepwnumo(){return last_name;}
public int getthl(){return phone_number;}

public String toString(){
        return "Owner: "+ name+" "+last_name+" Phone Number:"+phone_number;
    
}    
}
