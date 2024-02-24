package domen;

import java.util.Iterator;
import java.util.List;

/**
 * Класс StudentGroup
 * Представляет собой структуру для создания объектов типа "StudentGroup" с номером группы и списком студентов в группе
 */
public class StudentGroup implements Iterable<Student>, Comparable<StudentGroup> {
    private int idStudentGroup;
    private List<Student> studentList;

    /**
     * Конструктор класса StudentGroup
     *
     * @param idStudentGroup номер группы
     * @param studentList    список студентов в группе
     */
    public StudentGroup(int idStudentGroup, List<Student> studentList) {
        this.idStudentGroup = idStudentGroup;
        this.studentList = studentList;
    }

    /**
     * Метод для получения id группы
     *
     * @return id группы
     */
    public int getIdStudentGroup() {
        return idStudentGroup;
    }

    /**
     * Метод для установки id группы
     *
     * @param idStudentGroup id группы
     */
    public void setIdStudentGroup(int idStudentGroup) {
        this.idStudentGroup = idStudentGroup;
    }

    /**
     * Метод для получения списка студентов в группе
     *
     * @return список студентов
     */
    public List<Student> getStudentList() {
        return studentList;
    }

    /**
     * Метод для установки списка студентов в группе
     *
     * @param studentList список студентов
     */
    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    /**
     * Переопределенный метод toString
     *
     * @return строковое представление объекта StudentGroup
     */

    @Override
    public String toString() {
        return "StudentGroup{" + "idStudentGroup=" + idStudentGroup + ", studentList=" + studentList + '}';
    }

    /**
     * Переопределенный метод iterator
     *
     * @return итератор для списка студентов в группе
     */
    @Override
    public Iterator<Student> iterator() {
        return new StudentIterator(studentList);
    }

    /**
     * Переопределенный метод compareTo для сравнения объектов StudentGroup
     *
     * @param o другой объект StudentGroup
     * @return результат сравнения по количеству студентов и id группы
     */
    @Override
    public int compareTo(StudentGroup o) {
        if (this.getStudentList().size() > o.getStudentList().size()) {
            return 1;
        }
        if (this.getStudentList().size() < o.getStudentList().size()) {
            return -1;
        }
        if (this.getIdStudentGroup() < o.getIdStudentGroup()) {
            return -1;
        }
        if (this.getIdStudentGroup() > o.getIdStudentGroup()) {
            return 1;
        }
        return 0;
    }
}
