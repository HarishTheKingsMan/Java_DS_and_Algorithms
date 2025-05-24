package com.dsa.interview.ArrayAndString;

public class ArrayAndString {
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

        //-----------------------------------------------------------------------------

        
    }
}
