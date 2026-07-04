class Solution {
    public int lengthOfLongestSubstring(String s) {
        int finalCount = 0;
        HashSet<Character> set = new HashSet<>();
        int leftBound = 0;
        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            while (set.contains(charArray[i])) {
                set.remove(charArray[leftBound]);
                leftBound++;
            }
            set.add(charArray[i]);
            finalCount = Math.max(finalCount, set.size());
        }
        return finalCount;
    }
}