
public class Library {
    public static void main(String[] args) {
        //Instanciate new object of a Reference Book pass it some arguements 
        // Author at = new Author("George", 40, "anyone");
        // ReferenceBook rb = new ReferenceBook("title", "", "that person",  2009, 292929, "atlas", 2);
        //Call the Override method of toString on the object save to a new field and print to the page.
        // rb.toString();
        // System.out.println(rb);

        // GeneralBook gb = new GeneralBook();
        // gb.toString();
        // System.out.println(gb);
        LibraryItem item = LibraryItemFactory.createItems(ItemInLibrary.NEWSPAPER);
        item.setTitle("Charlotte Observer");
        String title = item.getTitle();
        System.out.println(title);
    }
}