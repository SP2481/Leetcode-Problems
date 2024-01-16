class RandomizedSet {
    HashMap<Integer, Integer> map = new HashMap<>();
    List<Integer> list = new ArrayList<>();
    Random random = new Random();

    public RandomizedSet() {

    }

    public boolean insert(int val) {

        if (map.containsKey(val)) {
            return false;
        }
        map.put(val, list.size());
        list.add(val);
        return true;

    }

    public boolean remove(int val) {

        if (!map.containsKey(val)) {
            return false;
        }

        int idx = map.get(val);
        int lastIdx = list.size() - 1;

        if (idx != lastIdx) {
            list.set(idx, list.get(lastIdx));
            map.put(list.get(lastIdx), idx);
        }
        map.remove(val);
        list.remove(lastIdx);
        return true;

    }

    public int getRandom() {

        return list.get(random.nextInt(list.size()));

    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */