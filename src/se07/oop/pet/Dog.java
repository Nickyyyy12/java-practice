package se07.oop.pet;

public class Dog extends Pet implements Washable {

    public Dog(){

    }

    public Dog(String name, int age){
        super(name, age);
    }
    @Override

    public void eat(){
        System.out.println(getName()+"在吃骨头");
    }

    @Override
    public void wash(){
        System.out.println(getName()+"在洗澡");
    }
}
