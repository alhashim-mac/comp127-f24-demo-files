package c1101_streams;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toList;

import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class CollectionCollectorCollect {
    public static void main(String[] args) {
        // collect stream elements into a list
        Stream<Integer> evenNumStream = Stream.iterate(0, i -> i + 2);
        List<Integer> evenNumList = 
        evenNumStream
        .limit(10)
        .collect(toList());
        System.out.println(evenNumList);
        

        // group stream elements into a map
        evenNumStream = Stream.iterate(0, i -> i + 2);
        Map<Boolean, List<Integer>> multipleOf4 =
        evenNumStream
        .limit(10)
        .collect(groupingBy(i -> i%4==0));
        System.out.println(multipleOf4);
        
        // count stream elements
        // using collect
        evenNumStream = Stream.iterate(0, i -> i + 2);
        long numEven = 
            evenNumStream
            .limit(10)
            .collect(counting());
        System.out.println(numEven);
        // using count
        evenNumStream = Stream.iterate(0, i -> i + 2);
        numEven = 
            evenNumStream
            .limit(10)
            .count();
        System.out.println(numEven);

    }
}
