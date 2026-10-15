package se08.lambda1;

public class Main {
    static void printCheck(Checker checker, int score){
        System.out.println("结果："+checker.check(score));
    }

    public static void main(String[] args) {

        printCheck(score -> {

            return score>=60;
        },75);

        printCheck(score -> score>=90,75);
    }
}
