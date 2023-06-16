class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num:nums){
            set.add(num);
        }
        int longest = 0;
        for (int i:nums){
            if (!set.contains(i-1)){
                int num = i;
                int curr = 1;
                while (set.contains((num+1))){
                    curr++;
                    num++;
                }
                longest = Math.max(longest,curr);
            }

        }
        return longest;
    }
}
