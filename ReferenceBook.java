public class ReferenceBook extends Book implements Loanable{
    
    private String infoType;
    private int edition;

    public ReferenceBook() {
	}
    
    public ReferenceBook(String title, Author author, String publisher, int publishYear, int ISBN, String infoType, int edition){
        super(title, author, publisher, publishYear, ISBN);
        this.infoType = infoType;
        this.edition = edition;
    }

    

	//getters for Reference Book
    public String getInfoType(){
        return infoType;
    }

    public int getEdition(){
        return edition;
    }

    //settlers for Reference Book
    public void setInfoType(String infotype){
        this.infoType = infotype;
    }

    public void setEdition(int edition){
        this.edition = edition;
    }

    public boolean isLoanable(){
        return false;
    }

    public double lateCharge(){
        return 2.00;
    }
}