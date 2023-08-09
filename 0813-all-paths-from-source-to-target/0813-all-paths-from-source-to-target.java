class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<Integer> ans = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        ans.add(0);
        solve(graph,0,ans,result);
        return result;
        
    }

    void solve(int[][] graph, int curr,List<Integer> ans, List<List<Integer>> result){
        if (curr == graph.length-1){
            result.add(new ArrayList<> (ans));
            return;
        }

        for (int i : graph[curr]){
            ans.add(i);
            solve(graph,i,ans,result);
            ans.remove(ans.size()-1);
        }
    }
}