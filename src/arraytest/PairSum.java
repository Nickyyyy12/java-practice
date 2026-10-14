package arraytest;

public class PairSum {
    public static void main(String[] args) {
        int sum = 0;
        int[] nums = {3, 8, 5, 2};
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                sum = nums[i]+nums[j];
                System.out.println(nums[i]+"+"+nums[j] +"="+ sum);
            }
        }
    }
}
