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

### 🔥 Approach: Two-Pointer In-Place Merging  

#### 📌 Step 1: Utilize Two Pointers  
- Start **from the end** of both `nums1` and `nums2`:  
  - `i = m - 1` (last valid element in `nums1`)  
  - `j = n - 1` (last element in `nums2`)  
  - `k = m + n - 1` (last index of `nums1`, where merging happens)  

- Compare elements **from both arrays** and place the **larger** one at the last available position in `nums1`.  
- This ensures **efficient merging** without needing extra memory.  

#### 📌 Step 2: Handling Remaining Elements  
- If `nums2` still has leftover elements **(j >= 0)**, copy them directly into `nums1`.  
- If `nums1` already has all elements placed, the merge is complete.  

#### ⚡ Why This Approach?  
✔ **In-place merging** → No extra space needed, modifying `nums1` directly.  
✔ **O(m + n) complexity** → Linear time efficiency using two-pointer technique.  
✔ **Optimized merging** → Works smoothly on pre-sorted arrays.  

#### 🎯 Interview Strategy  
Mastering this approach **demonstrates practical array manipulation skills**, efficient **sorting techniques**, and your ability to **optimize solutions without extra memory overhead**—all essential for **FAANG-level coding interviews!** 🚀  

---