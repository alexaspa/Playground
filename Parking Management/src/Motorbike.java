 //ALEXANDRA SPANOU


public class Motorbike extends Vehicle{

    public Motorbike(String name, String last_name, int phone_number, String brand, String description, String color, String plate,String entry_date, int days) {
        super(name, last_name, phone_number, brand, description, color, plate, entry_date, days);
    }
    
    public double charge(int days)
    {   double kostos=days*3;
    if (kostos>80){
        super.setcost_motorbike(kostos-kostos*0.20);
        return kostos-kostos*0.20;}
    else {
        super.setcost_motorbike(kostos);
        return kostos;}
    }
    
    public String toString(){
        return super.toString()+" Motorbike:"+ this.get_brand();    
}
}
