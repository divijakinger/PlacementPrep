class Solution {
    public List<String> wordBreak(String s, List<String> wordDict) {
        List<String> ans = new ArrayList<>();
        StringBuilder current = new StringBuilder();
        solve(s,wordDict,0,current,ans);
        return ans;
    }

    void solve(String s, List<String> dict, int start, StringBuilder current,List<String> ans){
        if (start == s.length()){
            ans.add(current.toString().trim());
            return;
        }

        for (int end=start;end<s.length();end++){
            String word = s.substring(start, end + 1);
            if (dict.contains(word)){
                current.append(word+" ");
                solve(s,dict,end+1,current,ans);
                current.delete(current.length()-word.length()-1,current.length());
            }

        }
        return;
    }
}