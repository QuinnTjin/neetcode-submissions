class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> output = new ArrayList<>();
        
        HashMap<HashMap<Character, Integer>, List<String>> mapOfHashMaps = new HashMap<>();
        // iterate through array
        // string to char array
        // add char to hashmap? How many hashmaps?
        // Use hashmap to record occurrence of letter in word

        for (int i = 0; i < strs.length; i++) {
            HashMap<Character, Integer> map = new HashMap<>();
            char[] ca = strs[i].toCharArray();
            for (char c : ca) {
                if (map.containsKey(c)){
                    map.put(c, map.get(c) + 1);
                } else {
                    map.put(c, 1);
                }
            }
            if (mapOfHashMaps.containsKey(map)) {
                mapOfHashMaps.get(map).add(strs[i]);
            }
            else {
                List<String> l = new ArrayList<String>();
                l.add(strs[i]);
                mapOfHashMaps.put(map, l);
            }
            
        }
        
        output.addAll(mapOfHashMaps.values());

        return output;
    }
}