package se08.anonymous;

public class Main {

    static void printResult(Calculator calculator,int a,int b){
        System.out.println("结果："+calculator.calc(a,b));
    }

    public static void main(String[] args) {

        printResult(new Calculator(){
            public int calc(int a, int b){
                return a+b;
            }
        },3,5);

        printResult(new Calculator() {
            public int calc(int a, int b){
                return a*b;
            }
        },3,5);

        printResult((a, b) -> {
            return a-b;
                },10,4);

        printResult((a,b)->a*b,6,7);
    }
}
