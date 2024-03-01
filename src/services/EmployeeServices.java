package services;

import domen.Employee;
import domen.PersonComparator;
import java.util.ArrayList;
import java.util.List;

/**
 * Класс для работы с сотрудниками.
 */
public class EmployeeServices implements iPersonService<Employee> {
    private int count;
    private List<Employee> employeeList;

    /**
     * Конструктор класса EmployeeServices.
     * Создает новый экземпляр класса с пустым списком сотрудников.
     */
    public EmployeeServices() {
        employeeList = new ArrayList<Employee>();
    }

    /**
     * Возвращает список всех сотрудников.
     *
     * @return Список всех сотрудников.
     */
    @Override
    public List<Employee> getAll() {
        return this.employeeList;
    }

    /**
     * Создает нового сотрудника и добавляет его в список.
     * Увеличивает счетчик количества сотрудников.
     *
     * @param name Имя нового сотрудника.
     * @param age  Возраст нового сотрудника.
     */
    @Override
    public void create(String name, int age) {
        Employee newEmployee = new Employee(name, age, "разнорабочий");
        this.employeeList.add(newEmployee);
        this.count++;


    }

    /**
     * Сортирует список сотрудников по ФИО (фамилия, имя, отчество).
     * Использует компаратор PersonComparator для сравнения сотрудников.
     */
    public void sortByFIO() {
        this.employeeList.sort(new PersonComparator<Employee>());
    }
}
