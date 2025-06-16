package com.dsa.interview.HashMap;

import java.util.List;

public class HashMap {
    
    private static void printStatement(int[] nums, int length) {
        for (int i = 0; i < length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        

        HashMapImpl array = new HashMapImpl();

        /*
         * Question 39: Ransom Note 
         * Input ransomNote = "aa", magazine = "aab" 
         * Output : false
         */

         String ransomNote = "aa";
         String magazine = "aab";

         Boolean isStringContain = array.isRansomNoteContain(ransomNote, magazine);
         System.out.println("Question 39: Ransom Note :  ");
        System.out.println("is String contain :  "+ isStringContain);
        System.out.println("------------------------------------------------------------------------------");
        //-----------------------------------------------------------------------------

        /*
         * Question 40: Isomorphic Strings 
         * s = "egg", t = "add" 
         * Output: true
         */

        String isoS = "egg";
        String isoT = "add";
        Boolean isIsomorphic = array.isIsomorphic(isoS, isoT);
        System.out.println("Question 40: Isomorphic Strings : ");
        System.out.println("is Isomorphic :  "+ isIsomorphic);
        System.out.println("------------------------------------------------------------------------------");
        //-----------------------------------------------------------------------------

        /*
         * Question 41 : Word Pattern
         * Input: pattern = "abba", s = "dog cat cat dog"  
           Output: true
         */

        String pattern = "abba";
        String patternString = "dog cat cat dog";
        Boolean isPatternMatch = array.isPatternMatch(pattern, patternString);
        System.out.println("Question 41 : Word Pattern: ");
        System.out.println("is pattern same :  "+ isPatternMatch);
        System.out.println("------------------------------------------------------------------------------");
        //-----------------------------------------------------------------------------

        /*
         * Question 42 : Valid Anagram
         * Input: s = "anagram", t = "nagaram"  
            Output: true
         */

        String fString  = "anagram";
        String tString  = "nagaram";
        Boolean isAnagram = array.isAnagram(fString, tString);
        System.out.println("Question 42 : Valid Anagram: ");
        System.out.println("is anagram:  "+ isAnagram);
        System.out.println("------------------------------------------------------------------------------");
        //-----------------------------------------------------------------------------

        /*
         * Question 43 : Group Anagram
         * Input: strs = ["eat","tea","tan","ate","nat","bat"]  
            Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
         */

        String[] gAnagram = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> result = array.getGroupAnagram(gAnagram);
        System.out.println("Question 43 : Group Anagram ");
        System.out.println("grouped anagram:  "+ result);
        System.out.println("------------------------------------------------------------------------------");
        //-----------------------------------------------------------------------------

        /*
         * Question 44: Two Sum 
         * Input: nums = [2,7,11,15], target = 9  
           Output: [0,1]
         */

        int[] twoSumArray = {2, 7, 11, 15};
        int target = 9;
        int[] twoSumIndices = array.twoSumOutput(twoSumArray, target);
        System.out.println("Question 44: Two Sum  ");
        System.out.println("indicies:  ");
        printStatement(twoSumIndices, twoSumIndices.length);
        System.out.println("------------------------------------------------------------------------------");
        //-----------------------------------------------------------------------------

        /*
         * Quesstion 45 : Happy Number
         * Input: n = 19  
           Output: true 
         */

         int n = 19;
         Boolean isHappy = array.isHappy(n);
         System.out.println("Question 45 ");
        System.out.println("is Happy Number:  " + isHappy);
        System.out.println("------------------------------------------------------------------------------");
        //-----------------------------------------------------------------------------

        /*
         * Question 46: Contains Duplicate II 
         * Input: nums = [1,2,3,1], k = 3  
            Output: true
         */

         int[] nums = {1, 2, 3, 1};
         int k = 3;
         Boolean isContain = array.isContainDup(nums, k);
         System.out.println("Question 46: Contains Duplicate II  ");
         System.out.println("is array contain duplicates:  " + isContain);
         System.out.println("------------------------------------------------------------------------------");
         //-----------------------------------------------------------------------------
 
        /*
         * Question 47 : Longest Consecutive sequence
         * Input: nums = [100,4,200,1,3,2]  
            Output: 4
         */

         int[] longestNums = {100,4,200,1,3,2};
         int seq = array.longestConseq(longestNums);
         System.out.println("Question 47 : Longest Consecutive sequence  ");
         System.out.println("Longest Consequence " + seq);
         System.out.println("------------------------------------------------------------------------------");
         //-----------------------------------------------------------------------------
 

    }
}
