//Alexandra Spanou 


public class Magazine  
{
    private String title,author,magazine,volume,pages;
    
    
    public Magazine(String a1,String a2,String a3,String a4,String a5)
    {
    this.title=a1;
    this.author=a2;
    this.magazine=a3;
    this.volume=a4;
    this.pages=a5;
    }
    
    public String toString()
    {
    return "\nTitle of publication : "+this.title+", Author : "+this.author+", Magazine : "+this.magazine+"\n"+
            " Volume : "+this.volume+", Pages : "+this.pages+"\n";
    
    }
    
    
}