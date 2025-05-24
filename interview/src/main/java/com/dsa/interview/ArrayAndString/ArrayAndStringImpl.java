package com.dsa.interview.ArrayAndString;

public class ArrayAndStringImpl {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        //Step 1: Initialize pointers for nums1 and nums2
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        //Step 2: Merge the arrays in reverse order
        while( i >= 0 && j >= 0 ) {
            if(nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            }else{
                nums1[k] = nums2[j];
                j--;
            }

            k--;
        }

        //Step 3: If there are remaining elements in nums2, copy them
        while( j >= 0 ) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }

    public int removeElement(int[] removeNums, int removeVal) {
        
        //Step 1: Initialize a pointer for the new length
        int pointer = 0;
        int l = removeNums.length;

        //Step 2: Iterate through the array
        for ( int i = 0; i < l; i++ ) {

            //Step 3: If the current element is not equal to removeVal, keep it
            if(removeNums[i] != removeVal) {
                removeNums[pointer] = removeNums[i];
                pointer++;
            }
        }

        return pointer; // Return the new length of the array
    }

    public int removeDuplicates(int[] removeDuplicates) {
        
        //Step 1: Initialize a pointer for the new length and temp value
        int tempValue = removeDuplicates[0];
        int pointer = 1;
        int l = removeDuplicates.length;

        //Step 2: Iterate through the array
        for (int i = 1; i < l; i++) { // Start from the second element
            
            //Step 3: If the current element is not equal to tempValue, keep it
            if(removeDuplicates[i] != tempValue) {
                removeDuplicates[pointer] = removeDuplicates[i];
                pointer++;
                tempValue = removeDuplicates[i]; // Update tempValue to the current element
            }
        }

        return pointer; // Return the new length of the array
    }

    public int removeDuplicatesII(int[] removeDuplicatesII) {
        
        //EC1: When the length is less than 2:
        if (removeDuplicatesII.length < 2) {
            return removeDuplicatesII.length;
        }

        //Step 1: Initialize a pointer for the new length
        int pointer = 2;
        int l = removeDuplicatesII.length;

        //Step 2: Iterate through the array starting from the third element
        for (int i = 2; i < l; i++) {

            //Step 3: If the current element is not equal to the element at pointer - 2, keep it
            // This ensures that pointer - 2th value should not be the same as the current element, if it is, the pointer needs to be change with upcoming element
            if(removeDuplicatesII[i] != removeDuplicatesII[pointer - 2]) {
                removeDuplicatesII[pointer] = removeDuplicatesII[i];
                pointer++;
            }
        }

        return pointer; // Return the new length of the array
    }
}
