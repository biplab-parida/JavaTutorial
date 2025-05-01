package tutorial.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample3 {
    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(1,2,3,4,15,18,5,6,7,8,8);
        //.filter() takes Predicate [Takes Input and returns boolean]
        List<Integer> filteredList = li.stream().filter(x->x%2==0).collect(Collectors.toList());
        System.out.println(filteredList);
        //.map() takes function [takes input and returns output]
        List<Integer> mappedList = filteredList.stream()
                .map(x->x*2)
                .distinct()
                .sorted((a,b)->(b-a) ) // sorting in descending order
                .limit(3)
                .skip(1)
                .collect(Collectors.toList());
        System.out.println(mappedList);
    }
}
