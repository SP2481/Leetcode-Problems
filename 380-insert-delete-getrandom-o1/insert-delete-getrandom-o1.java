class RandomizedSet {
    Map<Integer, Integer> map = new HashMap<>();
    
    public RandomizedSet() {
    }
    
    public boolean insert(int val) {
        if(map.containsKey(val)){
            return false;
        }else{
            map.put(val, map.getOrDefault(val, 0)+1);
            return true;
        }
    }
    
    public boolean remove(int val) {
        if(!map.containsKey(val)){return false;}
        else{
            map.remove(val);
            return true;
        }
    }
    
    public int getRandom() {
        if(!map.isEmpty()){
            Set<Integer> keySet = map.keySet();
            Integer[] keyArr = keySet.toArray(new Integer[0]);
            Random random = new Random();
            int randomIndex = random.nextInt(0,keyArr.length);
            return keyArr[randomIndex]; 
        }
        return 0;
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */