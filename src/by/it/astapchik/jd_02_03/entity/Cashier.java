package by.it.astapchik.jd_02_03.entity;

public class Cashier {
    private final String name;

    private double total;

    public Cashier(int number){
        name = "Cashier: № " + number;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return " Cashier" +
                "name='" + name + '\'' +
                ", total=" + total;
    }
}
