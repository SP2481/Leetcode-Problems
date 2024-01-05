class Solution {
    public int fib(int n) {
        Map<Integer, Integer> memo = new HashMap<>();
        return helper(n , memo);

    }
    private int helper(int n, Map<Integer, Integer> memo){
        if(memo.containsKey(n)) return memo.get(n);
        if(n <= 1) return n;
        int result = helper(n - 1, memo) + helper(n - 2, memo);
        memo.put(n, result);
        return result;
    }
}