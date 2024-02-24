package domen;

import java.util.Iterator;
import java.util.List;

/**
 * Класс StudentStreamIterator
 * Представляет собой итератор для списка групп студентов на потоке
 */
public class StudentStreamIterator implements Iterator<StudentGroup> {
    private int counter;
    private final List<StudentGroup> numberStream;

    /**
     * Конструктор класса StudentStreamIterator
     *
     * @param numberStream список групп студентов на потоке
     */
    public StudentStreamIterator(List<StudentGroup> numberStream) {
        this.numberStream = numberStream;
    }

    /**
     * Метод для проверки наличия следующего элемента в списке
     *
     * @return true, если есть следующий элемент, иначе false
     */
    @Override
    public boolean hasNext() {
        return counter < numberStream.size();
    }

    /**
     * Метод для получения следующего элемента из списка
     *
     * @return следующий элемент из списка групп студентов на потоке
     */
    @Override
    public StudentGroup next() {
        return numberStream.get(counter++);
    }
}
