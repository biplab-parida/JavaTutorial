package tutorial.Interface;

interface A {
    static void sayHello() {
        System.out.println("Hello");
    }

    default void sayBye() {
        System.out.println("Bye");
    }
}

public class StaticMethodInterface implements A {
    public static void main(String[] args) {
        StaticMethodInterface obj = new StaticMethodInterface();
        obj.sayBye();
        A.sayHello(); // Only way to call static method cannot call using object

    }
}
