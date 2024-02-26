package services;

import domen.PersonComparator;
import domen.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentServices implements iPersonService<Student> {
    private int count;
    private List<Student> studentList;

    public StudentServices() {
        this.studentList = new ArrayList<Student>();
    }

    @Override
    public List<Student> getAll() {
        return this.studentList;
    }

    @Override
    public void create(String name, int age) {
        Student newStudent = new Student(name, age);
        this.studentList.add(newStudent);
        this.count++;
    }
        public void sortByFIO() {

            this.studentList.sort(new PersonComparator<Student>());
    }
}

