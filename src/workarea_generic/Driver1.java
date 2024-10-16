package workarea_generic;

public class Driver1 {
    public static void main(String[] args) {
        CoffeeBean cb = new CoffeeBean(10);
        DriverHelper.applyDiscount(cb.getPrice(), .5);
        System.out.println(cb.getPrice());
    }
}
