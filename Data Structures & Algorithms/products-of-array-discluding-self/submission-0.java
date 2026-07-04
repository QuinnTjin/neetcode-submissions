class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];
        for (int i = nums.length - 1; i >= 0; i--) {
            int length = nums.length - 1;
            output[i] = 1;
            while (length >= 0) {
                if (i != length) {
                    output[i] = output[i] * nums[length];
                }
                length--;
            }
        }

        return output;
    }
}  
