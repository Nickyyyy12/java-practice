package oop.employee;

public class Employee {
    private String name;
    private int age;
    private double baseSalary;

    public Employee(){

    }

    public Employee(String name,int age , double baseSalary){
        setName (name);
        setAge (age);
        setBaseSalary (baseSalary);
    }


    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setAge(int age ){
        if (age >65 || age<18){
            System.out.println("错误");
            return;
        }
        this.age = age;

    }
    public int getAge(){
        return this.age;
    }

    public void setBaseSalary(double baseSalary){
        if (baseSalary<0){
            System.out.println("错误");
            return;
        }
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary(){
        return this.baseSalary ;
    }

    public void work(){
        System.out.println(this.name +"正在工作");
    }

    public void printInfo(){
        System.out.println("姓名：" + this.name);
        System.out.println("年龄：" + this.age);
        System.out.println("底薪：" + this.baseSalary);
    }

}
