class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        List<List<Integer>> answer = new ArrayList<>();
        Map<Integer, Integer> losersCount = new HashMap<>();
        Set<Integer> winners = new TreeSet<>(); 
        Set<Integer> losers = new TreeSet<>();
        for(int i = 0; i < matches.length; i++){
            losersCount.put(matches[i][1], losersCount.getOrDefault(matches[i][1], 0)+1);
        }
        for(int key  : losersCount.keySet()){
            if(losersCount.get(key) == 1){
                losers.add(key);
            }
        }
        for(int i = 0; i < matches.length; i++){
            if(!losersCount.containsKey(matches[i][0]) && !winners.contains(matches[i][0]) ){
                winners.add(matches[i][0]);
            }
        }
        List<Integer> listWinners = new ArrayList<>(winners);
        List<Integer> listLosers = new ArrayList<>(losers);
        answer.add(listWinners);
        answer.add(listLosers);
        return answer;
    }
}