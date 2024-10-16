package c1002_interfaces_inheritance;

public class C extends A {
    private int c;
    
    public C(int a, int c) {
        super(a);
        this.c = c;
    }

    @Override
    public void printA() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'printA'");
    }
}
