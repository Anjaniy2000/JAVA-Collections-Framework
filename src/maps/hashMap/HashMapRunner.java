package maps.hashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapRunner {
    public static void main(String[] args) {

        Map<Integer, String> students = new HashMap<>();

        //put(Object key, Object value):
        students.put(1, "Shah Jay");
        students.put(2, "Salekar Anjaniy");
        students.put(3, "Baria Mahesh");
        students.put(4, "Mistry Vrushabh");

        students.forEach((key, value) -> System.out.println(key + " " + value));

        //get(Object key):
        System.out.println(students.get(2));

        //isEmpty():
        System.out.println(students.isEmpty());

        //containsKey(Object o):
        System.out.println(students.containsKey(4));

        //containsValue(Object value):
        System.out.println(students.containsValue("Salekar Anjaniy"));

        //remove():
        System.out.println(students.remove(4));

        //remove(Object key, Object value):
        System.out.println(students.remove(2, "Salekar Anjaniy"));

        //putAll(Map map):
        Map<Integer, String> newstudents = new HashMap<>();
        newstudents.put(5, "Zalak Pandya");
        newstudents.put(6, "Salekar Ram");
        newstudents.put(4, "Mistry Vrushabh");
        newstudents.put(3, "Salekar Ruchita");

        students.putAll(newstudents);
        students.forEach((key, value) -> System.out.println(key + " " + value));
        
        //entryset():
        System.out.println("Students Are: " + students.entrySet());

        //keyset():
        System.out.println("Keys In Map Are: " + students.keySet());

        //values():
        System.out.println("Values In Map Are: " + students.values());

        //putIfAbsent(Object key, Object value):
        students.putIfAbsent(3, "Salekar Anjaniy");
        students.putIfAbsent(11, "Eleven From Stranger Things");

        students.forEach((key, value) -> System.out.println(key + " " + value));

        //getOrDefault(Object key, Object defaultValue):
        System.out.println("The Value For Key 11 Is: " + students.getOrDefault(11, "Mike"));
        System.out.println("The Value For Key 12 Is: " + students.getOrDefault(12, "Steve"));

        //replace(Object  key, Object value):
        students.replace(1, "Shah Jaya");

        //replace(Object key, Object oldValue, Object newValue):
        students.replace(3, "Salekar Ruchita", "Salekar Sai");

        students.forEach((key, value) -> System.out.println(key + " " + value));

        //clear():
        students.clear();
        System.out.println(students.size());

    }
}
