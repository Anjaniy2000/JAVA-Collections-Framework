package iterableAndIterator.implementations;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CustomIterable<T> implements Iterable<T>{

    List<T> values = new ArrayList<T>();

    public void add(T data){
        this.values.add(data);
    }

    @Override
    public Iterator<T> iterator() {
        return new CustomIterator<T>(values);
    }
}
