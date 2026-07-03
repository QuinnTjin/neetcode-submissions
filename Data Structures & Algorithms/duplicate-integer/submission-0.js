class Solution {
    /**
     * @param {number[]} nums
     * @return {boolean}
     */
    hasDuplicate(nums) {
        let intSet = new Set();
        let isDuplicate = false;
        nums.forEach((num) => {
            if (!intSet.has(num)) {
                intSet.add(num);
            } else {
                isDuplicate = true;
            }
        })
        return isDuplicate;
    }
}
