package tutorial.Interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class PredicateDemo {

    public static void main(String[] args) {
        //Simple comparison which return boolean
        Predicate<Integer> p = x->x>1000;
        System.out.println(p.test(900));

        Predicate<Integer> iseven = x->x%2 ==0;
        List<Integer> li = Arrays.asList(1,2,3,4,5);
        for(int i : li)
            System.out.println(i+" "+iseven.test(i));

        Predicate<Integer> isGreaterThan10 = x->x>10;
        // and , or can be used to combine different prdicate
        Predicate<Integer> pred = iseven.and(isGreaterThan10);

        System.out.println(pred.test(8));
        System.out.println( iseven.and(isGreaterThan10).test(8) );
        System.out.println( iseven.or(isGreaterThan10).test(8) );
        System.out.println( iseven.negate().test(8) );
    }
}
