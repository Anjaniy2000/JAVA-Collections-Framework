package comparableAndComparator.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {

        //Students:
        List<Student> students = new ArrayList<>();
        students.add(new Student("Jay Shah", 6.25F));
        students.add(new Student("Anjaniy Salekar", 9.65F));
        students.add(new Student("Mahesh Baria", 9.15F));
        students.add(new Student("Vrushabh Mistry", 9.65F));
        students.add(new Student("Ruchita Salekar", 7.25F));
        System.out.println("Before Sorting:");
        students.forEach(System.out::println);


        //Soring On The Basis Of CGPA:
        System.out.println("After Sorting:");
        Collections.sort(students);
        students.forEach(System.out::println);
    }
}
