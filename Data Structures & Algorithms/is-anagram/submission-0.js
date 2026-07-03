class Solution {
    /**
     * @param {string} s
     * @param {string} t
     * @return {boolean}
     */
    isAnagram(s, t) {
        let isAnagram = true;
        if (s.length != t.length) {
            isAnagram = false;
        }
        const sMap = new Map();
        const tMap = new Map();
        for (const char of s) {
            sMap.set(char, (sMap.get(char) || 0) + 1);
        }
        for (const char of t) {
            tMap.set(char, (tMap.get(char) || 0) + 1);
        }

        for (const [key, value] of sMap) {
            if (!tMap.has(key)) {
                isAnagram = false;
            }
            if (tMap.get(key) !== value) {
                isAnagram = false;
            }
        }
        return isAnagram;
    }
}
