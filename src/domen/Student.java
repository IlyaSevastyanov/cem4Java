package domen;

public class Student extends Person implements Comparable<Student> {
    private int id;
    private static int idGenerate;
    public Student(String name, int age) {
        super(name, age);
        idGenerate++;
        this.id = idGenerate;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Student{" + "id = " + id +  ", name = "+ super.getName() + ", age: " + super.getAge() + ")";
    }

    @Override
    public int compareTo(Student o) {
        System.out.println(this.getName() + " - " + o.getName());
        if( this.getAge() > o.getAge()){return 1;}
        if (this.getAge() <o.getAge()) {return -1;}
        return 0;
    }
}
