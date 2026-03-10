class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<String,List<String>>();
        for(String str : strs)
        {
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            String temp = new String(ch);
            List<String> list = map.getOrDefault(temp, new ArrayList<>());
            list.add(str);
            map.put(temp, list);        
        }

        return new ArrayList<>(map.values());
    }
}