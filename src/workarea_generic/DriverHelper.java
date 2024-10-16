package workarea_generic;

public class DriverHelper {
    public static void applyDiscount(CoffeeBean cb, double d) {
        cb.setPrice(cb.getPrice() * d);
    }

    public static void applyDiscount(double price, double d) {
        price = price * d;
    }
}
