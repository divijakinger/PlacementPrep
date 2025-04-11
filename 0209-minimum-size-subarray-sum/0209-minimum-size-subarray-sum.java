class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int ans = Integer.MAX_VALUE;
        int windowStart = 0;
        int sum=0;
        for(int windowEnd=0;windowEnd<nums.length;windowEnd++)
        {
            sum+=nums[windowEnd];
            while (sum>=target && windowStart<=windowEnd)
            {
                ans = Math.min(ans,windowEnd-windowStart+1);
                sum -= nums[windowStart];
                windowStart++;
            }
        }
        if (ans==Integer.MAX_VALUE) return 0;

        return ans;
            
    }
}