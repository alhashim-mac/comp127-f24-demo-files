package workarea_interfaces.OnlineShop;

import java.util.HashMap;
import java.util.Map;

public class Warehouse {
    Map<String, Integer> prices;
    Map<String, Integer> stocks;

    public Warehouse() {
        this.prices = new HashMap<>();
        this.stocks = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        this.prices.put(product, price);
        this.stocks.put(product, stock);
    }

    public int price(String product) {
        if(prices.containsKey(product)) return prices.get(product);
        return -99;
    }

    public int stock(String product) {
        if(stocks.containsKey(product)) return stocks.get(product);
        return 0;
    }

    public boolean take(String product) {
        if(stock(product) >= 1) {
            stocks.replace(product, stock(product)-1);
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        // Warehouse warehouse = new Warehouse();
        // warehouse.addProduce("milk", 3, 10);
        // warehouse.addProduce("coffee", 5, 7);

        // System.out.println("prices:");
        // System.out.println("milk: " + warehouse.price("milk"));
        // System.out.println("coffee: " + warehouse.price("coffee"));
        // System.out.println("sugar: " + warehouse.price("sugar"));

        Warehouse warehouse = new Warehouse();

        warehouse.addProduct("coffee", 5, 1);

        System.out.println("stock:");
        System.out.println("coffee:  " + warehouse.stock("coffee"));
        System.out.println("sugar: " + warehouse.stock("sugar"));

        System.out.println("taking coffee " + warehouse.take("coffee"));
        System.out.println("taking coffee " + warehouse.take("coffee"));
        System.out.println("taking sugar " + warehouse.take("sugar"));

        System.out.println("stock:");
        System.out.println("coffee:  " + warehouse.stock("coffee"));
        System.out.println("sugar: " + warehouse.stock("sugar"));
    }
}
