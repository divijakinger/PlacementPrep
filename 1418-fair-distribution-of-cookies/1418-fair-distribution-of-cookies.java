class Solution {
    int ret = Integer.MAX_VALUE;
    public int distributeCookies(int[] cookies, int k) {
        assign(cookies, 0, new int[k], 0);
        return ret;
    }

        private void assign(int[] cookies, int i, int[] distribution, int preMax) {
        if (i == cookies.length) {
            ret = Math.min(ret, preMax);
            return;
        }
        
        Set<Integer> used = new HashSet<>();
        for (int w = 0; w < distribution.length; w++) {
            if (!used.add(distribution[w]))
                continue;
            if (distribution[w] + cookies[i] > ret)
                continue;
            distribution[w] += cookies[i];
            assign(cookies, i+1, distribution, Math.max(distribution[w], preMax));
            distribution[w] -= cookies[i];
        }
    }
}