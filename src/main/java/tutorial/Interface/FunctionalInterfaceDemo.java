package tutorial.Interface;

@FunctionalInterface
interface AInterface{
    int showI(int i, int j);
}

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
      AInterface obj = (i,  j) -> i+j;
        obj.showI(4,5);

    }
}
