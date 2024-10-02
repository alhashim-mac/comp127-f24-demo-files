package workarea_inheritance.person;

public class Employee extends Person {
    private String id;

    public Employee(String name, String address, String id) {
        super(name, address);
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
