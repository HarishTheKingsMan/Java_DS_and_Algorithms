package com.dsa.interview.ArrayAndString;

import com.dsa.interview.ArrayAndString.ArrayAndStringImpl.RandomizedSet;

public class ArrayAndString {
    private static void printStatement(int[] nums, int length) {
        for (int i = 0; i < length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        ArrayAndStringImpl array = new ArrayAndStringImpl();

        /* Question 1: Merge Sorted Array: 
            Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
            Output: [1,2,2,3,5,6]
        */
        int[] mergenums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] mergenums2 = {2, 5, 6};
        int n = 3;

        array.merge(mergenums1, m, mergenums2, n);
        System.out.println("Question 1: Merge Sorted Array");
        System.out.print("After merging: ");
        printStatement(mergenums1, mergenums1.length -1);
        System.out.println("Merged array: " + mergenums1.length + " elements");
        System.out.println("------------------------------------------------------------------------------");

        //-----------------------------------------------------------------------------

        /* Question 2: Remove Elements: 
            Input: nums = [3, 2, 2, 3], val = 3
            Output: [2, 2, _, _] (length = 2)
        */
        int[] removeNums = {3, 2, 2, 3};
        int removeVal = 3;
        int newLength = array.removeElement(removeNums, removeVal);
        System.out.println("Question 2: Remove Elements");
        System.out.print("After removing elements: ");
        printStatement(removeNums, newLength);
        System.out.println("New length: " + newLength);
        System.out.println("------------------------------------------------------------------------------");

        //-----------------------------------------------------------------------------

        /* Question 3: Remove Duplicates from Sorted Array:
            Input: nums = [1, 1, 2]
            Output: [1, 2, _] (length = 2)
        */

        int[] removeDuplicates = {1, 1, 2};
        int newLengthDuplicates = array.removeDuplicates(removeDuplicates);
        System.out.println("Question 3: Remove Duplicates from Sorted Array");
        System.out.print("After removing duplicates: ");
        printStatement(removeDuplicates, newLengthDuplicates);
        System.out.println("New length: " + newLengthDuplicates);
        System.out.println("------------------------------------------------------------------------------");
        //-----------------------------------------------------------------------------

        /* Question 4: Remove Duplicates from Sorted Array II:
            Input: nums = [1, 1, 1, 2, 2, 3]
            Output: [1, 1, 2, 2, 3, _] (length = 5)
        */

        int[] removeDuplicatesII = {1, 1, 1, 2, 2, 3};
        int newLengthDuplicatesII = array.removeDuplicatesII(removeDuplicatesII);
        System.out.println("Question 4: Remove Duplicates from Sorted Array II");
        System.out.print("After removing duplicates: ");
        printStatement(removeDuplicatesII, newLengthDuplicatesII);
        System.out.println("New length: " + newLengthDuplicatesII);
        System.out.println("------------------------------------------------------------------------------");
        //-----------------------------------------------------------------------------


        /* Question 5: Majority Element:
            Input: nums = [3, 2, 3]
            Output: 3
        */

        int[] majorityElementNums = {3, 2, 3};
        int majorityElement = array.majorityElement(majorityElementNums);
        System.out.println("Question 5: Majority Element");
        System.out.println("Majority Element: " + majorityElement);
        System.out.println("------------------------------------------------------------------------------");
        //-----------------------------------------------------------------------------

        /* Question 6: Rotate Array:
            Input: nums = [1,2,3,4,5,6,7], k = 3
            Output: [5,6,7,1,2,3,4]
        */

        int[] rotateArrayNums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        array.rotate(rotateArrayNums, k);
        System.out.println("Question 6: Rotate Array");
        System.out.print("After rotation: ");
        printStatement(rotateArrayNums, rotateArrayNums.length);
        System.out.println("------------------------------------------------------------------------------");
        //-----------------------------------------------------------------------------

        /* Question 7: Best Time to Buy and Sell Stock
            Input: prices = [7,1,5,3,6,4]
            Output: 5
        */

        int[] stockPrices = {7, 1, 5, 3, 6, 4};
        int maxProfit = array.maxProfit(stockPrices);
        System.out.println("Question 7: Best Time to Buy and Sell Stock");
        System.out.println("Maximum Profit: " + maxProfit);
        System.out.println("------------------------------------------------------------------------------");
        //-----------------------------------------------------------------------------

        /* Question 8: Best Time to Buy and Sell Stock II
            Input: prices = [7,1,5,3,6,4]
            Output: 7
        */

        int[] stockPricesII = {7, 1, 5, 3, 6, 4};
        int maxProfitII = array.maxProfitII(stockPricesII);
        System.out.println("Question 8: Best Time to Buy and Sell Stock II");
        System.out.println("Maximum Profit: " + maxProfitII);
        System.out.println("------------------------------------------------------------------------------");
        //-----------------------------------------------------------------------------

        /* Question 9: Jump Game
            Input: jumpNums = [2, 3, 1, 1, 4]
            Output: true
        */

        int[] jumpNums = {7, 1, 5, 3, 6, 4};
        Boolean jumpPossibility = array.jumpPossibility(jumpNums);
        System.out.println("Question 9: Jump Game");
        System.out.println("is Jump Possible: " + jumpPossibility);
        System.out.println("------------------------------------------------------------------------------");
        //-----------------------------------------------------------------------------

        /* Question 10: Jump Game II
            Input: jumpNums = [2, 3, 1, 1, 4]
            Output: 2
        */

        int[] jumpNumsII = {7, 1, 5, 3, 6, 4};
        int jumpPossibilityII = array.jumpPossibilityII(jumpNumsII);
        System.out.println("Question 10: Jump Game II");
        System.out.println("min Jump Required: " + jumpPossibilityII);
        System.out.println("------------------------------------------------------------------------------");
        //-----------------------------------------------------------------------------

        /*
         * Question 11: H - index
         * input: citations = [3,0,6,1,5]
         * Output : 3
         */

        int[] citations = {3, 0, 6, 1, 5};
        int cited = array.maxCitations(citations);
        System.out.println("Question 11: H - index");
        System.out.println("paper cited atleast that num of citations : " + cited);
        System.out.println("------------------------------------------------------------------------------");
        //-----------------------------------------------------------------------------

        /*
         * Question 12: Insert Delete GetRandom O(1)
         * Input: ["RandomizedSet", "insert", "remove", "getRandom", "insert", "getRandom"]
         *       Output: [null, true, true, 2, false, 2] 
         */

        RandomizedSet randomizedSet = array.new RandomizedSet();
        System.out.println("Question 12: Insert Delete GetRandom O(1)");
        System.out.println("Insert 1: " + randomizedSet.insert(1)); // true
        System.out.println("Insert 2: " + randomizedSet.insert(2)); // true
        System.out.println("Insert 3: " + randomizedSet.insert(3)); // true
        System.out.println("Get Random: " + randomizedSet.getRandom()); // Randomly returns 1, 2, or 3
        System.out.println("Remove 2: " + randomizedSet.delete(2)); // true
        System.out.println("Get Random: " + randomizedSet.getRandom()); // Randomly returns 1 or 3
        System.out.println("Insert 2: " + randomizedSet.insert(2)); // true
        System.out.println("Get Random: " + randomizedSet.getRandom()); // Randomly returns 1, 2, or 3
        System.out.println("------------------------------------------------------------------------------");
        //-----------------------------------------------------------------------------

        /*
         * Question 13: Product of Array Except Self ( No Division Technique)
         * Input : productNums = [1, 2, 3, 4]
         * Output : [24, 12, 8, 6]
         */

        int[] productNums = {1, 2, 3, 4};
        int[] productResult = array.productWithoutSelf(productNums);
        System.out.println("Question 13: Product of Array Except Self: ");
        System.out.println("Product Array without self : ");
        printStatement(productResult, productResult.length);
        System.out.println("------------------------------------------------------------------------------");
        //-----------------------------------------------------------------------------

        /*
         * Question 14: Gas Station - Circular
         * input : gas[] = [1, 2, 3, 4, 5]; cost[] = [3, 4, 5, 1, 2]
         * Output : 3
         */

        int[] gas = {1, 2, 3, 4, 5};
        int[] cost = {3, 4, 5, 1, 2};
        int startingPoint = array.findStation(gas, cost);
        System.out.println("Question 14: Gas Station - Circular :");
        System.out.println("Starting point where we can start journey: " + startingPoint);
        System.out.println("------------------------------------------------------------------------------");
        //-----------------------------------------------------------------------------

        /*
         * Question 15: Candy Child : Distributing a candy among all children and every children should get atleast 1 candy
         * Input : ratings = [1, 2, 2]
         * Output : [1, 2, 1]
         */
        int[] ratings = {1, 2, 2};
        int minCandy = array.minCandy(ratings);
        System.out.println("Question 15: Candy for Child: ");
        System.out.println("Minimum Candy for Children : " + minCandy);
        System.out.println("------------------------------------------------------------------------------");
        //-----------------------------------------------------------------------------

        /*
         * Question 16: Trapping Rain : 
         * Input : height = [0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1]
         * Output : 6
         */

        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int totalCapturedWater = array.trappingWater(height);
        System.out.println("Question 16 : Trapping Rain");
        System.out.println("Total Trapped Water : " + totalCapturedWater);
        System.out.println("------------------------------------------------------------------------------");
        //-----------------------------------------------------------------------------



        


        





        
    }
}
