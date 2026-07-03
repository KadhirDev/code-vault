class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int res[] = new int[k];
        for(int i=0;i<res.length;i++){
             int maxFreq = 0;
            int maxElement = 0;
             for (int key : map.keySet()) {
                if (map.get(key) > maxFreq) {
                    maxFreq = map.get(key);
                    maxElement = key;
                }
            }

            res[i] = maxElement;
            map.remove(maxElement);
        }
        return res;

    }
}