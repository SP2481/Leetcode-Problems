class Solution {
    public int tribonacci(int n) {
        return memo(n ,new  HashMap<Integer, Integer>());
    }
    private int memo(int n, Map<Integer, Integer> cached){
        if(cached.containsKey(n))return cached.get(n);
        if(n == 0 ) return 0;
        if(n == 1 || n == 2 ) return 1;
        int result = memo(n - 1, cached) + memo(n - 2, cached) + memo(n - 3, cached);
        cached.put(n , result);
        return cached.get(n);
    }
}