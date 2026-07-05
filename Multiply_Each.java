// Multiply Each Number

import java.util.Arrays;
import java.util.List;

class Multiply_Each {

    public static void main(String[] args) {

        List<Integer> num = Arrays.asList(1, 3, 6);

        num.forEach(n -> {

            System.out.println(n * 10);

        });

    }

}