import java.util.ArrayList;
import java.util.Collection;

public class CardHolder {
    
    private String name;
    private long idNumber;
    private boolean checkout, reserve;
    private ArrayList<Book> overduebooks;
    private ArrayList<Periodical> overdueperiodicals;

    public CardHolder(String name, long idNumber, boolean checkout, boolean reserve){
        this.name = name;
        this.idNumber = idNumber;
        this.checkout = checkout;
        this.reserve = reserve;
    }

    //getters
    public String getName(){
        return name;
    }

    public boolean getCheckout(){
        return checkout;
    }

    public boolean getReserve(){
        return reserve;
    }

    public long getIdNumber(){
        return idNumber;
    }

    public ArrayList<Book> getOverdueList(){
        return overduebooks;
    }

    public ArrayList<Periodical> getOverduePerodicals(){
        return overdueperiodicals;
    }

    //Setters
    public void setName(String name){
        this.name = name;
    }

    public void setCheckout(boolean checkout){
        this.checkout = checkout;
    }

    public void setReserve(boolean reserve){
        this.reserve = reserve;
    }

    public void setIdNumber(long idNumber){
        this.idNumber = idNumber;
    }

    public void setOverduebooks(ArrayList<Book> overduebooks) {
        this.overduebooks = overduebooks;
    }

    public void setOverdueperiodicals(ArrayList<Periodical> overdueperiodicals) {
        this.overdueperiodicals = overdueperiodicals;
    }

    @Override
    public String toString(){
        return name + " " + getIdNumber() + ". ";
    }
}