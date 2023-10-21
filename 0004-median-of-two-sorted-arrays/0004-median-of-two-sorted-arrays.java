class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] mergedList = mergTwoSortedList(nums1, nums2);
        int n = mergedList.length;
        double result;
        if(n % 2 == 0 ){
            int middle1 = n /2;
            int middle2 = middle1 - 1;
            result = (mergedList[middle1] + mergedList[middle2]) /2.0;
        }else{
            int middle = n / 2;
            result = (double) mergedList[middle];
        }
        return result;
    }
    private int[] mergTwoSortedList(int[] nums1, int[] nums2){
        int i =0 ,j = 0;
        List<Integer> arr  = new ArrayList<>();
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                arr.add(nums1[i]);
                i++;
            } else {
                arr.add(nums2[j]);
                j++;
            }
        }

        while (i < nums1.length) {
            arr.add(nums1[i]);
            i++;
        }

        while (j < nums2.length) {
            arr.add(nums2[j]);
            j++;
        }

        int[] mergedArray = new int[arr.size()];
        for (int k = 0; k < arr.size(); k++) {
            mergedArray[k] = arr.get(k);
        }

        return mergedArray;
    }
}