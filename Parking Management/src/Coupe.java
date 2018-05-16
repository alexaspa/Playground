 //ALEXANDRA SPANOU


public class Coupe extends Vehicle{
    private int horsepower;

    public Coupe(String name, String last_name, int phone_number, String brand, String description, String color, String plate,String entry_date, int days, int horsepower) {
         super(name, last_name, phone_number, brand, description, color, plate, entry_date, days);
        this.horsepower=horsepower;
    }
    public int getippodunamh(){return horsepower;}
    
   public double charge(int days)
    {
        double kostos=days*6;
        if(this.horsepower>160)
        {
        kostos=kostos+kostos*0.10;
        }
                
        if (kostos>80){
             super.setcost_coupe(kostos-kostos*0.20);
        return kostos-kostos*0.20;}
        else{
            super.setcost_coupe(kostos);
            return kostos;}       
    }
    
    public String toString(){
        return super.toString()+" Horsepower: "+ horsepower;    
}
}
