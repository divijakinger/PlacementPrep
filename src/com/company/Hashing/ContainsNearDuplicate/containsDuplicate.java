package com.company.Hashing.ContainsNearDuplicate;

import java.util.HashSet;

public class containsDuplicate {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,1};
        System.out.println(containsNearbyDuplicate(nums,3));
    }
    static boolean containsNearbyDuplicate(int[] arr, int k) {
        HashSet<Integer> set = new HashSet<>();


        for (int i=0; i<arr.length; i++)
        {
            if (set.contains(arr[i]))
                return true;

            set.add(arr[i]);

            if (i >= k)
                set.remove(arr[i-k]);
        }
        return false;
    }
}
