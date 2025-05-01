package tutorial.Interface;

public class LambdaDemo {
    public static void main(String[] args) {
        FunctionalDemo demo = ()-> System.out.println("test");
        demo.test();
    }
}
