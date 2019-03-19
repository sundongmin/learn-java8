package com.github.stream;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SimpleMapToList {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(23, "Mahesh");
        map.put(10, "Suresh");
        map.put(26, "Dinesh");
        map.put(11, "Kamlesh");

        List<String> valueList = map.values().stream().collect(Collectors.toList());
        valueList.forEach(System.out::println);

        List<String> sortedValueList = map.values().stream().sorted().collect(Collectors.toList());
        sortedValueList.forEach(System.out::println);

        List<Integer> keyList = map.keySet().stream().collect(Collectors.toList());
        keyList.forEach(System.out::println);

        List<Integer> sortedKeyList = map.keySet().stream().sorted().collect(Collectors.toList());
        sortedKeyList.forEach(System.out::println);
    }
}
