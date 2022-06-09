package comparableAndComparator;

import comparableAndComparator.comparable.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Jay Shah", 6.25F));
        students.add(new Student("Anjaniy Salekar", 9.63F));
        students.add(new Student("Mahesh Baria", 9.15F));
        students.add(new Student("Vrushabh Mistry", 8.25F));
        students.add(new Student("Ruchita Salekar", 7.25F));
//        students.forEach(System.out::println);


        //Soring On The Basis Of CGPA:
        Collections.sort(students);
        students.forEach(System.out::println);
    }
}
