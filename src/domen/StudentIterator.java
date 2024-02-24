package domen;

import java.util.Iterator;
import java.util.List;

/**
 * Класс StudentIterator
 * Реализует интерфейс Iterator для итерации по списку студентов
 */

public class StudentIterator implements Iterator<Student> {
    private int counter = 0;
    private final List<Student> students;

    /**
     * Конструктор класса StudentIterator
     *
     * @param students список студентов
     */
    public StudentIterator(List<Student> students) {
        this.students = students;
    }

    /**
     * Проверяет есть ли следующий элемент в списке
     *
     * @return наличие элемента
     */
    @Override
    public boolean hasNext() {
        return counter < students.size();
    }

    /**
     * Метод получения элемента
     *
     * @return возвращает элемент
     */
    @Override
    public Student next() {
        return students.get(counter++);
    }
}