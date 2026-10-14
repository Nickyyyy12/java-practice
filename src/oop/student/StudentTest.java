package oop.student;

public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("张三");
        s1.setAge(20);
        s1.setScore(80.5);

        Student s2 = new Student();
        s2.setName("李四");
        s2.setAge(39);
        s2.setScore(20);

        s1.study();
        s1.printInFo();

        s2.study();
        s2.printInFo();


    }
}
