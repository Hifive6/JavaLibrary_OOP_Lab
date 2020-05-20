public class NewsPaper extends Periodical{

    private boolean local;

    public NewsPaper(String title, String author, String publisher, int publishYear, int ISBN, String category, String audience, boolean local){
        super(title, author, publisher, publishYear, ISBN);
        this.local = local;
    }

    //getters
    public boolean getLocal(){
        return local;
    }

    //setters
    public void setLocal(boolean local){
        this.local = local;
    }
    
}