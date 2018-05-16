 //ALEXANDRA SPANOU


public abstract class Vehicle extends Owner{
    private String brand;
    private String description;
    private String color;
    private String plate; //pinakida
    private String entry_date;
    private int days;
    
    private static double cost_Sedan=0; // sunoliko gia ta sedan
    private static double cost_Coupe=0;
    private static double cost_Jeep=0;
    private static double cost_Motorbike=0;
    private static double cost_Autokinhto=0;
    
    public Vehicle(String n, String ln, int pn, String b, String d, String c, String p,String ed, int ds) {
        super(n, ln, pn);
        
        this.brand=b;
        this.description=d;
        this.color=c;
        this.plate=p;
        this.entry_date=ed;
        this.days=ds;        
    }
    
    public void setcost_sedan(double cost){this.cost_Sedan+=cost;} // gia na krathsw to sunoliko kostos ka8e eidous oxhmatos
    public void setcost_coupe(double cost){this.cost_Coupe+=cost;}
    public void setcost_jeep(double cost){this.cost_Jeep+=cost;}
    public void setcost_motorbike(double cost){this.cost_Motorbike+=cost;}
    public void setcost_Car(double cost){this.cost_Autokinhto+=cost;}
    
    public double getcost_sedan(){return cost_Sedan;}
    public double getcost_coupe(){return cost_Coupe;}
    public double getcost_jeep(){return cost_Jeep;}
    public double getcost_motirbike(){return cost_Motorbike;} 
    public double getcost_Car(){return cost_Autokinhto;}     
       
    public String get_brand(){return brand;}
    public String get_description(){return description;}
    public String get_color(){return color;}
    public String get_plate(){return plate;}
    public String get_entry_date(){return entry_date;}
    public int get_days(){return days;}
    
    public abstract double charge(int days);
    
    public String toString(){
        return " "+ super.toString()+" Brand: "+brand+" Description: "+description+" Color: "+color+" Plate: "+plate+" Entry Date: "+entry_date+" Days of using Parking: "+days;    
    }  
}
