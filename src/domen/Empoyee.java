package domen;

public class Empoyee extends Person {
    private String degree;

    public Empoyee(String name, int age, String degree) {
        super(name, age);
        this.degree = degree;
    }
}
