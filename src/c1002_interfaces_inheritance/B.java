package c1002_interfaces_inheritance;

public class B extends A {
    private int b;

    public B(int a, int b) {
        super(a);
        this.b = b;
    }

    public int getB() {
        return b;
    }

    public void printA() {
        System.out.println("B has " + getA());
    }
}
