package com.dsa.interview.ArrayAndString;

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




        
    }
}
