class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        
        // Calculate the total sum
        for (int num : nums) {
            sum += num;
        }

        // If the sum is odd, we cannot partition it into two equal subsets
        if (sum % 2 != 0) {
            return false;
        }

        int target = sum / 2;

        boolean[] dp = new boolean[target + 1];
        dp[0] = true;  

        for (int num : nums) {
            for (int i = target; i >= num; i--) {
                if (dp[i - num]) {
                    dp[i] = true;
                }
            }
        }

        return dp[target];
    }
}
