package model;

public class Dishes extends Applience {

    private String price;
    private int quantity;
    private String color;

    public Dishes(int id, String name, String price, String quantity, String color) {
        super(id, name);
        this.price = price;
        this.quantity = Integer.parseInt(quantity);
        this.color = color;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override

    public String toString() {
        return String.format("Dishes: id = %d, name = %s, price = %s, quantity = %d, color = %s", getId(), getName(), getPrice(), getQuantity(), getColor());
    }
}
