package oop.animal;

// 父类
class Person {
    String name;
    int age;

    public void eat() {
        System.out.println(name + "正在吃饭");
    }

    public void sleep() {
        System.out.println(name + "正在睡觉");
    }
}

// 子类：学生
class Pupil extends Person {
    double score;

    public void study() {
        System.out.println(name + "正在学习，成绩是" + score);
    }
}

// 子类：老师
class Teacher extends Person {
    double salary;

    public void teach() {
        System.out.println(name + "正在教课，工资是" + salary);
    }
}

public class InheritDemo {
    public static void main(String[] args) {
        Pupil s = new Pupil();
        s.name = "张三";      // 继承来的属性
        s.age = 20;           // 继承来的属性
        s.score = 90.5;       // 自己的属性

        s.eat();      // 继承来的方法
        s.sleep();    // 继承来的方法
        s.study();    // 自己的方法

        System.out.println("--------");

        Teacher t = new Teacher();
        t.name = "李老师";
        t.age = 35;
        t.salary = 8000;

        t.eat();
        t.teach();
    }
}