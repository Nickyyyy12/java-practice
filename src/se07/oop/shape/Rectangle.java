package se07.oop.shape;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String color, double width, double height){
        super(color);
        this.width = width;
        this.height = height;
    }
    @Override
    public void draw(){
        System.out.println("画一个矩形 □");
    }

    @Override
    public double getArea(){
        return width * height;
    }
}

