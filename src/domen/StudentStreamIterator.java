package domen;

import java.util.Iterator;
import java.util.List;

public class StudentStreamIterator implements Iterator<StudentGroup> {
    private int counter;
    private final List<StudentGroup> numberStream;

    public StudentStreamIterator(List<StudentGroup> numberStream) {
        this.numberStream = numberStream;
    }

    @Override
    public boolean hasNext() {
        return counter < numberStream.size();
    }

    @Override
    public StudentGroup next() {
        return numberStream.get(counter++);
    }
}
