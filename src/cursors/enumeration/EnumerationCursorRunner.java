package cursors.enumeration;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationCursorRunner {
    public static void main(String[] args) {
        //Enumeration(Not Universal Cursor{Can Be Use With Legacy Classes(i.e Vector, HashTable)}, {Since Java 1.0}):
        Vector<Integer> vector = new Vector<>();
        for(int i = 1 ; i <= 10 ; i++){
            vector.add(i);
        }

        System.out.println("Enumeration Cursor:");

        Enumeration<Integer> numbersEnumeration = vector.elements();

        while(numbersEnumeration.hasMoreElements()){
            System.out.println(numbersEnumeration.nextElement());
        }

        //Inner Class Name:
        System.out.println(numbersEnumeration.getClass().getName());
    }
}
