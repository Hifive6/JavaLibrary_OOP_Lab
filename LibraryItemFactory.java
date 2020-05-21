public class LibraryItemFactory {
    public static LibraryItem createItems(ItemInLibrary item){
    
        
        if(item == null){
            return null;
        }
        switch(item){
            case GENERAL_BOOK:
                GeneralBook b = new GeneralBook(); return b;
            case REFERENCE_BOOK:
                ReferenceBook r = new ReferenceBook();
                return r;
            case MAGAZINE:
                Magazine m = new Magazine();
                return m;
            case NEWSPAPER:
                NewsPaper n = new NewsPaper();
                return n; 
            default:
             return null;

        }
    }
}