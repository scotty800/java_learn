import java.util.HashMap;

public class test_ex_4 {

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map  = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int complement = target - num;

            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(num, i);
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);
        if (result != null) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No solution found.");
        }
    }
}

