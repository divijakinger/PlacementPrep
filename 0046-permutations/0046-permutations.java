class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(ans,new ArrayList<>(), nums);
        return ans;
    }

    void backtrack(List<List<Integer>> ans, List<Integer> templist, int[] nums){
        if (templist.size()==nums.length){
            ans.add(new ArrayList<>(templist));
        } else {
            for (int i=0;i<nums.length;i++){
                if(templist.contains(nums[i])) continue; 
                templist.add(nums[i]);
                backtrack(ans, templist, nums);
                templist.remove(templist.size() - 1);
            }
        }
    }
}