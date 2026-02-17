package project_1.stock;

public class Inventory {
    protected int quantity;
    protected int lowOrderLevelQuantity;

    public Inventory(int q, int l) {
        quantity = q;
        lowOrderLevelQuantity = l;
    }

    public void display() {
        System.out.println(quantity + " " + lowOrderLevelQuantity);
    }
}
