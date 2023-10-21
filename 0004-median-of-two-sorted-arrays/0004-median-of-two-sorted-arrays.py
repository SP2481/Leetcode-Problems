class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        mergedlist = sorted(nums1 + nums2)
        n =  len(mergedlist) 

        if n % 2 == 0:
            lowerVal = n // 2
            higherVal = lowerVal - 1
            result =( mergedlist[lowerVal] + mergedlist[higherVal]) / 2.0
            
        else:
            midVal = n // 2
            result = float(mergedlist[midVal])
        return result
            

        