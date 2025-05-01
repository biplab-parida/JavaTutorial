package tutorial;

import java.util.*;

public class IterationExample {
    public static void main(String[] args) {

        //Iterate Arrays

        int arr[] = new int[]{1, 2, 3, 4, 5};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        for (int j : arr) {
            System.out.println(j);
        }

        Arrays.stream(arr).forEach(x -> System.out.println(x));
        Arrays.stream(arr).forEach(System.out::println);

        //Iterate List

//Iterate Lists
        List<String> list = Arrays.asList("apple", "banana", "cherry");

//Normal for loop
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }


//Enhanced for loop
        for (String fruit : list) {
            System.out.println(fruit);
        }

//Iterator
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

//ListIterator
        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

//Streams

        list.stream().forEach(System.out::println);
        list.forEach(System.out::println);


        Map<String, Integer> map = Map.of("apple", 1, "banana", 2, "cherry", 3);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

//Using KeySet

        for (String key : map.keySet()) {
            System.out.println(key + " = " + map.get(key));
        }

//foreach
        map.forEach((key, value) -> System.out.println(key + " = " + value));

        //Use foreach for operation
        List<String> bigFruits = new ArrayList<>();

        map.forEach((key, value) -> {
            if (value > 1) {
                bigFruits.add(key);
            }
        });

        System.out.println(bigFruits);
    }

}
