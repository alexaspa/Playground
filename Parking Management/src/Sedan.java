 //ALEXANDRA SPANOU


public class Sedan extends Vehicle{
    private double size; //size of space  

    public Sedan(String name, String last_name, int phone_number, String brand, String description, String color, String plate,String entry_date, int days, double megethos_xwrou) {
        super(name, last_name, phone_number, brand, description, color, plate, entry_date, days);
        this.size=megethos_xwrou;
    }
    public double getmegethos_xwrou(){return size;}    
    
    public double charge(int days)
    {   double kostos=days*6;
        if(this.size>500)
        {
        kostos=kostos+kostos*0.15;
        }
                
        if (kostos>80){
         super.setcost_sedan(kostos-kostos*0.20);
        return kostos-kostos*0.20;}
        else{
            super.setcost_sedan(kostos);
            return kostos;}
    }
    
    public String toString(){
        return super.toString()+" Size: "+ size;    
}    
}
