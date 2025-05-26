package com.dsa.interview.ArrayAndString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

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

        //Step 2: Iterate through the array
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

        //Step 2: Iterate through the array
        for(int i = 1; i < stockPricesII.length; i++){

            if(stockPricesII[i] > stockPricesII[i - 1]){
                maxProfit += stockPricesII[i] - stockPricesII[i - 1];
            }
        }

        return maxProfit;
    }

    public Boolean jumpPossibility(int[] jumpNums) {
        
        //Step 1: Initialize the element for farthest element
        int farthest = 0;
        int n = jumpNums.length - 1;

        //Step 2: Iterate through the array
        for( int i = 0; i < n; i++){

            //EC: If the current element is greater than i, then it is not possible
            if(farthest < i){
                return false;
            }

            farthest = Math.max(farthest, i + jumpNums[i]);

            if(farthest > n - 1){
                return true;
            }
        }

        return true;
    }

    public int jumpPossibilityII(int[] jumpNums) {
        
        //Step 1: Initialize the element for farthest and current
        int farthest = 0;
        int n = jumpNums.length - 1;

        int jumps = 0;
        int currentReach = 0;

        //Step 2: Iterate through the array
        for(int i = 0; i < n - 1; i++) { /// Untill only last second

            farthest = Math.max(farthest, i + jumpNums[i]); /// Collect the farthest untill now

            if(i == currentReach) {
                jumps++;
                currentReach = farthest;
            }

            if(currentReach >= n - 1){
                break;
            }
        }

        return jumps;
    }

    public int maxCitations(int[] citations) {
        
        //Step 1: Sort the array
        Arrays.sort(citations);

        //Step 2: Initialise the h - index
        int h = 0;
        int n = citations.length;

        //Step 3: Iterate through the array
        for ( int i = 0; i < n; i++){

            int paperNumber = n - i;

            if(citations[i] >= paperNumber){
                h = paperNumber;
                break;
            }
        }

        return h;
    }

    class RandomizedSet {

        Map<Integer, Integer> map;
        List<Integer> elements;
        Random random;

        //Step 1: Create a constructor
        public RandomizedSet(){
            map = new HashMap<>();
            elements = new ArrayList<>();
            random = new Random();
        }

        //Step 2: Insert a element in O(1)
        public boolean insert(int num){

            //EC: if the element is already present
            if(map.containsKey(num)){
                return false;
            }

            map.put(num, elements.size() -1);
            elements.add(num);
            return true;
        }

        //Step 2: Delete a element in O(1)
        public boolean delete(int num){
            if(!map.containsKey(num)){
                return false;
            }

            int lastElement = elements.get(elements.size() -1);
            int indexOfRemovingElement = map.get(num);
            swap(elements, indexOfRemovingElement, elements.size() -1);

            elements.remove(elements.size() -1);
            map.remove(num);

            map.put(lastElement, indexOfRemovingElement);

            return true;

        }

        public void swap (List<Integer> nums, int first, int second){
            int temp = nums.get(first);
            nums.set(first, nums.get(second));
            nums.set(second, temp);
        }

        public int getRandom(){
            int index = random.nextInt(elements.size() - 1);
            return elements.get(index);
        }

    }

    public int[] productWithoutSelf(int[] productNums) {
        
        //Step 1: Initialization
        int[] result = new int[productNums.length];
        result[0] = 1;

        //Step 2: Find the prefix
        for (int i = 1; i < productNums.length; i++){
            result[i] = result[i - 1] * productNums[i - 1];
        }

        //Step 3: Find the suffix and result
        int suffix = 1;
        for( int i = productNums.length - 1; i >= 0; i--){
            result[i] *= suffix;
            suffix *= productNums[i];
        }

        return result;
    }

    public int findStation(int[] gas, int[] cost) {
        
        //Step 1: Initialization
        int totalFuel = 0;
        int totalCost = 0;

        int startingPoint = 0;
        int FuelNow = 0;

        //Step 2: Iterate through the array
        for( int i = 0; i < gas.length; i++){

            totalFuel += gas[i];
            totalCost += cost[i];
            FuelNow = gas[i] - cost[i];

            //If the FuelNow is negative, then it must not be starting point
            if(FuelNow < 0){
                startingPoint = i+1;
                FuelNow = 0;
            }
        }

        //Step 3: Check is there any possible outcome? To avoid startingPoint default to 0
        if(totalFuel < totalCost){
            return -1;
        }

        return startingPoint;
    }

    public int minCandy(int[] ratings) {
        
        //Step 1: Initialization
        int n = ratings.length;
        int[] candies = new int[n];

        //Step 2: Providing min 1 candy for each child
        for(int i = 0; i < n; i++){
            candies[i] = 1;
        }

        //Step 3: Calculating Candies From Left neighbor childs
        for(int i = 1; i < n; i++){
            if(ratings[i] > ratings[i -1]){
                candies[i] = candies[i -1] + 1;
            }
        }

        //Step 4: Calculating Candies From Right neighbor childs
        for(int i = n - 2; i >= 0; i--){
            if(ratings[i] > ratings[i + 1]){
                candies[i] = Math.max(candies[i], candies[i +1] + 1);
            }
        }

        //Step 5: Calculating total Candies
        int total = 0;
        for(int candy: candies){
            total += candy;
        }

        return total;
    }
}
