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