package c1002_interfaces_inheritance;

public abstract class A extends Object {
    private int a;

    public A(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public abstract void printA();
}
