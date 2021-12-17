package by.it.astapchik.jd02_02.entity;

public class Good {

    private final String name;
    private final double price;

    public Good(){
        this("No name", 0);
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
        return "Good: " + "Name -" + name +". " + "Price - " + price + " $";
    }
}
