package c1030_streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

public class CollectionsVsStreams {
    public static List<Dish> getMenu() {
        return List.of(
            new Dish("chicken", false, 400, Dish.Type.MEAT),
            new Dish("prawns", false, 300, Dish.Type.FISH),
            new Dish("french fries", true, 530, Dish.Type.OTHER),
            new Dish("rice", true, 350, Dish.Type.OTHER),
            new Dish("seasonal fruit", true, 120, Dish.Type.OTHER)
        );
    }

    public static void main(String[] args) {
        List<Dish> menu = getMenu();
        System.out.println(menu);
        System.out.println(healthy_CollectionApproach(menu));
        System.out.println(healthy_StreamApproach(menu));

    }

    public static List<String> healthy_CollectionApproach(List<Dish> menu) {
        List<Dish> lowCaloricDishes = new ArrayList<>();
        for(Dish dish : menu) {
            if(dish.getCalories() < 400) {
                lowCaloricDishes.add(dish);
            }
        }

        Collections.sort(lowCaloricDishes, new Comparator<Dish>() {
            public int compare(Dish dish1, Dish dish2) {
                return Integer.compare(dish1.getCalories(), dish2.getCalories());
            }
        });

        List<String> lowCaloricDishesName = new ArrayList<>();
        for(Dish dish : lowCaloricDishes) {
            lowCaloricDishesName.add(dish.toString());
        }

        return lowCaloricDishesName;
    }

    public static List<String> healthy_StreamApproach(List<Dish> menu) {
        return menu.stream()
                   .filter(d -> d.getCalories() < 400)
                   .sorted(comparing(Dish::getCalories))
                   .map(Dish::toString)
                   .collect(toList());
    }
}
