package oop.device;

class Phone extends Device implements Chargeable, Connectable {
    private double screenSize;

    public Phone(){

    }

    public Phone(String brand,double price,double screenSize){
        super(brand, price);
        this.screenSize = screenSize;
    }

    @Override
    public void start(){
        System.out.println(getPrice()+ "手机开机中");
    }

    @Override
    public void charge(){
        System.out.println("手机正在充电");
    }

    @Override
    public void connectWifi(){
        System.out.println("手机已连接WiFi");
    }
}
