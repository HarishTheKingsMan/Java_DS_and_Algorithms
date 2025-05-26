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

    public int trappingWater(int[] height) {
        
        int left = 0;
        int right = height.length -1;
        int leftMax = 0;
        int rightMax = 0;
        int totalWater = 0;

        while( left <= right){

            //Step 1: Check the low height pillar among left and right Because water only trapped until that range
            if(height[left] <= height[right]){

                if(height[left] >= leftMax){
                    leftMax = height[left];
                }else{
                    totalWater += leftMax - height[left];
                }

                left++;
            }

            else{

                if(height[right] >= rightMax){
                    rightMax = height[right];
                }else{
                    totalWater += rightMax - height[right];
                }

                right--;
            }
        }

        return totalWater;

    }

    public int romanInput(String romanInput) {
        
        //Step 1: Store the matching numbers and romans
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        //Step 2: Iterate through the array
        int prevValue = 0;
        int totalValue = 0;
        for ( int i = romanInput.length() -1; i >= 0; i-- ){

            int currentValue = map.get(romanInput.charAt(i));
            if( currentValue < prevValue){
                totalValue -= currentValue;
            }else{
                totalValue += currentValue;
            }
            prevValue = currentValue;
        }

        return totalValue;
    }

    public String numberInput(int numberInput) {
        
        //Step 1: Configuring the prerequire
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder str = new StringBuilder();

        //Step 2: Iterate through the array
        for(int i = 0 ; i < values.length; i++){

            //Step 3: Largest to the smallest using the mapping arrays
            while(numberInput >= values[i]){
                str.append(symbols[i]);
                numberInput -= values[i];
            }
        }

        return str.toString();
    }

    public int lastWordLength(String lastWord) {
        
        //Step 1: Trim the string and Initialize count
        lastWord = lastWord.trim();
        int count = 0;

        //Step 2: Iterate through the String
        for(int i = lastWord.length() -1; i >= 0; i--){

            if(lastWord.charAt(i) == ' '){
                break;
            }

            count++;
        }

        return count;
    }

    public String LongestCommonPrefix(String[] commonPrefix) {
        
        //Step 1: length of first string
        int n = commonPrefix[0].length();

        //Step 2: Iterate through the array
        for( int i = 0; i < n-1; i++){

            Character ch = commonPrefix[0].charAt(i);
            
            //Step 3: Iterate through Strings other than 1st String
            for(int j = 1; j < commonPrefix.length; j++){

                //Step 4: if i th value is more than length of others or character not matching, then return it
                if(i >= commonPrefix[j].length() || ch != commonPrefix[j].charAt(i)){
                    return commonPrefix[0].substring(0, i);
                }
            }
        }

        return commonPrefix[0];
    }

    public String reverseString(String wordString) {

        //EC:
        if(wordString == null || wordString.length() == 0){
            return "";
        }
        
        //Step 1: Convert into list with any sequence of spaces
        String[] strings = wordString.trim().split("\\s+");

        //Step 2: Append it into single String
        StringBuilder result = new StringBuilder();
        for ( int i = strings.length -1; i >= 0; i--){
            result.append(strings[i]);

            if(i > 0){
                result.append(" ");
            }
        }

        return result.toString();
    }

    public String ZigZagTraversal(String zigString, int numOfRows){

        //EC: 
        if(numOfRows == 1 || zigString.length() <= numOfRows){
            return zigString;
        }

        //Step 1: Create StringBuilder Array
        StringBuilder[] strs = new StringBuilder[numOfRows];
        for(int i = 0; i < strs.length; i++){
            strs[i] = new StringBuilder();
        }

        //Step 2: Fill the way down or up
        int currentRow = 0;
        Boolean flag = false;
        for(char ch : zigString.toCharArray()){
            strs[currentRow].append(ch);
            if(currentRow == 0 || currentRow == numOfRows - 1){
                flag = !flag;
            }

            currentRow += flag ? 1 : -1;
        }

        //Step 3: Convert the array into String 
        StringBuilder str = new StringBuilder();
        for(StringBuilder c: strs){
            str.append(c);
        }

        return str.toString();
    }

    public int findFirst(String firstOccurenceString, String findThis) {
        
        //Solution 1: 
        //return firstOccurenceString.indexOf(findThis);

        //Step 1: Iterate through the array
        int len = findThis.length();
        for(int i = 0 ; i <= firstOccurenceString.length() - len; i++){

            //Step 2:
            if(firstOccurenceString.substring(i, i + len).equals(findThis)){
                return i;
            }
        }

        return -1;
    }

    public List<String> textJustification(String[] words, int maxWidth) {
        
        //Initialization
        List<String> result = new ArrayList<>();
        int index = 0;

        while(index < words.length){
            int linelength = words[index].length();
            int last = index + 1;

            //Step 1: Find how many word can fit in
            while(last < words.length && linelength + words[last].length() + (last - index) <= maxWidth){
                linelength += words[last].length();
                last++;
            }

            //Step 2: Storing a words into string
            StringBuilder str = new StringBuilder();
            int numOfWords = last - index;
            int numOfSpaces = maxWidth - linelength;

            //Step 3: Logic for last string with one word
            if(numOfWords == 1 || last == words.length){

                //3.1 Add words with space
                for(int i = index; i < last; i++){
                    str.append(words[i]);
                    if(i < last - 1){
                        str.append(" ");
                    }
                }

                //3.2 Add space at end (Left - justified)
                while(str.length() < maxWidth){
                    str.append(" ");
                }
            }
            else{

                //Step 4 : find the no of spaces in between
                int numOfSpacesBetween = numOfSpaces / (numOfWords - 1);
                int extraSpaces = numOfSpaces % (numOfWords - 1);

                for (int i = index; i < last - 1; i++) {
                    str.append(words[i]);
                
                    int spacesToApply = numOfSpacesBetween + (extraSpaces > 0 ? 1 : 0);
                    
                    for (int j = 0; j < spacesToApply; j++) {
                        str.append(" ");
                    }
                
                    if (extraSpaces > 0) extraSpaces--; 
                }
                str.append(words[last - 1]); // Append last word separately
                
                
            }

            result.add(str.toString());
            index = last;
        }

        return result;
    }
}
