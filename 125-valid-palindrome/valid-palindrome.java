class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        char[] charArray = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase().toCharArray();
        int right = charArray.length - 1;
        while(left <= right) {
            if(charArray[left] == charArray[right]) {
                left+=1;
                right-=1;
            } else {
                return false;
            }
        }
        return true;
    }
}