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

    public StudentStream(List<StudentGroup> numberStream, int idStream) {
    this.idStream =idStream;
    this.numberStream = numberStream;
}

    public int getIdStream() {
        return idStream;
    }

    public void setIdStream(int idStream) {
        this.idStream = idStream;
    }


    public void setNumberStream(List<StudentGroup> numberStream) {
        this.numberStream = numberStream;
    }

    @Override
    public String toString() {
        String temp = "";
        for (StudentGroup studentGroup: numberStream) {
            temp+=studentGroup+"\n";
        }
        return "\nidStream=" + idStream + "\nnumberStream" + numberStream.size() + "\n" + temp;
    }

    /**
     * @apiNote Метод для прохождения по элементам списка, который представляет собой список групп студентов на потоке
     * @return элемент Iterator<StudentGroup>
     */
    @Override
    public Iterator<StudentGroup> iterator() {
        return new StudentStreamIterator(numberStream);
    }

    public List<StudentGroup> getNumberStream() {
        return numberStream;
    }
}
