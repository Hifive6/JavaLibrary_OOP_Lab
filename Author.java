public class Author {
    private String name;
    private int age;

    public Author(String name, int age){
        this.name = name;
        this.age = age;

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
}