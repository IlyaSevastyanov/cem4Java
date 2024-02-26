package domen;

/**
 * Класс Employee, расширяющий класс Person
 * Представляет собой структуру для создания объектов типа "Employee" с именем, возрастом и степенью.
 */
public class Empoyee extends WorkingPerson {
    private String degree;

    /**
     * Конструктор класса Employee
     *
     * @param name   имя сотрудника
     * @param age    возраст сотрудника
     * @param degree степень сотрудника
     */
    public Empoyee(String name, int age, String degree) {
        super(name, age);
        this.degree = degree;
    }

}
