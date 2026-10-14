package oop.student;

public class Student {
    private String name;
    private int age;
    private double score;

    public Student(){

    }

    public Student(String name, int age, double score){
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;

    }

    public void study(){
        System.out.println(name+"正在学习");

    }


    public void setAge(int age){
        if (age<0 || age>150){
            System.out.println("不合法");
            return;
        }
        this.age = age;
    }

    public int getAge(){
        return this.age;

    }

    public void setScore(double score) {
        if (score < 0 || score > 100) {
            System.out.println("成绩不合法！");
            return;
        }
        this.score = score;
    }

    public double getScore() {
        return this.score;
    }


    public void printInFo () {
            System.out.println("姓名：" + name);
            System.out.println("年龄：" + age);
            System.out.println("成绩：" + score);
        }


    }


