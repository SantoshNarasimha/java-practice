// sort the map by value

import java.util.*;
import java.util.Map;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class SortMapValue {

    public static void main(String[] args) {

        Map<String, Integer> names = new LinkedHashMap<>();

        names.put("santosh", 7);
        names.put("narasimha", 9);
        names.put("yogi", 4);

        // names.entrySet() = names.entrySet() extracts all the pairs (both keys and
        // values together, not just the values) from your map and holds them in a big
        // group.
        // Map.Entry = It is simply a container that holds exactly one Key and its
        // matching Value tied together.

        LinkedHashMap<String, Integer> new_map = names.entrySet().stream().sorted(Map.Entry.comparingByKey())
                .collect(Collectors
                        .toMap(Map.Entry::getKey, Map.Entry::getValue, (old_value, new_value) -> new_value,
                                LinkedHashMap::new));

        new_map.forEach((key, value) -> System.out.println(key + " " + value));

    }
}