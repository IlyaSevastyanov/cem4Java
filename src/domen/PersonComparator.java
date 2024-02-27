package domen;

import java.util.Comparator;

public class PersonComparator<T extends Person> implements Comparator<T> {


    @Override
    public int compare(T o1, T o2) {
        return o1.getName().compareTo(o2.getName());

    }
   /**
    public int compareTo(T o) {
        System.out.println(super.getName() + " - " + o.getName());
        if (super.getAge() > o.getAge()) {
            return 1;
        }
        if (super.getAge() < o.getAge()) {
            return -1;
        }
        return 0;

    }
    **/
}
