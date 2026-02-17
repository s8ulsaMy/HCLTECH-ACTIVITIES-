package project_1.material;
import stock.Inventory;

public class Laptops extends Accesories {

    int id;
    String desc;

    public Laptops(int q, int id, String desc) {
        super(q, 3);
        this.id = id;
        this.desc = desc;
    }

    public void show() {
        display();
        System.out.println(id + " " + desc);
    }
}
