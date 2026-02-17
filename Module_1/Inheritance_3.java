

public class Inheritance_3 {
    int quantity;
    int lowOrderLevelQuantity;

    // Fixed: Constructor name matches the class name exactly
    public Inheritance_3(int quantity, int lowOrderLevelQuantity) {
        this.quantity = quantity;
        this.lowOrderLevelQuantity = lowOrderLevelQuantity;
    }

    public void display() {
        System.out.println("Quantity: " + quantity);
        System.out.println("Low Order Level Quantity: " + lowOrderLevelQuantity);
    }
}