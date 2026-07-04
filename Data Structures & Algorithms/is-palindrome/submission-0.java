class Solution {
    public boolean isPalindrome(String s) {

        char[] ca = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase().toCharArray();
        System.out.println(s.replaceAll("[^a-zA-Z0-9]", ""));
        int left = 0, right = ca.length - 1;
        for (char c : ca) {
            if (Character.compare(ca[left], ca[right]) != 0) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
