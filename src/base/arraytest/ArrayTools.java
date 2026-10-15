package base.arraytest;

public class ArrayTools {


    static int getSum(int[] arr ){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
             sum += arr[i];
        }
        return sum;
    }

    static int[] doubleAll(int[] arr){
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
           result[i]= arr[i] *2;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] scores = {3, 8, 5, 2};
        int r = getSum(scores);

        int[] num = {3, 8, 5, 2};
        int[] a = doubleAll(num);
        System.out.println("总和："+r);
        System.out.println("翻倍后：");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
