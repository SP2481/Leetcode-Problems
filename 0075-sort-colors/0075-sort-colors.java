class Solution {
    public void sortColors(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        int i = 0;
        while (i <= right){
            int temp = nums[i];
            if(nums[i] == 0){
                nums[i] = nums[left];
                nums[left] = temp;
                left+=1;
                i+=1;
            }else if(nums[i]==2){
                nums[i] = nums[right];
                nums[right] = temp;
                right-=1;
            }else{
                i+=1;
            }
        }
    }
}