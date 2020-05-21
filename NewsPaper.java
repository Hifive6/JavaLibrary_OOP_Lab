public class NewsPaper extends Periodical implements Reserveable{

    private boolean local;

    public NewsPaper(String title, Author author, String publisher, int publishYear, int ISBN, String category, String audience, boolean local){
        super(title, author, publisher, publishYear, ISBN);
        this.local = local;
    }

    public NewsPaper() {
	}

	//getters
    public boolean getLocal(){
        return local;
    }

    //setters
    public void setLocal(boolean local){
        this.local = local;
    }

    public boolean isReserable(){
        return false;
    }
    
}