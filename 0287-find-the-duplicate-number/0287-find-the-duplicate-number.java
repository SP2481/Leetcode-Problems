class Solution {
    public int findDuplicate(int[] nums) {
        int slow = 0;
        int fast = 0;
        // iterate till we find cycle start 
        do{
            slow = nums[slow];
            fast = nums[nums[fast]]; 
        }while(slow != fast);
        // find where  is the interaction
        int slow2 = 0;
        do{
            slow = nums[slow];
            slow2 = nums[slow2];
        }while(slow != slow2);
        return slow; // or slow2 any index because interaction point will be duplicate
    }
}