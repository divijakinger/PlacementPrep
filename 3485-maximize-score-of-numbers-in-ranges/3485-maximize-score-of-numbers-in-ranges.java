class Solution {
    public int maxPossibleScore(int[] start, int d) {
        Arrays.sort(start);  
        int n = start.length;
        if (start[0] == start[n - 1]) {
            return d;  
        }
        int maxScore = 0;
        int low = 0;
        int high = Integer.MAX_VALUE;

        while (low <= high) {
            int mid = low + (high - low) / 2;


            if (canAchieveMinDiff(start, d, mid)) {
                maxScore = mid;
                low =  mid + 1;
            } else {
                high = mid - 1;  
            }
        }

        return maxScore;
    }

    private boolean canAchieveMinDiff(int[] start, int d, int minDiff) {
        int prev = start[0];  
        for (int i = 1; i < start.length; i++) {
            int nextExpected = prev + minDiff; 
            if (nextExpected > start[i] + d) {
                return false; 
            }
            prev = Math.max(nextExpected, start[i]);
        }

        return true;  
    }
}
