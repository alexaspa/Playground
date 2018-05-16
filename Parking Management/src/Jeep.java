 //ALEXANDRA SPANOU


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Jeep extends Vehicle{

private String registration_date; //hmeromhnia adeias

    public Jeep(String name, String last_name, int phone_number, String brand, String description, String color, String plate,String entry_date, int days, String hmeromhnia_adeias) {
        super(name, last_name, phone_number, brand, description, color, plate, entry_date, days);
        
        this.registration_date=hmeromhnia_adeias;
    }
   public String gethmeromhnia_adeias(){return registration_date;}
   
   public static long compareTo( java.util.Date date1, java.util.Date date2 )  
{  
//returns negative value if date1 is before date2  
//returns 0 if dates are even  
//returns positive value if date1 is after date2  
  return date1.getTime() - date2.getTime();  
}  
   
    public double charge(int days)
    {        
        double kostos=days*6;
        
        SimpleDateFormat sdf = new SimpleDateFormat( "dd-MM-yyyy" );  
        Date d1 = null;  
    try {
        d1 = sdf.parse( this.registration_date );
    } catch (ParseException ex) {
        Logger.getLogger(Jeep.class.getName()).log(Level.SEVERE, null, ex);
    }
        Date d2 = null; 
    try {
        d2 = sdf.parse( "1-1-2013" );
    } catch (ParseException ex) {
        Logger.getLogger(Jeep.class.getName()).log(Level.SEVERE, null, ex);
    }
        if ( compareTo( d1, d2 ) > 0 )   
        {  
           kostos=kostos+kostos*0.20;
           if (kostos>80){
               super.setcost_jeep(kostos-kostos*0.20);
               return kostos-kostos*0.20;}
           else{
                super.setcost_jeep(kostos);
               return kostos;}
        }
        else 
        {  
              if (kostos>80){
                  super.setcost_jeep(kostos-kostos*0.20);
                  return kostos-kostos*0.20;}
              else{
                  super.setcost_jeep(kostos);
                  return kostos;}
        }   
    }
   
public String toString(){
        return super.toString()+" Registration date: "+ registration_date;    
}  
}
