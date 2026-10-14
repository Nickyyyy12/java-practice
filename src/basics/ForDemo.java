package basics;

public class ForDemo {
    public static void main(String[] args) {
        for (int i = 1;i<=10; i++){
            System.out.println(i);
        }

        int sum = 0;
        for (int i = 0; i<=10;i++){
           sum +=i;

        }
        System.out.println("1到10的和：" + sum);

        for (int i = 0; i<=10; i++) {
            if (i % 2 == 0) {
                System.out.println(i + "是偶数");
            }
        }

    }
}