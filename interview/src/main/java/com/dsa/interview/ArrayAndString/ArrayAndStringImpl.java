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

    public int majorityElement(int[] majorityElementNums) {
        
        int threshold = majorityElementNums.length / 2;

        //Step 1: Bayer-Moore Voting Algorithm
        int candidate = majorityElementNums[0];
        int count = 0;

        for( int num: majorityElementNums ) {
            if( count == 0 ) {
                candidate = num; // If count is 0, set the current number as candidate
            }
            count += ( num == candidate ) ? 1 : -1; // Increment count if the number is the candidate, otherwise decrement it
        }

        //Step 2: Verify the candidate
        count = 0;
        for(int num: majorityElementNums) {
            if(num == candidate) {
                count += 1; // Count occurrences of the candidate
            }
        }

        //Step 3: Check if the candidate is indeed the majority element
        if(count > threshold) {
            return candidate; // If the count is greater than the threshold, return the candidate
        } else {
            return -1; // If no majority element found, return -1
        }

    }

    public void rotate(int[] rotateArrayNums, int k) {

        //Step 1: Initialize the length of the array
        int n = rotateArrayNums.length;
            k = k % n; // Handle cases where k is greater than n
        
        //Step 2: Reverse
        reverse(rotateArrayNums, 0, n - 1);
        reverse(rotateArrayNums, 0, k - 1);
        reverse(rotateArrayNums, k, n - 1);
        
    }
    private void reverse( int[] nums, int start, int end){
        while(start <= end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public int maxProfit(int[] stockPrices) {

        //Step 1: Initialize variables for minimum price and maximum profit
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        //Step 2: Initerate through the array
        for (int price: stockPrices) {

            //Step 3: Find the minimum
            if(price < minPrice){
                minPrice = price;
            }

            else if (price - minPrice > maxProfit){
                maxProfit = price - minPrice;
            }
        }

        return maxProfit;
        
    }

    public int maxProfitII(int[] stockPricesII) {
        
        //Step 1: Initialize the max profit to 0
        int maxProfit = 0;

        //Step 2: Initerate through the array
        for(int i = 1; i < stockPricesII.length; i++){

            if(stockPricesII[i] > stockPricesII[i - 1]){
                maxProfit += stockPricesII[i] - stockPricesII[i - 1];
            }
        }

        return maxProfit;
    }
}
