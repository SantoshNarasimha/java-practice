// Print Even and Odd Numbers

import java.util.List;

class PrintEvenOdd {

    public static void main(String[] args) {

        List<Integer> evenNumbers = List.of(2, 3, 4, 5, 8);
        List<Integer> oddNumbers = List.of(2, 3, 4, 5, 8);

        System.out.println("\nPrinting even numbers:\n");

        evenNumbers.forEach(n -> {
            if (n % 2 == 0) {
                System.out.println(n);
            }
        });

        System.out.println("\nPrinting odd numbers:\n");

        for (Integer n : oddNumbers) {
            if (n % 2 != 0) {
                System.out.println(n);
            }
        }

    }
}