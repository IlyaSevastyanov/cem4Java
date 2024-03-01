package domen;

/**
 * Класс Teacher
 * Представляет собой учителя.
 */
public class Teacher extends WorkingPerson {
    private String degree;

    /**
     * Конструктор класса Teacher
     *
     * @param name имя учителя
     * @param age  возраст учителя
     */
    public Teacher(String name, int age,String degree ) {
        super(name, age);
        this.degree = degree;
    }

    /**
     * Возвращает строковое представление объекта Teacher.
     * @return Строковое представление объекта Teacher.
     */
    @Override
    public String toString() {
        return "Teacher {" + "name=" + super.getName() + ", age=" + super.getAge()+
                ", degree='" + degree + '\'' +
                '}';
    }
}