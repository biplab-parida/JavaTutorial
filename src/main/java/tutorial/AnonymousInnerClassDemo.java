package tutorial;

import tutorial.Interface.FunctionalDemo;

public class AnonymousInnerClassDemo {
    public static int c =1; // Declared at class level

    public static void main(String[] args) {

        FunctionalDemo demo = new FunctionalDemo()
        {
            int a=10;
            @Override
            public void test() {
                System.out.println(this.a);
            }
        };

        int b=1;
        FunctionalDemo demo2 = ()->{
            int a=5;
//            b=10;
            c=20;
//        System.out.println(this.a);
            System.out.println(a+ "   " +b);
        };
        demo2.test();
    }
}
