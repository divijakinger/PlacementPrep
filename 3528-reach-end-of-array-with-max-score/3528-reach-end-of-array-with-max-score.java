class Solution {
    public long findMaximumScore(List<Integer> nums) {
        long max = 0;
        long sum = 0;
        for (int i=0;i<nums.size()-1;i++){
            max = Math.max(max, nums.get(i));
            sum += max;
        }
        return sum;
    }
}