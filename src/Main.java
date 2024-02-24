import domen.Student;
import domen.StudentGroup;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Student student1 = new Student("Alex", 20);
        Student student2 = new Student("Any", 18);
        Student student3 = new Student("Kiril", 19);
        Student student4 = new Student("Ilya", 21);
        Student student5 = new Student("Jhon",23);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        StudentGroup studentGroup = new StudentGroup(2,students);
        for (Student student: studentGroup) {
            System.out.println(student);
        }
        System.out.println("--------------------------------------");
        Collections.sort(studentGroup.getStudentList());
        for (Student student: studentGroup) {
            System.out.println(student);
        }
    }
}