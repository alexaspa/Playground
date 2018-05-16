//Alexandra Spanou 


public class Conference 
{
    private String title,author,conference,date,location,subject;
    
    public Conference(String a1,String a2,String a3,String a4,String a5,String a6)
    {
    this.title=a1;
    this.author=a2;
    this.conference=a3;
    this.date=a4;
    this.location=a5;
    this.subject=a6;
    }
    
    public String toString()
    {
    return "\nTitle of publication : "+this.title+", Author : "+this.author+", Conference : "+this.conference+"\n"+
            " Date : "+this.date+", Location  : "+this.location+", Subject : "+this.subject+"\n";
    
    }
    
    
}
