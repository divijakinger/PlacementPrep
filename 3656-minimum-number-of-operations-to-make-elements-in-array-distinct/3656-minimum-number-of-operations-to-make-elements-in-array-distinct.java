class Solution {
    public int minimumOperations(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for (int i=nums.length-1;i>=0;i--)
        {
            if (hs.contains(nums[i]))
            {
                return (i/3)+1;
            }

            hs.add(nums[i]);
        }
        return 0;
    }
}