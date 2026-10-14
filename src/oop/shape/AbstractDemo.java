package oop.shape;


abstract class Shape{
        private String color;

        public Shape(){

        }

        public Shape(String color){
            setcolor(color);
        }

        public void setcolor(String color){
            this.color = color;
        }

        public String getColor(){
            return this.color;
        }

        public abstract void draw();
        public abstract double getArea();

    public void showColor(){
            System.out.println("颜色：" + color);
        }

    static class Circle extends Shape {
        private double radius;

        public Circle(String color, double radius) {
            super(color);
            this.radius = radius;
        }

        @Override
        public void draw() {
            System.out.println("画一个圆 ○");
        }

        @Override
        public double getArea() {     // ← 必须是 double，不能是 void 或 int
            return 3.14 * radius * radius;
        }
    }
}

