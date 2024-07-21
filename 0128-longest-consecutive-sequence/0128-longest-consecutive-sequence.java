class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int currLen = 1;
        int maxLen = 0;
        if(nums.length > 1) {
            for(int i = 0; i < nums.length -1; i++) {
                if(nums[i + 1] != nums[i]) {
                    if(nums[i + 1] - nums[i] == 1) {
                        currLen += 1;
                    } else {
                        maxLen = Math.max(currLen, maxLen);
                        currLen = 1;
                    }
                }
            }
            maxLen = Math.max(currLen, maxLen);
            return maxLen;
        } else { 
            return nums.length;
        }
    }
}