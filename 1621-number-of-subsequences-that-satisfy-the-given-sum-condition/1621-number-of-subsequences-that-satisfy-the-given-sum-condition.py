class Solution:
    def numSubseq(self, nums: List[int], target: int) -> int:
        subseq = 0
        nums.sort()  
        mod = 10**9 + 7
        left, right = 0, len(nums) - 1
        while left <=  right:
            if nums[left] + nums[right] <= target:
                subseq = (subseq + pow(2, right - left, mod)) % mod
                left += 1
            else:
                right -= 1
    
        return subseq %  mod

            