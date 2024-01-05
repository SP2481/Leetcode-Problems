class Solution {
    public int uniquePaths(int m, int n) {
        Map<String, Integer> memoize = new HashMap<>();
        return helper(m , n , memoize);
    }
    private int helper(int m, int n, Map<String, Integer> memo){
        String key = String.valueOf(m) + "," +String.valueOf(n);
        if(memo.containsKey(key)){
            return memo.get(key);
        }
        if(m == 1 && n == 1) return 1;
        if(m == 0 || n == 0) return 0;
        int result = helper(m -1,n, memo) + helper(m, n -1, memo);
        memo.put(key, result);
        return memo.get(key); 
    }
}