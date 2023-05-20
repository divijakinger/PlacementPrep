package com.company.Hashing.LongestConsecutiveSequence;

import java.util.HashSet;

public class ConsecutiveInteger {
    public static void main(String[] args) {
        int[] nums = new int[]{100,4,200,1,3,2};
        System.out.println(longestConsecutive(nums));

    }
    static int longestConsecutive(int[] nums){
        HashSet<Integer> set = new HashSet<>();
        for (int num:nums){
            set.add(num);
        }
        int longest = 1;
        for (int i:nums){
            if (!set.contains(i-1)){
                int num = i;
                int curr = 1;
                while (set.contains((num+1))){
                    curr++;
                    num++;
                }
                longest = Math.max(longest,curr);
            }

        }
        return longest;
    }
}
