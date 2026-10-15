package se07.oop.device;

public abstract class Device {
    private String brand;
    private double price;

    public Device(){

    }

    public Device(String brand, double price){
        setBrand(brand);
        setPrice(price);
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setPrice(double price){
        if (price < 0){
            System.out.println("错误");
            return;
        }
            this.price = price;
    }

    public double getPrice(){
        return this.price;
    }

    public abstract void start();
    public void printInfo(){
        System.out.println("品牌：" + this.brand);
        System.out.println("价格：" + this.price);
    }
}
