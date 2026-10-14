package oop.animal;

public class Duck implements oop.animal.Flyable, Swimmable {
    @Override
    public void fly(){
        System.out.println("鸭子扑腾着飞");
    }

    @Override
    public void swim(){
        System.out.println("鸭子在池塘游");
    }
}
