class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int answer =0 ;
        while(left < right){
            int maxArea = (right - left) * Math.min(height[left], height[right]);
            answer = Math.max(answer, maxArea);
            if(height[left] < height[right]){
                left+=1;
            }else{
                right-=1;
            }
        }
        return answer;

    }
}