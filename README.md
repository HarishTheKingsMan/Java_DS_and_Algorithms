# Java Data Structures and Algorithms – Top 150 Interview Questions

## 📌 Arrays & Strings  

### 🚀 Question 1: Merge Two Sorted Arrays In-Place

#### 📝 Problem Statement:
You are given two **sorted integer arrays**, `nums1` and `nums2`, along with two integers, `m` and `n`, representing the number of elements in each array.  

**Your task:** Merge `nums1` and `nums2` into a **single sorted array**, storing the final result **inside nums1**. The array `nums1` has a total length of `m + n`, with extra space (`0`s) at the end to accommodate the elements from `nums2`.  

#### ✅ Example:
```java
Input: nums1 = [1,2,3,0,0,0], m = 3  
       nums2 = [2,5,6], n = 3  
Output: [1,2,2,3,5,6]
```

---

### 🚀 Question 2: Remove Element  

#### 📝 Problem Statement:  
You are given an **integer array `nums`** and an integer `val`. Your task is to **remove all occurrences** of `val` **in-place** from `nums`.  

🔹 The order of elements **may change**, but the first `k` elements of `nums` must contain only elements **not equal** to `val`.  
🔹 Return `k` – the number of remaining valid elements in `nums`.  
🔹 The extra elements beyond `k` are **not important**, and their values do not need to be preserved.  

#### ✅ Example:
```java
Input: nums = [3,2,2,3], val = 3  
Output: 2, nums = [2,2,_,_]
```

---

### 🚀 Question 3: Remove Duplicates from Sorted Array  

#### 📝 Problem Statement:  
You are given a **sorted integer array `nums`** (non-decreasing order). Your task is to **remove the duplicates in-place** so that **each unique element appears only once**, while maintaining the **relative order of the elements**.  

🔹 The result should be stored in the first `k` elements of `nums`.  
🔹 The extra elements beyond `k` **do not matter** and can be ignored.  
🔹 Return `k`, which represents the number of unique elements.  

#### ✅ Example 1:
```java
Input: nums = [1,1,2]  
Output: 2, nums = [1,2,_]
```
----

### 🚀 Question 4: Remove Duplicates from Sorted Array II  

#### 📝 Problem Statement:  
You are given a **sorted integer array `nums`** (non-decreasing order). Your task is to **modify the array in-place** so that:  
🔹 Each unique element appears **at most twice**  
🔹 The relative order of the elements is **maintained**  
🔹 The result should be stored in the **first k elements of `nums`**  
🔹 The remaining elements **do not matter**  

#### ✅ Example 1:
```java
Input: nums = [1,1,1,2,2,3]  
Output: 5, nums = [1,1,2,2,3,_]
```
----

### 🚀 Question 5: Majority Element  

#### 📝 Problem Statement:  
You are given an **integer array `nums`** of size `n`. Your task is to return the **majority element**, which is defined as the element that appears **more than ⌊n / 2⌋ times**.  

🔹 You may assume the **majority element always exists** in the array.  

#### ✅ Example 1:
```java
Input: nums = [3,2,3]  
Output: 3
```

----

### 🚀 Question 6: Rotate Array  

#### 📝 Problem Statement:  
You are given an **integer array `nums`** and a non-negative integer `k`. Your task is to **rotate the array to the right by `k` steps**.  

🔹 Rotation means shifting elements circularly so that the last `k` elements move to the front.  
🔹 The operation must be **done in-place**, modifying `nums` directly.  

#### ✅ Example 1:
```java
Input: nums = [1,2,3,4,5,6,7], k = 3  
Output: [5,6,7,1,2,3,4]
```

-----

### 🚀 Question 7: Best Time to Buy and Sell Stock  

#### 📝 Problem Statement:  
You are given an **integer array `prices`**, where `prices[i]` represents the stock price on the `i-th` day.  

🔹 You want to **maximize profit** by choosing a **single day to buy** and a **future day to sell**.  
🔹 If **no profit can be achieved**, return `0`.  

