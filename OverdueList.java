import java.util.Collection;

public class OverdueList<E> {
    private  Collection<E> overdueList;

    public OverdueList(Collection<E> overdueList){
        this.overdueList = overdueList;
    }

    //getters
    public Collection<E> getOverdueList(){
        return overdueList;
    }

    //setter
    public void setOverdueList(Collection<E> overdueList){
        this.overdueList = overdueList;
    }
}