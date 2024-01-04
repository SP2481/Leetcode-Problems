
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int minOperations(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>();
        int Operations = 0;
        for (int i : nums) {
            count.put(i, count.getOrDefault(i, 0) + 1);
        }
        for (int value : count.values()) {
            if (value == 1)
                return -1;
            Operations += value / 3;
            if (value % 3 != 0) {
                Operations++;
            }
        }
        return Operations;

    }
}