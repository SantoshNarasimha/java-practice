// Print only values that are greater than zero

import java.util.List;

class PositiveNumberFilter {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(2, 0, 1, -1, 9);

        // Using the .forEach() method
        // numbers.forEach(n -> { if (n > 0) { System.out.println(n); } });

        // Enhanced for loop
        for (Integer num : numbers) {
            if (num > 0) {
                System.out.println(num);
            }
        }

    }
}