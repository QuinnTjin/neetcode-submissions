class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> record = new HashMap<>();
        // convert strings to char array
        // compare each char array in the set
        for (char c : s.toCharArray()) {
            if (record.containsKey(c)) {
                record.put(c, record.get(c) + 1);
            } else {
                record.put(c, 1);
            }
        }
        for (char c : t.toCharArray()) {
            if (record.containsKey(c)) {
                record.put(c, record.get(c) - 1);
            } else {
                return false;
            }
        }
        for (Map.Entry<Character, Integer> entry : record.entrySet()) {
            if(entry.getValue() != 0) {
                return false;
            }
        }
        return true;
    }
}
