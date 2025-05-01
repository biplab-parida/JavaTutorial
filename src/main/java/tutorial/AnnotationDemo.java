class A1{
    public void show(){
        System.out.println("In A1");
    }
}
class B1 extends A1{
    @Override
    public void show(){
        System.out.println("In B1");
    }
}


public class AnnotationDemo {
    public static void main(String[] args) {
        B1 obj = new B1();
        obj.show();
    }
}
