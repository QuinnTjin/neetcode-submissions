class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] output = new int[k];
        // create frequency map
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        // sort values
        List<Integer> values = new ArrayList<>(map.values());
        Collections.sort(values, Collections.reverseOrder());

        // re-create sorted map using linked hash map
        LinkedHashMap<Integer, Integer> sortedMap = new LinkedHashMap<>();

        for (int value : values) {
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue().equals(value)) {
                    sortedMap.put(entry.getKey(), entry.getValue());
                }
            }
        }

        int j = 0;
        for (int key : sortedMap.keySet()) {
            output[j] = key;
            j++;
            if (j == k) break;
        }
        
        return output;
    }
}
