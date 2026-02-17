package project_1;
import material.Accessories;
import material.Laptops;

public class Test {
    public static void main(String[] args) {

        Accessories a = new Accessories(50, 101, "Mouse");
        Laptops l = new Laptops(20, 201, "Dell");

        a.show();
        l.show();
    }
}
