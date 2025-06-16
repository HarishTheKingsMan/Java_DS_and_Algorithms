package com.dsa.interview.HashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
public class HashMapImpl {

    public Boolean isRansomNoteContain(String ransomNote, String magazine) {
        
        //Step 1: Init
        HashMap<Character, Integer> hash = new HashMap<>();

        //Step 2: Fill it with magazine letters
        for(char ch: magazine.toCharArray()){
            hash.put(ch, hash.getOrDefault(ch, 0) + 1);
        }

        //Step 3: Checking the character present
        for(char ch: ransomNote.toCharArray()){

            if(!hash.containsKey(ch) && hash.get(ch) == 0){
                return false;
            }

            hash.put(ch, hash.get(ch) - 1);
        }

        return true;
    }

    public Boolean isIsomorphic(String isoS, String isoT) {
        
        //EC: When the length is not same
        if(isoS.length() != isoT.length()){
            return false;
        }

        //Step 1: Initialization
        HashMap<Character, Character> StoTMap = new HashMap<>();
        HashMap<Character, Character> TtoSMap = new HashMap<>();

        //Step 2: Iterate over the array
        for(int i = 0; i < isoS.length(); i++){

            char sChar = isoS.charAt(i);
            char tChar = isoT.charAt(i);

            //Step 3: Check the S Map is available and mapped to another char
            if(StoTMap.containsKey(sChar)){
                if(StoTMap.get(sChar) != tChar){
                    return false;
                }
            }else{
                StoTMap.put(sChar, tChar);
            }

            //Step 4: Check it vise versa
            if(TtoSMap.containsKey(tChar)){
                if(TtoSMap.get(tChar) != sChar){
                    return false;
                }
            }else{
                TtoSMap.put(tChar, sChar);
            }

        }

        return true;
    }

    public Boolean isPatternMatch(String pattern, String patternString) {
        
        //Step 1:Split the words 
        String[] words = patternString.split(" ");

        //EC: when the lengths are not same
        if(pattern.length() != words.length){
            return false;
        }

        //Step 2: Initialization
        HashMap<Character, String> patterToWord = new HashMap<>();
        HashMap<String, Character> wordToPattern = new HashMap<>();

        //Step 3: Iteration
        for(int i = 0; i < pattern.length(); i++){

            char ch = pattern.charAt(i);
            String str = words[i];

            //Step 4: checking mapping in hashmap
            if(patterToWord.containsKey(ch)){
                if(!patterToWord.get(ch).equals(str)){
                    return false;
                }
            }else{
                patterToWord.put(ch, str);
            }

            //Step 5: vise versa
            if(wordToPattern.containsKey(str)){
                if(!wordToPattern.get(str).equals(ch)){
                    return false;
                }
            }else{
                wordToPattern.put(str, ch);
            }
        }

        return true;
    }

    public Boolean isAnagram(String fString, String tString) {
        
        //EC: 
        if(fString.length() != tString.length()){
            return false;
        }

        //Step 1: Initialization
        HashMap<Character, Integer> hash = new HashMap<>();

        //Step 2: Inserting the first String into hash
        for(char ch : fString.toCharArray()){
            hash.put(ch, hash.getOrDefault(ch, 0) + 1);
        }

        //Step 3: Checking with second string
        for(char ch : tString.toCharArray()){

            if(!hash.containsKey(ch)){
                return false;
            }

            hash.put(ch, hash.get(ch) -1);
            if(hash.get(ch) == 0){
                hash.remove(ch);
            }
        }

        return hash.isEmpty();
    }

    public List<List<String>> getGroupAnagram(String[] gAnagram) {
        
        //Step 1: Initialization
        HashMap<String, List<String>> hash = new HashMap<>();

        //Step 2 : Iterate
        for(String str: gAnagram){

            //Step 3: Sort the letters in the word
            char[] letters = str.toCharArray();
            Arrays.sort(letters);
            String newWord = new String(letters);

            //Step 4: Insert into the array
            hash.putIfAbsent(newWord, new ArrayList<>());
            hash.get(newWord).add(str);
        }

        return new ArrayList<>(hash.values());
    }

    public int[] twoSumOutput(int[] twoSumArray, int target) {
        
        //Step 1: Init
        HashMap<Integer, Integer> hash = new HashMap<>();

        //Step 2: Iterate
        for(int i = 0; i < twoSumArray.length; i++){

            //Step 3 : Target - current
            int needed = target - twoSumArray[i];

            if(hash.containsKey(needed)){
                return new int[]{hash.get(needed), i};
            }

            hash.put(twoSumArray[i], i);
        }

        return new int[]{-1, -1};


    }

    private int squareRoot(int n){
        int num = 0;

        while(n > 0){
            int rem = n % 10;
            num += rem * rem;
            n /= 10;
        }

        return num;
    }

    public Boolean isHappy(int n) {
        
        //Step 1: Preprocessing
        HashSet<Integer> hash = new HashSet<>();

        //Step 2: Iterate
        while(n != 1){

            if(hash.contains(n)){
                return false;
            }

            hash.add(n);
            n = squareRoot(n);
        }

        return true;
    }

    public Boolean isContainDup(int[] nums, int k) {
        
        //Step 1: Preprocessing
        HashMap<Integer, Integer> hash = new HashMap<>();

        //Step 2: Iterate
        for( int i = 0; i < nums.length; i++ ){

            //Step 3: Check if the key is at most apart
            if(hash.containsKey(nums[i])){

                if(i - hash.get(nums[i]) <= k){
                    return true;
                }
            }

            hash.put(nums[i], i);
        }

        return false;
    }

    public int longestConseq(int[] longestNums) {
        
        //Step 1: Preprocesssing
        HashSet<Integer> hash = new HashSet<>();
        int longestSequence = 0;
        for(int n : longestNums){
            hash.add(n);
        }

        //Step 2: Looping through 
        for(int num: longestNums){

            //Step 3: Checking if num - 1 is available
            if(!hash.contains(num -1)){

                int currentSeq = 1;

                //Step 4: Counting Sequence and incrementing it
                while(hash.contains(num + currentSeq)){
                    currentSeq++;
                }

                longestSequence = Math.max(currentSeq, longestSequence);
            }

            //Step 5: If the num is more than half, then it is already satisfied
            if(longestSequence > longestNums.length / 2){
                break;
            }
        }

        return longestSequence;
    }
    
}
