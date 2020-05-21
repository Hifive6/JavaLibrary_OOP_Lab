public class Library {
    public static void main(String[] args) {
        //Instanciate new object of a Reference Book pass it some arguements 
        ReferenceBook rb = new ReferenceBook("World Atlas", "Many Editors", "World Atlantic", 2007, 124859, "Map", 2);
        //Call the Override method of toString on the object save to a new field and print to the page.
        String someInfo = rb.toString();
        System.out.println(someInfo);
    }
}