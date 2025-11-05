package com.Day5;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] num, int target){
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < num.length; i++) {
            int complement = target - num[i];

            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            map.put(num[i], i);
        }

        return new int[]{};
    }
    public static void main(String[] args){
        int[] num = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(num, target)));
    }
}
