class Solution {
    public List<String> commonChars(String[] words) {
        HashMap<Character,Integer> min_frequency = new HashMap<>();
        for (char ch='a';ch<='z';ch++){
            min_frequency.put(ch,1000);
        }

        for (String s:words){
            HashMap<Character,Integer> curr_frequency = new HashMap<>();
            for (int i=0;i<s.length();i++){
                char ch = s.charAt(i);
                curr_frequency.put(ch,curr_frequency.getOrDefault(ch,0)+1);
            }

            for (char ch='a';ch<='z';ch++){
                min_frequency.put(ch,Math.min(min_frequency.get(ch),curr_frequency.getOrDefault(ch,0)));
            }
        }

        List<String> ans = new ArrayList<>();

        for (char ch='a';ch<='z';ch++){
            while (min_frequency.get(ch)>0 && min_frequency.get(ch)<1000){
                ans.add(String. valueOf(ch));
                min_frequency.put(ch,min_frequency.get(ch)-1);
            }
        }

        return ans;

    }
}
