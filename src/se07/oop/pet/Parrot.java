package se07.oop.pet;

public class Parrot extends Pet implements Flyable {
    public Parrot(){

    }

    public Parrot(String name, int age){
        super(name, age);
    }
    @Override
    public void eat(){
        System.out.println(getName()+"在吃谷子");
    }

    @Override
    public void fly(){
        System.out.println(getName()+"在飞");
    }
}
