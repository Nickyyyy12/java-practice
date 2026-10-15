package base.basics;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] scores = {90, 85, 78, 92, 88};

        System.out.println("第一个：" + scores[0]);
        System.out.println("最后一个：" + scores[scores.length - 1]);

        System.out.println("所有成绩：");
        for (int i = 0; i<scores.length; i++){
            System.out.println("第" + (i + 1) + "个：" + scores[i]);
        }
    }
}
