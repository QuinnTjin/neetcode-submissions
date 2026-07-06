class Solution {
    public int climbStairs(int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        // take n and subtract the steps until 0
        // memoization is remembering partial answers
        // Recursive way/fibonacci
        // int ways = 0; 
        // if (n == 2) {
        //     return 2;
        // }
        // if (n == 1) {
        //     return 1;
        // }

        // if (map.containsKey(n)) {
        //     return map.get(n);
        // }

        // ways = climbStairs(n - 2) + climbStairs(n - 1);
        // map.put(n, ways);

        if (n <= 2) {
            return n;
        }
        int prev1 = 2, prev2 = 1; //base case

        // the number of ways to get to the top
        // is always a sum of the previous two
        // values in a fibbonacci
        for (int i = 3; i <= n; i++) {
            int curr = prev1 + prev2;
            prev2 = prev1;
            prev1 = curr;
        }

        return prev1;
    }
}
