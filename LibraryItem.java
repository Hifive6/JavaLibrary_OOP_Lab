public class LibraryItem {
    //Private variable relating to all items in a Library
    private String title, author, publisher;
    private int publishYear, ISBN;
    
    public LibraryItem(String title, String author, String publisher, int publishYear, int ISBN){
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.publishYear = publishYear;
        this.ISBN = ISBN;

    }

    //my Getters

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public String getPublisher(){
        return publisher;
    }

    public int getPublishYear(){
        return publishYear;
    }

    public int getISBN(){
        return ISBN;
    }

    // my Setters

    public void setTitle(String title){
        this.title = title;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public void setPublisher(String publisher){
        this.publisher = publisher;
    }

    public void setPublishYear(int year){
        this.publishYear = year;
    }

    public void setISBN(int isbn){
        this.ISBN = isbn;
    }


    @Override
    public String toString(){
        return "The Title of the book is " + getAuthor() + " Authored by " + getAuthor() + " published in " + getPublishYear() + "."; 
    }
}