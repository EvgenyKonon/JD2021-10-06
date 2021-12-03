package by.it.drankevich.jd02_02.entity;

public class Cashier {
    private final String name;

    private double total;

    public Cashier(int number) {
        this.name = "Cashier №"+number;
    }

    public String getName() {
        return name;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = this.total+total;
    }

    @Override
    public String toString() {
        return "\t"+ name+" TOTAL "+total+" ";

    }
}