package by.it.konon.jd02_01.entity;

public class Goods {

    private final String[] goods;

    public Goods() {
        this.goods = new String[]{ "garlic", "salt", "onion", "tomato", "potatoes"};
    }

    public String[] getGoods() {
        return goods;
    }
}