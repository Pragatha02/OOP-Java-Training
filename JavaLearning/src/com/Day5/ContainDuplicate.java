package com.Day5;

import java.util.HashSet;
import java.util.Set;

public class ContainDuplicate {
    public static boolean containsDuplicate(int[] nums){
        HashSet<Integer> set = new HashSet<>();

        for(int num : nums) {
            if (!set.add(num)) {
                return true;  // duplicate found
            }
        }
        return false;
    }

    public static void main(String[] args){
        int[] nums = {1, 2, 3, 1};
        System.out.println(containsDuplicate(nums));
    }
}
