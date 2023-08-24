class Solution {
    public int minimumDifference(int[] nums, int k) {
        int left = 0;
        int right = k - 1;
        float answer = Float.POSITIVE_INFINITY;
        Arrays.sort(nums);
        while(right < nums.length){
            answer = Math.min(answer, nums[right] - nums[left]);
            left+=1;
            right+=1;
        }
        return (int)answer;
    }
}