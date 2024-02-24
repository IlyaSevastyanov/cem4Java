package domen;

/**
 * Класс Student
 * Представляет собой структуру для создания объектов типа "Student" с идентификатором студентов и генератором id
 */
public class Student extends Person implements Comparable<Student> {
    private int id;
    private static int idGenerate;

    /**
     * Конструктор класса Student
     *
     * @param name имя студента
     * @param age  возраст студента
     */
    public Student(String name, int age) {
        super(name, age);
        idGenerate++;
        this.id = idGenerate;
    }

    /**
     * Метод для получения идентификатора студента
     *
     * @return идентификатор студента
     */
    public int getId() {
        return id;
    }

    /**
     * Переопределенный метод toString для вывода информации о студенте
     *
     * @return строковое представление объекта Student
     */
    @Override
    public String toString() {
        return "Student{" + "id = " + id + ", name = " + super.getName() + ", age: " + super.getAge() + ")";
    }

    /**
     * @param o the object to be compared.
     * @return возвращает:
     * 0, если значения равны;
     * -1, если вызываемый объект меньше o;
     * +1, если вызываемый объект больше o.
     * @apiNote Метод для сравнения студентов по возрасту и по id
     */
    @Override
    public int compareTo(Student o) {
        System.out.println(this.getName() + " - " + o.getName());
        if (this.getAge() > o.getAge()) {
            return 1;
        }
        if (this.getAge() < o.getAge()) {
            return -1;
        }
        return 0;
    }
}
