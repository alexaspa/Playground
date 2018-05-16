 //ALEXANDRA SPANOU


import static java.lang.System.in;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
         ArrayList<Vehicle> Vehicles=new ArrayList<>();
         ArrayList<Double> charge_list=new ArrayList<>(); 
         
         // dhmiourgw oxhmata dokimastika      
        Sedan o1=new Sedan("Alexia", "Spanou", 30652, "Sedan", "astra", "blue", "the1309" ,"18-12-2013", 5, 230);                 
        Coupe o2=new Coupe("Mary", "Jane", 30622, "Coupe", "astra2", "green", "the13092" ,"15-12-2013", 8, 239);
        Motorbike o5=new Motorbike("Kostas", "Ioannidis", 30562, "Mhxanh", "yamaha", "red", "the13092" ,"18-12-2013", 6);
        Motorbike o6=new Motorbike("Maria", "Ioannidou", 306576, "Mhxanh", "suzuki", "red", "the130782" ,"9-5-2013", 2);
        Car o7=new Car("John","Spanos",95646,"corola","avensis", "blue","8es8920","18-3-2013",5);
        Jeep o8=new Jeep("Pantelis", "Papadhmas", 36522, "Jeep", "cheronki", "black", "the13092" ,"15-12-2013", 2, "2-1-2013");
        Sedan o9=new Sedan("George", "Minos", 30852, "Sedan", "Limited", "white", "tes8509" ,"18-12-2013", 3, 120);  
        
        charge_list.add(o1.charge(5));// krataw tis xrewseis ka8e oxhmatos se array list
        charge_list.add(o2.charge(8));
        charge_list.add(o5.charge(6));
        charge_list.add(o6.charge(2));
        charge_list.add(o7.charge(5));
        charge_list.add(o8.charge(2));
        charge_list.add(o9.charge(3));
        
        Vehicles.add(o2);
        Vehicles.add(o1);
        Vehicles.add(o5);
        Vehicles.add(o6);
        Vehicles.add(o7);
        Vehicles.add(o8);
        Vehicles.add(o9);
           
        
        Scanner in=new Scanner(System.in);
        Scanner inn=new Scanner(System.in);       
        
      do{
                	int i;
			System.out.println("\n MENU:");
			System.out.println("1.Add a vehicle to Parking!!");
                        System.out.println("2.Display the vehicles in the Parking!!");
                        System.out.println("3.Display the vehicles in the Parking by category!!");
                        System.out.println("4.Display the profit by day!!");
                        System.out.println("5.Display the total profit!!");
                        System.out.println("6.Display the profit by vehicle's category!!");                        
			System.out.println("7.Exit");
			i = in.nextInt();
			
			if(i==1){
                            String marka, perigrafh, xrwma, pinakida, hmeromhnia_eisodou;
                                    int hmeres;
                                    double megethos_xwrou = 0;
                                    int ippodunamh = 0;
                                    String hmeromhnia_adeias = null;
                                    int temp=0;
                                    String onoma;
                                    String epwnumo;
                                    int thl;
                                    
                            System.out.println("Complete your name: ");                           
                            onoma=inn.nextLine();
                            System.out.println("Complete your last name: ");                           
                            epwnumo=inn.nextLine();
                            System.out.println("Complete your phone number: ");                           
                            thl=in.nextInt();                    
                            System.out.println("Complete the brand of the hehicle: ");                           
                            marka=inn.nextLine();
                            if (marka.equals("Sedan"))
                                    {
                                       System.out.println("Give the size of space in liters: ");
                                       megethos_xwrou=inn.nextDouble();
                                       temp=temp+1; // krataw mia timh se ka8e kathgoria gia th xrewsh parakatw
                                    }
                            else if (marka.equals("Coupe"))
                            {
                                System.out.println("Give vehicle's horsepower: ");
                                       ippodunamh=in.nextInt();
                                       temp=temp+2; // krataw mia timh se ka8e kathgoria gia th xrewsh parakatw
                            }
                            else if (marka.equals("Jeep"))
                            {
                                System.out.println("Give vehicle's registration date: ");
                                       hmeromhnia_adeias=inn.next();
                                       temp=temp+3; // krataw mia timh se ka8e kathgoria gia th xrewsh parakatw
                            }
                            else if (marka.equals("Motorbike"))
                            {
                                       temp=temp+4; // krataw mia timh se ka8e kathgoria gia th xrewsh parakatw
                            }
                            else{temp=temp+5;} // krataw mia timh se ka8e kathgoria gia th xrewsh parakatw
                            
                            System.out.println("Give vehicle's description: ");                       
                            perigrafh=in.next();                                                        
                            System.out.println("Give vehicle's color: ");
                            xrwma=inn.next();                            
                            System.out.println("Give vehicle's plate: ");
                            pinakida=in.next();
                            System.out.println("Give vehicle's entry date: ");
                            hmeromhnia_eisodou=inn.next();
                            System.out.println("How many days do you want to use the Parking? : ");
                            hmeres=inn.nextInt();
                          
                            if (temp==1)// analoga poia kathgoria einai kalw thn katallhlh sunarthsh xrewsh kai thn vazw se array list
                            {
                                Sedan o3=new Sedan(onoma, epwnumo, thl, marka, perigrafh, xrwma, pinakida ,hmeromhnia_eisodou, hmeres, megethos_xwrou);
                                     Vehicles.add(o3);
                                     charge_list.add(o3.charge(hmeres));
                            }
                            else if (temp==2)
                            {
                                Coupe o3=new Coupe(onoma, epwnumo, thl, marka, perigrafh, xrwma, pinakida ,hmeromhnia_eisodou, hmeres, ippodunamh);
                                     Vehicles.add(o3);
                                     charge_list.add(o3.charge(hmeres));                             
                            }
                            else if (temp==3)
                            {
                                Jeep o3=new Jeep(onoma, epwnumo, thl, marka, perigrafh, xrwma, pinakida ,hmeromhnia_eisodou, hmeres, hmeromhnia_adeias);
                                     Vehicles.add(o3);
                                     charge_list.add(o3.charge(hmeres));
                            }
                            else if (temp==4)
                            {
                                Motorbike o3=new Motorbike(onoma, epwnumo, thl, marka, perigrafh, xrwma, pinakida ,hmeromhnia_eisodou, hmeres);
                                     Vehicles.add(o3);
                                     charge_list.add(o3.charge(hmeres));
                            }
                            else if (temp==5)
                            {
                                Car o3=new Car(onoma, epwnumo, thl, marka, perigrafh, xrwma, pinakida ,hmeromhnia_eisodou, hmeres);
                                     Vehicles.add(o3);
                                     charge_list.add(o3.charge(hmeres));
                            }      			    
			}else if(i==2){
                            
                            for (i=0; i<Vehicles.size(); i++)
                            {
                                System.out.println(Vehicles.get(i));
                            }                                
			}else if(i==3){ 
                            
                            for (i=0; i<Vehicles.size(); i++)
                            {   if (Vehicles.get(i).get_brand().equals("Sedan"))
                                    System.out.println(Vehicles.get(i));                                    
                            }
                            System.out.println(" ");
                            for (i=0; i<Vehicles.size(); i++)
                            {   if (Vehicles.get(i).get_brand().equals("Coupe"))
                                    System.out.println(Vehicles.get(i));
                            }
                            System.out.println(" ");
                            for (i=0; i<Vehicles.size(); i++)
                            {   if (Vehicles.get(i).get_brand().equals("Jeep"))
                                    System.out.println(Vehicles.get(i));
                            }
                            System.out.println(" ");
                            for (i=0; i<Vehicles.size(); i++)
                            {   if (Vehicles.get(i).get_brand().equals("Motorbike"))
                                    System.out.println(Vehicles.get(i));
                            } 
                            System.out.println(" ");
                            for (i=0; i<Vehicles.size(); i++)
                            {   if (Vehicles.get(i).get_brand()!=("Motorbike")&& Vehicles.get(i).get_brand()!=("Jeep")&&Vehicles.get(i).get_brand()!=("Coupe")&&Vehicles.get(i).get_brand()!=("Sedan"))
                                    System.out.println(Vehicles.get(i));
                            }   
                            
			}else if(i==4){
                            String hmera;
                            System.out.println("Give a date: ");
                            hmera=inn.next(); 
                            double cost_day=0;
                            for (i=0; i<Vehicles.size(); i++)
                            {   
                                if (Vehicles.get(i).get_entry_date().equals(hmera))
                                {
                                    cost_day=cost_day+charge_list.get(i);
                                }
                            }  
                             System.out.println("The profit for the date "+hmera+" is: "+cost_day);
                       }else if(i==5){
                           double sunoliko_kerdos=0;
                           for(i=0; i<charge_list.size(); i++)
                           {
                               sunoliko_kerdos=sunoliko_kerdos+charge_list.get(i);
                           }
                           System.out.println("The total profit is:"+sunoliko_kerdos);
                          
                        }else if(i==6){                        
                            for (i=0; i<Vehicles.size(); i++)
                            {   if (Vehicles.get(i).get_brand().equals("Sedan"))
                            {
                                    System.out.println("Sedan: "+Vehicles.get(i).getcost_sedan());
                                    break;}
                            }                            
                            for (i=0; i<Vehicles.size(); i++)
                            {   if (Vehicles.get(i).get_brand().equals("Coupe"))                                
                                    {
                                    System.out.println("Coupe: "+Vehicles.get(i).getcost_coupe());
                                    break;}
                            }
                            for (i=0; i<Vehicles.size(); i++)
                            {   if (Vehicles.get(i).get_brand().equals("Jeep"))
                                   {
                                    System.out.println("Jeep: "+Vehicles.get(i).getcost_jeep());
                                    break;}
                            }
                            for (i=0; i<Vehicles.size(); i++)
                            {   if (Vehicles.get(i).get_brand().equals("Motorbike"))
                                 {
                                    System.out.println("Motorbike: "+Vehicles.get(i).getcost_motirbike());
                                    break;}
                            }  
                            for (i=0; i<Vehicles.size(); i++)
                            {   if (Vehicles.get(i).get_brand()!=("Motorbike")&& Vehicles.get(i).get_brand()!=("Jeep")&&Vehicles.get(i).get_brand()!=("Coupe")&&Vehicles.get(i).get_brand()!=("Sedan"))
                                 {
                                    System.out.println("Another category: "+Vehicles.get(i).getcost_Car());
                                    break;}
                            }                               
                        }else if(i==7){                           
                         break;
                         }			
		}while(true);           
    }    
}
