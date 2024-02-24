package domen;

/**
 * Абстрактный класс Person
 * Представляет собой структуру для создания объектов типа "Person" с именем и возрастом.
 */
public abstract class Person {
    private String name;
    private int age;
    private int group;

    /**
     * Конструктор класса Person
     *
     * @param name имя персоны
     * @param age  возраст персоны
     */
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * Метод для получения имени персоны
     *
     * @return имя персоны
     */
    public String getName() {
        return name;
    }

    /**
     * Метод для установки имени персоны
     *
     * @param name новое имя персоны
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Метод для получения возраста персоны
     *
     * @return возраст персоны
     */
    public int getAge() {
        return age;
    }

    /**
     * Метод для установки возраста персоны
     *
     * @param age новый возраст персоны
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Переопределенный метод toString для вывода информации о персоне
     *
     * @return строковое представление объекта Person
     */
    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + ", age=" + age + '}';
    }
}
