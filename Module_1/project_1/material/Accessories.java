package project_1.material;
import stock.Inventory;

public class Accessories extends Accesories {

    int id;
    String desc;

    public Accessories(int q, int id, String desc) {
        super(q, 5);
        this.id = id;
        this.desc = desc;
    }

    public void show() {
        display();
        System.out.println(id + " " + desc);
    }
}
