class Solution {
    public int numberOfBeams(String[] bank) {
        int count = 0;
        int prevCount = 0;
        for (String currString : bank) {
            int curr = 0;
            for (int j = 0; j < currString.length(); j++) {

                if (currString.charAt(j) == '1') {
                    curr++;
                }
            }
            if (curr > 0) {
                count += prevCount * curr;
                prevCount = curr;
            }
        }
        return count;
    }
}