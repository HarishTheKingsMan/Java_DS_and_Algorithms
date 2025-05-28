package com.dsa.interview.SlidingWindow;

import java.util.List;

public class SlidingWindow {
    private static void printStatement(int[] nums, int length) {
        for (int i = 0; i < length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        
        SlidingWindowImpl array = new SlidingWindowImpl();

        /*
         * Question 30: Minimum Size Subarray Sum
         * Input : target = 7, nums = [2,3,1,2,4,3]
         * Output: 2
         */

        int[] nums = {2, 3, 1, 2, 4, 3};
        int target = 7;
        int minLength = array.minSizeSub(nums, target);
        System.out.println("Question 30: Minimum Size Subarray Sum: ");
        System.out.println("Minimom sized subarray length : " + minLength);
        System.out.println("------------------------------------------------------------------------------");
        //-----------------------------------------------------------------------------

        /*
         * Question 31: Longest Substring Without Repeating Characters  
         * Input String  s = "abcabcbb" 
         * Output 3
         */

        String subString = "abcabcbb";
        int nonDuplicateSubString = array.longestSubString(subString);
        System.out.println("Question 31: Longest Substring Without Repeating Characters  ");
        System.out.println("Longest substring : " + nonDuplicateSubString);
        System.out.println("------------------------------------------------------------------------------");
        //-----------------------------------------------------------------------------

        /*
         * Question 32: Substring with Concatenation of All Words
         * Input s = "barfoothefoobarman", words = ["foo","bar"]
         * Output: [0,9]
         */
        String s  = "barfoothefoobarman";String[] words = {"foo","bar"};
        List<Integer> startingPoints = array.subStringStating(s, words);
        System.out.println("Question 32: Substring with Concatenation of All Words");
        System.out.println("SubString Starting Points are : "  + startingPoints);
        System.out.println("------------------------------------------------------------------------------");
        //-----------------------------------------------------------------------------

        /*
         * Question 33: Minimum Window Substring  
         * Input :  s = "ADOBECODEBANC", t = "ABC"
         * Output: "BANC"
         */

         String s1 = "ADOBECODEBANC";
         String t1 = "ABC";
         String minSubString = array.minLengthSubString(s1, t1);
         System.out.println("Question 33: Minimum Window Substring  ");
         System.out.println("Minimum Length SubString : " + minSubString);
         System.out.println("------------------------------------------------------------------------------");
        //-----------------------------------------------------------------------------

    }
}
