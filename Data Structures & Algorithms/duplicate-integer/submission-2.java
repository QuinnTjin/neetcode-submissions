class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> record = new HashSet<>();
        boolean duplicate;
        for (int num : nums) {
            if (record.contains(num)) {
                return true;
            }
            else {
                record.add(num);
            }
        }
        return false;
    }
}