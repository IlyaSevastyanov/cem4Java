import controllers.AccountController;
import domen.*;
import services.TeacherService;

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
        Employee worker1 = new Employee("Vaciliy", 34, "разнорабочий");
        Employee worker2 = new Employee("Igor", 40, "охранник");
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(worker1);
        employeeList.add(worker2);
        Teacher teacher = new Teacher("Alice", 56, "доцент");
        // AccountController accountController = new AccountController();
        // accountController.paySalary(worker, 12344);
        // accountController.paySalary(teacher, 92400);
        AccountController.paySalary(worker1, 12344);
        AccountController.paySalary(teacher, 92400);

        Student student9 = new Student("Vasya bastard", 19);

        System.out.println("----Homework_4----");

        Teacher teacher1 = new Teacher("Leon", 39, "доцент");
        Teacher teacher2 = new Teacher("Aleksei", 30, "Старший преподаватель");
        Teacher teacher3 = new Teacher("Dmitry", 24, "Ассистент");
        Teacher teacher4 = new Teacher("Elena", 59, "Профессор");

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(teacher1);
        teacherList.add(teacher2);
        teacherList.add(teacher3);
        teacherList.add(teacher4);
        TeacherService teacherServiceList = new TeacherService();
        teacherServiceList.setTeacherList(teacherList); // передаем в экземпляр сервиса список учителей на сортировку
        teacherServiceList.printSortTeacherList(); // выполняем сортировку и вывод в консоль списка учителей
        System.out.print("Учителя: ");
        AccountController.averageAge(teacherList); // вывод среднего возраста учителей из списка
        System.out.print("Студенты: ");
        AccountController.averageAge(students2); // вывод среднего возраста студентов из списка
        System.out.print("Работники: ");
        AccountController.averageAge(employeeList); // вывод среднего возраста работников из списка

    }
}