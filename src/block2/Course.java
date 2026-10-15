package block2;

public class Course {
    String title;

    static {System.out.println("静态块：课程系统启动");}
    {System.out.println("实例块：创建课程");}
    public Course(String title){
        this.title = title;
        System.out.println("构造器："+title);
    }
}
