package arraytest;

public class Main {
    public static void main(String[] args) {
        int[] scores = {72,85,60,93,78 };
        int sum =0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i] ;
            System.out.println(scores[i]);
        }
        System.out.println("总和："+sum);
    }
}
