class A {
    A() {
        System.out.println("Inside A");
    }
    A(int a) {
        System.out.println("Inside A int");
    }
}

class B extends A {
    B() {
        System.out.println("Inside B");
    }
    B(int i)
    {
        this();
        System.out.println("Inside B int ");
    }
}

public class SuperThisExample {
    public static void main(String[] args) {
        B obj = new B(5);

    }
}
