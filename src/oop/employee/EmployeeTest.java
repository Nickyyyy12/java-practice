package oop.employee;

public class EmployeeTest {
    public static void main(String[] args) {
        // 多态：父类变量指向子类对象
        Employee e1 = new Employee("李准", 25, 11000);
        Employee m2 = new Manager("张经理", 40, 15000, 5000);

        e1.work();   // 李准正在工作
        m2.work();   // 张经理正在管理团队 ← 执行的是子类版本

        System.out.println("--------");

        // 多态的威力：一个方法处理所有类型
        doWork(e1);
        doWork(m2);
    }

    // 参数是父类型，能接收任何子类对象
    public static void doWork(Employee e) {
        e.work();
    }
}