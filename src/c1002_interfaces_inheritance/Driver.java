package c1002_interfaces_inheritance;

import java.util.List;
import java.util.ArrayList;

public class Driver {
    public static void main(String[] args) {
        // A x = new A(10);
        // x.printA();

        // B y = new B(6, 60);
        // y.printA();

        // A y = new B(6, 60);
        // y.printA();

        List<A> list = new ArrayList<>();
        list.add(new B(10, 20));
        list.add(new C(30, 40));
        for(A a : list) {
            a.printA();
        }

    }
}
