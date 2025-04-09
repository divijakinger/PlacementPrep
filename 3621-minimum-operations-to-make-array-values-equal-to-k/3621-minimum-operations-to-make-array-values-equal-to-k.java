class Solution {
    public int minOperations(int[] nums, int k) {
        int ans=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int num:nums)
        {
            if (num<k) return -1;

            map.put(num,map.getOrDefault(num,0)+1);

            if (num != k && map.get(num)==1)
            {
                ans++;
            }
        }
        return ans;
    }
}