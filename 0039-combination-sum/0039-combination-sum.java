class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();


        List<Integer> combination = new ArrayList<>();
        return (combination(0, candidates, target, combination,ans));
    }

    static List<List<Integer>> combination ( int index, int[] nums, int target, List<Integer > ans, List<List<Integer>> ansList){

        if (index== nums.length) {
            if (target == 0) {
                ansList.add(new ArrayList<>(ans));
            }
            return ansList;
        }

            if (nums[index] <= target) {
                ans.add(nums[index]);
                combination(index, nums, target - nums[index], ans,ansList);
                ans.remove(ans.size() - 1);

            }
                combination(index + 1, nums, target, ans,ansList);


            return ansList;
    }

    



}