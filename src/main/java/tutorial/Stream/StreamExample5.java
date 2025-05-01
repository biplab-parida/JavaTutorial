package tutorial.Stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample5 {
    public static void main(String[] args) {

        //Filter Names having length > 4
        List<String> names = Arrays.asList("Biplab","ansh","Virat","Rohit");
        List<String> nameFiltered = names.stream().filter(x->x.length()>4).toList();
        System.out.println(nameFiltered);

        //Squaring and sorting numbers
        List<Integer> num = Arrays.asList(10,5,2,16,9,16,2);
        System.out.println(num.stream().map(x->x*x).sorted().toList());

        //Summing Values
        System.out.println(num.stream().reduce(Integer::sum).get());

        //Counting occurence of character
        String s = "Hello World";
        //Stream<Character> ch = Arrays.stream(s.toCharArray());
        // Character array cannot be converted to stream

        System.out.println(s.chars().filter(x->x=='l').count());

        //Average of all numbers
        System.out.println(num.stream().reduce((x,y)->x+y).get()/num.size());

        //Number Starts with 1
        System.out.println(num.stream()
                .map(x->x.toString()) //convert to String
                .filter(x->x.startsWith("1")) //filter
                .map(x->Integer.valueOf(x))  //convert back to Int
                .toList()); // convert stream to list

        //get duplicate
        System.out.println(num.stream().filter(x->Collections.frequency(num,x)>1).collect(Collectors.toSet()));

        //Max value from list

        int maxValue = num.stream().max(Integer::compareTo).get(); //might net NoSuchElementException when list is empty

        num.stream().max(Integer::compareTo).ifPresent(System.out::println); // this handles empty list

        int max2 = num.stream().sorted((a,b)-> b-a).findFirst().get(); //Find max
        System.out.println(max2);
        System.out.println(num.stream().sorted((a,b)-> b-a).distinct().skip(1).findFirst().get());  // Find 2nd Max

    }
}
