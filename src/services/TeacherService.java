package services;

import domen.PersonComparator;
import domen.Teacher;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс TeacherService реализует функции получения списка учителей,
 */
public class TeacherService extends PersonComparator<Teacher> implements iPersonService<Teacher> {
    private int count;
    private List<Teacher> teacherList;

    /**
     * Конструктор класса TeacherService
     */
    public TeacherService() {
        List<Teacher> teachers = new ArrayList<>();
    }

    /**
     * Метод для получения всех учителей
     *
     * @return список всех учителей
     */
    @Override
    public List<Teacher> getAll() {
        return this.teacherList;
    }

    /**
     * Метод для создания нового учителя
     *
     * @param name имя учителя
     * @param age  возраст учителя
     */
    @Override
    public void create(String name, int age) {
        Teacher teacher = new Teacher(name, age, "учитель");
        teacherList.add(teacher);
        count++;
    }

    /**
     * Метод сортировки списка учителей
     */
    public void sortTeacherList() {
        this.teacherList.sort(new PersonComparator<Teacher>());
    }

    /**
     * Метод вывода в консоль отсортированного списка учителей
     */
    public void printSortTeacherList() {
        sortTeacherList();
        System.out.println(this.teacherList);
    }

    /**
     * Метод для установки списка учителей
     *
     * @param teacherList новый список учителей
     */
    public void setTeacherList(List<Teacher> teacherList) {
        this.teacherList = teacherList;
    }
}