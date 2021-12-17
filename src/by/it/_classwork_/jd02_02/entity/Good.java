package by.it._classwork_.jd02_02.entity;

public class Good extends by.it.astapchik.jd02_02.entity.Good {

    private final String name;
    private final double price;

    public Good() {
        this("noname", 0);
    }

    public Good(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Good{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
