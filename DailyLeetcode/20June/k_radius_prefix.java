class Solution {
    public int[] getAverages(int[] nums, int k) {
        if (k==0){
            return nums;
        }

        long[] sums = new long[nums.length+1];
        
        for (int i=0;i<nums.length;++i){
            sums[i+1] = su ms[i]+nums[i];
        }

        int[] ans = new int[nums.length];
        Arrays.fill(ans, -1);
        if (2 * k + 1 > nums.length) {
            return ans;
        }
        for (int j=k;j<nums.length-k;j++){
            ans[j] = (int) ((sums[j+k+1]-sums[j-k])/(2*k+1));
        }
        return ans;
    }
}
