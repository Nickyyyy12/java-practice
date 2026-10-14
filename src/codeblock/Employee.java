package codeblock;

public class Employee {
    private String name;


    static {System.out.println("员工系统启动");}
    {System.out.println("新员工入职");}
    public Employee(String name){
        this.name = name;
        System.out.println("员工 "+name+" 已创建");}
}
