 //ALEXANDRA SPANOU


public class Car extends Vehicle{
    
    public Car(String name, String last_name, int phone_number, String brand, String description, String color, String plate,String entry_date, int days) {
        super(name, last_name, phone_number, brand, description, color, plate, entry_date, days);              
    }
    
    public double charge(int days)
    {   double kostos=days*6;
    if (kostos>80){
        super.setcost_Car(kostos-kostos*0.20);
        return kostos-kostos*0.20;}
    else {
        super.setcost_Car(kostos);
        return kostos;}
    }    
}
