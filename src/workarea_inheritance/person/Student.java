package workarea_inheritance.person;

public class Student extends Person {
    private double gpa;

    public Student(String name, String address, double gpa) {
        super(name, address);
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public static void main(String[] args) {
        Student student = new Student("Zafeer", "1606 Grand Ave", 4.0);
        System.out.println(student instanceof Student);
        System.out.println(student instanceof Person);
        System.out.println(student instanceof Object);
    }
}
