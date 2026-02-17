static int totalQty = 0;

public Laptops(int q, int id, String desc) {
    super(q, 3);
    totalQty += q;
}

public static void showTotal() {
    System.out.println("Total Laptops = " + totalQty);
}
