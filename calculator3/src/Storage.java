import java.util.ArrayList;
import java.util.List;

public class Storage<T>{
    private List<T> items = new ArrayList<>();
    private T item;

//    public Storage(T item) {
//        this.item = item;
//    }

    public void setItem(T item) {
        this.item = item;
        items.add(item);
    }

    public T getItem(int i) {
        return items.get(i);
    }

    public List<T> getItems() {
        return items;
    }
}
