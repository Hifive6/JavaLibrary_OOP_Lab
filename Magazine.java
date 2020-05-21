public class Magazine extends Periodical implements Reserveable {
   private String category;
   private String audience;

   public Magazine(){}

    public Magazine(String title, Author author, String publisher, int publishYear, int ISBN, String category, String audience){
        super(title, author, publisher, publishYear, ISBN);
        this.category = category;
        this.audience = audience;
        
    }

    //getters
    public String getCategory(){
        return category;
    }

    public String getAudience(){
        return audience;
    }
    
    //setters

    public void setCategory(String category){
        this.category = category;
    }

    public void setAudience(String audience){
        this.audience = audience;
    }

    public boolean isReserable(){
        return true;
    }
}