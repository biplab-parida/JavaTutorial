package tutorial.Interface;

interface Parent {
    default void sayHello() {
        System.out.println("Hello");
    }
}

class Child implements Parent {

}

public class InterfaceDemo {
    public static void main(String[] args) {
        Child c = new Child();
        c.sayHello();
    }
}
