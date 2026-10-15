package se07.oop.shape;

public class Abstracttest  {
    public static void main(String[] args) {
        Shape s1 = new Shape.Circle("红色", 5);
        s1.draw();
        s1.showColor();
        System.out.println("面积：" + s1.getArea());

        System.out.println("--------");

        Shape s2 = new Rectangle("蓝色", 4, 6);
        s2.draw();
        s2.showColor();
        System.out.println("面积：" + s2.getArea());

    }
}
