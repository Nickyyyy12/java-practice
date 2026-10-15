package se08.innerclass;

public class Student {
    private String  name;

    public Student(String name){

        this.name = name;
    }

    class Bag{
        void showOwner(){
            System.out.println("这是"+name+"的书包");
        }
    }
}
