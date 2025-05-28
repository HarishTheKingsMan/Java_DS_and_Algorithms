package com.dsa.interview.TwoPointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoPointerImpl {

    public Boolean isPalindrome(String s) {
        
        //Step 1: Initialization
        int left = 0;
        int right = s.length() -1;

        //Step 2: 
        while(left < right){

            //Step 2.1: Skip the non letter or digit characters
            while( left < right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }

            //Step 2.2: Skip the non letter or digit characters
            while(left < right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }

            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public Boolean isSubsequence(String sub, String t) {
        
        //Stpe 1: Initialization
        int sIndex = 0;
        int tIndex = 0;

        //Step 2: Iterate through the String
        if(sIndex < sub.length() && tIndex < t.length()){

            if(sub.charAt(sIndex) == t.charAt(tIndex)){
                sIndex++;
            }
            tIndex++;
        }

        return sIndex == sub.length();
    }

    public int[] getTwoIndices(int[] numbers, int target) {
        
        //Step 1: Init
        int start = 0;
        int end = numbers.length -1;

        //Step 2: Iteration
        while(start < end){

            if(numbers[start] + numbers[end] == target){
                return new int[]{start, end};
            }

            if(numbers[start] + numbers[end] > target){
                end--;
            }

            if(numbers[start] + numbers[end] < target){
                start++;
            }
        }

        return new int[]{-1, -1};
    }

    public int maxWater(int[] height) {
        
        //Step 1: Init
        int maxWater = 0;
        int left = 0;
        int right = height.length -1;

        //Step 2: Iterate
        while(left < right){

            int currentValue = Math.min(height[left], height[right]) * (right - left);

            maxWater = Math.max(maxWater, currentValue);

            if(height[left] <= height[right]){
                left++;
            }else{
                right--;
            }
        }

        return maxWater;
    }

    public List<List<Integer>> threeSum(int[] nums) {
        
        //Stpe 1: Sort the array
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();

        //Step 2: Iterate with Two Pointer
        for(int i = 0; i < nums.length; i++){
            if(i > 0 && nums[i] == nums[i - 1]){
                continue;
            }

            int left = i + 1;
            int right = nums.length - 1;
            int target = -nums[i];

            while(left < right){

                int sum = nums[left] + nums[right];

                if(sum == target){

                    //Skipping the duplicates and move to last duplicate value
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    while(left < right && nums[left] == nums[left + 1]){
                        left++;
                    }
                    while(left < right && nums[right] == nums[right - 1]){
                        right--;
                    }

                    //Skip the last Duplicate value also
                    left++;
                    right--;
                }
                else if(sum > target){
                    right--;
                }else{
                    left++;
                }
            }
        }

        return result;
    }
    
}
