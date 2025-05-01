package tutorial.Interface;

import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<Integer> s = () ->100;
        System.out.println(s.get());
    }
}
