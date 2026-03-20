
public class test_ex_3 {

    public static Integer findMaximum(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }

        int maxNum = nums[0];

        for (int n : nums) {
            if (n > maxNum) {
                maxNum = n;
            }
        }
        return maxNum;
    }

    public static void main(String[] args) {
        int[] nums = {3, 5, 7, 2, 9};
        System.out.println(findMaximum(nums)); // 9
    }
}