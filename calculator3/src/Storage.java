import java.util.ArrayList;
import java.util.List;

public class Storage<T>{
    // 속성
    private List<T> items = new ArrayList<>();

    // 기능
    public void saveItem(T item) {
        items.add(item);
    }

    public T getItem(int i) {
        return items.get(i);
    }

    public List<T> getItems() {
        return items;
    }

    public void clear() {
        this.items.clear();
    }

    public void getStorage() {
        for(Object st : getItems()) {
            System.out.print(st + " ");
        }
    }
}
