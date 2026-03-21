import java.util.HashMap;
import java.util.Map;

public class Main {

    public static Map<Integer, Integer> countOccurrences(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        return map;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3, 1, 1};

        System.out.println(countOccurrences(nums));
    }
}