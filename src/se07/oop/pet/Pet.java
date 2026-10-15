package se07.oop.pet;

public abstract class Pet {
    private String name;
    private int age;

    public Pet(){

    }

    public Pet(String name,int age){
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("年龄不能为负");
            return;
        }
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public abstract void eat();

    public void printinfo(){
        System.out.println("名字：" + this.name);
        System.out.println("年龄：" + this.age);
    }

}