#### ✅ Example 1:
```java
Input: prices = [7,1,5,3,6,4]  
Output: 5
```

----

### 🚀 Question 8: Best Time to Buy and Sell Stock II  

#### 📝 Problem Statement:  
You are given an **integer array `prices`**, where `prices[i]` represents the stock price on the `i-th` day.  

🔹 Unlike the previous problem, here you can **buy and sell multiple times**.  
🔹 You can **only hold one stock at a time**, meaning you **must sell before buying again**.  
🔹 You can even **buy and sell on the same day** if it increases profit.  
🔹 Return the **maximum profit** possible.  

#### ✅ Example 1:
```java
Input: prices = [7,1,5,3,6,4]  
Output: 7
```

----

### 🚀 Question 9: Jump Game  

#### 📝 Problem Statement:  
You are given an **integer array `nums`**, where `nums[i]` represents the **maximum jump length** at index `i`.  

🔹 Starting at index `0`, determine if you can **reach the last index**.  
🔹 You can move **forward** within the allowed jump limit.  
🔹 If at any point, you are stuck with no valid jumps left, return `false`.  

#### ✅ Example 1:
```java
Input: nums = [2,3,1,1,4]  
Output: true
```

----

### 🚀 Question 10: Jump Game II  

#### 📝 Problem Statement:  
You are given a **0-indexed array of integers `nums`**, where `nums[i]` represents the **maximum length of a forward jump** from index `i`.  

🔹 Starting at index `0`, determine the **minimum number of jumps** required to reach the last index.  
🔹 You can always reach the last index (no unreachable cases).  

#### ✅ Example 1:
```java
Input: nums = [2,3,1,1,4]  
Output: 2
```

----

### 🚀 Question 11: H-Index  

#### 📝 Problem Statement:  
You are given an **integer array `citations`**, where `citations[i]` represents the number of citations a researcher received for their `i-th` paper.  

🔹 The **h-index** is defined as the maximum value of `h` such that the researcher has published at least `h` papers, each cited **at least `h` times**.  
🔹 The goal is to **return the researcher's h-index** based on their citation data.  

#### ✅ Example 1:
```java
Input: citations = [3,0,6,1,5]  
Output: 3
```

----

### 🚀 Question 12: Insert Delete GetRandom O(1)  

#### 📝 Problem Statement:  
Implement the `RandomizedSet` class with the following operations:  

🔹 **insert(int val)** → Inserts `val` into the set if **not present**, returns `true` if added, `false` otherwise.  
🔹 **remove(int val)** → Removes `val` from the set if **present**, returns `true` if removed, `false` otherwise.  
🔹 **getRandom()** → Returns a **random element** from the set (each element must have equal probability).  

Each function must run in **average O(1) time complexity**.

#### ✅ Example:
```java
Input:
["RandomizedSet", "insert", "remove", "insert", "getRandom", "remove", "insert", "getRandom"]
[[], [1], [2], [2], [], [1], [2], []]

Output:
[null, true, false, true, 2, true, false, 2]
```

----

### 🚀 Question 13: Product of Array Except Self  

#### 📝 Problem Statement:  
You are given an **integer array `nums`**, and you must return an array `answer` where:  
🔹 `answer[i]` is the **product of all elements** except `nums[i]`.  
🔹 You **cannot use the division operation** (`/`).  
🔹 The algorithm must run in **O(n) time complexity**.  

#### ✅ Example 1:
```java
Input: nums = [1,2,3,4]  
Output: [24,12,8,6]
```

----

### 🚀 Question 14: Gas Station  

#### 📝 Problem Statement:  
There are **`n` gas stations** along a circular route, where `gas[i]` represents the amount of fuel available at the `i-th` station.  
Each station requires `cost[i]` units of fuel to travel to the next station.  

🔹 Your car starts **empty**, and you must find the **starting station index** that allows completing one full circuit.  
🔹 If there’s **no valid solution**, return `-1`.  
🔹 The solution is **guaranteed to be unique** if it exists.  

#### ✅ Example:
```java
Input: gas = [1,2,3,4,5], cost = [3,4,5,1,2]  
Output: 3
```

