enum Laptop{
    Macbook(2000), XPS(2200), Surface(1500), Thinkpad(1200);

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    private int price;

    private Laptop(int price) {
        this.price = price;
    }
}

public class EnumDemo {
    public static void main(String[] args) {
    Laptop lap = Laptop.Macbook;
        System.out.println(lap);
        System.out.println(lap.getPrice());

    }
}
