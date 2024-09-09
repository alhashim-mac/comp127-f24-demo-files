package c0909_method_calls;

public class ShorthandAddSub {
    public static void main(String[] args) {
        final int MAX_COFFEE = 10;
        
        int cupsOfCoffee = 0;
        if(cupsOfCoffee < MAX_COFFEE) {
            cupsOfCoffee += 2;
        }
        else {
            cupsOfCoffee = 0;
        }

        System.out.println(cupsOfCoffee);
    }
}