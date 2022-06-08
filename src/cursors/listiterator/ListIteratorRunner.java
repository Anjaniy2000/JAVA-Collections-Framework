package cursors.listiterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorRunner {
    public static void main(String[] args) {
        //ListIterator(It is only applicable for List collection implemented classes like ArrayList, LinkedList, etc, {It provides bi-directional iteration},
        // Since Java 1.2)
        List<Integer> numbers = new ArrayList<>();
        numbers.add(88);
        numbers.add(67);
        numbers.add(57);
        numbers.add(25);
        numbers.add(101);

        System.out.println("ListIterator Cursor:");

        //Forward Direction:
        ListIterator<Integer> forwardDirectionIterator = numbers.listIterator();
        System.out.println("Forward Direction");
        while(forwardDirectionIterator.hasNext()){
            System.out.println(forwardDirectionIterator.next());
        }

        //Backward Direction:
        ListIterator<Integer> backwardDirectionIterator = numbers.listIterator(numbers.size());
        System.out.println("Backward Direction");
        while(backwardDirectionIterator.hasPrevious()){
            System.out.println(backwardDirectionIterator.previous());
        }

        //Other Methods(set(), add()):
        List<Integer> numbers2 = new ArrayList<>();
        for(int i = 0 ; i < 10 ; i++){
            numbers2.add(i);
        }

        ListIterator<Integer> tempIterator = numbers2.listIterator();

        System.out.println("After Removing All The Even Numbers From ArrayList:");
        while(tempIterator.hasNext()){
            int element = tempIterator.next();

            if(element % 2 == 0){
                element++;
                tempIterator.set(element);
                tempIterator.add(element);
            }
        }

        numbers2.forEach(System.out::println);

        //Inner Class Name:
        System.out.println(forwardDirectionIterator.getClass().getName());
    }
}
