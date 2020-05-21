public class GeneralBook extends Book {
    
    private String genre;
    private boolean fiction;
    

    public GeneralBook(String title, Author author, String publisher, int publishYear, int ISBN, String genre, boolean fiction){
        super(title, author, publisher, publishYear, ISBN);
        this.genre = genre;
        this.fiction = fiction;
    }

    // getters
    public String getGenre(){
        return genre;
    }

    public boolean getFiction(){
        return fiction;
    }

    //setters
    public void setGenre(String genre){
        this.genre = genre;
    }

    public void setFiction(boolean fiction){
        this.fiction = fiction;
    }

    @Override
    public String toString(){
        String str = super.toString();

        if(fiction){
           return str += " Fiction";
        } else {
            return str += " Non-Fiction";
        }
    }
}