class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> chars = new HashSet<>();
        int maxLength = 0;
        int left =0;
        for(int right = 0; right < s.length(); right++) {
            while (chars.contains(s.charAt(right))) {
                chars.remove(s.charAt(left));
                left++;
            }
            chars.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left +1);
        }
        return maxLength;
    }
}