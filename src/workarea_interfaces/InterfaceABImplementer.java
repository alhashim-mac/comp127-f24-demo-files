package workarea_interfaces;

public class InterfaceABImplementer implements InterfaceA, InterfaceB {

    @Override
    public String read() {
        return "Hello from " + this.getClass();
    }

    public static void main(String[] args) {
        InterfaceABImplementer i = new InterfaceABImplementer();
        System.out.println(i.read());

        System.out.println(InterfaceA.val1);
    }
}
