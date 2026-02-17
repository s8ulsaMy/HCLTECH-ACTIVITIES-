import stock.Inventory;

public class Order {

    public static void placeOrder(Inventory item, int orderQty) {

        if (orderQty <= item.quantity) {

            item.quantity -= orderQty;
            System.out.println("Invoice generated");

            if (item.quantity < item.lowOrderLevelQuantity) {
                System.out.println("RFM generated");
            }

        } else {
            System.out.println("Stock not available");
        }
    }
}
