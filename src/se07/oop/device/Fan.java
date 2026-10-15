package se07.oop.device;

class Fan extends Device implements Chargeable {
    private int speed;

    public Fan(){
    }

    public Fan(String brand,double price,int speed){
        super(brand, price);
        this.speed = speed;
    }

    @Override
    public void start(){
        System.out.println(getBrand()+"风扇启动，档位"+speed);
    }

    @Override
    public void charge(){
        System.out.println("风扇正在充电");
    }
}
