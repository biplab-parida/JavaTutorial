package tutorial.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamExample4 {
    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(1,2,8,3,9,4,4,5);

        //foreach
        li.stream()
                .forEach(x-> System.out.println(x)); // foreach takes consumer

        // Convert to list .collect(Collectors.tolist()) .toList()
        List<Integer> liNew = li.stream().sorted().collect(Collectors.toList());
        List<Integer> liNew2 = li.stream().sorted().toList();

        //reduce()
        Optional<Integer> op = li.stream().reduce((x,y)->x+y); //reduce takes binaryOperator
        System.out.println(op.get());

        Optional<Integer> op2 = li.stream().reduce(Integer::sum); //min,max,sum are binaryOperator so we can use it
        System.out.println(op.get());

        //anyMatch, allMatch, noneMatch

        System.out.println( li.stream().anyMatch(x->x%2==0)); //takes predicate as input, check if any value matches the condition

        System.out.println(li.stream().allMatch(x->x>0)); //takes predicate as input, check if all values matches the condition

        System.out.println(li.stream().noneMatch(x->x>0)); //takes predicate as input, check if none values matches the condition

        //findFirst() , findAny()

        System.out.println(li.stream().findFirst().get());
        System.out.println(li.stream().findAny().get());


    }
}
