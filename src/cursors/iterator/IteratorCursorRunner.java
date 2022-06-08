package cursors.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorCursorRunner {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Jay");
        names.add("Adams");
        names.add("Mahesh");
        names.add("Anna");
        names.add("Lilly");

        //Iterator(Universal Cursor{Can Be Use With Any Collection}, {Since Java 1.2}):
        System.out.println("Iterator Cursor:");
        Iterator<String> nameIterator = names.iterator();
        while(nameIterator.hasNext()){
            String name = nameIterator.next();
            if(name.equals("Anna")){
                nameIterator.remove();
            }
            else{
                System.out.println(name);
            }
        }

        System.out.println(names);

        //Inner Class Name:
        System.out.println(nameIterator.getClass().getName());
    }
}
