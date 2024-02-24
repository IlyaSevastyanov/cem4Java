package domen;

/**
 * Класс Teacher
 * Представляет собой учителя.
 */
public class Teacher extends Person {
    private String degree;

    /**
     * Конструктор класса Teacher
     *
     * @param name имя учителя
     * @param age  возраст учителя
     */
    public Teacher(String name, int age) {
        super(name, age);
    }

}
