package iterableAndIterator.implementations;

import java.util.Iterator;
import java.util.List;

public class CustomIterator<T> implements Iterator<T> {

    List<T> values;
    int position = 0;

    public CustomIterator(List<T> values){
        this.values = values;
    }
    @Override
    public boolean hasNext() {
        return values.size() > position + 1;
    }

    @Override
    public T next() {
        T nextValue = this.values.get(position);
        position++;
        return nextValue;
    }
}
