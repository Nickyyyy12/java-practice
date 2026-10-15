package se08.methodref;

public class Main {
    static void printCheck(Checker checker, int score){
        System.out.println("结果："+checker.check(score));
    }

    static boolean isPass(int score){
        return score>=60;
    }

    public static void main(String[] args) {

        printCheck(Main::isPass,75);
        printCheck(Main::isPass,50);

        PassLine line60 = new PassLine(60);
        PassLine line90 = new PassLine(90);

        printCheck(line60::isPass,75);
        printCheck(line90::isPass,75);
    }

}