----

### 🚀 Question 15: Candy Distribution  

#### 📝 Problem Statement:  
There are `n` children standing in a line, each assigned a **rating** given in the array `ratings`. You must distribute candies to the children while ensuring:  
1️⃣ Each child must receive **at least one candy**.  
2️⃣ Children with a **higher rating** must receive **more candies than their neighbors**.  
🔹 The goal is to **return the minimum number of candies** required.  

#### ✅ Example:
```java
Input: ratings = [1,0,2]  
Output: 5

Input: ratings = [1, 2, 2]
Output: 4
```
----

### 🚀 Question 16: Trapping Rain Water  

#### 📝 Problem Statement:  
You are given a list of **non-negative integers**, `height`, representing an elevation map. The width of each bar is `1`. Your task is to determine the **total units of rainwater that can be trapped** after raining.  
![alt text](image.png)

#### ✅ Example 1:
```java
Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]  
Output: 6
```

----
### 🚀 Question 17: Roman to Integer  

#### 📝 Problem Statement:  
Given a **Roman numeral string `s`**, convert it to an **integer**.  

✔ Roman numerals follow **descending order**, except for subtractive cases like:  
  - `IV` = `4` (`I` before `V`)
  - `IX` = `9` (`I` before `X`)
  - `XL` = `40`, `XC` = `90`
  - `CD` = `400`, `CM` = `900`

🔹 The goal is to parse the string and sum up values **while handling subtractive cases properly**.  

#### ✅ Example 1:
```java
Input: s = "III"  
Output: 3
```

----

### 🚀 Question 18: Integer to Roman  

#### 📝 Problem Statement:  
You are given an **integer `num`**, and you must convert it to **Roman numerals** using proper rules:

✔ Roman numerals are built from **largest to smallest values**  
✔ **Subtractive notation is used** for specific numbers:  
  - `4` → `IV`, `9` → `IX`  
  - `40` → `XL`, `90` → `XC`  
  - `400` → `CD`, `900` → `CM`  

---

### ✅ Example
```java
Input: num = 3749  
Output: "MMMDCCXLIX"
```

----

### 🚀 Question 19: Length of Last Word  

#### 📝 Problem Statement:  
Given a string `s` containing words separated by spaces, **return the length of the last word** (a word is a maximal sequence of non-space characters).  

#### ✅ Example:
```java
Input: s = "Hello World   "  
Output: 5
```

----

### 🚀 Question 20: Longest Common Prefix  

#### 📝 Problem Statement:  
Given an array of strings `strs`, return the **longest common prefix** among them. If no common prefix exists, return an **empty string** `""`.

---

#### ✅ Example:
```java
Input: strs = ["flower", "flow", "flight"]  
Output: "fl"
```

----

### 🚀 Question 21: Reverse Words in a String  

#### 📝 Problem Statement:  
Given an input string `s`, reverse the order of the words while ensuring:  
✔ Words are separated by a **single space**.  
✔ Leading and trailing spaces are **removed**.  
✔ Multiple spaces between words are **collapsed** into one.  

---

#### ✅ Example:
```java
Input: s = "the sky is blue"  
Output: "blue is sky the"
```

----

### 🚀 Question 22: Zigzag Conversion  

#### 📝 Problem Statement:  
Given a string `s` and an integer `numRows`, rearrange the characters into a **zigzag pattern** over `numRows`. Finally, read the characters **row by row** to form the output.

---

#### ✅ Example:

```java

Input: s = "PAYPALISHIRING", numRows = 3  
P   A   H   N
A P L S I I G
Y   I   R
Output: "PAHNAPLSIIGYIR"
```

----

### 🚀 Question 23: Find the Index of the First Occurrence in a String

#### 📝 Problem Statement:  
Given two strings needle and haystack, return the index of the first occurrence of needle in haystack. If needle is not present, return -1.

#### ✅ Example:

```java

Input: haystack = "sadbutsad", needle = "sad"  
Output: 0

```

----

