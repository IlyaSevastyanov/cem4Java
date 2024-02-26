package services;

import domen.Empoyee;
import domen.PersonComparator;
import java.util.ArrayList;
import java.util.List;

public class EmpoyeeServices implements iPersonService<Empoyee> {
    private int count;
    private List<Empoyee> empoyeeList;

    public EmpoyeeServices() {
        this.empoyeeList = new ArrayList<Empoyee>();
    }

    @Override
    public List<Empoyee> getAll() {
        return this.empoyeeList;
    }

    @Override
    public void create(String name, int age) {
        Empoyee newEmployee = new Empoyee(name,age, "разнорабочий");
        this.empoyeeList.add(newEmployee);
        this.count++;


    }
    public void sortByFIO() {
        this.empoyeeList.sort(new PersonComparator<Empoyee>());
    }
}
