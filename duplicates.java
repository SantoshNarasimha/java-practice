import java.util.*;
import java.util.stream.Collectors;

class duplicates {

    public static void main(String[] args) {

        List<Integer> nums = List.of(1, 2, 3, 2, 1, 4, 5, 6, 7, 8);

        Map<Integer, Long> a = nums.stream().collect(Collectors.groupingBy(n -> n, Collectors.counting()));

        a.forEach((key, value) -> System.out.println(key + " " + value));

    }

}