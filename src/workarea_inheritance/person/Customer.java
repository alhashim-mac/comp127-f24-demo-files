package workarea_inheritance.person;

public class Customer extends Person {
    private String creditCardInfo;

    public Customer(String name, String address, String creditCardInfo) {
        super(name, address);
        this.creditCardInfo = creditCardInfo;
    }

    public String getCreditCardInfo() {
        return creditCardInfo;
    }
}
