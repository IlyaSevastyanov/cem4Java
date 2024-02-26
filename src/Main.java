import controllers.AccountController;
import domen.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Основной класс программы.
 */
public class Main {
    public static void main(String[] args) {
        List<Student> students1 = new ArrayList<>();
        Student student1 = new Student("Alex", 20);
        Student student2 = new Student("Any", 18);
        Student student3 = new Student("Kiril", 19);
        Student student4 = new Student("Ilya", 21);
        Student student5 = new Student("Jho", 29);
        Student student6 = new Student("Iva", 21);
        Student student7 = new Student("Ariel", 24);
        Student student8 = new Student("Rayn", 17);
        students1.add(student1);
        students1.add(student2);
        students1.add(student3);
        students1.add(student4);
        students1.add(student5);
        StudentGroup studentGroup1 = new StudentGroup(2, students1);
        for (Student student : studentGroup1) {
            System.out.println("student = " + student);
        }
        System.out.println("___________________________________________________");
        Collections.sort(studentGroup1.getStudentList());
        for (Student student : studentGroup1) {
            System.out.println("student = " + student);
        }
        List<Student> students2 = new ArrayList<>();
        students2.add(student6);
        students2.add(student7);
        students2.add(student8);
        StudentGroup studentGroup2 = new StudentGroup(1, students2);
        System.out.println("___________________________________________________");
        for (Student student : studentGroup2) {
            System.out.println("student = " + student);
        }
        System.out.println("----------------------------------------------------");
        Collections.sort(studentGroup2.getStudentList());
        for (Student student : studentGroup2) {
            System.out.println("student = " + student);
            System.out.println("------------------------------------------------");
        }
        List<StudentGroup> numberStream = new ArrayList<>();
        numberStream.add(studentGroup1);
        numberStream.add(studentGroup2);

        StudentStream studentStream = new StudentStream(numberStream, 5);
        System.out.println("studentStream = " + studentStream);
        System.out.println("----------------------------------------------------");
        Collections.sort(numberStream);
        System.out.println("studentStream = " + studentStream);
        Empoyee worker = new Empoyee("Vaciliy", 34, "разнорабочий");
        Teacher teacher = new Teacher("Alice", 56, "доцент");
        // AccountController accountController = new AccountController();
        // accountController.paySalary(worker, 12344);
        // accountController.paySalary(teacher, 92400);
        AccountController.paySalary(worker, 12344);
        AccountController.paySalary(teacher, 92400);

        Student student9 = new Student("Vasya bastard", 19);

    }
}