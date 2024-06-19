# 🚀 Mastering Time and Space Complexity: A Game Changer in My Prep! ⏳💡

In the process of my preparation, I recently focused on learning time and space complexity. Many students (including me!) struggle with this topic. We get the basics, but when faced with tricky problems, we often can't figure out the best solution. 🤯

I had the same problem until I learned this key fact:

## Key Facts

1. **1 second ~ 10^8 operations**: This means your algorithm should handle up to 100 million operations per second to be efficient.
   
2. **Understanding the order of time complexities is essential**:
   - **O(1)**
   - **O(log n)**
   - **O(n)**
   - **O(n log n)**
   - **O(n^2)**
   - **O(n^3)**
   - **O(2^n)**
   - **O(n!)**

3. **How to know which brute force technique to use when starting**: Here’s a simple guide that helped me:

   i) **If n > 10^8 → Aim for O(log n)**

   ii) **If n ≤ 10^8 → Aim for O(n)**

   iii) **If n ≤ 10^6 → Aim for O(n log n)**

   iv) **If n ≤ 10^4 → Aim for O(n^2)**

   v) **If n ≤ 100 → Aim for O(n^3)**

   vi) **If n ≤ 25 → Aim for O(2^n)** [Brute force recursion]

   vii) **If n ≤ 12 → Even O(n!) might be acceptable**

These are the time complexities to aim for based on the constraints. This helps in figuring out the brute force solution and then optimizing it further.

Knowing the basic time complexity for a brute force solution helps us understand how to improve it. For example, **O(log n)** usually means we can use a binary search approach, while **O(n log n)** often points to merge sort or quick sort techniques, and so on.

If we know the starting time complexity, we can better understand the problem and figure out how to optimize our solution. This guide will help us identify the best approach right from the start, saving time and effort. 💡✨
