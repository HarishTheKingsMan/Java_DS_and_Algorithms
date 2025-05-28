package com.dsa.interview.SlidingWindow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class SlidingWindowImpl {

    public int minSizeSub(int[] nums, int target) {
        
        //Step 1: Initialization
        int n = nums.length;
        int minLength = Integer.MAX_VALUE;
        int start = 0;
        int currentSum = 0;

        //Step 2: Add Element through Iteration
        for(int end = 0; end < n; end++){
            currentSum += nums[end];

            //Step 3: Removing extra numbers and calc min sized array
            while(currentSum >= target){
                minLength = Math.min(minLength, end - start + 1);

                currentSum -= nums[start];
                start++;
            }
        }

        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }

    public int longestSubString(String subString) {
        
        //Step 1: Initialization
        int n = subString.length();
        int maxLength = Integer.MIN_VALUE;
        int start = 0;
        HashSet<Character> hash = new HashSet<>();

        //Step 2: Add and Remove Element
        for(int end = 0; end < n; end++){

            //Removing Values before Duplicate
            while(hash.contains(subString.charAt(end))){
                hash.remove(subString.charAt(start));
                start++;
            }

            hash.add(subString.charAt(end));
            maxLength = Math.max(maxLength, end - start + 1);


        }

        return maxLength == Integer.MIN_VALUE ? 0 : maxLength;
    }

    public List<Integer> subStringStating(String s, String[] words) {
        
        //Step 1: Initialization and Edge Case
        List<Integer> result = new ArrayList<>();

        //Ec: 
        if(words == null || words.length == 0){
            return result;
        }

        //Step 2: Preprocessing and Creating Words Map
        int wordLength = words[0].length();
        int noOfWords = words.length;
        int cancatLength = wordLength * noOfWords;

        HashMap<String, Integer> availWords = new HashMap<>();
        for(String word : words){
            availWords.put(word, availWords.getOrDefault(word, 0) + 1);
        }

        System.out.println("AvailWords : " + availWords);

        //Step 3: Check Every Character - concatLength
        for(int i = 0 ; i <= s.length() - cancatLength; i++){
            HashMap<String, Integer> seenWords = new HashMap<>();
            int j = 0;

            //Step 4: J indicate the noOfWords Seen so far
            while(j < noOfWords){

                //Step 5: Take the Single Word from the String using SubString
                int startIndex = i + j * wordLength;
                String currentString = s.substring(startIndex, startIndex + wordLength);
                System.out.println("Iteration i : " + i + ", j : " + j + ", startIndex : " + startIndex + ", currentString : " + currentString);

                //Step 6: If the word is not in the words list, break it
                if(!availWords.containsKey(currentString)){
                    break;
                }

                //Step 7: Put the word in seenWords words list as it is available in words list
                seenWords.put(currentString, seenWords.getOrDefault(currentString, 0) + 1);
                System.out.println("SeenWords : " + seenWords);


                //Step 8: If the no of duplicate word in the string is greater than the word list, break it
                if(seenWords.get(currentString) > availWords.get(currentString)){
                    break;
                }
                j++;

                System.out.println("------------");
            }

            //Step 9: If the j and no of Words are same, then put i into result as it is starting point
            if(j == noOfWords){
                result.add(i);
            }
        }

        return result;
    }

    public String minLengthSubString(String s1, String t1) {
        
        // Step 1: Store frequency of characters in `t1`
        HashMap<Character, Integer> tChar = new HashMap<>();
        for (char ch : t1.toCharArray()) {
            tChar.put(ch, tChar.getOrDefault(ch, 0) + 1);
        }
        System.out.println("Frequency Map of t1: " + tChar);
    
        // Step 2: Initialization for sliding window approach
        int l = 0, r = 0, formed = 0;  
        int required = tChar.size();  
        int minLength = Integer.MAX_VALUE;
        int[] result = {-1, -1};
    
        // Map to track frequency of characters in current window
        HashMap<Character, Integer> sChar = new HashMap<>();
    
        // Step 3: Expand the right pointer to find a valid window
        while (r < s1.length()) {
            char ch = s1.charAt(r);
            sChar.put(ch, sChar.getOrDefault(ch, 0) + 1);
    
            // Check if current character matches its required frequency in `tChar`
            if (tChar.containsKey(ch) && sChar.get(ch).equals(tChar.get(ch))) {
                formed++;  
            }
    
            // Debugging Output: Window expansion
            System.out.println("Expanding: r = " + r + ", sChar = " + sChar + ", formed = " + formed);
    
            // Step 4: Try shrinking the window from the left
            while (l <= r && formed == required) {  
                char start = s1.charAt(l);
    
                // Update result if we found a smaller valid window
                if (r - l + 1 < minLength) {
                    minLength = r - l + 1;
                    result[0] = l;
                    result[1] = r;
                    System.out.println("New Min Window Found: [" + result[0] + ", " + result[1] + "] Length = " + minLength);
                }
    
                // Remove leftmost character from window
                sChar.put(start, sChar.getOrDefault(start, 0) - 1);
                
                // If removal makes `start` character frequency < needed in `tChar`, decrease `formed`
                if (tChar.containsKey(start) && sChar.get(start) < tChar.get(start)) {
                    formed--;
                }
    
                System.out.println("Shrinking: l = " + l + ", sChar = " + sChar + ", formed = " + formed);
                l++;  // Move left pointer forward
            }
    
            r++;  // Expand right pointer further
        }
    
        // Step 5: Return result
        String finalResult = result[0] == -1 ? "" : s1.substring(result[0], result[1] + 1);
        System.out.println("Final Minimum Window Substring: " + finalResult);
        return finalResult;
    }
    
    
    
}
