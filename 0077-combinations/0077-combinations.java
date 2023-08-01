class Solution {
    public List<List<Integer>> combine(int n, int k) {
      List<List<Integer>> combs = new ArrayList<List<Integer>>();
			backtrack(combs, new ArrayList<Integer>(), 1, n, k);
			return combs;
    }
		public static void backtrack(List<List<Integer>> combs, List<Integer> comb, int ind, int n, int k) {
		if(k==0) {
			combs.add(new ArrayList<Integer>(comb));
			return;
		}

		for(int i=ind;i<=n;i++) {
			comb.add(i);
			backtrack(combs, comb, i+1, n, k-1);
			comb.remove(comb.size()-1);
		}
		}
}