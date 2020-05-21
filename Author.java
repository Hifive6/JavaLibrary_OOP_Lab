public class Author {
    private String name;
    private int age;
    private PublishingCompany publisher;

    public Author(String name, int age, PublishingCompany publisher){
        // super(publisher);
        this.name = name;
        this.age = age;
        this.publisher = publisher;

    }

    // getters
    public String getAName(){
        return name;
    }

    public int getAAge(){
        return age;
    }

    // setters
    public void setAName(String name){
        this.name = name;
    }

    public void setAAge(int age){
        this.age = age;
    }

    @Override
    public String toString(){
        
        return getAName() + " " + getAAge() + " " + publisher ;
    }

    
}