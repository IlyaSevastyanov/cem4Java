package domen;

import java.util.Iterator;
import java.util.List;

/**
 * Класс StudentSteam
 * Представляет собой структуру для создания объектов типа "StudentSteam" с номером потока и списком групп на потоке
 */
public class StudentStream implements Iterable<StudentGroup> {
    private int idStream;
    private List<StudentGroup> numberStream;

    /**
     * Конструктор класса StudentStream
     *
     * @param numberStream список групп студентов на потоке
     * @param idStream     id потока
     */
    public StudentStream(List<StudentGroup> numberStream, int idStream) {
        this.idStream = idStream;
        this.numberStream = numberStream;
    }

    /**
     * Метод для получения id потока
     *
     * @return id  потока
     */
    public int getIdStream() {
        return idStream;
    }

    /**
     * Метод для установки id потока
     *
     * @param idStream новый id потока
     */
    public void setIdStream(int idStream) {
        this.idStream = idStream;
    }

    /**
     * Метод для установки списка групп студентов на потоке
     *
     * @param numberStream новый список групп студентов на потоке
     */

    public void setNumberStream(List<StudentGroup> numberStream) {
        this.numberStream = numberStream;
    }

    /**
     * Переопределенный метод toString для формирования строкового представления объекта StudentStream
     *
     * @return строковое представление объекта StudentStream
     */
    @Override
    public String toString() {
        String temp = "";
        for (StudentGroup studentGroup : numberStream) {
            temp += studentGroup + "\n";
        }
        return "\nidStream=" + idStream + "\nnumberStream" + numberStream.size() + "\n" + temp;
    }

    /**
     * @return элемент Iterator<StudentGroup>
     * @apiNote Метод для прохождения по элементам списка, который представляет собой список групп студентов на потоке
     */
    @Override
    public Iterator<StudentGroup> iterator() {
        return new StudentStreamIterator(numberStream);
    }

    /**
     * Метод для получения списка групп студентов на потоке
     *
     * @return список групп студентов на потоке
     */
    public List<StudentGroup> getNumberStream() {
        return numberStream;
    }
}
