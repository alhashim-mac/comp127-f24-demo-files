package workarea_interfaces.InterfaceInABox;

import java.util.ArrayList;
import java.util.List;

public class Box implements Packable {
    final double maxCapacity;
    private List<Packable> items;

    public Box(double maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.items = new ArrayList<>();
    }

    public boolean add(Packable packable) {
        if(weight() + packable.weight() <= this.maxCapacity) {
            this.items.add(packable);
            return true;
        }
        return false;
    }

    public double weight() {
        double weight = 0;
        for (Packable packable : items) {
            weight += packable.weight();
        }

        return weight;
    }

    @Override
    public String toString() {
        return "Box: " + this.items.size() + " items, total weight " + weight() + " kg";
    }
}
