package arraytest;

public class ArrayMax {
    static int getMax(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {

            if (max < arr[i]){

                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] r = {-5, -2, -9};

        System.out.println("最大值：" +getMax(r));
    }

}