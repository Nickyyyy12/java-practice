package base.arraytest;

public class Grade {
    public static void main(String[] args) {
        int[] scores = {72,85,60,93,78,45 };
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] >=90) {
                System.out.println(scores[i]+": 优秀");
            }else if (scores[i] >=75 && scores[i]<=89) {
                System.out.println(scores[i] + ": 良好");
            }else if (scores[i] >=60 && scores[i]<=74) {
                System.out.println(scores[i] + ": 及格");
            }else {
                System.out.println(scores[i] + ": 不及格");
            }
        }
    }
}
