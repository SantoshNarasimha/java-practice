// splits the word and find words which starts with "b"

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class SplitFind {

    public static void main(String[] args) {

        String names = "apple banana mango box been fox auto bike ";

        List<String> word = Stream.of(names.split(" ")).filter(n -> n.startsWith("b")).collect(Collectors.toList());

        System.out.println(word);

        // String[] words = names.split(" ");

        // List<String> word = Stream.of(words).filter(n ->
        // n.startsWith("b")).collect(Collectors.toList());

    }

}