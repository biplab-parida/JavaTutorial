package tutorial.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample2 {
    public static void main(String[] args) {
        List<String> li = Arrays.asList("apple","Orange","grapes");
        String[] ar = {"apple","Orange","grapes"};

        Stream<String> stream = Arrays.stream(ar);
        Stream<String> liStream = li.stream();

        Stream<Integer> liStream2 = Stream.of(1,2,3);

        //seed is starting value
        // 2nd parameter is increament like n++ in for loop [written in lambda]
        //limit is max value till which it will iterate
        Stream<Integer> limit = Stream.iterate(0, n->n+1).limit(100);

        Stream<Integer> limit1 = Stream.generate(()->(int)Math.random()).limit(5);

    }
}