### 🚀 Question 24: Text Justification  

#### 📝 Problem Statement:  
Given an array of strings `words` and a width `maxWidth`, format the text such that:  
✔ Each line has exactly `maxWidth` characters and is fully **left and right justified**.  
✔ Words are packed **greedily**, meaning each line gets as many words as possible.  
✔ **Extra spaces** between words are distributed **evenly** across the line.  
✔ If spaces cannot be evenly distributed, **leftmost words get more spaces** than the rightmost words.  
✔ The **last line** should be **left-justified**, with no extra space between words.  

🔹 **Constraints:**  
- A word is defined as a sequence of **non-space characters**.  
- Each word’s length is guaranteed to be **greater than 0 and not exceed `maxWidth`**.  
- The input array contains **at least one word**.  

---

#### ✅ Example:
```java
Input: words = ["This", "is", "an", "example", "of", "text", "justification."], maxWidth = 16  
Output:
[
   "This    is    an",
   "example  of text",
   "justification.  "
]
```

----
## 📌 Two Pointers 

### 🚀 Question 25: Valid Palindrome  

#### 📝 Problem Statement:  
A string `s` is considered a **palindrome** if, after:
1. Converting all **uppercase letters** into **lowercase**.
2. **Removing all non-alphanumeric** characters (punctuation, spaces, etc.).

It reads the **same forward and backward**.

Given a string `s`, return **true** if it is a palindrome, or **false** otherwise.

#### ✅ Example:
```java
Input: s = "A man, a plan, a canal: Panama"  
Output: true
```

----

### 🚀 Question 26:  Is Subsequence  

#### 📝 Problem Statement:  
Given two strings `s` and `t`, return **true** if `s` is a **subsequence** of `t`, or **false** otherwise.  

🔹 **Definition:**  
A subsequence of a string is formed by deleting some (or none) of the characters **without changing the relative order** of the remaining characters.  
Example: `"ace"` is a subsequence of `"abcde"`, but `"aec"` is **not**.  

---

#### ✅ Example:
```java
Input: s = "abc", t = "ahbgdc"
Output: true
```

----

### 🚀 Question 27: Two Sum II - Input Array Is Sorted  

#### 📝 Problem Statement:  
Given a **1-indexed** sorted array `numbers` in **non-decreasing order**, find **two numbers** that sum up to a given `target`.  
Let these two numbers be `numbers[index1]` and `numbers[index2]`, where `1 <= index1 < index2 <= numbers.length`.  

✔ **Return the indices** of the two numbers, `index1` and `index2`, as `[index1, index2]`.  
✔ **You may not use the same element twice**.  
✔ **You must solve this using constant extra space (`O(1)`)**.  
✔ **There is exactly one solution** for each test case.  

#### ✅ Example:
```java
Input: numbers = [2,7,11,15], target = 9  
Output: [1,2]
```

----

### 🚀 Question 28: Container With Most Water  

#### 📝 Problem Statement:  
You are given an **integer array** `height` of length `n`.  
There are `n` vertical lines drawn such that the **two endpoints** of the `i-th` line are **(i, 0)** and **(i, height[i])**.  

Find **two lines** that together with the **x-axis** form a container, such that the container **holds the maximum amount of water**.  

🔹 **Rules:**  
✔ You **must maximize** the stored water.  
✔ You **may not slant** the container.  
![alt text](image-1.png)
#### ✅ Example:
```java
Input: height = [1,8,6,2,5,4,8,3,7]  
Output: 49
```
----

### 🚀 Question 29: 3Sum  

#### 📝 Problem Statement:  
Given an **integer array** `nums`, return **all unique triplets** `[nums[i], nums[j], nums[k]]` that satisfy:  
✔ `i != j`, `i != k`, and `j != k`.  
✔ `nums[i] + nums[j] + nums[k] == 0`.  
✔ **No duplicate triplets** should exist in the output.  

#### ✅ Example:
```java
Input: nums = [-1,0,1,2,-1,-4]  
Output: [[-1,-1,2],[-1,0,1]]
```

----