public class CardHolder {
    
    private String firstName, lastName, nameOfLibrary;
    private long idNumber;

    public CardHolder(String firstName, String lastName, String nameOfLibrary, long idNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.nameOfLibrary = nameOfLibrary;
        this.idNumber = idNumber;
    }

    //getters
    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getNameOfLibrary(){
        return nameOfLibrary;
    }

    public long getIdNumber(){
        return idNumber;
    }

    //Setters
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setNameOfLibrary(String nameOfLibrary){
        this.nameOfLibrary = nameOfLibrary;
    }

    public void setIdNumber(long idNumber){
        this.idNumber = idNumber;
    }

    @Override
    public String toString(){
        return getFirstName() + " " + getLastName() + " " + " " + getIdNumber() + ". ";
    }
}