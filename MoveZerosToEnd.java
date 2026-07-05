// Move Zeros to end using Java 8 feature

import java.util.*;
import java.util.stream.*;

class MoveZerosToEnd {

    public static void main(String[] args) {

        List<Integer> a = List.of(1, 3, 2, 5, 0, 1, 0, 2, 0, -2);

        List<Integer> b = Stream.concat(a.stream().filter(n -> n != 0), a.stream().filter(n -> n == 0))
                .collect(Collectors.toList());

        System.out.println(b);

    }

}