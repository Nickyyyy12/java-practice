package se07.oop.pet;

public class Cat extends Pet implements Washable {

    public Cat(){

    }

    public Cat(String name,int age){
        super(name, age);
    }

    @Override
    public void eat(){
        System.out.println(getName()+"在吃鱼");
    }

    @Override
    public void wash(){
        System.out.println(getName()+"在洗澡");
    }


}
