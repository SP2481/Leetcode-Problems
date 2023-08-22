class MyHashMap {
    int ans[];
    public MyHashMap() {
        ans = new int[1000001];
    }
    
    public void put(int key, int value) {
           ans[key] = value + 1; 
    }
    
    public int get(int key) {
        if(ans[key] == 0)return -1;
        return ans[key] -1;
    }
    
    public void remove(int key) {
        ans[key] = 0;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */