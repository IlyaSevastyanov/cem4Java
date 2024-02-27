package services;

import domen.Empoyee;
import domen.Student;
import domen.Teacher;

import java.util.ArrayList;
import java.util.List;

public class TeacherService implements iPersonService<Teacher> {
    private int count;
    private List<Teacher> teacherList;

    public TeacherService() {
        this.teacherList = new ArrayList<Teacher>();
    }

    @Override
    public List<Teacher> getAll() {
        return this.teacherList;
    }

    @Override
    public void create(String name, int age) {
        Teacher newTeacher = new Teacher(name,age, "доцент");
        this.teacherList.add(newTeacher);
        this.count++;
    }
}
