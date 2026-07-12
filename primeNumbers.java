// print prime numbers 1 to 100 using java 8 features in one line

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class primeNumbers {

    public static void main(String[] args) {

        // noneMatch = if all conditions matches returns false and if all not matches
        // returns true

        Stream.iterate(1, n -> n + 1).limit(100)
                .filter(n -> n > 1 && IntStream.rangeClosed(2, (int) Math.sqrt(n))
                        .noneMatch(i -> n % i == 0))
                .forEach(System.out::println);

    }

}