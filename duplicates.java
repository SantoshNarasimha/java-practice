// return the duplicate elements from list

import java.util.*;
import java.util.stream.Collectors;

class duplicates {

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(List.of(1, 2, 3, 2, 1, 4, 5, 6, 7, 8));

        Map<Integer, Long> a = nums.stream().collect(Collectors.groupingBy(n -> n, Collectors.counting()));

        // Assuming your map is called 'myMap'
        Set<Integer> b = a.entrySet().stream().filter(entry -> entry.getValue()  1).map(Map.Entry::getKey)
                .collect(Collectors.toSet());

        System.out.println(b);

        // another way to print duplicate elements
        // a.keySet().forEach(System.out::println);

        // regular way to print
        // a.forEach((key, value) -> System.out.println(key));
        

    }

}