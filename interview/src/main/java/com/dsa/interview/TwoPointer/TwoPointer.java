package com.dsa.interview.TwoPointer;

import java.util.List;

public class TwoPointer {
    private static void printStatement(int[] nums, int length) {
        for (int i = 0; i < length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        TwoPointerImpl array = new TwoPointerImpl();

        /*
         * Question 25: Valid Palindrome
         * Input : String s = "A man, a plan, a canal: Panama"
         * Output: true
         */

        String s = "A man, a plan, a canal: Panama";
        Boolean isPalindrome = array.isPalindrome(s);
        System.out.println("Question 25: Valid Palindrome: ");
        System.out.println("is Valid Palindrome: " + isPalindrome);
        System.out.println("------------------------------------------------------------------------------");
        //-----------------------------------------------------------------------------

        /*
         * Question 26: IsSubsequence
         * Input s = "abc"; t = "ahbgdc"
         * Output true
         */

        String sub = "abc";
        String t = "ahbgdc";
        Boolean isSub = array.isSubsequence(sub, t);
        System.out.println("Question 26 : IsSubsequence : ");
        System.out.println("isSubsequence: " + isSub);
        System.out.println("------------------------------------------------------------------------------");
        //-----------------------------------------------------------------------------

        /*
         * Question 27: Two Sum II - Input Array Is Sorted
         * int[] numbers = [2, 7, 11, 15];
         * Output : 9
         */

        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        int[] result = array.getTwoIndices(numbers, target);
        System.out.println("Question 27: Input Array is Sorted: ");
        System.out.println("Two Indices : " );
        printStatement(result, result.length);
        System.out.println("------------------------------------------------------------------------------");
        //-----------------------------------------------------------------------------

        /*
         * Question 28: Container With Most Water
         * Input  height = [1,8,6,2,5,4,8,3,7]
         * Output: 49
         */

         int[] height = {1,8,6,2,5,4,8,3,7};
         int maxWater = array.maxWater(height);
         System.out.println("Question 28: Container with Most water");
         System.out.println("Max water: "+ maxWater);
         System.out.println("------------------------------------------------------------------------------");
        //-----------------------------------------------------------------------------

        /*
         * Question 29: 3Sum
         * Input nums = [-1,0,1,2,-1,-4]
         * Output : [[-1,-1,2],[-1,0,1]]
         */

         int[] nums = {-1,0,1,2,-1,-4};
         List<List<Integer>> SumResult = array.threeSum(nums);
         System.out.println("Question 29: 3Sum: ");
         System.out.println("Output :" + SumResult);
         System.out.println("------------------------------------------------------------------------------");
        //-----------------------------------------------------------------------------



    }
}
