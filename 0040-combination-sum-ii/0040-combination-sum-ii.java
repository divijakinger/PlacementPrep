class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates); 
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> combination = new ArrayList<>();
        
        combination(0, candidates, target, combination, ans);
        
        return ans;
    }

    static void combination(int index, int[] nums, int target, List<Integer> ans, List<List<Integer>> ansList) {
        if (target == 0) {
            ansList.add(new ArrayList<>(ans));
            return;
        }

        for (int i = index; i < nums.length; i++) {
            if (i > index && nums[i] == nums[i - 1]) continue;
            if (nums[i] > target) break;
            ans.add(nums[i]);
            
            combination(i + 1, nums, target - nums[i], ans, ansList);
            
            ans.remove(ans.size() - 1);
        }
    }
}
