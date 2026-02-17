static int totalQty = 0;

public Accessories(int q, int id, String desc) {
    super(q, 5);
    totalQty += q;
}

public static void showTotal() {
    System.out.println("Total Accessories = " + totalQty);
}
