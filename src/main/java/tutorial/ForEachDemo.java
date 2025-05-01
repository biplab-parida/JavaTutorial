import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachDemo {

    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(5,21,43,34,9);
        li.forEach(System.out::println);
//        simple for loop
        for(int i=0; i<li.size();i++)
            System.out.println(li.get(i));

        //Enhanced for loop
        for(int i: li)
            System.out.println(i);

//        Foreach loop
        li.forEach(n -> {
            System.out.println(n);
        } );

        Consumer<Integer> con =(Integer i)-> System.out.println(i);



    }
}
