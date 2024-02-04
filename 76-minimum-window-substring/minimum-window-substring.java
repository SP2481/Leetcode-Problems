class Solution {
    public String minWindow(String s, String t) {
        Map<Character, Integer> countT = new HashMap<>();

        //Find count of characters in t string
        for(char c: t.toCharArray()){
            countT.put(c, countT.getOrDefault(c,0)+1);
        }

        int matched = 0; // to check if the size of t chars are present in s
        int start = 0;
        int minlen = s.length() +1;
        int subStr = 0;
        for(int window = 0; window < s.length(); window++){
            char right = s.charAt(window);
            if(countT.containsKey(right)){
                countT.put(right, countT.get(right)-1);
                if(countT.get(right) == 0)matched++;
            }

            while(matched == countT.size()){
                if(minlen > window - start + 1){
                    minlen = window - start + 1;
                    subStr = start;
                }
                char deleted = s.charAt(start++);
                if(countT.containsKey(deleted)){
                    if(countT.get(deleted) == 0) matched--;
                    countT.put(deleted, countT.get(deleted)+1);
                }
            }
        }
        return minlen > s.length() ? "" : s.substring(subStr, subStr + minlen);
    }    
}