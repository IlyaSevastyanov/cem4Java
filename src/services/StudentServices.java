package services;

import domen.PersonComparator;
import domen.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс для обработки операций со студентами.
 */
public class StudentServices implements iPersonService<Student> {
    private int count;
    private List<Student> studentList;

    /**
     * Создает новый объект StudentServices с указанным списком студентов.
     */
    public StudentServices() {
        this.studentList = new ArrayList<Student>();
    }

    /**
     * Возвращает список студентов.
     *
     * @return список студентов
     */
    @Override
    public List<Student> getAll() {
        return this.studentList;
    }

    /**
     * Создает нового студента с указанным именем и возрастом и добавляет его в список студентов.
     * Увеличивает счетчик студентов на 1.
     *
     * @param name имя нового студента
     * @param age  возраст нового студента
     */
    @Override
    public void create(String name, int age) {
        Student newStudent = new Student(name, age);
        this.studentList.add(newStudent);
        this.count++;
    }

    /**
     * Сортирует список студентов по ФИО.
     */
    public void sortByFIO() {

        this.studentList.sort(new PersonComparator<Student>());
    }
}

