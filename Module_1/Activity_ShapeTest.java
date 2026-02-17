interface Spatial { }   // marker interface

abstract class Shape {

    abstract double area();
    abstract double volume();
}

// ---------------- 2D SHAPES ----------------

class Rectangle extends Shape {

    double l, w;

    Rectangle(double l, double w) {
        this.l = l;
        this.w = w;
    }

    double area() {
        return l * w;
    }

    double volume() {
        return -1;
    }
}

class Triangle extends Shape {

    double b, h;

    Triangle(double b, double h) {
        this.b = b;
        this.h = h;
    }

    double area() {
        return 0.5 * b * h;
    }

    double volume() {
        return -1;
    }
}

// ---------------- 3D SHAPES ----------------

class Cube extends Shape implements Spatial {

    double l, w, h;

    Cube(double l, double w, double h) {
        this.l = l;
        this.w = w;
        this.h = h;
    }

    double area() {
        return 2 * (l*w + l*h + w*h);
    }

    double volume() {
        return l * w * h;
    }
}

class Sphere extends Shape implements Spatial {

    double r;

    Sphere(double r) {
        this.r = r;
    }

    double area() {
        return 4 * Math.PI * r * r;
    }

    double volume() {
        return (4.0/3) * Math.PI * r * r * r;
    }
}

// ---------------- MAIN CLASS ----------------

public class Activity_ShapeTest {

    public static void main(String[] args) {

        Shape[] s = new Shape[5];

        s[0] = new Rectangle(4, 5);
        s[1] = new Triangle(3, 6);
        s[2] = new Cube(2, 3, 4);
        s[3] = new Sphere(3);
        s[4] = new Rectangle(7, 2);

        for (Shape shape : s) {

            System.out.println("Area = " + shape.area());

            if (shape instanceof Spatial) {
                System.out.println("Volume = " + shape.volume());
            }

            System.out.println("------");
        }
    }
}

